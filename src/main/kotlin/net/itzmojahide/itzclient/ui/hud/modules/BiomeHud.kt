
package net.itzmojahide.itzclient.ui.hud.modules

import net.itzmojahide.itzclient.ui.hud.IHudModule
import net.minecraft.client.util.math.MatrixStack
import net.minecraft.client.MinecraftClient
import net.minecraft.util.registry.RegistryKeys

class BiomeHud : IHudModule {
    private val mc = MinecraftClient.getInstance()
    override fun render(matrices: MatrixStack, tickDelta: Float) {
        try {
            val pos = mc.player?.blockPos ?: return
            val biome = mc.world?.getBiome(pos)?.key?.value?.path ?: "unknown"
            mc.textRenderer.draw(matrices, "Biome: $biome", 6f, 168f, net.itzmojahide.itzclient.ui.UIThemeManager.accentColor)
        } catch (e: Exception) {}
    }
}
