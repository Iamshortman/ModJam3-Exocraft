package Modjam.TeamSmip.ExoCraft.Client;

import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.client.registry.RenderingRegistry;
import Modjam.TeamSmip.ExoCraft.CommonProxy;
import Modjam.TeamSmip.ExoCraft.Client.Render.RenderMech;
import Modjam.TeamSmip.ExoCraft.Entity.EntityMech;
import Modjam.TeamSmip.ExoCraft.Events.ExoCraftEventHandler;

public class ClientProxy extends CommonProxy 
{

	@Override
	public void load()
	{
		super.load();
		RenderingRegistry.registerEntityRenderingHandler(EntityMech.class, new RenderMech());
		MinecraftForge.EVENT_BUS.register(new ExoCraftClientEventHandler());
	}
	
}
