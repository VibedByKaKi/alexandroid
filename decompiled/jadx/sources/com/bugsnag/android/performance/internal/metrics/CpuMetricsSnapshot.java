package com.bugsnag.android.performance.internal.metrics;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u0006J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\u0003HÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0010\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/bugsnag/android/performance/internal/metrics/CpuMetricsSnapshot;", "Lcom/bugsnag/android/performance/internal/metrics/LinkedMetricsSnapshot;", "bufferIndex", "", "(I)V", "component1", "component1$bugsnag_android_performance_release", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "toString", "", "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CpuMetricsSnapshot extends LinkedMetricsSnapshot<CpuMetricsSnapshot> {

    @JvmField
    public final int bufferIndex;

    public CpuMetricsSnapshot(int i) {
        this.bufferIndex = i;
    }

    public static /* synthetic */ CpuMetricsSnapshot copy$default(CpuMetricsSnapshot cpuMetricsSnapshot, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = cpuMetricsSnapshot.bufferIndex;
        }
        return cpuMetricsSnapshot.copy(i);
    }

    /* renamed from: component1$bugsnag_android_performance_release, reason: from getter */
    public final int getBufferIndex() {
        return this.bufferIndex;
    }

    @NotNull
    public final CpuMetricsSnapshot copy(int bufferIndex) {
        return new CpuMetricsSnapshot(bufferIndex);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CpuMetricsSnapshot) && this.bufferIndex == ((CpuMetricsSnapshot) other).bufferIndex;
    }

    public int hashCode() {
        return Integer.hashCode(this.bufferIndex);
    }

    @NotNull
    public String toString() {
        return ErrorUtils$$ExternalSyntheticOutline0.m(new StringBuilder("CpuMetricsSnapshot(bufferIndex="), this.bufferIndex, ')');
    }
}
