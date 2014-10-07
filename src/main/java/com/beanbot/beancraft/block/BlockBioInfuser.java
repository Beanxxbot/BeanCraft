package com.beanbot.beancraft.block;

import com.beanbot.beancraft.creativetab.CreativeTabBC;
import com.beanbot.beancraft.tile.TileEntityBioInfuser;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockBioInfuser extends BlockBCContainer
{
    public BlockBioInfuser()
    {
        super(Material.anvil);
        this.setBlockName("bioInfuser");
        this.setBlockTextureName("bioInfuser");
        this.setStepSound(soundTypeAnvil);
        this.setCreativeTab(CreativeTabBC.BC_TAB);
    }

    public TileEntity createNewTileEntity(World world, int i)
    {
        return new TileEntityBioInfuser();
    }

    public int getRenderType()
    {
        return -1;
    }

    public boolean isOpaqueCube()
    {
        return false;
    }

    public boolean renderAsNormalBlock()
    {
        return false;
    }
}
