package com.mapbox.common;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
class ConnectionChangeCallback extends ConnectivityManager.NetworkCallback {
    private final WeakReference<Reachability> reachability;

    public ConnectionChangeCallback(@NonNull Reachability reachability) {
        this.reachability = new WeakReference<>(reachability);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$notifyReachability$0() {
        Reachability reachability = this.reachability.get();
        if (reachability != null) {
            reachability.onNetworkChanged();
        }
    }

    private void notifyReachability() {
        boolean z = Looper.myLooper() == Looper.getMainLooper();
        RunloopErrorHandler$$ExternalSyntheticLambda0 runloopErrorHandler$$ExternalSyntheticLambda0 = new RunloopErrorHandler$$ExternalSyntheticLambda0(this, 1);
        if (z) {
            runloopErrorHandler$$ExternalSyntheticLambda0.run();
        } else {
            new Handler(Looper.getMainLooper()).post(runloopErrorHandler$$ExternalSyntheticLambda0);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(@NonNull Network network) {
        notifyReachability();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        notifyReachability();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(@NonNull Network network) {
        notifyReachability();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onUnavailable() {
        notifyReachability();
    }
}
