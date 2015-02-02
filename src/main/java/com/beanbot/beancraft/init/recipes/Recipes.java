package com.beanbot.beancraft.init.recipes;

import com.beanbot.beancraft.init.ModBlocks;
import com.beanbot.beancraft.init.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.ShapelessRecipes;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipes
{
    public static void init()
    {

        //Shapeless
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.vineStick), "stickWood", Blocks.vine, Blocks.vine, "bioMaterialTierOne", "bioMaterialTierOne"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.compressedBioMatter), "bioMaterialTierZero", "bioMaterialTierZero", "bioMaterialTierZero", "bioMaterialTierZero", "bioMaterialTierZero", "bioMaterialTierZero", "bioMaterialTierZero", "bioMaterialTierZero", "bioMaterialTierZero"));
        //GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.solarElixir), "bioMaterialTierOne", Blocks.double_plant, Items.potionitem, Items.diamond));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.bioPowder, 16), new ItemStack(Items.flint), new ItemStack(ModItems.bioCrystal)));

        //Shaped
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.bcLeaves), "ll", "ll", 'l', new ItemStack(ModItems.leaf));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.infusedHoe), " ii", "  v", " bv", 'i', "ingotIron", 'v', ModItems.vineStick, 'b', ModItems.bioCrystal));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.infusedHoe), "ii ", " v ", "bv ", 'i', "ingotIron", 'v', ModItems.vineStick, 'b', ModItems.bioCrystal));
        //GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.ironBall), " n ", "nin", " n ", 'n', "nuggetIron", 'i', "ingotIron"));
        //GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.machineCasing, 4), "cyc", "yiy", "cyc", 'i', "ingotIron", 'c', Blocks.cobblestone, 'y', Blocks.stained_hardened_clay));
        //GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.machineCasingSlab, 6), "   ", "   ", "mmm", 'm', ModBlocks.machineCasing);
        //GameRegistry.addShapedRecipe(new ItemStack(ModItems.machineRod, 4), "   ", " m ", "m  ", 'm', ModBlocks.machineCasing);
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.bioCrystal), "vbv", "bdb", "vbv", 'v', Blocks.vine, 'b', "bioMaterialTierZero", 'd', ModItems.diamondChunk));
        //GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.bioGen), " b ", "rdr", "csc", 'b', ModItems.bioCrystal, 'r', ModItems.machineRod, 'd', ModItems.solarElixir, 'c', ModBlocks.machineCasing, 's', ModBlocks.machineCasingSlab);
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.bioMatter), "ooo", "obo", "ooo", 'o', ModBlocks.compressedBioMatter, 'b', ModItems.bioCrystal);
        //GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.bioInfuser), "pcp", "msm", "mmm", 'p', ModBlocks.bioPipe, 'c', ModItems.bioCrystal, 'm', ModBlocks.machineCasing, 's', ModBlocks.machineCasingSlab);
        //GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.bioPipe), "vvv", "pcp", "vvv", 'v', ModItems.vineStick, 'p', "plankWood", 'c', ModItems.bioCrystal));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.beanSapling), "bbb", "bsb", "bbb", 'b', ModItems.bioPowder, 's', "treeSapling"));

        //Ingots & Nuggets
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.gold_ingot), new ItemStack(ModItems.goldenChunk), new ItemStack(ModItems.goldenChunk), new ItemStack(ModItems.goldenChunk)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.goldenChunk), "nuggetGold", "nuggetGold", "nuggetGold"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.diamond), new ItemStack(ModItems.diamondChunk), new ItemStack(ModItems.diamondChunk), new ItemStack(ModItems.diamondChunk)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.diamondChunk), "nuggetDiamond", "nuggetDiamond", "nuggetDiamond"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.diamond), "nuggetDiamond", "nuggetDiamond", "nuggetDiamond", "nuggetDiamond", "nuggetDiamond", "nuggetDiamond", "nuggetDiamond", "nuggetDiamond", "nuggetDiamond"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.quartz), new ItemStack(ModItems.quartzChunk), new ItemStack(ModItems.quartzChunk), new ItemStack(ModItems.quartzChunk)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.quartzChunk), "nuggetQuartz", "nuggetQuartz", "nuggetQuartz"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.quartz), "nuggetQuartz", "nuggetQuartz", "nuggetQuartz", "nuggetQuartz", "nuggetQuartz", "nuggetQuartz", "nuggetQuartz", "nuggetQuartz", "nuggetQuartz"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.coal), new ItemStack(ModItems.coalChunk), new ItemStack(ModItems.coalChunk), new ItemStack(ModItems.coalChunk)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.coalChunk), "nuggetCoal", "nuggetCoal", "nuggetCoal"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.coal), "nuggetCoal", "nuggetCoal", "nuggetCoal", "nuggetCoal", "nuggetCoal", "nuggetCoal", "nuggetCoal", "nuggetCoal", "nuggetCoal"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.iron_ingot), new ItemStack(ModItems.ironChunk), new ItemStack(ModItems.ironChunk), new ItemStack(ModItems.ironChunk)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.ironChunk), "nuggetIron", "nuggetIron", "nuggetIron"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.iron_ingot), "nuggetIron", "nuggetIron", "nuggetIron", "nuggetIron", "nuggetIron", "nuggetIron", "nuggetIron", "nuggetIron", "nuggetIron"));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.diamondNugget, 9), Items.diamond );
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.coalNugget, 9), Items.coal );
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.quartzNugget, 9), Items.quartz );
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ironNugget, 9), Items.iron_ingot );
    }
}
