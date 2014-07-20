package com.beanbot.beancraft.block;

import com.beanbot.beancraft.creativetab.CreativeTabBC;
import net.minecraft.block.material.Material;

public class BlockGoldenIngotLeaves extends BlockBC
{
    public BlockGoldenIngotLeaves()
    {
        super(Material.leaves);
        this.setBlockName("goldenIngotLeaves");
        this.setBlockTextureName("goldenIngotLeaves");
        this.setStepSound(soundTypeGrass);
        this.setHardness(0.3F);
        this.setCreativeTab(CreativeTabBC.BC_TAB);
    }
}
