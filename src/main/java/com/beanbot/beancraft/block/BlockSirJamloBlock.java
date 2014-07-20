package com.beanbot.beancraft.block;

import com.beanbot.beancraft.creativetab.CreativeTabBC;
import net.minecraft.block.material.Material;

public class BlockSirJamloBlock extends BlockBC
{
    public BlockSirJamloBlock()
    {
        super(Material.piston);
        this.setBlockName("sirJamloBlock");
        this.setBlockTextureName("sirJamloBlock");
        this.setHardness(0.4F);
        this.setStepSound(soundTypePiston);
        this.setCreativeTab(CreativeTabBC.BC_BONUS_TAB);
    }

}
