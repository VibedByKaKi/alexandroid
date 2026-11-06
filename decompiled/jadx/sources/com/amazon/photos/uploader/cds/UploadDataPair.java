package com.amazon.photos.uploader.cds;

import com.amazon.alexa.handsfree.protocols.sierracontentprovider.SierraContentProviderContract;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.clouddrive.cdasdk.cdus.UploadContentRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/amazon/photos/uploader/cds/UploadDataPair;", "", SierraContentProviderContract.MD5_VALUE, "", "uploadContentRequest", "Lcom/amazon/clouddrive/cdasdk/cdus/UploadContentRequest;", "(Ljava/lang/String;Lcom/amazon/clouddrive/cdasdk/cdus/UploadContentRequest;)V", "getMd5", "()Ljava/lang/String;", "getUploadContentRequest", "()Lcom/amazon/clouddrive/cdasdk/cdus/UploadContentRequest;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UploadDataPair {

    @NotNull
    private final String md5;

    @NotNull
    private final UploadContentRequest uploadContentRequest;

    public UploadDataPair(@NotNull String str, @NotNull UploadContentRequest uploadContentRequest) {
        str.getClass();
        uploadContentRequest.getClass();
        this.md5 = str;
        this.uploadContentRequest = uploadContentRequest;
    }

    public static /* synthetic */ UploadDataPair copy$default(UploadDataPair uploadDataPair, String str, UploadContentRequest uploadContentRequest, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uploadDataPair.md5;
        }
        if ((i & 2) != 0) {
            uploadContentRequest = uploadDataPair.uploadContentRequest;
        }
        return uploadDataPair.copy(str, uploadContentRequest);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getMd5() {
        return this.md5;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final UploadContentRequest getUploadContentRequest() {
        return this.uploadContentRequest;
    }

    @NotNull
    public final UploadDataPair copy(@NotNull String md5, @NotNull UploadContentRequest uploadContentRequest) {
        md5.getClass();
        uploadContentRequest.getClass();
        return new UploadDataPair(md5, uploadContentRequest);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploadDataPair)) {
            return false;
        }
        UploadDataPair uploadDataPair = (UploadDataPair) other;
        return Intrinsics.areEqual(this.md5, uploadDataPair.md5) && Intrinsics.areEqual(this.uploadContentRequest, uploadDataPair.uploadContentRequest);
    }

    @NotNull
    public final String getMd5() {
        return this.md5;
    }

    @NotNull
    public final UploadContentRequest getUploadContentRequest() {
        return this.uploadContentRequest;
    }

    public int hashCode() {
        return this.uploadContentRequest.hashCode() + (this.md5.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "UploadDataPair(md5=" + this.md5 + ", uploadContentRequest=" + this.uploadContentRequest + ')';
    }
}
