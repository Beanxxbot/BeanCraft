package com.beanbot.beancraft.init;

import com.beanbot.beancraft.tile.TileEntityBioGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModTileEntities
{
    public static void init()
    {
        GameRegistry.registerTileEntity(TileEntityBioGenerator.class, "bioGenerator");
    }

}
