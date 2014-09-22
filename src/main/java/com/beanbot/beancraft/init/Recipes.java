package com.beanbot.beancraft.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipes
{
    public static void init()
    {

        //Shapeless
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.gold_ingot), new ItemStack(ModItems.goldenChunk), new ItemStack(ModItems.goldenChunk), new ItemStack(ModItems.goldenChunk)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.goldenChunk), "nuggetGold", "nuggetGold", "nuggetGold"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.vineStick), "stickWood", Blocks.vine, Blocks.vine, "bioMaterialTierOne", "bioMaterialTierOne"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.compressedBioMatter), "bioMaterialTierZero", "bioMaterialTierZero", "bioMaterialTierZero", "bioMaterialTierZero", "bioMaterialTierZero", "bioMaterialTierZero", "bioMaterialTierZero", "bioMaterialTierZero", "bioMaterialTierZero"));

        //Shaped
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.bcLeaves), "ll", "ll", 'l', new ItemStack(ModItems.leaf));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.infusedHoe), " ii", "  v", " bv", 'i', "ingotIron", 'v', ModItems.vineStick, 'b', ModItems.bioCrystal));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.infusedHoe), "ii ", " v ", "bv ", 'i', "ingotIron", 'v', ModItems.vineStick, 'b', ModItems.bioCrystal));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.ironBall), " n ", "nin", " n ", 'n', "nuggetIron", 'i', "ingotIron"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.machineCasing, 4), "cyc", "yiy", "cyc", 'i', "ingotIron", 'c', Blocks.cobblestone, 'y', Blocks.stained_hardened_clay));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.machineCasingSlab, 6), "   ", "   ", "mmm", 'm', ModBlocks.machineCasing);
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.machineRod, 4), "   ", " m ", "m  ", 'm', ModBlocks.machineCasing);
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.bioCrystal), "vbv", "bdb", "vbv", 'v', Blocks.vine, 'b', "bioMaterialTierZero", 'd', Items.diamond));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.bioGen), " b ", "rdr", "csc", 'b', ModItems.bioCrystal, 'r', ModItems.machineRod, 'd', Items.diamond, 'c', ModBlocks.machineCasing, 's', ModBlocks.machineCasingSlab);
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.bioMatter), "ooo", "obo", "ooo", 'o', ModBlocks.compressedBioMatter, 'b', ModItems.bioCrystal);

    }
}
