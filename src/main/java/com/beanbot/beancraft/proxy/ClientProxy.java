package com.beanbot.beancraft.proxy;

import com.beanbot.beancraft.init.ModItems;
import com.beanbot.beancraft.render.ItemRendererBioCrystal;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy
{
    public static void initMod()
    {
        MinecraftForgeClient.registerItemRenderer(ModItems.bioCrystal, new ItemRendererBioCrystal());
    }
}
