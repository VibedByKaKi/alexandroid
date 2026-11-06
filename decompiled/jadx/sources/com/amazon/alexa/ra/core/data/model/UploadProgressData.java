package com.amazon.alexa.ra.core.data.model;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.dee.app.ui.web.AlexaDeviceBackgroundImageBridge;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/UploadProgressData;", "", AlexaDeviceBackgroundImageBridge.KEY_NODE_ID, "", "processorId", "metricsData", "Lcom/amazon/alexa/ra/core/data/model/ApiMetricsData;", "conversationId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/amazon/alexa/ra/core/data/model/ApiMetricsData;Ljava/lang/String;)V", "getNodeId", "()Ljava/lang/String;", "getProcessorId", "getMetricsData", "()Lcom/amazon/alexa/ra/core/data/model/ApiMetricsData;", "getConversationId", "component1", "component2", "component3", "component4", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class UploadProgressData {
    public static final int $stable = 0;

    @Nullable
    private final String conversationId;

    @NotNull
    private final ApiMetricsData metricsData;

    @Nullable
    private final String nodeId;

    @Nullable
    private final String processorId;

    public /* synthetic */ UploadProgressData(String str, String str2, ApiMetricsData apiMetricsData, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, apiMetricsData, (i & 8) != 0 ? null : str3);
    }

    public static /* synthetic */ UploadProgressData copy$default(UploadProgressData uploadProgressData, String str, String str2, ApiMetricsData apiMetricsData, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uploadProgressData.nodeId;
        }
        if ((i & 2) != 0) {
            str2 = uploadProgressData.processorId;
        }
        if ((i & 4) != 0) {
            apiMetricsData = uploadProgressData.metricsData;
        }
        if ((i & 8) != 0) {
            str3 = uploadProgressData.conversationId;
        }
        return uploadProgressData.copy(str, str2, apiMetricsData, str3);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getNodeId() {
        return this.nodeId;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getProcessorId() {
        return this.processorId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final ApiMetricsData getMetricsData() {
        return this.metricsData;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getConversationId() {
        return this.conversationId;
    }

    @NotNull
    public final UploadProgressData copy(@Nullable String nodeId, @Nullable String processorId, @NotNull ApiMetricsData metricsData, @Nullable String conversationId) {
        metricsData.getClass();
        return new UploadProgressData(nodeId, processorId, metricsData, conversationId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploadProgressData)) {
            return false;
        }
        UploadProgressData uploadProgressData = (UploadProgressData) other;
        return Intrinsics.areEqual(this.nodeId, uploadProgressData.nodeId) && Intrinsics.areEqual(this.processorId, uploadProgressData.processorId) && Intrinsics.areEqual(this.metricsData, uploadProgressData.metricsData) && Intrinsics.areEqual(this.conversationId, uploadProgressData.conversationId);
    }

    @Nullable
    public final String getConversationId() {
        return this.conversationId;
    }

    @NotNull
    public final ApiMetricsData getMetricsData() {
        return this.metricsData;
    }

    @Nullable
    public final String getNodeId() {
        return this.nodeId;
    }

    @Nullable
    public final String getProcessorId() {
        return this.processorId;
    }

    public int hashCode() {
        String str = this.nodeId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.processorId;
        int hashCode2 = (this.metricsData.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.conversationId;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.nodeId;
        String str2 = this.processorId;
        ApiMetricsData apiMetricsData = this.metricsData;
        String str3 = this.conversationId;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("UploadProgressData(nodeId=", str, ", processorId=", str2, ", metricsData=");
        m.append(apiMetricsData);
        m.append(", conversationId=");
        m.append(str3);
        m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return m.toString();
    }

    public UploadProgressData(@Nullable String str, @Nullable String str2, @NotNull ApiMetricsData apiMetricsData, @Nullable String str3) {
        apiMetricsData.getClass();
        this.nodeId = str;
        this.processorId = str2;
        this.metricsData = apiMetricsData;
        this.conversationId = str3;
    }
}
