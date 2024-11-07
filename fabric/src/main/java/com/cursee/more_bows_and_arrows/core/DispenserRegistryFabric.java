package com.cursee.more_bows_and_arrows.core;

import com.cursee.more_bows_and_arrows.core.entity.TypedArrowEntity;
import com.cursee.more_bows_and_arrows.core.item.ModArrowItemTier;
import com.cursee.more_bows_and_arrows.core.registry.ModArrowItemsFabric;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMaps;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.minecraft.core.Position;
import net.minecraft.core.dispenser.AbstractProjectileDispenseBehavior;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.DispenserBlock;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

public class DispenserRegistryFabric {

    public static Object2ObjectMap<Item, AbstractProjectileDispenseBehavior> DISPENSER_OBJECT_MAP = new Object2ObjectOpenHashMap();

    public static void register() {

        Map<Item, AbstractProjectileDispenseBehavior> syncronizedDispenserMap = Object2ObjectMaps.synchronize(DISPENSER_OBJECT_MAP);

        DISPENSER_OBJECT_MAP.put(ModArrowItemsFabric.FLINT_AND_STEEL_ARROW, new AbstractProjectileDispenseBehavior() {
            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, pos.x(), pos.y(), pos.z(), ModArrowItemTier.FLINT_AND_STEEL, ModArrowItemsFabric.FLINT_AND_STEEL_ARROW);
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DISPENSER_OBJECT_MAP.put(ModArrowItemsFabric.ENDER_PEARL_ARROW, new AbstractProjectileDispenseBehavior() {
            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, pos.x(), pos.y(), pos.z(), ModArrowItemTier.ENDER_PEARL, ModArrowItemsFabric.ENDER_PEARL_ARROW);
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DISPENSER_OBJECT_MAP.put(ModArrowItemsFabric.TNT_ARROW, new AbstractProjectileDispenseBehavior() {
            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, pos.x(), pos.y(), pos.z(), ModArrowItemTier.TNT, ModArrowItemsFabric.TNT_ARROW);
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DISPENSER_OBJECT_MAP.put(ModArrowItemsFabric.PAPER_ARROW, new AbstractProjectileDispenseBehavior() {
            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, pos.x(), pos.y(), pos.z(), ModArrowItemTier.PAPER, ModArrowItemsFabric.PAPER_ARROW);
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DISPENSER_OBJECT_MAP.put(ModArrowItemsFabric.MOSS_ARROW, new AbstractProjectileDispenseBehavior() {
            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, pos.x(), pos.y(), pos.z(), ModArrowItemTier.MOSS, ModArrowItemsFabric.MOSS_ARROW);
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });

        DISPENSER_OBJECT_MAP.put(ModArrowItemsFabric.AMETHYST_ARROW, new AbstractProjectileDispenseBehavior() {
            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, pos.x(), pos.y(), pos.z(), ModArrowItemTier.AMETHYST, ModArrowItemsFabric.AMETHYST_ARROW);
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DISPENSER_OBJECT_MAP.put(ModArrowItemsFabric.BAMBOO_ARROW, new AbstractProjectileDispenseBehavior() {
            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, pos.x(), pos.y(), pos.z(), ModArrowItemTier.BAMBOO, ModArrowItemsFabric.BAMBOO_ARROW);
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DISPENSER_OBJECT_MAP.put(ModArrowItemsFabric.BLAZE_ROD_ARROW, new AbstractProjectileDispenseBehavior() {
            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, pos.x(), pos.y(), pos.z(), ModArrowItemTier.BLAZE_ROD, ModArrowItemsFabric.BLAZE_ROD_ARROW);
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DISPENSER_OBJECT_MAP.put(ModArrowItemsFabric.BONE_ARROW, new AbstractProjectileDispenseBehavior() {
            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, pos.x(), pos.y(), pos.z(), ModArrowItemTier.BONE, ModArrowItemsFabric.BONE_ARROW);
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DISPENSER_OBJECT_MAP.put(ModArrowItemsFabric.CACTUS_ARROW, new AbstractProjectileDispenseBehavior() {
            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, pos.x(), pos.y(), pos.z(), ModArrowItemTier.CACTUS, ModArrowItemsFabric.CACTUS_ARROW);
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DISPENSER_OBJECT_MAP.put(ModArrowItemsFabric.COAL_ARROW, new AbstractProjectileDispenseBehavior() {
            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, pos.x(), pos.y(), pos.z(), ModArrowItemTier.COAL, ModArrowItemsFabric.COAL_ARROW);
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DISPENSER_OBJECT_MAP.put(ModArrowItemsFabric.EMERALD_ARROW, new AbstractProjectileDispenseBehavior() {
            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, pos.x(), pos.y(), pos.z(), ModArrowItemTier.EMERALD, ModArrowItemsFabric.EMERALD_ARROW);
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DISPENSER_OBJECT_MAP.put(ModArrowItemsFabric.LAPIS_ARROW, new AbstractProjectileDispenseBehavior() {
            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, pos.x(), pos.y(), pos.z(), ModArrowItemTier.LAPIS, ModArrowItemsFabric.LAPIS_ARROW);
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DISPENSER_OBJECT_MAP.put(ModArrowItemsFabric.OBSIDIAN_ARROW, new AbstractProjectileDispenseBehavior() {
            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, pos.x(), pos.y(), pos.z(), ModArrowItemTier.OBSIDIAN, ModArrowItemsFabric.OBSIDIAN_ARROW);
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DISPENSER_OBJECT_MAP.put(ModArrowItemsFabric.FLINT_ARROW, new AbstractProjectileDispenseBehavior() {
            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, pos.x(), pos.y(), pos.z(), ModArrowItemTier.FLINT, ModArrowItemsFabric.FLINT_ARROW);
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });

        DISPENSER_OBJECT_MAP.put(ModArrowItemsFabric.IRON_ARROW, new AbstractProjectileDispenseBehavior() {
            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, pos.x(), pos.y(), pos.z(), ModArrowItemTier.IRON, ModArrowItemsFabric.IRON_ARROW);
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DISPENSER_OBJECT_MAP.put(ModArrowItemsFabric.COPPER_ARROW, new AbstractProjectileDispenseBehavior() {
            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, pos.x(), pos.y(), pos.z(), ModArrowItemTier.COPPER, ModArrowItemsFabric.COPPER_ARROW);
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DISPENSER_OBJECT_MAP.put(ModArrowItemsFabric.GOLD_ARROW, new AbstractProjectileDispenseBehavior() {
            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, pos.x(), pos.y(), pos.z(), ModArrowItemTier.GOLD, ModArrowItemsFabric.GOLD_ARROW);
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DISPENSER_OBJECT_MAP.put(ModArrowItemsFabric.DIAMOND_ARROW, new AbstractProjectileDispenseBehavior() {
            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, pos.x(), pos.y(), pos.z(), ModArrowItemTier.DIAMOND, ModArrowItemsFabric.DIAMOND_ARROW);
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DISPENSER_OBJECT_MAP.put(ModArrowItemsFabric.NETHERITE_ARROW, new AbstractProjectileDispenseBehavior() {
            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, pos.x(), pos.y(), pos.z(), ModArrowItemTier.NETHERITE, ModArrowItemsFabric.NETHERITE_ARROW);
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });

        DispenserBlock.DISPENSER_REGISTRY.putAll(syncronizedDispenserMap);
    }
}
