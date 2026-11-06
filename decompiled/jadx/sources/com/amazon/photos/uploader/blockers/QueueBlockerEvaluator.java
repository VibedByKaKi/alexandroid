package com.amazon.photos.uploader.blockers;

import com.amazon.photos.uploader.Queue;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/amazon/photos/uploader/blockers/QueueBlockerEvaluator;", "", "getBlocker", "Lcom/amazon/photos/uploader/blockers/Blocker;", "queue", "Lcom/amazon/photos/uploader/Queue;", "queryBlocker", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface QueueBlockerEvaluator {
    @Nullable
    Blocker getBlocker(@NotNull Queue queue);

    @Nullable
    Blocker queryBlocker(@NotNull Queue queue);
}
