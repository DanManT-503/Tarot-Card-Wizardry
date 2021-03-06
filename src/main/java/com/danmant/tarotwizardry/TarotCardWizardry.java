package com.danmant.tarotwizardry;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = TarotCardWizardry.MODID, name = com.danmant.tarotwizardry.TarotCardWizardry.NAME, version = com.danmant.tarotwizardry.TarotCardWizardry.VERSION,
        dependencies="required-after:ebwizardry")
public class TarotCardWizardry
{
    public static final String MODID = "tarotwizardry";
    public static final String NAME = "Tarot Card Wizardry";
    public static final String VERSION = "1.0";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
