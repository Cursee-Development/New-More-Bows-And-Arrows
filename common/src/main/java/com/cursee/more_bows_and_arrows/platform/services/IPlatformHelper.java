package com.cursee.more_bows_and_arrows.platform.services;

import com.cursee.more_bows_and_arrows.core.item.ModArrowItemTier;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;

public interface IPlatformHelper {

    /**
     * Gets the name of the current platform
     *
     * @return The name of the current platform.
     */
    String getPlatformName();

    /**
     * Checks if a mod with the given id is loaded.
     *
     * @param modId The mod to check if it is loaded.
     * @return True if the mod is loaded, false otherwise.
     */
    boolean isModLoaded(String modId);

    /**
     * Check if the game is currently in a development environment.
     *
     * @return True if in a development environment, false otherwise.
     */
    boolean isDevelopmentEnvironment();

    /**
     * Gets the name of the environment type as a string.
     *
     * @return The name of the environment type.
     */
    default String getEnvironmentName() {

        return isDevelopmentEnvironment() ? "development" : "production";
    }

    EntityType entityFromTier(ModArrowItemTier tier);

    Item itemFromType(ModArrowItemTier type);

    Item blaze_bow();

    Item bamboo_bow();

    Item copper_bow();

    Item moss_bow();

    Item paper_bow();

    Item iron_bow();
}