package net.kaki87.alexandroid

import android.app.Activity
import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.webkit.CookieManager
import android.webkit.WebResourceRequest
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import java.util.concurrent.Executors

/** Signs in through the regular Amazon page (handles 2FA and captchas), then registers the device. */
class LoginActivity : Activity() {
    private lateinit var store: Store
    private lateinit var web: WebView
    private lateinit var pending: Auth.Pending

    @Suppress("DEPRECATION")
    override fun onCreate(savedInstanceState: Bundle?) {
        val pal = Palette.of(this)
        val dark = pal.bg != android.graphics.Color.WHITE
        // Algorithmic darkening on Android 13+ only applies when the activity theme is dark.
        setTheme(if (dark) android.R.style.Theme_DeviceDefault_NoActionBar else android.R.style.Theme_DeviceDefault_Light_NoActionBar)
        super.onCreate(savedInstanceState)
        store = Store(this)
        window.statusBarColor = pal.bg
        window.navigationBarColor = pal.bg
        if (!dark) window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR or View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR

        val density = resources.displayMetrics.density
        val bar = LinearLayout(this).apply {
            gravity = android.view.Gravity.CENTER_VERTICAL
            setBackgroundColor(pal.bg)
            setPadding((16 * density).toInt(), (4 * density).toInt(), (16 * density).toInt(), (4 * density).toInt())
        }
        bar.addView(TextView(this).apply { text = "Amazon region"; setTextColor(pal.text) },
            LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f))
        val regions = Store.regions.map { "amazon.$it" }
        val spinner = Spinner(this)
        spinner.adapter = object : ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, regions) {
            override fun getView(position: Int, convertView: View?, parent: ViewGroup) =
                super.getView(position, convertView, parent).also { (it as TextView).setTextColor(pal.text) }
        }
        spinner.setSelection(Store.regions.indexOf(store.tld).coerceAtLeast(0))
        bar.addView(spinner)

        web = WebView(this)
        web.settings.javaScriptEnabled = true
        web.settings.domStorageEnabled = true
        web.settings.userAgentString = "Mozilla/5.0 (iPhone; CPU iPhone OS 18_5 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Mobile/15E148"
        if (dark) {
            if (Build.VERSION.SDK_INT >= 33) web.settings.isAlgorithmicDarkeningAllowed = true
            else if (Build.VERSION.SDK_INT >= 29) web.settings.forceDark = WebSettings.FORCE_DARK_ON
        }
        web.setBackgroundColor(pal.bg)
        web.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView, request: WebResourceRequest): Boolean {
                val url = request.url
                if (url.path?.endsWith("/ap/maplanding") == true) {
                    val code = url.getQueryParameter("openid.oa2.authorization_code")
                    if (code == null) { finish(); return true }
                    val session = pending
                    Executors.newSingleThreadExecutor().execute {
                        try {
                            Auth.register(store, session, code)
                            runOnUiThread { setResult(RESULT_OK); finish() }
                        } catch (e: Exception) {
                            android.util.Log.e("Alexandroid", "registration failed", e)
                            runOnUiThread { Toast.makeText(this@LoginActivity, e.message, Toast.LENGTH_LONG).show(); load() }
                        }
                    }
                    return true
                }
                return !url.scheme.orEmpty().startsWith("http")
            }
        }

        val root = LinearLayout(this).apply { orientation = LinearLayout.VERTICAL; fitsSystemWindows = true; setBackgroundColor(pal.bg) }
        root.addView(bar)
        root.addView(web, LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 0, 1f))
        setContentView(root)

        var first = true
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                val tld = Store.regions[position]
                if (first) { first = false; load(); return }
                if (tld != store.tld) { store.tld = tld; load() }
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }
    }

    private fun load() {
        CookieManager.getInstance().removeAllCookies(null)
        pending = Auth.begin(store.tld)
        web.loadUrl(pending.url)
    }
}
