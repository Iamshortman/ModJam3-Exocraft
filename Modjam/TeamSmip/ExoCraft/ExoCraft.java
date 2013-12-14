package Modjam.TeamSmip.ExoCraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import Modjam.TeamSmip.ExoCraft.Events.ExoCraftEventHandler;
import Modjam.TeamSmip.ExoCraft.Item.ItemChip;
import Modjam.TeamSmip.ExoCraft.Item.ItemMech;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.LanguageRegistry;


@Mod(modid = "ExoCraft", name = "ExoCraft", version = "IDK")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class ExoCraft 
{

    @SidedProxy(serverSide = "Modjam.TeamSmip.ExoCraft.CommonProxy", clientSide = "Modjam.TeamSmip.ExoCraft.Client.ClientProxy")
    public static CommonProxy proxy;

    @Instance("ExoCraft")
    public static ExoCraft instance;
    
    public static Item mechSpawner;
    public static Item chip;
	@EventHandler
    public void Preload(FMLPreInitializationEvent event)
    {
		ExoCraftConfig.Load(event);
    }
	
	@EventHandler
    public void load(FMLInitializationEvent event)
    {
		proxy.load();
		mechSpawner = new ItemMech(ExoCraftConfig.MechSpanwerID).setCreativeTab(CreativeTabs.tabTransport).setUnlocalizedName("MechSpawner");
		chip = new ItemChip(ExoCraftConfig.ChipID).setCreativeTab(CreativeTabs.tabTransport).setUnlocalizedName("Chip");
		MinecraftForge.EVENT_BUS.register(new ExoCraftEventHandler());
		
		LanguageRegistry.addName(chip, "Chip");
		LanguageRegistry.addName(mechSpawner, "Mach-1 Mech");
		
    }
	
}
