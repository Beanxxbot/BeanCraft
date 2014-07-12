package com.beanbot.beancraft.init;

import com.beanbot.beancraft.item.ItemBC;
import com.beanbot.beancraft.item.ItemGoldenLeaf;
import com.beanbot.beancraft.item.ItemLeaf;
import com.beanbot.beancraft.item.ItemSirJamlo;
import com.beanbot.beancraft.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemBC goldenLeaf = new ItemGoldenLeaf();
    public static final ItemBC leaf = new ItemLeaf();
    public static final ItemBC sirJamlo = new ItemSirJamlo();

    public static void init()
    {
        GameRegistry.registerItem(goldenLeaf, "goldenLeaf");
        GameRegistry.registerItem(leaf, "leaf");
        GameRegistry.registerItem(sirJamlo, "sirJamlo");
    }
}
