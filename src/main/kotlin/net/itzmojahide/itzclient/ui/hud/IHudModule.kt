
package net.itzmojahide.itzclient.ui.hud

import net.minecraft.client.util.math.MatrixStack

interface IHudModule {
    fun render(matrices: MatrixStack, tickDelta: Float)
}
