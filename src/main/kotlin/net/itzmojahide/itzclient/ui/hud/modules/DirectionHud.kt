
package net.itzmojahide.itzclient.ui.hud.modules

import net.itzmojahide.itzclient.ui.hud.IHudModule
import net.minecraft.client.util.math.MatrixStack
import net.minecraft.client.MinecraftClient

class DirectionHud : IHudModule {
    private val mc = MinecraftClient.getInstance()
    override fun render(matrices: MatrixStack, tickDelta: Float) {
        try {
            val dir = mc.player?.horizontalFacing?.name ?: "UNKNOWN"
            mc.textRenderer.draw(matrices, "Facing: $dir", 6f, 156f, net.itzmojahide.itzclient.ui.UIThemeManager.accentColor)
        } catch (e: Exception) {}
    }
}
