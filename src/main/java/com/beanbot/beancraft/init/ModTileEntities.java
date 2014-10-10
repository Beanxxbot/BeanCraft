package com.beanbot.beancraft.init;

import com.beanbot.beancraft.render.BlockRendererBioGenerator;
import com.beanbot.beancraft.tile.TileEntityBioExtractor;
import com.beanbot.beancraft.tile.TileEntityBioGenerator;
import com.beanbot.beancraft.tile.TileEntityBioInfuser;
import com.beanbot.beancraft.tile.TileEntityBioPipe;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModTileEntities
{
    public static void init()
    {
        GameRegistry.registerTileEntity(TileEntityBioGenerator.class, "tileBioGenerator");
        GameRegistry.registerTileEntity(TileEntityBioInfuser.class, "tileBioInfuser");
        GameRegistry.registerTileEntity(TileEntityBioExtractor.class, "tileBioExtractor");
        GameRegistry.registerTileEntity(TileEntityBioPipe.class, "tileBioPipe");

    }

}
