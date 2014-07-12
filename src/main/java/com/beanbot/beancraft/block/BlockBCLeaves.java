package com.beanbot.beancraft.block;

import com.beanbot.beancraft.creativetab.CreativeTabBC;
import net.minecraft.block.material.Material;

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
}
