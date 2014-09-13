package com.beanbot.beancraft.block;

import com.beanbot.beancraft.creativetab.CreativeTabBC;
import com.beanbot.beancraft.init.ModItems;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.Random;

public class BlockGoldenLeaves extends BlockBC
{
    public BlockGoldenLeaves()
    {
        super(Material.leaves);
        this.setBlockName("goldenLeaves");
        this.setBlockTextureName("goldenLeaves");
        this.setStepSound(soundTypeGrass);
        this.setHardness(0.5F);
        this.setCreativeTab(CreativeTabBC.BC_TAB);
    }
    public Item getItemDropped(int x, Random random, int z)
    {
        return ModItems.goldenLeaf;
    }

    public int quantityDropped(Random random)
    {
        return (random.nextInt(2));
    }
}
