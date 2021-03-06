// Date: 9/14/2014 9:16:00 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.beanbot.beancraft.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelInfusedHoe extends ModelBase
{
  //fields
    ModelRenderer CrystalBase;
    ModelRenderer CrystalAugment1;
    ModelRenderer CrystalAugment2;
    ModelRenderer CrystalAugment3;
    ModelRenderer Handle;
    ModelRenderer Bar;
    ModelRenderer Point_1;
    ModelRenderer Point_2;
    ModelRenderer Back;
  
  public ModelInfusedHoe()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      CrystalBase = new ModelRenderer(this, 0, 0);
      CrystalBase.addBox(-2F, 16F, -2F, 4, 4, 4);
      CrystalBase.setRotationPoint(0F, 0F, 0F);
      CrystalBase.setTextureSize(64, 32);
      CrystalBase.mirror = true;
      setRotation(CrystalBase, 0F, 0F, 0F);
      CrystalAugment1 = new ModelRenderer(this, 0, 0);
      CrystalAugment1.addBox(-1F, 17F, -3F, 2, 2, 6);
      CrystalAugment1.setRotationPoint(0F, 0F, 0F);
      CrystalAugment1.setTextureSize(64, 32);
      CrystalAugment1.mirror = true;
      setRotation(CrystalAugment1, 0F, 0F, 0F);
      CrystalAugment2 = new ModelRenderer(this, 0, 0);
      CrystalAugment2.addBox(-1F, 16F, -1F, 2, 5, 2);
      CrystalAugment2.setRotationPoint(0F, 0F, 0F);
      CrystalAugment2.setTextureSize(64, 32);
      CrystalAugment2.mirror = true;
      setRotation(CrystalAugment2, 0F, 0F, 0F);
      CrystalAugment3 = new ModelRenderer(this, 0, 0);
      CrystalAugment3.addBox(-3F, 17F, -1F, 6, 2, 2);
      CrystalAugment3.setRotationPoint(0F, 0F, 0F);
      CrystalAugment3.setTextureSize(64, 32);
      CrystalAugment3.mirror = true;
      setRotation(CrystalAugment3, 0F, 0F, 0F);
      Handle = new ModelRenderer(this, 19, 0);
      Handle.addBox(-1F, 0F, -1F, 2, 16, 2);
      Handle.setRotationPoint(0F, 0F, 0F);
      Handle.setTextureSize(64, 32);
      Handle.mirror = true;
      setRotation(Handle, 0F, 0F, 0F);
      Bar = new ModelRenderer(this, 0, 22);
      Bar.addBox(-1F, 1F, -9F, 2, 2, 8);
      Bar.setRotationPoint(0F, 0F, 0F);
      Bar.setTextureSize(64, 32);
      Bar.mirror = true;
      setRotation(Bar, 0F, 0F, 0F);
      Point_1 = new ModelRenderer(this, 0, 14);
      Point_1.addBox(0F, 0F, -1F, 2, 2, 2);
      Point_1.setRotationPoint(-1F, 3F, -10F);
      Point_1.setTextureSize(64, 32);
      Point_1.mirror = true;
      setRotation(Point_1, 0F, 0F, 0F);
      Point_2 = new ModelRenderer(this, 0, 14);
      Point_2.addBox(-1F, 2F, -10F, 2, 2, 2);
      Point_2.setRotationPoint(0F, 0F, 0F);
      Point_2.setTextureSize(64, 32);
      Point_2.mirror = true;
      setRotation(Point_2, 0F, 0F, 0F);
      Back = new ModelRenderer(this, 21, 29);
      Back.addBox(-1F, 1F, 1F, 2, 2, 1);
      Back.setRotationPoint(0F, 0F, 0F);
      Back.setTextureSize(64, 32);
      Back.mirror = true;
      setRotation(Back, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    CrystalBase.render(f5);
      CrystalAugment1.render(f5);
      CrystalAugment2.render(f5);
      CrystalAugment3.render(f5);
      Handle.render(f5);
      Bar.render(f5);
      Point_1.render(f5);
      Point_2.render(f5);
      Back.render(f5);
  }

  public void renderModel(float f)
  {
      CrystalBase.render(f);
      CrystalAugment1.render(f);
      CrystalAugment2.render(f);
      CrystalAugment3.render(f);
      Handle.render(f);
      Bar.render(f);
      Point_1.render(f);
      Point_2.render(f);
      Back.render(f);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
