
package net.itzmojahide.itzclient.ui.hud.modules

import net.itzmojahide.itzclient.ui.hud.IHudModule
import net.minecraft.client.MinecraftClient
import net.minecraft.client.util.math.MatrixStack
import net.minecraft.util.math.Vec3d
import kotlin.math.sqrt

class SpeedHud : IHudModule {
    private val mc = MinecraftClient.getInstance()
    override fun render(matrices: MatrixStack, tickDelta: Float) {
        try {
            val vel = Vec3d(mc.player.velocity.x, mc.player.velocity.y, mc.player.velocity.z)
            val speed = sqrt(vel.x*vel.x + vel.y*vel.y + vel.z*vel.z) * 20 // approx blocks/sec
            mc.textRenderer.draw(matrices, "Speed: ${"%.2f".format(speed)} b/s", 6f, 120f, net.itzmojahide.itzclient.ui.UIThemeManager.accentColor)
        } catch (e: Exception) {}
    }
}
