package com.beanbot.beancraft.proxy;

import com.beanbot.beancraft.init.ModBlocks;
import com.beanbot.beancraft.init.ModItems;
import com.beanbot.beancraft.render.BlockRendererBioGenerator;
import com.beanbot.beancraft.render.ItemRendererBioCrystal;
import com.beanbot.beancraft.render.ItemRendererBioGenerator;
import com.beanbot.beancraft.render.ItemRendererInfusedHoe;
import com.beanbot.beancraft.tile.TileEntityBioGenerator;
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
    }
}
