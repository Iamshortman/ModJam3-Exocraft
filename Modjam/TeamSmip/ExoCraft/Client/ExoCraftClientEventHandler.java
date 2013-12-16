package Modjam.TeamSmip.ExoCraft.Client;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.event.ForgeSubscribe;
import Modjam.TeamSmip.ExoCraft.Entity.EntityMech;

public class ExoCraftClientEventHandler
{

	@ForgeSubscribe
	public void RenderLivingEvent(RenderLivingEvent.Pre event)
	{
		if (event.entity instanceof EntityPlayer)
		{
			if (event.entity.ridingEntity != null
					&& event.entity.ridingEntity instanceof EntityMech)
			{
				event.setCanceled(true);
			}
		}
	}
}
