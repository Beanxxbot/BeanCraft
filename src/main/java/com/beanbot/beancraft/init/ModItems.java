package com.beanbot.beancraft.init;

import com.beanbot.beancraft.item.ItemBC;
import com.beanbot.beancraft.item.ItemGoldenLeaf;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemBC goldenLeaf = new ItemGoldenLeaf();

    public static void init()
    {
        GameRegistry.registerItem(goldenLeaf, "goldenLeaf");
    }
}
