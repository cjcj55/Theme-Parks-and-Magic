package com.cjcj55.themeparksandmagic;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cjcj55.themeparksandmagic.common.itemgroups.ThemeParksAndMagicGroup;
import com.cjcj55.themeparksandmagic.core.init.BlockInit;
import com.cjcj55.themeparksandmagic.core.init.ItemInit;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;

@Mod(ThemeParksAndMagic.MOD_ID)
@Mod.EventBusSubscriber(modid = ThemeParksAndMagic.MOD_ID, bus = Bus.MOD)
public class ThemeParksAndMagic {
    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();   
    public static final String MOD_ID = "themeparksandmagic";

    public ThemeParksAndMagic() {
    	IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        // Register the setup method for modloading
        bus.addListener(this::setup);
        
        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
        
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }
    
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        final IForgeRegistry<Item> registry = event.getRegistry();
        BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get)
                .forEach(block -> {
                    final Item.Properties properties = new Item.Properties().group(ThemeParksAndMagicGroup.THEME_PARKS_AND_MAGIC_GROUP);
                    final BlockItem blockItem = new BlockItem(block, properties);
                    blockItem.setRegistryName(block.getRegistryName());
                    registry.register(blockItem);
                });
    }  

    private void setup(final FMLCommonSetupEvent event) {
    	
    }
}
