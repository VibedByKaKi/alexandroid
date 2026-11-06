package com.amazon.alexa.client.alexaservice.eventing.events;

import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_SendMessageNetworkRequestInvokeEvent extends SendMessageNetworkRequestInvokeEvent {
    private final DialogRequestIdentifier dialogRequestIdentifier;
    private final long networkRequestInvokeTimestampMillis;

    public AutoValue_SendMessageNetworkRequestInvokeEvent(DialogRequestIdentifier dialogRequestIdentifier, long j) {
        if (dialogRequestIdentifier == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null dialogRequestIdentifier");
            throw null;
        }
        this.dialogRequestIdentifier = dialogRequestIdentifier;
        this.networkRequestInvokeTimestampMillis = j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SendMessageNetworkRequestInvokeEvent) {
            SendMessageNetworkRequestInvokeEvent sendMessageNetworkRequestInvokeEvent = (SendMessageNetworkRequestInvokeEvent) obj;
            if (this.dialogRequestIdentifier.equals(sendMessageNetworkRequestInvokeEvent.getDialogRequestIdentifier()) && this.networkRequestInvokeTimestampMillis == sendMessageNetworkRequestInvokeEvent.getNetworkRequestInvokeTimestampMillis()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.SendMessageNetworkRequestInvokeEvent
    public DialogRequestIdentifier getDialogRequestIdentifier() {
        return this.dialogRequestIdentifier;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.SendMessageNetworkRequestInvokeEvent
    public long getNetworkRequestInvokeTimestampMillis() {
        return this.networkRequestInvokeTimestampMillis;
    }

    public int hashCode() {
        int hashCode = (this.dialogRequestIdentifier.hashCode() ^ 1000003) * 1000003;
        long j = this.networkRequestInvokeTimestampMillis;
        return ((int) (j ^ (j >>> 32))) ^ hashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SendMessageNetworkRequestInvokeEvent{dialogRequestIdentifier=");
        sb.append(this.dialogRequestIdentifier);
        sb.append(", networkRequestInvokeTimestampMillis=");
        return a$$ExternalSyntheticOutline0.m(this.networkRequestInvokeTimestampMillis, StringSubstitutor.DEFAULT_VAR_END, sb);
    }
}
