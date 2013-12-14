package Modjam.TeamSmip.ExoCraft.Client.Model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelMechBody extends ModelBase
{
  //fields
    ModelRenderer body;
    ModelRenderer head;
  
  public ModelMechBody()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      body = new ModelRenderer(this, 0, 0);
      body.addBox(0F, 0F, 0F, 16, 24, 8);
      body.setRotationPoint(-8F, 0F, -4F);
      body.setTextureSize(64, 32);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);
      head = new ModelRenderer(this, 53, 0);
      head.addBox(0F, 0F, 0F, 16, 16, 16);
      head.setRotationPoint(-8F, -16F, -8F);
      head.setTextureSize(64, 32);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
  }
  
  public void render(float f5)
  {
    body.render(f5);
    head.render(f5 * .85F);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }

}
