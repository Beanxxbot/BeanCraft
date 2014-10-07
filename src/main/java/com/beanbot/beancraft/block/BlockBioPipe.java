package com.beanbot.beancraft.block;

import com.beanbot.beancraft.creativetab.CreativeTabBC;
import com.beanbot.beancraft.tile.TileEntityBioPipe;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class BlockBioPipe extends BlockContainer
{
    public BlockBioPipe()
    {
        super(Material.wood);
        float pixel = 1F/16F;
        this.setBlockName("beancraft:bioPipe");
        this.setCreativeTab(CreativeTabBC.BC_TAB);
        this.useNeighborBrightness=true;
        this.setBlockBounds(11*pixel/2, 11*pixel/2, 11*pixel/2, 1-11*pixel/2, 1-11*pixel/2, 1-11*pixel/2);
    }

    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z)
    {
        TileEntityBioPipe pipe = (TileEntityBioPipe)world.getTileEntity(x, y, z);

        if(pipe != null)
        {
            float pixel = 1F / 16F;

            float minZ = 11*pixel/2-(pipe.connections[2]!=null?(11*pixel/2):0);
            float maxZ = 1-11*pixel/2+(pipe.connections[4]!=null?(11*pixel/2):0);
            float minX = 11*pixel/2-(pipe.connections[5]!=null?(11*pixel/2):0);
            float maxX = 1-11*pixel/2+(pipe.connections[3]!=null?(11*pixel/2):0);
            float minY = 11*pixel/2-(pipe.connections[1]!=null?(11*pixel/2):0);
            float maxY = 1-11*pixel/2+(pipe.connections[0]!=null?(11*pixel/2):0);

            this.setBlockBounds(minX,minY, minZ, maxX, maxY, maxZ);
        }

        return AxisAlignedBB.getBoundingBox(x + this.minX, y + this.minY, z + this.minZ, x + this.maxX, y + this.maxY, z + this.maxZ);
    }

    public AxisAlignedBB getSelectedBoundingBoxFromPool(World world, int x, int y, int z)
    {
        TileEntityBioPipe pipe = (TileEntityBioPipe)world.getTileEntity(x, y, z);

        if(pipe != null)
        {
            float pixel = 1F / 16F;

            float minZ = 11*pixel/2-(pipe.connections[2]!=null?(11*pixel/2):0);
            float maxZ = 1-11*pixel/2+(pipe.connections[4]!=null?(11*pixel/2):0);
            float minX = 11*pixel/2-(pipe.connections[5]!=null?(11*pixel/2):0);
            float maxX = 1-11*pixel/2+(pipe.connections[3]!=null?(11*pixel/2):0);
            float minY = 11*pixel/2-(pipe.connections[1]!=null?(11*pixel/2):0);
            float maxY = 1-11*pixel/2+(pipe.connections[0]!=null?(11*pixel/2):0);

            this.setBlockBounds(minX,minY, minZ, maxX, maxY, maxZ);
        }

        return AxisAlignedBB.getBoundingBox(x + this.minX, y + this.minY, z + this.minZ, x + this.maxX, y + this.maxY, z + this.maxZ);
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

    public TileEntity createNewTileEntity(World world, int i)
    {
        return new TileEntityBioPipe();
    }

}
