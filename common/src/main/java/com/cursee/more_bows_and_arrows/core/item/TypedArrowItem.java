package com.cursee.more_bows_and_arrows.core.item;

import com.cursee.more_bows_and_arrows.core.entity.ModEntityTier;
import com.cursee.more_bows_and_arrows.core.entity.TypedArrowEntity;
import com.cursee.more_bows_and_arrows.platform.Services;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class TypedArrowItem extends ArrowItem {

    private final Type type;

    public TypedArrowItem(Type type) {
        super(new Properties());
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public enum Type {
        AMETHYST, BAMBOO, BLAZE_ROD, BONE, CACTUS, COAL, COPPER, DIAMOND, EMERALD, ENDER_PEARL,
        FLINT_AND_STEEL, FLINT, GOLD, IRON, LAPIS, MOSS, NETHERITE, OBSIDIAN, PAPER, TNT;
    }

    @Override
    public @NotNull AbstractArrow createArrow(@NotNull Level level, @NotNull ItemStack itemStack, @NotNull LivingEntity entity) {
        return switch (this.type) {
            case AMETHYST -> new TypedArrowEntity(level, entity, ModEntityTier.AMETHYST, Services.PLATFORM.itemFromType(this.type));
            case BAMBOO -> new TypedArrowEntity(level, entity, ModEntityTier.BAMBOO, Services.PLATFORM.itemFromType(this.type));
            case BLAZE_ROD -> new TypedArrowEntity(level, entity, ModEntityTier.BLAZE_ROD, Services.PLATFORM.itemFromType(this.type));
            case BONE -> new TypedArrowEntity(level, entity, ModEntityTier.BONE, Services.PLATFORM.itemFromType(this.type));
            case CACTUS -> new TypedArrowEntity(level, entity, ModEntityTier.CACTUS, Services.PLATFORM.itemFromType(this.type));
            case COAL -> new TypedArrowEntity(level, entity, ModEntityTier.COAL, Services.PLATFORM.itemFromType(this.type));
            case COPPER -> new TypedArrowEntity(level, entity, ModEntityTier.COPPER, Services.PLATFORM.itemFromType(this.type));
            case DIAMOND -> new TypedArrowEntity(level, entity, ModEntityTier.DIAMOND, Services.PLATFORM.itemFromType(this.type));
            case EMERALD -> new TypedArrowEntity(level, entity, ModEntityTier.EMERALD, Services.PLATFORM.itemFromType(this.type));
            case ENDER_PEARL -> new TypedArrowEntity(level, entity, ModEntityTier.ENDER_PEARL, Services.PLATFORM.itemFromType(this.type));
            case FLINT_AND_STEEL -> new TypedArrowEntity(level, entity, ModEntityTier.FLINT_AND_STEEL, Services.PLATFORM.itemFromType(this.type));
            case FLINT -> new TypedArrowEntity(level, entity, ModEntityTier.FLINT, Services.PLATFORM.itemFromType(this.type));
            case GOLD -> new TypedArrowEntity(level, entity, ModEntityTier.GOLD, Services.PLATFORM.itemFromType(this.type));
            case IRON -> new TypedArrowEntity(level, entity, ModEntityTier.IRON, Services.PLATFORM.itemFromType(this.type));
            case LAPIS -> new TypedArrowEntity(level, entity, ModEntityTier.LAPIS, Services.PLATFORM.itemFromType(this.type));
            case MOSS -> new TypedArrowEntity(level, entity, ModEntityTier.MOSS, Services.PLATFORM.itemFromType(this.type));
            case NETHERITE -> new TypedArrowEntity(level, entity, ModEntityTier.NETHERITE, Services.PLATFORM.itemFromType(this.type));
            case OBSIDIAN -> new TypedArrowEntity(level, entity, ModEntityTier.OBSIDIAN, Services.PLATFORM.itemFromType(this.type));
            case PAPER -> new TypedArrowEntity(level, entity, ModEntityTier.PAPER, Services.PLATFORM.itemFromType(this.type));
            case TNT -> new TypedArrowEntity(level, entity, ModEntityTier.TNT, Services.PLATFORM.itemFromType(this.type));
        };
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> list, TooltipFlag tooltipFlag) {

//        if (!Services.PLATFORM.isModLoaded("tooltipfix")) {
//            return;
//        }

        switch (this.type) {

            case AMETHYST -> {
                list.add(Component.translatable("more_bows_and_arrows.text.amethyst_arrow_lore1"));
                list.add(Component.translatable("more_bows_and_arrows.text.amethyst_arrow_lore2"));
                list.add(Component.translatable("more_bows_and_arrows.text.amethyst_arrow_damage"));
            }
            case BAMBOO -> {
                list.add(Component.translatable("more_bows_and_arrows.text.bamboo_arrow_lore1"));
                list.add(Component.translatable("more_bows_and_arrows.text.bamboo_arrow_lore2"));
                list.add(Component.translatable("more_bows_and_arrows.text.bamboo_arrow_damage"));
            }
            case BLAZE_ROD -> {
                list.add(Component.translatable("more_bows_and_arrows.text.blaze_rod_arrow_lore1"));
                list.add(Component.translatable("more_bows_and_arrows.text.blaze_rod_arrow_lore2"));
                list.add(Component.translatable("more_bows_and_arrows.text.blaze_rod_arrow_damage"));
            }
            case BONE -> {
                list.add(Component.translatable("more_bows_and_arrows.text.bone_arrow_lore1"));
                list.add(Component.translatable("more_bows_and_arrows.text.bone_arrow_lore2"));
                list.add(Component.translatable("more_bows_and_arrows.text.bone_arrow_damage"));
            }
            case CACTUS -> {
                list.add(Component.translatable("more_bows_and_arrows.text.cactus_arrow_lore1"));
                list.add(Component.translatable("more_bows_and_arrows.text.cactus_arrow_lore2"));
                list.add(Component.translatable("more_bows_and_arrows.text.cactus_arrow_damage"));
            }
            case COAL -> {
                list.add(Component.translatable("more_bows_and_arrows.text.coal_arrow_lore1"));
                list.add(Component.translatable("more_bows_and_arrows.text.coal_arrow_lore2"));
                list.add(Component.translatable("more_bows_and_arrows.text.coal_arrow_damage"));
            }
            case COPPER -> {
                list.add(Component.translatable("more_bows_and_arrows.text.copper_arrow_lore1"));
                list.add(Component.translatable("more_bows_and_arrows.text.copper_arrow_lore2"));
                list.add(Component.translatable("more_bows_and_arrows.text.copper_arrow_damage"));
            }
            case DIAMOND -> {
                list.add(Component.translatable("more_bows_and_arrows.text.diamond_arrow_lore1"));
                list.add(Component.translatable("more_bows_and_arrows.text.diamond_arrow_lore2"));
                list.add(Component.translatable("more_bows_and_arrows.text.diamond_arrow_damage"));
            }
            case EMERALD -> {
                list.add(Component.translatable("more_bows_and_arrows.text.emerald_arrow_lore1"));
                list.add(Component.translatable("more_bows_and_arrows.text.emerald_arrow_lore2"));
                list.add(Component.translatable("more_bows_and_arrows.text.emerald_arrow_damage"));
            }
            case ENDER_PEARL -> {
                list.add(Component.translatable("more_bows_and_arrows.text.ender_pearl_arrow_lore1"));
                list.add(Component.translatable("more_bows_and_arrows.text.ender_pearl_arrow_lore2"));
                list.add(Component.translatable("more_bows_and_arrows.text.ender_pearl_arrow_damage"));
            }
            case FLINT_AND_STEEL -> {
                list.add(Component.translatable("more_bows_and_arrows.text.flint_and_steel_arrow_lore1"));
                list.add(Component.translatable("more_bows_and_arrows.text.flint_and_steel_arrow_lore2"));
                list.add(Component.translatable("more_bows_and_arrows.text.flint_and_steel_arrow_damage"));
            }
            case FLINT -> {
                list.add(Component.translatable("more_bows_and_arrows.text.flint_arrow_lore1"));
                list.add(Component.translatable("more_bows_and_arrows.text.flint_arrow_lore2"));
                list.add(Component.translatable("more_bows_and_arrows.text.flint_arrow_damage"));
            }
            case GOLD -> {
                list.add(Component.translatable("more_bows_and_arrows.text.gold_arrow_lore1"));
                list.add(Component.translatable("more_bows_and_arrows.text.gold_arrow_lore2"));
                list.add(Component.translatable("more_bows_and_arrows.text.gold_arrow_damage"));
            }
            case IRON -> {
                list.add(Component.translatable("more_bows_and_arrows.text.iron_arrow_lore1"));
                list.add(Component.translatable("more_bows_and_arrows.text.iron_arrow_lore2"));
                list.add(Component.translatable("more_bows_and_arrows.text.iron_arrow_damage"));
            }
            case LAPIS -> {
                list.add(Component.translatable("more_bows_and_arrows.text.lapis_arrow_lore1"));
                list.add(Component.translatable("more_bows_and_arrows.text.lapis_arrow_lore2"));
                list.add(Component.translatable("more_bows_and_arrows.text.lapis_arrow_damage"));
            }
            case MOSS -> {
                list.add(Component.translatable("more_bows_and_arrows.text.moss_arrow_lore1"));
                list.add(Component.translatable("more_bows_and_arrows.text.moss_arrow_lore2"));
                list.add(Component.translatable("more_bows_and_arrows.text.moss_arrow_damage"));
            }
            case NETHERITE -> {
                list.add(Component.translatable("more_bows_and_arrows.text.netherite_arrow_lore1"));
                list.add(Component.translatable("more_bows_and_arrows.text.netherite_arrow_lore2"));
                list.add(Component.translatable("more_bows_and_arrows.text.netherite_arrow_damage"));
            }
            case OBSIDIAN -> {
                list.add(Component.translatable("more_bows_and_arrows.text.obsidian_arrow_lore1"));
                list.add(Component.translatable("more_bows_and_arrows.text.obsidian_arrow_lore2"));
                list.add(Component.translatable("more_bows_and_arrows.text.obsidian_arrow_damage"));
            }
            case PAPER -> {
                list.add(Component.translatable("more_bows_and_arrows.text.paper_arrow_lore1"));
                list.add(Component.translatable("more_bows_and_arrows.text.paper_arrow_lore2"));
                list.add(Component.translatable("more_bows_and_arrows.text.paper_arrow_damage"));
            }
            case TNT -> {
                list.add(Component.translatable("more_bows_and_arrows.text.tnt_arrow_lore1"));
                list.add(Component.translatable("more_bows_and_arrows.text.tnt_arrow_lore2"));
                list.add(Component.translatable("more_bows_and_arrows.text.tnt_arrow_damage"));
            }
        }

        super.appendHoverText(itemStack, level, list, tooltipFlag);
    }
}
