package Modjam.TeamSmip.ExoCraft;

import Modjam.TeamSmip.ExoCraft.Entity.EntityMech;
import cpw.mods.fml.common.registry.EntityRegistry;

public class CommonProxy 
{
	public void load()
	{
		EntityRegistry.registerModEntity(EntityMech.class, "BasicMech", EntityRegistry.findGlobalUniqueEntityId(), ExoCraft.instance, 100, 1, true);
		
	}
}
