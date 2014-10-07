package com.beanbot.beancraft.render;

import com.beanbot.beancraft.model.ModelBioCrystal;
import com.beanbot.beancraft.model.ModelInfusedHoe;
import com.beanbot.beancraft.reference.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;

public class ItemRendererInfusedHoe implements IItemRenderer
{
    protected ModelInfusedHoe modelInfusedHoe;
    private static final ResourceLocation texture = new ResourceLocation(Reference.MOD_ID.toLowerCase(), "/textures/models/infusedHoe.png");

    public ItemRendererInfusedHoe()
    {
        modelInfusedHoe = new ModelInfusedHoe();
    }

    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type)
    {
        switch(type)
        {
            case EQUIPPED: return true;
            case EQUIPPED_FIRST_PERSON: return true;
            case ENTITY: return true;
            case INVENTORY: return true;
            default: return false;
        }
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper)
    {
        return helper == ItemRendererHelper.INVENTORY_BLOCK || helper == ItemRendererHelper.ENTITY_BOBBING || helper == ItemRendererHelper.ENTITY_ROTATION;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data)
    {
        switch(type)
        {
            case ENTITY:
                GL11.glPushMatrix();

                Minecraft.getMinecraft().renderEngine.bindTexture(texture);

                float scale1 = 1.0F;
                GL11.glScalef(scale1, scale1, scale1);
                GL11.glTranslatef(0.0F, 1.0F, 0.0F);
                GL11.glRotatef(-180F, 1.0F, 0.0F, 0.0F);

                modelInfusedHoe.renderModel(0.0625F);

                GL11.glPopMatrix();
                break;

            case EQUIPPED:

                GL11.glPushMatrix();

                Minecraft.getMinecraft().renderEngine.bindTexture(texture);

                float scale2 = 1.2F;
                GL11.glScalef(scale2, scale2, scale2);
                GL11.glRotatef(180F, 0.0F, 0.0F, 0.0F);
                GL11.glRotatef(90F, 0.0F, 0.0F, 1.0F);
                GL11.glRotatef(90F, 0.0F, 1.0F, 0.0F);
                GL11.glRotatef(45F, 1.0F, 0.0F, 0.0F);
                GL11.glTranslatef(0.0F, -0.5F, -0.5F);

                modelInfusedHoe.renderModel(0.0625F);

                GL11.glPopMatrix();
                break;

            case EQUIPPED_FIRST_PERSON:
                GL11.glPushMatrix();

                Minecraft.getMinecraft().renderEngine.bindTexture(texture);

                float scale3 = 1.2F;
                GL11.glScalef(scale3, scale3, scale3);
                GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
                GL11.glRotatef(90F, 0.0F, 0.0F, 1.0F);
                GL11.glRotatef(90F, 0.0F, 1.0F, 0.0F);
                GL11.glRotatef(45F, 1.0F, 0.0F, 0.0F);
                GL11.glTranslatef(0.0F, -0.75F, -0.5F);

                modelInfusedHoe.renderModel(0.0625F);

                GL11.glPopMatrix();
                break;

            case INVENTORY:
                GL11.glPushMatrix();

                Minecraft.getMinecraft().renderEngine.bindTexture(texture);

                float scale4 = 1.1F;
                GL11.glScalef(scale4, scale4, scale4);
                GL11.glTranslatef(0.0F, 0.5F, -0.2F);
                GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
                GL11.glRotatef(-90F, 0.0F, 1.0F, 0.0F);

                modelInfusedHoe.renderModel(0.0625F);

                GL11.glPopMatrix();
                break;
            case FIRST_PERSON_MAP:
                break;
            default:
                break;
        }
    }
}