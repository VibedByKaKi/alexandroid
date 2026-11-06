package com.amazon.comms.calling.domain.model;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.comms.calling.presentation.ui.OptInFragment;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/amazon/comms/calling/domain/model/ShowOptIn;", "Lcom/amazon/comms/calling/domain/model/CallUIState;", OptInFragment.KEY_OUTGOING_CALL, "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class ShowOptIn extends CallUIState {
    private final boolean isOutgoingCall;

    public ShowOptIn(boolean z) {
        super(null);
        this.isOutgoingCall = z;
    }

    public static /* synthetic */ ShowOptIn copy$default(ShowOptIn showOptIn, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = showOptIn.isOutgoingCall;
        }
        return showOptIn.copy(z);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsOutgoingCall() {
        return this.isOutgoingCall;
    }

    @NotNull
    public final ShowOptIn copy(boolean isOutgoingCall) {
        return new ShowOptIn(isOutgoingCall);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ShowOptIn) && this.isOutgoingCall == ((ShowOptIn) other).isOutgoingCall;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isOutgoingCall);
    }

    public final boolean isOutgoingCall() {
        return this.isOutgoingCall;
    }

    @NotNull
    public String toString() {
        return Automotive$$ExternalSyntheticOutline0.m("ShowOptIn(isOutgoingCall=", MarkdownConstants.RIGHT_PARENTHESIS, this.isOutgoingCall);
    }
}
