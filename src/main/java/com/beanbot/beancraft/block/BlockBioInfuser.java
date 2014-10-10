package com.beanbot.beancraft.block;

import com.beanbot.beancraft.BeanCraft;
import com.beanbot.beancraft.creativetab.CreativeTabBC;
import com.beanbot.beancraft.init.ModGUIs;
import com.beanbot.beancraft.tile.TileEntityBioInfuser;
import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
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
        this.useNeighborBrightness=true;
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

    public void onBlockAdded(World world, int x, int y, int z)
    {
        super.onBlockAdded(world, x, y, z);
        this.direction(world, x, y, z);
    }

    public void direction(World world, int x, int y, int z)
    {
        if(!world.isRemote)
        {
            Block direction = world.getBlock(x, y, z - 1);
            Block direction1 = world.getBlock(x, y, z + 1);
            Block direction2 = world.getBlock(x - 1, y, z);
            Block direction3 = world.getBlock(x + 1, y, z);
            byte byte0 = 3;

            if(direction.func_149730_j() && direction.func_149730_j())
            {
                byte0 = 3;
            }
            if(direction1.func_149730_j() && direction1.func_149730_j())
            {
                byte0 = 2;
            }
            if(direction2.func_149730_j() && direction2.func_149730_j())
            {
                byte0 = 5;
            }
            if(direction3.func_149730_j() && direction3.func_149730_j())
            {
                byte0 = 4;
            }

            world.setBlockMetadataWithNotify(x, y, z, byte0, 2);

        }
    }

    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack itemStack)
    {
        int direction = MathHelper.floor_double((double)(entity.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;

        if(direction == 0)
        {
            world.setBlockMetadataWithNotify(x, y, z, 2, 2);
        }
        if(direction == 1)
        {
            world.setBlockMetadataWithNotify(x, y, z, 5, 2);
        }
        if(direction == 2)
        {
            world.setBlockMetadataWithNotify(x, y, z, 3, 2);
        }
        if(direction == 3)
        {
            world.setBlockMetadataWithNotify(x, y, z, 4, 2);
        }

    }
}
