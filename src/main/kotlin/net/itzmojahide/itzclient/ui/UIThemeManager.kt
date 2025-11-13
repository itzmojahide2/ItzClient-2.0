
package net.itzmojahide.itzclient.ui

import com.google.gson.Gson
import java.io.File

object UIThemeManager {
    var accentColor: Int = 0xFFFFFFFF.toInt() // default white
    private val file = File("itzclient_settings.json")

    fun load() {
        try {
            if (file.exists()) {
                val cfg = Gson().fromJson(file.readText(), Theme::class.java)
                accentColor = cfg.accentColor
            }
        } catch (e: Exception) {
            println("[ItzClient] Theme load failed: ${e.message}")
        }
    }

    fun save() {
        try {
            file.writeText(Gson().toJson(Theme(accentColor)))
        } catch (e: Exception) { println("[ItzClient] Theme save failed: ${e.message}") }
    }

    data class Theme(val accentColor: Int = 0xFFFFFFFF.toInt())
}
