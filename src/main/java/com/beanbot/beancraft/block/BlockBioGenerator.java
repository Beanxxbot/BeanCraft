package com.beanbot.beancraft.block;

import com.beanbot.beancraft.tile.TileEntityBioGenerator;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockBioGenerator extends BlockBCContainer
{
    private float pixel = 1F/16F;

    public BlockBioGenerator()
    {
        super(Material.anvil);
        this.setBlockName("bioGen");
        this.setBlockTextureName("bioGen");
        this.setStepSound(soundTypeAnvil);
        this.setBlockBounds(0.0625F, 0.0F, 0.0625F, 0.9375F, 0.875F, 0.9375F);
    }

    public TileEntity createNewTileEntity(World world, int i)
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
