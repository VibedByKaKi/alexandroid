package com.amazon.alexa.client.alexaservice.eventing.events;

import androidx.annotation.Nullable;
import com.amazon.alexa.client.alexaservice.dialog.core.metrics.DialogInteractionResult;
import com.amazon.alexa.client.alexaservice.eventing.events.DialogSummaryEvent;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_DialogSummaryEvent extends DialogSummaryEvent {
    private final DialogRequestIdentifier getDialogRequestIdentifier;
    private final List<DialogSummaryEvent.DirectiveInfo> getDirectives;
    private final String getFailureMessage;
    private final DialogInteractionResult.Type getStatus;
    private final boolean hasAgentResponse;
    private final boolean hasPreambleResponse;
    private final boolean hasRPC;
    private final boolean hasRPS;
    private final boolean isNetworkFailure;
    private final boolean isThirdPartySkill;

    public AutoValue_DialogSummaryEvent(DialogRequestIdentifier dialogRequestIdentifier, DialogInteractionResult.Type type, @Nullable String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, List<DialogSummaryEvent.DirectiveInfo> list, boolean z6) {
        if (dialogRequestIdentifier == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null getDialogRequestIdentifier");
            throw null;
        }
        this.getDialogRequestIdentifier = dialogRequestIdentifier;
        if (type == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null getStatus");
            throw null;
        }
        this.getStatus = type;
        this.getFailureMessage = str;
        this.isNetworkFailure = z;
        this.hasRPS = z2;
        this.hasRPC = z3;
        this.hasAgentResponse = z4;
        this.hasPreambleResponse = z5;
        if (list == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null getDirectives");
            throw null;
        }
        this.getDirectives = list;
        this.isThirdPartySkill = z6;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof DialogSummaryEvent) {
            DialogSummaryEvent dialogSummaryEvent = (DialogSummaryEvent) obj;
            if (this.getDialogRequestIdentifier.equals(dialogSummaryEvent.getDialogRequestIdentifier()) && this.getStatus.equals(dialogSummaryEvent.getStatus()) && ((str = this.getFailureMessage) != null ? str.equals(dialogSummaryEvent.getFailureMessage()) : dialogSummaryEvent.getFailureMessage() == null) && this.isNetworkFailure == dialogSummaryEvent.isNetworkFailure() && this.hasRPS == dialogSummaryEvent.hasRPS() && this.hasRPC == dialogSummaryEvent.hasRPC() && this.hasAgentResponse == dialogSummaryEvent.hasAgentResponse() && this.hasPreambleResponse == dialogSummaryEvent.hasPreambleResponse() && this.getDirectives.equals(dialogSummaryEvent.getDirectives()) && this.isThirdPartySkill == dialogSummaryEvent.isThirdPartySkill()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.DialogSummaryEvent
    public DialogRequestIdentifier getDialogRequestIdentifier() {
        return this.getDialogRequestIdentifier;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.DialogSummaryEvent
    public List<DialogSummaryEvent.DirectiveInfo> getDirectives() {
        return this.getDirectives;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.DialogSummaryEvent
    @Nullable
    public String getFailureMessage() {
        return this.getFailureMessage;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.DialogSummaryEvent
    public DialogInteractionResult.Type getStatus() {
        return this.getStatus;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.DialogSummaryEvent
    public boolean hasAgentResponse() {
        return this.hasAgentResponse;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.DialogSummaryEvent
    public boolean hasPreambleResponse() {
        return this.hasPreambleResponse;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.DialogSummaryEvent
    public boolean hasRPC() {
        return this.hasRPC;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.DialogSummaryEvent
    public boolean hasRPS() {
        return this.hasRPS;
    }

    public int hashCode() {
        int hashCode = (((this.getDialogRequestIdentifier.hashCode() ^ 1000003) * 1000003) ^ this.getStatus.hashCode()) * 1000003;
        String str = this.getFailureMessage;
        return ((((((((((((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ (this.isNetworkFailure ? 1231 : 1237)) * 1000003) ^ (this.hasRPS ? 1231 : 1237)) * 1000003) ^ (this.hasRPC ? 1231 : 1237)) * 1000003) ^ (this.hasAgentResponse ? 1231 : 1237)) * 1000003) ^ (this.hasPreambleResponse ? 1231 : 1237)) * 1000003) ^ this.getDirectives.hashCode()) * 1000003) ^ (this.isThirdPartySkill ? 1231 : 1237);
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.DialogSummaryEvent
    public boolean isNetworkFailure() {
        return this.isNetworkFailure;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.DialogSummaryEvent
    public boolean isThirdPartySkill() {
        return this.isThirdPartySkill;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DialogSummaryEvent{getDialogRequestIdentifier=");
        sb.append(this.getDialogRequestIdentifier);
        sb.append(", getStatus=");
        sb.append(this.getStatus);
        sb.append(", getFailureMessage=");
        sb.append(this.getFailureMessage);
        sb.append(", isNetworkFailure=");
        sb.append(this.isNetworkFailure);
        sb.append(", hasRPS=");
        sb.append(this.hasRPS);
        sb.append(", hasRPC=");
        sb.append(this.hasRPC);
        sb.append(", hasAgentResponse=");
        sb.append(this.hasAgentResponse);
        sb.append(", hasPreambleResponse=");
        sb.append(this.hasPreambleResponse);
        sb.append(", getDirectives=");
        sb.append(this.getDirectives);
        sb.append(", isThirdPartySkill=");
        return a$$ExternalSyntheticOutline0.m(sb, this.isThirdPartySkill, StringSubstitutor.DEFAULT_VAR_END);
    }
}
