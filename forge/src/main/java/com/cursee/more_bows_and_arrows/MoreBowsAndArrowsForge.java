package com.cursee.more_bows_and_arrows;

import com.cursee.monolib.core.sailing.Sailing;
import net.minecraftforge.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class MoreBowsAndArrowsForge {
    
    public MoreBowsAndArrowsForge() {
        MoreBowsAndArrows.init();
        Sailing.register(Constants.MOD_NAME, Constants.MOD_ID, Constants.MOD_VERSION, Constants.MC_VERSION_RAW, Constants.PUBLISHER_AUTHOR, Constants.PRIMARY_CURSEFORGE_MODRINTH);
    }
}