package com.cursee.more_bows_and_arrows.platform;

import com.cursee.more_bows_and_arrows.core.item.ModArrowItemTier;
import com.cursee.more_bows_and_arrows.core.registry.ModArrowItemsNeoForge;
import com.cursee.more_bows_and_arrows.core.registry.ModBowItemsNeoForge;
import com.cursee.more_bows_and_arrows.core.registry.ModEntityTypesNeoForge;
import com.cursee.more_bows_and_arrows.platform.services.IPlatformHelper;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.neoforged.fml.ModList;
import net.neoforged.fml.loading.FMLLoader;

public class NeoForgePlatformHelper implements IPlatformHelper {

    @Override
    public String getPlatformName() {

        return "NeoForge";
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
    public EntityType entityFromTier(ModArrowItemTier tier) {
        return switch (tier) {
            case AMETHYST -> ModEntityTypesNeoForge.AMETHYST_ARROW.get();
            case BAMBOO -> ModEntityTypesNeoForge.BAMBOO_ARROW.get();
            case BLAZE_ROD -> ModEntityTypesNeoForge.BLAZE_ROD_ARROW.get();
            case BONE -> ModEntityTypesNeoForge.BONE_ARROW.get();
            case CACTUS -> ModEntityTypesNeoForge.CACTUS_ARROW.get();
            case COAL -> ModEntityTypesNeoForge.COAL_ARROW.get();
            case COPPER -> ModEntityTypesNeoForge.COPPER_ARROW.get();
            case DIAMOND -> ModEntityTypesNeoForge.DIAMOND_ARROW.get();
            case EMERALD -> ModEntityTypesNeoForge.EMERALD_ARROW.get();
            case ENDER_PEARL -> ModEntityTypesNeoForge.ENDER_PEARL_ARROW.get();
            case FLINT_AND_STEEL -> ModEntityTypesNeoForge.FLINT_AND_STEEL_ARROW.get();
            case FLINT -> ModEntityTypesNeoForge.FLINT_ARROW.get();
            case GOLD -> ModEntityTypesNeoForge.GOLD_ARROW.get();
            case IRON -> ModEntityTypesNeoForge.IRON_ARROW.get();
            case LAPIS -> ModEntityTypesNeoForge.LAPIS_ARROW.get();
            case MOSS -> ModEntityTypesNeoForge.MOSS_ARROW.get();
            case NETHERITE -> ModEntityTypesNeoForge.NETHERITE_ARROW.get();
            case OBSIDIAN -> ModEntityTypesNeoForge.OBSIDIAN_ARROW.get();
            case PAPER -> ModEntityTypesNeoForge.PAPER_ARROW.get();
            case TNT -> ModEntityTypesNeoForge.TNT_ARROW.get();
        };
    }

    @Override
    public Item itemFromType(ModArrowItemTier type) {
        return switch(type) {
            case AMETHYST -> ModArrowItemsNeoForge.AMETHYST_ARROW.get();
            case BAMBOO -> ModArrowItemsNeoForge.BAMBOO_ARROW.get();
            case BLAZE_ROD -> ModArrowItemsNeoForge.BLAZE_ROD_ARROW.get();
            case BONE -> ModArrowItemsNeoForge.BONE_ARROW.get();
            case CACTUS -> ModArrowItemsNeoForge.CACTUS_ARROW.get();
            case COAL -> ModArrowItemsNeoForge.COAL_ARROW.get();
            case COPPER -> ModArrowItemsNeoForge.COPPER_ARROW.get();
            case DIAMOND -> ModArrowItemsNeoForge.DIAMOND_ARROW.get();
            case EMERALD -> ModArrowItemsNeoForge.EMERALD_ARROW.get();
            case ENDER_PEARL -> ModArrowItemsNeoForge.ENDER_PEARL_ARROW.get();
            case FLINT_AND_STEEL -> ModArrowItemsNeoForge.FLINT_AND_STEEL_ARROW.get();
            case FLINT -> ModArrowItemsNeoForge.FLINT_ARROW.get();
            case GOLD -> ModArrowItemsNeoForge.GOLD_ARROW.get();
            case IRON -> ModArrowItemsNeoForge.IRON_ARROW.get();
            case LAPIS -> ModArrowItemsNeoForge.LAPIS_ARROW.get();
            case MOSS -> ModArrowItemsNeoForge.MOSS_ARROW.get();
            case NETHERITE -> ModArrowItemsNeoForge.NETHERITE_ARROW.get();
            case OBSIDIAN -> ModArrowItemsNeoForge.OBSIDIAN_ARROW.get();
            case PAPER -> ModArrowItemsNeoForge.PAPER_ARROW.get();
            case TNT -> ModArrowItemsNeoForge.TNT_ARROW.get();
        };
    }

    @Override
    public Item blaze_bow() {
        return ModBowItemsNeoForge.BLAZE_BOW.get();
    }

    @Override
    public Item bamboo_bow() {
        return ModBowItemsNeoForge.BAMBOO_BOW.get();
    }

    @Override
    public Item copper_bow() {
        return ModBowItemsNeoForge.COPPER_BOW.get();
    }

    @Override
    public Item moss_bow() {
        return ModBowItemsNeoForge.MOSS_BOW.get();
    }

    @Override
    public Item paper_bow() {
        return ModBowItemsNeoForge.PAPER_BOW.get();
    }

    @Override
    public Item iron_bow() {
        return ModBowItemsNeoForge.IRON_BOW.get();
    }
}