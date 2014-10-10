package com.beanbot.beancraft.tile;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;

public class TileEntityBioInfuser extends TileEntity implements ISidedInventory
{
    private ItemStack[] slots = new ItemStack[3];
    public int infusionBurnTime;
    public int currentBurnTime;
    public int infusionCookTime;



    @Override
    public int[] getAccessibleSlotsFromSide(int p_94128_1_) {
        return new int[0];
    }

    @Override
    public boolean canInsertItem(int p_102007_1_, ItemStack p_102007_2_, int p_102007_3_) {
        return false;
    }

    @Override
    public boolean canExtractItem(int p_102008_1_, ItemStack p_102008_2_, int p_102008_3_) {
        return false;
    }

    @Override
    public int getSizeInventory() {
        return this.slots.length;
    }

    @Override
    public ItemStack getStackInSlot(int i) {
        return this.slots[i];
    }

    @Override
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

    @Override
    public ItemStack getStackInSlotOnClosing(int i) {
        if(this.slots[i] != null)
        {
            ItemStack itemStack = this.slots[i];
            this.slots[i] = null;
            return itemStack;
        }

        return null;
    }

    @Override
    public void setInventorySlotContents(int i, ItemStack itemStack) {
        this.slots[i] = itemStack;

        if(itemStack != null && itemStack.stackSize > this.getInventoryStackLimit())
        {
            itemStack.stackSize = this.getInventoryStackLimit();
        }
    }

    public void readFromNBT(NBTTagCompound tagCompound) {
        super.readFromNBT(tagCompound);
        NBTTagList tagList = tagCompound.getTagList("Items", 10);
        this.slots = new ItemStack[this.getSizeInventory()];

        for (int i = 0; i < tagList.tagCount(); ++i) {
            NBTTagCompound tabCompound1 = tagList.getCompoundTagAt(i);
            byte byte0 = tabCompound1.getByte("Slot");

            if (byte0 >= 0 && byte0 < this.slots.length) {
                this.slots[byte0] = ItemStack.loadItemStackFromNBT(tabCompound1);
            }
        }

        this.infusionBurnTime = tagCompound.getShort("BurnTime");
        this.infusionCookTime = tagCompound.getShort("CookTime");
        this.currentBurnTime = getItemBurnTime(this.slots[1]);

    }

    public void writeToNBT(NBTTagCompound tagCompound) {
        super.writeToNBT(tagCompound);
        tagCompound.setShort("BurnTime", (short) this.infusionBurnTime);
        tagCompound.setShort("CookTime", (short) this.infusionBurnTime);
        NBTTagList tagList = new NBTTagList();

        for (int i = 0; i < this.slots.length; ++i) {
            if (this.slots[i] != null) {
                NBTTagCompound tagCompound1 = new NBTTagCompound();
                tagCompound1.setByte("Slot", (byte) i);
                this.slots[i].writeToNBT(tagCompound1);
                tagList.appendTag(tagCompound1);
            }
        }

        tagCompound.setTag("Items", tagList);
    }

    public static int getItemBurnTime(ItemStack itemstack){
        if(itemstack == null){
            return 0;
        }else{
            Item item = itemstack.getItem();

            if(item instanceof ItemBlock && Block.getBlockFromItem(item) != Blocks.air){
                Block block = Block.getBlockFromItem(item);

                if(block.getMaterial() == Material.rock){
                    return 300;
                }
            }

            if(item instanceof ItemTool && ((ItemTool) item).getToolMaterialName().equals("EMERALD")) return 300;
            return GameRegistry.getFuelValue(itemstack);
        }
    }

    @Override
    public String getInventoryName() {
        return null;
    }

    @Override
    public boolean hasCustomInventoryName() {
        return false;
    }

    @Override
    public int getInventoryStackLimit() {
        return 64;
    }

    @Override
    public boolean isUseableByPlayer(EntityPlayer p_70300_1_) {
        return false;
    }

    @Override
    public void openInventory() {

    }

    @Override
    public void closeInventory() {

    }

    //public int getInfusionProgressScaled(int i)
    {
        //return this.infusionCookTime *i / this.infusionBurnTime;
    }

    @Override
    public boolean isItemValidForSlot(int p_94041_1_, ItemStack p_94041_2_) {
        return false;
    }
}
