package com.bugsnag.android.performance.internal;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J3\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/bugsnag/android/performance/internal/ConnectivityStatus;", "", "hasConnection", "", "metering", "Lcom/bugsnag/android/performance/internal/ConnectionMetering;", "networkType", "Lcom/bugsnag/android/performance/internal/NetworkType;", "networkSubType", "", "(ZLcom/bugsnag/android/performance/internal/ConnectionMetering;Lcom/bugsnag/android/performance/internal/NetworkType;Ljava/lang/String;)V", "getHasConnection", "()Z", "getMetering", "()Lcom/bugsnag/android/performance/internal/ConnectionMetering;", "getNetworkSubType", "()Ljava/lang/String;", "getNetworkType", "()Lcom/bugsnag/android/performance/internal/NetworkType;", "component1", "component2", "component3", "component4", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ConnectivityStatus {
    private final boolean hasConnection;

    @NotNull
    private final ConnectionMetering metering;

    @Nullable
    private final String networkSubType;

    @NotNull
    private final NetworkType networkType;

    public ConnectivityStatus(boolean z, @NotNull ConnectionMetering connectionMetering, @NotNull NetworkType networkType, @Nullable String str) {
        connectionMetering.getClass();
        networkType.getClass();
        this.hasConnection = z;
        this.metering = connectionMetering;
        this.networkType = networkType;
        this.networkSubType = str;
    }

    public static /* synthetic */ ConnectivityStatus copy$default(ConnectivityStatus connectivityStatus, boolean z, ConnectionMetering connectionMetering, NetworkType networkType, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = connectivityStatus.hasConnection;
        }
        if ((i & 2) != 0) {
            connectionMetering = connectivityStatus.metering;
        }
        if ((i & 4) != 0) {
            networkType = connectivityStatus.networkType;
        }
        if ((i & 8) != 0) {
            str = connectivityStatus.networkSubType;
        }
        return connectivityStatus.copy(z, connectionMetering, networkType, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getHasConnection() {
        return this.hasConnection;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ConnectionMetering getMetering() {
        return this.metering;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final NetworkType getNetworkType() {
        return this.networkType;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getNetworkSubType() {
        return this.networkSubType;
    }

    @NotNull
    public final ConnectivityStatus copy(boolean hasConnection, @NotNull ConnectionMetering metering, @NotNull NetworkType networkType, @Nullable String networkSubType) {
        metering.getClass();
        networkType.getClass();
        return new ConnectivityStatus(hasConnection, metering, networkType, networkSubType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConnectivityStatus)) {
            return false;
        }
        ConnectivityStatus connectivityStatus = (ConnectivityStatus) other;
        return this.hasConnection == connectivityStatus.hasConnection && this.metering == connectivityStatus.metering && this.networkType == connectivityStatus.networkType && Intrinsics.areEqual(this.networkSubType, connectivityStatus.networkSubType);
    }

    public final boolean getHasConnection() {
        return this.hasConnection;
    }

    @NotNull
    public final ConnectionMetering getMetering() {
        return this.metering;
    }

    @Nullable
    public final String getNetworkSubType() {
        return this.networkSubType;
    }

    @NotNull
    public final NetworkType getNetworkType() {
        return this.networkType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public int hashCode() {
        boolean z = this.hasConnection;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int hashCode = (this.networkType.hashCode() + ((this.metering.hashCode() + (r0 * 31)) * 31)) * 31;
        String str = this.networkSubType;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("ConnectivityStatus(hasConnection=");
        sb.append(this.hasConnection);
        sb.append(", metering=");
        sb.append(this.metering);
        sb.append(", networkType=");
        sb.append(this.networkType);
        sb.append(", networkSubType=");
        return ArcMode$$ExternalSyntheticOutline0.m(')', this.networkSubType, sb);
    }
}
