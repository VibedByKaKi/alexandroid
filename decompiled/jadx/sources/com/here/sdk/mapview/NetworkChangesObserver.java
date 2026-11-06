package com.here.sdk.mapview;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.util.Log;
import com.reactnativecommunity.netinfo.BroadcastReceiverConnectivityReceiver;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
class NetworkChangesObserver {
    private static final String TAG = "NetworkChangesObserver";
    private static NetworkChangeBroadcastReceiver sBroadcastReceiver;
    private static NetworkChangeCallback sNetworkChangeCallback;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Listener {
        void onConnected();

        void onDisconnected();
    }

    private NetworkChangesObserver() {
    }

    public static void startObserving(Context context, Listener listener) {
        if (sBroadcastReceiver == null && sNetworkChangeCallback == null) {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null) {
                NetworkChangeCallback networkChangeCallback = new NetworkChangeCallback(listener, connectivityManager);
                sNetworkChangeCallback = networkChangeCallback;
                connectivityManager.registerDefaultNetworkCallback(networkChangeCallback);
            } else {
                sBroadcastReceiver = new NetworkChangeBroadcastReceiver(listener);
                context.registerReceiver(sBroadcastReceiver, new IntentFilter(BroadcastReceiverConnectivityReceiver.CONNECTIVITY_ACTION));
            }
        }
    }

    public static void stopObserving(Context context) {
        if (sBroadcastReceiver == null && sNetworkChangeCallback == null) {
            return;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null) {
            try {
                connectivityManager.unregisterNetworkCallback(sNetworkChangeCallback);
            } catch (IllegalArgumentException unused) {
                Log.w(TAG, "Tried to unregister network receiver which has not been registered.");
            }
            sNetworkChangeCallback = null;
        } else {
            try {
                context.unregisterReceiver(sBroadcastReceiver);
            } catch (IllegalArgumentException unused2) {
                Log.w(TAG, "Tried to unregister broadcast receiver which has not been registered.");
            }
            sBroadcastReceiver = null;
        }
    }
}
