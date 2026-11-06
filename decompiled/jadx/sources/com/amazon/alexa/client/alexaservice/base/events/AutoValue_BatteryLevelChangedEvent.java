package com.amazon.alexa.client.alexaservice.base.events;

import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_BatteryLevelChangedEvent extends BatteryLevelChangedEvent {
    private final boolean lowBattery;

    public AutoValue_BatteryLevelChangedEvent(boolean z) {
        this.lowBattery = z;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof BatteryLevelChangedEvent) && this.lowBattery == ((BatteryLevelChangedEvent) obj).isLowBattery();
    }

    public int hashCode() {
        return (this.lowBattery ? 1231 : 1237) ^ 1000003;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.events.BatteryLevelChangedEvent
    public boolean isLowBattery() {
        return this.lowBattery;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder("BatteryLevelChangedEvent{lowBattery="), this.lowBattery, StringSubstitutor.DEFAULT_VAR_END);
    }
}
