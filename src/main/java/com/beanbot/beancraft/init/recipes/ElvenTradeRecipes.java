package com.beanbot.beancraft.init.recipes;

import com.beanbot.beancraft.init.ModItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import vazkii.botania.api.BotaniaAPI;
import vazkii.botania.api.recipe.RecipeElvenTrade;

public class ElvenTradeRecipes
{
    public static RecipeElvenTrade hoeTierOneRecipe;
    public static RecipeElvenTrade ironNugget;
    public static RecipeElvenTrade ironChunk;
    public static RecipeElvenTrade ironIngot;
    public static RecipeElvenTrade goldNugget;
    public static RecipeElvenTrade goldChunk;
    public static RecipeElvenTrade goldIngot;

    public static void init()
    {
        hoeTierOneRecipe = BotaniaAPI.registerElvenTradeRecipe(new ItemStack(ModItems.infusedHoeOne, 1, 0), new ItemStack(ModItems.infusedHoe));

        ironNugget = BotaniaAPI.registerElvenTradeRecipe(new ItemStack(ModItems.ironNugget, 1, 0), new ItemStack(ModItems.ironNuggetDirt));
        ironChunk = BotaniaAPI.registerElvenTradeRecipe(new ItemStack(ModItems.ironChunk, 1, 0), new ItemStack(ModItems.ironChunkDirt));
        ironIngot = BotaniaAPI.registerElvenTradeRecipe(new ItemStack(Items.iron_ingot, 1, 0), new ItemStack(ModItems.ironIngotDirt));

        goldNugget = BotaniaAPI.registerElvenTradeRecipe(new ItemStack(Items.gold_nugget, 1, 0), new ItemStack(ModItems.goldenLeaf));
        goldChunk = BotaniaAPI.registerElvenTradeRecipe(new ItemStack(ModItems.goldenChunk, 1, 0), new ItemStack(ModItems.goldenChunkLeaf));
        goldIngot = BotaniaAPI.registerElvenTradeRecipe(new ItemStack(Items.gold_ingot, 1, 0), new ItemStack(ModItems.goldenIngotLeaf));

    }
}
