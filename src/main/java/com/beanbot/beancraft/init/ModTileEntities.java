package com.beanbot.beancraft.init;

import com.beanbot.beancraft.render.BlockRendererBioGenerator;
import com.beanbot.beancraft.tile.TileEntityBioGenerator;
import com.beanbot.beancraft.tile.TileEntityBioPipe;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModTileEntities
{
    public static void init()
    {
        GameRegistry.registerTileEntity(TileEntityBioGenerator.class, "tileBioGenerator");
        GameRegistry.registerTileEntity(TileEntityBioPipe.class, "tileBioPipe");

    }

}
