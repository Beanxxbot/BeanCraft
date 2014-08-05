package com.beanbot.beancraft.block;

import com.beanbot.beancraft.creativetab.CreativeTabBC;
import com.beanbot.beancraft.init.ModItems;
import net.minecraft.block.material.Material;

import net.minecraft.item.Item;

import java.util.Random;

public class BlockBCLeaves extends BlockBC
{
    public BlockBCLeaves()
    {
        super(Material.leaves);
        this.setBlockName("bcLeaves");
        this.setBlockTextureName("bcLeaves");
        this.setStepSound(soundTypeGrass);
        this.setHardness(0.3F);
        this.setCreativeTab(CreativeTabBC.BC_TAB);
    }

    public Item getItemDropped(int x, Random random, int z)
    {
        return ModItems.leaf;
    }

    public int quantityDropped(Random random)
    {
        return (random.nextInt(2));
    }
}
