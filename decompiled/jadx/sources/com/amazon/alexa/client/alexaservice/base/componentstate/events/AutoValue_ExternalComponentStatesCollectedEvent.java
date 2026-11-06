package com.amazon.alexa.client.alexaservice.base.componentstate.events;

import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_ExternalComponentStatesCollectedEvent extends ExternalComponentStatesCollectedEvent {
    private final long collectionTimeInMs;
    private final int numberOfExternalProviders;

    public AutoValue_ExternalComponentStatesCollectedEvent(long j, int i) {
        this.collectionTimeInMs = j;
        this.numberOfExternalProviders = i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ExternalComponentStatesCollectedEvent) {
            ExternalComponentStatesCollectedEvent externalComponentStatesCollectedEvent = (ExternalComponentStatesCollectedEvent) obj;
            if (this.collectionTimeInMs == externalComponentStatesCollectedEvent.getCollectionTimeInMs() && this.numberOfExternalProviders == externalComponentStatesCollectedEvent.getNumberOfExternalProviders()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.componentstate.events.ExternalComponentStatesCollectedEvent
    public long getCollectionTimeInMs() {
        return this.collectionTimeInMs;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.componentstate.events.ExternalComponentStatesCollectedEvent
    public int getNumberOfExternalProviders() {
        return this.numberOfExternalProviders;
    }

    public int hashCode() {
        long j = this.collectionTimeInMs;
        return this.numberOfExternalProviders ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ExternalComponentStatesCollectedEvent{collectionTimeInMs=");
        sb.append(this.collectionTimeInMs);
        sb.append(", numberOfExternalProviders=");
        return a$$ExternalSyntheticOutline0.m(sb, this.numberOfExternalProviders, StringSubstitutor.DEFAULT_VAR_END);
    }
}
