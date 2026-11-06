package net.kaki87.alexandroid

import android.app.Activity
import android.app.AlertDialog
import android.app.TimePickerDialog
import android.content.Intent
import android.graphics.Typeface
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.text.InputType
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.*
import java.text.DateFormat
import java.util.Date
import java.util.concurrent.Executors

class MainActivity : Activity() {
    private lateinit var store: Store
    private lateinit var api: AlexaApi
    private lateinit var pal: Palette
    private val io = Executors.newFixedThreadPool(3)
    private val ui = Handler(Looper.getMainLooper())
    private var tab = 0
    private lateinit var content: FrameLayout
    private lateinit var tabBar: LinearLayout
    private var tick: Runnable? = null

    private fun dp(v: Int) = (v * resources.displayMetrics.density).toInt()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        store = Store(this)
        api = AlexaApi(store)
        build()
        if (!store.loggedIn) login() else show(tab)
    }

    override fun onConfigurationChanged(newConfig: android.content.res.Configuration) {
        super.onConfigurationChanged(newConfig)
        build()
        show(tab)
    }

    private fun build() {
        pal = Palette.of(this)
        window.statusBarColor = pal.bg
        window.navigationBarColor = pal.bg
        val light = pal.bg == android.graphics.Color.WHITE
        window.decorView.systemUiVisibility = if (light) View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR or View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR else 0
        val root = LinearLayout(this).apply { orientation = LinearLayout.VERTICAL; setBackgroundColor(pal.bg) }
        root.fitsSystemWindows = true
        val header = LinearLayout(this).apply {
            gravity = Gravity.CENTER_VERTICAL
            setPadding(dp(16), dp(8), dp(8), dp(8))
        }
        header.addView(TextView(this).apply {
            text = getString(R.string.app_name); textSize = 20f; setTextColor(pal.text); typeface = Typeface.DEFAULT_BOLD
        }, LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f))
        header.addView(button("Settings") { settings() })
        root.addView(header)
        content = FrameLayout(this)
        root.addView(content, LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 0, 1f))
        tabBar = LinearLayout(this).apply { setBackgroundColor(pal.surface) }
        listOf("Devices", "Alarms & timers", "History").forEachIndexed { i, label ->
            tabBar.addView(TextView(this).apply {
                text = label; gravity = Gravity.CENTER; textSize = 14f
                setPadding(0, dp(14), 0, dp(14))
                setTextColor(if (i == tab) pal.accent else pal.sub)
                typeface = if (i == tab) Typeface.DEFAULT_BOLD else Typeface.DEFAULT
                setOnClickListener { show(i) }
            }, LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f))
        }
        root.addView(tabBar)
        setContentView(root)
    }

    private fun button(label: String, onClick: () -> Unit) = Button(this).apply {
        text = label; isAllCaps = false; setTextColor(pal.accent)
        setBackgroundColor(android.graphics.Color.TRANSPARENT)
        setOnClickListener { onClick() }
    }

    private fun show(i: Int) {
        tab = i
        for (k in 0 until tabBar.childCount) (tabBar.getChildAt(k) as TextView).apply {
            setTextColor(if (k == i) pal.accent else pal.sub)
            typeface = if (k == i) Typeface.DEFAULT_BOLD else Typeface.DEFAULT
        }
        tick?.let { ui.removeCallbacks(it) }
        content.removeAllViews()
        if (!store.loggedIn) { login(); return }
        when (i) { 0 -> devicesTab(); 1 -> alarmsTab(); else -> historyTab() }
    }

    private fun login() {
        startActivityForResult(Intent(this, LoginActivity::class.java), 1)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == 1 && resultCode == RESULT_OK) { ListWidgetProvider.refreshAll(this); show(tab) }
    }

    private fun settings() {
        val regionNames = Store.regions.toTypedArray()
        AlertDialog.Builder(this).setTitle("Settings").setItems(arrayOf(
            "Theme: " + arrayOf("system", "light", "dark")[store.theme],
            "Region: amazon.${store.tld}",
            if (store.loggedIn) "Sign out" else "Sign in",
        )) { _, which ->
            when (which) {
                0 -> { store.theme = (store.theme + 1) % 3; build(); show(tab) }
                1 -> AlertDialog.Builder(this).setTitle("Amazon region").setItems(regionNames) { _, r ->
                    store.tld = regionNames[r]; store.logout()
                    android.webkit.CookieManager.getInstance().removeAllCookies(null)
                    login()
                }.show()
                2 -> if (store.loggedIn) {
                    store.logout(); android.webkit.CookieManager.getInstance().removeAllCookies(null); show(tab)
                } else login()
            }
        }.show()
    }

    // ---- shared list helpers ----------------------------------------------------------------

    private fun <T> run(work: () -> T, done: (T) -> Unit) {
        io.execute {
            try {
                val r = work()
                ui.post { done(r) }
            } catch (e: AuthException) {
                ui.post { store.logout(); login() }
            } catch (e: Exception) {
                ui.post { toast(e.message ?: e.javaClass.simpleName) }
            }
        }
    }

    private fun toast(m: String) = Toast.makeText(this, m, Toast.LENGTH_LONG).show()

    private fun row(title: String, subtitle: String?, right: View?, onClick: (() -> Unit)? = null): View {
        val r = LinearLayout(this).apply {
            gravity = Gravity.CENTER_VERTICAL
            setPadding(dp(16), dp(12), dp(16), dp(12))
            onClick?.let { c -> setOnClickListener { c() } }
        }
        val col = LinearLayout(this).apply { orientation = LinearLayout.VERTICAL }
        col.addView(TextView(this).apply { text = title; textSize = 16f; setTextColor(pal.text) })
        if (!subtitle.isNullOrBlank()) col.addView(TextView(this).apply { text = subtitle; textSize = 13f; setTextColor(pal.sub) })
        r.addView(col, LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f))
        right?.let { r.addView(it) }
        return r
    }

    private fun scrollList(): Pair<ScrollView, LinearLayout> {
        val box = LinearLayout(this).apply { orientation = LinearLayout.VERTICAL }
        val sv = ScrollView(this).apply { addView(box) }
        return sv to box
    }

    private fun message(text: String) = TextView(this).apply {
        this.text = text; setTextColor(pal.sub); gravity = Gravity.CENTER; setPadding(dp(24), dp(48), dp(24), dp(24))
    }

    // ---- Devices ------------------------------------------------------------------------------

    private fun devicesTab() {
        val (sv, box) = scrollList()
        content.addView(sv)
        box.addView(message("Loading devices..."))
        run({ api.smartHomeDevices() }) { devices ->
            box.removeAllViews()
            if (devices.isEmpty()) box.addView(message("No controllable smart home devices found."))
            devices.forEach { d -> box.addView(deviceRow(d)) }
            ListWidgetProvider.refreshAll(this)
        }
    }

    private fun deviceRow(d: Device): View {
        val sw = Switch(this).apply { isChecked = d.on == true; isEnabled = d.reachable }
        var row: View? = null
        val sub = { if (!d.reachable) "Unreachable" else when (d.on) { true -> "On"; false -> "Off"; null -> "Unknown" } }
        row = row(d.name, sub(), sw)
        sw.setOnClickListener {
            val target = sw.isChecked
            run({ api.setPower(d, target) }) {
                (((row as ViewGroup).getChildAt(0) as ViewGroup).getChildAt(1) as TextView).text = sub()
                ListWidgetProvider.refreshAll(this)
            }
        }
        return row
    }

    // ---- Alarms & timers ------------------------------------------------------------------------

    private fun alarmsTab() {
        val outer = LinearLayout(this).apply { orientation = LinearLayout.VERTICAL }
        val actions = LinearLayout(this).apply { gravity = Gravity.END }
        outer.addView(actions)
        val (sv, box) = scrollList()
        outer.addView(sv, LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 0, 1f))
        content.addView(outer)
        actions.addView(button("+ Alarm") { addAlarm() })
        actions.addView(button("+ Timer") { addTimer() })
        box.addView(message("Loading..."))
        loadNotifications(box)
    }

    private fun loadNotifications(box: LinearLayout) {
        run({ api.notifications() to api.echoDevices() }) { (list, echos) ->
            val names = echos.associate { it.serial to it.name }
            box.removeAllViews()
            if (list.isEmpty()) box.addView(message("No alarms or timers."))
            val fmt = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT)
            list.forEach { n ->
                val isTimer = n.type == "Timer"
                val title = if (isTimer) (n.label.ifBlank { "Timer" } + " · " + remaining(n)) else fmt.format(Date(n.triggerMillis))
                val sub = listOfNotNull(names[n.deviceSerial], n.recurring?.let { "repeats" }, if (n.status == "PAUSED") "paused" else null).joinToString(" · ")
                val sw = Switch(this).apply { isChecked = n.status == "ON" }
                sw.setOnClickListener {
                    val target = if (isTimer) (if (sw.isChecked) "ON" else "PAUSED") else (if (sw.isChecked) "ON" else "OFF")
                    run({ api.setStatus(n, target) }) { }
                }
                box.addView(row(title, sub, sw) {
                    AlertDialog.Builder(this).setMessage("Delete this ${n.type.lowercase()}?")
                        .setPositiveButton("Delete") { _, _ -> run({ api.delete(n) }) { loadNotifications(box) } }
                        .setNegativeButton("Cancel", null).show()
                })
            }
            if (list.any { it.type == "Timer" && it.status == "ON" }) {
                tick = Runnable { loadNotifications(box) }
                ui.postDelayed(tick!!, 30000)
            }
        }
    }

    private fun remaining(n: Notification): String {
        val ms = if (n.status == "ON" && n.triggerMillis > 0) n.triggerMillis - System.currentTimeMillis() else n.remainingMillis
        val s = (ms / 1000).coerceAtLeast(0)
        return String.format("%d:%02d:%02d", s / 3600, s % 3600 / 60, s % 60)
    }

    private fun pickEcho(onPick: (EchoDevice) -> Unit) {
        run({ api.echoDevices() }) { echos ->
            if (echos.isEmpty()) { toast("No Alexa device found"); return@run }
            AlertDialog.Builder(this).setTitle("Device").setItems(echos.map { it.name }.toTypedArray()) { _, i -> onPick(echos[i]) }.show()
        }
    }

    private fun addAlarm() = pickEcho { echo ->
        TimePickerDialog(this, { _, h, m -> run({ api.createAlarm(echo, h, m) }) { show(1) } }, 7, 0, true).show()
    }

    private fun addTimer() = pickEcho { echo ->
        val minutes = EditText(this).apply { hint = "Minutes"; inputType = InputType.TYPE_CLASS_NUMBER }
        val label = EditText(this).apply { hint = "Label (optional)" }
        val form = LinearLayout(this).apply { orientation = LinearLayout.VERTICAL; setPadding(dp(20), dp(8), dp(20), 0); addView(minutes); addView(label) }
        AlertDialog.Builder(this).setTitle("New timer").setView(form).setPositiveButton("Start") { _, _ ->
            val m = minutes.text.toString().toIntOrNull() ?: return@setPositiveButton
            run({ api.createTimer(echo, m * 60, label.text.toString()) }) { show(1) }
        }.setNegativeButton("Cancel", null).show()
    }

    // ---- Voice history ------------------------------------------------------------------------

    private fun historyTab() {
        val (sv, box) = scrollList()
        content.addView(sv)
        box.addView(message("Loading history..."))
        run({ api.history() }) { items ->
            box.removeAllViews()
            if (items.isEmpty()) box.addView(message("No voice history."))
            val fmt = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.SHORT)
            items.forEach {
                val sub = listOf(fmt.format(Date(it.time)), it.device, it.reply).filter { s -> s.isNotBlank() }.joinToString(" · ")
                box.addView(row(it.summary, sub, null))
            }
        }
    }
}
