package Modjam.TeamSmip.ExoCrft.Client.GUI;

import Modjam.TeamSmip.ExoCraft.Container.ContainerMechInventory;
import Modjam.TeamSmip.ExoCraft.Entity.EntityMech;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ContainerHorseInventory;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler
{

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		if(ID == 0 && player.ridingEntity instanceof EntityMech)
		{
			EntityMech mech = (EntityMech) player.ridingEntity;
			return new ContainerMechInventory(player.inventory, mech.mechChest , mech);
		}
		
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		if(ID == 0)
		{
			
		}
		
		return null;
	}

}
