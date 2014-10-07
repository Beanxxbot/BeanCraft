package com.beanbot.beancraft.render;

import com.beanbot.beancraft.model.ModelBioInfuser;
import com.beanbot.beancraft.reference.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class BlockRendererBioInfuser extends TileEntitySpecialRenderer
{
    private ModelBioInfuser modelBioInfuser;
    public BlockRendererBioInfuser()
    {
        this.modelBioInfuser = new ModelBioInfuser();
    }

    public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float f)
    {
        GL11.glPushMatrix();
        GL11.glTranslatef((float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);
        GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
        Minecraft.getMinecraft().renderEngine.bindTexture(Reference.BIOINFUSER_TEXTURE);
        GL11.glTranslatef(0.0F, 0.0F, 0.0F);
        GL11.glPushMatrix();
        modelBioInfuser.renderModel(0.0625F);
        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }
}
