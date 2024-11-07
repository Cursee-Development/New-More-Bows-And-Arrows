package com.cursee.more_bows_and_arrows.core;

import com.cursee.more_bows_and_arrows.core.registry.ModArrowItemsNeoForge;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMaps;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.minecraft.core.dispenser.DispenseItemBehavior;
import net.minecraft.core.dispenser.ProjectileDispenseBehavior;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.DispenserBlock;

import java.util.Map;

public class DispenserRegistryNeoForge {

    public static Object2ObjectMap<Item, DispenseItemBehavior> DISPENSER_OBJECT_MAP = new Object2ObjectOpenHashMap<>();

    public static void register() {
        Map<Item, DispenseItemBehavior> syncronizedDispenserMap = Object2ObjectMaps.synchronize(DISPENSER_OBJECT_MAP);

        DISPENSER_OBJECT_MAP.put(ModArrowItemsNeoForge.FLINT_AND_STEEL_ARROW.get(), new ProjectileDispenseBehavior(ModArrowItemsNeoForge.FLINT_AND_STEEL_ARROW.get()));
        DISPENSER_OBJECT_MAP.put(ModArrowItemsNeoForge.ENDER_PEARL_ARROW.get(), new ProjectileDispenseBehavior(ModArrowItemsNeoForge.ENDER_PEARL_ARROW.get()));
        DISPENSER_OBJECT_MAP.put(ModArrowItemsNeoForge.TNT_ARROW.get(), new ProjectileDispenseBehavior(ModArrowItemsNeoForge.TNT_ARROW.get()));
        DISPENSER_OBJECT_MAP.put(ModArrowItemsNeoForge.PAPER_ARROW.get(), new ProjectileDispenseBehavior(ModArrowItemsNeoForge.PAPER_ARROW.get()));
        DISPENSER_OBJECT_MAP.put(ModArrowItemsNeoForge.MOSS_ARROW.get(), new ProjectileDispenseBehavior(ModArrowItemsNeoForge.MOSS_ARROW.get()));

        DISPENSER_OBJECT_MAP.put(ModArrowItemsNeoForge.AMETHYST_ARROW.get(), new ProjectileDispenseBehavior(ModArrowItemsNeoForge.AMETHYST_ARROW.get()));
        DISPENSER_OBJECT_MAP.put(ModArrowItemsNeoForge.BAMBOO_ARROW.get(), new ProjectileDispenseBehavior(ModArrowItemsNeoForge.BAMBOO_ARROW.get()));
        DISPENSER_OBJECT_MAP.put(ModArrowItemsNeoForge.BLAZE_ROD_ARROW.get(), new ProjectileDispenseBehavior(ModArrowItemsNeoForge.BLAZE_ROD_ARROW.get()));
        DISPENSER_OBJECT_MAP.put(ModArrowItemsNeoForge.BONE_ARROW.get(), new ProjectileDispenseBehavior(ModArrowItemsNeoForge.BONE_ARROW.get()));
        DISPENSER_OBJECT_MAP.put(ModArrowItemsNeoForge.CACTUS_ARROW.get(), new ProjectileDispenseBehavior(ModArrowItemsNeoForge.CACTUS_ARROW.get()));
        DISPENSER_OBJECT_MAP.put(ModArrowItemsNeoForge.COAL_ARROW.get(), new ProjectileDispenseBehavior(ModArrowItemsNeoForge.COAL_ARROW.get()));
        DISPENSER_OBJECT_MAP.put(ModArrowItemsNeoForge.EMERALD_ARROW.get(), new ProjectileDispenseBehavior(ModArrowItemsNeoForge.EMERALD_ARROW.get()));
        DISPENSER_OBJECT_MAP.put(ModArrowItemsNeoForge.LAPIS_ARROW.get(), new ProjectileDispenseBehavior(ModArrowItemsNeoForge.LAPIS_ARROW.get()));
        DISPENSER_OBJECT_MAP.put(ModArrowItemsNeoForge.OBSIDIAN_ARROW.get(), new ProjectileDispenseBehavior(ModArrowItemsNeoForge.OBSIDIAN_ARROW.get()));
        DISPENSER_OBJECT_MAP.put(ModArrowItemsNeoForge.FLINT_ARROW.get(), new ProjectileDispenseBehavior(ModArrowItemsNeoForge.FLINT_ARROW.get()));

        DISPENSER_OBJECT_MAP.put(ModArrowItemsNeoForge.IRON_ARROW.get(), new ProjectileDispenseBehavior(ModArrowItemsNeoForge.IRON_ARROW.get()));
        DISPENSER_OBJECT_MAP.put(ModArrowItemsNeoForge.COPPER_ARROW.get(), new ProjectileDispenseBehavior(ModArrowItemsNeoForge.COPPER_ARROW.get()));
        DISPENSER_OBJECT_MAP.put(ModArrowItemsNeoForge.GOLD_ARROW.get(), new ProjectileDispenseBehavior(ModArrowItemsNeoForge.GOLD_ARROW.get()));
        DISPENSER_OBJECT_MAP.put(ModArrowItemsNeoForge.DIAMOND_ARROW.get(), new ProjectileDispenseBehavior(ModArrowItemsNeoForge.DIAMOND_ARROW.get()));
        DISPENSER_OBJECT_MAP.put(ModArrowItemsNeoForge.NETHERITE_ARROW.get(), new ProjectileDispenseBehavior(ModArrowItemsNeoForge.NETHERITE_ARROW.get()));

        DispenserBlock.DISPENSER_REGISTRY.putAll(syncronizedDispenserMap);
    }
}
