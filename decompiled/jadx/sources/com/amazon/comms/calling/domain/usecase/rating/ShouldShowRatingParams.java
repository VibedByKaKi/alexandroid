package com.amazon.comms.calling.domain.usecase.rating;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.comms.calling.domain.model.CallModel;
import com.amazon.comms.calling.service.HangupReason;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/amazon/comms/calling/domain/usecase/rating/ShouldShowRatingParams;", "", "callModel", "Lcom/amazon/comms/calling/domain/model/CallModel;", "hangupReason", "Lcom/amazon/comms/calling/service/HangupReason;", "<init>", "(Lcom/amazon/comms/calling/domain/model/CallModel;Lcom/amazon/comms/calling/service/HangupReason;)V", "getCallModel", "()Lcom/amazon/comms/calling/domain/model/CallModel;", "getHangupReason", "()Lcom/amazon/comms/calling/service/HangupReason;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class ShouldShowRatingParams {

    @NotNull
    private final CallModel callModel;

    @NotNull
    private final HangupReason hangupReason;

    public ShouldShowRatingParams(@NotNull CallModel callModel, @NotNull HangupReason hangupReason) {
        callModel.getClass();
        hangupReason.getClass();
        this.callModel = callModel;
        this.hangupReason = hangupReason;
    }

    public static /* synthetic */ ShouldShowRatingParams copy$default(ShouldShowRatingParams shouldShowRatingParams, CallModel callModel, HangupReason hangupReason, int i, Object obj) {
        if ((i & 1) != 0) {
            callModel = shouldShowRatingParams.callModel;
        }
        if ((i & 2) != 0) {
            hangupReason = shouldShowRatingParams.hangupReason;
        }
        return shouldShowRatingParams.copy(callModel, hangupReason);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final CallModel getCallModel() {
        return this.callModel;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final HangupReason getHangupReason() {
        return this.hangupReason;
    }

    @NotNull
    public final ShouldShowRatingParams copy(@NotNull CallModel callModel, @NotNull HangupReason hangupReason) {
        callModel.getClass();
        hangupReason.getClass();
        return new ShouldShowRatingParams(callModel, hangupReason);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShouldShowRatingParams)) {
            return false;
        }
        ShouldShowRatingParams shouldShowRatingParams = (ShouldShowRatingParams) other;
        return Intrinsics.areEqual(this.callModel, shouldShowRatingParams.callModel) && this.hangupReason == shouldShowRatingParams.hangupReason;
    }

    @NotNull
    public final CallModel getCallModel() {
        return this.callModel;
    }

    @NotNull
    public final HangupReason getHangupReason() {
        return this.hangupReason;
    }

    public int hashCode() {
        return this.hangupReason.hashCode() + (this.callModel.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "ShouldShowRatingParams(callModel=" + this.callModel + ", hangupReason=" + this.hangupReason + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
