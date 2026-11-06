package com.bugsnag.android.performance.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/bugsnag/android/performance/internal/UnknownConnectivity;", "Lcom/bugsnag/android/performance/internal/Connectivity;", "()V", "connectivityStatus", "Lcom/bugsnag/android/performance/internal/ConnectivityStatus;", "getConnectivityStatus", "()Lcom/bugsnag/android/performance/internal/ConnectivityStatus;", "registerForNetworkChanges", "", "unregisterForNetworkChanges", "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UnknownConnectivity implements Connectivity {

    @NotNull
    public static final UnknownConnectivity INSTANCE = new UnknownConnectivity();

    private UnknownConnectivity() {
    }

    @Override // com.bugsnag.android.performance.internal.Connectivity
    @NotNull
    public ConnectivityStatus getConnectivityStatus() {
        ConnectivityStatus connectivityStatus;
        connectivityStatus = ConnectivityKt.unknownNetwork;
        return connectivityStatus;
    }

    @Override // com.bugsnag.android.performance.internal.Connectivity
    public void registerForNetworkChanges() {
    }

    @Override // com.bugsnag.android.performance.internal.Connectivity
    public void unregisterForNetworkChanges() {
    }
}
