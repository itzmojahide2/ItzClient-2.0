
package net.itzmojahide.itzclient.ui.hud.modules

import net.itzmojahide.itzclient.ui.hud.IHudModule
import net.minecraft.client.MinecraftClient
import net.minecraft.client.util.math.MatrixStack

class PingHud : IHudModule {
    private val mc = MinecraftClient.getInstance()
    override fun render(matrices: MatrixStack, tickDelta: Float) {
        try {
            val ping = mc.networkHandler?.getPlayerListEntry(mc.player?.uuid)?.latency ?: 0
            mc.textRenderer.draw(matrices, "Ping: $ping ms", 6f, 132f, net.itzmojahide.itzclient.ui.UIThemeManager.accentColor)
        } catch (e: Exception) {}
    }
}
