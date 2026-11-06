package com.amazon.photos.uploader.cds.multipart;

import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.photos.uploader.UploadErrorCategory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/photos/uploader/cds/multipart/UploadPartResponse;", "", "()V", "Companion", "Failure", "NoRetryFailure", "Lcom/amazon/photos/uploader/cds/multipart/UploadPartResponse$Failure;", "Lcom/amazon/photos/uploader/cds/multipart/UploadPartResponse$NoRetryFailure;", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class UploadPartResponse {

    @NotNull
    public static final String UNKNOWN_PART_UPLOAD_ERROR = "UNKNOWN_PART_UPLOAD_ERROR";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/amazon/photos/uploader/cds/multipart/UploadPartResponse$NoRetryFailure;", "Lcom/amazon/photos/uploader/cds/multipart/UploadPartResponse;", "errorCode", "", "errorCategory", "Lcom/amazon/photos/uploader/UploadErrorCategory;", "ex", "", "(Ljava/lang/String;Lcom/amazon/photos/uploader/UploadErrorCategory;Ljava/lang/Throwable;)V", "getErrorCategory", "()Lcom/amazon/photos/uploader/UploadErrorCategory;", "getErrorCode", "()Ljava/lang/String;", "getEx", "()Ljava/lang/Throwable;", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NoRetryFailure extends UploadPartResponse {

        @NotNull
        private final UploadErrorCategory errorCategory;

        @NotNull
        private final String errorCode;

        @NotNull
        private final Throwable ex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NoRetryFailure(@NotNull String str, @NotNull UploadErrorCategory uploadErrorCategory, @NotNull Throwable th) {
            super(null);
            str.getClass();
            uploadErrorCategory.getClass();
            th.getClass();
            this.errorCode = str;
            this.errorCategory = uploadErrorCategory;
            this.ex = th;
        }

        public static /* synthetic */ NoRetryFailure copy$default(NoRetryFailure noRetryFailure, String str, UploadErrorCategory uploadErrorCategory, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                str = noRetryFailure.errorCode;
            }
            if ((i & 2) != 0) {
                uploadErrorCategory = noRetryFailure.errorCategory;
            }
            if ((i & 4) != 0) {
                th = noRetryFailure.ex;
            }
            return noRetryFailure.copy(str, uploadErrorCategory, th);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getErrorCode() {
            return this.errorCode;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final UploadErrorCategory getErrorCategory() {
            return this.errorCategory;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final Throwable getEx() {
            return this.ex;
        }

        @NotNull
        public final NoRetryFailure copy(@NotNull String errorCode, @NotNull UploadErrorCategory errorCategory, @NotNull Throwable ex) {
            errorCode.getClass();
            errorCategory.getClass();
            ex.getClass();
            return new NoRetryFailure(errorCode, errorCategory, ex);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NoRetryFailure)) {
                return false;
            }
            NoRetryFailure noRetryFailure = (NoRetryFailure) other;
            return Intrinsics.areEqual(this.errorCode, noRetryFailure.errorCode) && this.errorCategory == noRetryFailure.errorCategory && Intrinsics.areEqual(this.ex, noRetryFailure.ex);
        }

        @NotNull
        public final UploadErrorCategory getErrorCategory() {
            return this.errorCategory;
        }

        @NotNull
        public final String getErrorCode() {
            return this.errorCode;
        }

        @NotNull
        public final Throwable getEx() {
            return this.ex;
        }

        public int hashCode() {
            return this.ex.hashCode() + ((this.errorCategory.hashCode() + (this.errorCode.hashCode() * 31)) * 31);
        }

        @NotNull
        public String toString() {
            return "NoRetryFailure(errorCode=" + this.errorCode + ", errorCategory=" + this.errorCategory + ", ex=" + this.ex + ')';
        }
    }

    public /* synthetic */ UploadPartResponse(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private UploadPartResponse() {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J3\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/amazon/photos/uploader/cds/multipart/UploadPartResponse$Failure;", "Lcom/amazon/photos/uploader/cds/multipart/UploadPartResponse;", "errorCode", "", "ex", "", "errorCategory", "Lcom/amazon/photos/uploader/UploadErrorCategory;", "revisedRequest", "Lcom/amazon/photos/uploader/cds/multipart/PartInfo;", "(Ljava/lang/String;Ljava/lang/Throwable;Lcom/amazon/photos/uploader/UploadErrorCategory;Lcom/amazon/photos/uploader/cds/multipart/PartInfo;)V", "getErrorCategory", "()Lcom/amazon/photos/uploader/UploadErrorCategory;", "getErrorCode", "()Ljava/lang/String;", "getEx", "()Ljava/lang/Throwable;", "getRevisedRequest", "()Lcom/amazon/photos/uploader/cds/multipart/PartInfo;", "component1", "component2", "component3", "component4", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Failure extends UploadPartResponse {

        @NotNull
        private final UploadErrorCategory errorCategory;

        @NotNull
        private final String errorCode;

        @NotNull
        private final Throwable ex;

        @Nullable
        private final PartInfo revisedRequest;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(@NotNull String str, @NotNull Throwable th, @NotNull UploadErrorCategory uploadErrorCategory, @Nullable PartInfo partInfo) {
            super(null);
            str.getClass();
            th.getClass();
            uploadErrorCategory.getClass();
            this.errorCode = str;
            this.ex = th;
            this.errorCategory = uploadErrorCategory;
            this.revisedRequest = partInfo;
        }

        public static /* synthetic */ Failure copy$default(Failure failure, String str, Throwable th, UploadErrorCategory uploadErrorCategory, PartInfo partInfo, int i, Object obj) {
            if ((i & 1) != 0) {
                str = failure.errorCode;
            }
            if ((i & 2) != 0) {
                th = failure.ex;
            }
            if ((i & 4) != 0) {
                uploadErrorCategory = failure.errorCategory;
            }
            if ((i & 8) != 0) {
                partInfo = failure.revisedRequest;
            }
            return failure.copy(str, th, uploadErrorCategory, partInfo);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getErrorCode() {
            return this.errorCode;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Throwable getEx() {
            return this.ex;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final UploadErrorCategory getErrorCategory() {
            return this.errorCategory;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final PartInfo getRevisedRequest() {
            return this.revisedRequest;
        }

        @NotNull
        public final Failure copy(@NotNull String errorCode, @NotNull Throwable ex, @NotNull UploadErrorCategory errorCategory, @Nullable PartInfo revisedRequest) {
            errorCode.getClass();
            ex.getClass();
            errorCategory.getClass();
            return new Failure(errorCode, ex, errorCategory, revisedRequest);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) other;
            return Intrinsics.areEqual(this.errorCode, failure.errorCode) && Intrinsics.areEqual(this.ex, failure.ex) && this.errorCategory == failure.errorCategory && Intrinsics.areEqual(this.revisedRequest, failure.revisedRequest);
        }

        @NotNull
        public final UploadErrorCategory getErrorCategory() {
            return this.errorCategory;
        }

        @NotNull
        public final String getErrorCode() {
            return this.errorCode;
        }

        @NotNull
        public final Throwable getEx() {
            return this.ex;
        }

        @Nullable
        public final PartInfo getRevisedRequest() {
            return this.revisedRequest;
        }

        public int hashCode() {
            int hashCode = (this.errorCategory.hashCode() + ((this.ex.hashCode() + (this.errorCode.hashCode() * 31)) * 31)) * 31;
            PartInfo partInfo = this.revisedRequest;
            return hashCode + (partInfo == null ? 0 : partInfo.hashCode());
        }

        @NotNull
        public String toString() {
            return "Failure(errorCode=" + this.errorCode + ", ex=" + this.ex + ", errorCategory=" + this.errorCategory + ", revisedRequest=" + this.revisedRequest + ')';
        }

        public /* synthetic */ Failure(String str, Throwable th, UploadErrorCategory uploadErrorCategory, PartInfo partInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, th, uploadErrorCategory, (i & 8) != 0 ? null : partInfo);
        }
    }
}
