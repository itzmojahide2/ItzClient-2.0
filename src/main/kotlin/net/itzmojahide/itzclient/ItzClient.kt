
package net.itzmojahide.itzclient

import net.fabricmc.api.ClientModInitializer
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback
import net.itzmojahide.itzclient.ui.UIThemeManager
import net.itzmojahide.itzclient.ui.gui.SettingsScreen
import net.itzmojahide.itzclient.ui.hud.HudRenderer
import net.minecraft.client.option.KeyBinding
import net.minecraft.client.util.InputUtil
import org.lwjgl.glfw.GLFW

object ItzClient : ClientModInitializer {
    lateinit var settingsKey: KeyBinding

    override fun onInitializeClient() {
        println("[ItzClient] Initializing v1.21.1 by itzmojahide")
        settingsKey = KeyBindingHelper.registerKeyBinding(KeyBinding(
            "key.itzclient.settings",
            InputUtil.Type.KEYSYM,
            GLFW.GLFW_KEY_RIGHT_SHIFT,
            "category.itzclient"
        ))

        ClientTickEvents.END_CLIENT_TICK.register { client ->
            while (settingsKey.wasPressed()) {
                try {
                    val mc = net.minecraft.client.MinecraftClient.getInstance()
                    mc.setScreen(SettingsScreen())
                } catch (e: Exception) {
                    println("Failed to open settings: ${e.message}")
                }
            }
            // modules tick handled inside ModuleManager if present
        }

        HudRenderCallback.EVENT.register { matrices, tickDelta ->
            if (HudRenderer.enabled) HudRenderer.render(matrices, tickDelta.toFloat())
        }

        UIThemeManager.load()
        HudRenderer.init()
    }
}
