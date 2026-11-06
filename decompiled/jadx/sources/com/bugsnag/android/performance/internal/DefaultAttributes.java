package com.bugsnag.android.performance.internal;

import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\tJ0\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/bugsnag/android/performance/internal/DefaultAttributes;", "", "networkType", "Lcom/bugsnag/android/performance/internal/NetworkType;", "networkSubType", "", "isInForeground", "", "(Lcom/bugsnag/android/performance/internal/NetworkType;Ljava/lang/String;Ljava/lang/Boolean;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getNetworkSubType", "()Ljava/lang/String;", "getNetworkType", "()Lcom/bugsnag/android/performance/internal/NetworkType;", "component1", "component2", "component3", "copy", "(Lcom/bugsnag/android/performance/internal/NetworkType;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/bugsnag/android/performance/internal/DefaultAttributes;", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class DefaultAttributes {

    @Nullable
    private final Boolean isInForeground;

    @Nullable
    private final String networkSubType;

    @NotNull
    private final NetworkType networkType;

    public DefaultAttributes(@NotNull NetworkType networkType, @Nullable String str, @Nullable Boolean bool) {
        networkType.getClass();
        this.networkType = networkType;
        this.networkSubType = str;
        this.isInForeground = bool;
    }

    public static /* synthetic */ DefaultAttributes copy$default(DefaultAttributes defaultAttributes, NetworkType networkType, String str, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            networkType = defaultAttributes.networkType;
        }
        if ((i & 2) != 0) {
            str = defaultAttributes.networkSubType;
        }
        if ((i & 4) != 0) {
            bool = defaultAttributes.isInForeground;
        }
        return defaultAttributes.copy(networkType, str, bool);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final NetworkType getNetworkType() {
        return this.networkType;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getNetworkSubType() {
        return this.networkSubType;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Boolean getIsInForeground() {
        return this.isInForeground;
    }

    @NotNull
    public final DefaultAttributes copy(@NotNull NetworkType networkType, @Nullable String networkSubType, @Nullable Boolean isInForeground) {
        networkType.getClass();
        return new DefaultAttributes(networkType, networkSubType, isInForeground);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DefaultAttributes)) {
            return false;
        }
        DefaultAttributes defaultAttributes = (DefaultAttributes) other;
        return this.networkType == defaultAttributes.networkType && Intrinsics.areEqual(this.networkSubType, defaultAttributes.networkSubType) && Intrinsics.areEqual(this.isInForeground, defaultAttributes.isInForeground);
    }

    @Nullable
    public final String getNetworkSubType() {
        return this.networkSubType;
    }

    @NotNull
    public final NetworkType getNetworkType() {
        return this.networkType;
    }

    public int hashCode() {
        int hashCode = this.networkType.hashCode() * 31;
        String str = this.networkSubType;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isInForeground;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @Nullable
    public final Boolean isInForeground() {
        return this.isInForeground;
    }

    @NotNull
    public String toString() {
        return "DefaultAttributes(networkType=" + this.networkType + ", networkSubType=" + this.networkSubType + ", isInForeground=" + this.isInForeground + ')';
    }
}
