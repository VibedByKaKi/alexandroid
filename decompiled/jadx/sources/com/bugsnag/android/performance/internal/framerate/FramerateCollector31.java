package com.bugsnag.android.performance.internal.framerate;

import android.view.FrameMetrics;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RequiresApi(31)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0018\u0010\u0005\u001a\u00020\u0006*\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\u00020\u0006*\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/bugsnag/android/performance/internal/framerate/FramerateCollector31;", "Lcom/bugsnag/android/performance/internal/framerate/FramerateCollector;", "metricsContainer", "Lcom/bugsnag/android/performance/internal/framerate/FramerateMetricsContainer;", "(Lcom/bugsnag/android/performance/internal/framerate/FramerateMetricsContainer;)V", "deadline", "", "Landroid/view/FrameMetrics;", "getDeadline", "(Landroid/view/FrameMetrics;)J", "frameStart", "getFrameStart", "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FramerateCollector31 extends FramerateCollector {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FramerateCollector31(@NotNull FramerateMetricsContainer framerateMetricsContainer) {
        super(framerateMetricsContainer);
        framerateMetricsContainer.getClass();
    }

    @Override // com.bugsnag.android.performance.internal.framerate.FramerateCollector
    public long getDeadline(@NotNull FrameMetrics frameMetrics) {
        frameMetrics.getClass();
        return frameMetrics.getMetric(13);
    }

    @Override // com.bugsnag.android.performance.internal.framerate.FramerateCollector
    public long getFrameStart(@NotNull FrameMetrics frameMetrics) {
        frameMetrics.getClass();
        return frameMetrics.getMetric(10);
    }
}
