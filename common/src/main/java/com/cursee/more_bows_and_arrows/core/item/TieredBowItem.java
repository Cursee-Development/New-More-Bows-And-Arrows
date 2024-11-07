package com.cursee.more_bows_and_arrows.core.item;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class TieredBowItem extends BowItem {

    private final Tier tier;

    public TieredBowItem(Tier tier) {
        super(new Properties().defaultDurability(tier.getUses()));
        this.tier = tier;
    }

    public Tier getTier() {
        return tier;
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> list, TooltipFlag flag) {

        if (!(itemStack.getItem() instanceof BowItem)) {
            return;
        }

        switch (itemStack.getDisplayName().getString()) {
            case "[Oak Bow]", "[Stripped Oak Bow]" -> {
                list.add(Component.translatable("more_bows_and_arrows.text.oak_bow_lore1"));
                list.add(Component.translatable("more_bows_and_arrows.text.oak_bow_lore2"));
                list.add(Component.translatable("more_bows_and_arrows.text.oak_bow_damage"));
            }
            case "[Dark Oak Bow]", "[Stripped Dark Oak Bow]" -> {
                list.add(Component.translatable("more_bows_and_arrows.text.dark_oak_bow_lore1"));
                list.add(Component.translatable("more_bows_and_arrows.text.dark_oak_bow_lore2"));
                list.add(Component.translatable("more_bows_and_arrows.text.dark_oak_bow_damage"));
            }
            case "[Spruce Bow]", "[Stripped Spruce Bow]" -> {
                list.add(Component.translatable("more_bows_and_arrows.text.spruce_bow_lore1"));
                list.add(Component.translatable("more_bows_and_arrows.text.spruce_bow_lore2"));
                list.add(Component.translatable("more_bows_and_arrows.text.spruce_bow_damage"));
            }
            case "[Birch Bow]", "[Stripped Birch Bow]" -> {
                list.add(Component.translatable("more_bows_and_arrows.text.birch_bow_lore1"));
                list.add(Component.translatable("more_bows_and_arrows.text.birch_bow_lore2"));
                list.add(Component.translatable("more_bows_and_arrows.text.birch_bow_damage"));
            }
            case "[Jungle Bow]", "[Stripped Jungle Bow]" -> {
                list.add(Component.translatable("more_bows_and_arrows.text.jungle_bow_lore1"));
                list.add(Component.translatable("more_bows_and_arrows.text.jungle_bow_lore2"));
                list.add(Component.translatable("more_bows_and_arrows.text.jungle_bow_damage"));
            }
            case "[Acacia Bow]", "[Stripped Acacia Bow]" -> {
                list.add(Component.translatable("more_bows_and_arrows.text.acacia_bow_lore1"));
                list.add(Component.translatable("more_bows_and_arrows.text.acacia_bow_lore2"));
                list.add(Component.translatable("more_bows_and_arrows.text.acacia_bow_damage"));
            }
            case "[Mangrove Bow]", "[Stripped Mangrove Bow]" -> {
                list.add(Component.translatable("more_bows_and_arrows.text.mangrove_bow_lore1"));
                list.add(Component.translatable("more_bows_and_arrows.text.mangrove_bow_lore2"));
                list.add(Component.translatable("more_bows_and_arrows.text.mangrove_bow_damage"));
            }
            case "[Cherry Bow]", "[Stripped Cherry Bow]" -> {
                list.add(Component.translatable("more_bows_and_arrows.text.cherry_bow_lore1"));
                list.add(Component.translatable("more_bows_and_arrows.text.cherry_bow_lore2"));
                list.add(Component.translatable("more_bows_and_arrows.text.cherry_bow_damage"));
            }
            case "[Bamboo Bow]", "[Stripped Bamboo Bow]" -> {
                list.add(Component.translatable("more_bows_and_arrows.text.bamboo_bow_lore1"));
                list.add(Component.translatable("more_bows_and_arrows.text.bamboo_bow_lore2"));
                list.add(Component.translatable("more_bows_and_arrows.text.bamboo_bow_damage"));
            }
            case "[Crimson Stem Bow]", "[Stripped Crimson Stem Bow]" -> {
                list.add(Component.translatable("more_bows_and_arrows.text.crimson_stem_bow_lore1"));
                list.add(Component.translatable("more_bows_and_arrows.text.crimson_stem_bow_lore2"));
                list.add(Component.translatable("more_bows_and_arrows.text.crimson_stem_bow_damage"));
            }
            case "[Warped Stem Bow]", "[Stripped Warped Stem Bow]" -> {
                list.add(Component.translatable("more_bows_and_arrows.text.warped_stem_bow_lore1"));
                list.add(Component.translatable("more_bows_and_arrows.text.warped_stem_bow_lore2"));
                list.add(Component.translatable("more_bows_and_arrows.text.warped_stem_bow_damage"));
            }

            case "[Paper Bow]" -> {
                list.add(Component.translatable("more_bows_and_arrows.text.paper_bow_lore1"));
                list.add(Component.translatable("more_bows_and_arrows.text.paper_bow_lore2"));
                list.add(Component.translatable("more_bows_and_arrows.text.paper_bow_damage"));
            }
            case "[Moss Bow]" -> {
                list.add(Component.translatable("more_bows_and_arrows.text.moss_bow_lore1"));
                list.add(Component.translatable("more_bows_and_arrows.text.moss_bow_lore2"));
                list.add(Component.translatable("more_bows_and_arrows.text.moss_bow_damage"));
            }
            case "[Lapis Bow]" -> {
                list.add(Component.translatable("more_bows_and_arrows.text.lapis_bow_lore1"));
                list.add(Component.translatable("more_bows_and_arrows.text.lapis_bow_lore2"));
                list.add(Component.translatable("more_bows_and_arrows.text.lapis_bow_damage"));
            }
            case "[Amethyst Bow]" -> {
                list.add(Component.translatable("more_bows_and_arrows.text.amethyst_bow_lore1"));
                list.add(Component.translatable("more_bows_and_arrows.text.amethyst_bow_lore2"));
                list.add(Component.translatable("more_bows_and_arrows.text.amethyst_bow_damage"));
            }
            case "[Bone Bow]" -> {
                list.add(Component.translatable("more_bows_and_arrows.text.bone_bow_lore1"));
                list.add(Component.translatable("more_bows_and_arrows.text.bone_bow_lore2"));
                list.add(Component.translatable("more_bows_and_arrows.text.bone_bow_damage"));
            }
            case "[Coal Bow]" -> {
                list.add(Component.translatable("more_bows_and_arrows.text.coal_bow_lore1"));
                list.add(Component.translatable("more_bows_and_arrows.text.coal_bow_lore2"));
                list.add(Component.translatable("more_bows_and_arrows.text.coal_bow_damage"));
            }
            case "[Emerald Bow]" -> {
                list.add(Component.translatable("more_bows_and_arrows.text.emerald_bow_lore1"));
                list.add(Component.translatable("more_bows_and_arrows.text.emerald_bow_lore2"));
                list.add(Component.translatable("more_bows_and_arrows.text.emerald_bow_damage"));
            }
            case "[Blaze Bow]" -> {
                list.add(Component.translatable("more_bows_and_arrows.text.blaze_bow_lore1"));
                list.add(Component.translatable("more_bows_and_arrows.text.blaze_bow_lore2"));
                list.add(Component.translatable("more_bows_and_arrows.text.blaze_bow_damage"));
            }
            case "[Obsidian Bow]" -> {
                list.add(Component.translatable("more_bows_and_arrows.text.obsidian_bow_lore1"));
                list.add(Component.translatable("more_bows_and_arrows.text.obsidian_bow_lore2"));
                list.add(Component.translatable("more_bows_and_arrows.text.obsidian_bow_damage"));
            }
            case "[Iron Bow]" -> {
                list.add(Component.translatable("more_bows_and_arrows.text.iron_bow_lore1"));
                list.add(Component.translatable("more_bows_and_arrows.text.iron_bow_lore2"));
                list.add(Component.translatable("more_bows_and_arrows.text.iron_bow_damage"));
            }
            case "[Copper Bow]" -> {
                list.add(Component.translatable("more_bows_and_arrows.text.copper_bow_lore1"));
                list.add(Component.translatable("more_bows_and_arrows.text.copper_bow_lore2"));
                list.add(Component.translatable("more_bows_and_arrows.text.copper_bow_damage"));
            }
            case "[Gold Bow]" -> {
                list.add(Component.translatable("more_bows_and_arrows.text.gold_bow_lore1"));
                list.add(Component.translatable("more_bows_and_arrows.text.gold_bow_lore2"));
                list.add(Component.translatable("more_bows_and_arrows.text.gold_bow_damage"));
            }
            case "[Diamond Bow]" -> {
                list.add(Component.translatable("more_bows_and_arrows.text.diamond_bow_lore1"));
                list.add(Component.translatable("more_bows_and_arrows.text.diamond_bow_lore2"));
                list.add(Component.translatable("more_bows_and_arrows.text.diamond_bow_damage"));
            }
            case "[Netherite Bow]" -> {
                list.add(Component.translatable("more_bows_and_arrows.text.netherite_bow_lore1"));
                list.add(Component.translatable("more_bows_and_arrows.text.netherite_bow_lore2"));
                list.add(Component.translatable("more_bows_and_arrows.text.netherite_bow_damage"));
            }
        }

        super.appendHoverText(itemStack, level, list, flag);
    }
}
