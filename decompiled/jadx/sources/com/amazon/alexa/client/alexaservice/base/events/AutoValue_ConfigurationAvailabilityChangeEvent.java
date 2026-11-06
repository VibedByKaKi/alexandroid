package com.amazon.alexa.client.alexaservice.base.events;

import com.amazon.alexa.api.AlexaConfigurationName;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_ConfigurationAvailabilityChangeEvent extends ConfigurationAvailabilityChangeEvent {
    private final AlexaConfigurationName alexaConfigurationName;
    private final boolean available;

    public AutoValue_ConfigurationAvailabilityChangeEvent(AlexaConfigurationName alexaConfigurationName, boolean z) {
        if (alexaConfigurationName == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null alexaConfigurationName");
            throw null;
        }
        this.alexaConfigurationName = alexaConfigurationName;
        this.available = z;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ConfigurationAvailabilityChangeEvent) {
            ConfigurationAvailabilityChangeEvent configurationAvailabilityChangeEvent = (ConfigurationAvailabilityChangeEvent) obj;
            if (this.alexaConfigurationName.equals(configurationAvailabilityChangeEvent.getAlexaConfigurationName()) && this.available == configurationAvailabilityChangeEvent.isAvailable()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.events.ConfigurationAvailabilityChangeEvent
    public AlexaConfigurationName getAlexaConfigurationName() {
        return this.alexaConfigurationName;
    }

    public int hashCode() {
        return (this.available ? 1231 : 1237) ^ ((this.alexaConfigurationName.hashCode() ^ 1000003) * 1000003);
    }

    @Override // com.amazon.alexa.client.alexaservice.base.events.ConfigurationAvailabilityChangeEvent
    public boolean isAvailable() {
        return this.available;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ConfigurationAvailabilityChangeEvent{alexaConfigurationName=");
        sb.append(this.alexaConfigurationName);
        sb.append(", available=");
        return a$$ExternalSyntheticOutline0.m(sb, this.available, StringSubstitutor.DEFAULT_VAR_END);
    }
}
