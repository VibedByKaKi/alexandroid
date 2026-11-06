package com.bugsnag.android.performance.internal.framerate;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ.\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00002\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00140\u0017H\u0086\bø\u0001\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0018"}, d2 = {"Lcom/bugsnag/android/performance/internal/framerate/FramerateMetricsSnapshot;", "", "slowFrameCount", "", "frozenFrameCount", "totalFrameCount", "frozenFrames", "Lcom/bugsnag/android/performance/internal/framerate/TimestampPairBuffer;", "firstFrozenFrameIndex", "", "(JJJLcom/bugsnag/android/performance/internal/framerate/TimestampPairBuffer;I)V", "getFirstFrozenFrameIndex", "()I", "getFrozenFrameCount", "()J", "getFrozenFrames", "()Lcom/bugsnag/android/performance/internal/framerate/TimestampPairBuffer;", "getSlowFrameCount", "getTotalFrameCount", "forEachFrozenFrameUntil", "", "end", "consumer", "Lkotlin/Function2;", "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FramerateMetricsSnapshot {
    private final int firstFrozenFrameIndex;
    private final long frozenFrameCount;

    @NotNull
    private final TimestampPairBuffer frozenFrames;
    private final long slowFrameCount;
    private final long totalFrameCount;

    public FramerateMetricsSnapshot(long j, long j2, long j3, @NotNull TimestampPairBuffer timestampPairBuffer, int i) {
        timestampPairBuffer.getClass();
        this.slowFrameCount = j;
        this.frozenFrameCount = j2;
        this.totalFrameCount = j3;
        this.frozenFrames = timestampPairBuffer;
        this.firstFrozenFrameIndex = i;
    }

    public final void forEachFrozenFrameUntil(@NotNull FramerateMetricsSnapshot end, @NotNull Function2<? super Long, ? super Long, Unit> consumer) {
        end.getClass();
        consumer.getClass();
        TimestampPairBuffer frozenFrames = getFrozenFrames();
        int firstFrozenFrameIndex = getFirstFrozenFrameIndex();
        while (frozenFrames != null) {
            int firstFrozenFrameIndex2 = frozenFrames == end.getFrozenFrames() ? end.getFirstFrozenFrameIndex() : frozenFrames.getTimestamps().length;
            while (firstFrozenFrameIndex < firstFrozenFrameIndex2) {
                consumer.invoke(Long.valueOf(frozenFrames.getTimestamps()[firstFrozenFrameIndex]), Long.valueOf(frozenFrames.getTimestamps()[firstFrozenFrameIndex + 1]));
                firstFrozenFrameIndex += 2;
            }
            if (frozenFrames == end.getFrozenFrames()) {
                return;
            }
            frozenFrames = frozenFrames.getNext();
            firstFrozenFrameIndex = 0;
        }
    }

    public final int getFirstFrozenFrameIndex() {
        return this.firstFrozenFrameIndex;
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
}
