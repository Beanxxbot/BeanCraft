package com.beanbot.beancraft.block;

import com.beanbot.beancraft.BeanCraft;
import com.beanbot.beancraft.creativetab.CreativeTabBC;
import com.beanbot.beancraft.init.ModGUIs;
import com.beanbot.beancraft.tile.TileEntityBioInfuser;
import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
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

    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ)
    {
        if(!world.isRemote)
        {
            FMLNetworkHandler.openGui(player, BeanCraft.instance, ModGUIs.guiIDBioInfuser, world, x, y, z);
        }

        return true;
    }
}
