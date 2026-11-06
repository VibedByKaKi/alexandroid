package net.kaki87.alexandroid

import android.content.Context

/** Persistent settings: Amazon region, session cookies, theme choice. */
class Store(context: Context) {
    private val prefs = context.applicationContext.getSharedPreferences("alexandroid", Context.MODE_PRIVATE)

    /** Amazon top-level domain suffix, e.g. "com" or "fr". */
    var tld: String
        get() = prefs.getString("tld", "com")!!
        set(v) = prefs.edit().putString("tld", v).apply()

    /** Raw Cookie header value for the Alexa web host. */
    var cookies: String
        get() = prefs.getString("cookies", "")!!
        set(v) = prefs.edit().putString("cookies", v).apply()

    var refreshToken: String?
        get() = prefs.getString("refresh", null)
        set(v) = prefs.edit().putString("refresh", v).apply()

    /** 0 = follow system, 1 = light, 2 = dark. */
    var theme: Int
        get() = prefs.getInt("theme", 0)
        set(v) = prefs.edit().putInt("theme", v).apply()

    var toggleWidgetPrefix = "widget_"

    fun widgetDevice(widgetId: Int): String? = prefs.getString("widget_$widgetId", null)
    fun setWidgetDevice(widgetId: Int, entityId: String) = prefs.edit().putString("widget_$widgetId", entityId).apply()

    val loggedIn get() = refreshToken != null

    fun logout() = prefs.edit().remove("cookies").remove("refresh").apply()

    companion object {
        val regions = listOf("com", "co.uk", "de", "fr", "it", "es", "ca", "com.au", "co.jp", "in", "com.br", "com.mx")
    }
}
