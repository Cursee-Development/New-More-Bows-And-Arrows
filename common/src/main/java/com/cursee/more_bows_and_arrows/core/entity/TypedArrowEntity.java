package com.cursee.more_bows_and_arrows.core.entity;

import com.cursee.more_bows_and_arrows.core.item.ModArrowItemTier;
import com.cursee.more_bows_and_arrows.platform.Services;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.animal.Chicken;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseFireBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class TypedArrowEntity extends AbstractArrow {

    private final ModArrowItemTier tier;
    private final Item pickupItem;

    @SuppressWarnings("unchecked")
    public TypedArrowEntity(EntityType $$0, Level $$1, ModArrowItemTier tier, Item pickupItem) {
        super($$0, $$1);
        this.tier = tier;
        this.pickupItem = pickupItem;
        this.setBaseDamage(this.getBaseDamage() + this.tier.damage());
    } // registration

    @SuppressWarnings("unchecked")
    public TypedArrowEntity(Level level, double x, double y, double z, ModArrowItemTier tier, Item pickupItem) {
        super(Services.PLATFORM.entityFromTier(tier), x, y, z, level);
        this.tier = tier;
        this.pickupItem = pickupItem;
        this.setBaseDamage(this.getBaseDamage() + this.tier.damage());
    } // dispensing

    @SuppressWarnings("unchecked")
    public TypedArrowEntity(Level level, LivingEntity entity, ModArrowItemTier tier, Item pickupItem) {
        super(Services.PLATFORM.entityFromTier(tier), entity, level);
        this.tier = tier;
        this.pickupItem = pickupItem;
        this.setBaseDamage(this.getBaseDamage() + this.tier.damage());
    } // player-use

    @Override
    protected @NotNull ItemStack getPickupItem() {
        return new ItemStack(this.pickupItem);
    }

    @Override
    protected void onHitEntity(EntityHitResult entityHitResult) {
        this.doEntityInteractionWithTier(entityHitResult, this.tier);
    }

    @Override
    protected void onHitBlock(BlockHitResult blockHitResult) {
        this.doBlockInteractionWithTier(blockHitResult, this.tier);
    }

    private void doEntityInteractionWithTier(EntityHitResult entityHitResult, ModArrowItemTier tier) {

        if (entityHitResult.getType() == HitResult.Type.MISS) return;

        final Level level = this.level();

        if (level.isClientSide()) return;

        final Entity owner = this.getOwner();
        @Nullable Player playerOwner = null;
        ItemStack itemInHand = ItemStack.EMPTY;
        final boolean missingPlayerOwner = !(owner instanceof Player);

        if (!missingPlayerOwner) {
            playerOwner = (Player) owner;
            itemInHand = playerOwner.getMainHandItem();
        }


        Entity hitResultEntity = entityHitResult.getEntity();
        final BlockPos blockPos = hitResultEntity.getOnPos();
        final BlockState blockState = level.getBlockState(blockPos);

        switch (tier) {
            case BLAZE_ROD -> {
                hitResultEntity.setSecondsOnFire(2);
                if (itemInHand.is(Services.PLATFORM.blaze_bow())) level.explode(playerOwner, hitResultEntity.xo, hitResultEntity.yo+1, hitResultEntity.zo, 2.0f, true, Level.ExplosionInteraction.TNT);
            }
            case BONE -> {
                if (hitResultEntity instanceof LivingEntity livingEntity) livingEntity.addEffect(new MobEffectInstance(MobEffects.WITHER, 20, 1));
            }
            case COPPER -> {
                if (!itemInHand.is(Services.PLATFORM.copper_bow())) return;
                LightningBolt lightningBolt = (LightningBolt)EntityType.LIGHTNING_BOLT.create((ServerLevel) level);
                if (lightningBolt != null) {
                    lightningBolt.moveTo(Vec3.atBottomCenterOf(blockPos.above()));
                    lightningBolt.setCause((ServerPlayer) playerOwner);
                    level.addFreshEntity(lightningBolt);
                }
            }
            case ENDER_PEARL -> {
                if (!missingPlayerOwner) {
                    hitResultEntity.teleportTo((ServerLevel) level, playerOwner.xo, playerOwner.yo, playerOwner.zo, RelativeMovement.ROTATION, hitResultEntity.getYRot(), hitResultEntity.getXRot());
                }
            }
            case FLINT_AND_STEEL -> hitResultEntity.setSecondsOnFire(2);
            case FLINT -> {
                if (itemInHand.is(Services.PLATFORM.iron_bow())) {
                    hitResultEntity.setSecondsOnFire(2);
                }
            }
            case MOSS, PAPER -> paperArrowHitsEntity(owner, level, hitResultEntity);
            case TNT -> {
                level.explode(playerOwner, hitResultEntity.xo, hitResultEntity.yo+1, hitResultEntity.zo, 1.0f, true, Level.ExplosionInteraction.TNT);
            }
            default -> { /* NO-OP */}
        }
    }

    private void doBlockInteractionWithTier(BlockHitResult blockHitResult, ModArrowItemTier tier) {

        if (blockHitResult.getType() == HitResult.Type.MISS) return;

        final Level level = this.level();

        if (level.isClientSide()) return;

        final Entity owner = this.getOwner();
        @Nullable Player playerOwner = null;
        ItemStack itemInHand = ItemStack.EMPTY;
        final boolean missingPlayerOwner = !(owner instanceof Player);

        if (!missingPlayerOwner) {
            playerOwner = (Player) owner;
            itemInHand = playerOwner.getMainHandItem();
        }

        final BlockPos blockPos = blockHitResult.getBlockPos();
        final BlockState blockState = level.getBlockState(blockPos);

        switch (tier) {
            case BAMBOO -> {

                if (!itemInHand.is(Services.PLATFORM.bamboo_bow())) return;

                if (Blocks.BAMBOO.defaultBlockState().canSurvive(level, blockPos)) {
                    if (Feature.isDirt(blockState)) {
                        level.setBlock(blockPos, Blocks.PODZOL.defaultBlockState(), Block.UPDATE_ALL);
                        level.setBlock(blockPos.above(), Blocks.BAMBOO.defaultBlockState(), Block.UPDATE_ALL);
                    } else if (blockState.is(Blocks.BAMBOO)) {
                        level.setBlock(blockPos.above(), Blocks.BAMBOO.defaultBlockState(), Block.UPDATE_ALL);
                    }
                }
            }
            case BLAZE_ROD -> {
                TypedArrowEntity.igniteBlock(blockHitResult, (ServerLevel) this.level(), blockPos, blockState);
                if (itemInHand.is(Services.PLATFORM.blaze_bow())) level.explode(playerOwner, blockPos.getX(), blockPos.getY() + 1, blockPos.getZ(), 2.0f, true, Level.ExplosionInteraction.TNT);
            }
            case COPPER -> {
                if (itemInHand.is(Services.PLATFORM.copper_bow())) {
                    LightningBolt lightningBolt = (LightningBolt) EntityType.LIGHTNING_BOLT.create((ServerLevel) level);
                    if (lightningBolt != null) {
                        lightningBolt.moveTo(Vec3.atBottomCenterOf(blockPos.above()));
                        lightningBolt.setCause((ServerPlayer) playerOwner);
                        level.addFreshEntity(lightningBolt);
                    }
                }
            }
            case ENDER_PEARL -> {

                if (this.random.nextInt(1, 1000) == 1) {
                    EnderMan enderMan = (EnderMan) EntityType.ENDERMAN.create((ServerLevel) level);
                    if (enderMan != null) {
                        enderMan.moveTo(Vec3.atBottomCenterOf(blockPos));
                        level.addFreshEntity(enderMan);
                    }
                }

                if (!missingPlayerOwner) {
                    final BlockPos relativePos = blockPos.relative(blockHitResult.getDirection());
                    playerOwner.teleportTo((ServerLevel) level, relativePos.getX(), relativePos.getY(), relativePos.getZ(), RelativeMovement.ROTATION, playerOwner.getYRot(), playerOwner.getXRot());
                }
            }
            case FLINT_AND_STEEL, FLINT -> TypedArrowEntity.igniteBlock(blockHitResult, (ServerLevel) this.level(), blockPos, blockState);
            case MOSS, PAPER -> {
                if (itemInHand.is(Services.PLATFORM.moss_bow()) || itemInHand.is(Services.PLATFORM.paper_bow())) {
                    paperArrowHitsBlock(owner, level, blockPos);
                }
            }
            case TNT -> level.explode(playerOwner, blockPos.getX(), blockPos.getY(), blockPos.getZ(), 2.0f, true, Level.ExplosionInteraction.TNT);
            default -> { /* NO-OP */}
        }
    }

    private static void igniteBlock(BlockHitResult blockHitResult, ServerLevel level, BlockPos blockPos, BlockState blockState) {
        if (!blockState.hasProperty(BlockStateProperties.LIT)) {
            BlockPos relativePosition = blockPos.relative(blockHitResult.getDirection());
            if (level.isEmptyBlock(relativePosition)) {
                level.setBlockAndUpdate(relativePosition, BaseFireBlock.getState(level, relativePosition));
            }
        }
        else {
            level.setBlock(blockPos, blockState.setValue(BlockStateProperties.LIT, true), Block.UPDATE_ALL);
        }
    }

    private static void paperArrowHitsBlock(Entity owner, Level level, BlockPos pos) {

        Random random = new Random();

        switch (random.nextInt(1, 8)) {
            case 1 -> {
                level.explode(owner, pos.getX(), pos.getY(), pos.getZ(), 2.0f, true, Level.ExplosionInteraction.TNT);
            }
            case 2 -> {
                owner.teleportTo(owner.xo, owner.yo+10, owner.zo);
            }
            case 3 -> {
                owner.teleportTo(pos.getX(), pos.getY(), pos.getZ());
            }
            case 4 -> {
                owner.teleportTo(pos.getX(), pos.getY()+10, pos.getZ());
            }
            case 5 -> {
                LightningBolt lightningBolt = (LightningBolt)EntityType.LIGHTNING_BOLT.create(level);
                lightningBolt.moveTo(Vec3.atBottomCenterOf(pos.above()));
                lightningBolt.setCause((ServerPlayer) owner);
                level.addFreshEntity(lightningBolt);
            }
            case 6 -> {
                level.explode(owner, pos.getX(), pos.getY(), pos.getZ(), 1.0f, true, Level.ExplosionInteraction.TNT);
            }
            case 7 -> {
                for (int i=0; i<4; ++i) {
                    Chicken chicken = (Chicken)EntityType.CHICKEN.create(level);
                    chicken.moveTo(pos.getX(), pos.getY()+i, pos.getZ());
                    level.addFreshEntity(chicken);
                }
            }
            case 8 -> {
                for (int i=0; i<4; ++i) {
                    Zombie zombie = (Zombie)EntityType.ZOMBIE.create(level);
                    zombie.moveTo(pos.getX(), pos.getY(), pos.getZ());
                    level.addFreshEntity(zombie);
                }
            }
        }
    }

    private static void paperArrowHitsEntity(Entity owner, Level level, Entity entity) {

        Random random = new Random();

        switch (random.nextInt(1, 8)) {
            case 1 -> {
                entity.setSecondsOnFire(2);
            }
            case 2 -> {
                entity.teleportTo(owner.xo, owner.yo, owner.zo);
            }
            case 3 -> {
                owner.teleportTo(entity.xo, entity.yo, entity.zo);
            }
            case 4 -> {
                entity.teleportTo(entity.xo, entity.yo+10, entity.zo);
            }
            case 5 -> {
                LightningBolt lightningBolt = (LightningBolt)EntityType.LIGHTNING_BOLT.create(level);
                lightningBolt.moveTo(Vec3.atBottomCenterOf(entity.blockPosition().above()));
                lightningBolt.setCause((ServerPlayer) owner);
                level.addFreshEntity(lightningBolt);
            }
            case 6 -> {
                level.explode(owner, entity.xo, entity.yo, entity.zo, 2.0f, true, Level.ExplosionInteraction.TNT);
            }
            case 7 -> {
                for (int i=0; i<4; ++i) {
                    Chicken chicken = (Chicken)EntityType.CHICKEN.create(level);
                    chicken.moveTo(entity.xo, entity.yo+i, entity.zo);
                    level.addFreshEntity(chicken);
                }
            }
            case 8 -> {
                for (int i=0; i<4; ++i) {
                    Zombie zombie = (Zombie)EntityType.ZOMBIE.create(level);
                    zombie.moveTo(entity.xo, entity.yo, entity.zo);
                    level.addFreshEntity(zombie);
                }
            }
        }
    }
}
