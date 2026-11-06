package com.bugsnag.android.internal;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u001c\u0010\f\u001a\u00020\u00042\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\u000eH\u0016J\u001c\u0010\u000f\u001a\u00020\u00042\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00110\u000eH\u0016J\u0018\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\nH\u0016J\u0014\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00110\u000eH\u0016¨\u0006\u0016"}, d2 = {"Lcom/bugsnag/android/internal/InternalMetricsNoop;", "Lcom/bugsnag/android/internal/InternalMetrics;", "()V", "notifyAddCallback", "", "callback", "", "notifyRemoveCallback", "setBreadcrumbTrimMetrics", "breadcrumbsRemoved", "", "bytesRemoved", "setCallbackCounts", "newCallbackCounts", "", "setConfigDifferences", "differences", "", "setMetadataTrimMetrics", "stringsTrimmed", "charsRemoved", "toJsonableMap", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes6.dex */
public final class InternalMetricsNoop implements InternalMetrics {
    @Override // com.bugsnag.android.internal.InternalMetrics
    public void notifyAddCallback(@NotNull String callback) {
        callback.getClass();
    }

    @Override // com.bugsnag.android.internal.InternalMetrics
    public void notifyRemoveCallback(@NotNull String callback) {
        callback.getClass();
    }

    @Override // com.bugsnag.android.internal.InternalMetrics
    public void setCallbackCounts(@NotNull Map<String, Integer> newCallbackCounts) {
        newCallbackCounts.getClass();
    }

    @Override // com.bugsnag.android.internal.InternalMetrics
    public void setConfigDifferences(@NotNull Map<String, ? extends Object> differences) {
        differences.getClass();
    }

    @Override // com.bugsnag.android.internal.InternalMetrics
    @NotNull
    public Map<String, Object> toJsonableMap() {
        return MapsKt.emptyMap();
    }

    @Override // com.bugsnag.android.internal.InternalMetrics
    public void setBreadcrumbTrimMetrics(int breadcrumbsRemoved, int bytesRemoved) {
    }

    @Override // com.bugsnag.android.internal.InternalMetrics
    public void setMetadataTrimMetrics(int stringsTrimmed, int charsRemoved) {
    }
}
