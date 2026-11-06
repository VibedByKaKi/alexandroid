package com.amazon.alexa.client.alexaservice.base.interactions.events;

import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_AudioFocusRequestFailedMetricEvent extends AudioFocusRequestFailedMetricEvent {
    private final String action;
    private final int audioMode;
    private final String dialogRequestId;
    private final int focusResultCode;
    private final String initiator;
    private final String interactionLabel;
    private final String invocationType;

    public AutoValue_AudioFocusRequestFailedMetricEvent(String str, String str2, int i, int i2, String str3, String str4, String str5) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null invocationType");
            throw null;
        }
        this.invocationType = str;
        if (str2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null dialogRequestId");
            throw null;
        }
        this.dialogRequestId = str2;
        this.focusResultCode = i;
        this.audioMode = i2;
        if (str3 == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null action");
            throw null;
        }
        this.action = str3;
        if (str4 == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null initiator");
            throw null;
        }
        this.initiator = str4;
        if (str5 != null) {
            this.interactionLabel = str5;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null interactionLabel");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AudioFocusRequestFailedMetricEvent) {
            AudioFocusRequestFailedMetricEvent audioFocusRequestFailedMetricEvent = (AudioFocusRequestFailedMetricEvent) obj;
            if (this.invocationType.equals(audioFocusRequestFailedMetricEvent.getInvocationType()) && this.dialogRequestId.equals(audioFocusRequestFailedMetricEvent.getDialogRequestId()) && this.focusResultCode == audioFocusRequestFailedMetricEvent.getFocusResultCode() && this.audioMode == audioFocusRequestFailedMetricEvent.getAudioMode() && this.action.equals(audioFocusRequestFailedMetricEvent.getAction()) && this.initiator.equals(audioFocusRequestFailedMetricEvent.getInitiator()) && this.interactionLabel.equals(audioFocusRequestFailedMetricEvent.getInteractionLabel())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.interactions.events.AudioFocusRequestFailedMetricEvent
    public String getAction() {
        return this.action;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.interactions.events.AudioFocusRequestFailedMetricEvent
    public int getAudioMode() {
        return this.audioMode;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.interactions.events.AudioFocusRequestFailedMetricEvent
    public String getDialogRequestId() {
        return this.dialogRequestId;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.interactions.events.AudioFocusRequestFailedMetricEvent
    public int getFocusResultCode() {
        return this.focusResultCode;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.interactions.events.AudioFocusRequestFailedMetricEvent
    public String getInitiator() {
        return this.initiator;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.interactions.events.AudioFocusRequestFailedMetricEvent
    public String getInteractionLabel() {
        return this.interactionLabel;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.interactions.events.AudioFocusRequestFailedMetricEvent
    public String getInvocationType() {
        return this.invocationType;
    }

    public int hashCode() {
        return this.interactionLabel.hashCode() ^ ((((((((((((this.invocationType.hashCode() ^ 1000003) * 1000003) ^ this.dialogRequestId.hashCode()) * 1000003) ^ this.focusResultCode) * 1000003) ^ this.audioMode) * 1000003) ^ this.action.hashCode()) * 1000003) ^ this.initiator.hashCode()) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioFocusRequestFailedMetricEvent{invocationType=");
        sb.append(this.invocationType);
        sb.append(", dialogRequestId=");
        sb.append(this.dialogRequestId);
        sb.append(", focusResultCode=");
        sb.append(this.focusResultCode);
        sb.append(", audioMode=");
        sb.append(this.audioMode);
        sb.append(", action=");
        sb.append(this.action);
        sb.append(", initiator=");
        sb.append(this.initiator);
        sb.append(", interactionLabel=");
        return a$$ExternalSyntheticOutline0.m(sb, this.interactionLabel, StringSubstitutor.DEFAULT_VAR_END);
    }
}
