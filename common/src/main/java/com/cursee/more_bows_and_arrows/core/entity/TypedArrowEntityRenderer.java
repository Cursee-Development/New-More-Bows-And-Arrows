package com.cursee.more_bows_and_arrows.core.entity;

import com.cursee.more_bows_and_arrows.Constants;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

public class TypedArrowEntityRenderer extends ArrowRenderer<TypedArrowEntity> {

    public TypedArrowEntityRenderer(EntityRendererProvider.Context context) {
        super(context);
    }

    // lol very cheesy approach, not recommended, should be using switch case probably but this is kinda neat ig
    @Override
    public @NotNull ResourceLocation getTextureLocation(TypedArrowEntity tieredArrowEntity) {
        return new ResourceLocation(Constants.MOD_ID, "textures/entity/arrow/" + tieredArrowEntity.getPickupItem().getDescriptionId().replace("item.more_bows_and_arrows.", "") + ".png");
    }
}
