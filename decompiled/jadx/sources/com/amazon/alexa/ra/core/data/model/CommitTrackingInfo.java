package com.amazon.alexa.ra.core.data.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.dee.app.ui.web.AlexaDeviceBackgroundImageBridge;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/CommitTrackingInfo;", "", AlexaDeviceBackgroundImageBridge.KEY_NODE_ID, "", "metricsData", "Lcom/amazon/alexa/ra/core/data/model/ApiMetricsData;", "<init>", "(Ljava/lang/String;Lcom/amazon/alexa/ra/core/data/model/ApiMetricsData;)V", "getNodeId", "()Ljava/lang/String;", "getMetricsData", "()Lcom/amazon/alexa/ra/core/data/model/ApiMetricsData;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class CommitTrackingInfo {
    public static final int $stable = 0;

    @NotNull
    private final ApiMetricsData metricsData;

    @NotNull
    private final String nodeId;

    public CommitTrackingInfo(@NotNull String str, @NotNull ApiMetricsData apiMetricsData) {
        str.getClass();
        apiMetricsData.getClass();
        this.nodeId = str;
        this.metricsData = apiMetricsData;
    }

    public static /* synthetic */ CommitTrackingInfo copy$default(CommitTrackingInfo commitTrackingInfo, String str, ApiMetricsData apiMetricsData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = commitTrackingInfo.nodeId;
        }
        if ((i & 2) != 0) {
            apiMetricsData = commitTrackingInfo.metricsData;
        }
        return commitTrackingInfo.copy(str, apiMetricsData);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getNodeId() {
        return this.nodeId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ApiMetricsData getMetricsData() {
        return this.metricsData;
    }

    @NotNull
    public final CommitTrackingInfo copy(@NotNull String nodeId, @NotNull ApiMetricsData metricsData) {
        nodeId.getClass();
        metricsData.getClass();
        return new CommitTrackingInfo(nodeId, metricsData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommitTrackingInfo)) {
            return false;
        }
        CommitTrackingInfo commitTrackingInfo = (CommitTrackingInfo) other;
        return Intrinsics.areEqual(this.nodeId, commitTrackingInfo.nodeId) && Intrinsics.areEqual(this.metricsData, commitTrackingInfo.metricsData);
    }

    @NotNull
    public final ApiMetricsData getMetricsData() {
        return this.metricsData;
    }

    @NotNull
    public final String getNodeId() {
        return this.nodeId;
    }

    public int hashCode() {
        return this.metricsData.hashCode() + (this.nodeId.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "CommitTrackingInfo(nodeId=" + this.nodeId + ", metricsData=" + this.metricsData + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
