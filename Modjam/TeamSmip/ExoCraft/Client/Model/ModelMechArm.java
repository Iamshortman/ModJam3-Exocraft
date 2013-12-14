package Modjam.TeamSmip.ExoCraft.Client.Model;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelMechArm extends ModelBase
{
  //fields
    ModelRenderer arm1;
    ModelRenderer arm2;
    ModelRenderer arm3;
    ModelRenderer arm4;
    ModelRenderer arm5;
    ModelRenderer arm6;
    ModelRenderer arm7;
    ModelRenderer arm8;
  
  public ModelMechArm()
  {
    textureWidth = 128;
    textureHeight = 32;
    
      arm1 = new ModelRenderer(this, 0, 0);
      arm1.addBox(0F, 0F, 0F, 8, 24, 8);
      arm1.setRotationPoint(-5F, -11F, -4F);
      arm1.setTextureSize(64, 32);
      arm1.mirror = true;
      setRotation(arm1, 0F, 0F, 0F);
      arm2 = new ModelRenderer(this, 32, 0);
      arm2.addBox(0F, 0F, 0F, 5, 4, 4);
      arm2.setRotationPoint(3F, -8F, -2F);
      arm2.setTextureSize(64, 32);
      arm2.mirror = true;
      setRotation(arm2, 0F, 0F, 0F);
      arm3 = new ModelRenderer(this, 50, 15);
      arm3.addBox(0F, 0F, 0F, 5, 1, 2);
      arm3.setRotationPoint(-9F, 14.2F, -4F);
      arm3.setTextureSize(64, 32);
      arm3.mirror = true;
      setRotation(arm3, 0F, 0F, -0.5235988F);
      arm4 = new ModelRenderer(this, 50, 15);
      arm4.addBox(0F, 0F, 0F, 5, 1, 2);
      arm4.setRotationPoint(-9F, 14.2F, 2F);
      arm4.setTextureSize(64, 32);
      arm4.mirror = true;
      setRotation(arm4, 0F, 0F, -0.5235988F);
      arm5 = new ModelRenderer(this, 32, 8);
      arm5.addBox(0F, 0F, 0F, 5, 1, 4);
      arm5.setRotationPoint(3F, 12F, -2F);
      arm5.setTextureSize(64, 32);
      arm5.mirror = true;
      setRotation(arm5, 0F, 0F, 0.5235988F);
      arm6 = new ModelRenderer(this, 32, 13);
      arm6.addBox(0F, 0F, 0F, 5, 1, 4);
      arm6.setRotationPoint(7.4F, 14.5F, -2F);
      arm6.setTextureSize(64, 32);
      arm6.mirror = true;
      setRotation(arm6, 0F, 0F, 1.233091F);
      arm7 = new ModelRenderer(this, 50, 15);
      arm7.addBox(0F, 0F, 0F, 5, 1, 2);
      arm7.setRotationPoint(-10.6F, 19F, 2F);
      arm7.setTextureSize(64, 32);
      arm7.mirror = true;
      setRotation(arm7, 0F, 0F, -1.267171F);
      arm8 = new ModelRenderer(this, 50, 18);
      arm8.addBox(0F, 0F, 0F, 5, 1, 2);
      arm8.setRotationPoint(-10.6F, 19F, -4F);
      arm8.setTextureSize(64, 32);
      arm8.mirror = true;
      setRotation(arm8, 0F, 0F, -1.267171F);
  }
  
  public void render(boolean Flip, float f5)
  {
	 if(Flip)
	 {
    	 GL11.glFrontFace(GL11.GL_CW);
		 GL11.glScaled(-1, 1, 1);
	 }
	  
    arm1.render(f5);
    arm2.render(f5);
    arm3.render(f5);
    arm4.render(f5);
    arm5.render(f5);
    arm6.render(f5);
    arm7.render(f5);
    arm8.render(f5);
    
    if(Flip)
    {
    	 GL11.glFrontFace(GL11.GL_CCW);
    }
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }

}
