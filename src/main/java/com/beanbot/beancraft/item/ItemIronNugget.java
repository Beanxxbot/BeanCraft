package com.beanbot.beancraft.item;

import com.beanbot.beancraft.creativetab.CreativeTabBC;
import com.beanbot.beancraft.init.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import static net.minecraftforge.oredict.OreDictionary.OreRegisterEvent;

public class ItemIronNugget extends ItemBC
{
    public ItemIronNugget()
    {
        super();
        this.setUnlocalizedName("ironNugget");
        this.setCreativeTab(CreativeTabBC.BC_TAB_MATERIAL);
    }



}
