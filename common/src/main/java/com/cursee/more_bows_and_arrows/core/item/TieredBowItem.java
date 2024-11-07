package com.cursee.more_bows_and_arrows.core.item;

import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.Tier;

public class TieredBowItem extends BowItem {

    private final Tier tier;

    public TieredBowItem(Tier tier) {
        super(new Properties().durability(tier.getUses()));
        this.tier = tier;
    }

    public Tier getTier() {
        return tier;
    }
}
