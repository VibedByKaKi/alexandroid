package net.kaki87.alexandroid

import android.app.Activity
import android.app.PendingIntent
import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.BroadcastReceiver
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.*
import java.util.concurrent.Executors

private val bg = Executors.newSingleThreadExecutor()
const val ACTION_TOGGLE = "net.kaki87.alexandroid.TOGGLE"

private fun stateLabel(d: Device) = if (!d.reachable) "Unreachable" else when (d.on) { true -> "ON"; false -> "OFF"; null -> "?" }
private fun stateColor(d: Device) = if (d.on == true) 0xFF4DC3FF.toInt() else 0xFFB0B0B0.toInt()

private fun toggleIntent(context: Context, entityId: String, on: Boolean?, widgetId: Int): PendingIntent {
    val i = Intent(context, WidgetActionReceiver::class.java).setAction(ACTION_TOGGLE)
        .putExtra("entityId", entityId).putExtra("on", on != true).putExtra("widgetId", widgetId)
        .setData(android.net.Uri.parse("alexandroid://toggle/$entityId/$widgetId"))
    return PendingIntent.getBroadcast(context, 0, i, PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_MUTABLE)
}

/** Scrollable list widget: every device with its state, tap to toggle. */
class ListWidgetProvider : AppWidgetProvider() {
    override fun onUpdate(context: Context, mgr: AppWidgetManager, ids: IntArray) {
        for (id in ids) {
            val rv = RemoteViews(context.packageName, R.layout.widget_list)
            rv.setRemoteAdapter(R.id.list, Intent(context, ListWidgetService::class.java).setData(android.net.Uri.parse("alexandroid://list/$id")))
            rv.setEmptyView(R.id.list, R.id.empty)
            rv.setPendingIntentTemplate(R.id.list, PendingIntent.getBroadcast(context, 1,
                Intent(context, WidgetActionReceiver::class.java).setAction(ACTION_TOGGLE),
                PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_MUTABLE))
            rv.setOnClickPendingIntent(R.id.title, PendingIntent.getActivity(context, 2, Intent(context, MainActivity::class.java), PendingIntent.FLAG_IMMUTABLE))
            mgr.updateAppWidget(id, rv)
        }
        refreshAll(context)
    }

    companion object {
        fun refreshAll(context: Context) {
            val mgr = AppWidgetManager.getInstance(context)
            val ids = mgr.getAppWidgetIds(ComponentName(context, ListWidgetProvider::class.java))
            if (ids.isNotEmpty()) mgr.notifyAppWidgetViewDataChanged(ids, R.id.list)
            ToggleWidgetProvider.refreshAll(context)
        }
    }
}

class ListWidgetService : RemoteViewsService() {
    override fun onGetViewFactory(intent: Intent) = Factory(applicationContext)

    class Factory(private val context: Context) : RemoteViewsFactory {
        private var devices = listOf<Device>()
        override fun onCreate() {}
        override fun onDataSetChanged() {
            val store = Store(context)
            devices = try { if (store.loggedIn) AlexaApi(store).smartHomeDevices() else emptyList() } catch (e: Exception) { devices }
        }
        override fun onDestroy() {}
        override fun getCount() = devices.size
        override fun getViewAt(position: Int): RemoteViews {
            val d = devices[position]
            return RemoteViews(context.packageName, R.layout.widget_item).apply {
                setTextViewText(R.id.name, d.name)
                setTextViewText(R.id.state, stateLabel(d))
                setTextColor(R.id.state, stateColor(d))
                setOnClickFillInIntent(R.id.item, Intent().putExtra("entityId", d.entityId).putExtra("on", d.on != true))
            }
        }
        override fun getLoadingView(): RemoteViews? = null
        override fun getViewTypeCount() = 1
        override fun getItemId(position: Int) = position.toLong()
        override fun hasStableIds() = false
    }
}

/** One-device widget picked in a configuration screen. */
class ToggleWidgetProvider : AppWidgetProvider() {
    override fun onUpdate(context: Context, mgr: AppWidgetManager, ids: IntArray) {
        val store = Store(context)
        bg.execute {
            val devices = try { if (store.loggedIn) AlexaApi(store).smartHomeDevices().associateBy { it.entityId } else emptyMap() } catch (e: Exception) { emptyMap() }
            for (id in ids) {
                val entity = store.widgetDevice(id)
                val d = entity?.let { devices[it] }
                val rv = RemoteViews(context.packageName, R.layout.widget_toggle)
                if (d == null) {
                    rv.setTextViewText(R.id.name, "Alexandroid"); rv.setTextViewText(R.id.state, "Tap to open")
                    rv.setOnClickPendingIntent(R.id.root, PendingIntent.getActivity(context, 2, Intent(context, MainActivity::class.java), PendingIntent.FLAG_IMMUTABLE))
                } else {
                    rv.setTextViewText(R.id.name, d.name)
                    rv.setTextViewText(R.id.state, stateLabel(d))
                    rv.setTextColor(R.id.state, stateColor(d))
                    rv.setOnClickPendingIntent(R.id.root, toggleIntent(context, d.entityId, d.on, id))
                }
                mgr.updateAppWidget(id, rv)
            }
        }
    }

    companion object {
        fun refreshAll(context: Context) {
            val mgr = AppWidgetManager.getInstance(context)
            val ids = mgr.getAppWidgetIds(ComponentName(context, ToggleWidgetProvider::class.java))
            if (ids.isNotEmpty()) ToggleWidgetProvider().onUpdate(context, mgr, ids)
        }
    }
}

class ToggleWidgetConfigActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val widgetId = intent.getIntExtra(AppWidgetManager.EXTRA_APPWIDGET_ID, AppWidgetManager.INVALID_APPWIDGET_ID)
        setResult(RESULT_CANCELED, Intent().putExtra(AppWidgetManager.EXTRA_APPWIDGET_ID, widgetId))
        val store = Store(this)
        val pal = Palette.of(this)
        val list = ListView(this).apply { setBackgroundColor(pal.bg) }
        setContentView(list)
        if (!store.loggedIn) { Toast.makeText(this, "Open Alexandroid and sign in first", Toast.LENGTH_LONG).show(); finish(); return }
        bg.execute {
            val devices = try { AlexaApi(store).smartHomeDevices() } catch (e: Exception) { emptyList() }
            runOnUiThread {
                list.adapter = object : ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, devices.map { it.name }) {
                    override fun getView(position: Int, convertView: android.view.View?, parent: android.view.ViewGroup) =
                        super.getView(position, convertView, parent).also { (it as TextView).setTextColor(pal.text) }
                }
                list.setOnItemClickListener { _, _, pos, _ ->
                    store.setWidgetDevice(widgetId, devices[pos].entityId)
                    ToggleWidgetProvider().onUpdate(this, AppWidgetManager.getInstance(this), intArrayOf(widgetId))
                    setResult(RESULT_OK, Intent().putExtra(AppWidgetManager.EXTRA_APPWIDGET_ID, widgetId))
                    finish()
                }
            }
        }
    }
}

class WidgetActionReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        android.util.Log.i("Alexandroid", "widget action ${intent.action} extras=${intent.extras?.keySet()?.toList()}")
        if (intent.action != ACTION_TOGGLE) return
        val entityId = intent.getStringExtra("entityId") ?: return
        val on = intent.getBooleanExtra("on", true)
        val pending = goAsync()
        bg.execute {
            try {
                val store = Store(context)
                AlexaApi(store).setPower(Device(entityId, "", "", "", null), on)
                android.util.Log.i("Alexandroid", "widget toggled $entityId to $on")
            } catch (e: Exception) {
                android.util.Log.e("Alexandroid", "widget toggle failed", e)
            } finally {
                ListWidgetProvider.refreshAll(context)
                pending.finish()
            }
        }
    }
}
