package com.beanbot.beancraft.block;

import com.beanbot.beancraft.tile.TileEntityBioGenerator;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockBioGenerator extends BlockBC
{
    public BlockBioGenerator()
    {
        super(Material.anvil);
        this.setBlockName("bioGen");
        this.setBlockTextureName("bioGen");
    }

    public TileEntity createNewTileEntity(World world)
    {
        return new TileEntityBioGenerator();
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
