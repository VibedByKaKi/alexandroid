package com.amazon.photos.uploader.observables;

import com.amazon.photos.uploader.ResultMetadata;
import com.amazon.photos.uploader.UploadErrorCategory;
import com.amazon.photos.uploader.UploadRequest;
import com.amazon.photos.uploader.blockers.Blocker;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH&J\u001e\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000eH\u0016J\"\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0013H&J \u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H&J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u001bH&¨\u0006\u001c"}, d2 = {"Lcom/amazon/photos/uploader/observables/UploadRequestObserver;", "", "onRequestAdded", "", "uploadRequest", "Lcom/amazon/photos/uploader/UploadRequest;", "onRequestsAbandoned", "abandonedRequestInfoList", "", "Lcom/amazon/photos/uploader/observables/AbandonedRequestInfo;", "onUploadBlocked", "blocker", "Lcom/amazon/photos/uploader/blockers/Blocker;", "blockers", "", "onUploadFailed", "ex", "", "errorCategory", "Lcom/amazon/photos/uploader/UploadErrorCategory;", "onUploadProgressUpdate", "currentProgress", "", "maxProgress", "onUploadStarted", "onUploadSucceeded", "resultMetadata", "Lcom/amazon/photos/uploader/ResultMetadata;", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface UploadRequestObserver {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onUploadBlocked(@NotNull UploadRequestObserver uploadRequestObserver, @NotNull UploadRequest uploadRequest, @NotNull Set<? extends Blocker> set) {
            uploadRequest.getClass();
            set.getClass();
            if (set.isEmpty()) {
                Single$$ExternalSyntheticBUOutline0.m$2("Check failed.");
            } else {
                uploadRequestObserver.onUploadBlocked(uploadRequest, (Blocker) CollectionsKt.first(set));
            }
        }
    }

    void onRequestAdded(@NotNull UploadRequest uploadRequest);

    void onRequestsAbandoned(@NotNull List<AbandonedRequestInfo> abandonedRequestInfoList);

    void onUploadBlocked(@NotNull UploadRequest uploadRequest, @NotNull Blocker blocker);

    void onUploadBlocked(@NotNull UploadRequest uploadRequest, @NotNull Set<? extends Blocker> blockers);

    void onUploadFailed(@NotNull UploadRequest uploadRequest, @Nullable Throwable ex, @NotNull UploadErrorCategory errorCategory);

    void onUploadProgressUpdate(@NotNull UploadRequest uploadRequest, long currentProgress, long maxProgress);

    void onUploadStarted(@NotNull UploadRequest uploadRequest);

    void onUploadSucceeded(@NotNull UploadRequest uploadRequest, @NotNull ResultMetadata resultMetadata);
}
