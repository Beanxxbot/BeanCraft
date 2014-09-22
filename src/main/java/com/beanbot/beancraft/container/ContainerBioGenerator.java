package com.beanbot.beancraft.container;

import com.beanbot.beancraft.tile.TileEntityBioGenerator;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;

public class ContainerBioGenerator extends Container
{
    public ContainerBioGenerator(InventoryPlayer inventoryPlayer, TileEntityBioGenerator bioGenerator)
    {

    }

    @Override
    public boolean canInteractWith(EntityPlayer player)
    {
        return true;
    }
}
