package com.beanbot.beancraft.client.gui;

import com.beanbot.beancraft.container.ContainerBioExtractor;
import com.beanbot.beancraft.reference.Reference;
import com.beanbot.beancraft.tile.TileEntityBioExtractor;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

public class GuiBioExtractor extends GuiContainer{
    private TileEntityBioExtractor bioExtractor;

    public final ResourceLocation texture = new ResourceLocation(Reference.MOD_ID.toLowerCase(), "textures/gui/bioExtractor.png");

    public GuiBioExtractor(InventoryPlayer inventoryPlayer, TileEntityBioExtractor bioExtractor)
    {
        super(new ContainerBioExtractor(inventoryPlayer, bioExtractor));

        this.bioExtractor = bioExtractor;

        this.xSize = 176;
        this.ySize = 166;
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float x, int y, int z)
    {
        Minecraft.getMinecraft().getTextureManager().bindTexture(texture);
        drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);

    }
}
