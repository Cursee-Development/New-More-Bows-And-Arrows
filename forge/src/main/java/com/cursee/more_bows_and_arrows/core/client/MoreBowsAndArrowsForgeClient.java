package com.cursee.more_bows_and_arrows.core.client;

import com.cursee.more_bows_and_arrows.Constants;
import com.cursee.more_bows_and_arrows.core.entity.TypedArrowEntityRenderer;
import com.cursee.more_bows_and_arrows.core.registry.ModBowItemsForge;
import com.cursee.more_bows_and_arrows.core.registry.ModEntityTypesForge;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = Constants.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MoreBowsAndArrowsForgeClient {

    @SubscribeEvent
    public static void onClientSetup(final FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            registerBow(ModBowItemsForge.OAK_BOW.get());
            registerBow(ModBowItemsForge.STRIPPED_OAK_BOW.get());
            registerBow(ModBowItemsForge.DARK_OAK_BOW.get());
            registerBow(ModBowItemsForge.STRIPPED_DARK_OAK_BOW.get());
            registerBow(ModBowItemsForge.SPRUCE_BOW.get());
            registerBow(ModBowItemsForge.STRIPPED_SPRUCE_BOW.get());
            registerBow(ModBowItemsForge.BIRCH_BOW.get());
            registerBow(ModBowItemsForge.STRIPPED_BIRCH_BOW.get());
            registerBow(ModBowItemsForge.JUNGLE_BOW.get());
            registerBow(ModBowItemsForge.STRIPPED_JUNGLE_BOW.get());
            registerBow(ModBowItemsForge.ACACIA_BOW.get());
            registerBow(ModBowItemsForge.STRIPPED_ACACIA_BOW.get());
            registerBow(ModBowItemsForge.MANGROVE_BOW.get());
            registerBow(ModBowItemsForge.STRIPPED_MANGROVE_BOW.get());
            registerBow(ModBowItemsForge.CHERRY_BOW.get());
            registerBow(ModBowItemsForge.STRIPPED_CHERRY_BOW.get());
            registerBow(ModBowItemsForge.BAMBOO_BOW.get());
            registerBow(ModBowItemsForge.STRIPPED_BAMBOO_BOW.get());
            registerBow(ModBowItemsForge.CRIMSON_STEM_BOW.get());
            registerBow(ModBowItemsForge.STRIPPED_CRIMSON_STEM_BOW.get());
            registerBow(ModBowItemsForge.WARPED_STEM_BOW.get());
            registerBow(ModBowItemsForge.STRIPPED_WARPED_STEM_BOW.get());

            registerBow(ModBowItemsForge.PAPER_BOW.get());
            registerBow(ModBowItemsForge.MOSS_BOW.get());
            registerBow(ModBowItemsForge.LAPIS_BOW.get());
            registerBow(ModBowItemsForge.AMETHYST_BOW.get());
            registerBow(ModBowItemsForge.BONE_BOW.get());
            registerBow(ModBowItemsForge.COAL_BOW.get());
            registerBow(ModBowItemsForge.EMERALD_BOW.get());
            registerBow(ModBowItemsForge.BLAZE_BOW.get());
            registerBow(ModBowItemsForge.OBSIDIAN_BOW.get());

            registerBow(ModBowItemsForge.IRON_BOW.get());
            registerBow(ModBowItemsForge.COPPER_BOW.get());
            registerBow(ModBowItemsForge.GOLD_BOW.get());
            registerBow(ModBowItemsForge.DIAMOND_BOW.get());
            registerBow(ModBowItemsForge.NETHERITE_BOW.get());
        });
    }

    @SubscribeEvent
    public static void onRegisterEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {

        event.registerEntityRenderer(ModEntityTypesForge.AMETHYST_ARROW.get(), TypedArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesForge.BAMBOO_ARROW.get(), TypedArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesForge.BLAZE_ROD_ARROW.get(), TypedArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesForge.BONE_ARROW.get(), TypedArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesForge.CACTUS_ARROW.get(), TypedArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesForge.COAL_ARROW.get(), TypedArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesForge.COPPER_ARROW.get(), TypedArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesForge.DIAMOND_ARROW.get(), TypedArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesForge.EMERALD_ARROW.get(), TypedArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesForge.ENDER_PEARL_ARROW.get(), TypedArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesForge.FLINT_AND_STEEL_ARROW.get(), TypedArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesForge.FLINT_ARROW.get(), TypedArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesForge.GOLD_ARROW.get(), TypedArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesForge.IRON_ARROW.get(), TypedArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesForge.LAPIS_ARROW.get(), TypedArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesForge.MOSS_ARROW.get(), TypedArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesForge.NETHERITE_ARROW.get(), TypedArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesForge.OBSIDIAN_ARROW.get(), TypedArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesForge.PAPER_ARROW.get(), TypedArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesForge.TNT_ARROW.get(), TypedArrowEntityRenderer::new);
    }

    private static void registerBow(Item bow) {
        ItemProperties.register(bow, new ResourceLocation("pull"), (stack, world, entity, seed) -> {
            if (entity == null) {
                return 0.0f;
            }
            if (entity.getUseItem() != stack) {
                return 0.0f;
            }
            return (float)(stack.getUseDuration() - entity.getUseItemRemainingTicks()) / 20.0f;
        });
        ItemProperties.register(bow, new ResourceLocation("pulling"),
                (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getUseItem() == stack ? 1.0f : 0.0f);

    }
}
