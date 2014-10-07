package com.beanbot.beancraft.item;

import com.beanbot.beancraft.creativetab.CreativeTabBC;
import com.beanbot.beancraft.init.ModBlocks;
import com.beanbot.beancraft.reference.ToolTip;
import cpw.mods.fml.common.eventhandler.Event;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.UseHoeEvent;

import java.util.List;

public class ItemInfusedHoeOne extends ItemBC
{
    public ItemInfusedHoeOne()
    {
        super();
        this.setUnlocalizedName("infusedHoe");
        this.setMaxDamage(1);
        this.setCreativeTab(CreativeTabBC.BC_TAB);
        this.setMaxStackSize(1);
    }

    @SideOnly(Side.CLIENT)
    public boolean isFull3D()
    {
        return true;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack itemStack, EntityPlayer entityPlayer, List list, boolean flag)
    {
        list.add(StatCollector.translateToLocal(ToolTip.INFUSEDHOE_LVL_ONE));
    }

    public boolean onItemUse(ItemStack itemStack, EntityPlayer player, World world, int x, int y, int z, int i, float a, float b, float c)
    {
        if (!player.canPlayerEdit(x, y, z, i, itemStack))
        {
            return false;
        }
        else
        {
            UseHoeEvent event = new UseHoeEvent(player, itemStack, world, x, y, z);
            if (MinecraftForge.EVENT_BUS.post(event))
            {
                return false;
            }

            if (event.getResult() == Event.Result.ALLOW)
            {
                itemStack.damageItem(1, player);
                return true;
            }

            Block block = world.getBlock(x, y, z);

            if (i != 0 && world.getBlock(x, y + 1, z).isAir(world, x, y + 1, z) && (block == Blocks.dirt || block == Blocks.grass))
            {
                Block block1 = ModBlocks.nuggetDirt;
                world.playSoundEffect((double)((float)x + 0.5F), (double)((float)y + 0.5F), (double)((float)z + 0.5F), block1.stepSound.getStepResourcePath(), (block1.stepSound.getVolume() + 1.0F) / 2.0F, block1.stepSound.getPitch() * 0.8F);

                if (world.isRemote)
                {
                    return true;
                }
                else
                {
                    world.setBlock(x, y + 1, z, block1);
                    itemStack.damageItem(1, player);
                    return true;
                }
            }
            else
            {
                return false;
            }
        }
    }
}
