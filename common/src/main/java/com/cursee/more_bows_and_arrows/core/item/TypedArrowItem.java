package com.cursee.more_bows_and_arrows.core.item;

import com.cursee.more_bows_and_arrows.core.entity.TypedArrowEntity;
import com.cursee.more_bows_and_arrows.platform.Services;
import net.minecraft.core.Direction;
import net.minecraft.core.Position;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class TypedArrowItem extends ArrowItem {

    private final ModArrowItemTier type;

    public TypedArrowItem(ModArrowItemTier type) {
        super(new Properties());
        this.type = type;
    }

    public ModArrowItemTier getType() {
        return type;
    }

    @Override
    public @NotNull AbstractArrow createArrow(@NotNull Level level, @NotNull ItemStack itemStack, @NotNull LivingEntity entity, @Nullable ItemStack $$3) {
        return switch (this.type) {
            case AMETHYST -> new TypedArrowEntity(level, entity, ModArrowItemTier.AMETHYST, Services.PLATFORM.itemFromType(this.type));
            case BAMBOO -> new TypedArrowEntity(level, entity, ModArrowItemTier.BAMBOO, Services.PLATFORM.itemFromType(this.type));
            case BLAZE_ROD -> new TypedArrowEntity(level, entity, ModArrowItemTier.BLAZE_ROD, Services.PLATFORM.itemFromType(this.type));
            case BONE -> new TypedArrowEntity(level, entity, ModArrowItemTier.BONE, Services.PLATFORM.itemFromType(this.type));
            case CACTUS -> new TypedArrowEntity(level, entity, ModArrowItemTier.CACTUS, Services.PLATFORM.itemFromType(this.type));
            case COAL -> new TypedArrowEntity(level, entity, ModArrowItemTier.COAL, Services.PLATFORM.itemFromType(this.type));
            case COPPER -> new TypedArrowEntity(level, entity, ModArrowItemTier.COPPER, Services.PLATFORM.itemFromType(this.type));
            case DIAMOND -> new TypedArrowEntity(level, entity, ModArrowItemTier.DIAMOND, Services.PLATFORM.itemFromType(this.type));
            case EMERALD -> new TypedArrowEntity(level, entity, ModArrowItemTier.EMERALD, Services.PLATFORM.itemFromType(this.type));
            case ENDER_PEARL -> new TypedArrowEntity(level, entity, ModArrowItemTier.ENDER_PEARL, Services.PLATFORM.itemFromType(this.type));
            case FLINT_AND_STEEL -> new TypedArrowEntity(level, entity, ModArrowItemTier.FLINT_AND_STEEL, Services.PLATFORM.itemFromType(this.type));
            case FLINT -> new TypedArrowEntity(level, entity, ModArrowItemTier.FLINT, Services.PLATFORM.itemFromType(this.type));
            case GOLD -> new TypedArrowEntity(level, entity, ModArrowItemTier.GOLD, Services.PLATFORM.itemFromType(this.type));
            case IRON -> new TypedArrowEntity(level, entity, ModArrowItemTier.IRON, Services.PLATFORM.itemFromType(this.type));
            case LAPIS -> new TypedArrowEntity(level, entity, ModArrowItemTier.LAPIS, Services.PLATFORM.itemFromType(this.type));
            case MOSS -> new TypedArrowEntity(level, entity, ModArrowItemTier.MOSS, Services.PLATFORM.itemFromType(this.type));
            case NETHERITE -> new TypedArrowEntity(level, entity, ModArrowItemTier.NETHERITE, Services.PLATFORM.itemFromType(this.type));
            case OBSIDIAN -> new TypedArrowEntity(level, entity, ModArrowItemTier.OBSIDIAN, Services.PLATFORM.itemFromType(this.type));
            case PAPER -> new TypedArrowEntity(level, entity, ModArrowItemTier.PAPER, Services.PLATFORM.itemFromType(this.type));
            case TNT -> new TypedArrowEntity(level, entity, ModArrowItemTier.TNT, Services.PLATFORM.itemFromType(this.type));
        };
    }

    @Override
    public Projectile asProjectile(Level pLevel, Position pPos, ItemStack pStack, Direction pDirection) {
        // TypedArrowEntity arrow = new TypedArrowEntity(pLevel, pPos.x(), pPos.y(), pPos.z(), this.type, pStack.copyWithCount(1), null);
        TypedArrowEntity arrow = new TypedArrowEntity(pLevel, pPos.x(), pPos.y(), pPos.z(), this.type, pStack.getItem());
        arrow.pickup = AbstractArrow.Pickup.ALLOWED;
        return arrow;
    }

    @Override
    public void appendHoverText(ItemStack itemStack, TooltipContext context, List<Component> componentList, TooltipFlag flag) {
        switch (this.type) {

            case AMETHYST -> {
                componentList.add(Component.translatable("more_bows_and_arrows.text.amethyst_arrow_lore1"));
                componentList.add(Component.translatable("more_bows_and_arrows.text.amethyst_arrow_lore2"));
                componentList.add(Component.translatable("more_bows_and_arrows.text.amethyst_arrow_damage"));
            }
            case BAMBOO -> {
                componentList.add(Component.translatable("more_bows_and_arrows.text.bamboo_arrow_lore1"));
                componentList.add(Component.translatable("more_bows_and_arrows.text.bamboo_arrow_lore2"));
                componentList.add(Component.translatable("more_bows_and_arrows.text.bamboo_arrow_damage"));
            }
            case BLAZE_ROD -> {
                componentList.add(Component.translatable("more_bows_and_arrows.text.blaze_rod_arrow_lore1"));
                componentList.add(Component.translatable("more_bows_and_arrows.text.blaze_rod_arrow_lore2"));
                componentList.add(Component.translatable("more_bows_and_arrows.text.blaze_rod_arrow_damage"));
            }
            case BONE -> {
                componentList.add(Component.translatable("more_bows_and_arrows.text.bone_arrow_lore1"));
                componentList.add(Component.translatable("more_bows_and_arrows.text.bone_arrow_lore2"));
                componentList.add(Component.translatable("more_bows_and_arrows.text.bone_arrow_damage"));
            }
            case CACTUS -> {
                componentList.add(Component.translatable("more_bows_and_arrows.text.cactus_arrow_lore1"));
                componentList.add(Component.translatable("more_bows_and_arrows.text.cactus_arrow_lore2"));
                componentList.add(Component.translatable("more_bows_and_arrows.text.cactus_arrow_damage"));
            }
            case COAL -> {
                componentList.add(Component.translatable("more_bows_and_arrows.text.coal_arrow_lore1"));
                componentList.add(Component.translatable("more_bows_and_arrows.text.coal_arrow_lore2"));
                componentList.add(Component.translatable("more_bows_and_arrows.text.coal_arrow_damage"));
            }
            case COPPER -> {
                componentList.add(Component.translatable("more_bows_and_arrows.text.copper_arrow_lore1"));
                componentList.add(Component.translatable("more_bows_and_arrows.text.copper_arrow_lore2"));
                componentList.add(Component.translatable("more_bows_and_arrows.text.copper_arrow_damage"));
            }
            case DIAMOND -> {
                componentList.add(Component.translatable("more_bows_and_arrows.text.diamond_arrow_lore1"));
                componentList.add(Component.translatable("more_bows_and_arrows.text.diamond_arrow_lore2"));
                componentList.add(Component.translatable("more_bows_and_arrows.text.diamond_arrow_damage"));
            }
            case EMERALD -> {
                componentList.add(Component.translatable("more_bows_and_arrows.text.emerald_arrow_lore1"));
                componentList.add(Component.translatable("more_bows_and_arrows.text.emerald_arrow_lore2"));
                componentList.add(Component.translatable("more_bows_and_arrows.text.emerald_arrow_damage"));
            }
            case ENDER_PEARL -> {
                componentList.add(Component.translatable("more_bows_and_arrows.text.ender_pearl_arrow_lore1"));
                componentList.add(Component.translatable("more_bows_and_arrows.text.ender_pearl_arrow_lore2"));
                componentList.add(Component.translatable("more_bows_and_arrows.text.ender_pearl_arrow_damage"));
            }
            case FLINT_AND_STEEL -> {
                componentList.add(Component.translatable("more_bows_and_arrows.text.flint_and_steel_arrow_lore1"));
                componentList.add(Component.translatable("more_bows_and_arrows.text.flint_and_steel_arrow_lore2"));
                componentList.add(Component.translatable("more_bows_and_arrows.text.flint_and_steel_arrow_damage"));
            }
            case FLINT -> {
                componentList.add(Component.translatable("more_bows_and_arrows.text.flint_arrow_lore1"));
                componentList.add(Component.translatable("more_bows_and_arrows.text.flint_arrow_lore2"));
                componentList.add(Component.translatable("more_bows_and_arrows.text.flint_arrow_damage"));
            }
            case GOLD -> {
                componentList.add(Component.translatable("more_bows_and_arrows.text.gold_arrow_lore1"));
                componentList.add(Component.translatable("more_bows_and_arrows.text.gold_arrow_lore2"));
                componentList.add(Component.translatable("more_bows_and_arrows.text.gold_arrow_damage"));
            }
            case IRON -> {
                componentList.add(Component.translatable("more_bows_and_arrows.text.iron_arrow_lore1"));
                componentList.add(Component.translatable("more_bows_and_arrows.text.iron_arrow_lore2"));
                componentList.add(Component.translatable("more_bows_and_arrows.text.iron_arrow_damage"));
            }
            case LAPIS -> {
                componentList.add(Component.translatable("more_bows_and_arrows.text.lapis_arrow_lore1"));
                componentList.add(Component.translatable("more_bows_and_arrows.text.lapis_arrow_lore2"));
                componentList.add(Component.translatable("more_bows_and_arrows.text.lapis_arrow_damage"));
            }
            case MOSS -> {
                componentList.add(Component.translatable("more_bows_and_arrows.text.moss_arrow_lore1"));
                componentList.add(Component.translatable("more_bows_and_arrows.text.moss_arrow_lore2"));
                componentList.add(Component.translatable("more_bows_and_arrows.text.moss_arrow_damage"));
            }
            case NETHERITE -> {
                componentList.add(Component.translatable("more_bows_and_arrows.text.netherite_arrow_lore1"));
                componentList.add(Component.translatable("more_bows_and_arrows.text.netherite_arrow_lore2"));
                componentList.add(Component.translatable("more_bows_and_arrows.text.netherite_arrow_damage"));
            }
            case OBSIDIAN -> {
                componentList.add(Component.translatable("more_bows_and_arrows.text.obsidian_arrow_lore1"));
                componentList.add(Component.translatable("more_bows_and_arrows.text.obsidian_arrow_lore2"));
                componentList.add(Component.translatable("more_bows_and_arrows.text.obsidian_arrow_damage"));
            }
            case PAPER -> {
                componentList.add(Component.translatable("more_bows_and_arrows.text.paper_arrow_lore1"));
                componentList.add(Component.translatable("more_bows_and_arrows.text.paper_arrow_lore2"));
                componentList.add(Component.translatable("more_bows_and_arrows.text.paper_arrow_damage"));
            }
            case TNT -> {
                componentList.add(Component.translatable("more_bows_and_arrows.text.tnt_arrow_lore1"));
                componentList.add(Component.translatable("more_bows_and_arrows.text.tnt_arrow_lore2"));
                componentList.add(Component.translatable("more_bows_and_arrows.text.tnt_arrow_damage"));
            }
        }

        super.appendHoverText(itemStack, context, componentList, flag);
    }
}
