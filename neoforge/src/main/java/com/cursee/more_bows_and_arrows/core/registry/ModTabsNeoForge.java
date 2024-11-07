package com.cursee.more_bows_and_arrows.core.registry;

import com.cursee.more_bows_and_arrows.Constants;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;

public class ModTabsNeoForge {

    public static void register() {}

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MORE_BOWS_AND_ARROWS = RegistryNeoForge.registerTab(Constants.MOD_ID, () -> CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
            .title(Component.translatable("itemGroup.moreBowsAndArrows"))
            .icon(() -> new ItemStack(ModBowItemsNeoForge.BLAZE_BOW.get()))
            .displayItems(((itemDisplayParameters, output) -> {
                addBows(output);
                addArrows(output);
            }))
            .build());

    public static void addBows(CreativeModeTab.Output output) {
        output.accept(ModBowItemsNeoForge.OAK_BOW.get());
        output.accept(ModBowItemsNeoForge.STRIPPED_OAK_BOW.get());
        output.accept(ModBowItemsNeoForge.DARK_OAK_BOW.get());
        output.accept(ModBowItemsNeoForge.STRIPPED_DARK_OAK_BOW.get());
        output.accept(ModBowItemsNeoForge.SPRUCE_BOW.get());
        output.accept(ModBowItemsNeoForge.STRIPPED_SPRUCE_BOW.get());
        output.accept(ModBowItemsNeoForge.BIRCH_BOW.get());
        output.accept(ModBowItemsNeoForge.STRIPPED_BIRCH_BOW.get());
        output.accept(ModBowItemsNeoForge.JUNGLE_BOW.get());
        output.accept(ModBowItemsNeoForge.STRIPPED_JUNGLE_BOW.get());
        output.accept(ModBowItemsNeoForge.ACACIA_BOW.get());
        output.accept(ModBowItemsNeoForge.STRIPPED_ACACIA_BOW.get());
        output.accept(ModBowItemsNeoForge.MANGROVE_BOW.get());
        output.accept(ModBowItemsNeoForge.STRIPPED_MANGROVE_BOW.get());
        output.accept(ModBowItemsNeoForge.CHERRY_BOW.get());
        output.accept(ModBowItemsNeoForge.STRIPPED_CHERRY_BOW.get());
        output.accept(ModBowItemsNeoForge.BAMBOO_BOW.get());
        output.accept(ModBowItemsNeoForge.STRIPPED_BAMBOO_BOW.get());
        output.accept(ModBowItemsNeoForge.CRIMSON_STEM_BOW.get());
        output.accept(ModBowItemsNeoForge.STRIPPED_CRIMSON_STEM_BOW.get());
        output.accept(ModBowItemsNeoForge.WARPED_STEM_BOW.get());
        output.accept(ModBowItemsNeoForge.STRIPPED_WARPED_STEM_BOW.get());

        output.accept(ModBowItemsNeoForge.PAPER_BOW.get());
        output.accept(ModBowItemsNeoForge.MOSS_BOW.get());
        output.accept(ModBowItemsNeoForge.LAPIS_BOW.get());
        output.accept(ModBowItemsNeoForge.AMETHYST_BOW.get());
        output.accept(ModBowItemsNeoForge.BONE_BOW.get());
        output.accept(ModBowItemsNeoForge.COAL_BOW.get());
        output.accept(ModBowItemsNeoForge.EMERALD_BOW.get());
        output.accept(ModBowItemsNeoForge.BLAZE_BOW.get());
        output.accept(ModBowItemsNeoForge.OBSIDIAN_BOW.get());

        output.accept(ModBowItemsNeoForge.IRON_BOW.get());
        output.accept(ModBowItemsNeoForge.COPPER_BOW.get());
        output.accept(ModBowItemsNeoForge.GOLD_BOW.get());
        output.accept(ModBowItemsNeoForge.DIAMOND_BOW.get());
        output.accept(ModBowItemsNeoForge.NETHERITE_BOW.get());
    }
    public static void addArrows(CreativeModeTab.Output output) {
        output.accept(ModArrowItemsNeoForge.FLINT_AND_STEEL_ARROW.get());
        output.accept(ModArrowItemsNeoForge.ENDER_PEARL_ARROW.get());
        output.accept(ModArrowItemsNeoForge.TNT_ARROW.get());
        output.accept(ModArrowItemsNeoForge.PAPER_ARROW.get());
        output.accept(ModArrowItemsNeoForge.MOSS_ARROW.get());

        output.accept(ModArrowItemsNeoForge.AMETHYST_ARROW.get());
        output.accept(ModArrowItemsNeoForge.BAMBOO_ARROW.get());
        output.accept(ModArrowItemsNeoForge.BLAZE_ROD_ARROW.get());
        output.accept(ModArrowItemsNeoForge.BONE_ARROW.get());
        output.accept(ModArrowItemsNeoForge.CACTUS_ARROW.get());
        output.accept(ModArrowItemsNeoForge.COAL_ARROW.get());
        output.accept(ModArrowItemsNeoForge.EMERALD_ARROW.get());
        output.accept(ModArrowItemsNeoForge.LAPIS_ARROW.get());
        output.accept(ModArrowItemsNeoForge.OBSIDIAN_ARROW.get());
        output.accept(ModArrowItemsNeoForge.FLINT_ARROW.get());

        output.accept(ModArrowItemsNeoForge.IRON_ARROW.get());
        output.accept(ModArrowItemsNeoForge.COPPER_ARROW.get());
        output.accept(ModArrowItemsNeoForge.GOLD_ARROW.get());
        output.accept(ModArrowItemsNeoForge.DIAMOND_ARROW.get());
        output.accept(ModArrowItemsNeoForge.NETHERITE_ARROW.get());
    }
}
