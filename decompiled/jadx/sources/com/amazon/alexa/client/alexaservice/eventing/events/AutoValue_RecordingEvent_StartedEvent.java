package com.amazon.alexa.client.alexaservice.eventing.events;

import com.amazon.alexa.api.AlexaDialogExtras;
import com.amazon.alexa.api.ExtendedClient;
import com.amazon.alexa.client.alexaservice.eventing.events.RecordingEvent;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_RecordingEvent_StartedEvent extends RecordingEvent.StartedEvent {
    private final ExtendedClient client;
    private final AlexaDialogExtras dialogExtras;
    private final DialogRequestIdentifier dialogRequestIdentifier;
    private final RecordingEvent.RecordingStartedSource source;

    public AutoValue_RecordingEvent_StartedEvent(ExtendedClient extendedClient, RecordingEvent.RecordingStartedSource recordingStartedSource, DialogRequestIdentifier dialogRequestIdentifier, AlexaDialogExtras alexaDialogExtras) {
        if (extendedClient == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null client");
            throw null;
        }
        this.client = extendedClient;
        if (recordingStartedSource == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null source");
            throw null;
        }
        this.source = recordingStartedSource;
        if (dialogRequestIdentifier == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null dialogRequestIdentifier");
            throw null;
        }
        this.dialogRequestIdentifier = dialogRequestIdentifier;
        if (alexaDialogExtras != null) {
            this.dialogExtras = alexaDialogExtras;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null dialogExtras");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RecordingEvent.StartedEvent) {
            RecordingEvent.StartedEvent startedEvent = (RecordingEvent.StartedEvent) obj;
            if (this.client.equals(startedEvent.getClient()) && this.source.equals(startedEvent.getSource()) && this.dialogRequestIdentifier.equals(startedEvent.getDialogRequestIdentifier()) && this.dialogExtras.equals(startedEvent.getDialogExtras())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.RecordingEvent.StartedEvent
    public ExtendedClient getClient() {
        return this.client;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.RecordingEvent.StartedEvent
    public AlexaDialogExtras getDialogExtras() {
        return this.dialogExtras;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.RecordingEvent.StartedEvent
    public DialogRequestIdentifier getDialogRequestIdentifier() {
        return this.dialogRequestIdentifier;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.RecordingEvent.StartedEvent
    public RecordingEvent.RecordingStartedSource getSource() {
        return this.source;
    }

    public int hashCode() {
        return this.dialogExtras.hashCode() ^ ((((((this.client.hashCode() ^ 1000003) * 1000003) ^ this.source.hashCode()) * 1000003) ^ this.dialogRequestIdentifier.hashCode()) * 1000003);
    }

    public String toString() {
        return "StartedEvent{client=" + this.client + ", source=" + this.source + ", dialogRequestIdentifier=" + this.dialogRequestIdentifier + ", dialogExtras=" + this.dialogExtras + StringSubstitutor.DEFAULT_VAR_END;
    }
}
