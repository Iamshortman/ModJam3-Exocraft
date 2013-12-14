package Modjam.TeamSmip.ExoCraft.Item;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumMovingObjectType;
import net.minecraft.util.Icon;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import Modjam.TeamSmip.ExoCraft.Chips;
import Modjam.TeamSmip.ExoCraft.Entity.EntityMech;

public class ItemChip extends Item

{
	String chip = "Resources/Textures/items/";

	public ItemChip(int par1)
	{
		super(par1);
		this.setHasSubtypes(true);
	}
	
	@SideOnly(Side.CLIENT)
    private Icon[] icons;
	 public Icon getIconFromDamage(int par1)
     {
             return icons[par1];
     }
     
     @SideOnly(Side.CLIENT)
     @Override
     public void registerIcons(IconRegister par1IconRegister)
     {
             icons = new Icon[Chips.ChipNames.length];
             for (int i = 0; i < Chips.ChipNames.length; i++)
             {
                     String str = Chips.ChipNames[i].toLowerCase() + "chip";
                     str = chip + str;
                     icons[i] = par1IconRegister.registerIcon(str);
             }
     }

     @SideOnly(Side.CLIENT)
     public void getSubItems(int i, CreativeTabs tab, List list)
     {
             list.add(new ItemStack(i, 1, 0));
             list.add(new ItemStack(i, 1, 1));
             list.add(new ItemStack(i, 1, 2));
             list.add(new ItemStack(i, 1, 3));
             list.add(new ItemStack(i, 1, 4));
             list.add(new ItemStack(i, 1, 5));
             list.add(new ItemStack(i, 1, 6));
             list.add(new ItemStack(i, 1, 7));
             list.add(new ItemStack(i, 1, 8));
             list.add(new ItemStack(i, 1, 9));
             list.add(new ItemStack(i, 1, 10));
             list.add(new ItemStack(i, 1, 11));
             list.add(new ItemStack(i, 1, 12));
             list.add(new ItemStack(i, 1, 13));
             list.add(new ItemStack(i, 1, 14));
             list.add(new ItemStack(i, 1, 15));
             list.add(new ItemStack(i, 1, 16));
             list.add(new ItemStack(i, 1, 17));
             list.add(new ItemStack(i, 1, 18));
             list.add(new ItemStack(i, 1, 19));
             list.add(new ItemStack(i, 1, 20));
             list.add(new ItemStack(i, 1, 21));
             list.add(new ItemStack(i, 1, 22));
             list.add(new ItemStack(i, 1, 23));
             list.add(new ItemStack(i, 1, 24));
             list.add(new ItemStack(i, 1, 25));
             list.add(new ItemStack(i, 1, 26));
             list.add(new ItemStack(i, 1, 27));
             list.add(new ItemStack(i, 1, 28));
     
     }

     public String getItemDisplayName(ItemStack par1ItemStack)
     {
             int metadata = par1ItemStack.getItemDamage();
             return Chips.ChipNames[metadata] + " Chip";
     }
}



