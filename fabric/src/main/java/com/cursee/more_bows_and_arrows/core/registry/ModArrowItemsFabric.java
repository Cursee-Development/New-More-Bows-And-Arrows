package com.cursee.more_bows_and_arrows.core.registry;

import com.cursee.more_bows_and_arrows.core.item.ModArrowItemTier;
import com.cursee.more_bows_and_arrows.core.item.TypedArrowItem;
import net.minecraft.world.item.Item;

public class ModArrowItemsFabric {
    
    public static void register() {}

    public static final Item ENDER_PEARL_ARROW = RegistryFabric.registerItem("ender_pearl_arrow", () -> new TypedArrowItem(ModArrowItemTier.ENDER_PEARL));
    public static final Item FLINT_AND_STEEL_ARROW = RegistryFabric.registerItem("flint_and_steel_arrow", () -> new TypedArrowItem(ModArrowItemTier.FLINT_AND_STEEL));
    public static final Item TNT_ARROW = RegistryFabric.registerItem("tnt_arrow", () -> new TypedArrowItem(ModArrowItemTier.TNT));
    public static final Item PAPER_ARROW = RegistryFabric.registerItem("paper_arrow", () -> new TypedArrowItem(ModArrowItemTier.PAPER));
    public static final Item MOSS_ARROW = RegistryFabric.registerItem("moss_arrow", () -> new TypedArrowItem(ModArrowItemTier.MOSS));

    public static final Item AMETHYST_ARROW = RegistryFabric.registerItem("amethyst_arrow", () -> new TypedArrowItem(ModArrowItemTier.AMETHYST));
    public static final Item BAMBOO_ARROW = RegistryFabric.registerItem("bamboo_arrow", () -> new TypedArrowItem(ModArrowItemTier.BAMBOO));
    public static final Item BLAZE_ROD_ARROW = RegistryFabric.registerItem("blaze_rod_arrow", () -> new TypedArrowItem(ModArrowItemTier.BLAZE_ROD));
    public static final Item BONE_ARROW = RegistryFabric.registerItem("bone_arrow", () -> new TypedArrowItem(ModArrowItemTier.BONE));
    public static final Item CACTUS_ARROW = RegistryFabric.registerItem("cactus_arrow", () -> new TypedArrowItem(ModArrowItemTier.CACTUS));
    public static final Item COAL_ARROW = RegistryFabric.registerItem("coal_arrow", () -> new TypedArrowItem(ModArrowItemTier.COAL));
    public static final Item EMERALD_ARROW = RegistryFabric.registerItem("emerald_arrow", () -> new TypedArrowItem(ModArrowItemTier.EMERALD));
    public static final Item LAPIS_ARROW = RegistryFabric.registerItem("lapis_arrow", () -> new TypedArrowItem(ModArrowItemTier.LAPIS));
    public static final Item OBSIDIAN_ARROW = RegistryFabric.registerItem("obsidian_arrow", () -> new TypedArrowItem(ModArrowItemTier.OBSIDIAN));
    public static final Item FLINT_ARROW = RegistryFabric.registerItem("flint_arrow", () -> new TypedArrowItem(ModArrowItemTier.FLINT));

    public static final Item IRON_ARROW = RegistryFabric.registerItem("iron_arrow", () -> new TypedArrowItem(ModArrowItemTier.IRON));
    public static final Item COPPER_ARROW = RegistryFabric.registerItem("copper_arrow", () -> new TypedArrowItem(ModArrowItemTier.COPPER));
    public static final Item GOLD_ARROW = RegistryFabric.registerItem("gold_arrow", () -> new TypedArrowItem(ModArrowItemTier.GOLD));
    public static final Item DIAMOND_ARROW = RegistryFabric.registerItem("diamond_arrow", () -> new TypedArrowItem(ModArrowItemTier.DIAMOND));
    public static final Item NETHERITE_ARROW = RegistryFabric.registerItem("netherite_arrow", () -> new TypedArrowItem(ModArrowItemTier.NETHERITE));
}
