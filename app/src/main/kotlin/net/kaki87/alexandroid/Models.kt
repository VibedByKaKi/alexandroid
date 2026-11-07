package net.kaki87.alexandroid

data class Device(
    val entityId: String, val applianceId: String, val name: String, val type: String, var on: Boolean?, val reachable: Boolean = true,
    var brightness: Int? = null, val hasBrightness: Boolean = false,
    val hasColor: Boolean = false, var hue: Double? = null, var saturation: Double? = null,
    val hasTemperature: Boolean = false, var kelvin: Int? = null,
) {
    val adjustable get() = hasBrightness || hasColor || hasTemperature
}

data class EchoDevice(val serial: String, val type: String, val name: String, val accountId: String?)

data class Notification(
    val id: String,
    val type: String,
    val status: String,
    val label: String,
    val deviceSerial: String,
    val deviceType: String,
    val triggerMillis: Long,
    val remainingMillis: Long,
    val recurring: String?,
    val clock: String,
    val raw: org.json.JSONObject,
)

data class Activity(val id: String, val time: Long, val summary: String, val device: String, val reply: String)
