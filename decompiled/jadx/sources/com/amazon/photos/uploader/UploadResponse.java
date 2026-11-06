package com.amazon.photos.uploader;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00042\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/amazon/photos/uploader/UploadResponse;", "", "()V", "AcceptableFailure", "Companion", "Failure", "NoRetryFailure", "NoWorkRequired", "Success", "Lcom/amazon/photos/uploader/UploadResponse$AcceptableFailure;", "Lcom/amazon/photos/uploader/UploadResponse$Failure;", "Lcom/amazon/photos/uploader/UploadResponse$NoRetryFailure;", "Lcom/amazon/photos/uploader/UploadResponse$NoWorkRequired;", "Lcom/amazon/photos/uploader/UploadResponse$Success;", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class UploadResponse {

    @NotNull
    public static final String UNKNOWN_UPLOAD_ERROR = "UNKNOWN_UPLOAD_ERROR";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/amazon/photos/uploader/UploadResponse$AcceptableFailure;", "Lcom/amazon/photos/uploader/UploadResponse;", "errorCode", "", "ex", "", "errorCategory", "Lcom/amazon/photos/uploader/UploadErrorCategory;", "(Ljava/lang/String;Ljava/lang/Throwable;Lcom/amazon/photos/uploader/UploadErrorCategory;)V", "getErrorCategory", "()Lcom/amazon/photos/uploader/UploadErrorCategory;", "getErrorCode", "()Ljava/lang/String;", "getEx", "()Ljava/lang/Throwable;", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AcceptableFailure extends UploadResponse {

        @NotNull
        private final UploadErrorCategory errorCategory;

        @NotNull
        private final String errorCode;

        @NotNull
        private final Throwable ex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AcceptableFailure(@NotNull String str, @NotNull Throwable th, @NotNull UploadErrorCategory uploadErrorCategory) {
            super(null);
            str.getClass();
            th.getClass();
            uploadErrorCategory.getClass();
            this.errorCode = str;
            this.ex = th;
            this.errorCategory = uploadErrorCategory;
        }

        public static /* synthetic */ AcceptableFailure copy$default(AcceptableFailure acceptableFailure, String str, Throwable th, UploadErrorCategory uploadErrorCategory, int i, Object obj) {
            if ((i & 1) != 0) {
                str = acceptableFailure.errorCode;
            }
            if ((i & 2) != 0) {
                th = acceptableFailure.ex;
            }
            if ((i & 4) != 0) {
                uploadErrorCategory = acceptableFailure.errorCategory;
            }
            return acceptableFailure.copy(str, th, uploadErrorCategory);
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

        @NotNull
        public final AcceptableFailure copy(@NotNull String errorCode, @NotNull Throwable ex, @NotNull UploadErrorCategory errorCategory) {
            errorCode.getClass();
            ex.getClass();
            errorCategory.getClass();
            return new AcceptableFailure(errorCode, ex, errorCategory);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AcceptableFailure)) {
                return false;
            }
            AcceptableFailure acceptableFailure = (AcceptableFailure) other;
            return Intrinsics.areEqual(this.errorCode, acceptableFailure.errorCode) && Intrinsics.areEqual(this.ex, acceptableFailure.ex) && this.errorCategory == acceptableFailure.errorCategory;
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
            return this.errorCategory.hashCode() + ((this.ex.hashCode() + (this.errorCode.hashCode() * 31)) * 31);
        }

        @NotNull
        public String toString() {
            return "AcceptableFailure(errorCode=" + this.errorCode + ", ex=" + this.ex + ", errorCategory=" + this.errorCategory + ')';
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/amazon/photos/uploader/UploadResponse$NoRetryFailure;", "Lcom/amazon/photos/uploader/UploadResponse;", "errorCode", "", "ex", "", "errorCategory", "Lcom/amazon/photos/uploader/UploadErrorCategory;", "(Ljava/lang/String;Ljava/lang/Throwable;Lcom/amazon/photos/uploader/UploadErrorCategory;)V", "getErrorCategory", "()Lcom/amazon/photos/uploader/UploadErrorCategory;", "getErrorCode", "()Ljava/lang/String;", "getEx", "()Ljava/lang/Throwable;", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NoRetryFailure extends UploadResponse {

        @NotNull
        private final UploadErrorCategory errorCategory;

        @NotNull
        private final String errorCode;

        @NotNull
        private final Throwable ex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NoRetryFailure(@NotNull String str, @NotNull Throwable th, @NotNull UploadErrorCategory uploadErrorCategory) {
            super(null);
            str.getClass();
            th.getClass();
            uploadErrorCategory.getClass();
            this.errorCode = str;
            this.ex = th;
            this.errorCategory = uploadErrorCategory;
        }

        public static /* synthetic */ NoRetryFailure copy$default(NoRetryFailure noRetryFailure, String str, Throwable th, UploadErrorCategory uploadErrorCategory, int i, Object obj) {
            if ((i & 1) != 0) {
                str = noRetryFailure.errorCode;
            }
            if ((i & 2) != 0) {
                th = noRetryFailure.ex;
            }
            if ((i & 4) != 0) {
                uploadErrorCategory = noRetryFailure.errorCategory;
            }
            return noRetryFailure.copy(str, th, uploadErrorCategory);
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

        @NotNull
        public final NoRetryFailure copy(@NotNull String errorCode, @NotNull Throwable ex, @NotNull UploadErrorCategory errorCategory) {
            errorCode.getClass();
            ex.getClass();
            errorCategory.getClass();
            return new NoRetryFailure(errorCode, ex, errorCategory);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NoRetryFailure)) {
                return false;
            }
            NoRetryFailure noRetryFailure = (NoRetryFailure) other;
            return Intrinsics.areEqual(this.errorCode, noRetryFailure.errorCode) && Intrinsics.areEqual(this.ex, noRetryFailure.ex) && this.errorCategory == noRetryFailure.errorCategory;
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
            return this.errorCategory.hashCode() + ((this.ex.hashCode() + (this.errorCode.hashCode() * 31)) * 31);
        }

        @NotNull
        public String toString() {
            return "NoRetryFailure(errorCode=" + this.errorCode + ", ex=" + this.ex + ", errorCategory=" + this.errorCategory + ')';
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/amazon/photos/uploader/UploadResponse$NoWorkRequired;", "Lcom/amazon/photos/uploader/UploadResponse;", "reason", "Lcom/amazon/photos/uploader/AbandonReason;", "(Lcom/amazon/photos/uploader/AbandonReason;)V", "getReason", "()Lcom/amazon/photos/uploader/AbandonReason;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NoWorkRequired extends UploadResponse {

        @NotNull
        private final AbandonReason reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NoWorkRequired(@NotNull AbandonReason abandonReason) {
            super(null);
            abandonReason.getClass();
            this.reason = abandonReason;
        }

        public static /* synthetic */ NoWorkRequired copy$default(NoWorkRequired noWorkRequired, AbandonReason abandonReason, int i, Object obj) {
            if ((i & 1) != 0) {
                abandonReason = noWorkRequired.reason;
            }
            return noWorkRequired.copy(abandonReason);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final AbandonReason getReason() {
            return this.reason;
        }

        @NotNull
        public final NoWorkRequired copy(@NotNull AbandonReason reason) {
            reason.getClass();
            return new NoWorkRequired(reason);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NoWorkRequired) && this.reason == ((NoWorkRequired) other).reason;
        }

        @NotNull
        public final AbandonReason getReason() {
            return this.reason;
        }

        public int hashCode() {
            return this.reason.hashCode();
        }

        @NotNull
        public String toString() {
            return "NoWorkRequired(reason=" + this.reason + ')';
        }
    }

    public /* synthetic */ UploadResponse(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private UploadResponse() {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/photos/uploader/UploadResponse$Success;", "Lcom/amazon/photos/uploader/UploadResponse;", "()V", "resultMetadata", "Lcom/amazon/photos/uploader/ResultMetadata;", "(Lcom/amazon/photos/uploader/ResultMetadata;)V", "getResultMetadata", "()Lcom/amazon/photos/uploader/ResultMetadata;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Success extends UploadResponse {

        @NotNull
        private final ResultMetadata resultMetadata;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(@NotNull ResultMetadata resultMetadata) {
            super(null);
            resultMetadata.getClass();
            this.resultMetadata = resultMetadata;
        }

        public static /* synthetic */ Success copy$default(Success success, ResultMetadata resultMetadata, int i, Object obj) {
            if ((i & 1) != 0) {
                resultMetadata = success.resultMetadata;
            }
            return success.copy(resultMetadata);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ResultMetadata getResultMetadata() {
            return this.resultMetadata;
        }

        @NotNull
        public final Success copy(@NotNull ResultMetadata resultMetadata) {
            resultMetadata.getClass();
            return new Success(resultMetadata);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.areEqual(this.resultMetadata, ((Success) other).resultMetadata);
        }

        @NotNull
        public final ResultMetadata getResultMetadata() {
            return this.resultMetadata;
        }

        public int hashCode() {
            return this.resultMetadata.hashCode();
        }

        @NotNull
        public String toString() {
            return "Success(resultMetadata=" + this.resultMetadata + ')';
        }

        public Success() {
            this(new ResultMetadata());
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÆ\u0003J=\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Lcom/amazon/photos/uploader/UploadResponse$Failure;", "Lcom/amazon/photos/uploader/UploadResponse;", "errorCode", "", "ex", "", "errorCategory", "Lcom/amazon/photos/uploader/UploadErrorCategory;", "revisedRequest", "Lcom/amazon/photos/uploader/UploadRequest;", "resetAttempts", "", "(Ljava/lang/String;Ljava/lang/Throwable;Lcom/amazon/photos/uploader/UploadErrorCategory;Lcom/amazon/photos/uploader/UploadRequest;Z)V", "getErrorCategory", "()Lcom/amazon/photos/uploader/UploadErrorCategory;", "getErrorCode", "()Ljava/lang/String;", "getEx", "()Ljava/lang/Throwable;", "getResetAttempts", "()Z", "getRevisedRequest", "()Lcom/amazon/photos/uploader/UploadRequest;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Failure extends UploadResponse {

        @NotNull
        private final UploadErrorCategory errorCategory;

        @NotNull
        private final String errorCode;

        @NotNull
        private final Throwable ex;
        private final boolean resetAttempts;

        @Nullable
        private final UploadRequest revisedRequest;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(@NotNull String str, @NotNull Throwable th, @NotNull UploadErrorCategory uploadErrorCategory, @Nullable UploadRequest uploadRequest, boolean z) {
            super(null);
            str.getClass();
            th.getClass();
            uploadErrorCategory.getClass();
            this.errorCode = str;
            this.ex = th;
            this.errorCategory = uploadErrorCategory;
            this.revisedRequest = uploadRequest;
            this.resetAttempts = z;
        }

        public static /* synthetic */ Failure copy$default(Failure failure, String str, Throwable th, UploadErrorCategory uploadErrorCategory, UploadRequest uploadRequest, boolean z, int i, Object obj) {
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
                uploadRequest = failure.revisedRequest;
            }
            if ((i & 16) != 0) {
                z = failure.resetAttempts;
            }
            boolean z2 = z;
            UploadErrorCategory uploadErrorCategory2 = uploadErrorCategory;
            return failure.copy(str, th, uploadErrorCategory2, uploadRequest, z2);
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
        public final UploadRequest getRevisedRequest() {
            return this.revisedRequest;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getResetAttempts() {
            return this.resetAttempts;
        }

        @NotNull
        public final Failure copy(@NotNull String errorCode, @NotNull Throwable ex, @NotNull UploadErrorCategory errorCategory, @Nullable UploadRequest revisedRequest, boolean resetAttempts) {
            errorCode.getClass();
            ex.getClass();
            errorCategory.getClass();
            return new Failure(errorCode, ex, errorCategory, revisedRequest, resetAttempts);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) other;
            return Intrinsics.areEqual(this.errorCode, failure.errorCode) && Intrinsics.areEqual(this.ex, failure.ex) && this.errorCategory == failure.errorCategory && Intrinsics.areEqual(this.revisedRequest, failure.revisedRequest) && this.resetAttempts == failure.resetAttempts;
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

        public final boolean getResetAttempts() {
            return this.resetAttempts;
        }

        @Nullable
        public final UploadRequest getRevisedRequest() {
            return this.revisedRequest;
        }

        public int hashCode() {
            int hashCode = (this.errorCategory.hashCode() + ((this.ex.hashCode() + (this.errorCode.hashCode() * 31)) * 31)) * 31;
            UploadRequest uploadRequest = this.revisedRequest;
            return Boolean.hashCode(this.resetAttempts) + ((hashCode + (uploadRequest == null ? 0 : uploadRequest.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("Failure(errorCode=");
            sb.append(this.errorCode);
            sb.append(", ex=");
            sb.append(this.ex);
            sb.append(", errorCategory=");
            sb.append(this.errorCategory);
            sb.append(", revisedRequest=");
            sb.append(this.revisedRequest);
            sb.append(", resetAttempts=");
            return ErrorUtils$$ExternalSyntheticOutline0.m(sb, this.resetAttempts, ')');
        }

        public /* synthetic */ Failure(String str, Throwable th, UploadErrorCategory uploadErrorCategory, UploadRequest uploadRequest, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, th, uploadErrorCategory, (i & 8) != 0 ? null : uploadRequest, (i & 16) != 0 ? false : z);
        }
    }
}
