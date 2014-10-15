package com.beanbot.beancraft;

import com.beanbot.beancraft.client.gui.BeanCraftGUIHandler;
import com.beanbot.beancraft.handler.ConfigurationHandler;
import com.beanbot.beancraft.init.*;
import com.beanbot.beancraft.init.recipes.Recipes;
import com.beanbot.beancraft.proxy.ClientProxy;
import com.beanbot.beancraft.proxy.IProxy;
import com.beanbot.beancraft.reference.Reference;
import com.beanbot.beancraft.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class BeanCraft
{
    @Mod.Instance(Reference.MOD_ID)
    public static BeanCraft instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {


        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        LogHelper.info("Pre Initialization Complete");

        ModTileEntities.init();
        ModItems.init();
        ModBlocks.init();
        ModGUIs.init();
        OreDictionary.init();
        ClientProxy.initMod();





    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        NetworkRegistry.INSTANCE.registerGuiHandler(this, new BeanCraftGUIHandler());

        Recipes.init();
        LogHelper.info("Initialization Complete");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post Initialization Complete");
    }
}
