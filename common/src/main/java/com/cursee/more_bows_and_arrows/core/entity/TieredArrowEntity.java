package com.cursee.more_bows_and_arrows.core.entity;

import com.cursee.more_bows_and_arrows.Constants;
import com.cursee.more_bows_and_arrows.MoreBowsAndArrows;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class TieredArrowEntity extends AbstractArrow {

    private final ModEntityTier tier;
    private final Item pickupItem;

//    public TieredArrowEntity(EntityType<? extends AbstractArrow> $$0, Level $$1) {
//        super($$0, $$1);
//    }

    @SuppressWarnings("unchecked")
    public TieredArrowEntity(EntityType $$0, Level $$1, ModEntityTier tier, Item pickupItem) {
        super($$0, $$1);
        this.tier = tier;
        this.pickupItem = pickupItem;
    }

//    public TieredArrowEntity(EntityType<? extends AbstractArrow> $$0, double $$1, double $$2, double $$3, Level $$4) {
//        super($$0, $$1, $$2, $$3, $$4);
//    }

//    public TieredArrowEntity(EntityType<? extends AbstractArrow> $$0, LivingEntity $$1, Level $$2) {
//        super($$0, $$1, $$2);
//    }

    @Override
    protected @NotNull ItemStack getPickupItem() {
        return new ItemStack(this.pickupItem);
    }
}
