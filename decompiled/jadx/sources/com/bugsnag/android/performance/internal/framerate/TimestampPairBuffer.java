package com.bugsnag.android.performance.internal.framerate;

import com.amazon.clouddrive.extended.model.BulkOperationType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015R\u001e\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0000X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/bugsnag/android/performance/internal/framerate/TimestampPairBuffer;", "", "size", "", "(I)V", "<set-?>", "index", "getIndex", "()I", "next", "getNext", "()Lcom/bugsnag/android/performance/internal/framerate/TimestampPairBuffer;", "setNext", "(Lcom/bugsnag/android/performance/internal/framerate/TimestampPairBuffer;)V", "timestamps", "", "getTimestamps", "()[J", BulkOperationType.add, "", "start", "", "end", "Companion", "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TimestampPairBuffer {
    public static final int DEFAULT_BUFFER_SIZE = 64;
    private int index;

    @Nullable
    private TimestampPairBuffer next;

    @NotNull
    private final long[] timestamps;

    public /* synthetic */ TimestampPairBuffer(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 64 : i);
    }

    public final boolean add(long start, long end) {
        int i = this.index;
        long[] jArr = this.timestamps;
        if (i >= jArr.length) {
            return false;
        }
        int i2 = i + 1;
        this.index = i2;
        jArr[i] = start;
        this.index = i + 2;
        jArr[i2] = end;
        return true;
    }

    public final int getIndex() {
        return this.index;
    }

    @Nullable
    public final TimestampPairBuffer getNext() {
        return this.next;
    }

    @NotNull
    public final long[] getTimestamps() {
        return this.timestamps;
    }

    public final void setNext(@Nullable TimestampPairBuffer timestampPairBuffer) {
        this.next = timestampPairBuffer;
    }

    public TimestampPairBuffer(int i) {
        this.timestamps = new long[i];
    }

    public TimestampPairBuffer() {
        this(0, 1, null);
    }
}
