package com.cursee.more_bows_and_arrows.platform;

import com.cursee.more_bows_and_arrows.core.item.ModArrowItemTier;
import com.cursee.more_bows_and_arrows.core.registry.ModArrowItemsFabric;
import com.cursee.more_bows_and_arrows.core.registry.ModBowItemsFabric;
import com.cursee.more_bows_and_arrows.core.registry.ModEntityTypesFabric;
import com.cursee.more_bows_and_arrows.platform.services.IPlatformHelper;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;

public class FabricPlatformHelper implements IPlatformHelper {

    @Override
    public String getPlatformName() {
        return "Fabric";
    }

    @Override
    public boolean isModLoaded(String modId) {

        return FabricLoader.getInstance().isModLoaded(modId);
    }

    @Override
    public boolean isDevelopmentEnvironment() {

        return FabricLoader.getInstance().isDevelopmentEnvironment();
    }

    @Override
    public EntityType entityFromTier(ModArrowItemTier tier) {
        return switch (tier) {
            case AMETHYST -> ModEntityTypesFabric.AMETHYST_ARROW;
            case BAMBOO -> ModEntityTypesFabric.BAMBOO_ARROW;
            case BLAZE_ROD -> ModEntityTypesFabric.BLAZE_ROD_ARROW;
            case BONE -> ModEntityTypesFabric.BONE_ARROW;
            case CACTUS -> ModEntityTypesFabric.CACTUS_ARROW;
            case COAL -> ModEntityTypesFabric.COAL_ARROW;
            case COPPER -> ModEntityTypesFabric.COPPER_ARROW;
            case DIAMOND -> ModEntityTypesFabric.DIAMOND_ARROW;
            case EMERALD -> ModEntityTypesFabric.EMERALD_ARROW;
            case ENDER_PEARL -> ModEntityTypesFabric.ENDER_PEARL_ARROW;
            case FLINT_AND_STEEL -> ModEntityTypesFabric.FLINT_AND_STEEL_ARROW;
            case FLINT -> ModEntityTypesFabric.FLINT_ARROW;
            case GOLD -> ModEntityTypesFabric.GOLD_ARROW;
            case IRON -> ModEntityTypesFabric.IRON_ARROW;
            case LAPIS -> ModEntityTypesFabric.LAPIS_ARROW;
            case MOSS -> ModEntityTypesFabric.MOSS_ARROW;
            case NETHERITE -> ModEntityTypesFabric.NETHERITE_ARROW;
            case OBSIDIAN -> ModEntityTypesFabric.OBSIDIAN_ARROW;
            case PAPER -> ModEntityTypesFabric.PAPER_ARROW;
            case TNT -> ModEntityTypesFabric.TNT_ARROW;
        };
    }

    @Override
    public Item itemFromType(ModArrowItemTier type) {
        return switch(type) {
            case AMETHYST -> ModArrowItemsFabric.AMETHYST_ARROW;
            case BAMBOO -> ModArrowItemsFabric.BAMBOO_ARROW;
            case BLAZE_ROD -> ModArrowItemsFabric.BLAZE_ROD_ARROW;
            case BONE -> ModArrowItemsFabric.BONE_ARROW;
            case CACTUS -> ModArrowItemsFabric.CACTUS_ARROW;
            case COAL -> ModArrowItemsFabric.COAL_ARROW;
            case COPPER -> ModArrowItemsFabric.COPPER_ARROW;
            case DIAMOND -> ModArrowItemsFabric.DIAMOND_ARROW;
            case EMERALD -> ModArrowItemsFabric.EMERALD_ARROW;
            case ENDER_PEARL -> ModArrowItemsFabric.ENDER_PEARL_ARROW;
            case FLINT_AND_STEEL -> ModArrowItemsFabric.FLINT_AND_STEEL_ARROW;
            case FLINT -> ModArrowItemsFabric.FLINT_ARROW;
            case GOLD -> ModArrowItemsFabric.GOLD_ARROW;
            case IRON -> ModArrowItemsFabric.IRON_ARROW;
            case LAPIS -> ModArrowItemsFabric.LAPIS_ARROW;
            case MOSS -> ModArrowItemsFabric.MOSS_ARROW;
            case NETHERITE -> ModArrowItemsFabric.NETHERITE_ARROW;
            case OBSIDIAN -> ModArrowItemsFabric.OBSIDIAN_ARROW;
            case PAPER -> ModArrowItemsFabric.PAPER_ARROW;
            case TNT -> ModArrowItemsFabric.TNT_ARROW;
        };
    }

    @Override
    public Item blaze_bow() {
        return ModBowItemsFabric.BLAZE_BOW;
    }

    @Override
    public Item bamboo_bow() {
        return ModBowItemsFabric.BAMBOO_BOW;
    }

    @Override
    public Item copper_bow() {
        return ModBowItemsFabric.COPPER_BOW;
    }

    @Override
    public Item moss_bow() {
        return ModBowItemsFabric.MOSS_BOW;
    }

    @Override
    public Item paper_bow() {
        return ModBowItemsFabric.PAPER_BOW;
    }

    @Override
    public Item iron_bow() {
        return ModBowItemsFabric.IRON_BOW;
    }
}
