package Modjam.TeamSmip.ExoCraft.Entity;

import Modjam.TeamSmip.ExoCraft.Chips;
import Modjam.TeamSmip.ExoCraft.ExoCraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.AnimalChest;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
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
	public void onUpdate()
	{
		super.onUpdate();
		this.rotationPitch = 0;
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
				par1EntityPlayer.openGui(ExoCraft.instance, 0, worldObj, this.entityId,
				0, 0);
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
		
		if(item != null)
		{
			int meta = item.getItemDamage();
			if(meta < Chips.ChipNames.length && meta >= 0)
			{
				file = Chips.ChipNames[meta];
			}
		}

		ResourceLocation Texture[] = 
		{
		new ResourceLocation ("Resources/Textures/Mechs/" + file + "/MechBody.png"),	
		new ResourceLocation ("Resources/Textures/Mechs/" + file + "/MechLeg.png"),	
		new ResourceLocation ("Resources/Textures/Mechs/" + file + "/MechArm.png")
		};
		
		return Texture;
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

	public boolean isImmuneToDamage(DamageSource src)
	{
		Entity srcEnt = src.getEntity();
		if (srcEnt != null)
		{
			// ignore own damage
			if (srcEnt == this)
			{
				return true;
			}

			// ignore damage from rider
			if (srcEnt == riddenByEntity)
			{
				return true;
			}
		}

		// ignore suffocation damage
		if (src.damageType.equals("inWall"))
		{
			return true;
		}

		return false;
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
