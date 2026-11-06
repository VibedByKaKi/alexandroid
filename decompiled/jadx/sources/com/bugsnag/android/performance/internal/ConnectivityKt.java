package com.bugsnag.android.performance.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000*B\b\u0000\u0010\u0006\"\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u00072\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0007¨\u0006\f"}, d2 = {"noNetwork", "Lcom/bugsnag/android/performance/internal/ConnectivityStatus;", "unknownNetwork", "shouldAttemptDelivery", "", "Lcom/bugsnag/android/performance/internal/Connectivity;", "NetworkChangeCallback", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "status", "", "bugsnag-android-performance_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ConnectivityKt {

    @NotNull
    private static final ConnectivityStatus noNetwork;

    @NotNull
    private static final ConnectivityStatus unknownNetwork;

    static {
        ConnectionMetering connectionMetering = ConnectionMetering.DISCONNECTED;
        unknownNetwork = new ConnectivityStatus(false, connectionMetering, NetworkType.UNKNOWN, null);
        noNetwork = new ConnectivityStatus(false, connectionMetering, NetworkType.UNAVAILABLE, null);
    }

    public static final boolean shouldAttemptDelivery(@NotNull Connectivity connectivity) {
        connectivity.getClass();
        return connectivity.getConnectivityStatus().getNetworkType() == NetworkType.UNKNOWN || connectivity.getConnectivityStatus().getHasConnection();
    }
}
