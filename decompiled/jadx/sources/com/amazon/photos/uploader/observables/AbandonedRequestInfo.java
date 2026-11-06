package com.amazon.photos.uploader.observables;

import com.amazon.photos.uploader.AbandonReason;
import com.amazon.photos.uploader.UploadErrorCategory;
import com.amazon.photos.uploader.UploadRequest;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/amazon/photos/uploader/observables/AbandonedRequestInfo;", "", "uploadRequest", "Lcom/amazon/photos/uploader/UploadRequest;", "ex", "", "errorCategory", "Lcom/amazon/photos/uploader/UploadErrorCategory;", "reason", "Lcom/amazon/photos/uploader/AbandonReason;", "(Lcom/amazon/photos/uploader/UploadRequest;Ljava/lang/Throwable;Lcom/amazon/photos/uploader/UploadErrorCategory;Lcom/amazon/photos/uploader/AbandonReason;)V", "getErrorCategory", "()Lcom/amazon/photos/uploader/UploadErrorCategory;", "getEx", "()Ljava/lang/Throwable;", "getReason", "()Lcom/amazon/photos/uploader/AbandonReason;", "getUploadRequest", "()Lcom/amazon/photos/uploader/UploadRequest;", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AbandonedRequestInfo {

    @NotNull
    private final UploadErrorCategory errorCategory;

    @Nullable
    private final Throwable ex;

    @NotNull
    private final AbandonReason reason;

    @NotNull
    private final UploadRequest uploadRequest;

    public AbandonedRequestInfo(@NotNull UploadRequest uploadRequest, @Nullable Throwable th, @NotNull UploadErrorCategory uploadErrorCategory, @NotNull AbandonReason abandonReason) {
        uploadRequest.getClass();
        uploadErrorCategory.getClass();
        abandonReason.getClass();
        this.uploadRequest = uploadRequest;
        this.ex = th;
        this.errorCategory = uploadErrorCategory;
        this.reason = abandonReason;
    }

    @NotNull
    public final UploadErrorCategory getErrorCategory() {
        return this.errorCategory;
    }

    @Nullable
    public final Throwable getEx() {
        return this.ex;
    }

    @NotNull
    public final AbandonReason getReason() {
        return this.reason;
    }

    @NotNull
    public final UploadRequest getUploadRequest() {
        return this.uploadRequest;
    }
}
