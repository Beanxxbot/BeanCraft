package com.beanbot.beancraft.item.bauble;

import baubles.api.BaubleType;
import baubles.api.IBauble;
import com.beanbot.beancraft.item.ItemBC;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;

import java.util.List;

import static net.minecraft.potion.Potion.moveSlowdown;

public class ItemBauble extends ItemBC implements IBauble {
    @Override
    public BaubleType getBaubleType(ItemStack itemstack) {
        return null;
    }

    @Override
    public void onWornTick(ItemStack itemstack, EntityLivingBase player) {

    }

    @Override
    public void onEquipped(ItemStack itemstack, EntityLivingBase player) {

    }

    @Override
    public void onUnequipped(ItemStack itemstack, EntityLivingBase player) {

    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
        if(GuiScreen.isShiftKeyDown())
            addHiddenTooltip(par1ItemStack, par2EntityPlayer, par3List, par4);
        else addStringToTooltip(StatCollector.translateToLocal("tooltip.beancraft:shift"), par3List);
    }

    public void addHiddenTooltip(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
        BaubleType type = getBaubleType(par1ItemStack);
        addStringToTooltip(EnumChatFormatting.AQUA + StatCollector.translateToLocal("tooltip.beancraft:bauble." + type.name().toLowerCase()), par3List);
    }

    protected void addStringToTooltip(String s, List<String> tooltip) {
        tooltip.add(s.replaceAll("&", "\u00a7"));
    }

    @Override
    public boolean canEquip(ItemStack itemstack, EntityLivingBase player) {
        return false;
    }

    @Override
    public boolean canUnequip(ItemStack itemstack, EntityLivingBase player) {
        return false;
    }
}
