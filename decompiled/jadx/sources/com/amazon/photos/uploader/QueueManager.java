package com.amazon.photos.uploader;

import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\bH&J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\rH&J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\u001e\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u0011H&¨\u0006\u0012"}, d2 = {"Lcom/amazon/photos/uploader/QueueManager;", "", "addNewQueue", "", "queue", "Lcom/amazon/photos/uploader/Queue;", "addQueueConstraint", "queueName", "", "constraint", "Lcom/amazon/photos/uploader/QueueConstraint;", "getQueue", "getQueues", "", "removeQueueConstraint", "setQueueConstraints", "constraints", "", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface QueueManager {
    void addNewQueue(@NotNull Queue queue);

    void addQueueConstraint(@NotNull String queueName, @NotNull QueueConstraint constraint);

    @Nullable
    Queue getQueue(@NotNull String queueName);

    @NotNull
    Collection<Queue> getQueues();

    void removeQueueConstraint(@NotNull String queueName, @NotNull QueueConstraint constraint);

    void setQueueConstraints(@NotNull String queueName, @NotNull Set<? extends QueueConstraint> constraints);
}
