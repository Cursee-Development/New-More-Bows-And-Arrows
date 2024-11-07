package com.cursee.more_bows_and_arrows.core.item;

import net.minecraft.tags.ItemTags;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

@SuppressWarnings("deprecation")
public enum ModItemTiers implements Tier {

    WOOD(350, 1.0f, () -> Ingredient.of(ItemTags.PLANKS)),
    GOLD(400, 2.0f, () -> Ingredient.of(Items.GOLD_INGOT)),
    IRON(500, 2.5f, () -> Ingredient.of(Items.IRON_INGOT)),
    DIAMOND(1000, 3.0f, () -> Ingredient.of(Items.DIAMOND)),
    NETHERITE(2000, 4.5f, () -> Ingredient.of(Items.NETHERITE_INGOT)),

    COPPER(500, 2.0f, () -> Ingredient.of(Items.COPPER_INGOT)),
    PAPER(300, 0.1f, () -> Ingredient.of(Items.PAPER)),
    MOSS(300, 0.1f, () -> Ingredient.of(Items.MOSS_BLOCK)),
    LAPIS(400, 1.5f, () -> Ingredient.of(Items.LAPIS_LAZULI)),
    AMETHYST(400, 1.5f, () -> Ingredient.of(Items.AMETHYST_SHARD)),
    BONE(385, 2.0f, () -> Ingredient.of(Items.BONE)),
    COAL(385, 1.5f, () -> Ingredient.of(Items.COAL, Items.CHARCOAL)),
    EMERALD(400, 1.5f, () -> Ingredient.of(Items.EMERALD)),
    BLAZE(750, 3.0f, () -> Ingredient.of(Items.BLAZE_ROD)),
    OBSIDIAN(750, 4.0f, () -> Ingredient.of(Items.OBSIDIAN, Items.CRYING_OBSIDIAN));

    private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    ModItemTiers(int uses, float damage, Supplier<Ingredient> repairIngredient) {
        this.level = 1;
        this.uses = uses;
        this.speed = 4.0f;
        this.damage = damage;
        this.enchantmentValue = 5;
        this.repairIngredient = new LazyLoadedValue<>(repairIngredient);
    }

    @Override
    public int getUses() {
        return this.uses;
    }

    @Override
    public float getSpeed() {
        return this.speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return this.damage;
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public @NotNull Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
