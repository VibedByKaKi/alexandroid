package com.amazon.alexa.assistant.foundation.audio.drm;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0006\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0006\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/audio/drm/WidevineError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "LicenseAcquisitionFailed", "InvalidLicenseUrl", "ProvisioningFailed", "MediaDrmException", "UnsupportedMediaType", "MissingDrmCallback", "Lcom/amazon/alexa/assistant/foundation/audio/drm/WidevineError$InvalidLicenseUrl;", "Lcom/amazon/alexa/assistant/foundation/audio/drm/WidevineError$LicenseAcquisitionFailed;", "Lcom/amazon/alexa/assistant/foundation/audio/drm/WidevineError$MediaDrmException;", "Lcom/amazon/alexa/assistant/foundation/audio/drm/WidevineError$MissingDrmCallback;", "Lcom/amazon/alexa/assistant/foundation/audio/drm/WidevineError$ProvisioningFailed;", "Lcom/amazon/alexa/assistant/foundation/audio/drm/WidevineError$UnsupportedMediaType;", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class WidevineError extends Exception {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/audio/drm/WidevineError$InvalidLicenseUrl;", "Lcom/amazon/alexa/assistant/foundation/audio/drm/WidevineError;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InvalidLicenseUrl extends WidevineError {

        @NotNull
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InvalidLicenseUrl(@NotNull String str) {
            super(null);
            str.getClass();
            this.message = str;
        }

        public static /* synthetic */ InvalidLicenseUrl copy$default(InvalidLicenseUrl invalidLicenseUrl, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = invalidLicenseUrl.message;
            }
            return invalidLicenseUrl.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        public final InvalidLicenseUrl copy(@NotNull String message) {
            message.getClass();
            return new InvalidLicenseUrl(message);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InvalidLicenseUrl) && Intrinsics.areEqual(this.message, ((InvalidLicenseUrl) other).message);
        }

        @Override // java.lang.Throwable
        @NotNull
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("InvalidLicenseUrl(message=", this.message, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/audio/drm/WidevineError$LicenseAcquisitionFailed;", "Lcom/amazon/alexa/assistant/foundation/audio/drm/WidevineError;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LicenseAcquisitionFailed extends WidevineError {

        @NotNull
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LicenseAcquisitionFailed(@NotNull String str) {
            super(null);
            str.getClass();
            this.message = str;
        }

        public static /* synthetic */ LicenseAcquisitionFailed copy$default(LicenseAcquisitionFailed licenseAcquisitionFailed, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = licenseAcquisitionFailed.message;
            }
            return licenseAcquisitionFailed.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        public final LicenseAcquisitionFailed copy(@NotNull String message) {
            message.getClass();
            return new LicenseAcquisitionFailed(message);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LicenseAcquisitionFailed) && Intrinsics.areEqual(this.message, ((LicenseAcquisitionFailed) other).message);
        }

        @Override // java.lang.Throwable
        @NotNull
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("LicenseAcquisitionFailed(message=", this.message, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/audio/drm/WidevineError$MediaDrmException;", "Lcom/amazon/alexa/assistant/foundation/audio/drm/WidevineError;", "message", "", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getMessage", "()Ljava/lang/String;", "getCause", "()Ljava/lang/Throwable;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MediaDrmException extends WidevineError {

        @Nullable
        private final Throwable cause;

        @NotNull
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaDrmException(@NotNull String str, @Nullable Throwable th) {
            super(null);
            str.getClass();
            this.message = str;
            this.cause = th;
        }

        public static /* synthetic */ MediaDrmException copy$default(MediaDrmException mediaDrmException, String str, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                str = mediaDrmException.message;
            }
            if ((i & 2) != 0) {
                th = mediaDrmException.cause;
            }
            return mediaDrmException.copy(str, th);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final Throwable getCause() {
            return this.cause;
        }

        @NotNull
        public final MediaDrmException copy(@NotNull String message, @Nullable Throwable cause) {
            message.getClass();
            return new MediaDrmException(message, cause);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MediaDrmException)) {
                return false;
            }
            MediaDrmException mediaDrmException = (MediaDrmException) other;
            return Intrinsics.areEqual(this.message, mediaDrmException.message) && Intrinsics.areEqual(this.cause, mediaDrmException.cause);
        }

        @Override // java.lang.Throwable
        @Nullable
        public Throwable getCause() {
            return this.cause;
        }

        @Override // java.lang.Throwable
        @NotNull
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            int hashCode = this.message.hashCode() * 31;
            Throwable th = this.cause;
            return hashCode + (th == null ? 0 : th.hashCode());
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return "MediaDrmException(message=" + this.message + ", cause=" + this.cause + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/audio/drm/WidevineError$ProvisioningFailed;", "Lcom/amazon/alexa/assistant/foundation/audio/drm/WidevineError;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProvisioningFailed extends WidevineError {

        @NotNull
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProvisioningFailed(@NotNull String str) {
            super(null);
            str.getClass();
            this.message = str;
        }

        public static /* synthetic */ ProvisioningFailed copy$default(ProvisioningFailed provisioningFailed, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = provisioningFailed.message;
            }
            return provisioningFailed.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        public final ProvisioningFailed copy(@NotNull String message) {
            message.getClass();
            return new ProvisioningFailed(message);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ProvisioningFailed) && Intrinsics.areEqual(this.message, ((ProvisioningFailed) other).message);
        }

        @Override // java.lang.Throwable
        @NotNull
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("ProvisioningFailed(message=", this.message, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/audio/drm/WidevineError$UnsupportedMediaType;", "Lcom/amazon/alexa/assistant/foundation/audio/drm/WidevineError;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UnsupportedMediaType extends WidevineError {

        @NotNull
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnsupportedMediaType(@NotNull String str) {
            super(null);
            str.getClass();
            this.message = str;
        }

        public static /* synthetic */ UnsupportedMediaType copy$default(UnsupportedMediaType unsupportedMediaType, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = unsupportedMediaType.message;
            }
            return unsupportedMediaType.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        public final UnsupportedMediaType copy(@NotNull String message) {
            message.getClass();
            return new UnsupportedMediaType(message);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UnsupportedMediaType) && Intrinsics.areEqual(this.message, ((UnsupportedMediaType) other).message);
        }

        @Override // java.lang.Throwable
        @NotNull
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("UnsupportedMediaType(message=", this.message, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    public /* synthetic */ WidevineError(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private WidevineError() {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/audio/drm/WidevineError$MissingDrmCallback;", "Lcom/amazon/alexa/assistant/foundation/audio/drm/WidevineError;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MissingDrmCallback extends WidevineError {

        @NotNull
        private final String message;

        public /* synthetic */ MissingDrmCallback(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "DRM content received but no DRM license callback configured. Host app must provide a DrmLicenseCallback to play DRM-protected content." : str);
        }

        public static /* synthetic */ MissingDrmCallback copy$default(MissingDrmCallback missingDrmCallback, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = missingDrmCallback.message;
            }
            return missingDrmCallback.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        public final MissingDrmCallback copy(@NotNull String message) {
            message.getClass();
            return new MissingDrmCallback(message);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MissingDrmCallback) && Intrinsics.areEqual(this.message, ((MissingDrmCallback) other).message);
        }

        @Override // java.lang.Throwable
        @NotNull
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("MissingDrmCallback(message=", this.message, MarkdownConstants.RIGHT_PARENTHESIS);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public MissingDrmCallback() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MissingDrmCallback(@NotNull String str) {
            super(null);
            str.getClass();
            this.message = str;
        }
    }
}
