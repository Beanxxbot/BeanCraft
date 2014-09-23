package com.beanbot.beancraft.client.gui;

import com.beanbot.beancraft.container.ContainerBioGenerator;
import com.beanbot.beancraft.reference.Reference;
import com.beanbot.beancraft.tile.TileEntityBioGenerator;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;

public class GUIBioGenerator extends GuiContainer
{
    public final ResourceLocation texture = new ResourceLocation(Reference.MOD_ID.toLowerCase(), "textures/gui/bioGenerator.png");

    private TileEntityBioGenerator bioGenerator;

    public GUIBioGenerator(InventoryPlayer inventoryPlayer, TileEntityBioGenerator bioGenerator)
    {
        super(new ContainerBioGenerator(inventoryPlayer, bioGenerator));

        this.bioGenerator = bioGenerator;

        this.xSize = 176;
        this.ySize = 166;
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float x, int y, int z)
    {
        Minecraft.getMinecraft().getTextureManager().bindTexture(texture);
        drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);

        int i = this.bioGenerator.getPowerScaled(52);
        drawTexturedModalRect(guiLeft+80, guiTop+28+52-i, 177, 52-i, 16, i);
    }
}
