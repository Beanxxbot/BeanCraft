package com.beanbot.beancraft.render;

import com.beanbot.beancraft.model.ModelBioGen;
import com.beanbot.beancraft.tile.TileEntityBioGenerator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;

public class ItemRendererBioGenerator implements IItemRenderer
{

    //private ModelBioGen model;
    private TileEntitySpecialRenderer render;
    private TileEntity dummytile;

    public ItemRendererBioGenerator(TileEntitySpecialRenderer render, TileEntity dummy)
    {
        //model = new ModelBioGen();
        this.render = render;
        this.dummytile = dummy;
    }

    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) {
        //switch(type)
        //{
            //case EQUIPPED: return true;
            //case EQUIPPED_FIRST_PERSON: return true;
            //case ENTITY: return true;
            //case INVENTORY: return true;
            return true;
        //}
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
        return helper == ItemRendererHelper.INVENTORY_BLOCK || helper == ItemRendererHelper.ENTITY_BOBBING || helper == ItemRendererHelper.ENTITY_ROTATION;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
        if (type == ItemRenderType.ENTITY)
            GL11.glTranslatef(-0.5F, 0.0F, -0.5F);
        this.render.renderTileEntityAt(this.dummytile, 0.0D, 0.0D, 0.0D, 0.0F);
    }
}
