package com.beanbot.beancraft.render;

import com.beanbot.beancraft.model.ModelBioCrystal;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;

public class ItemRendererBioCrystal implements IItemRenderer
{
    protected ModelBioCrystal modelBioCrystal;
    ResourceLocation texture = new ResourceLocation("beancraft", "/textures/models/bioCrystal.png");

    public ItemRendererBioCrystal()
    {
        modelBioCrystal = new ModelBioCrystal();
    }

    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type)
    {
        switch(type)
        {
            case EQUIPPED: return true;
            case EQUIPPED_FIRST_PERSON: return true;
            case ENTITY: return true;
            case INVENTORY: return false;
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

                float scale1 = 1.7F;
                GL11.glScalef(scale1, scale1, scale1);
                GL11.glTranslatef(0.0F, 0.0F, 0.0F);

                modelBioCrystal.render((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);

                GL11.glPopMatrix();
                break;

            case EQUIPPED:

                GL11.glPushMatrix();

                Minecraft.getMinecraft().renderEngine.bindTexture(texture);

                float scale2 = 1.2F;
                GL11.glScalef(scale2, scale2, scale2);
                GL11.glRotatef(0F, 0.0F, 0.0F, 0.0F);
                GL11.glTranslatef(0.55F, 0.35F, 0.0F);

                modelBioCrystal.render((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);

                GL11.glPopMatrix();
                break;

            case EQUIPPED_FIRST_PERSON:
                GL11.glPushMatrix();

                Minecraft.getMinecraft().renderEngine.bindTexture(texture);

                float scale3 = 1.2F;
                GL11.glScalef(scale3, scale3, scale3);
                GL11.glTranslatef(0.55F, 0.35F, 0.0F);

                modelBioCrystal.render((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);

                GL11.glPopMatrix();
                break;

            case INVENTORY:
                break;
            case FIRST_PERSON_MAP:
                break;
            default:
                break;
        }
    }
}