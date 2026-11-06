package com.amazon.comms.calling.foundation.metrics;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/amazon/comms/calling/foundation/metrics/ErrorInfo;", "", "errorSource", "", "requestId", "statusCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getErrorSource", "()Ljava/lang/String;", "getRequestId", "getStatusCode", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class ErrorInfo {

    @Nullable
    private final String errorSource;

    @Nullable
    private final String requestId;

    @Nullable
    private final String statusCode;

    public /* synthetic */ ErrorInfo(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public static /* synthetic */ ErrorInfo copy$default(ErrorInfo errorInfo, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = errorInfo.errorSource;
        }
        if ((i & 2) != 0) {
            str2 = errorInfo.requestId;
        }
        if ((i & 4) != 0) {
            str3 = errorInfo.statusCode;
        }
        return errorInfo.copy(str, str2, str3);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getErrorSource() {
        return this.errorSource;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getStatusCode() {
        return this.statusCode;
    }

    @NotNull
    public final ErrorInfo copy(@Nullable String errorSource, @Nullable String requestId, @Nullable String statusCode) {
        return new ErrorInfo(errorSource, requestId, statusCode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorInfo)) {
            return false;
        }
        ErrorInfo errorInfo = (ErrorInfo) other;
        return Intrinsics.areEqual(this.errorSource, errorInfo.errorSource) && Intrinsics.areEqual(this.requestId, errorInfo.requestId) && Intrinsics.areEqual(this.statusCode, errorInfo.statusCode);
    }

    @Nullable
    public final String getErrorSource() {
        return this.errorSource;
    }

    @Nullable
    public final String getRequestId() {
        return this.requestId;
    }

    @Nullable
    public final String getStatusCode() {
        return this.statusCode;
    }

    public int hashCode() {
        String str = this.errorSource;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.requestId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.statusCode;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.errorSource;
        String str2 = this.requestId;
        return a$$ExternalSyntheticOutline0.m(ErrorUtils$$ExternalSyntheticOutline0.m("ErrorInfo(errorSource=", str, ", requestId=", str2, ", statusCode="), this.statusCode, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public ErrorInfo(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.errorSource = str;
        this.requestId = str2;
        this.statusCode = str3;
    }

    public ErrorInfo() {
        this(null, null, null, 7, null);
    }
}
