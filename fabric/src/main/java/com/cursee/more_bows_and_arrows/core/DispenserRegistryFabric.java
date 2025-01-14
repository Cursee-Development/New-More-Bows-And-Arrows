package com.cursee.more_bows_and_arrows.core;

import com.cursee.more_bows_and_arrows.core.entity.TypedArrowEntity;
import com.cursee.more_bows_and_arrows.core.item.ModArrowItemTier;
import com.cursee.more_bows_and_arrows.core.registry.ModArrowItemsFabric;
import net.minecraft.core.Position;
import net.minecraft.core.dispenser.AbstractProjectileDispenseBehavior;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.DispenserBlock;
import org.jetbrains.annotations.NotNull;

public class DispenserRegistryFabric {

    public static void register() {

        DispenserBlock.registerBehavior(ModArrowItemsFabric.AMETHYST_ARROW, new AbstractProjectileDispenseBehavior() {
            @Override
            protected @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position position, @NotNull ItemStack itemStack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, position.x(), position.y(), position.z(), ModArrowItemTier.AMETHYST, ModArrowItemsFabric.AMETHYST_ARROW);
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(ModArrowItemsFabric.BAMBOO_ARROW, new AbstractProjectileDispenseBehavior() {
            @Override
            protected @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position position, @NotNull ItemStack itemStack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, position.x(), position.y(), position.z(), ModArrowItemTier.BAMBOO, ModArrowItemsFabric.BAMBOO_ARROW);
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(ModArrowItemsFabric.BLAZE_ROD_ARROW, new AbstractProjectileDispenseBehavior() {
            @Override
            protected @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position position, @NotNull ItemStack itemStack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, position.x(), position.y(), position.z(), ModArrowItemTier.BLAZE_ROD, ModArrowItemsFabric.BLAZE_ROD_ARROW);
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(ModArrowItemsFabric.BONE_ARROW, new AbstractProjectileDispenseBehavior() {
            @Override
            protected @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position position, @NotNull ItemStack itemStack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, position.x(), position.y(), position.z(), ModArrowItemTier.BONE, ModArrowItemsFabric.BONE_ARROW);
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(ModArrowItemsFabric.CACTUS_ARROW, new AbstractProjectileDispenseBehavior() {
            @Override
            protected @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position position, @NotNull ItemStack itemStack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, position.x(), position.y(), position.z(), ModArrowItemTier.CACTUS, ModArrowItemsFabric.CACTUS_ARROW);
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(ModArrowItemsFabric.COAL_ARROW, new AbstractProjectileDispenseBehavior() {
            @Override
            protected @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position position, @NotNull ItemStack itemStack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, position.x(), position.y(), position.z(), ModArrowItemTier.COAL, ModArrowItemsFabric.COAL_ARROW);
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(ModArrowItemsFabric.COPPER_ARROW, new AbstractProjectileDispenseBehavior() {
            @Override
            protected @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position position, @NotNull ItemStack itemStack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, position.x(), position.y(), position.z(), ModArrowItemTier.COPPER, ModArrowItemsFabric.COPPER_ARROW);
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(ModArrowItemsFabric.DIAMOND_ARROW, new AbstractProjectileDispenseBehavior() {
            @Override
            protected @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position position, @NotNull ItemStack itemStack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, position.x(), position.y(), position.z(), ModArrowItemTier.DIAMOND, ModArrowItemsFabric.DIAMOND_ARROW);
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(ModArrowItemsFabric.EMERALD_ARROW, new AbstractProjectileDispenseBehavior() {
            @Override
            protected @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position position, @NotNull ItemStack itemStack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, position.x(), position.y(), position.z(), ModArrowItemTier.EMERALD, ModArrowItemsFabric.EMERALD_ARROW);
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(ModArrowItemsFabric.ENDER_PEARL_ARROW, new AbstractProjectileDispenseBehavior() {
            @Override
            protected @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position position, @NotNull ItemStack itemStack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, position.x(), position.y(), position.z(), ModArrowItemTier.ENDER_PEARL, ModArrowItemsFabric.ENDER_PEARL_ARROW);
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(ModArrowItemsFabric.FLINT_AND_STEEL_ARROW, new AbstractProjectileDispenseBehavior() {
            @Override
            protected @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position position, @NotNull ItemStack itemStack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, position.x(), position.y(), position.z(), ModArrowItemTier.FLINT_AND_STEEL, ModArrowItemsFabric.FLINT_AND_STEEL_ARROW);
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(ModArrowItemsFabric.FLINT_ARROW, new AbstractProjectileDispenseBehavior() {
            @Override
            protected @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position position, @NotNull ItemStack itemStack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, position.x(), position.y(), position.z(), ModArrowItemTier.FLINT, ModArrowItemsFabric.FLINT_ARROW);
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(ModArrowItemsFabric.GOLD_ARROW, new AbstractProjectileDispenseBehavior() {
            @Override
            protected @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position position, @NotNull ItemStack itemStack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, position.x(), position.y(), position.z(), ModArrowItemTier.GOLD, ModArrowItemsFabric.GOLD_ARROW);
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(ModArrowItemsFabric.IRON_ARROW, new AbstractProjectileDispenseBehavior() {
            @Override
            protected @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position position, @NotNull ItemStack itemStack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, position.x(), position.y(), position.z(), ModArrowItemTier.IRON, ModArrowItemsFabric.IRON_ARROW);
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(ModArrowItemsFabric.LAPIS_ARROW, new AbstractProjectileDispenseBehavior() {
            @Override
            protected @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position position, @NotNull ItemStack itemStack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, position.x(), position.y(), position.z(), ModArrowItemTier.LAPIS, ModArrowItemsFabric.LAPIS_ARROW);
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(ModArrowItemsFabric.MOSS_ARROW, new AbstractProjectileDispenseBehavior() {
            @Override
            protected @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position position, @NotNull ItemStack itemStack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, position.x(), position.y(), position.z(), ModArrowItemTier.MOSS, ModArrowItemsFabric.MOSS_ARROW);
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(ModArrowItemsFabric.NETHERITE_ARROW, new AbstractProjectileDispenseBehavior() {
            @Override
            protected @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position position, @NotNull ItemStack itemStack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, position.x(), position.y(), position.z(), ModArrowItemTier.NETHERITE, ModArrowItemsFabric.NETHERITE_ARROW);
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(ModArrowItemsFabric.OBSIDIAN_ARROW, new AbstractProjectileDispenseBehavior() {
            @Override
            protected @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position position, @NotNull ItemStack itemStack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, position.x(), position.y(), position.z(), ModArrowItemTier.OBSIDIAN, ModArrowItemsFabric.OBSIDIAN_ARROW);
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(ModArrowItemsFabric.PAPER_ARROW, new AbstractProjectileDispenseBehavior() {
            @Override
            protected @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position position, @NotNull ItemStack itemStack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, position.x(), position.y(), position.z(), ModArrowItemTier.PAPER, ModArrowItemsFabric.PAPER_ARROW);
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(ModArrowItemsFabric.TNT_ARROW, new AbstractProjectileDispenseBehavior() {
            @Override
            protected @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position position, @NotNull ItemStack itemStack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, position.x(), position.y(), position.z(), ModArrowItemTier.TNT, ModArrowItemsFabric.TNT_ARROW);
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
    }
}
