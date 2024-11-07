package com.cursee.more_bows_and_arrows.core.client;

import com.cursee.more_bows_and_arrows.Constants;
import com.cursee.more_bows_and_arrows.core.entity.TypedArrowEntityRenderer;
import com.cursee.more_bows_and_arrows.core.registry.ModBowItemsNeoForge;
import com.cursee.more_bows_and_arrows.core.registry.ModEntityTypesNeoForge;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;

@EventBusSubscriber(modid = Constants.MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MoreBowsAndArrowsNeoForgeClient {

    @SubscribeEvent
    public static void onClientSetup(final FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            registerBow(ModBowItemsNeoForge.OAK_BOW.get());
            registerBow(ModBowItemsNeoForge.STRIPPED_OAK_BOW.get());
            registerBow(ModBowItemsNeoForge.DARK_OAK_BOW.get());
            registerBow(ModBowItemsNeoForge.STRIPPED_DARK_OAK_BOW.get());
            registerBow(ModBowItemsNeoForge.SPRUCE_BOW.get());
            registerBow(ModBowItemsNeoForge.STRIPPED_SPRUCE_BOW.get());
            registerBow(ModBowItemsNeoForge.BIRCH_BOW.get());
            registerBow(ModBowItemsNeoForge.STRIPPED_BIRCH_BOW.get());
            registerBow(ModBowItemsNeoForge.JUNGLE_BOW.get());
            registerBow(ModBowItemsNeoForge.STRIPPED_JUNGLE_BOW.get());
            registerBow(ModBowItemsNeoForge.ACACIA_BOW.get());
            registerBow(ModBowItemsNeoForge.STRIPPED_ACACIA_BOW.get());
            registerBow(ModBowItemsNeoForge.MANGROVE_BOW.get());
            registerBow(ModBowItemsNeoForge.STRIPPED_MANGROVE_BOW.get());
            registerBow(ModBowItemsNeoForge.CHERRY_BOW.get());
            registerBow(ModBowItemsNeoForge.STRIPPED_CHERRY_BOW.get());
            registerBow(ModBowItemsNeoForge.BAMBOO_BOW.get());
            registerBow(ModBowItemsNeoForge.STRIPPED_BAMBOO_BOW.get());
            registerBow(ModBowItemsNeoForge.CRIMSON_STEM_BOW.get());
            registerBow(ModBowItemsNeoForge.STRIPPED_CRIMSON_STEM_BOW.get());
            registerBow(ModBowItemsNeoForge.WARPED_STEM_BOW.get());
            registerBow(ModBowItemsNeoForge.STRIPPED_WARPED_STEM_BOW.get());

            registerBow(ModBowItemsNeoForge.PAPER_BOW.get());
            registerBow(ModBowItemsNeoForge.MOSS_BOW.get());
            registerBow(ModBowItemsNeoForge.LAPIS_BOW.get());
            registerBow(ModBowItemsNeoForge.AMETHYST_BOW.get());
            registerBow(ModBowItemsNeoForge.BONE_BOW.get());
            registerBow(ModBowItemsNeoForge.COAL_BOW.get());
            registerBow(ModBowItemsNeoForge.EMERALD_BOW.get());
            registerBow(ModBowItemsNeoForge.BLAZE_BOW.get());
            registerBow(ModBowItemsNeoForge.OBSIDIAN_BOW.get());

            registerBow(ModBowItemsNeoForge.IRON_BOW.get());
            registerBow(ModBowItemsNeoForge.COPPER_BOW.get());
            registerBow(ModBowItemsNeoForge.GOLD_BOW.get());
            registerBow(ModBowItemsNeoForge.DIAMOND_BOW.get());
            registerBow(ModBowItemsNeoForge.NETHERITE_BOW.get());
        });
    }

    @SubscribeEvent
    public static void onRegisterEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {

        event.registerEntityRenderer(ModEntityTypesNeoForge.AMETHYST_ARROW.get(), TypedArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesNeoForge.BAMBOO_ARROW.get(), TypedArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesNeoForge.BLAZE_ROD_ARROW.get(), TypedArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesNeoForge.BONE_ARROW.get(), TypedArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesNeoForge.CACTUS_ARROW.get(), TypedArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesNeoForge.COAL_ARROW.get(), TypedArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesNeoForge.COPPER_ARROW.get(), TypedArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesNeoForge.DIAMOND_ARROW.get(), TypedArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesNeoForge.EMERALD_ARROW.get(), TypedArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesNeoForge.ENDER_PEARL_ARROW.get(), TypedArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesNeoForge.FLINT_AND_STEEL_ARROW.get(), TypedArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesNeoForge.FLINT_ARROW.get(), TypedArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesNeoForge.GOLD_ARROW.get(), TypedArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesNeoForge.IRON_ARROW.get(), TypedArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesNeoForge.LAPIS_ARROW.get(), TypedArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesNeoForge.MOSS_ARROW.get(), TypedArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesNeoForge.NETHERITE_ARROW.get(), TypedArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesNeoForge.OBSIDIAN_ARROW.get(), TypedArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesNeoForge.PAPER_ARROW.get(), TypedArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesNeoForge.TNT_ARROW.get(), TypedArrowEntityRenderer::new);
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
