package com.beanbot.beancraft.container;


import com.beanbot.beancraft.tile.TileEntityBioExtractor;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;

public class ContainerBioExtractor extends Container {
    private TileEntityBioExtractor bioExtractor;

    public ContainerBioExtractor(InventoryPlayer inventoryPlayer, TileEntityBioExtractor bioExtractor)
    {
        this.bioExtractor = bioExtractor;

        this.addSlotToContainer(new Slot(bioExtractor, 0, 80, 13));

        this.addSlotToContainer(new Slot(bioExtractor, 1, 44, 59));

        this.addSlotToContainer(new Slot(bioExtractor, 2, 116, 59));

        this.addSlotToContainer(new Slot(bioExtractor, 3, 152, 62));

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
