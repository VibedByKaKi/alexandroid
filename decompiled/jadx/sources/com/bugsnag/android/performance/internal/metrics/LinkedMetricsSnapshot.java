package com.bugsnag.android.performance.internal.metrics;

import androidx.exifinterface.media.ExifInterface;
import com.bugsnag.android.performance.internal.SpanImpl;
import com.bugsnag.android.performance.internal.metrics.LinkedMetricsSnapshot;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00002\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/bugsnag/android/performance/internal/metrics/LinkedMetricsSnapshot;", ExifInterface.GPS_DIRECTION_TRUE, "", "()V", "blocking", "Lcom/bugsnag/android/performance/internal/SpanImpl$Condition;", "next", "Lcom/bugsnag/android/performance/internal/metrics/LinkedMetricsSnapshot;", "target", "Lcom/bugsnag/android/performance/internal/SpanImpl;", "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public class LinkedMetricsSnapshot<T extends LinkedMetricsSnapshot<T>> {

    @JvmField
    @Nullable
    public SpanImpl.Condition blocking;

    @JvmField
    @Nullable
    public T next;

    @JvmField
    @Nullable
    public SpanImpl target;
}
