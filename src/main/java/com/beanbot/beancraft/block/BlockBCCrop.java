package com.beanbot.beancraft.block;

import com.beanbot.beancraft.init.ModBlocks;
import com.beanbot.beancraft.init.ModItems;
import com.beanbot.beancraft.reference.Reference;
import cpw.mods.fml.common.eventhandler.Event;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.IGrowable;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.BonemealEvent;

import java.sql.Ref;
import java.util.ArrayList;
import java.util.Random;

public class BlockBCCrop extends BlockCrops
{
    @SideOnly(Side.CLIENT)
    private IIcon[] iconArray;


    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
       this.iconArray = new IIcon[4];

        for (int i = 0; i < this.iconArray.length; i++)
        {
            this.iconArray[i] = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())) + (i + 1));
        }
    }

    public IIcon getIcon(int side, int metadata)
    {
        if (metadata < 7)
        {
            if (metadata == 6)
            {
                metadata = 5;
            }
            return this.iconArray[metadata >> 1];
        }
        return this.iconArray[3];
    }

    public int quantityDropped(Random random)
    {
        return 1;
    }

    public int getRenderType()
    {
        return 6;
    }



    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":",getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }


    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }

}







































    /** @SideOnly(Side.CLIENT)
    private IIcon[] icons;

    public BlockBCCrop()
    {
        this.setTickRandomly(true);
        this.setHardness(0.5F);
        this.setStepSound(soundTypeGravel);
        this.disableStats();
    }


     * Ticks the block if it's been scheduled

    public void updateTick(World world, int x, int y, int z, Random random)
    {
        super.updateTick(world, x, y, z, random);
    }

    public void func_149863_m(World world, int x, int y, int z)
    {
        int l = world.getBlockMetadata(x, y, z) + MathHelper.getRandomIntegerInRange(world.rand, 2, 5);

        if (l > 7)
        {
            l = 7;
        }

        world.setBlockMetadataWithNotify(x, y, z, l, 2);
    }



    /**
     * Gets the block's texture. Args: side, meta
     *
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int s, int m)
    {
        if (m < 0 || m > 7)
        {
            m = 7;
        }

        return this.icons[m];
    }

    /**
     * The type of render function that is called for this block
     *
    public int getRenderType()
    {
        return 6;
    }

    protected Item seed()
    {
        return Items.wheat_seeds;
    }

    protected Item crop()
    {
        return Items.wheat;
    }

    /**
     * Drops the block items with a specified chance of dropping the specified items
     *
    public void dropBlockAsItemWithChance(World world, int x, int y, int z, int i, float f, int n)
    {
        super.dropBlockAsItemWithChance(world, x, y, z, i, f, 0);
    }

    public Item getItemDropped(int i, Random random, int n)
    {
        return i == 7 ? this.crop() : this.seed();
    }

    /**
     * Returns the quantity of items to drop on block destruction.
     *
    public int quantityDropped(Random random)
    {
        return 1;
    }

    public boolean func_149851_a(World world, int x, int y, int z, boolean bool)
    {
        return world.getBlockMetadata(x, y, z) != 7;
    }

    public boolean func_149852_a(World world, Random random, int x, int y, int z)
    {
        return true;
    }

    /**
     * Gets an item for the block being called on. Args: world, x, y, z
     *
    @SideOnly(Side.CLIENT)
    public Item getItem(World world, int x, int y, int z)
    {
        return this.seed();
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        this.icons = new IIcon[8];

        for (int i = 0; i < this.icons.length; ++i)
        {
            this.icons[i] = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName()) + "_stage_" + i));
        }
    }

    public void func_149853_b(World p_149853_1_, Random p_149853_2_, int p_149853_3_, int p_149853_4_, int p_149853_5_)
    {
        this.func_149863_m(p_149853_1_, p_149853_3_, p_149853_4_, p_149853_5_);
    }

    @Override
    public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune)
    {
        ArrayList<ItemStack> ret = super.getDrops(world, x, y, z, metadata, fortune);

        if (metadata >= 7)
        {
            for (int i = 0; i < 3 + fortune; ++i)
            {
                if (world.rand.nextInt(15) <= metadata)
                {
                    ret.add(new ItemStack(this.seed(), 1, 0));
                }
            }
        }

        return ret;
    }


**/
