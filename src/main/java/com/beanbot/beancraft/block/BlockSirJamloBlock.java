package com.beanbot.beancraft.block;

import com.beanbot.beancraft.creativetab.CreativeTabBC;
import com.beanbot.beancraft.init.ModItems;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.world.World;

public class BlockSirJamloBlock extends BlockBC
{
    public BlockSirJamloBlock()
    {
        super(Material.piston);
        this.setBlockName("sirJamloBlock");
        this.setBlockTextureName("sirJamloBlock");
        this.setHardness(0.4F);
        this.setStepSound(soundTypePiston);
        this.setCreativeTab(CreativeTabBC.BC_BONUS_TAB);
    }

    public void func_150114_a(World world, int i, int i1, int i2, int i3, EntityLivingBase p_150114_6_)
    {
        if (!world.isRemote)
        {
            if ((i3 & 1) == 1)
            {
                EntityTNTPrimed entitytntprimed = new EntityTNTPrimed(world, (double)((float)i + 0.5F), (double)((float)i1 + 0.5F), (double)((float)i2 + 0.5F), p_150114_6_);
                world.spawnEntityInWorld(entitytntprimed);
                world.playSoundAtEntity(entitytntprimed, "game.tnt.primed", 1.0F, 1.0F);
            }
        }
    }

    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer entityPlayer, int i, float f, float v, float r)
    {
        if (entityPlayer.getCurrentEquippedItem() != null && entityPlayer.getCurrentEquippedItem().getItem() == ModItems.sirJamlo)
        {
            this.func_150114_a(world, x, y, z, 1, entityPlayer);
            world.setBlockToAir(x, y, z);
            entityPlayer.getCurrentEquippedItem().damageItem(1, entityPlayer);
            return true;
        }
        else
        {
            return super.onBlockActivated(world, x, y, z, entityPlayer, i, f, v, r);
        }
    }

}
