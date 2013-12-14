package Modjam.TeamSmip.ExoCraft.Container;

import Modjam.TeamSmip.ExoCraft.Entity.EntityMech;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.AnimalChest;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;

public class ContainerMechInventory extends Container
{
    private IInventory field_111243_a;
    private EntityMech theMech;
	
	public ContainerMechInventory(InventoryPlayer inventory, AnimalChest mechChest, EntityMech mech)
	{
		this.field_111243_a = mechChest;
        this.theMech = mech;
        byte b0 = 3;
        mechChest.openChest();
        int i = (b0 - 4) * 18;
        //this.addSlotToContainer(new ContainerHorseInventorySlotSaddle(this, par2IInventory, 0, 8, 18));
        //this.addSlotToContainer(new ContainerHorseInventorySlotArmor(this, par2IInventory, 1, 8, 36, mech));
        int j;
        int k;

        for (j = 0; j < 3; ++j)
        {
            for (k = 0; k < 9; ++k)
            {
                this.addSlotToContainer(new Slot(inventory, k + j * 9 + 9, 8 + k * 18, 102 + j * 18 + i));
            }
        }

        for (j = 0; j < 9; ++j)
        {
            this.addSlotToContainer(new Slot(inventory, j, 8 + j * 18, 160 + i));
        }
	}

	@Override
	public boolean canInteractWith(EntityPlayer entityplayer)
	{
		return true;
	}

}
