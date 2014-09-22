package com.beanbot.beancraft.render;

import com.beanbot.beancraft.reference.Reference;
import com.beanbot.beancraft.tile.TileEntityBioPipe;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.ForgeDirection;
import org.lwjgl.opengl.GL11;

public class TileEntityRendererPipe extends TileEntitySpecialRenderer {

    ResourceLocation texture = new ResourceLocation(Reference.MOD_ID.toLowerCase(), "textures/models/bioPipe.png");
    float pixel = 1F/16F;
    float texturePixel = 1F/32F;

    @Override
    public void renderTileEntityAt(TileEntity tileEntity, double translationX, double translationY, double translationZ, float f) {
        GL11.glTranslated(translationX, translationY, translationZ);
        GL11.glDisable(GL11.GL_LIGHTING);
        this.bindTexture(texture);
        {
            drawCore(tileEntity);

            TileEntityBioPipe pipe = (TileEntityBioPipe) tileEntity;
            for (int i = 0; i < pipe.connections.length; i++) {
                if (pipe.connections[i] != null) {
                    drawConnection(pipe.connections[i]);
                }
            }

            GL11.glDisable(GL11.GL_LIGHTING);
            GL11.glTranslated(-translationX, -translationY, -translationZ);
        }
    }

    public void drawConnection(ForgeDirection direction)
    {



        Tessellator tessellator = Tessellator.instance;
        tessellator.startDrawingQuads();
        {
            GL11.glTranslatef(0.5F, 0.5F, 0.5F);
            if(direction.equals(ForgeDirection.UP))
            {
                //ROTATE
            }
            else if(direction.equals(ForgeDirection.DOWN))
            {
                GL11.glRotatef(180F, 1, 0, 0);

                tessellator.addVertexWithUV(1-11 * pixel / 2, 1, 1-11 * pixel / 2, 0* texturePixel, 5 * texturePixel);
                tessellator.addVertexWithUV(1-11 * pixel / 2, 1, 11 * pixel / 2, 0 * texturePixel, 0 * texturePixel);
                tessellator.addVertexWithUV(11 * pixel / 2, 1, 11 * pixel / 2, 5 * texturePixel, 0 * texturePixel);
                tessellator.addVertexWithUV(11 * pixel / 2, 1, 1-11 * pixel / 2, 5 * texturePixel, 5 * texturePixel);

            }
            else if(direction.equals(ForgeDirection.SOUTH))
            {
                GL11.glRotatef(90, 1, 0, 0);
            }
            else if(direction.equals(ForgeDirection.NORTH))
            {
                GL11.glRotatef(270, 1, 0, 0);
            }
            else if(direction.equals(ForgeDirection.WEST))
            {
                GL11.glRotatef(90, 0, 0, 1);
            }
            else if(direction.equals(ForgeDirection.EAST))
            {
                GL11.glRotatef(270, 0, 0, 1);
            }
            GL11.glTranslatef(-0.5F, -0.5F, -0.5F);

            tessellator.addVertexWithUV(1 - 11 * pixel / 2, 1 - 11 * pixel / 2, 1-11 * pixel / 2, 5 * texturePixel, 5 * texturePixel);
            tessellator.addVertexWithUV(1 - 11 * pixel / 2, 1, 1-11 * pixel / 2, 10 * texturePixel, 5 * texturePixel);
            tessellator.addVertexWithUV(11 * pixel / 2, 1, 1-11 * pixel / 2, 10 * texturePixel, 0 * texturePixel);
            tessellator.addVertexWithUV(11 * pixel / 2, 1 - 11 * pixel / 2, 1-11 * pixel / 2, 5 * texturePixel, 0 * texturePixel);

            tessellator.addVertexWithUV(11*pixel/2, 1-11*pixel/2, 11*pixel / 2, 5*texturePixel, 5*texturePixel);
            tessellator.addVertexWithUV(11*pixel/2, 1, 11*pixel/2, 10*texturePixel, 5*texturePixel);
            tessellator.addVertexWithUV(1-11*pixel/2, 1, 11*pixel/2, 10*texturePixel, 0*texturePixel);
            tessellator.addVertexWithUV(1-11*pixel/2, 1-11 * pixel/2, 11*pixel/2, 5*texturePixel, 0*texturePixel);

            tessellator.addVertexWithUV(1-11*pixel/2, 1-11*pixel/2, 11*pixel/2, 5*texturePixel, 5*texturePixel);
            tessellator.addVertexWithUV(1-11*pixel/2, 1, 11*pixel/2, 10*texturePixel, 5*texturePixel);
            tessellator.addVertexWithUV(1-11*pixel/2, 1, 1-11*pixel/2, 10*texturePixel, 0*texturePixel);
            tessellator.addVertexWithUV(1-11*pixel/2, 1-11 * pixel/2, 1-11*pixel/2, 5*texturePixel, 0*texturePixel);

            tessellator.addVertexWithUV(11*pixel/2, 1-11 * pixel/2, 1-11*pixel/2, 5*texturePixel, 0*texturePixel);
            tessellator.addVertexWithUV(11*pixel/2, 1, 1-11*pixel/2, 10*texturePixel, 0*texturePixel);
            tessellator.addVertexWithUV(11*pixel/2, 1, 11*pixel/2, 10*texturePixel, 5*texturePixel);
            tessellator.addVertexWithUV(11*pixel/2, 1-11*pixel/2, 11*pixel/2, 5*texturePixel, 5*texturePixel);

        }
        tessellator.draw();

        GL11.glTranslatef(0.5F, 0.5F, 0.5F);
        if(direction.equals(ForgeDirection.UP))
        {
            //ROTATE
        }
        else if(direction.equals(ForgeDirection.DOWN))
        {
            GL11.glRotatef(-180F, 1, 0, 0);
        }
        else if(direction.equals(ForgeDirection.SOUTH))
        {
            GL11.glRotatef(-90, 1, 0, 0);
        }
        else if(direction.equals(ForgeDirection.NORTH))
        {
            GL11.glRotatef(-270, 1, 0, 0);
        }
        else if(direction.equals(ForgeDirection.WEST))
        {
            GL11.glRotatef(-90, 0, 0, 1);
        }
        else if(direction.equals(ForgeDirection.EAST))
        {
            GL11.glRotatef(-270, 0, 0, 1);
        }
        GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
    }

    public void drawCore(TileEntity tileEntity)
    {
        Tessellator tessellator = Tessellator.instance;
        tessellator.startDrawingQuads();
        {
            //South Side
            tessellator.addVertexWithUV(1 - 11 * pixel / 2, 11 * pixel / 2, 1-11 * pixel / 2, 5 * texturePixel, 5 * texturePixel);
            tessellator.addVertexWithUV(1 - 11 * pixel / 2, 1 - 11 * pixel / 2, 1-11 * pixel / 2, 5 * texturePixel, 0 * texturePixel);
            tessellator.addVertexWithUV(11 * pixel / 2, 1 - 11 * pixel / 2, 1-11 * pixel / 2, 0 * texturePixel, 0 * texturePixel);
            tessellator.addVertexWithUV(11 * pixel / 2, 11 * pixel / 2, 1-11 * pixel / 2, 0 * texturePixel, 5 * texturePixel);

            //East Side
            tessellator.addVertexWithUV(1 - 11 * pixel / 2, 11 * pixel / 2, 11 * pixel / 2, 5 * texturePixel, 5 * texturePixel);
            tessellator.addVertexWithUV(1 - 11 * pixel / 2, 1 - 11 * pixel / 2, 11 * pixel / 2, 5 * texturePixel, 0 * texturePixel);
            tessellator.addVertexWithUV(1 - 11 * pixel / 2, 1 - 11 * pixel / 2, 1-11 * pixel / 2, 0 * texturePixel, 0 * texturePixel);
            tessellator.addVertexWithUV(1 - 11 * pixel / 2, 11 * pixel / 2, 1-11 * pixel / 2, 0 * texturePixel, 5 * texturePixel);

            //North Side
            tessellator.addVertexWithUV(11 * pixel / 2, 11 * pixel / 2, 11 * pixel / 2, 5 * texturePixel, 5 * texturePixel);
            tessellator.addVertexWithUV(11 * pixel / 2, 1 - 11 * pixel / 2, 11 * pixel / 2, 5 * texturePixel, 0 * texturePixel);
            tessellator.addVertexWithUV(1 - 11 * pixel / 2, 1 - 11 * pixel / 2, 11 * pixel / 2, 0 * texturePixel, 0 * texturePixel);
            tessellator.addVertexWithUV(1 - 11 * pixel / 2, 11 * pixel / 2, 11 * pixel / 2, 0 * texturePixel, 5 * texturePixel);

            //West Side
            tessellator.addVertexWithUV(11 * pixel / 2, 1 - 11 * pixel / 2, 1-11 * pixel / 2, 5* texturePixel, 5 * texturePixel);
            tessellator.addVertexWithUV(11 * pixel / 2, 1 - 11 * pixel / 2, 11 * pixel / 2, 5 * texturePixel, 0 * texturePixel);
            tessellator.addVertexWithUV(11 * pixel / 2, 11 * pixel / 2, 11 * pixel / 2, 0 * texturePixel, 0 * texturePixel);
            tessellator.addVertexWithUV(11 * pixel / 2, 11 * pixel / 2, 1-11 * pixel / 2, 0 * texturePixel, 5 * texturePixel);

            //Top Side
            tessellator.addVertexWithUV(1-11 * pixel / 2, 1 - 11 * pixel / 2, 1-11 * pixel / 2, 5* texturePixel, 5 * texturePixel);
            tessellator.addVertexWithUV(1-11 * pixel / 2, 1-11 * pixel / 2, 11 * pixel / 2, 5 * texturePixel, 0 * texturePixel);
            tessellator.addVertexWithUV(11 * pixel / 2, 1-11 * pixel / 2, 11 * pixel / 2, 0 * texturePixel, 0 * texturePixel);
            tessellator.addVertexWithUV(11 * pixel / 2, 1-11 * pixel / 2, 1-11 * pixel / 2, 0 * texturePixel, 5 * texturePixel);

            //Bottom Side
            tessellator.addVertexWithUV(11 * pixel / 2, 11 * pixel / 2, 1-11 * pixel / 2, 5 * texturePixel, 5 * texturePixel);
            tessellator.addVertexWithUV(11 * pixel / 2, 11 * pixel / 2, 11 * pixel / 2, 5 * texturePixel, 0 * texturePixel);
            tessellator.addVertexWithUV(1-11 * pixel / 2, 11 * pixel / 2, 11 * pixel / 2, 0 * texturePixel, 0 * texturePixel);
            tessellator.addVertexWithUV(1-11 * pixel / 2, 11 * pixel / 2, 1-11 * pixel / 2, 0* texturePixel, 5 * texturePixel);






        }
        tessellator.draw();
    }
}
