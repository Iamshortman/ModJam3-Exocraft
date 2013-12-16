package Modjam.TeamSmip.ExoCraft.Events;

import Modjam.TeamSmip.ExoCraft.Entity.EntityMech;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.client.event.*;

public class ExoCraftEventHandler
{

	@ForgeSubscribe
	public void LivingDropEvent(LivingDropsEvent event)
	{
		EntityItem item = new EntityItem(event.entity.worldObj,
				event.entity.posX, event.entity.posY, event.entity.posZ,
				new ItemStack(Item.diamond, 1));
		System.out.println("Cabbge!!!!!!!!!!!!!!!1");
		event.drops.add(item);
	}
}
