package com.amazon.alexa.client.alexaservice.eventing.events;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.client.alexaservice.eventing.events.DownchannelEstablishmentFailureEvent;
import javax.annotation.Nullable;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_DownchannelEstablishmentFailureEvent extends DownchannelEstablishmentFailureEvent {
    private final DownchannelEstablishmentFailureEvent.DownchannelEstablishmentFailureType downchannelEstablishmentFailureType;
    private final Exception reason;
    private final Integer responseCode;

    public AutoValue_DownchannelEstablishmentFailureEvent(DownchannelEstablishmentFailureEvent.DownchannelEstablishmentFailureType downchannelEstablishmentFailureType, @Nullable Exception exc, @Nullable Integer num) {
        if (downchannelEstablishmentFailureType == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null downchannelEstablishmentFailureType");
            throw null;
        }
        this.downchannelEstablishmentFailureType = downchannelEstablishmentFailureType;
        this.reason = exc;
        this.responseCode = num;
    }

    public boolean equals(Object obj) {
        Exception exc;
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof DownchannelEstablishmentFailureEvent) {
            DownchannelEstablishmentFailureEvent downchannelEstablishmentFailureEvent = (DownchannelEstablishmentFailureEvent) obj;
            if (this.downchannelEstablishmentFailureType.equals(downchannelEstablishmentFailureEvent.getDownchannelEstablishmentFailureType()) && ((exc = this.reason) != null ? exc.equals(downchannelEstablishmentFailureEvent.getReason()) : downchannelEstablishmentFailureEvent.getReason() == null) && ((num = this.responseCode) != null ? num.equals(downchannelEstablishmentFailureEvent.getResponseCode()) : downchannelEstablishmentFailureEvent.getResponseCode() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.DownchannelEstablishmentFailureEvent
    public DownchannelEstablishmentFailureEvent.DownchannelEstablishmentFailureType getDownchannelEstablishmentFailureType() {
        return this.downchannelEstablishmentFailureType;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.DownchannelEstablishmentFailureEvent
    @Nullable
    public Exception getReason() {
        return this.reason;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.DownchannelEstablishmentFailureEvent
    @Nullable
    public Integer getResponseCode() {
        return this.responseCode;
    }

    public int hashCode() {
        int hashCode = (this.downchannelEstablishmentFailureType.hashCode() ^ 1000003) * 1000003;
        Exception exc = this.reason;
        int hashCode2 = (hashCode ^ (exc == null ? 0 : exc.hashCode())) * 1000003;
        Integer num = this.responseCode;
        return hashCode2 ^ (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DownchannelEstablishmentFailureEvent{downchannelEstablishmentFailureType=");
        sb.append(this.downchannelEstablishmentFailureType);
        sb.append(", reason=");
        sb.append(this.reason);
        sb.append(", responseCode=");
        return Automotive$$ExternalSyntheticOutline0.m(sb, this.responseCode, StringSubstitutor.DEFAULT_VAR_END);
    }
}
