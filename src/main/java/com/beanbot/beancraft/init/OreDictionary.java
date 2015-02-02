package com.beanbot.beancraft.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import static net.minecraftforge.oredict.OreDictionary.registerOre;

public class OreDictionary
{
    public static final int WILDCARD_VALUE = Short.MAX_VALUE;

    public static void init()
    {
        registerOre("nuggetIron", new ItemStack(ModItems.ironNugget));
        registerOre("nuggetCoal", new ItemStack(ModItems.coalNugget));
        registerOre("nuggetQuartz", new ItemStack(ModItems.quartzNugget));
        registerOre("nuggetDiamond", new ItemStack(ModItems.diamondNugget));

        registerOre("bioMaterialTierOne", new ItemStack(ModItems.leaf));
        registerOre("bioMaterialTierOne", new ItemStack(ModItems.bioMatter));
        registerOre("bioMaterialTierOne", new ItemStack(ModItems.dirtChunk));

        registerOre("bioMaterialTierZero", new ItemStack(Blocks.leaves, 1, WILDCARD_VALUE));
        registerOre("bioMaterialTierZero", new ItemStack(Blocks.leaves2, 1, WILDCARD_VALUE));
        registerOre("bioMaterialTierZero", new ItemStack(Blocks.sapling, 1, WILDCARD_VALUE));
        registerOre("bioMaterialTierZero", new ItemStack(Blocks.tallgrass, 1, WILDCARD_VALUE));
        registerOre("bioMaterialTierZero", new ItemStack(Blocks.double_plant, 1, WILDCARD_VALUE));
        registerOre("bioMaterialTierZero", new ItemStack(Blocks.red_flower, 1, WILDCARD_VALUE));
        registerOre("bioMaterialTierZero", new ItemStack(Blocks.yellow_flower, 1, WILDCARD_VALUE));
        registerOre("bioMaterialTierZero", new ItemStack(Items.wheat, 1, WILDCARD_VALUE));
        registerOre("bioMaterialTierZero", new ItemStack(Items.carrot, 1, WILDCARD_VALUE));
        registerOre("bioMaterialTierZero", new ItemStack(Items.potato, 1, WILDCARD_VALUE));
        registerOre("bioMaterialTierZero", new ItemStack(Items.wheat_seeds, 1, WILDCARD_VALUE));
        registerOre("bioMaterialTierZero", new ItemStack(Items.reeds, 1, WILDCARD_VALUE));
        registerOre("bioMaterialTierZero", new ItemStack(Items.apple, 1, WILDCARD_VALUE));


    }
}
