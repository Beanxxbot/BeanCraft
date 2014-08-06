package com.beanbot.beancraft;

import com.beanbot.beancraft.handler.ConfigurationHandler;
import com.beanbot.beancraft.init.ModBlocks;
import com.beanbot.beancraft.init.ModItems;
import com.beanbot.beancraft.init.OreDictionary;
import com.beanbot.beancraft.init.Recipes;
import com.beanbot.beancraft.proxy.IProxy;
import com.beanbot.beancraft.reference.Reference;
import com.beanbot.beancraft.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

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

        ModItems.init();
        ModBlocks.init();
        OreDictionary.init();



    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        Recipes.init();
        LogHelper.info("Initialization Complete");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post Initialization Complete");
    }
}
