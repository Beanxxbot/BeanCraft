package com.beanbot.beancraft.block;

import com.beanbot.beancraft.creativetab.CreativeTabBC;
import net.minecraft.block.material.Material;

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
