package com.bugsnag.android.performance.internal;

import androidx.annotation.RestrictTo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/bugsnag/android/performance/internal/InternalDebug;", "", "()V", "dropSpansOlderThanMs", "", "getDropSpansOlderThanMs", "()J", "setDropSpansOlderThanMs", "(J)V", "pValueExpireAfterMs", "", "getPValueExpireAfterMs", "()I", "setPValueExpireAfterMs", "(I)V", "spanBatchSizeSendTriggerPoint", "getSpanBatchSizeSendTriggerPoint", "setSpanBatchSizeSendTriggerPoint", "workerSleepMs", "getWorkerSleepMs", "setWorkerSleepMs", "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes6.dex */
public final class InternalDebug {

    @NotNull
    public static final InternalDebug INSTANCE = new InternalDebug();
    private static int spanBatchSizeSendTriggerPoint = 100;
    private static long workerSleepMs = 30000;
    private static long dropSpansOlderThanMs = 86400000;
    private static int pValueExpireAfterMs = 86400000;

    private InternalDebug() {
    }

    public final long getDropSpansOlderThanMs() {
        return dropSpansOlderThanMs;
    }

    public final int getPValueExpireAfterMs() {
        return pValueExpireAfterMs;
    }

    public final int getSpanBatchSizeSendTriggerPoint() {
        return spanBatchSizeSendTriggerPoint;
    }

    public final long getWorkerSleepMs() {
        return workerSleepMs;
    }

    public final void setDropSpansOlderThanMs(long j) {
        dropSpansOlderThanMs = j;
    }

    public final void setPValueExpireAfterMs(int i) {
        pValueExpireAfterMs = i;
    }

    public final void setSpanBatchSizeSendTriggerPoint(int i) {
        spanBatchSizeSendTriggerPoint = i;
    }

    public final void setWorkerSleepMs(long j) {
        workerSleepMs = j;
    }
}
