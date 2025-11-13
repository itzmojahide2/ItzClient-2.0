
package net.itzmojahide.itzclient.ui.hud

import net.minecraft.client.MinecraftClient
import net.minecraft.client.util.math.MatrixStack
import net.itzmojahide.itzclient.ui.UIThemeManager
import net.itzmojahide.itzclient.ui.hud.modules.*

object HudRenderer {
    var enabled = true
    private val client = MinecraftClient.getInstance()
    private val modules = listOf<IHudModule>(
        FPSHud(),
        CoordsHud(),
        KeystrokesHud(),
        CPSHud(),
        ArmorHud(),
        PotionHud(),
        TargetHud(),
        SpeedHud(),
        PingHud(),
        ClockHud(),
        DirectionHud(),
        BiomeHud(),
        LogoHud(),
        WatermarkHud(),
        NotificationHud()
    )

    fun init() { /* no-op */ }

    fun render(matrices: MatrixStack, tickDelta: Float) {
        if (client == null || client.player == null) return
        modules.forEach { try { it.render(matrices, tickDelta) } catch (_: Throwable) {} }
    }
}
