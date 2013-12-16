package Modjam.TeamSmip.ExoCraft.Container;

import Modjam.TeamSmip.ExoCraft.Entity.EntityMech;
import Modjam.TeamSmip.ExoCraft.Item.ItemChip;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.inventory.AnimalChest;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

class ContainerMechInventorySlotChip extends Slot
{
    final EntityMech theMech;

    final ContainerMechInventory field_111240_b;

    ContainerMechInventorySlotChip(ContainerMechInventory par1ContainerMechInventory, IInventory par2IInventory, int par3, int par4, int par5, EntityMech par6EntityMech)
    {
        super(par2IInventory, par3, par4, par5);
        this.field_111240_b = par1ContainerMechInventory;
        this.theMech = par6EntityMech;
    }

    /**
     * Check if the stack is a valid item for this slot. Always true beside for the armor slots.
     */
    public boolean isItemValid(ItemStack par1ItemStack)
    {
    	if(par1ItemStack.getItem() instanceof ItemChip)
    	{
    		return true;
    	}
        return false;
    }
}