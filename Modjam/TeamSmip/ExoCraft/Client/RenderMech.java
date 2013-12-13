package Modjam.TeamSmip.ExoCraft.Client;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderMech extends Render
{

	@Override
	public void doRender(Entity entity, double d0, double d1, double d2, float f, float f1)
	{
        GL11.glPushMatrix();
        GL11.glTranslatef((float)d0, (float)d1, (float)d2);
        GL11.glRotatef(f, 0.0F, 1.0F, 0.0F);
        ModelBiped model = new ModelBiped();
        model.render(entity, (float)d0, (float)d1, (float)d2, f, f1, 0);
        GL11.glPopMatrix();

	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity)
	{
		return null;
	}

}
