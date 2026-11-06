package com.amazon.alexa.alertsca.networking;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import com.amazon.alexa.alertsca.AlertsEventBus;
import com.amazon.alexa.alertsca.events.NetworkConnectivityEvent;
import com.reactnativecommunity.netinfo.BroadcastReceiverConnectivityReceiver;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes16.dex */
public class ConnectivityAuthority extends BroadcastReceiver {
    static final IntentFilter NETWORK_CHANGED_INTENT_FILTER = new IntentFilter(BroadcastReceiverConnectivityReceiver.CONNECTIVITY_ACTION);
    private static final String TAG = "ConnectivityAuthority";
    private final AlertsEventBus alertsEventBus;
    private final ConnectivityManager connectivityManager;
    private final Context context;
    private final DefaultNetworkCallback defaultNetworkCallback = new DefaultNetworkCallback(this, 0);

    @Inject
    public ConnectivityAuthority(Context context, ConnectivityManager connectivityManager, AlertsEventBus alertsEventBus) {
        this.context = context;
        this.connectivityManager = connectivityManager;
        this.alertsEventBus = alertsEventBus;
    }

    private boolean hasNetworkConnectivity() {
        NetworkInfo activeNetworkInfo = this.connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendConnectedEvent(boolean z) {
        this.alertsEventBus.postSticky(NetworkConnectivityEvent.create(z));
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (BroadcastReceiverConnectivityReceiver.CONNECTIVITY_ACTION.equals(intent.getAction())) {
            sendConnectedEvent(hasNetworkConnectivity());
        }
    }

    public void register() {
        this.connectivityManager.registerDefaultNetworkCallback(this.defaultNetworkCallback);
    }

    public void unregister() {
        this.connectivityManager.unregisterNetworkCallback(this.defaultNetworkCallback);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class DefaultNetworkCallback extends ConnectivityManager.NetworkCallback {
        private DefaultNetworkCallback() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            super.onAvailable(network);
            ConnectivityAuthority.this.sendConnectedEvent(true);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            ConnectivityAuthority.this.sendConnectedEvent(false);
            super.onLost(network);
        }

        public /* synthetic */ DefaultNetworkCallback(ConnectivityAuthority connectivityAuthority, int i) {
            this();
        }
    }
}
