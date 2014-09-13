package com.beanbot.beancraft.block;

import com.beanbot.beancraft.creativetab.CreativeTabBC;
import net.minecraft.block.material.Material;

public class BlockMachineCasing extends BlockBC
{
    public BlockMachineCasing()
    {
        super(Material.iron);
        this.setBlockName("machineCasing");
        this.setBlockTextureName("machineCasing");
        this.setCreativeTab(CreativeTabBC.BC_TAB);
    }
}
