package com.beanbot.beancraft.block;

import com.beanbot.beancraft.creativetab.CreativeTabBC;
import net.minecraft.block.material.Material;

public class BlockGoldenChunkLeaves extends BlockBC
{
    public BlockGoldenChunkLeaves()
    {
        super(Material.leaves);
        this.setBlockName("goldenChunkLeaves");
        this.setBlockTextureName("goldenChunkLeaves");
        this.setStepSound(soundTypeGrass);
        this.setHardness(0.3F);
        this.setCreativeTab(CreativeTabBC.BC_TAB);
    }
}
