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

    /** Cached voice history entries, so the tab shows something before the network answers. */
    var history: List<Activity>
        get() = try {
            val arr = org.json.JSONArray(prefs.getString("history", "[]"))
            (0 until arr.length()).map { arr.getJSONObject(it).let { o -> Activity(o.getString("id"), o.getLong("time"), o.getString("summary"), o.getString("device"), o.getString("reply")) } }
        } catch (e: Exception) { emptyList() }
        set(v) = prefs.edit().putString("history", org.json.JSONArray(v.map {
            org.json.JSONObject().put("id", it.id).put("time", it.time).put("summary", it.summary).put("device", it.device).put("reply", it.reply)
        }).toString()).apply()

    var toggleWidgetPrefix = "widget_"

    fun widgetDevice(widgetId: Int): String? = prefs.getString("widget_$widgetId", null)
    fun setWidgetDevice(widgetId: Int, entityId: String) = prefs.edit().putString("widget_$widgetId", entityId).apply()

    val loggedIn get() = refreshToken != null

    fun logout() = prefs.edit().remove("cookies").remove("refresh").remove("history").apply()

    companion object {
        val regions = listOf("com", "co.uk", "de", "fr", "it", "es", "ca", "com.au", "co.jp", "in", "com.br", "com.mx")
    }
}
