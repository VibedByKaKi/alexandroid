package com.amazon.alexa.pmi.implementation.taplatency;

import androidx.collection.SieveCacheKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u0014J\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001e\u001a\u00020\u0014¢\u0006\u0002\u0010\u001fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006 "}, d2 = {"Lcom/amazon/alexa/pmi/implementation/taplatency/WindowFrames;", "", "id", "", "<init>", "(I)V", "getId", "()I", "vsyncs", "", "ends", "next", "size", "copy", "Lcom/amazon/alexa/pmi/implementation/taplatency/CopyState;", "getCopy", "()Lcom/amazon/alexa/pmi/implementation/taplatency/CopyState;", "setCopy", "(Lcom/amazon/alexa/pmi/implementation/taplatency/CopyState;)V", "lastCopyNanos", "", "getLastCopyNanos", "()J", "setLastCopyNanos", "(J)V", "remember", "", "vsyncNanos", "endNanos", "endOfLatestFrameAt", "atNanos", "(J)Ljava/lang/Long;", "AlexaMobileAndroidPerfMetricsInstrumentation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
final class WindowFrames {
    private final int id;
    private int next;
    private int size;

    @NotNull
    private final long[] vsyncs = new long[32];

    @NotNull
    private final long[] ends = new long[32];

    @NotNull
    private CopyState copy = CopyState.IDLE;
    private long lastCopyNanos = SieveCacheKt.NodeMetaMask;

    public WindowFrames(int i) {
        this.id = i;
    }

    @Nullable
    public final Long endOfLatestFrameAt(long atNanos) {
        int i = this.size;
        int i2 = 1;
        if (1 > i) {
            return null;
        }
        while (true) {
            int i3 = ((this.next - i2) + 32) % 32;
            if (this.vsyncs[i3] <= atNanos) {
                return Long.valueOf(this.ends[i3]);
            }
            if (i2 == i) {
                return null;
            }
            i2++;
        }
    }

    @NotNull
    public final CopyState getCopy() {
        return this.copy;
    }

    public final int getId() {
        return this.id;
    }

    public final long getLastCopyNanos() {
        return this.lastCopyNanos;
    }

    public final void remember(long vsyncNanos, long endNanos) {
        long[] jArr = this.vsyncs;
        int i = this.next;
        jArr[i] = vsyncNanos;
        this.ends[i] = endNanos;
        this.next = (i + 1) % 32;
        int i2 = this.size;
        if (i2 < 32) {
            this.size = i2 + 1;
        }
    }

    public final void setCopy(@NotNull CopyState copyState) {
        copyState.getClass();
        this.copy = copyState;
    }

    public final void setLastCopyNanos(long j) {
        this.lastCopyNanos = j;
    }
}
