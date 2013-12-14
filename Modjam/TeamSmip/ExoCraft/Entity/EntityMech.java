package Modjam.TeamSmip.ExoCraft.Entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class EntityMech extends Entity
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
	
	//TODO Fix this
    public boolean interact(EntityPlayer par1EntityPlayer)
    {
		if(this.riddenByEntity == null)
		{
			par1EntityPlayer.mountEntity(this);
		}
		
    	return true;
    }
	
	@Override
	public boolean canBeCollidedWith()
	{
		return true;
	}


	@Override
	public boolean canBePushed()
	{
		//One does not push a mech
		return false;
	}


	@Override
	protected void entityInit()
	{
		// TODO Auto-generated method stub
		
	}


	@Override
	protected void readEntityFromNBT(NBTTagCompound nbttagcompound)
	{
		// TODO Auto-generated method stub
		
	}


	@Override
	protected void writeEntityToNBT(NBTTagCompound nbttagcompound)
	{
		// TODO Auto-generated method stub
		
	} 
}
