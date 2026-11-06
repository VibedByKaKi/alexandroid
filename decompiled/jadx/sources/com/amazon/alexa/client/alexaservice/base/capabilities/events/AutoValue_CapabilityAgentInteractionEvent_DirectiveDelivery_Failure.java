package com.amazon.alexa.client.alexaservice.base.capabilities.events;

import androidx.annotation.Nullable;
import com.amazon.alexa.client.alexaservice.base.capabilities.events.CapabilityAgentInteractionEvent;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_CapabilityAgentInteractionEvent_DirectiveDelivery_Failure extends CapabilityAgentInteractionEvent.DirectiveDelivery.Failure {
    private final String capabilityAgentName;
    private final DialogRequestIdentifier dialogRequestIdentifier;
    private final String directiveName;
    private final String directiveNamespace;
    private final CapabilityAgentInteractionEvent.FailureReason failureReason;
    private final CapabilityAgentInteractionEvent.Stage stage;

    public AutoValue_CapabilityAgentInteractionEvent_DirectiveDelivery_Failure(CapabilityAgentInteractionEvent.Stage stage, CapabilityAgentInteractionEvent.FailureReason failureReason, String str, String str2, String str3, @Nullable DialogRequestIdentifier dialogRequestIdentifier) {
        if (stage == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null stage");
            throw null;
        }
        this.stage = stage;
        if (failureReason == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null failureReason");
            throw null;
        }
        this.failureReason = failureReason;
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null directiveNamespace");
            throw null;
        }
        this.directiveNamespace = str;
        if (str2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null directiveName");
            throw null;
        }
        this.directiveName = str2;
        if (str3 == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null capabilityAgentName");
            throw null;
        }
        this.capabilityAgentName = str3;
        this.dialogRequestIdentifier = dialogRequestIdentifier;
    }

    public boolean equals(Object obj) {
        DialogRequestIdentifier dialogRequestIdentifier;
        if (obj == this) {
            return true;
        }
        if (obj instanceof CapabilityAgentInteractionEvent.DirectiveDelivery.Failure) {
            CapabilityAgentInteractionEvent.DirectiveDelivery.Failure failure = (CapabilityAgentInteractionEvent.DirectiveDelivery.Failure) obj;
            if (this.stage.equals(failure.getStage()) && this.failureReason.equals(failure.getFailureReason()) && this.directiveNamespace.equals(failure.getDirectiveNamespace()) && this.directiveName.equals(failure.getDirectiveName()) && this.capabilityAgentName.equals(failure.getCapabilityAgentName()) && ((dialogRequestIdentifier = this.dialogRequestIdentifier) != null ? dialogRequestIdentifier.equals(failure.getDialogRequestIdentifier()) : failure.getDialogRequestIdentifier() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.capabilities.events.CapabilityAgentInteractionEvent.DirectiveDelivery.Failure
    public String getCapabilityAgentName() {
        return this.capabilityAgentName;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.capabilities.events.CapabilityAgentInteractionEvent.DirectiveDelivery.Failure
    @Nullable
    public DialogRequestIdentifier getDialogRequestIdentifier() {
        return this.dialogRequestIdentifier;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.capabilities.events.CapabilityAgentInteractionEvent.DirectiveDelivery.Failure
    public String getDirectiveName() {
        return this.directiveName;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.capabilities.events.CapabilityAgentInteractionEvent.DirectiveDelivery.Failure
    public String getDirectiveNamespace() {
        return this.directiveNamespace;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.capabilities.events.CapabilityAgentInteractionEvent.DirectiveDelivery.Failure
    public CapabilityAgentInteractionEvent.FailureReason getFailureReason() {
        return this.failureReason;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.capabilities.events.CapabilityAgentInteractionEvent.DirectiveDelivery.Failure
    public CapabilityAgentInteractionEvent.Stage getStage() {
        return this.stage;
    }

    public int hashCode() {
        int hashCode = (((((((((this.stage.hashCode() ^ 1000003) * 1000003) ^ this.failureReason.hashCode()) * 1000003) ^ this.directiveNamespace.hashCode()) * 1000003) ^ this.directiveName.hashCode()) * 1000003) ^ this.capabilityAgentName.hashCode()) * 1000003;
        DialogRequestIdentifier dialogRequestIdentifier = this.dialogRequestIdentifier;
        return (dialogRequestIdentifier == null ? 0 : dialogRequestIdentifier.hashCode()) ^ hashCode;
    }

    public String toString() {
        return "Failure{stage=" + this.stage + ", failureReason=" + this.failureReason + ", directiveNamespace=" + this.directiveNamespace + ", directiveName=" + this.directiveName + ", capabilityAgentName=" + this.capabilityAgentName + ", dialogRequestIdentifier=" + this.dialogRequestIdentifier + StringSubstitutor.DEFAULT_VAR_END;
    }
}
