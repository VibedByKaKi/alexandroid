package com.amazon.comms.calling.domain.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/amazon/comms/calling/domain/model/Accepted;", "Lcom/amazon/comms/calling/domain/model/CallUIState;", "callModel", "Lcom/amazon/comms/calling/domain/model/CallModel;", "inCallExperienceModel", "Lcom/amazon/comms/calling/domain/model/InCallExperienceModel;", "<init>", "(Lcom/amazon/comms/calling/domain/model/CallModel;Lcom/amazon/comms/calling/domain/model/InCallExperienceModel;)V", "getCallModel", "()Lcom/amazon/comms/calling/domain/model/CallModel;", "getInCallExperienceModel", "()Lcom/amazon/comms/calling/domain/model/InCallExperienceModel;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class Accepted extends CallUIState {

    @NotNull
    private final CallModel callModel;

    @Nullable
    private final InCallExperienceModel inCallExperienceModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Accepted(@NotNull CallModel callModel, @Nullable InCallExperienceModel inCallExperienceModel) {
        super(null);
        callModel.getClass();
        this.callModel = callModel;
        this.inCallExperienceModel = inCallExperienceModel;
    }

    public static /* synthetic */ Accepted copy$default(Accepted accepted, CallModel callModel, InCallExperienceModel inCallExperienceModel, int i, Object obj) {
        if ((i & 1) != 0) {
            callModel = accepted.callModel;
        }
        if ((i & 2) != 0) {
            inCallExperienceModel = accepted.inCallExperienceModel;
        }
        return accepted.copy(callModel, inCallExperienceModel);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final CallModel getCallModel() {
        return this.callModel;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final InCallExperienceModel getInCallExperienceModel() {
        return this.inCallExperienceModel;
    }

    @NotNull
    public final Accepted copy(@NotNull CallModel callModel, @Nullable InCallExperienceModel inCallExperienceModel) {
        callModel.getClass();
        return new Accepted(callModel, inCallExperienceModel);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Accepted)) {
            return false;
        }
        Accepted accepted = (Accepted) other;
        return Intrinsics.areEqual(this.callModel, accepted.callModel) && Intrinsics.areEqual(this.inCallExperienceModel, accepted.inCallExperienceModel);
    }

    @NotNull
    public final CallModel getCallModel() {
        return this.callModel;
    }

    @Nullable
    public final InCallExperienceModel getInCallExperienceModel() {
        return this.inCallExperienceModel;
    }

    public int hashCode() {
        int hashCode = this.callModel.hashCode() * 31;
        InCallExperienceModel inCallExperienceModel = this.inCallExperienceModel;
        return hashCode + (inCallExperienceModel == null ? 0 : inCallExperienceModel.hashCode());
    }

    @NotNull
    public String toString() {
        return "Accepted(callModel=" + this.callModel + ", inCallExperienceModel=" + this.inCallExperienceModel + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public /* synthetic */ Accepted(CallModel callModel, InCallExperienceModel inCallExperienceModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(callModel, (i & 2) != 0 ? null : inCallExperienceModel);
    }
}
