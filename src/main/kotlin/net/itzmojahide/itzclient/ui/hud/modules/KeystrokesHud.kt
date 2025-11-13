
package net.itzmojahide.itzclient.ui.hud.modules

import net.itzmojahide.itzclient.ui.hud.IHudModule
import net.minecraft.client.MinecraftClient
import net.minecraft.client.util.math.MatrixStack
import net.minecraft.client.gui.DrawableHelper

class KeystrokesHud : IHudModule {
    private val mc = MinecraftClient.getInstance()
    override fun render(matrices: MatrixStack, tickDelta: Float) {
        val x = 10; val y = 40; val w = 16; val h = 16
        DrawableHelper.fill(matrices, x, y, x+w, y+h, 0x22000000)
        mc.textRenderer.draw(matrices, "W", x+4f, y+2f, net.itzmojahide.itzclient.ui.UIThemeManager.accentColor)
        DrawableHelper.fill(matrices, x, y+h+2, x+w, y+h*2+2, 0x22000000)
        mc.textRenderer.draw(matrices, "S", x+4f, y+h+4f, net.itzmojahide.itzclient.ui.UIThemeManager.accentColor)
    }
}
