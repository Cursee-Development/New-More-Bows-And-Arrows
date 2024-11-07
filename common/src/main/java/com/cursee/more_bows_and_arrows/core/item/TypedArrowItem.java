package com.cursee.more_bows_and_arrows.core.item;

import net.minecraft.world.item.Item;

public class TypedArrowItem extends Item {

    private final Type type;

    public TypedArrowItem(Type type) {
        super(new Properties());
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public enum Type {
        AMETHYST, BAMBOO, BLAZE_ROD, BONE, CACTUS, COAL, COPPER, DIAMOND, EMERALD, ENDER_PEARL,
        FLINT_AND_STEEL, FLINT, GOLD, IRON, LAPIS, MOSS, NETHERITE, OBSIDIAN, PAPER, TNT;
    }
}
