package com.beanbot.beancraft.init.recipes;

import com.beanbot.beancraft.BeanCraft;
import com.beanbot.beancraft.init.ModItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BioInfuserRecipes
{
    public BioInfuserRecipes()
    {

    }

    public static ItemStack getInfusionResults(Item item, Item item2)
    {
        return getOutput(item, item2);
    }

    public static ItemStack getOutput(Item item, Item item2)
    {
        if (item == ModItems.infusedHoe && item2 == ModItems.dirtChunk || item2 == ModItems.infusedHoe && item == ModItems.dirtChunk)
        {
            return  new ItemStack(ModItems.infusedHoeOne);
        }
        return null;
    }
}
