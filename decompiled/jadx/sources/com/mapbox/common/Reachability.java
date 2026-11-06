package com.mapbox.common;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.content.ContextCompat;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes8.dex */
public class Reachability implements ReachabilityInterface {

    @Nullable
    private ConnectionChangeCallback callback;
    private final ConnectivityManager connectivityManager;
    private final Context context;
    public int peer;
    public final String TAG = "MapboxReachability";
    public int timeoutInMs = 200;
    private final Map<Long, ReachabilityChanged> listeners = new ConcurrentHashMap();
    private NetworkStatus currentStatus = NetworkStatus.NOT_REACHABLE;
    private boolean publish = false;

    public Reachability(@Nullable String str) {
        Context context = MapboxSDKCommon.INSTANCE.getContext();
        this.context = context;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.connectivityManager = connectivityManager;
        this.callback = null;
        if (connectivityManager == null) {
            Buffer$$ExternalSyntheticBUOutline0.m((Object) "This Android platform doesn't have Connectivity Service");
            throw null;
        }
        if (ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            NetworkRequest build = new NetworkRequest.Builder().addCapability(12).addCapability(16).build();
            Log.info("Application permission for ACCESS_NETWORK_STATE granted", "MapboxReachability");
            ConnectionChangeCallback connectionChangeCallback = new ConnectionChangeCallback(this);
            try {
                connectivityManager.registerNetworkCallback(build, connectionChangeCallback);
                this.callback = connectionChangeCallback;
            } catch (RuntimeException e) {
                Log.error("Failed to subscribe to network connectivity changes: " + e.getMessage(), "MapboxReachability");
            }
        } else {
            Log.warning("Couldn't get application permission for ACCESS_NETWORK_STATE", "MapboxReachability");
        }
        onNetworkChanged();
    }

    public static ReachabilityInterface createPlatformReachability() {
        return new Reachability(null);
    }

    @Override // com.mapbox.common.ReachabilityInterface
    public synchronized long addListener(@NonNull ReachabilityChanged reachabilityChanged) {
        long newId;
        newId = IdGenerator.getNewId();
        this.listeners.put(Long.valueOf(newId), reachabilityChanged);
        reachabilityChanged.run(this.currentStatus);
        this.publish = true;
        return newId;
    }

    @Override // com.mapbox.common.ReachabilityInterface
    @NonNull
    public synchronized NetworkStatus currentNetworkStatus() {
        return this.currentStatus;
    }

    public void finalize() {
        try {
            ConnectionChangeCallback connectionChangeCallback = this.callback;
            if (connectionChangeCallback != null) {
                this.connectivityManager.unregisterNetworkCallback(connectionChangeCallback);
            }
            super.finalize();
        } catch (Throwable th) {
            Log.error(th.toString(), "MapboxReachability");
        }
    }

    @Override // com.mapbox.common.ReachabilityInterface
    public synchronized boolean isReachable() {
        boolean z = false;
        if (ContextCompat.checkSelfPermission(this.context, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            try {
                ConnectivityManager connectivityManager = this.connectivityManager;
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                if (networkCapabilities != null) {
                    if (networkCapabilities.hasCapability(12)) {
                        z = true;
                    }
                }
                return z;
            } catch (RuntimeException e) {
                Log.error("ConnectivityManager interaction failed with exception: " + e.getMessage(), "MapboxReachability");
            }
        }
        return false;
    }

    public synchronized void onNetworkChanged() {
        NetworkStatus networkStatus = this.currentStatus;
        this.currentStatus = NetworkStatus.NOT_REACHABLE;
        if (ContextCompat.checkSelfPermission(this.context, "android.permission.ACCESS_NETWORK_STATE") == -1) {
            Log.warning("Unable to get application permission for ACCESS_NETWORK_STATE", "MapboxReachability");
            return;
        }
        try {
            ConnectivityManager connectivityManager = this.connectivityManager;
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities != null) {
                if (networkCapabilities.hasTransport(1)) {
                    this.currentStatus = NetworkStatus.REACHABLE_VIA_WI_FI;
                } else if (networkCapabilities.hasTransport(0)) {
                    this.currentStatus = NetworkStatus.REACHABLE_VIA_WWAN;
                } else if (networkCapabilities.hasTransport(3)) {
                    this.currentStatus = NetworkStatus.REACHABLE_VIA_ETHERNET;
                }
            }
            if (this.publish && networkStatus != this.currentStatus) {
                Iterator<ReachabilityChanged> it2 = this.listeners.values().iterator();
                while (it2.hasNext()) {
                    it2.next().run(this.currentStatus);
                }
            }
        } catch (RuntimeException e) {
            Log.error("ConnectivityManager interaction failed with exception: " + e.getMessage(), "MapboxReachability");
        }
    }

    @Override // com.mapbox.common.ReachabilityInterface
    public synchronized boolean removeListener(long j) {
        try {
            this.listeners.remove(Long.valueOf(j));
            if (this.listeners.isEmpty()) {
                this.publish = false;
            }
        } catch (Exception unused) {
            return false;
        }
        return true;
    }
}
