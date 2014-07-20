package com.beanbot.beancraft.init;

import com.beanbot.beancraft.item.*;
import com.beanbot.beancraft.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemBC goldenLeaf = new ItemGoldenLeaf();
    public static final ItemBC leaf = new ItemLeaf();
    public static final ItemBC sirJamlo = new ItemSirJamlo();
    public static final ItemBC goldenChunk = new ItemGoldenChunk();
    public static final ItemBC goldenChunkLeaf = new ItemGoldenChunkLeaf();
    public static final ItemBC goldenIngotLeaf = new ItemGoldenIngotLeaf();

    public static void init()
    {
        GameRegistry.registerItem(goldenLeaf, "goldenLeaf");
        GameRegistry.registerItem(leaf, "leaf");
        GameRegistry.registerItem(sirJamlo, "sirJamlo");
        GameRegistry.registerItem(goldenChunk, "goldenChunk");
        GameRegistry.registerItem(goldenChunkLeaf, "goldenChunkLeaf");
        GameRegistry.registerItem(goldenIngotLeaf, "goldenIngotLeaf");
    }
}
