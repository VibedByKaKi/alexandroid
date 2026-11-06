package com.amazon.alexa.client.alexaservice.base.componentstate.events;

import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_ExternalComponentStateProvidersCountExceededEvent extends ExternalComponentStateProvidersCountExceededEvent {
    private final int numberOfExternalProviders;

    public AutoValue_ExternalComponentStateProvidersCountExceededEvent(int i) {
        this.numberOfExternalProviders = i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ExternalComponentStateProvidersCountExceededEvent) && this.numberOfExternalProviders == ((ExternalComponentStateProvidersCountExceededEvent) obj).getNumberOfExternalProviders();
    }

    @Override // com.amazon.alexa.client.alexaservice.base.componentstate.events.ExternalComponentStateProvidersCountExceededEvent
    public int getNumberOfExternalProviders() {
        return this.numberOfExternalProviders;
    }

    public int hashCode() {
        return this.numberOfExternalProviders ^ 1000003;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder("ExternalComponentStateProvidersCountExceededEvent{numberOfExternalProviders="), this.numberOfExternalProviders, StringSubstitutor.DEFAULT_VAR_END);
    }
}
