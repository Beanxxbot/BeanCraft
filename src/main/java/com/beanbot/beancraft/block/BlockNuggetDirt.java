package com.beanbot.beancraft.block;

import com.beanbot.beancraft.creativetab.CreativeTabBC;
import com.beanbot.beancraft.event.EventBonemeal;
import com.beanbot.beancraft.init.ModBlocks;
import com.beanbot.beancraft.init.ModItems;
import cpw.mods.fml.common.eventhandler.Event;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.BonemealEvent;

public class BlockNuggetDirt extends BlockBCCrop
{
    private IIcon[] icons;
    public BlockNuggetDirt()
    {
        super();
        this.setCreativeTab(CreativeTabBC.BC_TAB);
        this.setBlockName("nuggetDirt");
        this.setBlockTextureName("nuggetDirt");
        this.setTickRandomly(true);
    }

    @Override
    protected Item func_149866_i()
    {
        return ModItems.dirtChunk;
    }

    @Override
    protected Item func_149865_P()
    {
        return ModItems.ironNuggetDirt;
    }


    public int getRenderType()
    {
        return 0;
    }


   /** @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        this.icons = new IIcon[4];

        for (int i = 0; i < this.icons.length; ++i)
        {
            this.icons[i] = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName()) + "_stage_" + i));
        }

    }

    @Override
    public void func_149863_m(World world, int x, int y, int z)
    {
        int l = world.getBlockMetadata(x, y, z) + MathHelper.getRandomIntegerInRange(world.rand, 2, 4);

        if (l > 4)
        {
            l = 4;
        }

        world.setBlockMetadataWithNotify(x, y, z, l, 2);
    }

    @Override
    public boolean func_149851_a(World world, int x, int y, int z, boolean bool)
    {
        return world.getBlockMetadata(x, y, z) != 4;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int s, int m)
    {
        if (m < 0 || m > 4)
        {
            m = 4;
        }

        return this.icons[m];
    }**/

}
