package com.cursee.more_bows_and_arrows;

import com.cursee.monolib.core.sailing.Sailing;
import com.cursee.more_bows_and_arrows.core.DispenserRegistryNeoForge;
import com.cursee.more_bows_and_arrows.core.registry.RegistryNeoForge;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod(Constants.MOD_ID)
public class MoreBowsAndArrowsNeoForge {
    
    public MoreBowsAndArrowsNeoForge(IEventBus modEventBus) {
        MoreBowsAndArrows.init();
        Sailing.register(Constants.MOD_NAME, Constants.MOD_ID, Constants.MOD_VERSION, Constants.MC_VERSION_RAW, Constants.PUBLISHER_AUTHOR, Constants.PRIMARY_CURSEFORGE_MODRINTH);
        RegistryNeoForge.register(modEventBus);
    }

    @EventBusSubscriber(modid = Constants.MOD_ID, bus = EventBusSubscriber.Bus.GAME)
    public static class CommonEvents {

        @SubscribeEvent
        public static void onCommonSetup(final FMLCommonSetupEvent event) {
            event.enqueueWork(DispenserRegistryNeoForge::register);
        }
    }
}