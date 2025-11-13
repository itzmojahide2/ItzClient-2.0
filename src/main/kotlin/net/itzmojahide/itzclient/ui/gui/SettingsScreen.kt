
package net.itzmojahide.itzclient.ui.gui

import com.mojang.blaze3d.systems.RenderSystem
import net.minecraft.client.gui.screen.Screen
import net.minecraft.client.util.math.MatrixStack
import net.minecraft.text.Text
import net.itzmojahide.itzclient.ui.UIThemeManager
import net.minecraft.client.gui.widget.ButtonWidget

class SettingsScreen : Screen(Text.literal("ItzClient Settings")) {
    constructor() : super(Text.literal("ItzClient Settings"))

    override fun init() {
        val w = this.width
        val h = this.height
        // simple preset buttons for color
        addDrawableChild(ButtonWidget.builder(Text.literal("White (default)")) {
            UIThemeManager.accentColor = 0xFFFFFFFF.toInt(); UIThemeManager.save()
        }.dimensions(w/2 - 100, h/2 - 30, 200, 20).build())

        addDrawableChild(ButtonWidget.builder(Text.literal("Red")) {
            UIThemeManager.accentColor = 0xFFFF5555.toInt(); UIThemeManager.save()
        }.dimensions(w/2 - 100, h/2, 200, 20).build())

        addDrawableChild(ButtonWidget.builder(Text.literal("Blue")) {
            UIThemeManager.accentColor = 0xFF55AAFF.toInt(); UIThemeManager.save()
        }.dimensions(w/2 - 100, h/2 + 30, 200, 20).build())
    }

    override fun render(matrices: MatrixStack, mouseX: Int, mouseY: Int, delta: Float) {
        renderBackground(matrices)
        drawCenteredText(matrices, this.textRenderer, title.string, this.width/2, 20, 0xFFFFFF)
        super.render(matrices, mouseX, mouseY, delta)
    }
}
