package com.beanbot.beancraft.init;

import com.beanbot.beancraft.item.ItemBC;
import com.beanbot.beancraft.item.ItemGoldenLeaf;
import com.beanbot.beancraft.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemBC goldenLeaf = new ItemGoldenLeaf();

    public static void init()
    {
        GameRegistry.registerItem(goldenLeaf, "goldenLeaf");
    }
}
