package com.beanbot.beancraft.block;

import com.beanbot.beancraft.creativetab.CreativeTabBC;
import com.beanbot.beancraft.init.ModItems;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockChunkyDirt extends BlockBC
{
    public BlockChunkyDirt()
    {
        super(Material.ground);
        this.setBlockName("chunkyDirt");
        this.setBlockTextureName("chunkyDirt");
        this.setStepSound(soundTypeGravel);
        this.setHardness(0.8F);
        this.setCreativeTab(CreativeTabBC.BC_TAB);
    }

    public Item getItemDropped(int par1, Random random, int par2)
    {
        return ModItems.ironNugget;
    }

    public int quantityDropped(Random random)
    {
        return (random.nextInt(4) + 1);
    }
}
