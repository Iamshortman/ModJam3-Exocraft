package Modjam.TeamSmip.ExoCraft.Entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class EntityMech extends EntityLiving
{

	public EntityMech(World par1World)
	{
		super(par1World);
		this.setSize(2F, 3.5F);
		this.stepHeight = 1F;
		this.ignoreFrustumCheck = true;
	}

	@Override
	public void onUpdate()
	{
		super.onUpdate();
	}

	
	
	@Override
	public void moveEntityWithHeading(float par1, float par2)
	{
        if (this.riddenByEntity != null)
        {
            this.prevRotationYaw = this.rotationYaw = this.riddenByEntity.rotationYaw;
            this.setRotation(this.rotationYaw, this.rotationPitch);
            this.rotationYawHead = this.renderYawOffset = this.rotationYaw;
            par1 = ((EntityLivingBase)this.riddenByEntity).moveStrafing * 0.5F;
            par2 = ((EntityLivingBase)this.riddenByEntity).moveForward;
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
	public boolean interact(EntityPlayer par1EntityPlayer)
	{
		if (this.riddenByEntity == null)
		{
			par1EntityPlayer.mountEntity(this);
		}

		return true;
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
}
