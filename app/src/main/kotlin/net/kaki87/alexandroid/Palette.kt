package net.kaki87.alexandroid

import android.content.Context
import android.content.res.Configuration
import android.graphics.Color

class Palette(val bg: Int, val surface: Int, val text: Int, val sub: Int, val accent: Int, val divider: Int) {
    companion object {
        private val light = Palette(Color.WHITE, 0xFFF1F3F4.toInt(), 0xFF202124.toInt(), 0xFF5F6368.toInt(), 0xFF0077B6.toInt(), 0xFFDADCE0.toInt())
        private val dark = Palette(0xFF121212.toInt(), 0xFF1E1E22.toInt(), 0xFFE8EAED.toInt(), 0xFF9AA0A6.toInt(), 0xFF4DC3FF.toInt(), 0xFF3C4043.toInt())

        fun of(context: Context): Palette = when (Store(context).theme) {
            1 -> light
            2 -> dark
            else -> if (context.resources.configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK == Configuration.UI_MODE_NIGHT_YES) dark else light
        }
    }
}
