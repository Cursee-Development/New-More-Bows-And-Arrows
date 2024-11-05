package com.cursee.more_bows_and_arrows.mixin;

import com.cursee.more_bows_and_arrows.Constants;
import com.cursee.more_bows_and_arrows.platform.Services;
import net.minecraft.client.gui.screens.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class FabricTitleScreenMixin {
    
    @Inject(at = @At("HEAD"), method = "init()V")
    private void init(CallbackInfo info) {

        if (Services.PLATFORM.isDevelopmentEnvironment()) {
            Constants.LOG.info("Minecraft TitleScreen initialized in a {} development environment!", Services.PLATFORM.getPlatformName());
        }
    }
}