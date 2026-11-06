package com.amazon.alexa.client.alexaservice.base.capabilities.events;

import androidx.annotation.Nullable;
import com.amazon.alexa.client.alexaservice.base.capabilities.events.CapabilityAgentInteractionEvent;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_CapabilityAgentInteractionEvent_DirectiveDelivery_Success extends CapabilityAgentInteractionEvent.DirectiveDelivery.Success {
    private final String capabilityAgentName;
    private final DialogRequestIdentifier dialogRequestIdentifier;
    private final String directiveName;
    private final String directiveNamespace;
    private final CapabilityAgentInteractionEvent.Stage stage;

    public AutoValue_CapabilityAgentInteractionEvent_DirectiveDelivery_Success(CapabilityAgentInteractionEvent.Stage stage, String str, String str2, String str3, @Nullable DialogRequestIdentifier dialogRequestIdentifier) {
        if (stage == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null stage");
            throw null;
        }
        this.stage = stage;
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
        if (obj instanceof CapabilityAgentInteractionEvent.DirectiveDelivery.Success) {
            CapabilityAgentInteractionEvent.DirectiveDelivery.Success success = (CapabilityAgentInteractionEvent.DirectiveDelivery.Success) obj;
            if (this.stage.equals(success.getStage()) && this.directiveNamespace.equals(success.getDirectiveNamespace()) && this.directiveName.equals(success.getDirectiveName()) && this.capabilityAgentName.equals(success.getCapabilityAgentName()) && ((dialogRequestIdentifier = this.dialogRequestIdentifier) != null ? dialogRequestIdentifier.equals(success.getDialogRequestIdentifier()) : success.getDialogRequestIdentifier() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.capabilities.events.CapabilityAgentInteractionEvent.DirectiveDelivery.Success
    public String getCapabilityAgentName() {
        return this.capabilityAgentName;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.capabilities.events.CapabilityAgentInteractionEvent.DirectiveDelivery.Success
    @Nullable
    public DialogRequestIdentifier getDialogRequestIdentifier() {
        return this.dialogRequestIdentifier;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.capabilities.events.CapabilityAgentInteractionEvent.DirectiveDelivery.Success
    public String getDirectiveName() {
        return this.directiveName;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.capabilities.events.CapabilityAgentInteractionEvent.DirectiveDelivery.Success
    public String getDirectiveNamespace() {
        return this.directiveNamespace;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.capabilities.events.CapabilityAgentInteractionEvent.DirectiveDelivery.Success
    public CapabilityAgentInteractionEvent.Stage getStage() {
        return this.stage;
    }

    public int hashCode() {
        int hashCode = (((((((this.stage.hashCode() ^ 1000003) * 1000003) ^ this.directiveNamespace.hashCode()) * 1000003) ^ this.directiveName.hashCode()) * 1000003) ^ this.capabilityAgentName.hashCode()) * 1000003;
        DialogRequestIdentifier dialogRequestIdentifier = this.dialogRequestIdentifier;
        return (dialogRequestIdentifier == null ? 0 : dialogRequestIdentifier.hashCode()) ^ hashCode;
    }

    public String toString() {
        return "Success{stage=" + this.stage + ", directiveNamespace=" + this.directiveNamespace + ", directiveName=" + this.directiveName + ", capabilityAgentName=" + this.capabilityAgentName + ", dialogRequestIdentifier=" + this.dialogRequestIdentifier + StringSubstitutor.DEFAULT_VAR_END;
    }
}
