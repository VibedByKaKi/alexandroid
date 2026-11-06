package com.amazon.comms.calling.domain.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.comms.calling.service.HangupReason;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, d2 = {"Lcom/amazon/comms/calling/domain/model/Ended;", "Lcom/amazon/comms/calling/domain/model/CallUIState;", "callModel", "Lcom/amazon/comms/calling/domain/model/CallModel;", "shouldShowRatingModel", "Lcom/amazon/comms/calling/domain/model/ShouldShowRatingModel;", "endReason", "Lcom/amazon/comms/calling/service/HangupReason;", "origin", "Lcom/amazon/comms/calling/domain/model/CallOrigin;", "<init>", "(Lcom/amazon/comms/calling/domain/model/CallModel;Lcom/amazon/comms/calling/domain/model/ShouldShowRatingModel;Lcom/amazon/comms/calling/service/HangupReason;Lcom/amazon/comms/calling/domain/model/CallOrigin;)V", "getCallModel", "()Lcom/amazon/comms/calling/domain/model/CallModel;", "getShouldShowRatingModel", "()Lcom/amazon/comms/calling/domain/model/ShouldShowRatingModel;", "getEndReason", "()Lcom/amazon/comms/calling/service/HangupReason;", "getOrigin", "()Lcom/amazon/comms/calling/domain/model/CallOrigin;", "component1", "component2", "component3", "component4", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class Ended extends CallUIState {

    @NotNull
    private final CallModel callModel;

    @Nullable
    private final HangupReason endReason;

    @Nullable
    private final CallOrigin origin;

    @Nullable
    private final ShouldShowRatingModel shouldShowRatingModel;

    public /* synthetic */ Ended(CallModel callModel, ShouldShowRatingModel shouldShowRatingModel, HangupReason hangupReason, CallOrigin callOrigin, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(callModel, (i & 2) != 0 ? null : shouldShowRatingModel, (i & 4) != 0 ? null : hangupReason, (i & 8) != 0 ? null : callOrigin);
    }

    public static /* synthetic */ Ended copy$default(Ended ended, CallModel callModel, ShouldShowRatingModel shouldShowRatingModel, HangupReason hangupReason, CallOrigin callOrigin, int i, Object obj) {
        if ((i & 1) != 0) {
            callModel = ended.callModel;
        }
        if ((i & 2) != 0) {
            shouldShowRatingModel = ended.shouldShowRatingModel;
        }
        if ((i & 4) != 0) {
            hangupReason = ended.endReason;
        }
        if ((i & 8) != 0) {
            callOrigin = ended.origin;
        }
        return ended.copy(callModel, shouldShowRatingModel, hangupReason, callOrigin);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final CallModel getCallModel() {
        return this.callModel;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final ShouldShowRatingModel getShouldShowRatingModel() {
        return this.shouldShowRatingModel;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final HangupReason getEndReason() {
        return this.endReason;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final CallOrigin getOrigin() {
        return this.origin;
    }

    @NotNull
    public final Ended copy(@NotNull CallModel callModel, @Nullable ShouldShowRatingModel shouldShowRatingModel, @Nullable HangupReason endReason, @Nullable CallOrigin origin) {
        callModel.getClass();
        return new Ended(callModel, shouldShowRatingModel, endReason, origin);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Ended)) {
            return false;
        }
        Ended ended = (Ended) other;
        return Intrinsics.areEqual(this.callModel, ended.callModel) && Intrinsics.areEqual(this.shouldShowRatingModel, ended.shouldShowRatingModel) && this.endReason == ended.endReason && this.origin == ended.origin;
    }

    @NotNull
    public final CallModel getCallModel() {
        return this.callModel;
    }

    @Nullable
    public final HangupReason getEndReason() {
        return this.endReason;
    }

    @Nullable
    public final CallOrigin getOrigin() {
        return this.origin;
    }

    @Nullable
    public final ShouldShowRatingModel getShouldShowRatingModel() {
        return this.shouldShowRatingModel;
    }

    public int hashCode() {
        int hashCode = this.callModel.hashCode() * 31;
        ShouldShowRatingModel shouldShowRatingModel = this.shouldShowRatingModel;
        int hashCode2 = (hashCode + (shouldShowRatingModel == null ? 0 : shouldShowRatingModel.hashCode())) * 31;
        HangupReason hangupReason = this.endReason;
        int hashCode3 = (hashCode2 + (hangupReason == null ? 0 : hangupReason.hashCode())) * 31;
        CallOrigin callOrigin = this.origin;
        return hashCode3 + (callOrigin != null ? callOrigin.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Ended(callModel=" + this.callModel + ", shouldShowRatingModel=" + this.shouldShowRatingModel + ", endReason=" + this.endReason + ", origin=" + this.origin + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ended(@NotNull CallModel callModel, @Nullable ShouldShowRatingModel shouldShowRatingModel, @Nullable HangupReason hangupReason, @Nullable CallOrigin callOrigin) {
        super(null);
        callModel.getClass();
        this.callModel = callModel;
        this.shouldShowRatingModel = shouldShowRatingModel;
        this.endReason = hangupReason;
        this.origin = callOrigin;
    }
}
