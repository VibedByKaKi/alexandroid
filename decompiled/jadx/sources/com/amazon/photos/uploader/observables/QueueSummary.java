package com.amazon.photos.uploader.observables;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.photos.uploader.Queue;
import com.amazon.photos.uploader.blockers.Blocker;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001BW\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t¢\u0006\u0002\u0010\rJ\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/amazon/photos/uploader/observables/QueueSummary;", "", "queue", "Lcom/amazon/photos/uploader/Queue;", "queueBlockers", "", "Lcom/amazon/photos/uploader/blockers/Blocker;", "requestBlockers", "queuedRequestCount", "", "completedRequestCount", "blockedRequestCount", "runningRequestCount", "(Lcom/amazon/photos/uploader/Queue;Ljava/util/Collection;Ljava/util/Collection;IIII)V", "getBlockedRequestCount", "()I", "getCompletedRequestCount", "getQueue", "()Lcom/amazon/photos/uploader/Queue;", "getQueueBlockers", "()Ljava/util/Collection;", "getQueuedRequestCount", "getRequestBlockers", "getRunningRequestCount", "toString", "", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class QueueSummary {
    private final int blockedRequestCount;
    private final int completedRequestCount;

    @NotNull
    private final Queue queue;

    @NotNull
    private final Collection<Blocker> queueBlockers;
    private final int queuedRequestCount;

    @NotNull
    private final Collection<Blocker> requestBlockers;
    private final int runningRequestCount;

    public /* synthetic */ QueueSummary(Queue queue, Collection collection, Collection collection2, int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(queue, (i5 & 2) != 0 ? SetsKt.emptySet() : collection, (i5 & 4) != 0 ? SetsKt.emptySet() : collection2, (i5 & 8) != 0 ? 0 : i, (i5 & 16) != 0 ? 0 : i2, (i5 & 32) != 0 ? 0 : i3, (i5 & 64) != 0 ? 0 : i4);
    }

    public final int getBlockedRequestCount() {
        return this.blockedRequestCount;
    }

    public final int getCompletedRequestCount() {
        return this.completedRequestCount;
    }

    @NotNull
    public final Queue getQueue() {
        return this.queue;
    }

    @NotNull
    public final Collection<Blocker> getQueueBlockers() {
        return this.queueBlockers;
    }

    public final int getQueuedRequestCount() {
        return this.queuedRequestCount;
    }

    @NotNull
    public final Collection<Blocker> getRequestBlockers() {
        return this.requestBlockers;
    }

    public final int getRunningRequestCount() {
        return this.runningRequestCount;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("QueueSummary(queue=");
        sb.append(this.queue);
        sb.append(", queueBlockers=");
        sb.append(this.queueBlockers);
        sb.append(", requestBlockers=");
        sb.append(this.requestBlockers);
        sb.append(", queuedRequestCount=");
        sb.append(this.queuedRequestCount);
        sb.append(", completedRequestCount=");
        sb.append(this.completedRequestCount);
        sb.append(", blockedRequestCount=");
        sb.append(this.blockedRequestCount);
        sb.append(", runningRequestCount=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, this.runningRequestCount, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public QueueSummary(@NotNull Queue queue, @NotNull Collection<? extends Blocker> collection, @NotNull Collection<? extends Blocker> collection2, int i, int i2, int i3, int i4) {
        queue.getClass();
        collection.getClass();
        collection2.getClass();
        this.queue = queue;
        this.queueBlockers = collection;
        this.requestBlockers = collection2;
        this.queuedRequestCount = i;
        this.completedRequestCount = i2;
        this.blockedRequestCount = i3;
        this.runningRequestCount = i4;
    }
}
