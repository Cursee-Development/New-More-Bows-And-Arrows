package com.cursee.more_bows_and_arrows.core.registry;

import com.cursee.more_bows_and_arrows.core.entity.ModEntityTier;
import com.cursee.more_bows_and_arrows.core.entity.TypedArrowEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

public class ModEntityTypesFabric {

    public static void register() {}

    public static final EntityType<TypedArrowEntity> AMETHYST_ARROW = RegistryFabric.registerEntityType("amethyst_arrow", () ->
        FabricEntityTypeBuilder.<TypedArrowEntity>create(MobCategory.MISC, (entityType, level) -> new TypedArrowEntity(entityType, level, ModEntityTier.AMETHYST, ModArrowItemsFabric.AMETHYST_ARROW)).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(4).trackedUpdateRate(20).build());

    public static final EntityType<TypedArrowEntity> BAMBOO_ARROW = RegistryFabric.registerEntityType("bamboo_arrow", () ->
        FabricEntityTypeBuilder.<TypedArrowEntity>create(MobCategory.MISC, (entityType, level) -> new TypedArrowEntity(entityType, level, ModEntityTier.BAMBOO, ModArrowItemsFabric.BAMBOO_ARROW)).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(4).trackedUpdateRate(20).build());

    public static final EntityType<TypedArrowEntity> BLAZE_ROD_ARROW = RegistryFabric.registerEntityType("blaze_rod_arrow", () ->
        FabricEntityTypeBuilder.<TypedArrowEntity>create(MobCategory.MISC, (entityType, level) -> new TypedArrowEntity(entityType, level, ModEntityTier.BLAZE_ROD, ModArrowItemsFabric.BLAZE_ROD_ARROW)).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(4).trackedUpdateRate(20).build());

    public static final EntityType<TypedArrowEntity> BONE_ARROW = RegistryFabric.registerEntityType("bone_arrow", () ->
        FabricEntityTypeBuilder.<TypedArrowEntity>create(MobCategory.MISC, (entityType, level) -> new TypedArrowEntity(entityType, level, ModEntityTier.BONE, ModArrowItemsFabric.BONE_ARROW)).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(4).trackedUpdateRate(20).build());

    public static final EntityType<TypedArrowEntity> CACTUS_ARROW = RegistryFabric.registerEntityType("cactus_arrow", () ->
        FabricEntityTypeBuilder.<TypedArrowEntity>create(MobCategory.MISC, (entityType, level) -> new TypedArrowEntity(entityType, level, ModEntityTier.CACTUS, ModArrowItemsFabric.CACTUS_ARROW)).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(4).trackedUpdateRate(20).build());

    public static final EntityType<TypedArrowEntity> COAL_ARROW = RegistryFabric.registerEntityType("coal_arrow", () ->
        FabricEntityTypeBuilder.<TypedArrowEntity>create(MobCategory.MISC, (entityType, level) -> new TypedArrowEntity(entityType, level, ModEntityTier.COAL, ModArrowItemsFabric.COAL_ARROW)).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(4).trackedUpdateRate(20).build());

    public static final EntityType<TypedArrowEntity> COPPER_ARROW = RegistryFabric.registerEntityType("copper_arrow", () ->
        FabricEntityTypeBuilder.<TypedArrowEntity>create(MobCategory.MISC, (entityType, level) -> new TypedArrowEntity(entityType, level, ModEntityTier.COPPER, ModArrowItemsFabric.COPPER_ARROW)).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(4).trackedUpdateRate(20).build());

    public static final EntityType<TypedArrowEntity> DIAMOND_ARROW = RegistryFabric.registerEntityType("diamond_arrow", () ->
        FabricEntityTypeBuilder.<TypedArrowEntity>create(MobCategory.MISC, (entityType, level) -> new TypedArrowEntity(entityType, level, ModEntityTier.DIAMOND, ModArrowItemsFabric.DIAMOND_ARROW)).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(4).trackedUpdateRate(20).build());

    public static final EntityType<TypedArrowEntity> EMERALD_ARROW = RegistryFabric.registerEntityType("emerald_arrow", () ->
        FabricEntityTypeBuilder.<TypedArrowEntity>create(MobCategory.MISC, (entityType, level) -> new TypedArrowEntity(entityType, level, ModEntityTier.EMERALD, ModArrowItemsFabric.EMERALD_ARROW)).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(4).trackedUpdateRate(20).build());

    public static final EntityType<TypedArrowEntity> ENDER_PEARL_ARROW = RegistryFabric.registerEntityType("ender_pearl_arrow", () ->
        FabricEntityTypeBuilder.<TypedArrowEntity>create(MobCategory.MISC, (entityType, level) -> new TypedArrowEntity(entityType, level, ModEntityTier.ENDER_PEARL, ModArrowItemsFabric.ENDER_PEARL_ARROW)).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(4).trackedUpdateRate(20).build());

    public static final EntityType<TypedArrowEntity> FLINT_AND_STEEL_ARROW = RegistryFabric.registerEntityType("flint_and_steel_arrow", () ->
        FabricEntityTypeBuilder.<TypedArrowEntity>create(MobCategory.MISC, (entityType, level) -> new TypedArrowEntity(entityType, level, ModEntityTier.FLINT_AND_STEEL, ModArrowItemsFabric.FLINT_AND_STEEL_ARROW)).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(4).trackedUpdateRate(20).build());

    public static final EntityType<TypedArrowEntity> FLINT_ARROW = RegistryFabric.registerEntityType("flint_arrow", () ->
        FabricEntityTypeBuilder.<TypedArrowEntity>create(MobCategory.MISC, (entityType, level) -> new TypedArrowEntity(entityType, level, ModEntityTier.FLINT, ModArrowItemsFabric.FLINT_ARROW)).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(4).trackedUpdateRate(20).build());

    public static final EntityType<TypedArrowEntity> GOLD_ARROW = RegistryFabric.registerEntityType("gold_arrow", () ->
        FabricEntityTypeBuilder.<TypedArrowEntity>create(MobCategory.MISC, (entityType, level) -> new TypedArrowEntity(entityType, level, ModEntityTier.GOLD, ModArrowItemsFabric.GOLD_ARROW)).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(4).trackedUpdateRate(20).build());

    public static final EntityType<TypedArrowEntity> IRON_ARROW = RegistryFabric.registerEntityType("iron_arrow", () ->
        FabricEntityTypeBuilder.<TypedArrowEntity>create(MobCategory.MISC, (entityType, level) -> new TypedArrowEntity(entityType, level, ModEntityTier.IRON, ModArrowItemsFabric.IRON_ARROW)).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(4).trackedUpdateRate(20).build());

    public static final EntityType<TypedArrowEntity> LAPIS_ARROW = RegistryFabric.registerEntityType("lapis_arrow", () ->
        FabricEntityTypeBuilder.<TypedArrowEntity>create(MobCategory.MISC, (entityType, level) -> new TypedArrowEntity(entityType, level, ModEntityTier.LAPIS, ModArrowItemsFabric.LAPIS_ARROW)).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(4).trackedUpdateRate(20).build());

    public static final EntityType<TypedArrowEntity> MOSS_ARROW = RegistryFabric.registerEntityType("moss_arrow", () ->
        FabricEntityTypeBuilder.<TypedArrowEntity>create(MobCategory.MISC, (entityType, level) -> new TypedArrowEntity(entityType, level, ModEntityTier.MOSS, ModArrowItemsFabric.MOSS_ARROW)).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(4).trackedUpdateRate(20).build());

    public static final EntityType<TypedArrowEntity> NETHERITE_ARROW = RegistryFabric.registerEntityType("netherite_arrow", () ->
        FabricEntityTypeBuilder.<TypedArrowEntity>create(MobCategory.MISC, (entityType, level) -> new TypedArrowEntity(entityType, level, ModEntityTier.NETHERITE, ModArrowItemsFabric.NETHERITE_ARROW)).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(4).trackedUpdateRate(20).build());

    public static final EntityType<TypedArrowEntity> OBSIDIAN_ARROW = RegistryFabric.registerEntityType("obsidian_arrow", () ->
        FabricEntityTypeBuilder.<TypedArrowEntity>create(MobCategory.MISC, (entityType, level) -> new TypedArrowEntity(entityType, level, ModEntityTier.OBSIDIAN, ModArrowItemsFabric.OBSIDIAN_ARROW)).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(4).trackedUpdateRate(20).build());

    public static final EntityType<TypedArrowEntity> PAPER_ARROW = RegistryFabric.registerEntityType("paper_arrow", () ->
        FabricEntityTypeBuilder.<TypedArrowEntity>create(MobCategory.MISC, (entityType, level) -> new TypedArrowEntity(entityType, level, ModEntityTier.PAPER, ModArrowItemsFabric.PAPER_ARROW)).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(4).trackedUpdateRate(20).build());

    public static final EntityType<TypedArrowEntity> TNT_ARROW = RegistryFabric.registerEntityType("tnt_arrow", () ->
        FabricEntityTypeBuilder.<TypedArrowEntity>create(MobCategory.MISC, (entityType, level) -> new TypedArrowEntity(entityType, level, ModEntityTier.TNT, ModArrowItemsFabric.TNT_ARROW)).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(4).trackedUpdateRate(20).build());

}
