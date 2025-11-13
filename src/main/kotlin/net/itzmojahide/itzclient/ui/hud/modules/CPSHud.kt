
package net.itzmojahide.itzclient.ui.hud.modules

import net.itzmojahide.itzclient.ui.hud.IHudModule
import net.minecraft.client.MinecraftClient
import net.minecraft.client.util.math.MatrixStack

class CPSHud : IHudModule {
    private val mc = MinecraftClient.getInstance()
    private var lastLeft = 0
    override fun render(matrices: MatrixStack, tickDelta: Float) {
        // Placeholder: show a static CPS variable (real implementation requires input tracking)
        mc.textRenderer.draw(matrices, "CPS L: 0 R: 0", 6f, 30f, net.itzmojahide.itzclient.ui.UIThemeManager.accentColor)
    }
}
