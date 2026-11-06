package com.amazon.alexa.alertsca.alertdisplay;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.VisibleForTesting;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.amazon.alexa.alertsca.AlertsIntentFactory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class AlertDisplayReceiver extends BroadcastReceiver {
    private static final IntentFilter ALERT_DISPLAY_RECEIVER_INTENT_FILTER;
    private static final String TAG = "AlertDisplayReceiver";
    private final Context context;
    private final AlertDisplayListener listener;

    static {
        IntentFilter intentFilter = new IntentFilter();
        ALERT_DISPLAY_RECEIVER_INTENT_FILTER = intentFilter;
        intentFilter.addAction(AlertsIntentFactory.Actions.DISMISS_UI);
    }

    public AlertDisplayReceiver(Context context, AlertDisplayListener alertDisplayListener) {
        this.context = context;
        this.listener = alertDisplayListener;
    }

    @VisibleForTesting
    public LocalBroadcastManager getLocalBroadcastManager() {
        return LocalBroadcastManager.getInstance(this.context);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        this.listener.onDismiss(intent.getStringExtra(AlertsIntentFactory.ExtraKeys.ALERT_TOKEN));
    }

    public void register() {
        getLocalBroadcastManager().registerReceiver(this, ALERT_DISPLAY_RECEIVER_INTENT_FILTER);
    }

    public void unregister() {
        getLocalBroadcastManager().unregisterReceiver(this);
    }
}
