package com.beanbot.beancraft.block;

import com.beanbot.beancraft.creativetab.CreativeTabBC;
import com.beanbot.beancraft.item.block.ItemBlockBCSlab;
import com.beanbot.beancraft.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

import java.util.Random;

public abstract class BlockBCSlab extends BlockSlab
{
    String name;

    public BlockBCSlab(boolean full, Material mat, String name) {
        super(full, mat);
        this.name = name;
        setBlockName(name);
        if(!full) {
            setLightOpacity(0);
            setCreativeTab(CreativeTabBC.BC_TAB);
        }
    }

    public abstract BlockSlab getFullBlock();

    public abstract BlockSlab getSingleBlock();

    @Override
    public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z) {
        return new ItemStack(getSingleBlock());
    }

    @Override
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
        return Item.getItemFromBlock(getSingleBlock());
    }

    @Override
    public ItemStack createStackedBlock(int par1) {
        return new ItemStack(getSingleBlock());
    }

    public void register() {
        GameRegistry.registerBlock(this, ItemBlockBCSlab.class, name);
    }

    @Override
    public String func_150002_b(int i) {
        return name;
    }

    /*@Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":",getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }*/
}
