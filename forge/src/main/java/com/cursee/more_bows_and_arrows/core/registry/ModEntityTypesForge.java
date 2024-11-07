package com.cursee.more_bows_and_arrows.core.registry;

import com.cursee.more_bows_and_arrows.Constants;
import com.cursee.more_bows_and_arrows.core.entity.ModEntityTier;
import com.cursee.more_bows_and_arrows.core.entity.TypedArrowEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypesForge {

    public static void register() {}

    public static final String TEXTURE_LOCATION = new ResourceLocation(Constants.MOD_ID, "textures/entity/arrow").toString();

    public static final RegistryObject<EntityType<TypedArrowEntity>> AMETHYST_ARROW = RegistryForge.registerEntityType("amethyst_arrow", () ->
            EntityType.Builder.<TypedArrowEntity>of((entityType, level) -> new TypedArrowEntity(entityType, level, ModEntityTier.AMETHYST, ModArrowItemsForge.AMETHYST_ARROW.get()), MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(TEXTURE_LOCATION));

    public static final RegistryObject<EntityType<TypedArrowEntity>> BAMBOO_ARROW = RegistryForge.registerEntityType("bamboo_arrow", () ->
            EntityType.Builder.<TypedArrowEntity>of((entityType, level) -> new TypedArrowEntity(entityType, level, ModEntityTier.BAMBOO, ModArrowItemsForge.BAMBOO_ARROW.get()), MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(TEXTURE_LOCATION));

    public static final RegistryObject<EntityType<TypedArrowEntity>> BLAZE_ROD_ARROW = RegistryForge.registerEntityType("blaze_rod_arrow", () ->
            EntityType.Builder.<TypedArrowEntity>of((entityType, level) -> new TypedArrowEntity(entityType, level, ModEntityTier.BLAZE_ROD, ModArrowItemsForge.BLAZE_ROD_ARROW.get()), MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(TEXTURE_LOCATION));

    public static final RegistryObject<EntityType<TypedArrowEntity>> BONE_ARROW = RegistryForge.registerEntityType("bone_arrow", () ->
            EntityType.Builder.<TypedArrowEntity>of((entityType, level) -> new TypedArrowEntity(entityType, level, ModEntityTier.BONE, ModArrowItemsForge.BONE_ARROW.get()), MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(TEXTURE_LOCATION));

    public static final RegistryObject<EntityType<TypedArrowEntity>> CACTUS_ARROW = RegistryForge.registerEntityType("cactus_arrow", () ->
            EntityType.Builder.<TypedArrowEntity>of((entityType, level) -> new TypedArrowEntity(entityType, level, ModEntityTier.CACTUS, ModArrowItemsForge.CACTUS_ARROW.get()), MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(TEXTURE_LOCATION));

    public static final RegistryObject<EntityType<TypedArrowEntity>> COAL_ARROW = RegistryForge.registerEntityType("coal_arrow", () ->
            EntityType.Builder.<TypedArrowEntity>of((entityType, level) -> new TypedArrowEntity(entityType, level, ModEntityTier.COAL, ModArrowItemsForge.COAL_ARROW.get()), MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(TEXTURE_LOCATION));

    public static final RegistryObject<EntityType<TypedArrowEntity>> COPPER_ARROW = RegistryForge.registerEntityType("copper_arrow", () ->
            EntityType.Builder.<TypedArrowEntity>of((entityType, level) -> new TypedArrowEntity(entityType, level, ModEntityTier.COPPER, ModArrowItemsForge.COPPER_ARROW.get()), MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(TEXTURE_LOCATION));

    public static final RegistryObject<EntityType<TypedArrowEntity>> DIAMOND_ARROW = RegistryForge.registerEntityType("diamond_arrow", () ->
            EntityType.Builder.<TypedArrowEntity>of((entityType, level) -> new TypedArrowEntity(entityType, level, ModEntityTier.DIAMOND, ModArrowItemsForge.DIAMOND_ARROW.get()), MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(TEXTURE_LOCATION));

    public static final RegistryObject<EntityType<TypedArrowEntity>> EMERALD_ARROW = RegistryForge.registerEntityType("emerald_arrow", () ->
            EntityType.Builder.<TypedArrowEntity>of((entityType, level) -> new TypedArrowEntity(entityType, level, ModEntityTier.EMERALD, ModArrowItemsForge.EMERALD_ARROW.get()), MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(TEXTURE_LOCATION));

    public static final RegistryObject<EntityType<TypedArrowEntity>> ENDER_PEARL_ARROW = RegistryForge.registerEntityType("ender_pearl_arrow", () ->
            EntityType.Builder.<TypedArrowEntity>of((entityType, level) -> new TypedArrowEntity(entityType, level, ModEntityTier.ENDER_PEARL, ModArrowItemsForge.ENDER_PEARL_ARROW.get()), MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(TEXTURE_LOCATION));

    public static final RegistryObject<EntityType<TypedArrowEntity>> FLINT_AND_STEEL_ARROW = RegistryForge.registerEntityType("flint_and_steel_arrow", () ->
            EntityType.Builder.<TypedArrowEntity>of((entityType, level) -> new TypedArrowEntity(entityType, level, ModEntityTier.FLINT_AND_STEEL, ModArrowItemsForge.FLINT_AND_STEEL_ARROW.get()), MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(TEXTURE_LOCATION));

    public static final RegistryObject<EntityType<TypedArrowEntity>> FLINT_ARROW = RegistryForge.registerEntityType("flint_arrow", () ->
            EntityType.Builder.<TypedArrowEntity>of((entityType, level) -> new TypedArrowEntity(entityType, level, ModEntityTier.FLINT, ModArrowItemsForge.FLINT_ARROW.get()), MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(TEXTURE_LOCATION));

    public static final RegistryObject<EntityType<TypedArrowEntity>> GOLD_ARROW = RegistryForge.registerEntityType("gold_arrow", () ->
            EntityType.Builder.<TypedArrowEntity>of((entityType, level) -> new TypedArrowEntity(entityType, level, ModEntityTier.GOLD, ModArrowItemsForge.GOLD_ARROW.get()), MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(TEXTURE_LOCATION));

    public static final RegistryObject<EntityType<TypedArrowEntity>> IRON_ARROW = RegistryForge.registerEntityType("iron_arrow", () ->
            EntityType.Builder.<TypedArrowEntity>of((entityType, level) -> new TypedArrowEntity(entityType, level, ModEntityTier.IRON, ModArrowItemsForge.IRON_ARROW.get()), MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(TEXTURE_LOCATION));

    public static final RegistryObject<EntityType<TypedArrowEntity>> LAPIS_ARROW = RegistryForge.registerEntityType("lapis_arrow", () ->
            EntityType.Builder.<TypedArrowEntity>of((entityType, level) -> new TypedArrowEntity(entityType, level, ModEntityTier.LAPIS, ModArrowItemsForge.LAPIS_ARROW.get()), MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(TEXTURE_LOCATION));

    public static final RegistryObject<EntityType<TypedArrowEntity>> MOSS_ARROW = RegistryForge.registerEntityType("moss_arrow", () ->
            EntityType.Builder.<TypedArrowEntity>of((entityType, level) -> new TypedArrowEntity(entityType, level, ModEntityTier.MOSS, ModArrowItemsForge.MOSS_ARROW.get()), MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(TEXTURE_LOCATION));

    public static final RegistryObject<EntityType<TypedArrowEntity>> NETHERITE_ARROW = RegistryForge.registerEntityType("netherite_arrow", () ->
            EntityType.Builder.<TypedArrowEntity>of((entityType, level) -> new TypedArrowEntity(entityType, level, ModEntityTier.NETHERITE, ModArrowItemsForge.NETHERITE_ARROW.get()), MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(TEXTURE_LOCATION));

    public static final RegistryObject<EntityType<TypedArrowEntity>> OBSIDIAN_ARROW = RegistryForge.registerEntityType("obsidian_arrow", () ->
            EntityType.Builder.<TypedArrowEntity>of((entityType, level) -> new TypedArrowEntity(entityType, level, ModEntityTier.OBSIDIAN, ModArrowItemsForge.OBSIDIAN_ARROW.get()), MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(TEXTURE_LOCATION));

    public static final RegistryObject<EntityType<TypedArrowEntity>> PAPER_ARROW = RegistryForge.registerEntityType("paper_arrow", () ->
            EntityType.Builder.<TypedArrowEntity>of((entityType, level) -> new TypedArrowEntity(entityType, level, ModEntityTier.PAPER, ModArrowItemsForge.PAPER_ARROW.get()), MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(TEXTURE_LOCATION));

    public static final RegistryObject<EntityType<TypedArrowEntity>> TNT_ARROW = RegistryForge.registerEntityType("tnt_arrow", () ->
            EntityType.Builder.<TypedArrowEntity>of((entityType, level) -> new TypedArrowEntity(entityType, level, ModEntityTier.TNT, ModArrowItemsForge.TNT_ARROW.get()), MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(TEXTURE_LOCATION));
}
