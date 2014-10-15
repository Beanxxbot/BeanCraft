package com.beanbot.beancraft.client.gui;

import com.beanbot.beancraft.container.ContainerBioExtractor;
import com.beanbot.beancraft.container.ContainerBioGenerator;
import com.beanbot.beancraft.container.ContainerBioInfuser;
import com.beanbot.beancraft.init.ModGUIs;
import com.beanbot.beancraft.tile.TileEntityBioExtractor;
import com.beanbot.beancraft.tile.TileEntityBioGenerator;
import com.beanbot.beancraft.tile.TileEntityBioInfuser;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BeanCraftGUIHandler implements IGuiHandler {
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        TileEntity tileEntity = world.getTileEntity(x, y, z);

        switch(ID)
        {
            case ModGUIs.guiIDBioGen:
                if(tileEntity instanceof TileEntityBioGenerator)
                {
                    return new ContainerBioGenerator(player.inventory, (TileEntityBioGenerator)tileEntity);
                }

            case ModGUIs.guiIDBioInfuser:
                if(tileEntity instanceof TileEntityBioInfuser)
                {
                    return new ContainerBioInfuser(player.inventory, (TileEntityBioInfuser)tileEntity);
                }

            case ModGUIs.guiIDBioExtractor:
                if(tileEntity instanceof TileEntityBioExtractor)
                {
                    return new ContainerBioExtractor(player.inventory, (TileEntityBioExtractor)tileEntity);
                }

        }

        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        TileEntity tileEntity = world.getTileEntity(x, y, z);

        switch(ID)
        {
            case ModGUIs.guiIDBioGen:
                if(tileEntity instanceof TileEntityBioGenerator)
                {
                    return new GUIBioGenerator(player.inventory, (TileEntityBioGenerator)tileEntity);
                }

            case ModGUIs.guiIDBioInfuser:
                if(tileEntity instanceof TileEntityBioInfuser)
                {
                    return new GuiBioInfuser(player.inventory, (TileEntityBioInfuser)tileEntity);
                }

            case ModGUIs.guiIDBioExtractor:
                if(tileEntity instanceof TileEntityBioExtractor)
                {
                    return new GuiBioExtractor(player.inventory, (TileEntityBioExtractor)tileEntity);
                }


        }

        return null;
    }
}
