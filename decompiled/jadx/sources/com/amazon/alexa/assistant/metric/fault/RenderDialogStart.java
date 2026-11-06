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
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J5\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/amazon/alexa/assistant/metric/fault/RenderDialogStart;", "", AlexaMetricsConstants.AssistantSdkDimensions.INITIATOR, "Lcom/amazon/alexa/assistant/metric/fault/RenderInitiator;", "invocationType", "", "interactionLabel", "isExpectSpeechInitiated", "", "<init>", "(Lcom/amazon/alexa/assistant/metric/fault/RenderInitiator;Ljava/lang/String;Ljava/lang/String;Z)V", "getInitiator", "()Lcom/amazon/alexa/assistant/metric/fault/RenderInitiator;", "getInvocationType", "()Ljava/lang/String;", "getInteractionLabel", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class RenderDialogStart {

    @NotNull
    private final RenderInitiator initiator;

    @Nullable
    private final String interactionLabel;

    @Nullable
    private final String invocationType;
    private final boolean isExpectSpeechInitiated;

    public /* synthetic */ RenderDialogStart(RenderInitiator renderInitiator, String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(renderInitiator, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? false : z);
    }

    public static /* synthetic */ RenderDialogStart copy$default(RenderDialogStart renderDialogStart, RenderInitiator renderInitiator, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            renderInitiator = renderDialogStart.initiator;
        }
        if ((i & 2) != 0) {
            str = renderDialogStart.invocationType;
        }
        if ((i & 4) != 0) {
            str2 = renderDialogStart.interactionLabel;
        }
        if ((i & 8) != 0) {
            z = renderDialogStart.isExpectSpeechInitiated;
        }
        return renderDialogStart.copy(renderInitiator, str, str2, z);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final RenderInitiator getInitiator() {
        return this.initiator;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getInvocationType() {
        return this.invocationType;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getInteractionLabel() {
        return this.interactionLabel;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsExpectSpeechInitiated() {
        return this.isExpectSpeechInitiated;
    }

    @NotNull
    public final RenderDialogStart copy(@NotNull RenderInitiator initiator, @Nullable String invocationType, @Nullable String interactionLabel, boolean isExpectSpeechInitiated) {
        initiator.getClass();
        return new RenderDialogStart(initiator, invocationType, interactionLabel, isExpectSpeechInitiated);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RenderDialogStart)) {
            return false;
        }
        RenderDialogStart renderDialogStart = (RenderDialogStart) other;
        return this.initiator == renderDialogStart.initiator && Intrinsics.areEqual(this.invocationType, renderDialogStart.invocationType) && Intrinsics.areEqual(this.interactionLabel, renderDialogStart.interactionLabel) && this.isExpectSpeechInitiated == renderDialogStart.isExpectSpeechInitiated;
    }

    @NotNull
    public final RenderInitiator getInitiator() {
        return this.initiator;
    }

    @Nullable
    public final String getInteractionLabel() {
        return this.interactionLabel;
    }

    @Nullable
    public final String getInvocationType() {
        return this.invocationType;
    }

    public int hashCode() {
        int hashCode = this.initiator.hashCode() * 31;
        String str = this.invocationType;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.interactionLabel;
        return Boolean.hashCode(this.isExpectSpeechInitiated) + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final boolean isExpectSpeechInitiated() {
        return this.isExpectSpeechInitiated;
    }

    @NotNull
    public String toString() {
        return "RenderDialogStart(initiator=" + this.initiator + ", invocationType=" + this.invocationType + ", interactionLabel=" + this.interactionLabel + ", isExpectSpeechInitiated=" + this.isExpectSpeechInitiated + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public RenderDialogStart(@NotNull RenderInitiator renderInitiator, @Nullable String str, @Nullable String str2, boolean z) {
        renderInitiator.getClass();
        this.initiator = renderInitiator;
        this.invocationType = str;
        this.interactionLabel = str2;
        this.isExpectSpeechInitiated = z;
    }
}
