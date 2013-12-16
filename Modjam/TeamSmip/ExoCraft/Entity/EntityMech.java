package Modjam.TeamSmip.ExoCraft.Entity;

import Modjam.TeamSmip.ExoCraft.Chips;
import Modjam.TeamSmip.ExoCraft.ExoCraft;
import Modjam.TeamSmip.ExoCraft.Item.ItemChip;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityFallingSand;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.AnimalChest;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.client.MinecraftForgeClient;

public class EntityMech extends EntityLivingBase
{

	public AnimalChest mechChest;

	public EntityMech(World par1World)
	{
		super(par1World);
		this.setSize(2F, 3.5F);
		this.stepHeight = 1F;
		this.ignoreFrustumCheck = true;
		this.setHealth(150);
		this.mechChest = new AnimalChest("Mech", 1);
	}

	@Override
	protected void entityInit()
	{
		super.entityInit();
		this.dataWatcher.addObject(14, Integer.valueOf(-1));
	}

	@Override
	public void onUpdate()
	{
		super.onUpdate();
		this.rotationPitch = 0;

		if (!this.worldObj.isRemote)
		{
			if (this.mechChest.getStackInSlot(0) == null)
			{
				this.dataWatcher.updateObject(14, Integer.valueOf(-1));
			}
		}

	}

	@Override
	public void moveEntityWithHeading(float par1, float par2)
	{
		if (this.riddenByEntity != null)
		{
			this.prevRotationYaw = this.rotationYaw = this.riddenByEntity.rotationYaw;
			this.setRotation(this.rotationYaw, this.rotationPitch);
			this.rotationYawHead = this.renderYawOffset = this.rotationYaw;
			par1 = ((EntityLivingBase) this.riddenByEntity).moveStrafing * 0.5F;
			par2 = ((EntityLivingBase) this.riddenByEntity).moveForward;

		}
		super.moveEntityWithHeading(par1, par2);
	}

	@Override
	public boolean canBeCollidedWith()
	{
		return true;
	}

	@Override
	public boolean canBePushed()
	{
		// One does not push a mech
		return false;
	}

	@Override
	protected void doBlockCollisions()
	{
		super.doBlockCollisions();
	}

	@Override
	public void onCollideWithPlayer(EntityPlayer par1EntityPlayer)
	{
		// TODO If moving hurt player
		super.onCollideWithPlayer(par1EntityPlayer);
	}

	@Override
	public boolean interactFirst(EntityPlayer par1EntityPlayer)
	{
		if (this.riddenByEntity == null)
		{
			if (par1EntityPlayer.isSneaking())
			{
				par1EntityPlayer.openGui(ExoCraft.instance, 0, worldObj,
						this.entityId, 0, 0);
				return true;
			}

			par1EntityPlayer.mountEntity(this);
		}

		return true;
	}

	public ResourceLocation[] getTexture()
	{
		ItemStack item = this.mechChest.getStackInSlot(0);

		String file = "Mach1";

		if (item != null)
		{
			int meta = item.getItemDamage();
			if (meta < Chips.ChipNames.length && meta >= 0)
			{
				file = Chips.ChipNames[meta];
			}
		}
		else if (this.dataWatcher.getWatchableObjectInt(14) != -1)
		{
			file = Chips.ChipNames[this.dataWatcher.getWatchableObjectInt(14)];
		}

		ResourceLocation Texture[] =
		{
				new ResourceLocation("textures/Mechs/" + file
						+ "/MechBody.png"),
				new ResourceLocation("textures/Mechs/" + file
						+ "/MechLeg.png"),
				new ResourceLocation("textures/Mechs/" + file
						+ "/MechArm.png") };

		return Texture;
	}

	@Override
	public void writeEntityToNBT(NBTTagCompound par1nbtTagCompound)
	{
		super.writeEntityToNBT(par1nbtTagCompound);
		if (this.mechChest.getStackInSlot(0) != null)
		{
			par1nbtTagCompound.setTag(
					"ChipItem",
					this.mechChest.getStackInSlot(0).writeToNBT(
							new NBTTagCompound("ChipItem")));
		}
	}

	@Override
	public void readEntityFromNBT(NBTTagCompound par1nbtTagCompound)
	{
		super.readEntityFromNBT(par1nbtTagCompound);
		if (par1nbtTagCompound.hasKey("ChipItem"))
		{
			ItemStack itemstack = ItemStack
					.loadItemStackFromNBT(par1nbtTagCompound
							.getCompoundTag("ChipItem"));

			if (itemstack != null && itemstack.getItem() instanceof ItemChip)
			{
				this.mechChest.setInventorySlotContents(0, itemstack);
				if (!this.worldObj.isRemote)
				{
					this.dataWatcher
							.updateObject(14, itemstack.getItemDamage());
				}
			}
		}
	}

	@Override
	public boolean hitByEntity(Entity par1Entity)
	{
		if (riddenByEntity != null
				&& par1Entity.entityId == riddenByEntity.entityId)
		{
			ShootSand((EntityPlayer) riddenByEntity);
			return true;
		}

		return super.hitByEntity(par1Entity);
	}

	private void ShootSand(EntityPlayer player)
	{
		if(player.inventory.hasItem(Block.sand.blockID))
		{
			player.inventory.consumeInventoryItem(Block.sand.blockID);
			EntityFallingSand sand = new EntityFallingSand(worldObj, player.posX, player.posY + player.getEyeHeight(), player.posZ, Block.sand.blockID);
			
	        sand.motionX = (double)(-MathHelper.sin(player.rotationYaw / 180.0F * (float)Math.PI) * MathHelper.cos(player.rotationPitch / 180.0F * (float)Math.PI));
	        sand.motionZ = (double)(MathHelper.cos(player.rotationYaw / 180.0F * (float)Math.PI) * MathHelper.cos(player.rotationPitch / 180.0F * (float)Math.PI));
	        sand.motionY = (double)(-MathHelper.sin(player.rotationPitch / 180.0F * (float)Math.PI));
			
	        this.worldObj.spawnEntityInWorld(sand);
		}
		
	}

	@Override
	public void updateRidden()
	{
		super.updateRidden();
	}

	@Override
	public void updateRiderPosition()
	{
		// TODO Auto-generated method stub
		super.updateRiderPosition();
	}

	@Override
	public boolean shouldDismountInWater(Entity rider)
	{
		return false;
	}

	@Override
	public double getMountedYOffset()
	{
		return 1.8D;
	}

	@Override
	public ItemStack getHeldItem()
	{
		return null;
	}

	@Override
	public ItemStack getCurrentItemOrArmor(int i)
	{
		return null;
	}

	@Override
	public void setCurrentItemOrArmor(int i, ItemStack itemstack)
	{

	}

	@Override
	public ItemStack[] getLastActiveItems()
	{
		return new ItemStack[0];
	}

	@Override
	protected void onDeathUpdate()
	{
		super.onDeathUpdate();
		if (riddenByEntity != null)
		{
			riddenByEntity.mountEntity(null);
		}
	}
}
