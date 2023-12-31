package net.zakharfsk.minecraftmodcourse.mixin;

import net.minecraft.client.gui.screens.TitleScreen;
import net.zakharfsk.minecraftmodcourse.MinecraftModCourse;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class ExampleMixin {
    @Inject(at = @At("HEAD"), method = "init()V")
    private void init(CallbackInfo info) {
        MinecraftModCourse.LOGGER.info("This line is printed by an example mod mixin!");
    }
}
