package com.cursee.more_bows_and_arrows.core.entity;

import com.cursee.more_bows_and_arrows.platform.Services;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class TypedArrowEntity extends AbstractArrow {

    private final ModEntityTier tier;
    private final Item pickupItem;

//    public TieredArrowEntity(EntityType<? extends AbstractArrow> $$0, Level $$1) {
//        super($$0, $$1);
//    }

    @SuppressWarnings("unchecked")
    public TypedArrowEntity(EntityType $$0, Level $$1, ModEntityTier tier, Item pickupItem) {
        super($$0, $$1);
        this.tier = tier;
        this.pickupItem = pickupItem;

    } // registration

    @SuppressWarnings("unchecked")
    public TypedArrowEntity(Level level, double x, double y, double z, ModEntityTier tier, Item pickupItem) {
        super(Services.PLATFORM.entityFromTier(tier), x, y, z, level);
        this.tier = tier;
        this.pickupItem = pickupItem;
    } // dispensing

    @SuppressWarnings("unchecked")
    public TypedArrowEntity(Level level, LivingEntity entity, ModEntityTier tier, Item pickupItem) {
        super(Services.PLATFORM.entityFromTier(tier), entity, level);
        this.tier = tier;
        this.pickupItem = pickupItem;
    } // player-use


//    public TieredArrowEntity(EntityType<? extends AbstractArrow> $$0, LivingEntity $$1, Level $$2) {
//        super($$0, $$1, $$2);
//    }

    @Override
    protected @NotNull ItemStack getPickupItem() {
        return new ItemStack(this.pickupItem);
    }
}
