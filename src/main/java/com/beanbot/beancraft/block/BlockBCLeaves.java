package com.beanbot.beancraft.block;

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
    }
}
