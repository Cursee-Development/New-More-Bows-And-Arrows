package com.cursee.more_bows_and_arrows.core.registry;

import com.cursee.more_bows_and_arrows.core.item.ModArrowItemTier;
import com.cursee.more_bows_and_arrows.core.item.TypedArrowItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

public class ModArrowItemsForge {
    
    public static void register() {}

    public static final RegistryObject<Item> ENDER_PEARL_ARROW = RegistryForge.registerItem("ender_pearl_arrow", () -> new TypedArrowItem(ModArrowItemTier.ENDER_PEARL));
    public static final RegistryObject<Item> FLINT_AND_STEEL_ARROW = RegistryForge.registerItem("flint_and_steel_arrow", () -> new TypedArrowItem(ModArrowItemTier.FLINT_AND_STEEL));
    public static final RegistryObject<Item> TNT_ARROW = RegistryForge.registerItem("tnt_arrow", () -> new TypedArrowItem(ModArrowItemTier.TNT));
    public static final RegistryObject<Item> PAPER_ARROW = RegistryForge.registerItem("paper_arrow", () -> new TypedArrowItem(ModArrowItemTier.PAPER));
    public static final RegistryObject<Item> MOSS_ARROW = RegistryForge.registerItem("moss_arrow", () -> new TypedArrowItem(ModArrowItemTier.MOSS));

    public static final RegistryObject<Item> AMETHYST_ARROW = RegistryForge.registerItem("amethyst_arrow", () -> new TypedArrowItem(ModArrowItemTier.AMETHYST));
    public static final RegistryObject<Item> BAMBOO_ARROW = RegistryForge.registerItem("bamboo_arrow", () -> new TypedArrowItem(ModArrowItemTier.BAMBOO));
    public static final RegistryObject<Item> BLAZE_ROD_ARROW = RegistryForge.registerItem("blaze_rod_arrow", () -> new TypedArrowItem(ModArrowItemTier.BLAZE_ROD));
    public static final RegistryObject<Item> BONE_ARROW = RegistryForge.registerItem("bone_arrow", () -> new TypedArrowItem(ModArrowItemTier.BONE));
    public static final RegistryObject<Item> CACTUS_ARROW = RegistryForge.registerItem("cactus_arrow", () -> new TypedArrowItem(ModArrowItemTier.CACTUS));
    public static final RegistryObject<Item> COAL_ARROW = RegistryForge.registerItem("coal_arrow", () -> new TypedArrowItem(ModArrowItemTier.COAL));
    public static final RegistryObject<Item> EMERALD_ARROW = RegistryForge.registerItem("emerald_arrow", () -> new TypedArrowItem(ModArrowItemTier.EMERALD));
    public static final RegistryObject<Item> LAPIS_ARROW = RegistryForge.registerItem("lapis_arrow", () -> new TypedArrowItem(ModArrowItemTier.LAPIS));
    public static final RegistryObject<Item> OBSIDIAN_ARROW = RegistryForge.registerItem("obsidian_arrow", () -> new TypedArrowItem(ModArrowItemTier.OBSIDIAN));
    public static final RegistryObject<Item> FLINT_ARROW = RegistryForge.registerItem("flint_arrow", () -> new TypedArrowItem(ModArrowItemTier.FLINT));

    public static final RegistryObject<Item> IRON_ARROW = RegistryForge.registerItem("iron_arrow", () -> new TypedArrowItem(ModArrowItemTier.IRON));
    public static final RegistryObject<Item> COPPER_ARROW = RegistryForge.registerItem("copper_arrow", () -> new TypedArrowItem(ModArrowItemTier.COPPER));
    public static final RegistryObject<Item> GOLD_ARROW = RegistryForge.registerItem("gold_arrow", () -> new TypedArrowItem(ModArrowItemTier.GOLD));
    public static final RegistryObject<Item> DIAMOND_ARROW = RegistryForge.registerItem("diamond_arrow", () -> new TypedArrowItem(ModArrowItemTier.DIAMOND));
    public static final RegistryObject<Item> NETHERITE_ARROW = RegistryForge.registerItem("netherite_arrow", () -> new TypedArrowItem(ModArrowItemTier.NETHERITE));
}
