package com.bugsnag.android.performance.internal.framerate;

import android.os.SystemClock;
import android.view.FrameMetrics;
import android.view.Window;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RequiresApi(24)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b!\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006H\u0002J \u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u00020\u0006*\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\u0006*\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0018\u0010\r\u001a\u00020\u000e*\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000fR\u0018\u0010\u0010\u001a\u00020\u0006*\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/bugsnag/android/performance/internal/framerate/FramerateCollector;", "Landroid/view/Window$OnFrameMetricsAvailableListener;", "metricsContainer", "Lcom/bugsnag/android/performance/internal/framerate/FramerateMetricsContainer;", "(Lcom/bugsnag/android/performance/internal/framerate/FramerateMetricsContainer;)V", "previousFrameTime", "", "deadline", "Landroid/view/FrameMetrics;", "getDeadline", "(Landroid/view/FrameMetrics;)J", "frameStart", "getFrameStart", "isFirstFrame", "", "(Landroid/view/FrameMetrics;)Z", "totalDuration", "getTotalDuration", "frameTimestampToClockTime", "vsyncTime", "onFrameMetricsAvailable", "", "window", "Landroid/view/Window;", "frameMetrics", "dropCountSinceLastInvocation", "", "Companion", "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class FramerateCollector implements Window.OnFrameMetricsAvailableListener {
    public static final float FPS_60 = 60.0f;
    public static final float FPS_MAX = 200.0f;
    public static final float FPS_MIN = 30.0f;
    public static final long FROZEN_FRAME_TIME = 700000000;
    public static final long NANOS_IN_MS = 1000000;
    public static final long ONE_SECOND_MS = 1000;
    public static final double SLOW_FRAME_ADJUSTMENT = 1.05d;

    @NotNull
    private final FramerateMetricsContainer metricsContainer;
    private long previousFrameTime;

    public FramerateCollector(@NotNull FramerateMetricsContainer framerateMetricsContainer) {
        framerateMetricsContainer.getClass();
        this.metricsContainer = framerateMetricsContainer;
    }

    private final long frameTimestampToClockTime(long vsyncTime) {
        return (vsyncTime - System.nanoTime()) + SystemClock.elapsedRealtimeNanos();
    }

    public abstract long getDeadline(@NotNull FrameMetrics frameMetrics);

    public abstract long getFrameStart(@NotNull FrameMetrics frameMetrics);

    public long getTotalDuration(@NotNull FrameMetrics frameMetrics) {
        frameMetrics.getClass();
        return frameMetrics.getMetric(5) + frameMetrics.getMetric(4) + frameMetrics.getMetric(3) + frameMetrics.getMetric(2) + frameMetrics.getMetric(1) + frameMetrics.getMetric(0);
    }

    public boolean isFirstFrame(@NotNull FrameMetrics frameMetrics) {
        frameMetrics.getClass();
        return frameMetrics.getMetric(9) != 0;
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public void onFrameMetricsAvailable(@NotNull Window window, @NotNull FrameMetrics frameMetrics, int dropCountSinceLastInvocation) {
        window.getClass();
        frameMetrics.getClass();
        long frameStart = getFrameStart(frameMetrics);
        if (frameStart < this.previousFrameTime) {
            return;
        }
        if (isFirstFrame(frameMetrics)) {
            this.previousFrameTime = frameStart;
            return;
        }
        FramerateMetricsContainer framerateMetricsContainer = this.metricsContainer;
        framerateMetricsContainer.setTotalMetricsCount(framerateMetricsContainer.getTotalMetricsCount() + 1);
        long totalDuration = getTotalDuration(frameMetrics);
        if (totalDuration >= ((long) (getDeadline(frameMetrics) * 1.05d))) {
            if (totalDuration >= FROZEN_FRAME_TIME) {
                long frameTimestampToClockTime = frameTimestampToClockTime(frameStart);
                this.metricsContainer.addFrozenFrame(frameTimestampToClockTime - totalDuration, frameTimestampToClockTime);
            } else {
                FramerateMetricsContainer framerateMetricsContainer2 = this.metricsContainer;
                framerateMetricsContainer2.setSlowFrameCount(framerateMetricsContainer2.getSlowFrameCount() + 1);
            }
        }
        FramerateMetricsContainer framerateMetricsContainer3 = this.metricsContainer;
        framerateMetricsContainer3.setTotalFrameCount(framerateMetricsContainer3.getTotalFrameCount() + dropCountSinceLastInvocation + 1);
        this.previousFrameTime = frameStart + totalDuration;
    }
}
