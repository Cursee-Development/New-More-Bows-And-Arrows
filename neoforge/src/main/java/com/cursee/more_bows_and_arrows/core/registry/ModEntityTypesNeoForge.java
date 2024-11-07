package com.cursee.more_bows_and_arrows.core.registry;

import com.cursee.more_bows_and_arrows.Constants;
import com.cursee.more_bows_and_arrows.core.entity.TypedArrowEntity;
import com.cursee.more_bows_and_arrows.core.item.ModArrowItemTier;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.neoforge.registries.DeferredHolder;

public class ModEntityTypesNeoForge {

    public static void register() {}

    public static final String TEXTURE_LOCATION = ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "textures/entity/arrow").toString();

    public static final DeferredHolder<EntityType<?>, EntityType<TypedArrowEntity>> AMETHYST_ARROW = RegistryNeoForge.registerEntityType("amethyst_arrow", () ->
            EntityType.Builder.<TypedArrowEntity>of((entityType, level) -> new TypedArrowEntity(entityType, level, ModArrowItemTier.AMETHYST, ModArrowItemsNeoForge.AMETHYST_ARROW.get()), MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(TEXTURE_LOCATION));

    public static final DeferredHolder<EntityType<?>, EntityType<TypedArrowEntity>> BAMBOO_ARROW = RegistryNeoForge.registerEntityType("bamboo_arrow", () ->
            EntityType.Builder.<TypedArrowEntity>of((entityType, level) -> new TypedArrowEntity(entityType, level, ModArrowItemTier.BAMBOO, ModArrowItemsNeoForge.BAMBOO_ARROW.get()), MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(TEXTURE_LOCATION));

    public static final DeferredHolder<EntityType<?>, EntityType<TypedArrowEntity>> BLAZE_ROD_ARROW = RegistryNeoForge.registerEntityType("blaze_rod_arrow", () ->
            EntityType.Builder.<TypedArrowEntity>of((entityType, level) -> new TypedArrowEntity(entityType, level, ModArrowItemTier.BLAZE_ROD, ModArrowItemsNeoForge.BLAZE_ROD_ARROW.get()), MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(TEXTURE_LOCATION));

    public static final DeferredHolder<EntityType<?>, EntityType<TypedArrowEntity>> BONE_ARROW = RegistryNeoForge.registerEntityType("bone_arrow", () ->
            EntityType.Builder.<TypedArrowEntity>of((entityType, level) -> new TypedArrowEntity(entityType, level, ModArrowItemTier.BONE, ModArrowItemsNeoForge.BONE_ARROW.get()), MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(TEXTURE_LOCATION));

    public static final DeferredHolder<EntityType<?>, EntityType<TypedArrowEntity>> CACTUS_ARROW = RegistryNeoForge.registerEntityType("cactus_arrow", () ->
            EntityType.Builder.<TypedArrowEntity>of((entityType, level) -> new TypedArrowEntity(entityType, level, ModArrowItemTier.CACTUS, ModArrowItemsNeoForge.CACTUS_ARROW.get()), MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(TEXTURE_LOCATION));

    public static final DeferredHolder<EntityType<?>, EntityType<TypedArrowEntity>> COAL_ARROW = RegistryNeoForge.registerEntityType("coal_arrow", () ->
            EntityType.Builder.<TypedArrowEntity>of((entityType, level) -> new TypedArrowEntity(entityType, level, ModArrowItemTier.COAL, ModArrowItemsNeoForge.COAL_ARROW.get()), MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(TEXTURE_LOCATION));

    public static final DeferredHolder<EntityType<?>, EntityType<TypedArrowEntity>> COPPER_ARROW = RegistryNeoForge.registerEntityType("copper_arrow", () ->
            EntityType.Builder.<TypedArrowEntity>of((entityType, level) -> new TypedArrowEntity(entityType, level, ModArrowItemTier.COPPER, ModArrowItemsNeoForge.COPPER_ARROW.get()), MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(TEXTURE_LOCATION));

    public static final DeferredHolder<EntityType<?>, EntityType<TypedArrowEntity>> DIAMOND_ARROW = RegistryNeoForge.registerEntityType("diamond_arrow", () ->
            EntityType.Builder.<TypedArrowEntity>of((entityType, level) -> new TypedArrowEntity(entityType, level, ModArrowItemTier.DIAMOND, ModArrowItemsNeoForge.DIAMOND_ARROW.get()), MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(TEXTURE_LOCATION));

    public static final DeferredHolder<EntityType<?>, EntityType<TypedArrowEntity>> EMERALD_ARROW = RegistryNeoForge.registerEntityType("emerald_arrow", () ->
            EntityType.Builder.<TypedArrowEntity>of((entityType, level) -> new TypedArrowEntity(entityType, level, ModArrowItemTier.EMERALD, ModArrowItemsNeoForge.EMERALD_ARROW.get()), MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(TEXTURE_LOCATION));

    public static final DeferredHolder<EntityType<?>, EntityType<TypedArrowEntity>> ENDER_PEARL_ARROW = RegistryNeoForge.registerEntityType("ender_pearl_arrow", () ->
            EntityType.Builder.<TypedArrowEntity>of((entityType, level) -> new TypedArrowEntity(entityType, level, ModArrowItemTier.ENDER_PEARL, ModArrowItemsNeoForge.ENDER_PEARL_ARROW.get()), MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(TEXTURE_LOCATION));

    public static final DeferredHolder<EntityType<?>, EntityType<TypedArrowEntity>> FLINT_AND_STEEL_ARROW = RegistryNeoForge.registerEntityType("flint_and_steel_arrow", () ->
            EntityType.Builder.<TypedArrowEntity>of((entityType, level) -> new TypedArrowEntity(entityType, level, ModArrowItemTier.FLINT_AND_STEEL, ModArrowItemsNeoForge.FLINT_AND_STEEL_ARROW.get()), MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(TEXTURE_LOCATION));

    public static final DeferredHolder<EntityType<?>, EntityType<TypedArrowEntity>> FLINT_ARROW = RegistryNeoForge.registerEntityType("flint_arrow", () ->
            EntityType.Builder.<TypedArrowEntity>of((entityType, level) -> new TypedArrowEntity(entityType, level, ModArrowItemTier.FLINT, ModArrowItemsNeoForge.FLINT_ARROW.get()), MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(TEXTURE_LOCATION));

    public static final DeferredHolder<EntityType<?>, EntityType<TypedArrowEntity>> GOLD_ARROW = RegistryNeoForge.registerEntityType("gold_arrow", () ->
            EntityType.Builder.<TypedArrowEntity>of((entityType, level) -> new TypedArrowEntity(entityType, level, ModArrowItemTier.GOLD, ModArrowItemsNeoForge.GOLD_ARROW.get()), MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(TEXTURE_LOCATION));

    public static final DeferredHolder<EntityType<?>, EntityType<TypedArrowEntity>> IRON_ARROW = RegistryNeoForge.registerEntityType("iron_arrow", () ->
            EntityType.Builder.<TypedArrowEntity>of((entityType, level) -> new TypedArrowEntity(entityType, level, ModArrowItemTier.IRON, ModArrowItemsNeoForge.IRON_ARROW.get()), MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(TEXTURE_LOCATION));

    public static final DeferredHolder<EntityType<?>, EntityType<TypedArrowEntity>> LAPIS_ARROW = RegistryNeoForge.registerEntityType("lapis_arrow", () ->
            EntityType.Builder.<TypedArrowEntity>of((entityType, level) -> new TypedArrowEntity(entityType, level, ModArrowItemTier.LAPIS, ModArrowItemsNeoForge.LAPIS_ARROW.get()), MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(TEXTURE_LOCATION));

    public static final DeferredHolder<EntityType<?>, EntityType<TypedArrowEntity>> MOSS_ARROW = RegistryNeoForge.registerEntityType("moss_arrow", () ->
            EntityType.Builder.<TypedArrowEntity>of((entityType, level) -> new TypedArrowEntity(entityType, level, ModArrowItemTier.MOSS, ModArrowItemsNeoForge.MOSS_ARROW.get()), MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(TEXTURE_LOCATION));

    public static final DeferredHolder<EntityType<?>, EntityType<TypedArrowEntity>> NETHERITE_ARROW = RegistryNeoForge.registerEntityType("netherite_arrow", () ->
            EntityType.Builder.<TypedArrowEntity>of((entityType, level) -> new TypedArrowEntity(entityType, level, ModArrowItemTier.NETHERITE, ModArrowItemsNeoForge.NETHERITE_ARROW.get()), MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(TEXTURE_LOCATION));

    public static final DeferredHolder<EntityType<?>, EntityType<TypedArrowEntity>> OBSIDIAN_ARROW = RegistryNeoForge.registerEntityType("obsidian_arrow", () ->
            EntityType.Builder.<TypedArrowEntity>of((entityType, level) -> new TypedArrowEntity(entityType, level, ModArrowItemTier.OBSIDIAN, ModArrowItemsNeoForge.OBSIDIAN_ARROW.get()), MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(TEXTURE_LOCATION));

    public static final DeferredHolder<EntityType<?>, EntityType<TypedArrowEntity>> PAPER_ARROW = RegistryNeoForge.registerEntityType("paper_arrow", () ->
            EntityType.Builder.<TypedArrowEntity>of((entityType, level) -> new TypedArrowEntity(entityType, level, ModArrowItemTier.PAPER, ModArrowItemsNeoForge.PAPER_ARROW.get()), MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(TEXTURE_LOCATION));

    public static final DeferredHolder<EntityType<?>, EntityType<TypedArrowEntity>> TNT_ARROW = RegistryNeoForge.registerEntityType("tnt_arrow", () ->
            EntityType.Builder.<TypedArrowEntity>of((entityType, level) -> new TypedArrowEntity(entityType, level, ModArrowItemTier.TNT, ModArrowItemsNeoForge.TNT_ARROW.get()), MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(TEXTURE_LOCATION));
}
