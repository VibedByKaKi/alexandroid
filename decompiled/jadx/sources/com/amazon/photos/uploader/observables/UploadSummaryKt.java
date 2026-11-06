package com.amazon.photos.uploader.observables;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"hasUploadFinished", "", "Lcom/amazon/photos/uploader/observables/UploadSummary;", "AndroidPhotosUploader_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUploadSummary.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UploadSummary.kt\ncom/amazon/photos/uploader/observables/UploadSummaryKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,29:1\n1855#2,2:30\n*S KotlinDebug\n*F\n+ 1 UploadSummary.kt\ncom/amazon/photos/uploader/observables/UploadSummaryKt\n*L\n22#1:30,2\n*E\n"})
/* loaded from: classes5.dex */
public final class UploadSummaryKt {
    public static final boolean hasUploadFinished(@NotNull UploadSummary uploadSummary) {
        uploadSummary.getClass();
        if (!uploadSummary.getGlobalBlockers().isEmpty()) {
            return false;
        }
        Iterator<T> it2 = uploadSummary.getQueueSummaries().iterator();
        while (it2.hasNext()) {
            if (QueueSummaryKt.hasPendingRequests((QueueSummary) it2.next())) {
                return false;
            }
        }
        return true;
    }
}
