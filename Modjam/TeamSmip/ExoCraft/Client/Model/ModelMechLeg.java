package Modjam.TeamSmip.ExoCraft.Client.Model;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

public class ModelMechLeg extends ModelBase
{
  //fields
    ModelRenderer Toe1;
    ModelRenderer Toe2;
    ModelRenderer Toe3;
    ModelRenderer Toe4;
    ModelRenderer Toe5;
    ModelRenderer Toe6;
    ModelRenderer Foot1;
    ModelRenderer Foot2;
    ModelRenderer Foot3;
    ModelRenderer Foot4;
    ModelRenderer Toe7;
    ModelRenderer Toe8;
    ModelRenderer Leg1;
    ModelRenderer Leg2;
    ModelRenderer Leg3;
    ModelRenderer Leg4;
    ModelRenderer Foot5;
    ModelRenderer Foot6;
    ModelRenderer Foot7;
    ModelRenderer Foot8;
  
    boolean Flipped = false;
    
  public ModelMechLeg(boolean Flip)
  {
    textureWidth = 128;
    textureHeight = 32;
    
    this.Flipped = Flip;
    
      Toe1 = new ModelRenderer(this, 30, 0);
      Toe1.addBox(0F, 0F, 0F, 2, 1, 4);
      Toe1.setRotationPoint(4F, 20F, -1F);
      Toe1.setTextureSize(128, 32);
      Toe1.mirror = true;
      setRotation(Toe1, 0F, -0.3490659F, 0F);
      Toe2 = new ModelRenderer(this, 30, 0);
      Toe2.addBox(0F, 0F, 0F, 2, 1, 4);
      Toe2.setRotationPoint(-2F, 20F, 0F);
      Toe2.setTextureSize(128, 32);
      Toe2.mirror = true;
      setRotation(Toe2, 0F, 0.3490659F, 0F);
      Toe3 = new ModelRenderer(this, 30, 5);
      Toe3.addBox(0F, 0F, 0F, 2, 1, 4);
      Toe3.setRotationPoint(-3F, 22F, -3F);
      Toe3.setTextureSize(128, 32);
      Toe3.mirror = true;
      setRotation(Toe3, 0.5585054F, 0.3490659F, 0F);
      Toe4 = new ModelRenderer(this, 30, 5);
      Toe4.addBox(0F, 0F, 0F, 2, 1, 4);
      Toe4.setRotationPoint(5F, 22F, -4F);
      Toe4.setTextureSize(128, 32);
      Toe4.mirror = true;
      setRotation(Toe4, 0.5585054F, -0.3490659F, 0F);
      Toe5 = new ModelRenderer(this, 30, 10);
      Toe5.addBox(0F, 0F, 0F, 2, 1, 2);
      Toe5.setRotationPoint(-3.4F, 23.4F, -4.2F);
      Toe5.setTextureSize(128, 32);
      Toe5.mirror = true;
      setRotation(Toe5, 0.8179294F, 0.3490659F, 0F);
      Toe6 = new ModelRenderer(this, 30, 10);
      Toe6.addBox(0F, 0F, 0F, 2, 1, 2);
      Toe6.setRotationPoint(5.4F, 23.4F, -5.2F);
      Toe6.setTextureSize(128, 32);
      Toe6.mirror = true;
      setRotation(Toe6, 0.8179294F, -0.3490659F, 0F);
      Foot1 = new ModelRenderer(this, 4, 15);
      Foot1.addBox(0F, 0F, 0F, 1, 5, 1);
      Foot1.setRotationPoint(2F, 21F, 2F);
      Foot1.setTextureSize(128, 32);
      Foot1.mirror = true;
      setRotation(Foot1, 1.570796F, -1.308997F, 0F);
      Foot2 = new ModelRenderer(this, 0, 15);
      Foot2.addBox(0F, 0F, 0F, 1, 5, 1);
      Foot2.setRotationPoint(1.8F, 21F, 3F);
      Foot2.setTextureSize(128, 32);
      Foot2.mirror = true;
      setRotation(Foot2, 1.570796F, 1.308997F, 0F);
      Foot3 = new ModelRenderer(this, 8, 18);
      Foot3.addBox(0F, 0F, 0F, 1, 1, 13);
      Foot3.setRotationPoint(-2.8F, 20F, 3.5F);
      Foot3.setTextureSize(128, 32);
      Foot3.mirror = true;
      setRotation(Foot3, 0F, 0.3490659F, 0F);
      Foot4 = new ModelRenderer(this, 8, 18);
      Foot4.addBox(0F, 0F, 0F, 1, 1, 13);
      Foot4.setRotationPoint(5.8F, 20F, 3.5F);
      Foot4.setTextureSize(128, 32);
      Foot4.mirror = true;
      setRotation(Foot4, 0F, -0.3490659F, 0F);
      Toe7 = new ModelRenderer(this, 20, 0);
      Toe7.addBox(0F, 0F, 0F, 1, 1, 4);
      Toe7.setRotationPoint(1.5F, 20F, 15.5F);
      Toe7.setTextureSize(128, 32);
      Toe7.mirror = true;
      setRotation(Toe7, -0.2974289F, 0F, 0F);
      Toe8 = new ModelRenderer(this, 20, 5);
      Toe8.addBox(0F, 0F, 0F, 1, 1, 4);
      Toe8.setRotationPoint(1.5F, 21F, 19F);
      Toe8.setTextureSize(128, 32);
      Toe8.mirror = true;
      setRotation(Toe8, -0.5948578F, 0F, 0F);
      Leg1 = new ModelRenderer(this, 0, 0);
      Leg1.addBox(0F, 0F, 0F, 5, 10, 5);
      Leg1.setRotationPoint(-0.5F, 10F, 3.7F);
      Leg1.setTextureSize(128, 32);
      Leg1.mirror = true;
      setRotation(Leg1, 0F, 0F, 0F);
      Leg2 = new ModelRenderer(this, 58, 0);
      Leg2.addBox(0F, 0F, 0F, 4, 11, 4);
      Leg2.setRotationPoint(4F, 0F, 4.2F);
      Leg2.setTextureSize(128, 32);
      Leg2.mirror = true;
      setRotation(Leg2, 0F, 0F, 0.3490659F);
      Leg3 = new ModelRenderer(this, 42, 0);
      Leg3.addBox(0F, 0F, 0F, 1, 1, 7);
      Leg3.setRotationPoint(1.5F, 10F, 8F);
      Leg3.setTextureSize(128, 32);
      Leg3.mirror = true;
      setRotation(Leg3, -0.6320364F, 0F, 0F);
      Leg4 = new ModelRenderer(this, 42, 8);
      Leg4.addBox(0F, 0F, 0F, 1, 1, 7);
      Leg4.setRotationPoint(1.5F, 14F, 13.5F);
      Leg4.setTextureSize(128, 32);
      Leg4.mirror = true;
      setRotation(Leg4, -1.204277F, 0F, 0F);
      Foot5 = new ModelRenderer(this, 36, 21);
      Foot5.addBox(0F, 0F, 0F, 2, 3, 8);
      Foot5.setRotationPoint(4F, 18F, 3.5F);
      Foot5.setTextureSize(128, 32);
      Foot5.mirror = true;
      setRotation(Foot5, 0F, -0.3490659F, -0.3490659F);
      Foot6 = new ModelRenderer(this, 36, 21);
      Foot6.addBox(0F, 0F, 0F, 2, 3, 8);
      Foot6.setRotationPoint(-2F, 17.8F, 4F);
      Foot6.setTextureSize(128, 32);
      Foot6.mirror = true;
      setRotation(Foot6, 0F, 0.3490659F, 0.1259942F);
      Foot7 = new ModelRenderer(this, 0, 21);
      Foot7.addBox(0F, 0F, 0F, 2, 3, 1);
      Foot7.setRotationPoint(1F, 19F, 10.6F);
      Foot7.setTextureSize(128, 32);
      Foot7.mirror = true;
      setRotation(Foot7, 0.9666439F, 0F, 0F);
      Foot8 = new ModelRenderer(this, 0, 0);
      Foot8.addBox(0F, 0F, 0F, 4, 1, 2);
      Foot8.setRotationPoint(0F, 20F, 3F);
      Foot8.setTextureSize(128, 32);
      Foot8.mirror = true;
      setRotation(Foot8, 0.6878043F, 0F, 0F);
  }
  
  public void render(float f5)
  {
	  if(Flipped)
	  {
		  GL11.glFrontFace(GL11.GL_CW);
		  GL11.glScaled(-1, 1, 1);
	  }  
	  
    Toe1.render(f5);
    Toe2.render(f5);
    Toe3.render(f5);
    Toe4.render(f5);
    Toe5.render(f5);
    Toe6.render(f5);
    Foot1.render(f5);
    Foot2.render(f5);
    Foot3.render(f5);
    Foot4.render(f5);
    Toe7.render(f5);
    Toe8.render(f5);
    Leg1.render(f5);
    Leg2.render(f5);
    Leg3.render(f5);
    Leg4.render(f5);
    Foot5.render(f5);
    Foot6.render(f5);
    Foot7.render(f5);
    Foot8.render(f5);
    
    if(Flipped)
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
