package com.amazon.alexa.cam.api;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.dee.app.ui.web.AlexaDeviceBackgroundImageBridge;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/cam/api/StatusError;", "", AlexaDeviceBackgroundImageBridge.KEY_NODE_ID, "", "errorCode", "errorDescription", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getErrorCode", "()Ljava/lang/String;", "getErrorDescription", "getNodeId", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaMobileAndroidSimbaClient_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class StatusError {

    @NotNull
    private final String errorCode;

    @NotNull
    private final String errorDescription;

    @NotNull
    private final String nodeId;

    public StatusError(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        ParcelCompat$$ExternalSyntheticOutline0.m(str, str2, str3);
        this.nodeId = str;
        this.errorCode = str2;
        this.errorDescription = str3;
    }

    public static /* synthetic */ StatusError copy$default(StatusError statusError, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = statusError.nodeId;
        }
        if ((i & 2) != 0) {
            str2 = statusError.errorCode;
        }
        if ((i & 4) != 0) {
            str3 = statusError.errorDescription;
        }
        return statusError.copy(str, str2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getNodeId() {
        return this.nodeId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getErrorDescription() {
        return this.errorDescription;
    }

    @NotNull
    public final StatusError copy(@NotNull String nodeId, @NotNull String errorCode, @NotNull String errorDescription) {
        nodeId.getClass();
        errorCode.getClass();
        errorDescription.getClass();
        return new StatusError(nodeId, errorCode, errorDescription);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatusError)) {
            return false;
        }
        StatusError statusError = (StatusError) other;
        return Intrinsics.areEqual(this.nodeId, statusError.nodeId) && Intrinsics.areEqual(this.errorCode, statusError.errorCode) && Intrinsics.areEqual(this.errorDescription, statusError.errorDescription);
    }

    @NotNull
    public final String getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    public final String getErrorDescription() {
        return this.errorDescription;
    }

    @NotNull
    public final String getNodeId() {
        return this.nodeId;
    }

    public int hashCode() {
        return this.errorDescription.hashCode() + ArcMode$$ExternalSyntheticOutline0.m(this.nodeId.hashCode() * 31, 31, this.errorCode);
    }

    @NotNull
    public String toString() {
        String str = this.nodeId;
        String str2 = this.errorCode;
        return a$$ExternalSyntheticOutline0.m(ErrorUtils$$ExternalSyntheticOutline0.m("StatusError(nodeId=", str, ", errorCode=", str2, ", errorDescription="), this.errorDescription, MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
