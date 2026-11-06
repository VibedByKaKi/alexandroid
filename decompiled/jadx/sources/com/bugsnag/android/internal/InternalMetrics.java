package com.bugsnag.android.internal;

import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH&J\u001c\u0010\u000b\u001a\u00020\u00032\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\rH&J\u001c\u0010\u000e\u001a\u00020\u00032\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\rH&J\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH&J\u0014\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\rH&¨\u0006\u0014"}, d2 = {"Lcom/bugsnag/android/internal/InternalMetrics;", "", "notifyAddCallback", "", "callback", "", "notifyRemoveCallback", "setBreadcrumbTrimMetrics", "breadcrumbsRemoved", "", "bytesRemoved", "setCallbackCounts", "newCallbackCounts", "", "setConfigDifferences", "differences", "setMetadataTrimMetrics", "stringsTrimmed", "charsRemoved", "toJsonableMap", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes6.dex */
public interface InternalMetrics {
    void notifyAddCallback(@NotNull String callback);

    void notifyRemoveCallback(@NotNull String callback);

    void setBreadcrumbTrimMetrics(int breadcrumbsRemoved, int bytesRemoved);

    void setCallbackCounts(@NotNull Map<String, Integer> newCallbackCounts);

    void setConfigDifferences(@NotNull Map<String, ? extends Object> differences);

    void setMetadataTrimMetrics(int stringsTrimmed, int charsRemoved);

    @NotNull
    Map<String, Object> toJsonableMap();
}
