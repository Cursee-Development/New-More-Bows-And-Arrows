package com.cursee.more_bows_and_arrows.core.registry;

import com.cursee.more_bows_and_arrows.Constants;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

import java.util.function.Supplier;

public class RegistryFabric {

    public static void register() {
        ModBowItemsFabric.register();
        ModArrowItemsFabric.register();
        ModTabsFabric.register();
        ModEntityTypesFabric.register();
    }

    protected static <T extends Item> T registerItem(String itemID, Supplier<T> itemSupplier) {
        return Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, itemID), itemSupplier.get());
    }

    public static <T extends CreativeModeTab> T registerTab(String tabID, Supplier<T> tabSupplier) {
        return Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, tabID), tabSupplier.get());
    }

    public static <T extends EntityType<?>> T registerEntityType(String entityID, Supplier<T> entitySupplier) {
        return Registry.register(BuiltInRegistries.ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, entityID), entitySupplier.get());
    }
}
