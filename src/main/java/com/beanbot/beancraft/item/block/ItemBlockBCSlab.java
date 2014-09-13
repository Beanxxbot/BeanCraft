package com.beanbot.beancraft.item.block;
import net.minecraft.block.Block;
import net.minecraft.item.ItemSlab;
import net.minecraft.item.ItemStack;
import com.beanbot.beancraft.block.BlockBCSlab;

public class ItemBlockBCSlab extends ItemSlab {

    public ItemBlockBCSlab(Block par1) {
        super(par1, ((BlockBCSlab) par1).getSingleBlock(), ((BlockBCSlab) par1).getFullBlock(), false);
    }
}