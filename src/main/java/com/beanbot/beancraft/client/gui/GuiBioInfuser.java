package com.beanbot.beancraft.client.gui;

import com.beanbot.beancraft.container.ContainerBioInfuser;
import com.beanbot.beancraft.reference.Reference;
import com.beanbot.beancraft.tile.TileEntityBioInfuser;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;

public class GuiBioInfuser extends GuiContainer
{
    private TileEntityBioInfuser bioInfuser;

    public final ResourceLocation texture = new ResourceLocation(Reference.MOD_ID.toLowerCase(), "textures/gui/bioInfuser.png");

    public GuiBioInfuser(InventoryPlayer inventoryPlayer, TileEntityBioInfuser bioInfuser)
    {
        super(new ContainerBioInfuser(inventoryPlayer, bioInfuser));

        this.bioInfuser = bioInfuser;

        this.xSize = 176;
        this.ySize = 166;
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float x, int y_, int z)
    {
        Minecraft.getMinecraft().getTextureManager().bindTexture(texture);
        drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);

    }
}
