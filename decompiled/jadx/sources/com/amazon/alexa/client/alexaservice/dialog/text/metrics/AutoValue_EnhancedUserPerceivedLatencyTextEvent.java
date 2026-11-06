package com.amazon.alexa.client.alexaservice.dialog.text.metrics;

import androidx.annotation.Nullable;
import com.amazon.alexa.api.ResponseType;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_EnhancedUserPerceivedLatencyTextEvent extends EnhancedUserPerceivedLatencyTextEvent {
    private final long deviceProcessingLatencyMillis;
    private final DialogRequestIdentifier dialogRequestIdentifier;
    private final String initiator;
    private final String interactionLabel;
    private final String invocationType;
    private final String invokingApiEventName;
    private final ResponseType responseType;
    private final long userPerceivedLatencyMillis;

    public AutoValue_EnhancedUserPerceivedLatencyTextEvent(String str, DialogRequestIdentifier dialogRequestIdentifier, long j, long j2, @Nullable ResponseType responseType, @Nullable String str2, String str3, String str4) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null invocationType");
            throw null;
        }
        this.invocationType = str;
        if (dialogRequestIdentifier == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null dialogRequestIdentifier");
            throw null;
        }
        this.dialogRequestIdentifier = dialogRequestIdentifier;
        this.deviceProcessingLatencyMillis = j;
        this.userPerceivedLatencyMillis = j2;
        this.responseType = responseType;
        this.interactionLabel = str2;
        if (str3 == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null invokingApiEventName");
            throw null;
        }
        this.invokingApiEventName = str3;
        if (str4 != null) {
            this.initiator = str4;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null initiator");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        ResponseType responseType;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof EnhancedUserPerceivedLatencyTextEvent) {
            EnhancedUserPerceivedLatencyTextEvent enhancedUserPerceivedLatencyTextEvent = (EnhancedUserPerceivedLatencyTextEvent) obj;
            if (this.invocationType.equals(enhancedUserPerceivedLatencyTextEvent.getInvocationType()) && this.dialogRequestIdentifier.equals(enhancedUserPerceivedLatencyTextEvent.getDialogRequestIdentifier()) && this.deviceProcessingLatencyMillis == enhancedUserPerceivedLatencyTextEvent.getDeviceProcessingLatencyMillis() && this.userPerceivedLatencyMillis == enhancedUserPerceivedLatencyTextEvent.getUserPerceivedLatencyMillis() && ((responseType = this.responseType) != null ? responseType.equals(enhancedUserPerceivedLatencyTextEvent.getResponseType()) : enhancedUserPerceivedLatencyTextEvent.getResponseType() == null) && ((str = this.interactionLabel) != null ? str.equals(enhancedUserPerceivedLatencyTextEvent.getInteractionLabel()) : enhancedUserPerceivedLatencyTextEvent.getInteractionLabel() == null) && this.invokingApiEventName.equals(enhancedUserPerceivedLatencyTextEvent.getInvokingApiEventName()) && this.initiator.equals(enhancedUserPerceivedLatencyTextEvent.getInitiator())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.text.metrics.EnhancedUserPerceivedLatencyTextEvent
    public long getDeviceProcessingLatencyMillis() {
        return this.deviceProcessingLatencyMillis;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.text.metrics.EnhancedUserPerceivedLatencyTextEvent
    public DialogRequestIdentifier getDialogRequestIdentifier() {
        return this.dialogRequestIdentifier;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.text.metrics.EnhancedUserPerceivedLatencyTextEvent
    public String getInitiator() {
        return this.initiator;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.text.metrics.EnhancedUserPerceivedLatencyTextEvent
    @Nullable
    public String getInteractionLabel() {
        return this.interactionLabel;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.text.metrics.EnhancedUserPerceivedLatencyTextEvent
    public String getInvocationType() {
        return this.invocationType;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.text.metrics.EnhancedUserPerceivedLatencyTextEvent
    public String getInvokingApiEventName() {
        return this.invokingApiEventName;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.text.metrics.EnhancedUserPerceivedLatencyTextEvent
    @Nullable
    public ResponseType getResponseType() {
        return this.responseType;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.text.metrics.EnhancedUserPerceivedLatencyTextEvent
    public long getUserPerceivedLatencyMillis() {
        return this.userPerceivedLatencyMillis;
    }

    public int hashCode() {
        int hashCode = (((this.invocationType.hashCode() ^ 1000003) * 1000003) ^ this.dialogRequestIdentifier.hashCode()) * 1000003;
        long j = this.deviceProcessingLatencyMillis;
        int i = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.userPerceivedLatencyMillis;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        ResponseType responseType = this.responseType;
        int hashCode2 = (i2 ^ (responseType == null ? 0 : responseType.hashCode())) * 1000003;
        String str = this.interactionLabel;
        return this.initiator.hashCode() ^ ((((hashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ this.invokingApiEventName.hashCode()) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("EnhancedUserPerceivedLatencyTextEvent{invocationType=");
        sb.append(this.invocationType);
        sb.append(", dialogRequestIdentifier=");
        sb.append(this.dialogRequestIdentifier);
        sb.append(", deviceProcessingLatencyMillis=");
        sb.append(this.deviceProcessingLatencyMillis);
        sb.append(", userPerceivedLatencyMillis=");
        sb.append(this.userPerceivedLatencyMillis);
        sb.append(", responseType=");
        sb.append(this.responseType);
        sb.append(", interactionLabel=");
        sb.append(this.interactionLabel);
        sb.append(", invokingApiEventName=");
        sb.append(this.invokingApiEventName);
        sb.append(", initiator=");
        return a$$ExternalSyntheticOutline0.m(sb, this.initiator, StringSubstitutor.DEFAULT_VAR_END);
    }
}
