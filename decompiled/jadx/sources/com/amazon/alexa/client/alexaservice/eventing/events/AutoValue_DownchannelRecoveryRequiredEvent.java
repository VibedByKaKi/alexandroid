package com.amazon.alexa.client.alexaservice.eventing.events;

import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_DownchannelRecoveryRequiredEvent extends DownchannelRecoveryRequiredEvent {
    private final String reason;

    public AutoValue_DownchannelRecoveryRequiredEvent(String str) {
        if (str != null) {
            this.reason = str;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null reason");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DownchannelRecoveryRequiredEvent) {
            return this.reason.equals(((DownchannelRecoveryRequiredEvent) obj).getReason());
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.DownchannelRecoveryRequiredEvent
    public String getReason() {
        return this.reason;
    }

    public int hashCode() {
        return this.reason.hashCode() ^ 1000003;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder("DownchannelRecoveryRequiredEvent{reason="), this.reason, StringSubstitutor.DEFAULT_VAR_END);
    }
}
