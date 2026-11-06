package com.amazon.alexa.accessory.speechapi.vision;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/accessory/speechapi/vision/VisionCaptureError;", "", "errorCode", "", "message", "details", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDetails", "()Ljava/lang/String;", "getErrorCode", "getMessage", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "Companion", "AlexaAccessoryAndroid-speech-api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class VisionCaptureError {

    @NotNull
    public static final String ERROR_CAPTURE_FAILED = "CAPTURE_FAILED";

    @NotNull
    public static final String ERROR_CONFIGURATION_INVALID = "CONFIGURATION_INVALID";

    @NotNull
    public static final String ERROR_PERMISSION_DENIED = "PERMISSION_DENIED";

    @NotNull
    public static final String ERROR_RESOURCE_UNAVAILABLE = "RESOURCE_UNAVAILABLE";

    @NotNull
    public static final String ERROR_UNKNOWN = "UNKNOWN";

    @Nullable
    private final String details;

    @NotNull
    private final String errorCode;

    @NotNull
    private final String message;

    public VisionCaptureError(@NotNull String str, @NotNull String str2, @Nullable String str3) {
        str.getClass();
        str2.getClass();
        this.errorCode = str;
        this.message = str2;
        this.details = str3;
    }

    public static /* synthetic */ VisionCaptureError copy$default(VisionCaptureError visionCaptureError, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = visionCaptureError.errorCode;
        }
        if ((i & 2) != 0) {
            str2 = visionCaptureError.message;
        }
        if ((i & 4) != 0) {
            str3 = visionCaptureError.details;
        }
        return visionCaptureError.copy(str, str2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getDetails() {
        return this.details;
    }

    @NotNull
    public final VisionCaptureError copy(@NotNull String errorCode, @NotNull String message, @Nullable String details) {
        errorCode.getClass();
        message.getClass();
        return new VisionCaptureError(errorCode, message, details);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VisionCaptureError)) {
            return false;
        }
        VisionCaptureError visionCaptureError = (VisionCaptureError) other;
        return Intrinsics.areEqual(this.errorCode, visionCaptureError.errorCode) && Intrinsics.areEqual(this.message, visionCaptureError.message) && Intrinsics.areEqual(this.details, visionCaptureError.details);
    }

    @Nullable
    public final String getDetails() {
        return this.details;
    }

    @NotNull
    public final String getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        int m = ArcMode$$ExternalSyntheticOutline0.m(this.errorCode.hashCode() * 31, 31, this.message);
        String str = this.details;
        return m + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.errorCode;
        String str2 = this.message;
        return a$$ExternalSyntheticOutline0.m(ErrorUtils$$ExternalSyntheticOutline0.m("VisionCaptureError(errorCode=", str, ", message=", str2, ", details="), this.details, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public /* synthetic */ VisionCaptureError(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3);
    }
}
