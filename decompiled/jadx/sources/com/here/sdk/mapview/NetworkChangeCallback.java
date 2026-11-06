package com.here.sdk.mapview;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.annotation.NonNull;
import com.here.sdk.mapview.NetworkChangesObserver;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
class NetworkChangeCallback extends ConnectivityManager.NetworkCallback {
    NetworkChangesObserver.Listener mObserver;

    public NetworkChangeCallback(NetworkChangesObserver.Listener listener, ConnectivityManager connectivityManager) {
        this.mObserver = listener;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            this.mObserver.onDisconnected();
            return;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        if (networkCapabilities == null || !networkCapabilities.hasCapability(12)) {
            this.mObserver.onDisconnected();
        } else {
            this.mObserver.onConnected();
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(@NonNull Network network) {
        super.onAvailable(network);
        this.mObserver.onConnected();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(@NonNull Network network) {
        super.onLost(network);
        this.mObserver.onDisconnected();
    }
}
