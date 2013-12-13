package Modjam.TeamSmip.ExoCraft.Entity;

import net.minecraft.entity.EntityLiving;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityMech extends EntityLiving
{

	public EntityMech(World par1World)
	{
		super(par1World);
		this.setSize(2F, 2F);
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
		//One does not push a mech
		return false;
	} 
}
