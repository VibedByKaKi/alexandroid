package com.amazon.alexa.client.alexaservice.base.events;

import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_PowerConnectionEvent extends PowerConnectionEvent {
    private final boolean charging;

    public AutoValue_PowerConnectionEvent(boolean z) {
        this.charging = z;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof PowerConnectionEvent) && this.charging == ((PowerConnectionEvent) obj).isCharging();
    }

    public int hashCode() {
        return (this.charging ? 1231 : 1237) ^ 1000003;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.events.PowerConnectionEvent
    public boolean isCharging() {
        return this.charging;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder("PowerConnectionEvent{charging="), this.charging, StringSubstitutor.DEFAULT_VAR_END);
    }
}
