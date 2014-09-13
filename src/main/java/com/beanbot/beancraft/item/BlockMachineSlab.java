package com.beanbot.beancraft.item;

import com.beanbot.beancraft.block.BlockBCSlab;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.util.IIcon;

public abstract class BlockMachineSlab extends BlockBCSlab
{
    Block source;
    int meta;

    public BlockMachineSlab(boolean full, Block source, int meta) {
        super(full, source.getMaterial(), source.getUnlocalizedName().replaceAll("tile.", "") + meta + "Slab" + (full ? "Full" : ""));
        setStepSound(source.stepSound);
        this.source = source;
        this.meta = meta;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int par1, int par2) {
        return source.getIcon(par1, meta);
    }

}
