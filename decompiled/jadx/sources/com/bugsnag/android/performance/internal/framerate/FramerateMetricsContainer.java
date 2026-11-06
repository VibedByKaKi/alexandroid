package com.bugsnag.android.performance.internal.framerate;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0004J\u0006\u0010\u001c\u001a\u00020\u001dR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\b¨\u0006\u001e"}, d2 = {"Lcom/bugsnag/android/performance/internal/framerate/FramerateMetricsContainer;", "", "()V", "frozenFrameCount", "", "getFrozenFrameCount", "()J", "setFrozenFrameCount", "(J)V", "frozenFrames", "Lcom/bugsnag/android/performance/internal/framerate/TimestampPairBuffer;", "getFrozenFrames", "()Lcom/bugsnag/android/performance/internal/framerate/TimestampPairBuffer;", "setFrozenFrames", "(Lcom/bugsnag/android/performance/internal/framerate/TimestampPairBuffer;)V", "slowFrameCount", "getSlowFrameCount", "setSlowFrameCount", "totalFrameCount", "getTotalFrameCount", "setTotalFrameCount", "totalMetricsCount", "getTotalMetricsCount", "setTotalMetricsCount", "addFrozenFrame", "", "start", "end", "snapshot", "Lcom/bugsnag/android/performance/internal/framerate/FramerateMetricsSnapshot;", "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FramerateMetricsContainer {
    private volatile long frozenFrameCount;

    @NotNull
    private TimestampPairBuffer frozenFrames = new TimestampPairBuffer(0, 1, null);
    private volatile long slowFrameCount;
    private volatile long totalFrameCount;
    private volatile long totalMetricsCount;

    public final void addFrozenFrame(long start, long end) {
        while (!this.frozenFrames.add(start, end)) {
            TimestampPairBuffer timestampPairBuffer = new TimestampPairBuffer(0, 1, null);
            this.frozenFrames.setNext(timestampPairBuffer);
            this.frozenFrames = timestampPairBuffer;
        }
        this.frozenFrameCount++;
    }

    public final long getFrozenFrameCount() {
        return this.frozenFrameCount;
    }

    @NotNull
    public final TimestampPairBuffer getFrozenFrames() {
        return this.frozenFrames;
    }

    public final long getSlowFrameCount() {
        return this.slowFrameCount;
    }

    public final long getTotalFrameCount() {
        return this.totalFrameCount;
    }

    public final long getTotalMetricsCount() {
        return this.totalMetricsCount;
    }

    public final void setFrozenFrameCount(long j) {
        this.frozenFrameCount = j;
    }

    public final void setFrozenFrames(@NotNull TimestampPairBuffer timestampPairBuffer) {
        timestampPairBuffer.getClass();
        this.frozenFrames = timestampPairBuffer;
    }

    public final void setSlowFrameCount(long j) {
        this.slowFrameCount = j;
    }

    public final void setTotalFrameCount(long j) {
        this.totalFrameCount = j;
    }

    public final void setTotalMetricsCount(long j) {
        this.totalMetricsCount = j;
    }

    @NotNull
    public final FramerateMetricsSnapshot snapshot() {
        while (true) {
            long j = this.totalMetricsCount;
            long j2 = this.totalFrameCount;
            long j3 = this.slowFrameCount;
            long j4 = this.frozenFrameCount;
            if (j2 == this.totalFrameCount && j == this.totalMetricsCount) {
                TimestampPairBuffer timestampPairBuffer = this.frozenFrames;
                return new FramerateMetricsSnapshot(j3, j4, j2, timestampPairBuffer, timestampPairBuffer.getIndex());
            }
        }
    }
}
