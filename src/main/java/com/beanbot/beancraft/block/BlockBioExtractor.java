package com.beanbot.beancraft.block;

import com.beanbot.beancraft.creativetab.CreativeTabBC;
import com.beanbot.beancraft.tile.TileEntityBioExtractor;
import com.beanbot.beancraft.tile.TileEntityBioInfuser;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockBioExtractor extends BlockBCContainer
{
    public BlockBioExtractor()
    {
        super(Material.anvil);
        this.setCreativeTab(CreativeTabBC.BC_TAB);
        this.setBlockName("bioExtractor");
        this.setBlockTextureName("bioExtractor");
        this.setStepSound(soundTypeAnvil);
        this.useNeighborBrightness=true;
    }

    public TileEntity createNewTileEntity(World world, int i)
    {
        return new TileEntityBioExtractor();
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
