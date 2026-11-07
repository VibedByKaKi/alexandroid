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
        AlertDialog.Builder(this).setTitle("Settings").setItems(arrayOf(
            "Theme: " + arrayOf("system", "light", "dark")[store.theme],
            if (store.loggedIn) "Sign out" else "Sign in",
        )) { _, which ->
            when (which) {
                0 -> { store.theme = (store.theme + 1) % 3; build(); show(tab) }
                1 -> if (store.loggedIn) {
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
                android.util.Log.e("Alexandroid", "request failed", e)
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

    private fun pill(on: Boolean?, enabled: Boolean): TextView = TextView(this).apply {
        text = if (!enabled) "Offline" else when (on) { true -> "On"; false -> "Off"; null -> "?" }
        textSize = 14f
        typeface = Typeface.DEFAULT_BOLD
        gravity = Gravity.CENTER
        minWidth = dp(64)
        setPadding(dp(16), dp(8), dp(16), dp(8))
        val active = enabled && on == true
        setTextColor(if (active) android.graphics.Color.WHITE else pal.sub)
        background = android.graphics.drawable.GradientDrawable().apply {
            cornerRadius = dp(20).toFloat()
            setColor(if (active) pal.accentFill else pal.surface)
        }
    }

    private fun deviceRow(d: Device): View {
        var pill = pill(d.on, d.reachable)
        val holder = FrameLayout(this)
        holder.addView(pill)
        val r = row(d.name, null, holder)
        if (d.reachable) holder.setOnClickListener {
            val target = d.on != true
            holder.isEnabled = false
            holder.alpha = 0.5f
            io.execute {
                try {
                    api.setPower(d, target)
                    ui.post { holder.removeAllViews(); pill = pill(d.on, true); holder.addView(pill); holder.alpha = 1f; holder.isEnabled = true; ListWidgetProvider.refreshAll(this) }
                } catch (e: AuthException) {
                    ui.post { store.logout(); login() }
                } catch (e: Exception) {
                    android.util.Log.e("Alexandroid", "toggle failed", e)
                    ui.post { holder.alpha = 1f; holder.isEnabled = true; toast(e.message ?: "Toggle failed") }
                }
            }
        }
        return r
    }

    // ---- Alarms & timers ------------------------------------------------------------------------

    private class TimerView(val n: Notification, val text: TextView, val label: String, val fetchedAt: Long)

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

    private fun smallButton(label: String, color: Int, onClick: () -> Unit) = TextView(this).apply {
        text = label; textSize = 14f; setTextColor(color); typeface = Typeface.DEFAULT_BOLD
        setPadding(dp(10), dp(8), dp(10), dp(8))
        setOnClickListener { onClick() }
    }

    private fun loadNotifications(box: LinearLayout) {
        tick?.let { ui.removeCallbacks(it) }
        run({ api.notifications() to api.echoDevices() }) { (list, echos) ->
            val names = echos.associate { it.serial to it.name }
            val fetchedAt = System.currentTimeMillis()
            box.removeAllViews()
            if (list.isEmpty()) box.addView(message("No alarms or timers."))
            val timers = ArrayList<TimerView>()
            val reload = { loadNotifications(box) }
            list.forEach { n ->
                val where = names[n.deviceSerial].orEmpty()
                if (n.type == "Timer") {
                    val paused = n.status == "PAUSED"
                    val title = TextView(this).apply { textSize = 22f; setTextColor(pal.text); typeface = Typeface.DEFAULT_BOLD }
                    val buttons = LinearLayout(this).apply { gravity = Gravity.CENTER_VERTICAL }
                    buttons.addView(smallButton(if (paused) "Resume" else "Pause", pal.accent) {
                        run({ api.setStatus(n, if (paused) "ON" else "PAUSED") }) { reload() }
                    })
                    buttons.addView(smallButton("Delete", pal.danger) { confirmDelete(n) { run({ api.delete(n) }) { reload() } } })
                    val r = row("", listOf(n.label.ifBlank { "Timer" }, where, if (paused) "paused" else "").filter { it.isNotBlank() }.joinToString(" · "), buttons)
                    val col = (r as ViewGroup).getChildAt(0) as ViewGroup
                    col.removeViewAt(0); col.addView(title, 0)
                    box.addView(r)
                    timers += TimerView(n, title, "", fetchedAt)
                } else {
                    val days = Recurrence.parse(n.recurring)
                    val sw = Switch(this).apply { isChecked = n.status == "ON" }
                    sw.setOnClickListener { run({ api.setStatus(n, if (sw.isChecked) "ON" else "OFF") }) { } }
                    val buttons = LinearLayout(this).apply { gravity = Gravity.CENTER_VERTICAL }
                    buttons.addView(smallButton("Delete", pal.danger) { confirmDelete(n) { run({ api.delete(n) }) { reload() } } })
                    buttons.addView(sw)
                    val r = row(n.clock, listOf(where, Recurrence.describe(days)).filter { it.isNotBlank() }.joinToString(" · "), buttons) { editAlarm(n, days) }
                    val title = ((r as ViewGroup).getChildAt(0) as ViewGroup).getChildAt(0) as TextView
                    title.textSize = 22f; title.typeface = Typeface.DEFAULT_BOLD
                    box.addView(r)
                }
            }
            if (timers.isNotEmpty()) {
                var ticks = 0
                val t = object : Runnable {
                    override fun run() {
                        ticks++
                        var expired = false
                        val now = System.currentTimeMillis()
                        timers.forEach { tv ->
                            val ms = if (tv.n.status == "ON") tv.n.remainingMillis - (now - tv.fetchedAt) else tv.n.remainingMillis
                            if (tv.n.status == "ON" && ms <= 0) expired = true
                            tv.text.text = clock(ms)
                        }
                        if (expired || ticks % 30 == 0) loadNotifications(box) else ui.postDelayed(this, 1000)
                    }
                }
                tick = t
                t.run()
            }
        }
    }

    private fun confirmDelete(n: Notification, go: () -> Unit) {
        val what = if (n.type == "Timer") "timer" else "${n.clock} alarm"
        AlertDialog.Builder(this).setMessage("Delete this $what?").setPositiveButton("Delete") { _, _ -> go() }.setNegativeButton("Cancel", null).show()
    }

    private fun clock(ms: Long): String {
        val s = (ms / 1000).coerceAtLeast(0)
        return if (s >= 3600) String.format("%d:%02d:%02d", s / 3600, s % 3600 / 60, s % 60) else String.format("%d:%02d", s / 60, s % 60)
    }

    private fun pickEcho(onPick: (EchoDevice) -> Unit) {
        run({ api.echoDevices() }) { echos ->
            if (echos.isEmpty()) { toast("No Alexa device found"); return@run }
            AlertDialog.Builder(this).setTitle("Device").setItems(echos.map { it.name }.toTypedArray()) { _, i -> onPick(echos[i]) }.show()
        }
    }

    private fun alarmDialog(title: String, hour: Int, minute: Int, days: Set<Int>, onSave: (Int, Int, Set<Int>) -> Unit) {
        val light = pal.bg == android.graphics.Color.WHITE
        val holo = android.view.ContextThemeWrapper(this, if (light) android.R.style.Theme_Holo_Light_Dialog else android.R.style.Theme_Holo_Dialog)
        val picker = TimePicker(holo).apply { setIs24HourView(true); this.hour = hour; this.minute = minute }
        val chosen = days.toMutableSet()
        val chips = LinearLayout(this).apply { gravity = Gravity.CENTER; setPadding(0, dp(8), 0, dp(8)) }
        for (d in 1..7) {
            val chip = TextView(this).apply {
                text = Recurrence.dayName(d).take(2); gravity = Gravity.CENTER; textSize = 13f
            }
            val paint = {
                val on = d in chosen
                chip.setTextColor(if (on) android.graphics.Color.WHITE else pal.sub)
                chip.background = android.graphics.drawable.GradientDrawable().apply {
                    shape = android.graphics.drawable.GradientDrawable.OVAL; setColor(if (on) pal.accentFill else pal.surface)
                }
            }
            paint()
            chip.setOnClickListener { if (!chosen.add(d)) chosen.remove(d); paint() }
            chips.addView(chip, LinearLayout.LayoutParams(dp(38), dp(38)).apply { setMargins(dp(3), 0, dp(3), 0) })
        }
        val form = LinearLayout(this).apply { orientation = LinearLayout.VERTICAL; addView(picker); addView(chips) }
        AlertDialog.Builder(this).setTitle(title).setView(ScrollView(this).apply { addView(form) })
            .setPositiveButton("Save") { _, _ ->
                picker.clearFocus()
                onSave(picker.hour, picker.minute, chosen.toSet())
            }.setNegativeButton("Cancel", null).show()
    }

    private fun addAlarm() = pickEcho { echo ->
        alarmDialog("New alarm", 7, 0, emptySet()) { h, m, days -> run({ api.createAlarm(echo, h, m, days) }) { show(1) } }
    }

    private fun editAlarm(n: Notification, days: Set<Int>) {
        val h = n.clock.substringBefore(':').toIntOrNull() ?: 7
        val m = n.clock.substringAfter(':').toIntOrNull() ?: 0
        alarmDialog("Edit alarm", h, m, days) { nh, nm, nd -> run({ api.updateAlarm(n, nh, nm, nd) }) { show(1) } }
    }

    private fun addTimer() = pickEcho { echo ->
        val minutes = EditText(this).apply { hint = "Minutes"; inputType = InputType.TYPE_CLASS_NUMBER }
        val form = LinearLayout(this).apply { orientation = LinearLayout.VERTICAL; setPadding(dp(20), dp(8), dp(20), 0); addView(minutes) }
        AlertDialog.Builder(this).setTitle("New timer").setView(form).setPositiveButton("Start") { _, _ ->
            val m = minutes.text.toString().toIntOrNull() ?: return@setPositiveButton
            run({ api.createTimer(echo, m) }) { show(1) }
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
            val fmt = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM)
            items.forEach {
                val sub = listOf(fmt.format(Date(it.time)), it.device, it.reply).filter { s -> s.isNotBlank() }.joinToString(" · ")
                box.addView(row(it.summary, sub, null))
            }
        }
    }
}
