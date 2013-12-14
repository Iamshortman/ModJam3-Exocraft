package Modjam.TeamSmip.ExoCraft.Client.Render;

import org.lwjgl.opengl.GL11;

import Modjam.TeamSmip.ExoCraft.Client.Model.ModelMechArm;
import Modjam.TeamSmip.ExoCraft.Client.Model.ModelMechBody;
import Modjam.TeamSmip.ExoCraft.Client.Model.ModelMechLeg;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderMech extends Render
{

	ResourceLocation body = new ResourceLocation("MechBody.png");
	ResourceLocation leg = new ResourceLocation("MechLeg.png");
	ResourceLocation arm = new ResourceLocation("MechArm.png");
	
	@Override
	public void doRender(Entity entity, double x, double y, double z, float f, float f1)
	{
		GL11.glPushMatrix();
		
        GL11.glTranslatef((float)x, (float)y - 0.5F, (float)z);
        GL11.glRotatef(entity.rotationYaw, 0.0F, -1.0F ,0.0F);
        GL11.glRotatef(entity.rotationPitch + 180, 1.0F, 0.0F, 0.0F);
        
        Float size = 0.0625F;
        
        GL11.glPushMatrix();
        GL11.glTranslated(0, -3, 0);
		this.bindTexture(body);
        ModelMechBody Body = new ModelMechBody();
        Body.render(size);
        GL11.glPopMatrix();
        
        GL11.glPushMatrix();
        GL11.glTranslated(-0.6, -2, -0.5);
		this.bindTexture(leg);
        ModelMechLeg RightLeg = new ModelMechLeg(false);
        RightLeg.render(size);
        GL11.glPopMatrix();
        
        GL11.glPushMatrix();
        GL11.glTranslated(0.6, -2, -0.5);
		this.bindTexture(leg);
        ModelMechLeg LeftLeg = new ModelMechLeg(true);
        LeftLeg.render(size);
        GL11.glPopMatrix();
        
        GL11.glPushMatrix();
        GL11.glTranslated(-1, -2.5, 0);
		this.bindTexture(arm);
        ModelMechArm RightArm = new ModelMechArm();
        RightArm.render(false, size);
        GL11.glPopMatrix();
        
        GL11.glPushMatrix();
        GL11.glTranslated(1, -2.5, 0);
		this.bindTexture(arm);
        ModelMechArm LeftArm = new ModelMechArm();
        LeftArm.render(true, size);
        GL11.glPopMatrix();
        
        GL11.glPopMatrix();

	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity)
	{
		return null;
	}

}
