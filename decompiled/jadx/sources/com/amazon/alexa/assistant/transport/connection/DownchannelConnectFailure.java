package com.amazon.alexa.assistant.transport.connection;

import com.amazon.alexa.assistant.transport.model.MetricName;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/assistant/transport/connection/DownchannelConnectFailure;", "", "reason", "Lcom/amazon/alexa/assistant/transport/connection/DownchannelFailureReason;", "reasonMetric", "Lcom/amazon/alexa/assistant/transport/model/MetricName;", "<init>", "(Lcom/amazon/alexa/assistant/transport/connection/DownchannelFailureReason;Lcom/amazon/alexa/assistant/transport/model/MetricName;)V", "getReason", "()Lcom/amazon/alexa/assistant/transport/connection/DownchannelFailureReason;", "getReasonMetric", "()Lcom/amazon/alexa/assistant/transport/model/MetricName;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "transport_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class DownchannelConnectFailure {

    @NotNull
    private final DownchannelFailureReason reason;

    @NotNull
    private final MetricName reasonMetric;

    public DownchannelConnectFailure(@NotNull DownchannelFailureReason downchannelFailureReason, @NotNull MetricName metricName) {
        downchannelFailureReason.getClass();
        metricName.getClass();
        this.reason = downchannelFailureReason;
        this.reasonMetric = metricName;
    }

    public static /* synthetic */ DownchannelConnectFailure copy$default(DownchannelConnectFailure downchannelConnectFailure, DownchannelFailureReason downchannelFailureReason, MetricName metricName, int i, Object obj) {
        if ((i & 1) != 0) {
            downchannelFailureReason = downchannelConnectFailure.reason;
        }
        if ((i & 2) != 0) {
            metricName = downchannelConnectFailure.reasonMetric;
        }
        return downchannelConnectFailure.copy(downchannelFailureReason, metricName);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final DownchannelFailureReason getReason() {
        return this.reason;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final MetricName getReasonMetric() {
        return this.reasonMetric;
    }

    @NotNull
    public final DownchannelConnectFailure copy(@NotNull DownchannelFailureReason reason, @NotNull MetricName reasonMetric) {
        reason.getClass();
        reasonMetric.getClass();
        return new DownchannelConnectFailure(reason, reasonMetric);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DownchannelConnectFailure)) {
            return false;
        }
        DownchannelConnectFailure downchannelConnectFailure = (DownchannelConnectFailure) other;
        return this.reason == downchannelConnectFailure.reason && this.reasonMetric == downchannelConnectFailure.reasonMetric;
    }

    @NotNull
    public final DownchannelFailureReason getReason() {
        return this.reason;
    }

    @NotNull
    public final MetricName getReasonMetric() {
        return this.reasonMetric;
    }

    public int hashCode() {
        return this.reasonMetric.hashCode() + (this.reason.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "DownchannelConnectFailure(reason=" + this.reason + ", reasonMetric=" + this.reasonMetric + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
