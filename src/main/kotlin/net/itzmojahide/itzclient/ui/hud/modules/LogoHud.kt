
package net.itzmojahide.itzclient.ui.hud.modules

import net.itzmojahide.itzclient.ui.hud.IHudModule
import net.minecraft.client.MinecraftClient
import net.minecraft.client.util.math.MatrixStack
import net.minecraft.client.render.VertexConsumerProvider
import net.minecraft.client.render.item.ItemRenderer
import net.minecraft.client.texture.NativeImageBackedTexture
import net.minecraft.client.util.SpriteIdentifier
import net.minecraft.client.texture.TextureManager
import net.minecraft.client.gui.DrawableHelper

class LogoHud : IHudModule {
    private val mc = MinecraftClient.getInstance()
    override fun render(matrices: MatrixStack, tickDelta: Float) {
        try {
            val x = 8; val y = 8
            // draw placeholder box for logo (texture loading can be added)
            DrawableHelper.fill(matrices, x, y, x+64, y+64, 0x33FFFFFF)
            mc.textRenderer.draw(matrices, "ItzClient", x+8f, y+22f, net.itzmojahide.itzclient.ui.UIThemeManager.accentColor)
        } catch (e: Exception) {}
    }
}
