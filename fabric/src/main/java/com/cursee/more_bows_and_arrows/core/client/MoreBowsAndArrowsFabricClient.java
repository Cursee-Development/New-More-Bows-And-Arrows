package com.cursee.more_bows_and_arrows.core.client;

import com.cursee.more_bows_and_arrows.core.entity.TypedArrowEntityRenderer;
import com.cursee.more_bows_and_arrows.core.registry.ModBowItemsFabric;
import com.cursee.more_bows_and_arrows.core.registry.ModEntityTypesFabric;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.Item;

public class MoreBowsAndArrowsFabricClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        registerBow(ModBowItemsFabric.OAK_BOW);
        registerBow(ModBowItemsFabric.STRIPPED_OAK_BOW);
        registerBow(ModBowItemsFabric.DARK_OAK_BOW);
        registerBow(ModBowItemsFabric.STRIPPED_DARK_OAK_BOW);
        registerBow(ModBowItemsFabric.SPRUCE_BOW);
        registerBow(ModBowItemsFabric.STRIPPED_SPRUCE_BOW);
        registerBow(ModBowItemsFabric.BIRCH_BOW);
        registerBow(ModBowItemsFabric.STRIPPED_BIRCH_BOW);
        registerBow(ModBowItemsFabric.JUNGLE_BOW);
        registerBow(ModBowItemsFabric.STRIPPED_JUNGLE_BOW);
        registerBow(ModBowItemsFabric.ACACIA_BOW);
        registerBow(ModBowItemsFabric.STRIPPED_ACACIA_BOW);
        registerBow(ModBowItemsFabric.MANGROVE_BOW);
        registerBow(ModBowItemsFabric.STRIPPED_MANGROVE_BOW);
        registerBow(ModBowItemsFabric.CHERRY_BOW);
        registerBow(ModBowItemsFabric.STRIPPED_CHERRY_BOW);
        registerBow(ModBowItemsFabric.BAMBOO_BOW);
        registerBow(ModBowItemsFabric.STRIPPED_BAMBOO_BOW);
        registerBow(ModBowItemsFabric.CRIMSON_STEM_BOW);
        registerBow(ModBowItemsFabric.STRIPPED_CRIMSON_STEM_BOW);
        registerBow(ModBowItemsFabric.WARPED_STEM_BOW);
        registerBow(ModBowItemsFabric.STRIPPED_WARPED_STEM_BOW);

        registerBow(ModBowItemsFabric.PAPER_BOW);
        registerBow(ModBowItemsFabric.MOSS_BOW);
        registerBow(ModBowItemsFabric.LAPIS_BOW);
        registerBow(ModBowItemsFabric.AMETHYST_BOW);
        registerBow(ModBowItemsFabric.BONE_BOW);
        registerBow(ModBowItemsFabric.COAL_BOW);
        registerBow(ModBowItemsFabric.EMERALD_BOW);
        registerBow(ModBowItemsFabric.BLAZE_BOW);
        registerBow(ModBowItemsFabric.OBSIDIAN_BOW);

        registerBow(ModBowItemsFabric.IRON_BOW);
        registerBow(ModBowItemsFabric.COPPER_BOW);
        registerBow(ModBowItemsFabric.GOLD_BOW);
        registerBow(ModBowItemsFabric.DIAMOND_BOW);
        registerBow(ModBowItemsFabric.NETHERITE_BOW);

        EntityRendererRegistry.register(ModEntityTypesFabric.FLINT_AND_STEEL_ARROW, TypedArrowEntityRenderer::new);
        EntityRendererRegistry.register(ModEntityTypesFabric.ENDER_PEARL_ARROW, TypedArrowEntityRenderer::new);
        EntityRendererRegistry.register(ModEntityTypesFabric.TNT_ARROW, TypedArrowEntityRenderer::new);
        EntityRendererRegistry.register(ModEntityTypesFabric.PAPER_ARROW, TypedArrowEntityRenderer::new);
        EntityRendererRegistry.register(ModEntityTypesFabric.MOSS_ARROW, TypedArrowEntityRenderer::new);
        EntityRendererRegistry.register(ModEntityTypesFabric.AMETHYST_ARROW, TypedArrowEntityRenderer::new);
        EntityRendererRegistry.register(ModEntityTypesFabric.BAMBOO_ARROW, TypedArrowEntityRenderer::new);
        EntityRendererRegistry.register(ModEntityTypesFabric.BLAZE_ROD_ARROW, TypedArrowEntityRenderer::new);
        EntityRendererRegistry.register(ModEntityTypesFabric.BONE_ARROW, TypedArrowEntityRenderer::new);
        EntityRendererRegistry.register(ModEntityTypesFabric.CACTUS_ARROW, TypedArrowEntityRenderer::new);
        EntityRendererRegistry.register(ModEntityTypesFabric.COAL_ARROW, TypedArrowEntityRenderer::new);
        EntityRendererRegistry.register(ModEntityTypesFabric.EMERALD_ARROW, TypedArrowEntityRenderer::new);
        EntityRendererRegistry.register(ModEntityTypesFabric.LAPIS_ARROW, TypedArrowEntityRenderer::new);
        EntityRendererRegistry.register(ModEntityTypesFabric.OBSIDIAN_ARROW, TypedArrowEntityRenderer::new);
        EntityRendererRegistry.register(ModEntityTypesFabric.FLINT_ARROW, TypedArrowEntityRenderer::new);
        EntityRendererRegistry.register(ModEntityTypesFabric.COPPER_ARROW, TypedArrowEntityRenderer::new);
        EntityRendererRegistry.register(ModEntityTypesFabric.GOLD_ARROW, TypedArrowEntityRenderer::new);
        EntityRendererRegistry.register(ModEntityTypesFabric.IRON_ARROW, TypedArrowEntityRenderer::new);
        EntityRendererRegistry.register(ModEntityTypesFabric.DIAMOND_ARROW, TypedArrowEntityRenderer::new);
        EntityRendererRegistry.register(ModEntityTypesFabric.NETHERITE_ARROW, TypedArrowEntityRenderer::new);

    }

    private static void registerBow(Item bow) {
        ItemProperties.register(bow, ResourceLocation.withDefaultNamespace("pull"), (stack, world, entity, seed) -> {
            if (entity == null) {
                return 0.0f;
            }
            if (entity.getUseItem() != stack) {
                return 0.0f;
            }
            return (float)(stack.getUseDuration(entity) - entity.getUseItemRemainingTicks()) / 20.0f;
        });
        ItemProperties.register(bow, ResourceLocation.withDefaultNamespace("pulling"),
                (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getUseItem() == stack ? 1.0f : 0.0f);

    }
}
