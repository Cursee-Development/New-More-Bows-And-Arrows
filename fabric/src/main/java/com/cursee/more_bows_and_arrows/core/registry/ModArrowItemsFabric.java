package com.cursee.more_bows_and_arrows.core.registry;

import com.cursee.more_bows_and_arrows.core.item.TypedArrowItem;
import net.minecraft.world.item.Item;

public class ModArrowItemsFabric {
    
    public static void register() {}

    public static final Item ENDER_PEARL_ARROW = RegistryFabric.registerItem("ender_pearl_arrow", () -> new TypedArrowItem(TypedArrowItem.Type.ENDER_PEARL));
    public static final Item FLINT_AND_STEEL_ARROW = RegistryFabric.registerItem("flint_and_steel_arrow", () -> new TypedArrowItem(TypedArrowItem.Type.FLINT_AND_STEEL));
    public static final Item TNT_ARROW = RegistryFabric.registerItem("tnt_arrow", () -> new TypedArrowItem(TypedArrowItem.Type.TNT));
    public static final Item PAPER_ARROW = RegistryFabric.registerItem("paper_arrow", () -> new TypedArrowItem(TypedArrowItem.Type.PAPER));
    public static final Item MOSS_ARROW = RegistryFabric.registerItem("moss_arrow", () -> new TypedArrowItem(TypedArrowItem.Type.MOSS));

    public static final Item AMETHYST_ARROW = RegistryFabric.registerItem("amethyst_arrow", () -> new TypedArrowItem(TypedArrowItem.Type.AMETHYST));
    public static final Item BAMBOO_ARROW = RegistryFabric.registerItem("bamboo_arrow", () -> new TypedArrowItem(TypedArrowItem.Type.BAMBOO));
    public static final Item BLAZE_ROD_ARROW = RegistryFabric.registerItem("blaze_rod_arrow", () -> new TypedArrowItem(TypedArrowItem.Type.BLAZE_ROD));
    public static final Item BONE_ARROW = RegistryFabric.registerItem("bone_arrow", () -> new TypedArrowItem(TypedArrowItem.Type.BONE));
    public static final Item CACTUS_ARROW = RegistryFabric.registerItem("cactus_arrow", () -> new TypedArrowItem(TypedArrowItem.Type.CACTUS));
    public static final Item COAL_ARROW = RegistryFabric.registerItem("coal_arrow", () -> new TypedArrowItem(TypedArrowItem.Type.COAL));
    public static final Item EMERALD_ARROW = RegistryFabric.registerItem("emerald_arrow", () -> new TypedArrowItem(TypedArrowItem.Type.EMERALD));
    public static final Item LAPIS_ARROW = RegistryFabric.registerItem("lapis_arrow", () -> new TypedArrowItem(TypedArrowItem.Type.LAPIS));
    public static final Item OBSIDIAN_ARROW = RegistryFabric.registerItem("obsidian_arrow", () -> new TypedArrowItem(TypedArrowItem.Type.OBSIDIAN));
    public static final Item FLINT_ARROW = RegistryFabric.registerItem("flint_arrow", () -> new TypedArrowItem(TypedArrowItem.Type.FLINT));

    public static final Item IRON_ARROW = RegistryFabric.registerItem("iron_arrow", () -> new TypedArrowItem(TypedArrowItem.Type.IRON));
    public static final Item COPPER_ARROW = RegistryFabric.registerItem("copper_arrow", () -> new TypedArrowItem(TypedArrowItem.Type.COPPER));
    public static final Item GOLD_ARROW = RegistryFabric.registerItem("gold_arrow", () -> new TypedArrowItem(TypedArrowItem.Type.GOLD));
    public static final Item DIAMOND_ARROW = RegistryFabric.registerItem("diamond_arrow", () -> new TypedArrowItem(TypedArrowItem.Type.DIAMOND));
    public static final Item NETHERITE_ARROW = RegistryFabric.registerItem("netherite_arrow", () -> new TypedArrowItem(TypedArrowItem.Type.NETHERITE));
}
