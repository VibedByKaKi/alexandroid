package com.amazon.alexa.ra.core.data.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J5\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/ApiResultData;", "", "apiType", "Lcom/amazon/alexa/ra/core/data/model/UploadApiType;", "metricsData", "Lcom/amazon/alexa/ra/core/data/model/ApiMetricsData;", "eventSource", "", "errorInfo", "Lcom/amazon/alexa/ra/core/data/model/UploadErrorInfo;", "<init>", "(Lcom/amazon/alexa/ra/core/data/model/UploadApiType;Lcom/amazon/alexa/ra/core/data/model/ApiMetricsData;Ljava/lang/String;Lcom/amazon/alexa/ra/core/data/model/UploadErrorInfo;)V", "getApiType", "()Lcom/amazon/alexa/ra/core/data/model/UploadApiType;", "getMetricsData", "()Lcom/amazon/alexa/ra/core/data/model/ApiMetricsData;", "getEventSource", "()Ljava/lang/String;", "getErrorInfo", "()Lcom/amazon/alexa/ra/core/data/model/UploadErrorInfo;", "component1", "component2", "component3", "component4", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class ApiResultData {
    public static final int $stable = UploadErrorInfo.$stable;

    @NotNull
    private final UploadApiType apiType;

    @Nullable
    private final UploadErrorInfo errorInfo;

    @Nullable
    private final String eventSource;

    @NotNull
    private final ApiMetricsData metricsData;

    public ApiResultData(@NotNull UploadApiType uploadApiType, @NotNull ApiMetricsData apiMetricsData, @Nullable String str, @Nullable UploadErrorInfo uploadErrorInfo) {
        uploadApiType.getClass();
        apiMetricsData.getClass();
        this.apiType = uploadApiType;
        this.metricsData = apiMetricsData;
        this.eventSource = str;
        this.errorInfo = uploadErrorInfo;
    }

    public static /* synthetic */ ApiResultData copy$default(ApiResultData apiResultData, UploadApiType uploadApiType, ApiMetricsData apiMetricsData, String str, UploadErrorInfo uploadErrorInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            uploadApiType = apiResultData.apiType;
        }
        if ((i & 2) != 0) {
            apiMetricsData = apiResultData.metricsData;
        }
        if ((i & 4) != 0) {
            str = apiResultData.eventSource;
        }
        if ((i & 8) != 0) {
            uploadErrorInfo = apiResultData.errorInfo;
        }
        return apiResultData.copy(uploadApiType, apiMetricsData, str, uploadErrorInfo);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final UploadApiType getApiType() {
        return this.apiType;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ApiMetricsData getMetricsData() {
        return this.metricsData;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getEventSource() {
        return this.eventSource;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final UploadErrorInfo getErrorInfo() {
        return this.errorInfo;
    }

    @NotNull
    public final ApiResultData copy(@NotNull UploadApiType apiType, @NotNull ApiMetricsData metricsData, @Nullable String eventSource, @Nullable UploadErrorInfo errorInfo) {
        apiType.getClass();
        metricsData.getClass();
        return new ApiResultData(apiType, metricsData, eventSource, errorInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiResultData)) {
            return false;
        }
        ApiResultData apiResultData = (ApiResultData) other;
        return this.apiType == apiResultData.apiType && Intrinsics.areEqual(this.metricsData, apiResultData.metricsData) && Intrinsics.areEqual(this.eventSource, apiResultData.eventSource) && Intrinsics.areEqual(this.errorInfo, apiResultData.errorInfo);
    }

    @NotNull
    public final UploadApiType getApiType() {
        return this.apiType;
    }

    @Nullable
    public final UploadErrorInfo getErrorInfo() {
        return this.errorInfo;
    }

    @Nullable
    public final String getEventSource() {
        return this.eventSource;
    }

    @NotNull
    public final ApiMetricsData getMetricsData() {
        return this.metricsData;
    }

    public int hashCode() {
        int hashCode = (this.metricsData.hashCode() + (this.apiType.hashCode() * 31)) * 31;
        String str = this.eventSource;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        UploadErrorInfo uploadErrorInfo = this.errorInfo;
        return hashCode2 + (uploadErrorInfo != null ? uploadErrorInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ApiResultData(apiType=" + this.apiType + ", metricsData=" + this.metricsData + ", eventSource=" + this.eventSource + ", errorInfo=" + this.errorInfo + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public /* synthetic */ ApiResultData(UploadApiType uploadApiType, ApiMetricsData apiMetricsData, String str, UploadErrorInfo uploadErrorInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uploadApiType, apiMetricsData, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : uploadErrorInfo);
    }
}
