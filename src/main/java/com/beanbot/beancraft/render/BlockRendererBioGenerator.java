package com.beanbot.beancraft.render;

import com.beanbot.beancraft.model.ModelBioGenerator;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class BlockRendererBioGenerator extends TileEntitySpecialRenderer
{

    private ModelBioGenerator modelBioGenerator;
    private static final ResourceLocation texture = new ResourceLocation("beancraft", "/textures/models/bioGen.png");

    public BlockRendererBioGenerator()
    {
        this.modelBioGenerator = new ModelBioGenerator();
    }

    public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float f)
    {
        GL11.glPushMatrix();

        GL11.glTranslatef((float) x + 0.5F, (float)y + 1.5F,(float)z + 0.5F);
        GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
        this.bindTexture(texture);
        GL11.glPushMatrix();
        modelBioGenerator.renderModel(0.0625F);
        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }
}
