package com.amazon.alexa.visualid.service;

import android.annotation.TargetApi;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.amazon.alexa.visualid.util.NotificationHelper;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class VisualIDRTCSCService extends Service {
    public static final String ACTION_STOP = "com.amazon.alexa.visualid.service.cvvid.stop";
    public static final String NOTIFICATION_CHANNEL_ID = "com.amazon.alexa.visualid.service.cvvid";
    public static final int NOTIFICATION_ID = 1;
    private static final String TAG = "VisualIDRTCSCService";
    private final IBinder binder = new LocalBinder();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class LocalBinder extends Binder {
        public LocalBinder() {
        }

        public VisualIDRTCSCService getService() {
            return VisualIDRTCSCService.this;
        }
    }

    private void startForegroundForRTC() {
        Log.i(TAG, "Starting foreground for RTC ...");
        int i = getApplicationContext().getApplicationInfo().targetSdkVersion;
        NotificationHelper notificationHelper = new NotificationHelper();
        try {
            if (i >= 34) {
                startForegroundSdk34();
            } else {
                startForeground(1, notificationHelper.build(this, NOTIFICATION_CHANNEL_ID, "CVVID Service"));
            }
        } catch (Exception unused) {
        }
    }

    @TargetApi(29)
    private void startForegroundSdk34() {
        try {
            startForeground(1, new NotificationHelper().build(this, NOTIFICATION_CHANNEL_ID, "CVVID Service"), 128);
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.binder;
    }

    @Override // android.app.Service
    public void onDestroy() {
        stopForeground(true);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        String str = TAG;
        Log.i(str, "Received start id " + i2 + ": " + intent);
        if (intent == null) {
            return 2;
        }
        String action = intent.getAction();
        if (action == null) {
            Log.i(str, "Intent action does not exist");
            return 2;
        }
        if (action.equals("com.amazon.rtcsessioncontroller.ACTION_START_APPCLIENT")) {
            startForegroundForRTC();
            return 2;
        }
        if (!action.equals(ACTION_STOP)) {
            Log.e(str, "Received unknown intent action: ".concat(action));
            return 2;
        }
        Log.i(str, "Received intent for stop service");
        stopForeground(true);
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        return true;
    }

    @Override // android.app.Service
    public void onCreate() {
    }
}
