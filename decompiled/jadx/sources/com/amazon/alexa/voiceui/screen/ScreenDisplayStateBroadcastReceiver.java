package com.amazon.alexa.voiceui.screen;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ScreenDisplayStateBroadcastReceiver extends BroadcastReceiver {
    private static final IntentFilter INTENT_FILTER;
    private static final String TAG = "ScreenDisplayStateBroadcastReceiver";
    private final Context context;
    private AtomicBoolean isRegistered = new AtomicBoolean(false);
    private final DisplayStateChangeListener listener;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface DisplayStateChangeListener {
        void onScreenEvent(boolean z);
    }

    static {
        IntentFilter intentFilter = new IntentFilter();
        INTENT_FILTER = intentFilter;
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
    }

    public ScreenDisplayStateBroadcastReceiver(Context context, DisplayStateChangeListener displayStateChangeListener) {
        this.context = context;
        this.listener = displayStateChangeListener;
    }

    public void deregister() {
        if (this.isRegistered.compareAndSet(true, false)) {
            this.context.unregisterReceiver(this);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if ("android.intent.action.SCREEN_OFF".equals(action)) {
            Log.i(TAG, "Screen is off");
            this.listener.onScreenEvent(false);
        } else if ("android.intent.action.SCREEN_ON".equals(action)) {
            Log.i(TAG, "Screen is on");
            this.listener.onScreenEvent(true);
        }
    }

    public void register() {
        if (this.isRegistered.compareAndSet(false, true)) {
            int i = Build.VERSION.SDK_INT;
            Context context = this.context;
            if (i >= 34) {
                context.registerReceiver(this, INTENT_FILTER, 4);
            } else {
                context.registerReceiver(this, INTENT_FILTER);
            }
        }
    }
}
