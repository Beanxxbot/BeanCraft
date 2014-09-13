package com.beanbot.beancraft.block;

import com.beanbot.beancraft.creativetab.CreativeTabBC;
import com.beanbot.beancraft.init.ModBlocks;
import com.beanbot.beancraft.item.BlockMachineSlab;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;

public class BlockMachineCasingSlab extends BlockMachineSlab
{
    public BlockMachineCasingSlab(boolean full) {
        super(full, ModBlocks.machineCasing, 0);
        setHardness(1.0F);
        setStepSound(soundTypeWood);
        this.setStepSound(soundTypeMetal);
    }

    @Override
    public BlockSlab getFullBlock() {
        return (BlockSlab) ModBlocks.machineCasingSlabFull;
    }

    @Override
    public BlockSlab getSingleBlock() {
        return (BlockSlab) ModBlocks.machineCasingSlab;
    }
}
