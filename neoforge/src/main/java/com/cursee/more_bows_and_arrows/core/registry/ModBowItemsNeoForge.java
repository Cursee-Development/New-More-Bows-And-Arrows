package com.cursee.more_bows_and_arrows.core.registry;

import com.cursee.more_bows_and_arrows.core.item.ModBowItemTier;
import com.cursee.more_bows_and_arrows.core.item.TieredBowItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredHolder;

public class ModBowItemsNeoForge {

    public static void register() {}

    public static final DeferredHolder<Item, Item> OAK_BOW = RegistryNeoForge.registerItem("oak_bow", () -> new TieredBowItem(ModBowItemTier.WOOD));
    public static final DeferredHolder<Item, Item> STRIPPED_OAK_BOW = RegistryNeoForge.registerItem("stripped_oak_bow", () -> new TieredBowItem(ModBowItemTier.WOOD));
    public static final DeferredHolder<Item, Item> DARK_OAK_BOW = RegistryNeoForge.registerItem("dark_oak_bow", () -> new TieredBowItem(ModBowItemTier.WOOD));
    public static final DeferredHolder<Item, Item> STRIPPED_DARK_OAK_BOW = RegistryNeoForge.registerItem("stripped_dark_oak_bow", () -> new TieredBowItem(ModBowItemTier.WOOD));
    public static final DeferredHolder<Item, Item> SPRUCE_BOW = RegistryNeoForge.registerItem("spruce_bow", () -> new TieredBowItem(ModBowItemTier.WOOD));
    public static final DeferredHolder<Item, Item> STRIPPED_SPRUCE_BOW = RegistryNeoForge.registerItem("stripped_spruce_bow", () -> new TieredBowItem(ModBowItemTier.WOOD));
    public static final DeferredHolder<Item, Item> BIRCH_BOW = RegistryNeoForge.registerItem("birch_bow", () -> new TieredBowItem(ModBowItemTier.WOOD));
    public static final DeferredHolder<Item, Item> STRIPPED_BIRCH_BOW = RegistryNeoForge.registerItem("stripped_birch_bow", () -> new TieredBowItem(ModBowItemTier.WOOD));
    public static final DeferredHolder<Item, Item> JUNGLE_BOW = RegistryNeoForge.registerItem("jungle_bow", () -> new TieredBowItem(ModBowItemTier.WOOD));
    public static final DeferredHolder<Item, Item> STRIPPED_JUNGLE_BOW = RegistryNeoForge.registerItem("stripped_jungle_bow", () -> new TieredBowItem(ModBowItemTier.WOOD));
    public static final DeferredHolder<Item, Item> ACACIA_BOW = RegistryNeoForge.registerItem("acacia_bow", () -> new TieredBowItem(ModBowItemTier.WOOD));
    public static final DeferredHolder<Item, Item> STRIPPED_ACACIA_BOW = RegistryNeoForge.registerItem("stripped_acacia_bow", () -> new TieredBowItem(ModBowItemTier.WOOD));
    public static final DeferredHolder<Item, Item> MANGROVE_BOW = RegistryNeoForge.registerItem("mangrove_bow", () -> new TieredBowItem(ModBowItemTier.WOOD));
    public static final DeferredHolder<Item, Item> STRIPPED_MANGROVE_BOW = RegistryNeoForge.registerItem("stripped_mangrove_bow", () -> new TieredBowItem(ModBowItemTier.WOOD));
    public static final DeferredHolder<Item, Item> CHERRY_BOW = RegistryNeoForge.registerItem("cherry_bow", () -> new TieredBowItem(ModBowItemTier.WOOD));
    public static final DeferredHolder<Item, Item> STRIPPED_CHERRY_BOW = RegistryNeoForge.registerItem("stripped_cherry_bow", () -> new TieredBowItem(ModBowItemTier.WOOD));
    public static final DeferredHolder<Item, Item> BAMBOO_BOW = RegistryNeoForge.registerItem("bamboo_bow", () -> new TieredBowItem(ModBowItemTier.WOOD));
    public static final DeferredHolder<Item, Item> STRIPPED_BAMBOO_BOW = RegistryNeoForge.registerItem("stripped_bamboo_bow", () -> new TieredBowItem(ModBowItemTier.WOOD));
    public static final DeferredHolder<Item, Item> CRIMSON_STEM_BOW = RegistryNeoForge.registerItem("crimson_stem_bow", () -> new TieredBowItem(ModBowItemTier.WOOD));
    public static final DeferredHolder<Item, Item> STRIPPED_CRIMSON_STEM_BOW = RegistryNeoForge.registerItem("stripped_crimson_stem_bow", () -> new TieredBowItem(ModBowItemTier.WOOD));
    public static final DeferredHolder<Item, Item> WARPED_STEM_BOW = RegistryNeoForge.registerItem("warped_stem_bow", () -> new TieredBowItem(ModBowItemTier.WOOD));
    public static final DeferredHolder<Item, Item> STRIPPED_WARPED_STEM_BOW = RegistryNeoForge.registerItem("stripped_warped_stem_bow", () -> new TieredBowItem(ModBowItemTier.WOOD));

    public static final DeferredHolder<Item, Item> PAPER_BOW = RegistryNeoForge.registerItem("paper_bow", () -> new TieredBowItem(ModBowItemTier.PAPER));
    public static final DeferredHolder<Item, Item> MOSS_BOW = RegistryNeoForge.registerItem("moss_bow", () -> new TieredBowItem(ModBowItemTier.MOSS));
    public static final DeferredHolder<Item, Item> LAPIS_BOW = RegistryNeoForge.registerItem("lapis_bow", () -> new TieredBowItem(ModBowItemTier.LAPIS));
    public static final DeferredHolder<Item, Item> AMETHYST_BOW = RegistryNeoForge.registerItem("amethyst_bow", () -> new TieredBowItem(ModBowItemTier.AMETHYST));
    public static final DeferredHolder<Item, Item> BONE_BOW = RegistryNeoForge.registerItem("bone_bow", () -> new TieredBowItem(ModBowItemTier.BONE));
    public static final DeferredHolder<Item, Item> COAL_BOW = RegistryNeoForge.registerItem("coal_bow", () -> new TieredBowItem(ModBowItemTier.COAL));
    public static final DeferredHolder<Item, Item> EMERALD_BOW = RegistryNeoForge.registerItem("emerald_bow", () -> new TieredBowItem(ModBowItemTier.EMERALD));
    public static final DeferredHolder<Item, Item> BLAZE_BOW = RegistryNeoForge.registerItem("blaze_bow", () -> new TieredBowItem(ModBowItemTier.BLAZE));
    public static final DeferredHolder<Item, Item> OBSIDIAN_BOW = RegistryNeoForge.registerItem("obsidian_bow", () -> new TieredBowItem(ModBowItemTier.OBSIDIAN));

    public static final DeferredHolder<Item, Item> GOLD_BOW = RegistryNeoForge.registerItem("gold_bow", () -> new TieredBowItem(ModBowItemTier.GOLD));
    public static final DeferredHolder<Item, Item> IRON_BOW = RegistryNeoForge.registerItem("iron_bow", () -> new TieredBowItem(ModBowItemTier.IRON));
    public static final DeferredHolder<Item, Item> COPPER_BOW = RegistryNeoForge.registerItem("copper_bow", () -> new TieredBowItem(ModBowItemTier.COPPER));
    public static final DeferredHolder<Item, Item> DIAMOND_BOW = RegistryNeoForge.registerItem("diamond_bow", () -> new TieredBowItem(ModBowItemTier.DIAMOND));
    public static final DeferredHolder<Item, Item> NETHERITE_BOW = RegistryNeoForge.registerItem("netherite_bow", () -> new TieredBowItem(ModBowItemTier.NETHERITE));
}
