package com.beanbot.beancraft.tile;

import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.ForgeDirection;

public class TileEntityBioPipe extends TileEntity
{
    /**
     * up, down, north, east, south, west
     */

    public ForgeDirection[] connections = new ForgeDirection[7];

    public TileEntityBioPipe()
    {

    }

    public void updateEntity()
    {
        this.updateConnections();
    }

    public void updateConnections()
    {
        if(this.worldObj.getTileEntity(xCoord, yCoord+1, zCoord) instanceof TileEntityBioPipe) connections[0] = ForgeDirection.UP;
        else connections[0] = null;
        if(this.worldObj.getTileEntity(xCoord, yCoord-1, zCoord) instanceof TileEntityBioPipe) connections[1] = ForgeDirection.DOWN;
        else connections[1] = null;
        if(this.worldObj.getTileEntity(xCoord, yCoord, zCoord-1) instanceof TileEntityBioPipe) connections[2] = ForgeDirection.NORTH;
        else connections[2] = null;
        if(this.worldObj.getTileEntity(xCoord+1, yCoord, zCoord) instanceof TileEntityBioPipe) connections[3] = ForgeDirection.EAST;
        else connections[3] = null;
        if(this.worldObj.getTileEntity(xCoord, yCoord, zCoord+1) instanceof TileEntityBioPipe) connections[4] = ForgeDirection.SOUTH;
        else connections[4] = null;
        if(this.worldObj.getTileEntity(xCoord-1, yCoord, zCoord) instanceof TileEntityBioPipe) connections[5] = ForgeDirection.WEST;
        else connections[5] = null;
        if(this.worldObj.getTileEntity(xCoord, yCoord-1, zCoord) instanceof TileEntityBioGenerator) connections[6] = ForgeDirection.DOWN;
        else connections[6] = null;
    }
}
