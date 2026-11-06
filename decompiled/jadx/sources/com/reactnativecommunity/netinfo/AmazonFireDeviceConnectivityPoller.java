package com.reactnativecommunity.netinfo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class AmazonFireDeviceConnectivityPoller {
    private static final String ACTION_CONNECTIVITY_CHECK = "com.amazon.tv.networkmonitor.CONNECTIVITY_CHECK";
    private static final String ACTION_INTERNET_DOWN = "com.amazon.tv.networkmonitor.INTERNET_DOWN";
    private static final String ACTION_INTERNET_UP = "com.amazon.tv.networkmonitor.INTERNET_UP";
    private static final long POLLING_INTERVAL_MS = 10000;
    private final ConnectivityChangedCallback callback;
    private final Runnable checker;
    private final Context context;
    private Handler handler;
    private boolean pollerRunning = false;
    private final Receiver receiver;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ConnectivityChangedCallback {
        void onAmazonFireDeviceConnectivityChanged(boolean z);
    }

    public AmazonFireDeviceConnectivityPoller(Context context, ConnectivityChangedCallback connectivityChangedCallback) {
        int i = 0;
        this.receiver = new Receiver(this, i);
        this.checker = new PollerTask(this, i);
        this.context = context;
        this.callback = connectivityChangedCallback;
    }

    private boolean isFireOsDevice() {
        if (!Build.MANUFACTURER.equals("Amazon")) {
            return false;
        }
        String str = Build.MODEL;
        return str.startsWith("AF") || str.startsWith("KF");
    }

    private void registerReceiver() {
        if (this.receiver.registered) {
            return;
        }
        NetInfoUtils.compatRegisterReceiver(this.context, this.receiver, TableInfo$$ExternalSyntheticOutline0.m(ACTION_INTERNET_DOWN, ACTION_INTERNET_UP), false);
        this.receiver.registered = true;
    }

    private void startPoller() {
        if (this.pollerRunning) {
            return;
        }
        Handler handler = new Handler();
        this.handler = handler;
        this.pollerRunning = true;
        handler.post(this.checker);
    }

    private void stopPoller() {
        if (this.pollerRunning) {
            this.pollerRunning = false;
            this.handler.removeCallbacksAndMessages(null);
            this.handler = null;
        }
    }

    private void unregisterReceiver() {
        Receiver receiver = this.receiver;
        if (receiver.registered) {
            this.context.unregisterReceiver(receiver);
            this.receiver.registered = false;
        }
    }

    public void register() {
        if (isFireOsDevice()) {
            registerReceiver();
            startPoller();
        }
    }

    public void unregister() {
        if (isFireOsDevice()) {
            stopPoller();
            unregisterReceiver();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class PollerTask implements Runnable {
        private PollerTask() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AmazonFireDeviceConnectivityPoller.this.pollerRunning) {
                AmazonFireDeviceConnectivityPoller.this.context.sendBroadcast(new Intent(AmazonFireDeviceConnectivityPoller.ACTION_CONNECTIVITY_CHECK));
                AmazonFireDeviceConnectivityPoller.this.handler.postDelayed(AmazonFireDeviceConnectivityPoller.this.checker, 10000L);
            }
        }

        public /* synthetic */ PollerTask(AmazonFireDeviceConnectivityPoller amazonFireDeviceConnectivityPoller, int i) {
            this();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class Receiver extends BroadcastReceiver {
        private Boolean lastIsConnected;
        boolean registered;

        private Receiver() {
            this.registered = false;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            boolean z;
            String action = intent == null ? null : intent.getAction();
            if (AmazonFireDeviceConnectivityPoller.ACTION_INTERNET_DOWN.equals(action)) {
                z = false;
            } else if (!AmazonFireDeviceConnectivityPoller.ACTION_INTERNET_UP.equals(action)) {
                return;
            } else {
                z = true;
            }
            Boolean bool = this.lastIsConnected;
            if (bool == null || bool.booleanValue() != z) {
                this.lastIsConnected = Boolean.valueOf(z);
                AmazonFireDeviceConnectivityPoller.this.callback.onAmazonFireDeviceConnectivityChanged(z);
            }
        }

        public /* synthetic */ Receiver(AmazonFireDeviceConnectivityPoller amazonFireDeviceConnectivityPoller, int i) {
            this();
        }
    }
}
