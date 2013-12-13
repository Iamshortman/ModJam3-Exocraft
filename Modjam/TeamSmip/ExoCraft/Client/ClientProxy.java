package Modjam.TeamSmip.ExoCraft.Client;

import cpw.mods.fml.client.registry.RenderingRegistry;
import Modjam.TeamSmip.ExoCraft.CommonProxy;
import Modjam.TeamSmip.ExoCraft.Entity.EntityMech;

public class ClientProxy extends CommonProxy 
{

	@Override
	public void load()
	{
		super.load();
		RenderingRegistry.registerEntityRenderingHandler(EntityMech.class, new RenderMech());
	}
	
}
