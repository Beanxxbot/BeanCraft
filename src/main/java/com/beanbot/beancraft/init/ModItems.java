package com.beanbot.beancraft.init;

import com.beanbot.beancraft.creativetab.CreativeTabBC;
import com.beanbot.beancraft.item.*;
import com.beanbot.beancraft.item.bauble.BaubleCrystalAmulet;
import com.beanbot.beancraft.item.bauble.ItemBauble;
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
    public static final ItemBC infusedHoeOne = new ItemInfusedHoeOne();
    public static final ItemBC vineStick = new ItemVineStick();
    public static final ItemBC ironBall = new ItemIronBall();
    public static final ItemBC ironNugget = new ItemIronNugget();
    public static final ItemBC dirtChunk = new ItemDirtChunk();
    public static final ItemBC ironChunk = new ItemIronChunk();
    public static final ItemBC ironNuggetDirt = new ItemIronNuggetDirt();
    public static final ItemBC ironChunkDirt = new ItemIronChunkDirt();
    public static final ItemBC ironIngotDirt = new ItemIronIngotDirt();
    public static final ItemBC bioCrystal = new ItemBioCrystal();
    public static final ItemBC machineRod = new ItemMachineRod();
    public static final ItemBC bioMatter = new ItemBioMatter();
    public static final ItemBC solarElixir = new ItemSolarElixir();
    public static final ItemBC diamondNugget = new ItemDiamondNugget();
    public static final ItemBC diamondChunk = new ItemDiamondChunk();
    public static final ItemBC quartzNugget = new ItemQuartzNugget();
    public static final ItemBC quartzChunk = new ItemQuartzChunk();
    public static final ItemBC coalNugget = new ItemCoalNugget();
    public static final ItemBC coalChunk = new ItemCoalChunk();
    public static final ItemBauble crystalAmulet = new BaubleCrystalAmulet();
    public static final ItemBC bioPowder = new ItemBioPowder();

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
        //GameRegistry.registerItem(ironBall, "ironBall");
        GameRegistry.registerItem(ironNugget, "ironNugget");
        GameRegistry.registerItem(ironChunk, "ironChunk");
        GameRegistry.registerItem(dirtChunk, "dirtChunk");
        GameRegistry.registerItem(ironNuggetDirt, "ironNuggetDirt");
        GameRegistry.registerItem(ironChunkDirt, "ironChunkDirt");
        GameRegistry.registerItem(ironIngotDirt, "ironIngotDirt");
        GameRegistry.registerItem(infusedHoeOne, "infusedHoeOne");
        GameRegistry.registerItem(bioCrystal, "bioCrystal");
        GameRegistry.registerItem(machineRod, "machineRod");
        GameRegistry.registerItem(bioMatter, "bioMatter");
        //GameRegistry.registerItem(solarElixir, "solarElixir");
        GameRegistry.registerItem(diamondNugget, "diamondNugget");
        GameRegistry.registerItem(diamondChunk, "diamondChunk");
        GameRegistry.registerItem(quartzNugget, "quartzNugget");
        GameRegistry.registerItem(quartzChunk, "quartzChunk");
        GameRegistry.registerItem(coalNugget, "coalNugget");
        GameRegistry.registerItem(coalChunk, "coalChunk");
        GameRegistry.registerItem(crystalAmulet, "bioCrystalAmulet");
        GameRegistry.registerItem(bioPowder, "bioPowder");

    }
}
