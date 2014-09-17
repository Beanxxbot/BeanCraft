package com.beanbot.beancraft.init;

import com.beanbot.beancraft.block.*;
import com.beanbot.beancraft.reference.Reference;
import com.beanbot.beancraft.render.BlockRendererBioGenerator;
import com.beanbot.beancraft.tile.TileEntityBioGenerator;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.BlockSapling;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockBC goldenLeaves = new BlockGoldenLeaves();
    public static final BlockBC bcLeaves = new BlockBCLeaves();
    public static final BlockBC sirJamloBlock = new BlockSirJamloBlock();
    public static final BlockBC goldenChunkLeaves = new BlockGoldenChunkLeaves();
    public static final BlockBC goldenIngotLeaves = new BlockGoldenIngotLeaves();
    public static final BlockBC chunkyDirt = new BlockChunkyDirt();
    public static final BlockSapling beanSapling = new BlockBCSapling();
    public static final BlockBCCrop nuggetDirt = new BlockNuggetDirt();
    public static final BlockBC machineCasing = new BlockMachineCasing();
    public static final BlockBCSlab machineCasingSlab = new BlockMachineCasingSlab(false);
    public static final BlockBCSlab machineCasingSlabFull = new BlockMachineCasingSlab(true);
    public static final BlockBCContainer bioGen = new BlockBioGenerator();



    public static void init()
    {
        //Normal Blocks
        GameRegistry.registerBlock(goldenLeaves, "goldenLeaves");
        GameRegistry.registerBlock(bcLeaves, "bcLeaves");
        GameRegistry.registerBlock(sirJamloBlock, "sirJamloBlock");
        GameRegistry.registerBlock(goldenChunkLeaves, "goldenChunkLeaves");
        GameRegistry.registerBlock(goldenIngotLeaves, "goldenIngotLeaves");
        GameRegistry.registerBlock(chunkyDirt, "chunkyDirt");
        GameRegistry.registerBlock(beanSapling, "beanSapling");
        GameRegistry.registerBlock(nuggetDirt, "nuggetDirt");
        GameRegistry.registerBlock(machineCasing, "machineCasing");
        GameRegistry.registerBlock(machineCasingSlab, "machineCasingSlab");
        GameRegistry.registerBlock(machineCasingSlabFull, "machineCasingSlabFull");
        GameRegistry.registerBlock(bioGen, "bioGen");
    }

}
