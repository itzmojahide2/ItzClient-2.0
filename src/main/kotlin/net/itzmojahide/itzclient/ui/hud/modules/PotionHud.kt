
package net.itzmojahide.itzclient.ui.hud.modules

import net.itzmojahide.itzclient.ui.hud.IHudModule
import net.minecraft.client.MinecraftClient
import net.minecraft.client.util.math.MatrixStack
import net.minecraft.client.gui.DrawableHelper

class PotionHud : IHudModule {
    private val mc = MinecraftClient.getInstance()
    override fun render(matrices: MatrixStack, tickDelta: Float) {
        DrawableHelper.fill(matrices, 6, 70, 220, 90, 0x22000000)
        mc.textRenderer.draw(matrices, "Potions: placeholder", 10f, 72f, net.itzmojahide.itzclient.ui.UIThemeManager.accentColor)
    }
}
