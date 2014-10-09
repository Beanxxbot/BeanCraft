package com.beanbot.beancraft.container;

import com.beanbot.beancraft.tile.TileEntityBioInfuser;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;

public class ContainerBioInfuser extends Container {
    private TileEntityBioInfuser bioInfuser;

    public ContainerBioInfuser(InventoryPlayer inventoryPlayer, TileEntityBioInfuser bioInfuser)
    {
        this.bioInfuser = bioInfuser;

        this.addSlotToContainer(new Slot(bioInfuser, 0, 44, 17));

        this.addSlotToContainer(new Slot(bioInfuser, 1, 116, 17));

        this.addSlotToContainer(new Slot(bioInfuser, 2, 80, 60));

        //Hotbar
        for(int i = 0; i < 9; i++)
        {
            this.addSlotToContainer(new Slot(inventoryPlayer, i, 8 + i*18, 142));
        }

        //Inventory
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 9; j++)
            {
                this.addSlotToContainer(new Slot(inventoryPlayer, 9+j+i*9, 8 + 18*j, 84+i*18));
            }
        }
    }

    @Override
    public boolean canInteractWith(EntityPlayer player) {
        return true;
    }
}
