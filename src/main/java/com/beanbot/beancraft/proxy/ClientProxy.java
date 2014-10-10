package com.beanbot.beancraft.proxy;

import com.beanbot.beancraft.init.ModBlocks;
import com.beanbot.beancraft.init.ModItems;
import com.beanbot.beancraft.render.*;
import com.beanbot.beancraft.tile.TileEntityBioExtractor;
import com.beanbot.beancraft.tile.TileEntityBioGenerator;
import com.beanbot.beancraft.tile.TileEntityBioInfuser;
import com.beanbot.beancraft.tile.TileEntityBioPipe;
import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy
{
    public static void initMod()
    {
        MinecraftForgeClient.registerItemRenderer(ModItems.bioCrystal, new ItemRendererBioCrystal());
        MinecraftForgeClient.registerItemRenderer(ModItems.infusedHoe, new ItemRendererInfusedHoe());
        MinecraftForgeClient.registerItemRenderer(ModItems.infusedHoeOne, new ItemRendererInfusedHoe());

        TileEntitySpecialRenderer render = new BlockRendererBioGenerator();
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.bioGen), new ItemRendererBioGenerator(render, new TileEntityBioGenerator()));

        TileEntitySpecialRenderer render1 = new BlockRendererBioInfuser();
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.bioInfuser), new ItemRendererBioInfuser(render1, new TileEntityBioInfuser()));

        TileEntitySpecialRenderer render2 = new BlockRendererBioExtractor();
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.bioExtractor), new ItemRendererBioExtractor(render2, new TileEntityBioExtractor()));

        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBioGenerator.class, new BlockRendererBioGenerator());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBioInfuser.class, new BlockRendererBioInfuser());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBioExtractor.class, new BlockRendererBioExtractor());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBioPipe.class, new TileEntityRendererPipe());
    }
}
