package net.kaki87.alexandroid

import android.util.Base64
import org.json.JSONArray
import org.json.JSONObject
import java.net.HttpURLConnection
import java.net.URL
import java.net.URLEncoder
import java.security.MessageDigest
import java.security.SecureRandom

/**
 * Amazon device registration (OAuth2 code + PKCE through the app sign-in page), then exchange of
 * the refresh token for the web cookies the Alexa API needs.
 */
object Auth {
    private const val DEVICE_TYPE = "A2IVLV5VM2W81"
    private const val APP_VERSION = "2.2.663733"
    private const val REG_UA = "AmazonWebView/Amazon Alexa/2.2.663733.0/iOS/18.5/iPhone"

    class Pending(val clientId: String, val verifier: String, val url: String)

    private fun enc(s: String) = URLEncoder.encode(s, "UTF-8")

    private fun hex(b: ByteArray) = b.joinToString("") { "%02x".format(it) }

    fun begin(tld: String): Pending {
        val rnd = SecureRandom()
        val id = ByteArray(16).also { rnd.nextBytes(it) }
        val clientId = hex(id) + hex("#$DEVICE_TYPE".toByteArray())
        val verifierBytes = ByteArray(32).also { rnd.nextBytes(it) }
        val flags = Base64.URL_SAFE or Base64.NO_PADDING or Base64.NO_WRAP
        val verifier = Base64.encodeToString(verifierBytes, flags)
        val challenge = Base64.encodeToString(MessageDigest.getInstance("SHA-256").digest(verifier.toByteArray()), flags)
        val q = linkedMapOf(
            "openid.return_to" to "https://www.amazon.$tld/ap/maplanding",
            "openid.assoc_handle" to "amzn_dp_project_dee_ios",
            "openid.identity" to "http://specs.openid.net/auth/2.0/identifier_select",
            "pageId" to "amzn_dp_project_dee_ios",
            "accountStatusPolicy" to "P1",
            "openid.claimed_id" to "http://specs.openid.net/auth/2.0/identifier_select",
            "openid.mode" to "checkid_setup",
            "openid.ns.oa2" to "http://www.amazon.com/ap/ext/oauth/2",
            "openid.oa2.client_id" to "device:$clientId",
            "openid.ns.pape" to "http://specs.openid.net/extensions/pape/1.0",
            "openid.oa2.response_type" to "code",
            "openid.ns" to "http://specs.openid.net/auth/2.0",
            "openid.pape.max_auth_age" to "0",
            "openid.oa2.scope" to "device_auth_access",
            "openid.oa2.code_challenge_method" to "S256",
            "openid.oa2.code_challenge" to challenge,
            "language" to "en_US",
        )
        val url = "https://www.amazon.$tld/ap/signin?" + q.entries.joinToString("&") { "${it.key}=${enc(it.value)}" }
        return Pending(clientId, verifier, url)
    }

    /** Registers the device with the authorization code from the maplanding redirect and stores the tokens. */
    fun register(store: Store, pending: Pending, code: String) {
        val serial = ByteArray(16).also { SecureRandom().nextBytes(it) }
        val body = JSONObject()
            .put("requested_extensions", JSONArray().put("device_info").put("customer_info"))
            .put("cookies", JSONObject().put("website_cookies", JSONArray()).put("domain", ".amazon.${store.tld}"))
            .put("registration_data", JSONObject()
                .put("domain", "Device").put("app_version", APP_VERSION).put("device_type", DEVICE_TYPE)
                .put("device_name", "Alexandroid").put("os_version", "18.5")
                .put("device_serial", hex(serial).uppercase()).put("device_model", "iPhone")
                .put("app_name", "Alexandroid").put("software_version", "1"))
            .put("auth_data", JSONObject()
                .put("use_global_authentication", "true").put("client_id", pending.clientId)
                .put("authorization_code", code).put("code_verifier", pending.verifier)
                .put("code_algorithm", "SHA-256").put("client_domain", "DeviceLegacy"))
            .put("user_context_map", JSONObject().put("frc", Base64.encodeToString(ByteArray(313).also { SecureRandom().nextBytes(it) }, Base64.NO_WRAP)))
            .put("requested_token_type", JSONArray().put("bearer").put("mac_dms").put("website_cookies"))
        val resp = post("https://api.amazon.com/auth/register", body.toString(), "application/json")
        val tokens = JSONObject(resp).getJSONObject("response").getJSONObject("success").getJSONObject("tokens")
        store.refreshToken = tokens.getJSONObject("bearer").getString("refresh_token")
        val cookies = tokens.optJSONObject("website_cookies")?.let { it } ?: JSONObject()
        val arr = tokens.optJSONArray("website_cookies")
        if (arr != null && arr.length() > 0) {
            store.cookies = (0 until arr.length()).map { arr.getJSONObject(it) }
                .joinToString("; ") { "${it.getString("Name")}=${it.getString("Value").trim('"')}" }
        }
        refreshCookies(store)
    }

    /** Exchanges the stored refresh token for fresh web cookies. Throws AuthException if it is invalid. */
    fun refreshCookies(store: Store) {
        val token = store.refreshToken ?: throw AuthException("no refresh token")
        val form = "app_name=Alexandroid&app_version=$APP_VERSION&di.sdk.version=6.12.4&source_token=${enc(token)}" +
            "&package_name=com.amazon.echo&di.hw.version=iPhone&platform=iOS&requested_token_type=auth_cookies" +
            "&source_token_type=refresh_token&di.os.name=iOS&di.os.version=18.5&current_version=6.12.4" +
            "&previous_version=6.12.4&domain=.amazon.${store.tld}"
        val conn = URL("https://www.amazon.${store.tld}/ap/exchangetoken/cookies").openConnection() as HttpURLConnection
        try {
            conn.requestMethod = "POST"
            conn.doOutput = true
            conn.setRequestProperty("User-Agent", REG_UA)
            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded")
            conn.setRequestProperty("x-amzn-identity-auth-domain", "api.amazon.com")
            conn.outputStream.use { it.write(form.toByteArray()) }
            if (conn.responseCode !in 200..299) throw AuthException("exchange HTTP ${conn.responseCode}")
            val json = JSONObject(conn.inputStream.bufferedReader().readText())
            val list = json.getJSONObject("response").getJSONObject("tokens").getJSONObject("cookies")
                .getJSONArray(".amazon.${store.tld}")
            store.cookies = (0 until list.length()).map { list.getJSONObject(it) }
                .joinToString("; ") { "${it.getString("Name")}=${it.getString("Value").trim('"')}" }
        } finally {
            conn.disconnect()
        }
    }

    private fun post(url: String, body: String, type: String): String {
        val conn = URL(url).openConnection() as HttpURLConnection
        try {
            conn.requestMethod = "POST"
            conn.doOutput = true
            conn.setRequestProperty("User-Agent", REG_UA)
            conn.setRequestProperty("Content-Type", type)
            conn.setRequestProperty("Accept-Language", "en-US")
            conn.setRequestProperty("x-amzn-identity-auth-domain", "api.amazon.com")
            conn.outputStream.use { it.write(body.toByteArray()) }
            val stream = if (conn.responseCode in 200..299) conn.inputStream else conn.errorStream
            val text = stream.bufferedReader().readText()
            if (conn.responseCode !in 200..299) throw RuntimeException("register HTTP ${conn.responseCode}: ${text.take(300)}")
            return text
        } finally {
            conn.disconnect()
        }
    }
}
