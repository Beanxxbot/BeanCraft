package com.beanbot.beancraft;

import com.beanbot.beancraft.event.EventBonemeal;
import com.beanbot.beancraft.handler.ConfigurationHandler;
import com.beanbot.beancraft.init.*;
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
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.common.MinecraftForge;

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
        MinecraftForge.EVENT_BUS.register(new EventBonemeal());

        ModItems.init();
        ModBlocks.init();
        OreDictionary.init();
        ClientProxy.initMod();
        MinecraftForge.EVENT_BUS.register(new EventBonemeal());



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
