package com.cursee.more_bows_and_arrows.core.registry;

import com.cursee.more_bows_and_arrows.core.item.ModArrowItemTier;
import com.cursee.more_bows_and_arrows.core.item.TypedArrowItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredHolder;

public class ModArrowItemsNeoForge {
    
    public static void register() {}

    public static final DeferredHolder<Item, Item> ENDER_PEARL_ARROW = RegistryNeoForge.registerItem("ender_pearl_arrow", () -> new TypedArrowItem(ModArrowItemTier.ENDER_PEARL));
    public static final DeferredHolder<Item, Item> FLINT_AND_STEEL_ARROW = RegistryNeoForge.registerItem("flint_and_steel_arrow", () -> new TypedArrowItem(ModArrowItemTier.FLINT_AND_STEEL));
    public static final DeferredHolder<Item, Item> TNT_ARROW = RegistryNeoForge.registerItem("tnt_arrow", () -> new TypedArrowItem(ModArrowItemTier.TNT));
    public static final DeferredHolder<Item, Item> PAPER_ARROW = RegistryNeoForge.registerItem("paper_arrow", () -> new TypedArrowItem(ModArrowItemTier.PAPER));
    public static final DeferredHolder<Item, Item> MOSS_ARROW = RegistryNeoForge.registerItem("moss_arrow", () -> new TypedArrowItem(ModArrowItemTier.MOSS));

    public static final DeferredHolder<Item, Item> AMETHYST_ARROW = RegistryNeoForge.registerItem("amethyst_arrow", () -> new TypedArrowItem(ModArrowItemTier.AMETHYST));
    public static final DeferredHolder<Item, Item> BAMBOO_ARROW = RegistryNeoForge.registerItem("bamboo_arrow", () -> new TypedArrowItem(ModArrowItemTier.BAMBOO));
    public static final DeferredHolder<Item, Item> BLAZE_ROD_ARROW = RegistryNeoForge.registerItem("blaze_rod_arrow", () -> new TypedArrowItem(ModArrowItemTier.BLAZE_ROD));
    public static final DeferredHolder<Item, Item> BONE_ARROW = RegistryNeoForge.registerItem("bone_arrow", () -> new TypedArrowItem(ModArrowItemTier.BONE));
    public static final DeferredHolder<Item, Item> CACTUS_ARROW = RegistryNeoForge.registerItem("cactus_arrow", () -> new TypedArrowItem(ModArrowItemTier.CACTUS));
    public static final DeferredHolder<Item, Item> COAL_ARROW = RegistryNeoForge.registerItem("coal_arrow", () -> new TypedArrowItem(ModArrowItemTier.COAL));
    public static final DeferredHolder<Item, Item> EMERALD_ARROW = RegistryNeoForge.registerItem("emerald_arrow", () -> new TypedArrowItem(ModArrowItemTier.EMERALD));
    public static final DeferredHolder<Item, Item> LAPIS_ARROW = RegistryNeoForge.registerItem("lapis_arrow", () -> new TypedArrowItem(ModArrowItemTier.LAPIS));
    public static final DeferredHolder<Item, Item> OBSIDIAN_ARROW = RegistryNeoForge.registerItem("obsidian_arrow", () -> new TypedArrowItem(ModArrowItemTier.OBSIDIAN));
    public static final DeferredHolder<Item, Item> FLINT_ARROW = RegistryNeoForge.registerItem("flint_arrow", () -> new TypedArrowItem(ModArrowItemTier.FLINT));

    public static final DeferredHolder<Item, Item> IRON_ARROW = RegistryNeoForge.registerItem("iron_arrow", () -> new TypedArrowItem(ModArrowItemTier.IRON));
    public static final DeferredHolder<Item, Item> COPPER_ARROW = RegistryNeoForge.registerItem("copper_arrow", () -> new TypedArrowItem(ModArrowItemTier.COPPER));
    public static final DeferredHolder<Item, Item> GOLD_ARROW = RegistryNeoForge.registerItem("gold_arrow", () -> new TypedArrowItem(ModArrowItemTier.GOLD));
    public static final DeferredHolder<Item, Item> DIAMOND_ARROW = RegistryNeoForge.registerItem("diamond_arrow", () -> new TypedArrowItem(ModArrowItemTier.DIAMOND));
    public static final DeferredHolder<Item, Item> NETHERITE_ARROW = RegistryNeoForge.registerItem("netherite_arrow", () -> new TypedArrowItem(ModArrowItemTier.NETHERITE));
}
