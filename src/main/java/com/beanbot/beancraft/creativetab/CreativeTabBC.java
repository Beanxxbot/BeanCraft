package com.beanbot.beancraft.creativetab;

import com.beanbot.beancraft.init.ModItems;
import com.beanbot.beancraft.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabBC
{
    public static final CreativeTabs BC_TAB = new CreativeTabs(Reference.MOD_ID)
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.leaf;
        }

        @Override
        public String getTranslatedTabLabel()
        {
            return "Bean Craft";
        }
    };
}
