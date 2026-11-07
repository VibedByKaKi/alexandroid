package net.kaki87.alexandroid

import org.json.JSONArray
import org.json.JSONObject
import java.net.HttpURLConnection
import java.net.URL
import java.util.TimeZone

class AuthException(message: String) : Exception(message)

/** Client for the Alexa web API (the same endpoints the official app's JS layer calls). */
class AlexaApi(private val store: Store) {
    private val host get() = "https://alexa.amazon.${store.tld}"
    private var csrf: String? = null

    private fun request(method: String, path: String, body: String? = null, headers: Map<String, String> = emptyMap(), allowHtml: Boolean = false): String {
        try {
            return rawRequest(method, path, body, headers, allowHtml)
        } catch (e: AuthException) {
            if (store.refreshToken == null) throw e
            android.util.Log.w("Alexandroid", "auth failure on $method ${path.take(80)}: ${e.message}")
            csrf = null
            Auth.refreshCookies(store) // throws AuthException only when the refresh token is rejected: a real sign-out
            try {
                return rawRequest(method, path, body, headers, allowHtml)
            } catch (again: AuthException) {
                throw RuntimeException("Amazon refused the request (${again.message})")
            }
        }
    }

    private fun rawRequest(method: String, path: String, body: String? = null, headers: Map<String, String> = emptyMap(), allowHtml: Boolean = false): String {
        val conn = URL(if (path.startsWith("http")) path else host + path).openConnection() as HttpURLConnection
        try {
            conn.requestMethod = method
            conn.connectTimeout = 15000
            conn.readTimeout = 20000
            conn.instanceFollowRedirects = false
            conn.setRequestProperty("Cookie", store.cookies)
            conn.setRequestProperty("User-Agent", UA)
            conn.setRequestProperty("Accept", "application/json; charset=utf-8")
            if (!path.startsWith("http")) {
                conn.setRequestProperty("Referer", "$host/spa/index.html")
                conn.setRequestProperty("Origin", host)
                csrf?.let { conn.setRequestProperty("csrf", it) }
            }
            headers.forEach { (k, v) -> conn.setRequestProperty(k, v) }
            if (body != null) {
                conn.doOutput = true
                conn.setRequestProperty("Content-Type", "application/json; charset=UTF-8")
                conn.outputStream.use { it.write(body.toByteArray()) }
            }
            val code = conn.responseCode
            if (code in 300..399 || code == 401 || code == 403) throw AuthException("HTTP $code")
            val stream = if (code in 200..299) conn.inputStream else conn.errorStream
            val text = stream?.bufferedReader()?.use { it.readText() }.orEmpty()
            if (code !in 200..299) { android.util.Log.e("Alexandroid", "HTTP $code cookieLen=${store.cookies.length} urlLen=${path.length} body=${text.take(300)}"); throw RuntimeException("HTTP $code ${path.take(120)} ${text.take(200)}") }
            if (!allowHtml && text.trimStart().startsWith("<")) throw AuthException("HTML response")
            conn.headerFields["Set-Cookie"]?.forEach { mergeCookie(it) }
            return text
        } finally {
            conn.disconnect()
        }
    }

    private fun mergeCookie(setCookie: String) {
        val pair = setCookie.substringBefore(';')
        val name = pair.substringBefore('=')
        val map = store.cookies.split("; ").filter { it.contains('=') }.associate { it.substringBefore('=') to it }.toMutableMap()
        map[name] = pair
        store.cookies = map.values.joinToString("; ")
        if (name == "csrf") csrf = pair.substringAfter('=')
    }

    private fun ensureCsrf() {
        if (csrf != null) return
        csrf = store.cookies.split("; ").firstOrNull { it.startsWith("csrf=") }?.substringAfter('=')
        if (csrf == null) {
            request("GET", "/api/language")
            if (csrf == null) request("GET", "/api/bootstrap?version=0")
        }
    }

    // ---- Smart home (GraphQL, same queries as the official app) -------------------------------

    private fun graphql(query: String, variables: JSONObject? = null): JSONObject {
        val body = JSONObject().put("query", query)
        if (variables != null) body.put("variables", variables)
        val resp = JSONObject(request("POST", "/nexus/v1/graphql", body.toString()))
        resp.optJSONArray("errors")?.let { if (it.length() > 0) throw RuntimeException(it.getJSONObject(0).optString("message")) }
        return resp.getJSONObject("data")
    }

    fun smartHomeDevices(): List<Device> {
        ensureCsrf()
        val data = graphql(
            "query ListEndpoints { listEndpoints(listEndpointsInput: { enablement: ENABLED, includeHouseholdDevices: true, latencyTolerance: LOW }) {" +
                " endpoints { id friendlyNameObject { value { text } } displayCategories { primary { value } }" +
                " features(latencyToleranceValue: LOW) { name properties { name ... on Power { powerStateValue } ... on Reachability { reachabilityStatusValue } ... on Brightness { brightnessStateValue } ... on Color { colorStateValue { hue saturation } } ... on ColorTemperature { colorTemperatureInKelvinStateValue } } } } } }",
        )
        val endpoints = data.getJSONObject("listEndpoints").getJSONArray("endpoints")
        val out = ArrayList<Device>()
        for (i in 0 until endpoints.length()) {
            val e = endpoints.getJSONObject(i)
            val features = e.optJSONArray("features") ?: continue
            var power: Boolean? = null
            var hasPower = false
            var reachable = true
            var brightness: Int? = null; var hasBrightness = false
            var hasColor = false; var hue: Double? = null; var sat: Double? = null
            var hasTemp = false; var kelvin: Int? = null
            for (j in 0 until features.length()) {
                val f = features.getJSONObject(j)
                val props = f.optJSONArray("properties") ?: continue
                for (k in 0 until props.length()) {
                    val p = props.getJSONObject(k)
                    if (f.optString("name") == "power") {
                        hasPower = true
                        if (p.has("powerStateValue") && !p.isNull("powerStateValue")) power = p.getString("powerStateValue") == "ON"
                    }
                    when (p.optString("name")) {
                        "brightness" -> { hasBrightness = true; if (!p.isNull("brightnessStateValue") && p.has("brightnessStateValue")) brightness = p.getInt("brightnessStateValue") }
                        "color" -> { hasColor = true; p.optJSONObject("colorStateValue")?.let { hue = it.optDouble("hue"); sat = it.optDouble("saturation") } }
                        "colorTemperature" -> { hasTemp = true; if (!p.isNull("colorTemperatureInKelvinStateValue") && p.has("colorTemperatureInKelvinStateValue")) kelvin = p.getInt("colorTemperatureInKelvinStateValue") }
                    }
                    if (p.has("reachabilityStatusValue") && !p.isNull("reachabilityStatusValue")) reachable = p.getString("reachabilityStatusValue") == "OK"
                }
                if (f.optString("name") == "power") hasPower = true
            }
            if (!hasPower) continue
            val name = e.getJSONObject("friendlyNameObject").getJSONObject("value").getString("text")
            val type = e.optJSONObject("displayCategories")?.optJSONObject("primary")?.optString("value").orEmpty()
            out += Device(e.getString("id"), e.getString("id"), name, type, power, reachable, brightness, hasBrightness, hasColor, hue, sat, hasTemp, kelvin)
        }
        return out.sortedBy { it.name.lowercase() }
    }

    private fun control(entityId: String, feature: String, operation: String, payload: JSONObject) {
        ensureCsrf()
        val data = graphql(
            "mutation SetFeature(\$endpointId: String!, \$payload: JSON!) { setEndpointFeatures(setEndpointFeaturesInput: { featureControlRequests: [ { endpointId: \$endpointId," +
                " featureName: $feature, featureOperationName: $operation, payload: \$payload } ]" +
                " }) { featureControlResponses { endpointId code } errors { endpointId code message } } }",
            JSONObject().put("endpointId", entityId).put("payload", payload),
        )
        val errors = data.getJSONObject("setEndpointFeatures").optJSONArray("errors")
        if (errors != null && errors.length() > 0) throw RuntimeException(errors.getJSONObject(0).let { it.optString("code", "control error") + " " + it.optString("message") })
    }

    fun setBrightness(device: Device, percent: Int) {
        control(device.entityId, "brightness", "setBrightness", JSONObject().put("brightness", percent))
        device.brightness = percent
        device.on = percent > 0
    }

    /** hue 0..360, saturation 0..1; brightness stays at the current level. */
    fun setColor(device: Device, hue: Double, saturation: Double) {
        val color = JSONObject().put("hue", hue).put("saturation", saturation).put("brightness", (device.brightness ?: 100) / 100.0)
        control(device.entityId, "color", "setColor", JSONObject().put("color", color))
        device.hue = hue; device.saturation = saturation; device.on = true
    }

    fun setColorTemperature(device: Device, kelvin: Int) {
        control(device.entityId, "colorTemperature", "setColorTemperature", JSONObject().put("colorTemperatureInKelvin", kelvin))
        device.kelvin = kelvin; device.on = true
    }

    fun setPower(device: Device, on: Boolean) {
        ensureCsrf()
        val op = if (on) "turnOn" else "turnOff"
        val data = graphql(
            "mutation SetPower { setEndpointFeatures(setEndpointFeaturesInput: { featureControlRequests: [ { endpointId: \"${device.entityId}\"," +
                " featureName: power, featureOperationName: $op } ] }) { featureControlResponses { endpointId } errors { endpointId code } } }",
        )
        val errors = data.getJSONObject("setEndpointFeatures").optJSONArray("errors")
        if (errors != null && errors.length() > 0) throw RuntimeException(errors.getJSONObject(0).optString("code", "control error"))
        device.on = on
    }

    // ---- Alarms & timers --------------------------------------------------------------------

    fun echoDevices(): List<EchoDevice> {
        ensureCsrf()
        val arr = JSONObject(request("GET", "/api/devices-v2/device?cached=false")).optJSONArray("devices") ?: return emptyList()
        return (0 until arr.length()).map { arr.getJSONObject(it) }
            .filter { it.optString("deviceFamily") in setOf("ECHO", "KNIGHT", "ROOK", "TABLET", "FIRE_TV") }
            .map { EchoDevice(it.getString("serialNumber"), it.getString("deviceType"), it.optString("accountName"), it.optString("deviceAccountId")) }
    }

    fun notifications(): List<Notification> {
        ensureCsrf()
        val arr = JSONObject(request("GET", "/api/notifications")).optJSONArray("notifications") ?: return emptyList()
        return (0 until arr.length()).map { arr.getJSONObject(it) }
            .filter { it.optString("type") == "Alarm" || it.optString("type") == "Timer" }
            .map {
                Notification(
                    id = it.getString("id"),
                    type = it.getString("type"),
                    status = it.optString("status"),
                    label = it.optString("timerLabel", it.optString("reminderLabel", "")).let { l -> if (l == "null") "" else l },
                    deviceSerial = it.optString("deviceSerialNumber"),
                    deviceType = it.optString("deviceType"),
                    triggerMillis = it.optLong("alarmTime", it.optLong("triggerTime", 0)),
                    remainingMillis = it.optLong("remainingTime", 0),
                    clock = it.optString("originalTime").take(5),
                    recurring = it.optString("recurringPattern").takeIf { p -> p.isNotEmpty() && p != "null" },
                    raw = it,
                )
            }
            .sortedWith(compareBy<Notification>({ it.type }, { it.clock }, { it.triggerMillis }))
    }

    /** status: "ON", "OFF" (alarms), "PAUSED"/"ON" (timers). */
    fun setStatus(n: Notification, status: String) {
        ensureCsrf()
        val body = JSONObject(n.raw.toString()).put("status", status)
        request("PUT", "/api/notifications/${n.id}", body.toString())
    }

    fun delete(n: Notification) {
        ensureCsrf()
        request("DELETE", "/api/notifications/${n.id}")
    }

    private fun devicePrefs(serial: String): JSONObject? {
        val prefs = JSONObject(request("GET", "/api/device-preferences")).optJSONArray("devicePreferences") ?: return null
        for (i in 0 until prefs.length()) if (prefs.getJSONObject(i).optString("deviceSerialNumber") == serial) return prefs.getJSONObject(i)
        return null
    }

    /**
     * The legacy notification endpoint rejects new timers (HTTP 500) and the gateway timer API only targets the
     * phone, so the timer is created by sending a text command to the Echo in its own language.
     */
    fun createTimer(device: EchoDevice, minutes: Int) {
        ensureCsrf()
        val prefs = JSONObject(request("GET", "/api/device-preferences")).optJSONArray("devicePreferences")
        var locale = "en-US"
        if (prefs != null) for (i in 0 until prefs.length()) {
            val p = prefs.getJSONObject(i)
            if (p.optString("deviceSerialNumber") == device.serial) locale = p.optString("locale", locale)
        }
        val lang = locale.substringBefore('-').lowercase()
        val text = when (lang) {
            "fr" -> "minuteur de $minutes minutes"
            "de" -> "Timer für $minutes Minuten"
            "es" -> "temporizador de $minutes minutos"
            "it" -> "timer di $minutes minuti"
            else -> "set a timer for $minutes minutes"
        }
        val customerId = JSONObject(request("GET", "/api/bootstrap?version=0")).getJSONObject("authentication").getString("customerId")
        val payload = JSONObject().put("deviceType", device.type).put("deviceSerialNumber", device.serial)
            .put("locale", locale.substringBefore('-') + "-" + locale.substringAfter('-', "US").uppercase())
            .put("customerId", customerId).put("text", text)
        val seq = JSONObject().put("@type", "com.amazon.alexa.behaviors.model.Sequence").put("startNode", JSONObject()
            .put("@type", "com.amazon.alexa.behaviors.model.OpaquePayloadOperationNode")
            .put("type", "Alexa.TextCommand").put("skillId", "amzn1.ask.1p.tellalexa").put("operationPayload", payload))
        request("POST", "/api/behaviors/preview", JSONObject().put("behaviorId", "PREVIEW").put("sequenceJson", seq.toString()).put("status", "ENABLED").toString())
    }

    private fun alarmFields(zone: String, hour: Int, minute: Int, days: Set<Int>, date: String?): JSONObject {
        val cal = java.util.Calendar.getInstance(TimeZone.getTimeZone(zone)).apply {
            if (days.isEmpty() && date != null) date.split('-').takeIf { it.size == 3 }?.let { set(it[0].toInt(), it[1].toInt() - 1, it[2].toInt()) }
            set(java.util.Calendar.HOUR_OF_DAY, hour); set(java.util.Calendar.MINUTE, minute)
            set(java.util.Calendar.SECOND, 0); set(java.util.Calendar.MILLISECOND, 0)
            while (timeInMillis <= System.currentTimeMillis() || (days.isNotEmpty() && isoDay(this) !in days)) add(java.util.Calendar.DAY_OF_YEAR, 1)
        }
        val date = java.text.SimpleDateFormat("yyyy-MM-dd", java.util.Locale.US).apply { timeZone = TimeZone.getTimeZone(zone) }.format(cal.time)
        return JSONObject()
            .put("timeZoneId", zone)
            .put("alarmTime", cal.timeInMillis)
            .put("originalDate", date)
            .put("originalTime", String.format(java.util.Locale.US, "%02d:%02d:00.000", hour, minute))
            .put("isRecurring", days.isNotEmpty())
            .put("recurringPattern", if (days.isEmpty() && date != null) date else Recurrence.toPattern(days))
            .put("status", "ON")
    }

    private fun isoDay(cal: java.util.Calendar) = (cal.get(java.util.Calendar.DAY_OF_WEEK) + 5) % 7 + 1

    private fun zoneOf(serial: String) =
        devicePrefs(serial)?.optString("timeZoneId")?.takeIf { it.isNotBlank() && it != "null" } ?: TimeZone.getDefault().id

    fun createAlarm(device: EchoDevice, hour: Int, minute: Int, days: Set<Int>, date: String? = null) {
        ensureCsrf()
        val body = baseNotification(device, "Alarm", System.currentTimeMillis())
        val fields = alarmFields(zoneOf(device.serial), hour, minute, days, date)
        fields.keys().forEach { body.put(it, fields.get(it)) }
        request("PUT", "/api/notifications/createReminder", body.toString())
    }

    fun updateAlarm(n: Notification, hour: Int, minute: Int, days: Set<Int>, date: String? = null) {
        ensureCsrf()
        val body = JSONObject(n.raw.toString())
        val fields = alarmFields(zoneOf(n.deviceSerial), hour, minute, days, date)
        fields.keys().forEach { body.put(it, fields.get(it)) }
        request("PUT", "/api/notifications/${n.id}", body.toString())
    }

    private fun baseNotification(d: EchoDevice, type: String, now: Long) = JSONObject()
        .put("type", type)
        .put("deviceSerialNumber", d.serial)
        .put("deviceType", d.type)
        .put("deviceAccountId", d.accountId ?: JSONObject.NULL)
        .put("createdDate", now)
        .put("id", "create$type")
        .put("isSaveInFlight", true)
        .put("sound", JSONObject.NULL)
        .put("timeZoneId", TimeZone.getDefault().id)

    // ---- Voice history (Alexa privacy dashboard) ----------------------------------------------

    /** The dashboard returns 10 records per call. Its page token is rejected, so the end of the window moves back instead. */
    fun history(days: Int = 30, pages: Int = 4): List<Activity> {
        val now = System.currentTimeMillis()
        val start = now - days * 86_400_000L
        var end = now + 86_400_000L
        val out = ArrayList<Activity>()
        for (page in 1..pages) {
            val url = "https://www.amazon.${store.tld}/alexa-privacy/apd/rvh/customer-history-records?startTime=$start&endTime=$end"
            val root = if (page == 1) JSONObject(request("GET", url)) else {
                Thread.sleep(1500)
                try { JSONObject(request("GET", url)) } catch (e: AuthException) { throw e } catch (e: Exception) { break }
            }
            val records = root.optJSONArray("customerHistoryRecords") ?: break
            if (records.length() == 0) break
            parseHistory(root, out)
            var oldest = Long.MAX_VALUE
            for (i in 0 until records.length()) oldest = minOf(oldest, records.getJSONObject(i).optLong("timestamp", Long.MAX_VALUE))
            if (oldest == Long.MAX_VALUE || oldest >= end || root.optString("encodedRequestToken").let { it.isBlank() || it == "null" }) break
            end = oldest
        }
        return out.distinctBy { it.id }.sortedByDescending { it.time }
    }

    private fun parseHistory(root: JSONObject, out: MutableList<Activity>) {
        val arr = root.optJSONArray("customerHistoryRecords") ?: return
        for (i in 0 until arr.length()) {
            val r = arr.getJSONObject(i)
            val items = r.optJSONArray("voiceHistoryRecordItems")
            var heard = ""
            var reply = ""
            if (items != null) for (j in 0 until items.length()) {
                val it = items.getJSONObject(j)
                val text = it.optString("transcriptText").ifBlank { it.optString("utteranceText") }
                val type = it.optString("recordItemType")
                when {
                    (type.contains("CUSTOMER") || type == "ASR_REPLACEMENT_TEXT") && heard.isEmpty() -> heard = text
                    (type.contains("ALEXA_RESPONSE") || type == "TTS_REPLACEMENT_TEXT") && reply.isEmpty() -> reply = text
                }
            }
            // Wake-word-only records carry just "alexa".
            if (heard.isBlank() || heard.equals("alexa", ignoreCase = true)) continue
            val device = r.optJSONObject("device")?.optString("deviceName")
                ?: r.optJSONObject("deviceInfo")?.optString("deviceName") ?: ""
            out += Activity(r.optString("recordKey"), r.optLong("timestamp"), heard, device, reply)
        }
    }

    companion object {
        const val UA = "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36"
    }
}
