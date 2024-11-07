package com.cursee.more_bows_and_arrows.core.registry;

import com.cursee.more_bows_and_arrows.core.entity.TypedArrowEntity;
import com.cursee.more_bows_and_arrows.core.item.ModArrowItemTier;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

public class ModEntityTypesFabric {

    public static void register() {}

    public static final EntityType<TypedArrowEntity> AMETHYST_ARROW = RegistryFabric.registerEntityType("amethyst_arrow", () ->
        EntityType.Builder.<TypedArrowEntity>of((entityType, level) -> new TypedArrowEntity(entityType, level, ModArrowItemTier.AMETHYST, ModArrowItemsFabric.AMETHYST_ARROW), MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build());

    public static final EntityType<TypedArrowEntity> BAMBOO_ARROW = RegistryFabric.registerEntityType("bamboo_arrow", () ->
        EntityType.Builder.<TypedArrowEntity>of((entityType, level) -> new TypedArrowEntity(entityType, level, ModArrowItemTier.BAMBOO, ModArrowItemsFabric.BAMBOO_ARROW), MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build());

    public static final EntityType<TypedArrowEntity> BLAZE_ROD_ARROW = RegistryFabric.registerEntityType("blaze_rod_arrow", () ->
        EntityType.Builder.<TypedArrowEntity>of((entityType, level) -> new TypedArrowEntity(entityType, level, ModArrowItemTier.BLAZE_ROD, ModArrowItemsFabric.BLAZE_ROD_ARROW), MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build());

    public static final EntityType<TypedArrowEntity> BONE_ARROW = RegistryFabric.registerEntityType("bone_arrow", () ->
        EntityType.Builder.<TypedArrowEntity>of((entityType, level) -> new TypedArrowEntity(entityType, level, ModArrowItemTier.BONE, ModArrowItemsFabric.BONE_ARROW), MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build());

    public static final EntityType<TypedArrowEntity> CACTUS_ARROW = RegistryFabric.registerEntityType("cactus_arrow", () ->
        EntityType.Builder.<TypedArrowEntity>of((entityType, level) -> new TypedArrowEntity(entityType, level, ModArrowItemTier.CACTUS, ModArrowItemsFabric.CACTUS_ARROW), MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build());

    public static final EntityType<TypedArrowEntity> COAL_ARROW = RegistryFabric.registerEntityType("coal_arrow", () ->
        EntityType.Builder.<TypedArrowEntity>of((entityType, level) -> new TypedArrowEntity(entityType, level, ModArrowItemTier.COAL, ModArrowItemsFabric.COAL_ARROW), MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build());

    public static final EntityType<TypedArrowEntity> COPPER_ARROW = RegistryFabric.registerEntityType("copper_arrow", () ->
        EntityType.Builder.<TypedArrowEntity>of((entityType, level) -> new TypedArrowEntity(entityType, level, ModArrowItemTier.COPPER, ModArrowItemsFabric.COPPER_ARROW), MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build());

    public static final EntityType<TypedArrowEntity> DIAMOND_ARROW = RegistryFabric.registerEntityType("diamond_arrow", () ->
        EntityType.Builder.<TypedArrowEntity>of((entityType, level) -> new TypedArrowEntity(entityType, level, ModArrowItemTier.DIAMOND, ModArrowItemsFabric.DIAMOND_ARROW), MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build());

    public static final EntityType<TypedArrowEntity> EMERALD_ARROW = RegistryFabric.registerEntityType("emerald_arrow", () ->
        EntityType.Builder.<TypedArrowEntity>of((entityType, level) -> new TypedArrowEntity(entityType, level, ModArrowItemTier.EMERALD, ModArrowItemsFabric.EMERALD_ARROW), MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build());

    public static final EntityType<TypedArrowEntity> ENDER_PEARL_ARROW = RegistryFabric.registerEntityType("ender_pearl_arrow", () ->
        EntityType.Builder.<TypedArrowEntity>of((entityType, level) -> new TypedArrowEntity(entityType, level, ModArrowItemTier.ENDER_PEARL, ModArrowItemsFabric.ENDER_PEARL_ARROW), MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build());

    public static final EntityType<TypedArrowEntity> FLINT_AND_STEEL_ARROW = RegistryFabric.registerEntityType("flint_and_steel_arrow", () ->
        EntityType.Builder.<TypedArrowEntity>of((entityType, level) -> new TypedArrowEntity(entityType, level, ModArrowItemTier.FLINT_AND_STEEL, ModArrowItemsFabric.FLINT_AND_STEEL_ARROW), MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build());

    public static final EntityType<TypedArrowEntity> FLINT_ARROW = RegistryFabric.registerEntityType("flint_arrow", () ->
        EntityType.Builder.<TypedArrowEntity>of((entityType, level) -> new TypedArrowEntity(entityType, level, ModArrowItemTier.FLINT, ModArrowItemsFabric.FLINT_ARROW), MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build());

    public static final EntityType<TypedArrowEntity> GOLD_ARROW = RegistryFabric.registerEntityType("gold_arrow", () ->
        EntityType.Builder.<TypedArrowEntity>of((entityType, level) -> new TypedArrowEntity(entityType, level, ModArrowItemTier.GOLD, ModArrowItemsFabric.GOLD_ARROW), MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build());

    public static final EntityType<TypedArrowEntity> IRON_ARROW = RegistryFabric.registerEntityType("iron_arrow", () ->
        EntityType.Builder.<TypedArrowEntity>of((entityType, level) -> new TypedArrowEntity(entityType, level, ModArrowItemTier.IRON, ModArrowItemsFabric.IRON_ARROW), MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build());

    public static final EntityType<TypedArrowEntity> LAPIS_ARROW = RegistryFabric.registerEntityType("lapis_arrow", () ->
        EntityType.Builder.<TypedArrowEntity>of((entityType, level) -> new TypedArrowEntity(entityType, level, ModArrowItemTier.LAPIS, ModArrowItemsFabric.LAPIS_ARROW), MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build());

    public static final EntityType<TypedArrowEntity> MOSS_ARROW = RegistryFabric.registerEntityType("moss_arrow", () ->
        EntityType.Builder.<TypedArrowEntity>of((entityType, level) -> new TypedArrowEntity(entityType, level, ModArrowItemTier.MOSS, ModArrowItemsFabric.MOSS_ARROW), MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build());

    public static final EntityType<TypedArrowEntity> NETHERITE_ARROW = RegistryFabric.registerEntityType("netherite_arrow", () ->
        EntityType.Builder.<TypedArrowEntity>of((entityType, level) -> new TypedArrowEntity(entityType, level, ModArrowItemTier.NETHERITE, ModArrowItemsFabric.NETHERITE_ARROW), MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build());

    public static final EntityType<TypedArrowEntity> OBSIDIAN_ARROW = RegistryFabric.registerEntityType("obsidian_arrow", () ->
        EntityType.Builder.<TypedArrowEntity>of((entityType, level) -> new TypedArrowEntity(entityType, level, ModArrowItemTier.OBSIDIAN, ModArrowItemsFabric.OBSIDIAN_ARROW), MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build());

    public static final EntityType<TypedArrowEntity> PAPER_ARROW = RegistryFabric.registerEntityType("paper_arrow", () ->
        EntityType.Builder.<TypedArrowEntity>of((entityType, level) -> new TypedArrowEntity(entityType, level, ModArrowItemTier.PAPER, ModArrowItemsFabric.PAPER_ARROW), MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build());

    public static final EntityType<TypedArrowEntity> TNT_ARROW = RegistryFabric.registerEntityType("tnt_arrow", () ->
        EntityType.Builder.<TypedArrowEntity>of((entityType, level) -> new TypedArrowEntity(entityType, level, ModArrowItemTier.TNT, ModArrowItemsFabric.TNT_ARROW), MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build());

}
