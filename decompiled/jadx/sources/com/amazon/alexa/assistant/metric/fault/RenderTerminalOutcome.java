package com.amazon.alexa.assistant.metric.fault;

import com.amazon.alexa.client.metrics.core.AlexaMetricsConstants;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J3\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/amazon/alexa/assistant/metric/fault/RenderTerminalOutcome;", "", "status", "Lcom/amazon/alexa/assistant/metric/fault/DialogStatus;", AlexaMetricsConstants.AssistantSdkDimensions.INITIATOR, "Lcom/amazon/alexa/assistant/metric/fault/RenderInitiator;", AlexaMetricsConstants.AssistantSdkDimensions.FAILURE_REASON, "", "isNetworkFailure", "", "<init>", "(Lcom/amazon/alexa/assistant/metric/fault/DialogStatus;Lcom/amazon/alexa/assistant/metric/fault/RenderInitiator;Ljava/lang/String;Z)V", "getStatus", "()Lcom/amazon/alexa/assistant/metric/fault/DialogStatus;", "getInitiator", "()Lcom/amazon/alexa/assistant/metric/fault/RenderInitiator;", "getFailureReason", "()Ljava/lang/String;", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class RenderTerminalOutcome {

    @Nullable
    private final String failureReason;

    @NotNull
    private final RenderInitiator initiator;
    private final boolean isNetworkFailure;

    @NotNull
    private final DialogStatus status;

    public RenderTerminalOutcome(@NotNull DialogStatus dialogStatus, @NotNull RenderInitiator renderInitiator, @Nullable String str, boolean z) {
        dialogStatus.getClass();
        renderInitiator.getClass();
        this.status = dialogStatus;
        this.initiator = renderInitiator;
        this.failureReason = str;
        this.isNetworkFailure = z;
    }

    public static /* synthetic */ RenderTerminalOutcome copy$default(RenderTerminalOutcome renderTerminalOutcome, DialogStatus dialogStatus, RenderInitiator renderInitiator, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            dialogStatus = renderTerminalOutcome.status;
        }
        if ((i & 2) != 0) {
            renderInitiator = renderTerminalOutcome.initiator;
        }
        if ((i & 4) != 0) {
            str = renderTerminalOutcome.failureReason;
        }
        if ((i & 8) != 0) {
            z = renderTerminalOutcome.isNetworkFailure;
        }
        return renderTerminalOutcome.copy(dialogStatus, renderInitiator, str, z);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final DialogStatus getStatus() {
        return this.status;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final RenderInitiator getInitiator() {
        return this.initiator;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getFailureReason() {
        return this.failureReason;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsNetworkFailure() {
        return this.isNetworkFailure;
    }

    @NotNull
    public final RenderTerminalOutcome copy(@NotNull DialogStatus status, @NotNull RenderInitiator initiator, @Nullable String failureReason, boolean isNetworkFailure) {
        status.getClass();
        initiator.getClass();
        return new RenderTerminalOutcome(status, initiator, failureReason, isNetworkFailure);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RenderTerminalOutcome)) {
            return false;
        }
        RenderTerminalOutcome renderTerminalOutcome = (RenderTerminalOutcome) other;
        return this.status == renderTerminalOutcome.status && this.initiator == renderTerminalOutcome.initiator && Intrinsics.areEqual(this.failureReason, renderTerminalOutcome.failureReason) && this.isNetworkFailure == renderTerminalOutcome.isNetworkFailure;
    }

    @Nullable
    public final String getFailureReason() {
        return this.failureReason;
    }

    @NotNull
    public final RenderInitiator getInitiator() {
        return this.initiator;
    }

    @NotNull
    public final DialogStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        int hashCode = (this.initiator.hashCode() + (this.status.hashCode() * 31)) * 31;
        String str = this.failureReason;
        return Boolean.hashCode(this.isNetworkFailure) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final boolean isNetworkFailure() {
        return this.isNetworkFailure;
    }

    @NotNull
    public String toString() {
        return "RenderTerminalOutcome(status=" + this.status + ", initiator=" + this.initiator + ", failureReason=" + this.failureReason + ", isNetworkFailure=" + this.isNetworkFailure + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public /* synthetic */ RenderTerminalOutcome(DialogStatus dialogStatus, RenderInitiator renderInitiator, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(dialogStatus, renderInitiator, (i & 4) != 0 ? null : str, (i & 8) != 0 ? false : z);
    }
}
