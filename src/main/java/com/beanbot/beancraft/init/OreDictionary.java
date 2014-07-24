package com.beanbot.beancraft.init;

import net.minecraft.item.ItemStack;

public class OreDictionary
{
    public static void init()
    {
        net.minecraftforge.oredict.OreDictionary.registerOre("nuggetIron", new ItemStack(ModItems.ironNugget));
    }
}
