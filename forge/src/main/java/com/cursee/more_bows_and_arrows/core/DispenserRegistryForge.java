package com.cursee.more_bows_and_arrows.core;

import com.cursee.more_bows_and_arrows.core.entity.TypedArrowEntity;
import com.cursee.more_bows_and_arrows.core.item.ModArrowItemTier;
import com.cursee.more_bows_and_arrows.core.registry.ModArrowItemsForge;
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

public class DispenserRegistryForge {

    public static Object2ObjectMap<Item, AbstractProjectileDispenseBehavior> DISPENSER_OBJECT_MAP = new Object2ObjectOpenHashMap();

    public static void register() {
        Map<Item, AbstractProjectileDispenseBehavior> syncronizedDispenserMap = Object2ObjectMaps.synchronize(DISPENSER_OBJECT_MAP);

        DISPENSER_OBJECT_MAP.put(ModArrowItemsForge.FLINT_AND_STEEL_ARROW.get(), new AbstractProjectileDispenseBehavior() {
            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, pos.x(), pos.y(), pos.z(), ModArrowItemTier.FLINT_AND_STEEL, ModArrowItemsForge.FLINT_AND_STEEL_ARROW.get());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DISPENSER_OBJECT_MAP.put(ModArrowItemsForge.ENDER_PEARL_ARROW.get(), new AbstractProjectileDispenseBehavior() {
            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, pos.x(), pos.y(), pos.z(), ModArrowItemTier.ENDER_PEARL, ModArrowItemsForge.ENDER_PEARL_ARROW.get());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DISPENSER_OBJECT_MAP.put(ModArrowItemsForge.TNT_ARROW.get(), new AbstractProjectileDispenseBehavior() {
            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, pos.x(), pos.y(), pos.z(), ModArrowItemTier.TNT, ModArrowItemsForge.TNT_ARROW.get());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DISPENSER_OBJECT_MAP.put(ModArrowItemsForge.PAPER_ARROW.get(), new AbstractProjectileDispenseBehavior() {
            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, pos.x(), pos.y(), pos.z(), ModArrowItemTier.PAPER, ModArrowItemsForge.PAPER_ARROW.get());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DISPENSER_OBJECT_MAP.put(ModArrowItemsForge.MOSS_ARROW.get(), new AbstractProjectileDispenseBehavior() {
            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, pos.x(), pos.y(), pos.z(), ModArrowItemTier.MOSS, ModArrowItemsForge.MOSS_ARROW.get());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });

        DISPENSER_OBJECT_MAP.put(ModArrowItemsForge.AMETHYST_ARROW.get(), new AbstractProjectileDispenseBehavior() {
            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, pos.x(), pos.y(), pos.z(), ModArrowItemTier.AMETHYST, ModArrowItemsForge.AMETHYST_ARROW.get());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DISPENSER_OBJECT_MAP.put(ModArrowItemsForge.BAMBOO_ARROW.get(), new AbstractProjectileDispenseBehavior() {
            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, pos.x(), pos.y(), pos.z(), ModArrowItemTier.BAMBOO, ModArrowItemsForge.BAMBOO_ARROW.get());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DISPENSER_OBJECT_MAP.put(ModArrowItemsForge.BLAZE_ROD_ARROW.get(), new AbstractProjectileDispenseBehavior() {
            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, pos.x(), pos.y(), pos.z(), ModArrowItemTier.BLAZE_ROD, ModArrowItemsForge.BLAZE_ROD_ARROW.get());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DISPENSER_OBJECT_MAP.put(ModArrowItemsForge.BONE_ARROW.get(), new AbstractProjectileDispenseBehavior() {
            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, pos.x(), pos.y(), pos.z(), ModArrowItemTier.BONE, ModArrowItemsForge.BONE_ARROW.get());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DISPENSER_OBJECT_MAP.put(ModArrowItemsForge.CACTUS_ARROW.get(), new AbstractProjectileDispenseBehavior() {
            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, pos.x(), pos.y(), pos.z(), ModArrowItemTier.CACTUS, ModArrowItemsForge.CACTUS_ARROW.get());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DISPENSER_OBJECT_MAP.put(ModArrowItemsForge.COAL_ARROW.get(), new AbstractProjectileDispenseBehavior() {
            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, pos.x(), pos.y(), pos.z(), ModArrowItemTier.COAL, ModArrowItemsForge.COAL_ARROW.get());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DISPENSER_OBJECT_MAP.put(ModArrowItemsForge.EMERALD_ARROW.get(), new AbstractProjectileDispenseBehavior() {
            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, pos.x(), pos.y(), pos.z(), ModArrowItemTier.EMERALD, ModArrowItemsForge.EMERALD_ARROW.get());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DISPENSER_OBJECT_MAP.put(ModArrowItemsForge.LAPIS_ARROW.get(), new AbstractProjectileDispenseBehavior() {
            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, pos.x(), pos.y(), pos.z(), ModArrowItemTier.LAPIS, ModArrowItemsForge.LAPIS_ARROW.get());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DISPENSER_OBJECT_MAP.put(ModArrowItemsForge.OBSIDIAN_ARROW.get(), new AbstractProjectileDispenseBehavior() {
            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, pos.x(), pos.y(), pos.z(), ModArrowItemTier.OBSIDIAN, ModArrowItemsForge.OBSIDIAN_ARROW.get());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DISPENSER_OBJECT_MAP.put(ModArrowItemsForge.FLINT_ARROW.get(), new AbstractProjectileDispenseBehavior() {
            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, pos.x(), pos.y(), pos.z(), ModArrowItemTier.FLINT, ModArrowItemsForge.FLINT_ARROW.get());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });

        DISPENSER_OBJECT_MAP.put(ModArrowItemsForge.IRON_ARROW.get(), new AbstractProjectileDispenseBehavior() {
            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, pos.x(), pos.y(), pos.z(), ModArrowItemTier.IRON, ModArrowItemsForge.IRON_ARROW.get());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DISPENSER_OBJECT_MAP.put(ModArrowItemsForge.COPPER_ARROW.get(), new AbstractProjectileDispenseBehavior() {
            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, pos.x(), pos.y(), pos.z(), ModArrowItemTier.COPPER, ModArrowItemsForge.COPPER_ARROW.get());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DISPENSER_OBJECT_MAP.put(ModArrowItemsForge.GOLD_ARROW.get(), new AbstractProjectileDispenseBehavior() {
            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, pos.x(), pos.y(), pos.z(), ModArrowItemTier.GOLD, ModArrowItemsForge.GOLD_ARROW.get());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DISPENSER_OBJECT_MAP.put(ModArrowItemsForge.DIAMOND_ARROW.get(), new AbstractProjectileDispenseBehavior() {
            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, pos.x(), pos.y(), pos.z(), ModArrowItemTier.DIAMOND, ModArrowItemsForge.DIAMOND_ARROW.get());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DISPENSER_OBJECT_MAP.put(ModArrowItemsForge.NETHERITE_ARROW.get(), new AbstractProjectileDispenseBehavior() {
            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, pos.x(), pos.y(), pos.z(), ModArrowItemTier.NETHERITE, ModArrowItemsForge.NETHERITE_ARROW.get());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });

        DispenserBlock.DISPENSER_REGISTRY.putAll(syncronizedDispenserMap);
    }
}
