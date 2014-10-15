package com.beanbot.beancraft.slot;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;

public class SlotBioInfuser extends Slot {

    public SlotBioInfuser(EntityPlayer player, IInventory iInventory, int i, int j, int k)
    {
        super(iInventory, i, j, k);
    }
}
