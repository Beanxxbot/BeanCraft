package com.beanbot.beancraft.proxy;

import com.beanbot.beancraft.init.ModItems;
import com.beanbot.beancraft.render.BlockRendererBioGenerator;
import com.beanbot.beancraft.render.ItemRendererBioCrystal;
import com.beanbot.beancraft.tile.TileEntityBioGenerator;
import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy
{
    public static void initMod()
    {
        MinecraftForgeClient.registerItemRenderer(ModItems.bioCrystal, new ItemRendererBioCrystal());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBioGenerator.class, new BlockRendererBioGenerator());
    }
}
