package com.amazon.alexa.client.alexaservice.eventing.events;

import androidx.annotation.Nullable;
import com.amazon.alexa.client.alexaservice.eventing.events.VoiceInteractionEvent;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_VoiceInteractionEvent_AttemptEvent extends VoiceInteractionEvent.AttemptEvent {
    private final String aggregateName;
    private final DialogRequestIdentifier dialogRequestId;
    private final String invocationType;
    private final String name;
    private final String softwareVersion;
    private final Long turnStartElapsedRealtimeMs;

    public AutoValue_VoiceInteractionEvent_AttemptEvent(String str, @Nullable String str2, DialogRequestIdentifier dialogRequestIdentifier, String str3, String str4, @Nullable Long l) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null name");
            throw null;
        }
        this.name = str;
        this.invocationType = str2;
        if (dialogRequestIdentifier == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null dialogRequestId");
            throw null;
        }
        this.dialogRequestId = dialogRequestIdentifier;
        if (str3 == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null softwareVersion");
            throw null;
        }
        this.softwareVersion = str3;
        if (str4 == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null aggregateName");
            throw null;
        }
        this.aggregateName = str4;
        this.turnStartElapsedRealtimeMs = l;
    }

    public boolean equals(Object obj) {
        String str;
        Long l;
        if (obj == this) {
            return true;
        }
        if (obj instanceof VoiceInteractionEvent.AttemptEvent) {
            VoiceInteractionEvent.AttemptEvent attemptEvent = (VoiceInteractionEvent.AttemptEvent) obj;
            if (this.name.equals(attemptEvent.getName()) && ((str = this.invocationType) != null ? str.equals(attemptEvent.getInvocationType()) : attemptEvent.getInvocationType() == null) && this.dialogRequestId.equals(attemptEvent.getDialogRequestId()) && this.softwareVersion.equals(attemptEvent.getSoftwareVersion()) && this.aggregateName.equals(attemptEvent.getAggregateName()) && ((l = this.turnStartElapsedRealtimeMs) != null ? l.equals(attemptEvent.getTurnStartElapsedRealtimeMs()) : attemptEvent.getTurnStartElapsedRealtimeMs() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.VoiceInteractionEvent.AttemptEvent
    public String getAggregateName() {
        return this.aggregateName;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.InteractionEvent
    public DialogRequestIdentifier getDialogRequestId() {
        return this.dialogRequestId;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.InteractionEvent
    @Nullable
    public String getInvocationType() {
        return this.invocationType;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.InteractionEvent
    public String getName() {
        return this.name;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.VoiceInteractionEvent.AttemptEvent
    public String getSoftwareVersion() {
        return this.softwareVersion;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.VoiceInteractionEvent.AttemptEvent
    @Nullable
    public Long getTurnStartElapsedRealtimeMs() {
        return this.turnStartElapsedRealtimeMs;
    }

    public int hashCode() {
        int hashCode = (this.name.hashCode() ^ 1000003) * 1000003;
        String str = this.invocationType;
        int hashCode2 = (((((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.dialogRequestId.hashCode()) * 1000003) ^ this.softwareVersion.hashCode()) * 1000003) ^ this.aggregateName.hashCode()) * 1000003;
        Long l = this.turnStartElapsedRealtimeMs;
        return hashCode2 ^ (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        return "AttemptEvent{name=" + this.name + ", invocationType=" + this.invocationType + ", dialogRequestId=" + this.dialogRequestId + ", softwareVersion=" + this.softwareVersion + ", aggregateName=" + this.aggregateName + ", turnStartElapsedRealtimeMs=" + this.turnStartElapsedRealtimeMs + StringSubstitutor.DEFAULT_VAR_END;
    }
}
