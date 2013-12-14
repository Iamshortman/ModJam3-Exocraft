package Modjam.TeamSmip.ExoCraft;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class ExoCraftConfig 
{

	public static int MechSpanwerID;
	public static int ChipID;
	
    public static void Load(FMLPreInitializationEvent evt)
    {
            Configuration config = new Configuration(evt.getSuggestedConfigurationFile());
            config.load();
            MechSpanwerID = config.getItem("MechSpanwerID", 300).getInt();
            ChipID = config.getItem("ChipID", 301).getInt();
            
            config.save();
    }
}
