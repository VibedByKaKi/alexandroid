package com.mapbox.common;

import android.os.SystemClock;
import androidx.annotation.RestrictTo;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/mapbox/common/InitializerData;", "", "firstInitElapsedTimeMs", "", "state", "Lcom/mapbox/common/InitializerState;", "currentInitAttempt", "", "(JLcom/mapbox/common/InitializerState;I)V", "getCurrentInitAttempt", "()I", "getFirstInitElapsedTimeMs", "()J", "getState", "()Lcom/mapbox/common/InitializerState;", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes8.dex */
public final /* data */ class InitializerData {
    private final int currentInitAttempt;
    private final long firstInitElapsedTimeMs;

    @NotNull
    private final InitializerState state;

    public /* synthetic */ InitializerData(long j, InitializerState initializerState, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? SystemClock.elapsedRealtime() : j, (i2 & 2) != 0 ? InitializerState.IN_PROGRESS : initializerState, (i2 & 4) != 0 ? 0 : i);
    }

    public static /* synthetic */ InitializerData copy$default(InitializerData initializerData, long j, InitializerState initializerState, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = initializerData.firstInitElapsedTimeMs;
        }
        if ((i2 & 2) != 0) {
            initializerState = initializerData.state;
        }
        if ((i2 & 4) != 0) {
            i = initializerData.currentInitAttempt;
        }
        return initializerData.copy(j, initializerState, i);
    }

    /* renamed from: component1, reason: from getter */
    public final long getFirstInitElapsedTimeMs() {
        return this.firstInitElapsedTimeMs;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final InitializerState getState() {
        return this.state;
    }

    /* renamed from: component3, reason: from getter */
    public final int getCurrentInitAttempt() {
        return this.currentInitAttempt;
    }

    @NotNull
    public final InitializerData copy(long firstInitElapsedTimeMs, @NotNull InitializerState state, int currentInitAttempt) {
        state.getClass();
        return new InitializerData(firstInitElapsedTimeMs, state, currentInitAttempt);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InitializerData)) {
            return false;
        }
        InitializerData initializerData = (InitializerData) other;
        return this.firstInitElapsedTimeMs == initializerData.firstInitElapsedTimeMs && this.state == initializerData.state && this.currentInitAttempt == initializerData.currentInitAttempt;
    }

    public final int getCurrentInitAttempt() {
        return this.currentInitAttempt;
    }

    public final long getFirstInitElapsedTimeMs() {
        return this.firstInitElapsedTimeMs;
    }

    @NotNull
    public final InitializerState getState() {
        return this.state;
    }

    public int hashCode() {
        return Integer.hashCode(this.currentInitAttempt) + ((this.state.hashCode() + (Long.hashCode(this.firstInitElapsedTimeMs) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("InitializerData(firstInitElapsedTimeMs=");
        sb.append(this.firstInitElapsedTimeMs);
        sb.append(", state=");
        sb.append(this.state);
        sb.append(", currentInitAttempt=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, this.currentInitAttempt, ')');
    }

    public InitializerData(long j, @NotNull InitializerState initializerState, int i) {
        initializerState.getClass();
        this.firstInitElapsedTimeMs = j;
        this.state = initializerState;
        this.currentInitAttempt = i;
    }

    public InitializerData() {
        this(0L, null, 0, 7, null);
    }
}
