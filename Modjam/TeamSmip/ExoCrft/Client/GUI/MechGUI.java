package Modjam.TeamSmip.ExoCrft.Client.GUI;


import Modjam.TeamSmip.ExoCraft.Container.ContainerMechInventory;
import Modjam.TeamSmip.ExoCraft.Entity.EntityMech;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.AnimalChest;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class MechGUI extends GuiContainer
{
    private static final ResourceLocation MechGuiTextures = new ResourceLocation("textures/gui/container/horse.png");
    private IInventory field_110413_u;
    private IInventory field_110412_v;
    private EntityMech mech;
    private float field_110416_x;
    private float field_110415_y;

    public void displayMechGUI(EntityMech par1Mech, IInventory par2IInventory) {}
    
    public MechGUI(InventoryPlayer inventory, AnimalChest mechChest, EntityMech mech)
    {
        super(new ContainerMechInventory(inventory, mechChest, mech));
        this.field_110413_u = inventory;
        this.field_110412_v = mechChest;
        this.mech = mech;
        this.allowUserInput = false;
    }

    /**
     * Draw the foreground layer for the GuiContainer (everything in front of the items)
     */
    protected void drawGuiContainerForegroundLayer(int par1, int par2)
    {
        this.fontRenderer.drawString(this.field_110412_v.isInvNameLocalized() ? this.field_110412_v.getInvName() : I18n.getString(this.field_110412_v.getInvName()), 8, 6, 4210752);
        this.fontRenderer.drawString(this.field_110413_u.isInvNameLocalized() ? this.field_110413_u.getInvName() : I18n.getString(this.field_110413_u.getInvName()), 8, this.ySize - 96 + 2, 4210752);
    }

    /**
     * Draw the background layer for the GuiContainer (everything behind the items)
     */
    protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3)
    {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(MechGuiTextures);
        int k = (this.width - this.xSize) / 2;
        int l = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);

        GuiInventory.func_110423_a(k + 51, l + 60, 12, (float)(k + 51) - this.field_110416_x, (float)(l + 75 - 50) - this.field_110415_y, this.mech);
    }

    /**
     * Draws the screen and all the components in it.
     */
    public void drawScreen(int par1, int par2, float par3)
    {
        this.field_110416_x = (float)par1;
        this.field_110415_y = (float)par2;
        super.drawScreen(par1, par2, par3);
    }
}
