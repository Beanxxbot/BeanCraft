package com.beanbot.beancraft.item;

import com.beanbot.beancraft.creativetab.CreativeTabBC;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;

public class ItemBioCrystal extends ItemBC
{
    public ItemBioCrystal()
    {
        super();
        this.setUnlocalizedName("bioCrystal");
        this.setCreativeTab(CreativeTabBC.BC_TAB);
        this.setFull3D();
    }
}
