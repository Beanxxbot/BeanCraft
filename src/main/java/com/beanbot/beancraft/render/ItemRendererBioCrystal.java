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
    ResourceLocation bioCrystalTexture = new ResourceLocation("beancraft/assets/models/bioCrystal.png");

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
        default: return false;
        }
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper)
    {
        return false;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data)
    {
        switch(type)
        {
            case ENTITY:
                break;
            case EQUIPPED:
            {
                GL11.glPushMatrix();

                Minecraft.getMinecraft().renderEngine.bindTexture(bioCrystalTexture);

                float scale = 1.2F;

                GL11.glScalef(scale, scale, scale);

                GL11.glRotatef(0F, 0.0F, 0.0F, 0.0F);

                GL11.glTranslatef(0.65F, 0.35F, 0.0F);

                modelBioCrystal.render((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);

                GL11.glPopMatrix();
            }
            case EQUIPPED_FIRST_PERSON:
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
