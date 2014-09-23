package com.beanbot.beancraft.container;

import com.beanbot.beancraft.tile.TileEntityBioGenerator;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.tileentity.TileEntity;

public class ContainerBioGenerator extends Container
{
    private TileEntityBioGenerator bioGenerator;

    public ContainerBioGenerator(InventoryPlayer inventoryPlayer, TileEntityBioGenerator bioGenerator)
    {
        this.bioGenerator = bioGenerator;

        this.addSlotToContainer(new Slot(bioGenerator, 0, 80, 7));

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
    public boolean canInteractWith(EntityPlayer player)
    {
        return true;
    }
}
