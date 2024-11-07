package com.cursee.more_bows_and_arrows.platform;

import com.cursee.more_bows_and_arrows.core.item.ModArrowItemTier;
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
        return null;
    }

    @Override
    public Item itemFromType(ModArrowItemTier type) {
        return null;
    }

    @Override
    public Item blaze_bow() {
        return null;
    }

    @Override
    public Item bamboo_bow() {
        return null;
    }

    @Override
    public Item copper_bow() {
        return null;
    }

    @Override
    public Item moss_bow() {
        return null;
    }

    @Override
    public Item paper_bow() {
        return null;
    }

    @Override
    public Item iron_bow() {
        return null;
    }
}