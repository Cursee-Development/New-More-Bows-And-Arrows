package com.cursee.more_bows_and_arrows.core.registry;

import com.cursee.more_bows_and_arrows.core.entity.ModEntityTier;
import com.cursee.more_bows_and_arrows.core.entity.TieredArrowEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.projectile.AbstractArrow;

public class ModEntityTypesFabric {

    public static void register() {}

    public static final EntityType<?> AMETHYST_ARROW = RegistryFabric.registerEntityType("amethyst_arrow", () ->
        FabricEntityTypeBuilder.<TieredArrowEntity>create(MobCategory.MISC, (entityType, level) -> new TieredArrowEntity(entityType, level, ModEntityTier.AMETHYST, ModArrowItemsFabric.AMETHYST_ARROW)).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(4).trackedUpdateRate(20).build());

    public static final EntityType<?> BAMBOO_ARROW = RegistryFabric.registerEntityType("bamboo_arrow", () ->
        FabricEntityTypeBuilder.<TieredArrowEntity>create(MobCategory.MISC, (entityType, level) -> new TieredArrowEntity(entityType, level, ModEntityTier.BAMBOO, ModArrowItemsFabric.BAMBOO_ARROW)).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(4).trackedUpdateRate(20).build());

    public static final EntityType<?> BLAZE_ROD_ARROW = RegistryFabric.registerEntityType("blaze_rod_arrow", () ->
        FabricEntityTypeBuilder.<TieredArrowEntity>create(MobCategory.MISC, (entityType, level) -> new TieredArrowEntity(entityType, level, ModEntityTier.BLAZE_ROD, ModArrowItemsFabric.BLAZE_ROD_ARROW)).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(4).trackedUpdateRate(20).build());

    public static final EntityType<?> BONE_ARROW = RegistryFabric.registerEntityType("bone_arrow", () ->
        FabricEntityTypeBuilder.<TieredArrowEntity>create(MobCategory.MISC, (entityType, level) -> new TieredArrowEntity(entityType, level, ModEntityTier.BONE, ModArrowItemsFabric.BONE_ARROW)).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(4).trackedUpdateRate(20).build());

    public static final EntityType<?> CACTUS_ARROW = RegistryFabric.registerEntityType("cactus_arrow", () ->
        FabricEntityTypeBuilder.<TieredArrowEntity>create(MobCategory.MISC, (entityType, level) -> new TieredArrowEntity(entityType, level, ModEntityTier.CACTUS, ModArrowItemsFabric.CACTUS_ARROW)).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(4).trackedUpdateRate(20).build());

    public static final EntityType<?> COAL_ARROW = RegistryFabric.registerEntityType("coal_arrow", () ->
        FabricEntityTypeBuilder.<TieredArrowEntity>create(MobCategory.MISC, (entityType, level) -> new TieredArrowEntity(entityType, level, ModEntityTier.COAL, ModArrowItemsFabric.COAL_ARROW)).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(4).trackedUpdateRate(20).build());

    public static final EntityType<?> COPPER_ARROW = RegistryFabric.registerEntityType("copper_arrow", () ->
        FabricEntityTypeBuilder.<TieredArrowEntity>create(MobCategory.MISC, (entityType, level) -> new TieredArrowEntity(entityType, level, ModEntityTier.COPPER, ModArrowItemsFabric.COPPER_ARROW)).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(4).trackedUpdateRate(20).build());

    public static final EntityType<?> DIAMOND_ARROW = RegistryFabric.registerEntityType("diamond_arrow", () ->
        FabricEntityTypeBuilder.<TieredArrowEntity>create(MobCategory.MISC, (entityType, level) -> new TieredArrowEntity(entityType, level, ModEntityTier.DIAMOND, ModArrowItemsFabric.DIAMOND_ARROW)).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(4).trackedUpdateRate(20).build());

    public static final EntityType<?> EMERALD_ARROW = RegistryFabric.registerEntityType("emerald_arrow", () ->
        FabricEntityTypeBuilder.<TieredArrowEntity>create(MobCategory.MISC, (entityType, level) -> new TieredArrowEntity(entityType, level, ModEntityTier.EMERALD, ModArrowItemsFabric.EMERALD_ARROW)).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(4).trackedUpdateRate(20).build());

    public static final EntityType<?> ENDER_PEARL_ARROW = RegistryFabric.registerEntityType("ender_pearl_arrow", () ->
        FabricEntityTypeBuilder.<TieredArrowEntity>create(MobCategory.MISC, (entityType, level) -> new TieredArrowEntity(entityType, level, ModEntityTier.ENDER_PEARL, ModArrowItemsFabric.ENDER_PEARL_ARROW)).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(4).trackedUpdateRate(20).build());

    public static final EntityType<?> FLINT_AND_STEEL_ARROW = RegistryFabric.registerEntityType("flint_and_steel_arrow", () ->
        FabricEntityTypeBuilder.<TieredArrowEntity>create(MobCategory.MISC, (entityType, level) -> new TieredArrowEntity(entityType, level, ModEntityTier.FLINT_AND_STEEL, ModArrowItemsFabric.FLINT_AND_STEEL_ARROW)).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(4).trackedUpdateRate(20).build());

    public static final EntityType<?> FLINT_ARROW = RegistryFabric.registerEntityType("flint_arrow", () ->
        FabricEntityTypeBuilder.<TieredArrowEntity>create(MobCategory.MISC, (entityType, level) -> new TieredArrowEntity(entityType, level, ModEntityTier.FLINT, ModArrowItemsFabric.FLINT_ARROW)).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(4).trackedUpdateRate(20).build());

    public static final EntityType<?> GOLD_ARROW = RegistryFabric.registerEntityType("gold_arrow", () ->
        FabricEntityTypeBuilder.<TieredArrowEntity>create(MobCategory.MISC, (entityType, level) -> new TieredArrowEntity(entityType, level, ModEntityTier.GOLD, ModArrowItemsFabric.GOLD_ARROW)).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(4).trackedUpdateRate(20).build());

    public static final EntityType<?> IRON_ARROW = RegistryFabric.registerEntityType("iron_arrow", () ->
        FabricEntityTypeBuilder.<TieredArrowEntity>create(MobCategory.MISC, (entityType, level) -> new TieredArrowEntity(entityType, level, ModEntityTier.IRON, ModArrowItemsFabric.IRON_ARROW)).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(4).trackedUpdateRate(20).build());

    public static final EntityType<?> LAPIS_ARROW = RegistryFabric.registerEntityType("lapis_arrow", () ->
        FabricEntityTypeBuilder.<TieredArrowEntity>create(MobCategory.MISC, (entityType, level) -> new TieredArrowEntity(entityType, level, ModEntityTier.LAPIS, ModArrowItemsFabric.LAPIS_ARROW)).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(4).trackedUpdateRate(20).build());

    public static final EntityType<?> MOSS_ARROW = RegistryFabric.registerEntityType("moss_arrow", () ->
        FabricEntityTypeBuilder.<TieredArrowEntity>create(MobCategory.MISC, (entityType, level) -> new TieredArrowEntity(entityType, level, ModEntityTier.MOSS, ModArrowItemsFabric.MOSS_ARROW)).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(4).trackedUpdateRate(20).build());

    public static final EntityType<?> NETHERITE_ARROW = RegistryFabric.registerEntityType("netherite_arrow", () ->
        FabricEntityTypeBuilder.<TieredArrowEntity>create(MobCategory.MISC, (entityType, level) -> new TieredArrowEntity(entityType, level, ModEntityTier.NETHERITE, ModArrowItemsFabric.NETHERITE_ARROW)).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(4).trackedUpdateRate(20).build());

    public static final EntityType<?> OBSIDIAN_ARROW = RegistryFabric.registerEntityType("obsidian_arrow", () ->
        FabricEntityTypeBuilder.<TieredArrowEntity>create(MobCategory.MISC, (entityType, level) -> new TieredArrowEntity(entityType, level, ModEntityTier.OBSIDIAN, ModArrowItemsFabric.OBSIDIAN_ARROW)).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(4).trackedUpdateRate(20).build());

    public static final EntityType<?> PAPER_ARROW = RegistryFabric.registerEntityType("paper_arrow", () ->
        FabricEntityTypeBuilder.<TieredArrowEntity>create(MobCategory.MISC, (entityType, level) -> new TieredArrowEntity(entityType, level, ModEntityTier.PAPER, ModArrowItemsFabric.PAPER_ARROW)).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(4).trackedUpdateRate(20).build());

    public static final EntityType<?> TNT_ARROW = RegistryFabric.registerEntityType("tnt_arrow", () ->
        FabricEntityTypeBuilder.<TieredArrowEntity>create(MobCategory.MISC, (entityType, level) -> new TieredArrowEntity(entityType, level, ModEntityTier.TNT, ModArrowItemsFabric.TNT_ARROW)).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(4).trackedUpdateRate(20).build());

}
