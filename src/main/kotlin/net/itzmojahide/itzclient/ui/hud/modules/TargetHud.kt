
package net.itzmojahide.itzclient.ui.hud.modules

import net.itzmojahide.itzclient.ui.hud.IHudModule
import net.minecraft.client.MinecraftClient
import net.minecraft.client.util.math.MatrixStack
import net.minecraft.client.gui.DrawableHelper

class TargetHud : IHudModule {
    private val mc = MinecraftClient.getInstance()
    override fun render(matrices: MatrixStack, tickDelta: Float) {
        val x = mc.window.scaledWidth / 2 - 50
        val y = mc.window.scaledHeight / 2 + 20
        DrawableHelper.fill(matrices, x, y, x+100, y+18, 0x22000000)
        mc.textRenderer.draw(matrices, "Target: none", x+4f, y+4f, net.itzmojahide.itzclient.ui.UIThemeManager.accentColor)
    }
}
