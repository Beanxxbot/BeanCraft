package com.beanbot.beancraft.block;

import com.beanbot.beancraft.BeanCraft;
import com.beanbot.beancraft.creativetab.CreativeTabBC;
import com.beanbot.beancraft.init.ModGUIs;
import com.beanbot.beancraft.tile.TileEntityBioGenerator;
import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
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
        this.setCreativeTab(CreativeTabBC.BC_TAB);
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

    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ)
    {
        if(!world.isRemote)
        {
            FMLNetworkHandler.openGui(player, BeanCraft.instance, ModGUIs.guiIDBioGen, world, x, y, z);
        }

        return true;
    }

}
