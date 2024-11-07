package com.cursee.more_bows_and_arrows.core.item;

public enum ModArrowItemTier {

    AMETHYST(3.0f),
    BAMBOO(1.0f),
    BLAZE_ROD(4.0f),
    BONE(2.0f),
    CACTUS(2.0f),
    COAL(2.0f),
    COPPER(2.0f),
    DIAMOND(4.0f),
    EMERALD(3.0f),
    ENDER_PEARL(2.0f),
    FLINT_AND_STEEL(2.0f),
    FLINT(2.0f),
    GOLD(2.0f),
    IRON(3.0f),
    LAPIS(3.0f),
    MOSS(0.0f),
    NETHERITE(5.0f),
    OBSIDIAN(5.0f),
    PAPER(0.0f),
    TNT(5.0f);

    private final float damage;

    ModArrowItemTier(float damage) {
        this.damage = damage;
    }

    public float damage() {
        return damage;
    }
}
