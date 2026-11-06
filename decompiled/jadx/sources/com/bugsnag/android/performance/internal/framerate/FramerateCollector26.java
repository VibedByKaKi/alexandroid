package com.bugsnag.android.performance.internal.framerate;

import android.view.Choreographer;
import android.view.FrameMetrics;
import android.view.Window;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RequiresApi(26)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0011\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0018\u0010\t\u001a\u00020\n*\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/bugsnag/android/performance/internal/framerate/FramerateCollector26;", "Lcom/bugsnag/android/performance/internal/framerate/FramerateCollector24;", "window", "Landroid/view/Window;", "choreographer", "Landroid/view/Choreographer;", "metricsContainer", "Lcom/bugsnag/android/performance/internal/framerate/FramerateMetricsContainer;", "(Landroid/view/Window;Landroid/view/Choreographer;Lcom/bugsnag/android/performance/internal/framerate/FramerateMetricsContainer;)V", "frameStart", "", "Landroid/view/FrameMetrics;", "getFrameStart", "(Landroid/view/FrameMetrics;)J", "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public class FramerateCollector26 extends FramerateCollector24 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FramerateCollector26(@NotNull Window window, @NotNull Choreographer choreographer, @NotNull FramerateMetricsContainer framerateMetricsContainer) {
        super(window, choreographer, framerateMetricsContainer);
        window.getClass();
        choreographer.getClass();
        framerateMetricsContainer.getClass();
    }

    @Override // com.bugsnag.android.performance.internal.framerate.FramerateCollector24, com.bugsnag.android.performance.internal.framerate.FramerateCollector
    public long getFrameStart(@NotNull FrameMetrics frameMetrics) {
        frameMetrics.getClass();
        return frameMetrics.getMetric(10);
    }
}
