package net.kaki87.alexandroid

import android.app.Activity
import android.os.Bundle
import android.webkit.CookieManager
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import java.util.concurrent.Executors

/** Signs in through the regular Amazon page (handles 2FA and captchas), then registers the device. */
class LoginActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val store = Store(this)
        val pending = Auth.begin(store.tld)
        val web = WebView(this)
        setContentView(web)
        CookieManager.getInstance().removeAllCookies(null)
        web.settings.javaScriptEnabled = true
        web.settings.domStorageEnabled = true
        web.settings.userAgentString = "Mozilla/5.0 (iPhone; CPU iPhone OS 18_5 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Mobile/15E148"
        web.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView, request: WebResourceRequest): Boolean {
                val url = request.url
                if (url.path?.endsWith("/ap/maplanding") == true) {
                    val code = url.getQueryParameter("openid.oa2.authorization_code")
                    if (code == null) { finish(); return true }
                    Executors.newSingleThreadExecutor().execute {
                        try {
                            Auth.register(store, pending, code)
                            runOnUiThread { setResult(RESULT_OK); finish() }
                        } catch (e: Exception) {
                            android.util.Log.e("Alexandroid", "registration failed", e)
                            runOnUiThread { Toast.makeText(this@LoginActivity, e.message, Toast.LENGTH_LONG).show(); finish() }
                        }
                    }
                    return true
                }
                return !url.scheme.orEmpty().startsWith("http")
            }
        }
        web.loadUrl(pending.url)
    }
}
