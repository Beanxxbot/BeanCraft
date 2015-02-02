package com.beanbot.beancraft.tile;

import com.beanbot.beancraft.init.ModItems;
import com.beanbot.beancraft.init.OreDictionary;
import com.beanbot.beancraft.init.recipes.BioInfuserRecipes;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
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
    private ItemStack[] slots = new ItemStack[4];

    public int bioPower;
    public int infusionTime;
    public static final int maxBioPower = 8000;
    public static final int infusionSpeed = 120;

    private static final int[] slots_top = new int[] {0, 1};
    private static final int[] slots_bottom = new int[] {3};
    private static final int[] slots_side = new int[] {2};


    public TileEntityBioInfuser() {
        slots = new ItemStack[4];
    }

    @Override
    public int[] getAccessibleSlotsFromSide(int i) {
        return i == 0 ? slots_bottom : (i == 1 ? slots_top : slots_side);
    }

    @Override
    public boolean canInsertItem(int var1, ItemStack itemStack, int var3) {
        return this.isItemValidForSlot(var1, itemStack);
    }

    @Override
    public boolean canExtractItem(int i, ItemStack itemStack, int j) {
        return j != 0 || i != 1 || itemStack.getItem() == Items.bucket;
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
    public boolean isItemValidForSlot(int i, ItemStack itemStack) {
        return i == 2 ? false : (i == 2 ? hasItemPower(itemStack) : true);
    }

    public boolean hasItemPower(ItemStack itemStack)
    {
        return getItemPower(itemStack) > 0;
    }

    private static int getItemPower(ItemStack itemStack)
    {
        if (itemStack == null)
        {
            return 0;
        }
        else
        {
            Item item = itemStack.getItem();

            if (item == ModItems.bioMatter || item == ModItems.dirtChunk) return 10;

            return 0;
        }
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

        this.infusionTime = tagCompound.getShort("InfusionTime");
        this.bioPower = tagCompound.getShort("Power");

    }

    public void writeToNBT(NBTTagCompound tagCompound) {
        super.writeToNBT(tagCompound);
        tagCompound.setShort("InfusionTime", (short) this.infusionTime);
        tagCompound.setShort("Power", (short) this.bioPower);
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

    @Override
    public String getInventoryName() {
        return null;
    }

    @Override
    public boolean hasCustomInventoryName() {
        return false;
    }

    public int getInfusionProgressScaled(int i)
    {
        return (infusionTime * i) / this.infusionSpeed;
    }

    public int getPowerRemainingScaled(int i)
    {
        return (bioPower * i) / maxBioPower;
    }

    private boolean canInfuse()
    {
        if (slots[0] == null || slots[1] == null)
        {
            return false;
        }
        ItemStack itemStack = BioInfuserRecipes.getInfusionResults(slots[0].getItem(), slots[1].getItem());

        if (itemStack == null)
        {
            return false;
        }
        if (slots[3] == null)
        {
            return true;
        }
        if (!slots[3].isItemEqual(itemStack))
        {
            return false;
        }
        if (slots[3].stackSize < getInventoryStackLimit() && slots[3].stackSize < slots[3].getMaxStackSize())
        {
            return true;
        }
        else
        {
            return slots[3].stackSize < itemStack.getMaxStackSize();
        }

    }

    private void infuseItem()
    {
        if (canInfuse())
        {
            ItemStack itemStack = BioInfuserRecipes.getInfusionResults(slots[0].getItem(), slots[1].getItem());

            if (slots[3] == null)
            {
                slots[3] = itemStack.copy();
            }
            else if (slots[3].isItemEqual(itemStack))
            {
                slots[3].stackSize += itemStack.stackSize;
            }

            for (int i = 0; i < 2; i++)
            {
                if (slots[i].stackSize <=0)
                {
                    slots[i] = new ItemStack(slots[i].getItem().setFull3D());
                }
                else
                {
                    slots[i].stackSize--;
                }

                if (slots[i].stackSize <= 0)
                {
                    slots[i] = null;
                }
            }
        }
    }

    public boolean hasPower()
    {
        return bioPower > 0;
    }

    public boolean isInfusing()
    {
        return this.infusionTime > 0;
    }

    public void updateEntity()
    {
        boolean flag = this.hasPower();
        boolean flag1 = false;

        //System.out.println(bioPower);
        //System.out.println(infusionTime);

        if (hasPower() && this.isInfusing())
        {
            this.bioPower--;
        }

        if(worldObj.isRemote)
        {
            if (this.hasItemPower(this.slots[2]) && this.bioPower < (this.maxBioPower - this.getItemPower(this.slots[2])))
            {
                this.bioPower += getItemPower(this.slots[2]);

                if (this.slots[2] != null)
                {
                    flag1 = true;

                    this.slots[2].stackSize--;

                    if (this.slots[2].stackSize == 0)
                    {
                        this.slots[2] = this.slots[2].getItem().getContainerItem(this.slots[2]);
                    }
                }
            }

            if (hasPower() && canInfuse())
            {
                System.out.println("Infusing");
                infusionTime++;

                if (this.infusionTime == this.infusionSpeed)
                {
                    this.infusionTime = 0;
                    this.infuseItem();
                    flag1 = true;
                }
                else
                {
                    infusionTime = 0;
                }
                if (flag != this.isInfusing())
                {
                    flag1 = true;

                }
            }
            if (flag1)
            {
                this.markDirty();
            }
        }
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

}
