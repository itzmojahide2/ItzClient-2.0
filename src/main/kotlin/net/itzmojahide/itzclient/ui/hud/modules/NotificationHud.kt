
package net.itzmojahide.itzclient.ui.hud.modules

import net.itzmojahide.itzclient.ui.hud.IHudModule
import net.minecraft.client.MinecraftClient
import net.minecraft.client.util.math.MatrixStack
import kotlin.collections.ArrayDeque

class NotificationHud : IHudModule {
    private val mc = MinecraftClient.getInstance()
    private val queue = ArrayDeque<String>()

    fun push(msg: String) { queue.addLast(msg) }

    override fun render(matrices: MatrixStack, tickDelta: Float) {
        var y = 40f
        while (queue.isNotEmpty()) {
            val s = queue.first()
            mc.textRenderer.draw(matrices, s, 6f, y, net.itzmojahide.itzclient.ui.UIThemeManager.accentColor)
            y += 12f
            queue.removeFirstOrNull()
        }
    }
}
