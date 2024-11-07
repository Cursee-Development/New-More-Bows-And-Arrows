package com.cursee.more_bows_and_arrows.core.registry;

import com.cursee.more_bows_and_arrows.Constants;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModTabsFabric {

    public static void register() {}

    public static final CreativeModeTab MORE_BOWS_AND_ARROWS = RegistryFabric.registerTab(Constants.MOD_ID, () -> FabricItemGroup.builder()
        .title(Component.translatable("itemGroup.moreBowsAndArrows"))
        .icon(() -> new ItemStack(ModBowItemsFabric.BLAZE_BOW))
        .displayItems(((itemDisplayParameters, output) -> {
            addBows(output);
            addArrows(output);
        }))
        .build());

    public static void addBows(CreativeModeTab.Output output) {
        output.accept(ModBowItemsFabric.OAK_BOW);
        output.accept(ModBowItemsFabric.STRIPPED_OAK_BOW);
        output.accept(ModBowItemsFabric.DARK_OAK_BOW);
        output.accept(ModBowItemsFabric.STRIPPED_DARK_OAK_BOW);
        output.accept(ModBowItemsFabric.SPRUCE_BOW);
        output.accept(ModBowItemsFabric.STRIPPED_SPRUCE_BOW);
        output.accept(ModBowItemsFabric.BIRCH_BOW);
        output.accept(ModBowItemsFabric.STRIPPED_BIRCH_BOW);
        output.accept(ModBowItemsFabric.JUNGLE_BOW);
        output.accept(ModBowItemsFabric.STRIPPED_JUNGLE_BOW);
        output.accept(ModBowItemsFabric.ACACIA_BOW);
        output.accept(ModBowItemsFabric.STRIPPED_ACACIA_BOW);
        output.accept(ModBowItemsFabric.MANGROVE_BOW);
        output.accept(ModBowItemsFabric.STRIPPED_MANGROVE_BOW);
        output.accept(ModBowItemsFabric.CHERRY_BOW);
        output.accept(ModBowItemsFabric.STRIPPED_CHERRY_BOW);
        output.accept(ModBowItemsFabric.BAMBOO_BOW);
        output.accept(ModBowItemsFabric.STRIPPED_BAMBOO_BOW);
        output.accept(ModBowItemsFabric.CRIMSON_STEM_BOW);
        output.accept(ModBowItemsFabric.STRIPPED_CRIMSON_STEM_BOW);
        output.accept(ModBowItemsFabric.WARPED_STEM_BOW);
        output.accept(ModBowItemsFabric.STRIPPED_WARPED_STEM_BOW);

        output.accept(ModBowItemsFabric.PAPER_BOW);
        output.accept(ModBowItemsFabric.MOSS_BOW);
        output.accept(ModBowItemsFabric.LAPIS_BOW);
        output.accept(ModBowItemsFabric.AMETHYST_BOW);
        output.accept(ModBowItemsFabric.BONE_BOW);
        output.accept(ModBowItemsFabric.COAL_BOW);
        output.accept(ModBowItemsFabric.EMERALD_BOW);
        output.accept(ModBowItemsFabric.BLAZE_BOW);
        output.accept(ModBowItemsFabric.OBSIDIAN_BOW);

        output.accept(ModBowItemsFabric.IRON_BOW);
        output.accept(ModBowItemsFabric.COPPER_BOW);
        output.accept(ModBowItemsFabric.GOLD_BOW);
        output.accept(ModBowItemsFabric.DIAMOND_BOW);
        output.accept(ModBowItemsFabric.NETHERITE_BOW);
    }
    public static void addArrows(CreativeModeTab.Output output) {
        output.accept(ModArrowItemsFabric.FLINT_AND_STEEL_ARROW);
        output.accept(ModArrowItemsFabric.ENDER_PEARL_ARROW);
        output.accept(ModArrowItemsFabric.TNT_ARROW);
        output.accept(ModArrowItemsFabric.PAPER_ARROW);
        output.accept(ModArrowItemsFabric.MOSS_ARROW);

        output.accept(ModArrowItemsFabric.AMETHYST_ARROW);
        output.accept(ModArrowItemsFabric.BAMBOO_ARROW);
        output.accept(ModArrowItemsFabric.BLAZE_ROD_ARROW);
        output.accept(ModArrowItemsFabric.BONE_ARROW);
        output.accept(ModArrowItemsFabric.CACTUS_ARROW);
        output.accept(ModArrowItemsFabric.COAL_ARROW);
        output.accept(ModArrowItemsFabric.EMERALD_ARROW);
        output.accept(ModArrowItemsFabric.LAPIS_ARROW);
        output.accept(ModArrowItemsFabric.OBSIDIAN_ARROW);
        output.accept(ModArrowItemsFabric.FLINT_ARROW);

        output.accept(ModArrowItemsFabric.IRON_ARROW);
        output.accept(ModArrowItemsFabric.COPPER_ARROW);
        output.accept(ModArrowItemsFabric.GOLD_ARROW);
        output.accept(ModArrowItemsFabric.DIAMOND_ARROW);
        output.accept(ModArrowItemsFabric.NETHERITE_ARROW);
    }
}
