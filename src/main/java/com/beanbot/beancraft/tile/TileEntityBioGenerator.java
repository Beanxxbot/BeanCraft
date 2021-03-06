package com.beanbot.beancraft.tile;

import com.beanbot.beancraft.reference.Gui;
import ibxm.Player;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import java.util.Random;

public class TileEntityBioGenerator extends TileEntity implements ISidedInventory
{
    private ItemStack[] slots = new ItemStack[1];

    public int maxPower = 8000;
    public float power = 0;

    private static Random random = new Random();

    public boolean initialized;
    private boolean canRain;
    private boolean noSunlight;
    public boolean theSunIsVisible;

    private int tick;

    public float powerPerMatterTZero = 0.0F;

    public TileEntityBioGenerator()
    {
        this.tick = random.nextInt(64);
    }

    public int getPowerScaled(int scaled)
    {
        return (int) (this.power * scaled / this.maxPower);
    }

    public void addPower(double addition)
    {
        //power += addition;

        //if (power > maxPower) power = maxPower;
    }

    public void updateEntity()
    {
        if (!initialized && worldObj != null)
        {
            canRain = worldObj.getWorldChunkManager().getBiomeGenAt(xCoord, zCoord).getIntRainfall() > 0;
            noSunlight = worldObj.provider.hasNoSky;
            initialized = true;
        }
        if (noSunlight)
        {
            return;
        }
        if (tick-- == 0)
        {
            updateSunState();
            tick = 64;
        }
        powerPerMatterTZero = 0.0F;

        if (theSunIsVisible)
        {
            powerPerMatterTZero = 5.0F;
            System.out.println("Sun is visible");
        }
        if (powerPerMatterTZero != 0)
        {
            powerPerMatterTZero++;
        }
        power += powerPerMatterTZero;
        if (power > maxPower) power = maxPower;
        //LogHelper.debug(power);
        //System.out.println(power);


    }

    private void updateSunState() {
        boolean isRaining = canRain && (worldObj.isRaining() || worldObj.isThundering());
        theSunIsVisible = worldObj.isDaytime() && !isRaining && worldObj.canBlockSeeTheSky(xCoord, yCoord + 1, zCoord);
    }

    public void readFromNBT(NBTTagCompound nbt)
    {
        super.readFromNBT(nbt);
    }

    public void writeToNBT(NBTTagCompound nbt)
    {
        super.writeToNBT(nbt);
    }


    public int[] getAccessibleSlotsFromSide(int p_94128_1_) {
        return new int[0];
    }

    public boolean canInsertItem(int p_102007_1_, ItemStack p_102007_2_, int p_102007_3_) {
        return false;
    }

    public boolean canExtractItem(int p_102008_1_, ItemStack p_102008_2_, int p_102008_3_) {
        return false;
    }

    public int getSizeInventory() {
        return this.slots.length;
    }

    public ItemStack getStackInSlot(int i) {
        return this.slots[i];
    }

    public ItemStack decrStackSize(int i, int j) {
        if(this.slots[i] != null)
        {
            ItemStack itemStack;
            if(this.slots[i].stackSize <= j)
            {
                itemStack = this.slots[i];
                this.slots[i] = null;
                return itemStack;
            }
            else
            {
                itemStack = this.slots[i].splitStack(j);

                if(this.slots[i].stackSize == 0)
                {
                    this.slots[i] = null;
                }
            }
            return itemStack;
        }

        return null;
    }

    public ItemStack getStackInSlotOnClosing(int i) {
        if(this.slots[i] != null)
        {
            ItemStack itemStack = this.slots[i];
            this.slots[i] = null;
            return itemStack;
        }

        return null;
    }

    public void setInventorySlotContents(int i, ItemStack itemStack) {
        this.slots[i] = itemStack;

        if(itemStack != null && itemStack.stackSize > this.getInventoryStackLimit())
        {
            itemStack.stackSize = this.getInventoryStackLimit();
        }
    }

    public String getInventoryName() {
        return Gui.bioGenerator;
    }

    public boolean hasCustomInventoryName() {
        return false;
    }

    public int getInventoryStackLimit() {
        return 64;
    }

    public boolean isUseableByPlayer(EntityPlayer p_70300_1_) {
        return false;
    }

    public void openInventory() {

    }

    public void closeInventory() {

    }

    public boolean isItemValidForSlot(int p_94041_1_, ItemStack p_94041_2_) {
        return false;
    }
}
