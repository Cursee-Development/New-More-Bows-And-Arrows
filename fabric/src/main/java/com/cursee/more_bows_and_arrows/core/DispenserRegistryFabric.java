package com.cursee.more_bows_and_arrows.core;

import com.cursee.more_bows_and_arrows.core.entity.ModEntityTier;
import com.cursee.more_bows_and_arrows.core.entity.TypedArrowEntity;
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

//        DispenserBlock.registerBehavior(ModArrowItemsFabric.AMETHYST_ARROW, new AbstractProjectileDispenseBehavior() {
//            @Override
//            protected Projectile getProjectile(Level level, Position position, ItemStack itemStack) {
//                TypedArrowEntity arrow = new TypedArrowEntity(level, position.x(), position.y(), position.z(), ModEntityTier.AMETHYST, ModArrowItemsFabric.AMETHYST_ARROW);
//                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
//                return arrow;
//            }
//        });
//        DispenserBlock.registerBehavior(ModArrowItemsFabric.BAMBOO_ARROW, new AbstractProjectileDispenseBehavior() {
//            @Override
//            protected Projectile getProjectile(Level level, Position position, ItemStack itemStack) {
//                TypedArrowEntity arrow = new TypedArrowEntity(level, position.x(), position.y(), position.z(), ModEntityTier.BAMBOO, ModArrowItemsFabric.BAMBOO_ARROW);
//                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
//                return arrow;
//            }
//        });
//        DispenserBlock.registerBehavior(ModArrowItemsFabric.BLAZE_ROD_ARROW, new AbstractProjectileDispenseBehavior() {
//            @Override
//            protected Projectile getProjectile(Level level, Position position, ItemStack itemStack) {
//                TypedArrowEntity arrow = new TypedArrowEntity(level, position.x(), position.y(), position.z(), ModEntityTier.BLAZE_ROD, ModArrowItemsFabric.BLAZE_ROD_ARROW);
//                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
//                return arrow;
//            }
//        });
//        DispenserBlock.registerBehavior(ModArrowItemsFabric.BONE_ARROW, new AbstractProjectileDispenseBehavior() {
//            @Override
//            protected Projectile getProjectile(Level level, Position position, ItemStack itemStack) {
//                TypedArrowEntity arrow = new TypedArrowEntity(level, position.x(), position.y(), position.z(), ModEntityTier.BONE, ModArrowItemsFabric.BONE_ARROW);
//                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
//                return arrow;
//            }
//        });
//        DispenserBlock.registerBehavior(ModArrowItemsFabric.CACTUS_ARROW, new AbstractProjectileDispenseBehavior() {
//            @Override
//            protected Projectile getProjectile(Level level, Position position, ItemStack itemStack) {
//                TypedArrowEntity arrow = new TypedArrowEntity(level, position.x(), position.y(), position.z(), ModEntityTier.CACTUS, ModArrowItemsFabric.CACTUS_ARROW);
//                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
//                return arrow;
//            }
//        });
//        DispenserBlock.registerBehavior(ModArrowItemsFabric.COAL_ARROW, new AbstractProjectileDispenseBehavior() {
//            @Override
//            protected Projectile getProjectile(Level level, Position position, ItemStack itemStack) {
//                TypedArrowEntity arrow = new TypedArrowEntity(level, position.x(), position.y(), position.z(), ModEntityTier.COAL, ModArrowItemsFabric.COAL_ARROW);
//                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
//                return arrow;
//            }
//        });
//        DispenserBlock.registerBehavior(ModArrowItemsFabric.COPPER_ARROW, new AbstractProjectileDispenseBehavior() {
//            @Override
//            protected Projectile getProjectile(Level level, Position position, ItemStack itemStack) {
//                TypedArrowEntity arrow = new TypedArrowEntity(level, position.x(), position.y(), position.z(), ModEntityTier.COPPER, ModArrowItemsFabric.COPPER_ARROW);
//                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
//                return arrow;
//            }
//        });
//        DispenserBlock.registerBehavior(ModArrowItemsFabric.DIAMOND_ARROW, new AbstractProjectileDispenseBehavior() {
//            @Override
//            protected Projectile getProjectile(Level level, Position position, ItemStack itemStack) {
//                TypedArrowEntity arrow = new TypedArrowEntity(level, position.x(), position.y(), position.z(), ModEntityTier.DIAMOND, ModArrowItemsFabric.DIAMOND_ARROW);
//                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
//                return arrow;
//            }
//        });
//        DispenserBlock.registerBehavior(ModArrowItemsFabric.EMERALD_ARROW, new AbstractProjectileDispenseBehavior() {
//            @Override
//            protected Projectile getProjectile(Level level, Position position, ItemStack itemStack) {
//                TypedArrowEntity arrow = new TypedArrowEntity(level, position.x(), position.y(), position.z(), ModEntityTier.EMERALD, ModArrowItemsFabric.EMERALD_ARROW);
//                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
//                return arrow;
//            }
//        });
//        DispenserBlock.registerBehavior(ModArrowItemsFabric.ENDER_PEARL_ARROW, new AbstractProjectileDispenseBehavior() {
//            @Override
//            protected Projectile getProjectile(Level level, Position position, ItemStack itemStack) {
//                TypedArrowEntity arrow = new TypedArrowEntity(level, position.x(), position.y(), position.z(), ModEntityTier.ENDER_PEARL, ModArrowItemsFabric.ENDER_PEARL_ARROW);
//                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
//                return arrow;
//            }
//        });
//        DispenserBlock.registerBehavior(ModArrowItemsFabric.FLINT_AND_STEEL_ARROW, new AbstractProjectileDispenseBehavior() {
//            @Override
//            protected Projectile getProjectile(Level level, Position position, ItemStack itemStack) {
//                TypedArrowEntity arrow = new TypedArrowEntity(level, position.x(), position.y(), position.z(), ModEntityTier.FLINT_AND_STEEL, ModArrowItemsFabric.FLINT_AND_STEEL_ARROW);
//                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
//                return arrow;
//            }
//        });
//        DispenserBlock.registerBehavior(ModArrowItemsFabric.FLINT_ARROW, new AbstractProjectileDispenseBehavior() {
//            @Override
//            protected Projectile getProjectile(Level level, Position position, ItemStack itemStack) {
//                TypedArrowEntity arrow = new TypedArrowEntity(level, position.x(), position.y(), position.z(), ModEntityTier.FLINT, ModArrowItemsFabric.FLINT_ARROW);
//                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
//                return arrow;
//            }
//        });
//        DispenserBlock.registerBehavior(ModArrowItemsFabric.GOLD_ARROW, new AbstractProjectileDispenseBehavior() {
//            @Override
//            protected Projectile getProjectile(Level level, Position position, ItemStack itemStack) {
//                TypedArrowEntity arrow = new TypedArrowEntity(level, position.x(), position.y(), position.z(), ModEntityTier.GOLD, ModArrowItemsFabric.GOLD_ARROW);
//                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
//                return arrow;
//            }
//        });
//        DispenserBlock.registerBehavior(ModArrowItemsFabric.IRON_ARROW, new AbstractProjectileDispenseBehavior() {
//            @Override
//            protected Projectile getProjectile(Level level, Position position, ItemStack itemStack) {
//                TypedArrowEntity arrow = new TypedArrowEntity(level, position.x(), position.y(), position.z(), ModEntityTier.IRON, ModArrowItemsFabric.IRON_ARROW);
//                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
//                return arrow;
//            }
//        });
//        DispenserBlock.registerBehavior(ModArrowItemsFabric.LAPIS_ARROW, new AbstractProjectileDispenseBehavior() {
//            @Override
//            protected Projectile getProjectile(Level level, Position position, ItemStack itemStack) {
//                TypedArrowEntity arrow = new TypedArrowEntity(level, position.x(), position.y(), position.z(), ModEntityTier.LAPIS, ModArrowItemsFabric.LAPIS_ARROW);
//                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
//                return arrow;
//            }
//        });
//        DispenserBlock.registerBehavior(ModArrowItemsFabric.MOSS_ARROW, new AbstractProjectileDispenseBehavior() {
//            @Override
//            protected Projectile getProjectile(Level level, Position position, ItemStack itemStack) {
//                TypedArrowEntity arrow = new TypedArrowEntity(level, position.x(), position.y(), position.z(), ModEntityTier.MOSS, ModArrowItemsFabric.MOSS_ARROW);
//                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
//                return arrow;
//            }
//        });
//        DispenserBlock.registerBehavior(ModArrowItemsFabric.NETHERITE_ARROW, new AbstractProjectileDispenseBehavior() {
//            @Override
//            protected Projectile getProjectile(Level level, Position position, ItemStack itemStack) {
//                TypedArrowEntity arrow = new TypedArrowEntity(level, position.x(), position.y(), position.z(), ModEntityTier.NETHERITE, ModArrowItemsFabric.NETHERITE_ARROW);
//                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
//                return arrow;
//            }
//        });
//        DispenserBlock.registerBehavior(ModArrowItemsFabric.OBSIDIAN_ARROW, new AbstractProjectileDispenseBehavior() {
//            @Override
//            protected Projectile getProjectile(Level level, Position position, ItemStack itemStack) {
//                TypedArrowEntity arrow = new TypedArrowEntity(level, position.x(), position.y(), position.z(), ModEntityTier.OBSIDIAN, ModArrowItemsFabric.OBSIDIAN_ARROW);
//                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
//                return arrow;
//            }
//        });
//        DispenserBlock.registerBehavior(ModArrowItemsFabric.PAPER_ARROW, new AbstractProjectileDispenseBehavior() {
//            @Override
//            protected Projectile getProjectile(Level level, Position position, ItemStack itemStack) {
//                TypedArrowEntity arrow = new TypedArrowEntity(level, position.x(), position.y(), position.z(), ModEntityTier.PAPER, ModArrowItemsFabric.PAPER_ARROW);
//                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
//                return arrow;
//            }
//        });
//        DispenserBlock.registerBehavior(ModArrowItemsFabric.TNT_ARROW, new AbstractProjectileDispenseBehavior() {
//            @Override
//            protected Projectile getProjectile(Level level, Position position, ItemStack itemStack) {
//                TypedArrowEntity arrow = new TypedArrowEntity(level, position.x(), position.y(), position.z(), ModEntityTier.TNT, ModArrowItemsFabric.TNT_ARROW);
//                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
//                return arrow;
//            }
//        });








        Map<Item, AbstractProjectileDispenseBehavior> syncronizedDispenserMap = Object2ObjectMaps.synchronize(DISPENSER_OBJECT_MAP);

        DISPENSER_OBJECT_MAP.put(ModArrowItemsFabric.FLINT_AND_STEEL_ARROW, new AbstractProjectileDispenseBehavior() {
            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, pos.x(), pos.y(), pos.z(), ModEntityTier.FLINT_AND_STEEL, ModArrowItemsFabric.FLINT_AND_STEEL_ARROW);
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DISPENSER_OBJECT_MAP.put(ModArrowItemsFabric.ENDER_PEARL_ARROW, new AbstractProjectileDispenseBehavior() {
            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, pos.x(), pos.y(), pos.z(), ModEntityTier.AMETHYST, ModArrowItemsFabric.AMETHYST_ARROW);
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DISPENSER_OBJECT_MAP.put(ModArrowItemsFabric.TNT_ARROW, new AbstractProjectileDispenseBehavior() {
            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, pos.x(), pos.y(), pos.z(), ModEntityTier.AMETHYST, ModArrowItemsFabric.AMETHYST_ARROW);
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DISPENSER_OBJECT_MAP.put(ModArrowItemsFabric.PAPER_ARROW, new AbstractProjectileDispenseBehavior() {
            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, pos.x(), pos.y(), pos.z(), ModEntityTier.AMETHYST, ModArrowItemsFabric.AMETHYST_ARROW);
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DISPENSER_OBJECT_MAP.put(ModArrowItemsFabric.MOSS_ARROW, new AbstractProjectileDispenseBehavior() {
            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, pos.x(), pos.y(), pos.z(), ModEntityTier.AMETHYST, ModArrowItemsFabric.AMETHYST_ARROW);
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });

        DISPENSER_OBJECT_MAP.put(ModArrowItemsFabric.AMETHYST_ARROW, new AbstractProjectileDispenseBehavior() {
            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, pos.x(), pos.y(), pos.z(), ModEntityTier.AMETHYST, ModArrowItemsFabric.AMETHYST_ARROW);
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DISPENSER_OBJECT_MAP.put(ModArrowItemsFabric.BAMBOO_ARROW, new AbstractProjectileDispenseBehavior() {
            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, pos.x(), pos.y(), pos.z(), ModEntityTier.AMETHYST, ModArrowItemsFabric.AMETHYST_ARROW);
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DISPENSER_OBJECT_MAP.put(ModArrowItemsFabric.BLAZE_ROD_ARROW, new AbstractProjectileDispenseBehavior() {
            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, pos.x(), pos.y(), pos.z(), ModEntityTier.AMETHYST, ModArrowItemsFabric.AMETHYST_ARROW);
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DISPENSER_OBJECT_MAP.put(ModArrowItemsFabric.BONE_ARROW, new AbstractProjectileDispenseBehavior() {
            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, pos.x(), pos.y(), pos.z(), ModEntityTier.AMETHYST, ModArrowItemsFabric.AMETHYST_ARROW);
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DISPENSER_OBJECT_MAP.put(ModArrowItemsFabric.CACTUS_ARROW, new AbstractProjectileDispenseBehavior() {
            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, pos.x(), pos.y(), pos.z(), ModEntityTier.AMETHYST, ModArrowItemsFabric.AMETHYST_ARROW);
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DISPENSER_OBJECT_MAP.put(ModArrowItemsFabric.COAL_ARROW, new AbstractProjectileDispenseBehavior() {
            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, pos.x(), pos.y(), pos.z(), ModEntityTier.AMETHYST, ModArrowItemsFabric.AMETHYST_ARROW);
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DISPENSER_OBJECT_MAP.put(ModArrowItemsFabric.EMERALD_ARROW, new AbstractProjectileDispenseBehavior() {
            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, pos.x(), pos.y(), pos.z(), ModEntityTier.AMETHYST, ModArrowItemsFabric.AMETHYST_ARROW);
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DISPENSER_OBJECT_MAP.put(ModArrowItemsFabric.LAPIS_ARROW, new AbstractProjectileDispenseBehavior() {
            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, pos.x(), pos.y(), pos.z(), ModEntityTier.AMETHYST, ModArrowItemsFabric.AMETHYST_ARROW);
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DISPENSER_OBJECT_MAP.put(ModArrowItemsFabric.OBSIDIAN_ARROW, new AbstractProjectileDispenseBehavior() {
            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, pos.x(), pos.y(), pos.z(), ModEntityTier.AMETHYST, ModArrowItemsFabric.AMETHYST_ARROW);
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DISPENSER_OBJECT_MAP.put(ModArrowItemsFabric.FLINT_ARROW, new AbstractProjectileDispenseBehavior() {
            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, pos.x(), pos.y(), pos.z(), ModEntityTier.AMETHYST, ModArrowItemsFabric.AMETHYST_ARROW);
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });

        DISPENSER_OBJECT_MAP.put(ModArrowItemsFabric.IRON_ARROW, new AbstractProjectileDispenseBehavior() {
            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, pos.x(), pos.y(), pos.z(), ModEntityTier.AMETHYST, ModArrowItemsFabric.AMETHYST_ARROW);
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DISPENSER_OBJECT_MAP.put(ModArrowItemsFabric.COPPER_ARROW, new AbstractProjectileDispenseBehavior() {
            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, pos.x(), pos.y(), pos.z(), ModEntityTier.AMETHYST, ModArrowItemsFabric.AMETHYST_ARROW);
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DISPENSER_OBJECT_MAP.put(ModArrowItemsFabric.GOLD_ARROW, new AbstractProjectileDispenseBehavior() {
            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, pos.x(), pos.y(), pos.z(), ModEntityTier.AMETHYST, ModArrowItemsFabric.AMETHYST_ARROW);
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DISPENSER_OBJECT_MAP.put(ModArrowItemsFabric.DIAMOND_ARROW, new AbstractProjectileDispenseBehavior() {
            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, pos.x(), pos.y(), pos.z(), ModEntityTier.AMETHYST, ModArrowItemsFabric.AMETHYST_ARROW);
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });
        DISPENSER_OBJECT_MAP.put(ModArrowItemsFabric.NETHERITE_ARROW, new AbstractProjectileDispenseBehavior() {
            public @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position pos, @NotNull ItemStack stack) {
                TypedArrowEntity arrow = new TypedArrowEntity(level, pos.x(), pos.y(), pos.z(), ModEntityTier.AMETHYST, ModArrowItemsFabric.AMETHYST_ARROW);
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                return arrow;
            }
        });

        DispenserBlock.DISPENSER_REGISTRY.putAll(syncronizedDispenserMap);
    }
}