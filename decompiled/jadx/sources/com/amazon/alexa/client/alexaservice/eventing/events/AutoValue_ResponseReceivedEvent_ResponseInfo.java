package com.amazon.alexa.client.alexaservice.eventing.events;

import com.amazon.alexa.client.alexaservice.eventing.events.ResponseReceivedEvent;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_ResponseReceivedEvent_ResponseInfo extends ResponseReceivedEvent.ResponseInfo {
    private final boolean asynchronousResponse;
    private final boolean guaranteedDelivery;

    public AutoValue_ResponseReceivedEvent_ResponseInfo(boolean z, boolean z2) {
        this.asynchronousResponse = z;
        this.guaranteedDelivery = z2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ResponseReceivedEvent.ResponseInfo) {
            ResponseReceivedEvent.ResponseInfo responseInfo = (ResponseReceivedEvent.ResponseInfo) obj;
            if (this.asynchronousResponse == responseInfo.isAsynchronousResponse() && this.guaranteedDelivery == responseInfo.isGuaranteedDelivery()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.asynchronousResponse ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.guaranteedDelivery ? 1231 : 1237);
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.ResponseReceivedEvent.ResponseInfo
    public boolean isAsynchronousResponse() {
        return this.asynchronousResponse;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.ResponseReceivedEvent.ResponseInfo
    public boolean isGuaranteedDelivery() {
        return this.guaranteedDelivery;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ResponseInfo{asynchronousResponse=");
        sb.append(this.asynchronousResponse);
        sb.append(", guaranteedDelivery=");
        return a$$ExternalSyntheticOutline0.m(sb, this.guaranteedDelivery, StringSubstitutor.DEFAULT_VAR_END);
    }
}
