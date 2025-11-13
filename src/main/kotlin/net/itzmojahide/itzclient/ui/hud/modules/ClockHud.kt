
package net.itzmojahide.itzclient.ui.hud.modules

import net.itzmojahide.itzclient.ui.hud.IHudModule
import net.minecraft.client.util.math.MatrixStack
import java.time.LocalTime
import java.time.format.DateTimeFormatter

class ClockHud : IHudModule {
    private val fmt = DateTimeFormatter.ofPattern("HH:mm:ss")
    override fun render(matrices: MatrixStack, tickDelta: Float) {
        val now = LocalTime.now().format(fmt)
        net.minecraft.client.MinecraftClient.getInstance().textRenderer.draw(matrices, "Time: $now", 6f, 144f, net.itzmojahide.itzclient.ui.UIThemeManager.accentColor)
    }
}
