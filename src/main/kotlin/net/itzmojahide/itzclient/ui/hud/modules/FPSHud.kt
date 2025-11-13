
package net.itzmojahide.itzclient.ui.hud.modules

import net.itzmojahide.itzclient.ui.hud.IHudModule
import net.minecraft.client.MinecraftClient
import net.minecraft.client.util.math.MatrixStack

class FPSHud : IHudModule {
    private val mc = MinecraftClient.getInstance()
    override fun render(matrices: MatrixStack, tickDelta: Float) {
        mc.textRenderer.draw(matrices, "FPS: ${mc.currentFps}", 6f, 6f, net.itzmojahide.itzclient.ui.UIThemeManager.accentColor)
    }
}
