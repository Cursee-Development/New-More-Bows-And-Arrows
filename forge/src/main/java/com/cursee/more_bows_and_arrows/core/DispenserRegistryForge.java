package com.cursee.more_bows_and_arrows.core;

import com.cursee.more_bows_and_arrows.core.registry.ModArrowItemsForge;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMaps;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.minecraft.core.dispenser.DispenseItemBehavior;
import net.minecraft.core.dispenser.ProjectileDispenseBehavior;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.DispenserBlock;

import java.util.Map;

public class DispenserRegistryForge {

    public static Object2ObjectMap<Item, DispenseItemBehavior> DISPENSER_OBJECT_MAP = new Object2ObjectOpenHashMap<>();

    public static void register() {
        Map<Item, DispenseItemBehavior> syncronizedDispenserMap = Object2ObjectMaps.synchronize(DISPENSER_OBJECT_MAP);

        DISPENSER_OBJECT_MAP.put(ModArrowItemsForge.FLINT_AND_STEEL_ARROW.get(), new ProjectileDispenseBehavior(ModArrowItemsForge.FLINT_AND_STEEL_ARROW.get()));
        DISPENSER_OBJECT_MAP.put(ModArrowItemsForge.ENDER_PEARL_ARROW.get(), new ProjectileDispenseBehavior(ModArrowItemsForge.ENDER_PEARL_ARROW.get()));
        DISPENSER_OBJECT_MAP.put(ModArrowItemsForge.TNT_ARROW.get(), new ProjectileDispenseBehavior(ModArrowItemsForge.TNT_ARROW.get()));
        DISPENSER_OBJECT_MAP.put(ModArrowItemsForge.PAPER_ARROW.get(), new ProjectileDispenseBehavior(ModArrowItemsForge.PAPER_ARROW.get()));
        DISPENSER_OBJECT_MAP.put(ModArrowItemsForge.MOSS_ARROW.get(), new ProjectileDispenseBehavior(ModArrowItemsForge.MOSS_ARROW.get()));

        DISPENSER_OBJECT_MAP.put(ModArrowItemsForge.AMETHYST_ARROW.get(), new ProjectileDispenseBehavior(ModArrowItemsForge.AMETHYST_ARROW.get()));
        DISPENSER_OBJECT_MAP.put(ModArrowItemsForge.BAMBOO_ARROW.get(), new ProjectileDispenseBehavior(ModArrowItemsForge.BAMBOO_ARROW.get()));
        DISPENSER_OBJECT_MAP.put(ModArrowItemsForge.BLAZE_ROD_ARROW.get(), new ProjectileDispenseBehavior(ModArrowItemsForge.BLAZE_ROD_ARROW.get()));
        DISPENSER_OBJECT_MAP.put(ModArrowItemsForge.BONE_ARROW.get(), new ProjectileDispenseBehavior(ModArrowItemsForge.BONE_ARROW.get()));
        DISPENSER_OBJECT_MAP.put(ModArrowItemsForge.CACTUS_ARROW.get(), new ProjectileDispenseBehavior(ModArrowItemsForge.CACTUS_ARROW.get()));
        DISPENSER_OBJECT_MAP.put(ModArrowItemsForge.COAL_ARROW.get(), new ProjectileDispenseBehavior(ModArrowItemsForge.COAL_ARROW.get()));
        DISPENSER_OBJECT_MAP.put(ModArrowItemsForge.EMERALD_ARROW.get(), new ProjectileDispenseBehavior(ModArrowItemsForge.EMERALD_ARROW.get()));
        DISPENSER_OBJECT_MAP.put(ModArrowItemsForge.LAPIS_ARROW.get(), new ProjectileDispenseBehavior(ModArrowItemsForge.LAPIS_ARROW.get()));
        DISPENSER_OBJECT_MAP.put(ModArrowItemsForge.OBSIDIAN_ARROW.get(), new ProjectileDispenseBehavior(ModArrowItemsForge.OBSIDIAN_ARROW.get()));
        DISPENSER_OBJECT_MAP.put(ModArrowItemsForge.FLINT_ARROW.get(), new ProjectileDispenseBehavior(ModArrowItemsForge.FLINT_ARROW.get()));

        DISPENSER_OBJECT_MAP.put(ModArrowItemsForge.IRON_ARROW.get(), new ProjectileDispenseBehavior(ModArrowItemsForge.IRON_ARROW.get()));
        DISPENSER_OBJECT_MAP.put(ModArrowItemsForge.COPPER_ARROW.get(), new ProjectileDispenseBehavior(ModArrowItemsForge.COPPER_ARROW.get()));
        DISPENSER_OBJECT_MAP.put(ModArrowItemsForge.GOLD_ARROW.get(), new ProjectileDispenseBehavior(ModArrowItemsForge.GOLD_ARROW.get()));
        DISPENSER_OBJECT_MAP.put(ModArrowItemsForge.DIAMOND_ARROW.get(), new ProjectileDispenseBehavior(ModArrowItemsForge.DIAMOND_ARROW.get()));
        DISPENSER_OBJECT_MAP.put(ModArrowItemsForge.NETHERITE_ARROW.get(), new ProjectileDispenseBehavior(ModArrowItemsForge.NETHERITE_ARROW.get()));

        DispenserBlock.DISPENSER_REGISTRY.putAll(syncronizedDispenserMap);
    }
}
