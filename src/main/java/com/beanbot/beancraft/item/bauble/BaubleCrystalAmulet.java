package com.beanbot.beancraft.item.bauble;

import baubles.api.BaubleType;
import net.minecraft.block.Block;
import net.minecraft.block.IGrowable;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import net.minecraftforge.common.IPlantable;

import java.util.List;

public class BaubleCrystalAmulet extends ItemBauble {

    public boolean growth;

    public BaubleCrystalAmulet() {
        super();
        setMaxStackSize(1);
        this.setUnlocalizedName("bioCrystalAmulet");
    }

    @Override
    public void onWornTick(ItemStack itemstack, EntityLivingBase player) {

        if(player instanceof EntityPlayer && !((EntityPlayer) player).worldObj.isRemote) {
            if (player.getActivePotionEffect(Potion.moveSlowdown) != null)
                player.removePotionEffect(Potion.moveSlowdown.id);

            player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, Integer.MAX_VALUE, 1, true));

        }

        if(growth = true)
        {
            int range = 3;
            int verticalRange = 2;
            int posX = (int) Math.round(player.posX - 0.5F);
            int posY = (int) player.posY;
            int posZ = (int) Math.round(player.posZ - 0.5F);

            for (int ix = posX - range; ix <= posZ + range; ix++)
            {
                for (int iz = posZ - range; iz <= posZ + range; iz++)
                {
                    for (int iy = posY - verticalRange; iy <= posY + verticalRange; iy++)
                    {
                        Block block = player.worldObj.getBlock(ix, iy, iz);

                        if (block instanceof IPlantable || block instanceof IGrowable)
                        {
                            if (player.worldObj.rand.nextInt(50) == 0)
                            {
                                block.updateTick(player.worldObj, ix, iy, iz, player.worldObj.rand);
                            }
                        }
                    }
                }
            }
        }

    }

    @Override
    public void onEquipped(ItemStack itemstack, EntityLivingBase player) {
        this.growth = true;
    }

    @Override
    public void onUnequipped(ItemStack itemstack, EntityLivingBase player) {
        PotionEffect effect = player.getActivePotionEffect(Potion.moveSlowdown);
        if(effect != null && effect.getAmplifier() == 1)
            player.removePotionEffect(Potion.moveSlowdown.id);

        this.growth = false;
    }


    @Override
    public BaubleType getBaubleType(ItemStack itemstack) {
        return BaubleType.AMULET;
    }

    @Override
    public boolean canEquip(ItemStack itemstack, EntityLivingBase player) {
        return true;
    }

    @Override
    public boolean canUnequip(ItemStack itemstack, EntityLivingBase player) {
        return true;
    }

    @Override
    public void addHiddenTooltip(ItemStack stack, EntityPlayer player, List list, boolean adv) {
        super.addHiddenTooltip(stack, player, list, adv);

        addStringToTooltip(StatCollector.translateToLocal("tooltip.beancraft:bioAmulet1"), list);
        addStringToTooltip(StatCollector.translateToLocal("tooltip.beancraft:bioAmulet2"), list);
        addStringToTooltip(StatCollector.translateToLocal("tooltip.beancraft:bioAmulet3"), list);

    }
}