package com.cursee.more_bows_and_arrows.core.registry;

import com.cursee.more_bows_and_arrows.Constants;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class RegistryForge {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Constants.MOD_ID);
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(BuiltInRegistries.CREATIVE_MODE_TAB.key(), Constants.MOD_ID);
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Constants.MOD_ID);

    public static void register(IEventBus modEventBus) {

        ModBowItemsForge.register();
        ModArrowItemsForge.register();
        ModTabsForge.register();
        ModEntityTypesForge.register();

        ITEMS.register(modEventBus);
        TABS.register(modEventBus);
        ENTITY_TYPES.register(modEventBus);
    }

    protected static <T extends Item> RegistryObject<T> registerItem(String itemID, Supplier<T> itemSupplier) {
        return ITEMS.register(itemID, itemSupplier);
    }

    protected static <T extends CreativeModeTab> RegistryObject<T> registerTab(String tabID, Supplier<T> tabSupplier) {
        return TABS.register(tabID, tabSupplier);
    }

    protected static <T extends EntityType<?>> RegistryObject<T> registerEntityType(String typeID, Supplier<T> typeSupplier) {
        return ENTITY_TYPES.register(typeID, typeSupplier);
    }
}
