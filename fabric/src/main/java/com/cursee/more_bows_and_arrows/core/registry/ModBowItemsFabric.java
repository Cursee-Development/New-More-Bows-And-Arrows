package com.cursee.more_bows_and_arrows.core.registry;

import com.cursee.more_bows_and_arrows.core.item.ModItemTiers;
import com.cursee.more_bows_and_arrows.core.item.TieredBowItem;
import net.minecraft.world.item.Item;

public class ModBowItemsFabric {

    public static void register() {}

    public static final Item OAK_BOW = RegistryFabric.registerItem("oak_bow", () -> new TieredBowItem(ModItemTiers.WOOD));
    public static final Item STRIPPED_OAK_BOW = RegistryFabric.registerItem("stripped_oak_bow", () -> new TieredBowItem(ModItemTiers.WOOD));
    public static final Item DARK_OAK_BOW = RegistryFabric.registerItem("dark_oak_bow", () -> new TieredBowItem(ModItemTiers.WOOD));
    public static final Item STRIPPED_DARK_OAK_BOW = RegistryFabric.registerItem("stripped_dark_oak_bow", () -> new TieredBowItem(ModItemTiers.WOOD));
    public static final Item SPRUCE_BOW = RegistryFabric.registerItem("spruce_bow", () -> new TieredBowItem(ModItemTiers.WOOD));
    public static final Item STRIPPED_SPRUCE_BOW = RegistryFabric.registerItem("stripped_spruce_bow", () -> new TieredBowItem(ModItemTiers.WOOD));
    public static final Item BIRCH_BOW = RegistryFabric.registerItem("birch_bow", () -> new TieredBowItem(ModItemTiers.WOOD));
    public static final Item STRIPPED_BIRCH_BOW = RegistryFabric.registerItem("stripped_birch_bow", () -> new TieredBowItem(ModItemTiers.WOOD));
    public static final Item JUNGLE_BOW = RegistryFabric.registerItem("jungle_bow", () -> new TieredBowItem(ModItemTiers.WOOD));
    public static final Item STRIPPED_JUNGLE_BOW = RegistryFabric.registerItem("stripped_jungle_bow", () -> new TieredBowItem(ModItemTiers.WOOD));
    public static final Item ACACIA_BOW = RegistryFabric.registerItem("acacia_bow", () -> new TieredBowItem(ModItemTiers.WOOD));
    public static final Item STRIPPED_ACACIA_BOW = RegistryFabric.registerItem("stripped_acacia_bow", () -> new TieredBowItem(ModItemTiers.WOOD));
    public static final Item MANGROVE_BOW = RegistryFabric.registerItem("mangrove_bow", () -> new TieredBowItem(ModItemTiers.WOOD));
    public static final Item STRIPPED_MANGROVE_BOW = RegistryFabric.registerItem("stripped_mangrove_bow", () -> new TieredBowItem(ModItemTiers.WOOD));
    public static final Item CHERRY_BOW = RegistryFabric.registerItem("cherry_bow", () -> new TieredBowItem(ModItemTiers.WOOD));
    public static final Item STRIPPED_CHERRY_BOW = RegistryFabric.registerItem("stripped_cherry_bow", () -> new TieredBowItem(ModItemTiers.WOOD));
    public static final Item BAMBOO_BOW = RegistryFabric.registerItem("bamboo_bow", () -> new TieredBowItem(ModItemTiers.WOOD));
    public static final Item STRIPPED_BAMBOO_BOW = RegistryFabric.registerItem("stripped_bamboo_bow", () -> new TieredBowItem(ModItemTiers.WOOD));
    public static final Item CRIMSON_STEM_BOW = RegistryFabric.registerItem("crimson_stem_bow", () -> new TieredBowItem(ModItemTiers.WOOD));
    public static final Item STRIPPED_CRIMSON_STEM_BOW = RegistryFabric.registerItem("stripped_crimson_stem_bow", () -> new TieredBowItem(ModItemTiers.WOOD));
    public static final Item WARPED_STEM_BOW = RegistryFabric.registerItem("warped_stem_bow", () -> new TieredBowItem(ModItemTiers.WOOD));
    public static final Item STRIPPED_WARPED_STEM_BOW = RegistryFabric.registerItem("stripped_warped_stem_bow", () -> new TieredBowItem(ModItemTiers.WOOD));

    public static final Item PAPER_BOW = RegistryFabric.registerItem("paper_bow", () -> new TieredBowItem(ModItemTiers.PAPER));
    public static final Item MOSS_BOW = RegistryFabric.registerItem("moss_bow", () -> new TieredBowItem(ModItemTiers.MOSS));
    public static final Item LAPIS_BOW = RegistryFabric.registerItem("lapis_bow", () -> new TieredBowItem(ModItemTiers.LAPIS));
    public static final Item AMETHYST_BOW = RegistryFabric.registerItem("amethyst_bow", () -> new TieredBowItem(ModItemTiers.AMETHYST));
    public static final Item BONE_BOW = RegistryFabric.registerItem("bone_bow", () -> new TieredBowItem(ModItemTiers.BONE));
    public static final Item COAL_BOW = RegistryFabric.registerItem("coal_bow", () -> new TieredBowItem(ModItemTiers.COAL));
    public static final Item EMERALD_BOW = RegistryFabric.registerItem("emerald_bow", () -> new TieredBowItem(ModItemTiers.EMERALD));
    public static final Item BLAZE_BOW = RegistryFabric.registerItem("blaze_bow", () -> new TieredBowItem(ModItemTiers.BLAZE));
    public static final Item OBSIDIAN_BOW = RegistryFabric.registerItem("obsidian_bow", () -> new TieredBowItem(ModItemTiers.OBSIDIAN));

    public static final Item GOLD_BOW = RegistryFabric.registerItem("gold_bow", () -> new TieredBowItem(ModItemTiers.GOLD));
    public static final Item IRON_BOW = RegistryFabric.registerItem("iron_bow", () -> new TieredBowItem(ModItemTiers.IRON));
    public static final Item COPPER_BOW = RegistryFabric.registerItem("copper_bow", () -> new TieredBowItem(ModItemTiers.COPPER));
    public static final Item DIAMOND_BOW = RegistryFabric.registerItem("diamond_bow", () -> new TieredBowItem(ModItemTiers.DIAMOND));
    public static final Item NETHERITE_BOW = RegistryFabric.registerItem("netherite_bow", () -> new TieredBowItem(ModItemTiers.NETHERITE));
}
