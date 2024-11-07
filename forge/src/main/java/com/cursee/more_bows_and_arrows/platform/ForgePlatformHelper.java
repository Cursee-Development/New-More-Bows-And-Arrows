package com.cursee.more_bows_and_arrows.platform;

import com.cursee.more_bows_and_arrows.core.entity.ModEntityTier;
import com.cursee.more_bows_and_arrows.core.item.TypedArrowItem;
import com.cursee.more_bows_and_arrows.core.registry.ModArrowItemsForge;
import com.cursee.more_bows_and_arrows.core.registry.ModEntityTypesForge;
import com.cursee.more_bows_and_arrows.platform.services.IPlatformHelper;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.loading.FMLLoader;

public class ForgePlatformHelper implements IPlatformHelper {

    @Override
    public String getPlatformName() {

        return "Forge";
    }

    @Override
    public boolean isModLoaded(String modId) {

        return ModList.get().isLoaded(modId);
    }

    @Override
    public boolean isDevelopmentEnvironment() {

        return !FMLLoader.isProduction();
    }

    @Override
    public EntityType entityFromTier(ModEntityTier tier) {
        return switch (tier) {
            case AMETHYST -> ModEntityTypesForge.AMETHYST_ARROW.get();
            case BAMBOO -> ModEntityTypesForge.BAMBOO_ARROW.get();
            case BLAZE_ROD -> ModEntityTypesForge.BLAZE_ROD_ARROW.get();
            case BONE -> ModEntityTypesForge.BONE_ARROW.get();
            case CACTUS -> ModEntityTypesForge.CACTUS_ARROW.get();
            case COAL -> ModEntityTypesForge.COAL_ARROW.get();
            case COPPER -> ModEntityTypesForge.COPPER_ARROW.get();
            case DIAMOND -> ModEntityTypesForge.DIAMOND_ARROW.get();
            case EMERALD -> ModEntityTypesForge.EMERALD_ARROW.get();
            case ENDER_PEARL -> ModEntityTypesForge.ENDER_PEARL_ARROW.get();
            case FLINT_AND_STEEL -> ModEntityTypesForge.FLINT_AND_STEEL_ARROW.get();
            case FLINT -> ModEntityTypesForge.FLINT_ARROW.get();
            case GOLD -> ModEntityTypesForge.GOLD_ARROW.get();
            case IRON -> ModEntityTypesForge.IRON_ARROW.get();
            case LAPIS -> ModEntityTypesForge.LAPIS_ARROW.get();
            case MOSS -> ModEntityTypesForge.MOSS_ARROW.get();
            case NETHERITE -> ModEntityTypesForge.NETHERITE_ARROW.get();
            case OBSIDIAN -> ModEntityTypesForge.OBSIDIAN_ARROW.get();
            case PAPER -> ModEntityTypesForge.PAPER_ARROW.get();
            case TNT -> ModEntityTypesForge.TNT_ARROW.get();
        };
    }

    @Override
    public Item itemFromType(TypedArrowItem.Type type) {
        return switch(type) {
            case AMETHYST -> ModArrowItemsForge.AMETHYST_ARROW.get();
            case BAMBOO -> ModArrowItemsForge.BAMBOO_ARROW.get();
            case BLAZE_ROD -> ModArrowItemsForge.BLAZE_ROD_ARROW.get();
            case BONE -> ModArrowItemsForge.BONE_ARROW.get();
            case CACTUS -> ModArrowItemsForge.CACTUS_ARROW.get();
            case COAL -> ModArrowItemsForge.COAL_ARROW.get();
            case COPPER -> ModArrowItemsForge.COPPER_ARROW.get();
            case DIAMOND -> ModArrowItemsForge.DIAMOND_ARROW.get();
            case EMERALD -> ModArrowItemsForge.EMERALD_ARROW.get();
            case ENDER_PEARL -> ModArrowItemsForge.ENDER_PEARL_ARROW.get();
            case FLINT_AND_STEEL -> ModArrowItemsForge.FLINT_AND_STEEL_ARROW.get();
            case FLINT -> ModArrowItemsForge.FLINT_ARROW.get();
            case GOLD -> ModArrowItemsForge.GOLD_ARROW.get();
            case IRON -> ModArrowItemsForge.IRON_ARROW.get();
            case LAPIS -> ModArrowItemsForge.LAPIS_ARROW.get();
            case MOSS -> ModArrowItemsForge.MOSS_ARROW.get();
            case NETHERITE -> ModArrowItemsForge.NETHERITE_ARROW.get();
            case OBSIDIAN -> ModArrowItemsForge.OBSIDIAN_ARROW.get();
            case PAPER -> ModArrowItemsForge.PAPER_ARROW.get();
            case TNT -> ModArrowItemsForge.TNT_ARROW.get();
        };
    }
}