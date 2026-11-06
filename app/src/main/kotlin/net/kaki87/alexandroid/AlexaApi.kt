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

    private fun request(method: String, path: String, body: String? = null): String {
        try {
            return rawRequest(method, path, body)
        } catch (e: AuthException) {
            if (store.refreshToken == null) throw e
            csrf = null
            Auth.refreshCookies(store)
            return rawRequest(method, path, body)
        }
    }

    private fun rawRequest(method: String, path: String, body: String? = null): String {
        val conn = URL(if (path.startsWith("http")) path else host + path).openConnection() as HttpURLConnection
        try {
            conn.requestMethod = method
            conn.connectTimeout = 15000
            conn.readTimeout = 20000
            conn.instanceFollowRedirects = false
            conn.setRequestProperty("Cookie", store.cookies)
            conn.setRequestProperty("User-Agent", UA)
            conn.setRequestProperty("Accept", "application/json; charset=utf-8")
            conn.setRequestProperty("Referer", "$host/spa/index.html")
            conn.setRequestProperty("Origin", host)
            csrf?.let { conn.setRequestProperty("csrf", it) }
            if (body != null) {
                conn.doOutput = true
                conn.setRequestProperty("Content-Type", "application/json; charset=UTF-8")
                conn.outputStream.use { it.write(body.toByteArray()) }
            }
            val code = conn.responseCode
            if (code in 300..399 || code == 401 || code == 403) throw AuthException("HTTP $code")
            val stream = if (code in 200..299) conn.inputStream else conn.errorStream
            val text = stream?.bufferedReader()?.use { it.readText() }.orEmpty()
            if (code !in 200..299) throw RuntimeException("HTTP $code $path ${text.take(200)}")
            if (text.trimStart().startsWith("<")) throw AuthException("HTML response")
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

    private fun graphql(query: String): JSONObject {
        val resp = JSONObject(request("POST", "/nexus/v1/graphql", JSONObject().put("query", query).toString()))
        resp.optJSONArray("errors")?.let { if (it.length() > 0) throw RuntimeException(it.getJSONObject(0).optString("message")) }
        return resp.getJSONObject("data")
    }

    fun smartHomeDevices(): List<Device> {
        ensureCsrf()
        val data = graphql(
            "query ListEndpoints { listEndpoints(listEndpointsInput: { enablement: ENABLED, includeHouseholdDevices: true, latencyTolerance: LOW }) {" +
                " endpoints { id friendlyNameObject { value { text } } displayCategories { primary { value } }" +
                " features(latencyToleranceValue: LOW) { name properties { name ... on Power { powerStateValue } ... on Reachability { reachabilityStatusValue } } } } } }",
        )
        val endpoints = data.getJSONObject("listEndpoints").getJSONArray("endpoints")
        val out = ArrayList<Device>()
        for (i in 0 until endpoints.length()) {
            val e = endpoints.getJSONObject(i)
            val features = e.optJSONArray("features") ?: continue
            var power: Boolean? = null
            var hasPower = false
            var reachable = true
            for (j in 0 until features.length()) {
                val f = features.getJSONObject(j)
                val props = f.optJSONArray("properties") ?: continue
                for (k in 0 until props.length()) {
                    val p = props.getJSONObject(k)
                    if (f.optString("name") == "power") {
                        hasPower = true
                        if (p.has("powerStateValue") && !p.isNull("powerStateValue")) power = p.getString("powerStateValue") == "ON"
                    }
                    if (p.has("reachabilityStatusValue") && !p.isNull("reachabilityStatusValue")) reachable = p.getString("reachabilityStatusValue") == "OK"
                }
                if (f.optString("name") == "power") hasPower = true
            }
            if (!hasPower) continue
            val name = e.getJSONObject("friendlyNameObject").getJSONObject("value").getString("text")
            val type = e.optJSONObject("displayCategories")?.optJSONObject("primary")?.optString("value").orEmpty()
            out += Device(e.getString("id"), e.getString("id"), name, type, power, reachable)
        }
        return out.sortedBy { it.name.lowercase() }
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
            .filter { it.optString("deviceFamily") in setOf("ECHO", "KNIGHT", "ROOK", "TABLET", "FIRE_TV") || it.optBoolean("online") }
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
                    recurring = it.optString("recurringPattern").takeIf { p -> p.isNotEmpty() && p != "null" },
                    raw = it,
                )
            }
            .sortedBy { it.triggerMillis }
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

    fun createTimer(device: EchoDevice, seconds: Int, label: String) {
        ensureCsrf()
        val now = System.currentTimeMillis()
        val body = baseNotification(device, "Timer", now)
            .put("timerLabel", label.ifBlank { JSONObject.NULL })
            .put("originalDuration", seconds * 1000L)
            .put("remainingTime", seconds * 1000L)
            .put("triggerTime", 0)
            .put("status", "ON")
        request("PUT", "/api/notifications/createReminder", body.toString())
    }

    fun createAlarm(device: EchoDevice, hour: Int, minute: Int) {
        ensureCsrf()
        val cal = java.util.Calendar.getInstance().apply {
            set(java.util.Calendar.HOUR_OF_DAY, hour); set(java.util.Calendar.MINUTE, minute)
            set(java.util.Calendar.SECOND, 0); set(java.util.Calendar.MILLISECOND, 0)
            if (timeInMillis <= System.currentTimeMillis()) add(java.util.Calendar.DAY_OF_YEAR, 1)
        }
        val date = java.text.SimpleDateFormat("yyyy-MM-dd", java.util.Locale.US).format(cal.time)
        val time = String.format(java.util.Locale.US, "%02d:%02d:00.000", hour, minute)
        val body = baseNotification(device, "Alarm", System.currentTimeMillis())
            .put("alarmTime", cal.timeInMillis)
            .put("originalDate", date)
            .put("originalTime", time)
            .put("isRecurring", false)
            .put("recurringPattern", JSONObject.NULL)
            .put("status", "ON")
        request("PUT", "/api/notifications/createReminder", body.toString())
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

    fun history(days: Int = 30): List<Activity> {
        val now = System.currentTimeMillis()
        val url = "https://www.amazon.${store.tld}/alexa-privacy/apd/rvh/customer-history-records?startTime=${now - days * 86_400_000L}&endTime=${now + 86_400_000L}"
        val root = JSONObject(request("GET", url))
        val arr = root.optJSONArray("customerHistoryRecords") ?: return emptyList()
        val out = ArrayList<Activity>()
        for (i in 0 until arr.length()) {
            val r = arr.getJSONObject(i)
            val items = r.optJSONArray("voiceHistoryRecordItems")
            var heard = ""
            var reply = ""
            if (items != null) for (j in 0 until items.length()) {
                val it = items.getJSONObject(j)
                val text = it.optString("transcriptText").ifBlank { it.optString("utteranceText") }
                when {
                    it.optString("recordItemType").contains("CUSTOMER") && heard.isEmpty() -> heard = text
                    it.optString("recordItemType").contains("ALEXA_RESPONSE") && reply.isEmpty() -> reply = text
                }
            }
            val device = r.optJSONObject("device")?.optString("deviceName")
                ?: r.optJSONObject("deviceInfo")?.optString("deviceName") ?: ""
            val summary = heard.ifBlank { reply }
            if (summary.isBlank()) continue
            out += Activity(r.optString("recordKey"), r.optLong("timestamp"), summary, device, reply.takeIf { heard.isNotBlank() }.orEmpty())
        }
        return out.sortedByDescending { it.time }
    }

    companion object {
        const val UA = "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36"
    }
}
