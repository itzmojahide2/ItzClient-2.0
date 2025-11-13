
package net.itzmojahide.itzclient.ui.hud.modules

import net.itzmojahide.itzclient.ui.hud.IHudModule
import net.minecraft.client.MinecraftClient
import net.minecraft.client.util.math.MatrixStack
import net.minecraft.util.math.MathHelper

class CoordsHud : IHudModule {
    private val mc = MinecraftClient.getInstance()
    override fun render(matrices: MatrixStack, tickDelta: Float) {
        try {
            val px = MathHelper.floor(mc.player.x)
            val py = MathHelper.floor(mc.player.y)
            val pz = MathHelper.floor(mc.player.z)
            mc.textRenderer.draw(matrices, "XYZ: $px, $py, $pz", 6f, 18f, net.itzmojahide.itzclient.ui.UIThemeManager.accentColor)
        } catch (e: Exception) {}
    }
}
