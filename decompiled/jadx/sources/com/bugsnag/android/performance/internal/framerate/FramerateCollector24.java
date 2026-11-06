package com.bugsnag.android.performance.internal.framerate;

import android.view.Choreographer;
import android.view.FrameMetrics;
import android.view.Window;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RequiresApi(24)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0011\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\r\u001a\u00020\u000e*\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0012\u001a\u00020\u000e*\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/bugsnag/android/performance/internal/framerate/FramerateCollector24;", "Lcom/bugsnag/android/performance/internal/framerate/FramerateCollector;", "window", "Landroid/view/Window;", "choreographer", "Landroid/view/Choreographer;", "metricsContainer", "Lcom/bugsnag/android/performance/internal/framerate/FramerateMetricsContainer;", "(Landroid/view/Window;Landroid/view/Choreographer;Lcom/bugsnag/android/performance/internal/framerate/FramerateMetricsContainer;)V", "currentRefreshRate", "", "getCurrentRefreshRate", "()F", "deadline", "", "Landroid/view/FrameMetrics;", "getDeadline", "(Landroid/view/FrameMetrics;)J", "frameStart", "getFrameStart", "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public class FramerateCollector24 extends FramerateCollector {

    @NotNull
    private final Choreographer choreographer;

    @NotNull
    private final Window window;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FramerateCollector24(@NotNull Window window, @NotNull Choreographer choreographer, @NotNull FramerateMetricsContainer framerateMetricsContainer) {
        super(framerateMetricsContainer);
        window.getClass();
        choreographer.getClass();
        framerateMetricsContainer.getClass();
        this.window = window;
        this.choreographer = choreographer;
    }

    private final float getCurrentRefreshRate() {
        float refreshRate = this.window.getWindowManager().getDefaultDisplay().getRefreshRate();
        if (refreshRate < 30.0f || refreshRate > 200.0f) {
            return 60.0f;
        }
        return refreshRate;
    }

    @Override // com.bugsnag.android.performance.internal.framerate.FramerateCollector
    public long getDeadline(@NotNull FrameMetrics frameMetrics) {
        frameMetrics.getClass();
        return (long) (1000000000 / getCurrentRefreshRate());
    }

    @Override // com.bugsnag.android.performance.internal.framerate.FramerateCollector
    public long getFrameStart(@NotNull FrameMetrics frameMetrics) {
        frameMetrics.getClass();
        Long lastFrameTimeNanos = ChoreographerExtensionsKt.getLastFrameTimeNanos(this.choreographer);
        if (lastFrameTimeNanos != null) {
            return lastFrameTimeNanos.longValue();
        }
        return -1L;
    }
}
