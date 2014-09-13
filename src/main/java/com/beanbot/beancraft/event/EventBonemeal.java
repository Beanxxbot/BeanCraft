package com.beanbot.beancraft.event;

import com.beanbot.beancraft.block.BlockBCCrop;
import com.beanbot.beancraft.init.ModBlocks;
import cpw.mods.fml.common.eventhandler.Event;
import net.minecraftforge.event.entity.player.BonemealEvent;

public class EventBonemeal
{

    public void onUseBonemeal(BonemealEvent event)
    {
        if (event.block == ModBlocks.nuggetDirt)
        {
            event.setResult(Event.Result.DENY);
        }

    }
}
