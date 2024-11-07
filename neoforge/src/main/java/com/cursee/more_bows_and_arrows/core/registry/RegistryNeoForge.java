package com.cursee.more_bows_and_arrows.core.registry;

import com.cursee.more_bows_and_arrows.Constants;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class RegistryNeoForge {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(BuiltInRegistries.ITEM, Constants.MOD_ID);
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(BuiltInRegistries.CREATIVE_MODE_TAB.key(), Constants.MOD_ID);
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, Constants.MOD_ID);

    public static void register(IEventBus modEventBus) {

        ModBowItemsNeoForge.register();
        ModArrowItemsNeoForge.register();
        ModTabsNeoForge.register();
        ModEntityTypesNeoForge.register();

        ITEMS.register(modEventBus);
        TABS.register(modEventBus);
        ENTITY_TYPES.register(modEventBus);
    }

    protected static <T extends Item> DeferredHolder<Item, T> registerItem(String itemID, Supplier<T> itemSupplier) {
        return ITEMS.register(itemID, itemSupplier);
    }

    protected static <T extends CreativeModeTab> DeferredHolder<CreativeModeTab, T> registerTab(String tabID, Supplier<T> tabSupplier) {
        return TABS.register(tabID, tabSupplier);
    }

    protected static <T extends EntityType<?>> DeferredHolder<EntityType<?>, T> registerEntityType(String typeID, Supplier<T> typeSupplier) {
        return ENTITY_TYPES.register(typeID, typeSupplier);
    }
}
