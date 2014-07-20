package com.beanbot.beancraft.init;

import com.beanbot.beancraft.block.*;
import com.beanbot.beancraft.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockBC goldenLeaves = new BlockGoldenLeaves();
    public static final BlockBC bcLeaves = new BlockBCLeaves();
    public static final BlockBC sirJamloBlock = new BlockSirJamloBlock();
    public static final BlockBC goldenChunkLeaves = new BlockGoldenChunkLeaves();
    public static final BlockBC goldenIngotLeaves = new BlockGoldenIngotLeaves();

    public static void init()
    {
        GameRegistry.registerBlock(goldenLeaves, "goldenLeaves");
        GameRegistry.registerBlock(bcLeaves, "bcLeaves");
        GameRegistry.registerBlock(sirJamloBlock, "sirJamloBlock");
        GameRegistry.registerBlock(goldenChunkLeaves, "goldenChunkLeaves");
        GameRegistry.registerBlock(goldenIngotLeaves, "goldenIngotLeaves");
    }

}
