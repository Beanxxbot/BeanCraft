package com.beanbot.beancraft.init;

import com.beanbot.beancraft.block.BlockBC;
import com.beanbot.beancraft.block.BlockGoldenLeaves;
import com.beanbot.beancraft.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockBC goldenLeaves = new BlockGoldenLeaves();

    public static void init()
    {
        GameRegistry.registerBlock(goldenLeaves, "goldenLeaves");
    }

}
