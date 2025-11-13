
package net.itzmojahide.itzclient.ui.hud.modules

import net.itzmojahide.itzclient.ui.hud.IHudModule
import net.minecraft.client.MinecraftClient
import net.minecraft.client.util.math.MatrixStack
import net.minecraft.client.gui.DrawableHelper

class WatermarkHud : IHudModule {
    private val mc = MinecraftClient.getInstance()
    override fun render(matrices: MatrixStack, tickDelta: Float) {
        val w = mc.window.scaledWidth
        val h = mc.window.scaledHeight
        DrawableHelper.fill(matrices, w-220, h-30, w-8, h-8, 0x33FFFFFF)
        mc.textRenderer.draw(matrices, "ItzClient v1.21.1 | itzmojahide", w-210f, h-24f, net.itzmojahide.itzclient.ui.UIThemeManager.accentColor)
    }
}
