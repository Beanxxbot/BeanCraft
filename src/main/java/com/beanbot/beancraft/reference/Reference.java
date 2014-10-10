package com.beanbot.beancraft.reference;

import net.minecraft.util.ResourceLocation;

public class Reference
{
    public static final String MOD_ID = "BeanCraft";
    public static final String MOD_NAME = "BeanCraft";
    public static final String VERSION = "1.7.10-0.1";
    public static final String CLIENT_PROXY_CLASS = "com.beanbot.beancraft.proxy.ClientProxy";
    public static final String SERVER_PROXY_CLASS = "com.beanbot.beancraft.proxy.ServerProxy";
    public static final String GUI_FACTORY_CLASS = "com.beanbot.beancraft.client.gui.GuiFactory";

    public static final ResourceLocation BIOGEN_TEXTURE = new ResourceLocation(Reference.MOD_ID.toLowerCase(), "/textures/models/bioGenerator.png");
    public static final ResourceLocation BIOINFUSER_TEXTURE = new ResourceLocation(Reference.MOD_ID.toLowerCase(), "/textures/models/bioInfuser.png");
    public static final ResourceLocation BIOCRYSTAL_TEXTURE = new ResourceLocation(Reference.MOD_ID.toLowerCase(), "/textures/models/bioCrystal.png");
    public static final ResourceLocation BIOEXTRACTOR_TEXTURE = new ResourceLocation(Reference.MOD_ID.toLowerCase(), "/textures/models/bioExtractor.png");
}
