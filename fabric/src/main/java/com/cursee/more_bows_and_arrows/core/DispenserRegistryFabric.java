package com.cursee.more_bows_and_arrows.core;

import com.cursee.more_bows_and_arrows.core.registry.ModArrowItemsFabric;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMaps;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.minecraft.core.dispenser.DispenseItemBehavior;
import net.minecraft.core.dispenser.ProjectileDispenseBehavior;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.DispenserBlock;

import java.util.Map;

public class DispenserRegistryFabric {

    public static Object2ObjectMap<Item, DispenseItemBehavior> DISPENSER_OBJECT_MAP = new Object2ObjectOpenHashMap<>();

    public static void register() {
        Map<Item, DispenseItemBehavior> syncronizedDispenserMap = Object2ObjectMaps.synchronize(DISPENSER_OBJECT_MAP);

        DISPENSER_OBJECT_MAP.put(ModArrowItemsFabric.FLINT_AND_STEEL_ARROW, new ProjectileDispenseBehavior(ModArrowItemsFabric.FLINT_AND_STEEL_ARROW));
        DISPENSER_OBJECT_MAP.put(ModArrowItemsFabric.ENDER_PEARL_ARROW, new ProjectileDispenseBehavior(ModArrowItemsFabric.ENDER_PEARL_ARROW));
        DISPENSER_OBJECT_MAP.put(ModArrowItemsFabric.TNT_ARROW, new ProjectileDispenseBehavior(ModArrowItemsFabric.TNT_ARROW));
        DISPENSER_OBJECT_MAP.put(ModArrowItemsFabric.PAPER_ARROW, new ProjectileDispenseBehavior(ModArrowItemsFabric.PAPER_ARROW));
        DISPENSER_OBJECT_MAP.put(ModArrowItemsFabric.MOSS_ARROW, new ProjectileDispenseBehavior(ModArrowItemsFabric.MOSS_ARROW));

        DISPENSER_OBJECT_MAP.put(ModArrowItemsFabric.AMETHYST_ARROW, new ProjectileDispenseBehavior(ModArrowItemsFabric.AMETHYST_ARROW));
        DISPENSER_OBJECT_MAP.put(ModArrowItemsFabric.BAMBOO_ARROW, new ProjectileDispenseBehavior(ModArrowItemsFabric.BAMBOO_ARROW));
        DISPENSER_OBJECT_MAP.put(ModArrowItemsFabric.BLAZE_ROD_ARROW, new ProjectileDispenseBehavior(ModArrowItemsFabric.BLAZE_ROD_ARROW));
        DISPENSER_OBJECT_MAP.put(ModArrowItemsFabric.BONE_ARROW, new ProjectileDispenseBehavior(ModArrowItemsFabric.BONE_ARROW));
        DISPENSER_OBJECT_MAP.put(ModArrowItemsFabric.CACTUS_ARROW, new ProjectileDispenseBehavior(ModArrowItemsFabric.CACTUS_ARROW));
        DISPENSER_OBJECT_MAP.put(ModArrowItemsFabric.COAL_ARROW, new ProjectileDispenseBehavior(ModArrowItemsFabric.COAL_ARROW));
        DISPENSER_OBJECT_MAP.put(ModArrowItemsFabric.EMERALD_ARROW, new ProjectileDispenseBehavior(ModArrowItemsFabric.EMERALD_ARROW));
        DISPENSER_OBJECT_MAP.put(ModArrowItemsFabric.LAPIS_ARROW, new ProjectileDispenseBehavior(ModArrowItemsFabric.LAPIS_ARROW));
        DISPENSER_OBJECT_MAP.put(ModArrowItemsFabric.OBSIDIAN_ARROW, new ProjectileDispenseBehavior(ModArrowItemsFabric.OBSIDIAN_ARROW));
        DISPENSER_OBJECT_MAP.put(ModArrowItemsFabric.FLINT_ARROW, new ProjectileDispenseBehavior(ModArrowItemsFabric.FLINT_ARROW));

        DISPENSER_OBJECT_MAP.put(ModArrowItemsFabric.IRON_ARROW, new ProjectileDispenseBehavior(ModArrowItemsFabric.IRON_ARROW));
        DISPENSER_OBJECT_MAP.put(ModArrowItemsFabric.COPPER_ARROW, new ProjectileDispenseBehavior(ModArrowItemsFabric.COPPER_ARROW));
        DISPENSER_OBJECT_MAP.put(ModArrowItemsFabric.GOLD_ARROW, new ProjectileDispenseBehavior(ModArrowItemsFabric.GOLD_ARROW));
        DISPENSER_OBJECT_MAP.put(ModArrowItemsFabric.DIAMOND_ARROW, new ProjectileDispenseBehavior(ModArrowItemsFabric.DIAMOND_ARROW));
        DISPENSER_OBJECT_MAP.put(ModArrowItemsFabric.NETHERITE_ARROW, new ProjectileDispenseBehavior(ModArrowItemsFabric.NETHERITE_ARROW));

        DispenserBlock.DISPENSER_REGISTRY.putAll(syncronizedDispenserMap);
    }
}
