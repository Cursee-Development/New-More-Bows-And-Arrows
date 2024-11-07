package com.cursee.more_bows_and_arrows.core.registry;

import com.cursee.more_bows_and_arrows.Constants;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.RegistryObject;

public class ModTabsForge {

    public static void register() {}

    public static final RegistryObject<CreativeModeTab> MORE_BOWS_AND_ARROWS = RegistryForge.registerTab(Constants.MOD_ID, () -> CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
            .title(Component.translatable("itemGroup.moreBowsAndArrows"))
            .icon(() -> new ItemStack(ModBowItemsForge.BLAZE_BOW.get()))
            .displayItems(((itemDisplayParameters, output) -> {
                addBows(output);
                addArrows(output);
            }))
            .build());

    public static void addBows(CreativeModeTab.Output output) {
        output.accept(ModBowItemsForge.OAK_BOW.get());
        output.accept(ModBowItemsForge.STRIPPED_OAK_BOW.get());
        output.accept(ModBowItemsForge.DARK_OAK_BOW.get());
        output.accept(ModBowItemsForge.STRIPPED_DARK_OAK_BOW.get());
        output.accept(ModBowItemsForge.SPRUCE_BOW.get());
        output.accept(ModBowItemsForge.STRIPPED_SPRUCE_BOW.get());
        output.accept(ModBowItemsForge.BIRCH_BOW.get());
        output.accept(ModBowItemsForge.STRIPPED_BIRCH_BOW.get());
        output.accept(ModBowItemsForge.JUNGLE_BOW.get());
        output.accept(ModBowItemsForge.STRIPPED_JUNGLE_BOW.get());
        output.accept(ModBowItemsForge.ACACIA_BOW.get());
        output.accept(ModBowItemsForge.STRIPPED_ACACIA_BOW.get());
        output.accept(ModBowItemsForge.MANGROVE_BOW.get());
        output.accept(ModBowItemsForge.STRIPPED_MANGROVE_BOW.get());
        output.accept(ModBowItemsForge.CHERRY_BOW.get());
        output.accept(ModBowItemsForge.STRIPPED_CHERRY_BOW.get());
        output.accept(ModBowItemsForge.BAMBOO_BOW.get());
        output.accept(ModBowItemsForge.STRIPPED_BAMBOO_BOW.get());
        output.accept(ModBowItemsForge.CRIMSON_STEM_BOW.get());
        output.accept(ModBowItemsForge.STRIPPED_CRIMSON_STEM_BOW.get());
        output.accept(ModBowItemsForge.WARPED_STEM_BOW.get());
        output.accept(ModBowItemsForge.STRIPPED_WARPED_STEM_BOW.get());

        output.accept(ModBowItemsForge.PAPER_BOW.get());
        output.accept(ModBowItemsForge.MOSS_BOW.get());
        output.accept(ModBowItemsForge.LAPIS_BOW.get());
        output.accept(ModBowItemsForge.AMETHYST_BOW.get());
        output.accept(ModBowItemsForge.BONE_BOW.get());
        output.accept(ModBowItemsForge.COAL_BOW.get());
        output.accept(ModBowItemsForge.EMERALD_BOW.get());
        output.accept(ModBowItemsForge.BLAZE_BOW.get());
        output.accept(ModBowItemsForge.OBSIDIAN_BOW.get());

        output.accept(ModBowItemsForge.IRON_BOW.get());
        output.accept(ModBowItemsForge.COPPER_BOW.get());
        output.accept(ModBowItemsForge.GOLD_BOW.get());
        output.accept(ModBowItemsForge.DIAMOND_BOW.get());
        output.accept(ModBowItemsForge.NETHERITE_BOW.get());
    }
    public static void addArrows(CreativeModeTab.Output output) {
        output.accept(ModArrowItemsForge.FLINT_AND_STEEL_ARROW.get());
        output.accept(ModArrowItemsForge.ENDER_PEARL_ARROW.get());
        output.accept(ModArrowItemsForge.TNT_ARROW.get());
        output.accept(ModArrowItemsForge.PAPER_ARROW.get());
        output.accept(ModArrowItemsForge.MOSS_ARROW.get());

        output.accept(ModArrowItemsForge.AMETHYST_ARROW.get());
        output.accept(ModArrowItemsForge.BAMBOO_ARROW.get());
        output.accept(ModArrowItemsForge.BLAZE_ROD_ARROW.get());
        output.accept(ModArrowItemsForge.BONE_ARROW.get());
        output.accept(ModArrowItemsForge.CACTUS_ARROW.get());
        output.accept(ModArrowItemsForge.COAL_ARROW.get());
        output.accept(ModArrowItemsForge.EMERALD_ARROW.get());
        output.accept(ModArrowItemsForge.LAPIS_ARROW.get());
        output.accept(ModArrowItemsForge.OBSIDIAN_ARROW.get());
        output.accept(ModArrowItemsForge.FLINT_ARROW.get());

        output.accept(ModArrowItemsForge.IRON_ARROW.get());
        output.accept(ModArrowItemsForge.COPPER_ARROW.get());
        output.accept(ModArrowItemsForge.GOLD_ARROW.get());
        output.accept(ModArrowItemsForge.DIAMOND_ARROW.get());
        output.accept(ModArrowItemsForge.NETHERITE_ARROW.get());
    }
}
