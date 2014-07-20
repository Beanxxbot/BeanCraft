package com.beanbot.beancraft.block;

import com.beanbot.beancraft.creativetab.CreativeTabBC;
import com.beanbot.beancraft.init.ModItems;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

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
}
