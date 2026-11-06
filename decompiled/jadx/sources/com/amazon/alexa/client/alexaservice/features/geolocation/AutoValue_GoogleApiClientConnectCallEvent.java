package com.amazon.alexa.client.alexaservice.features.geolocation;

import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_GoogleApiClientConnectCallEvent extends GoogleApiClientConnectCallEvent {
    private final long timeTaken;

    public AutoValue_GoogleApiClientConnectCallEvent(long j) {
        this.timeTaken = j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof GoogleApiClientConnectCallEvent) && this.timeTaken == ((GoogleApiClientConnectCallEvent) obj).getTimeTaken();
    }

    @Override // com.amazon.alexa.client.alexaservice.features.geolocation.GoogleApiClientConnectCallEvent
    public long getTimeTaken() {
        return this.timeTaken;
    }

    public int hashCode() {
        long j = this.timeTaken;
        return ((int) (j ^ (j >>> 32))) ^ 1000003;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(this.timeTaken, StringSubstitutor.DEFAULT_VAR_END, new StringBuilder("GoogleApiClientConnectCallEvent{timeTaken="));
    }
}
