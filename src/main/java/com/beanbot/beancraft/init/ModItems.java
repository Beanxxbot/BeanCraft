package com.beanbot.beancraft.init;

import com.beanbot.beancraft.item.*;
import com.beanbot.beancraft.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemBC goldenLeaf = new ItemGoldenLeaf();
    public static final ItemBC leaf = new ItemLeaf();
    public static final ItemBC sirJamlo = new ItemSirJamlo();
    public static final ItemBC goldenChunk = new ItemGoldenChunk();
    public static final ItemBC goldenChunkLeaf = new ItemGoldenChunkLeaf();
    public static final ItemBC goldenIngotLeaf = new ItemGoldenIngotLeaf();
    public static final ItemBC infusedHoe = new ItemInfusedHoe();
    public static final ItemBC vineStick = new ItemVineStick();
    public static final ItemBC ironBall = new ItemIronBall();
    public static final ItemBC ironNugget = new ItemIronNugget();

    public static void init()
    {
        GameRegistry.registerItem(goldenLeaf, "goldenLeaf");
        GameRegistry.registerItem(leaf, "leaf");
        GameRegistry.registerItem(sirJamlo, "sirJamlo");
        GameRegistry.registerItem(goldenChunk, "goldenChunk");
        GameRegistry.registerItem(goldenChunkLeaf, "goldenChunkLeaf");
        GameRegistry.registerItem(goldenIngotLeaf, "goldenIngotLeaf");
        GameRegistry.registerItem(infusedHoe, "infusedHoe");
        GameRegistry.registerItem(vineStick, "vineStick");
        GameRegistry.registerItem(ironBall, "ironBall");
        GameRegistry.registerItem(ironNugget, "ironNugget");

    }
}
