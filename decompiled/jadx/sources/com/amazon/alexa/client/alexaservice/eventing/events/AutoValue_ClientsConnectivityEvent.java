package com.amazon.alexa.client.alexaservice.eventing.events;

import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_ClientsConnectivityEvent extends ClientsConnectivityEvent {
    private final boolean connected;

    public AutoValue_ClientsConnectivityEvent(boolean z) {
        this.connected = z;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ClientsConnectivityEvent) && this.connected == ((ClientsConnectivityEvent) obj).isConnected();
    }

    public int hashCode() {
        return (this.connected ? 1231 : 1237) ^ 1000003;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.ClientsConnectivityEvent
    public boolean isConnected() {
        return this.connected;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder("ClientsConnectivityEvent{connected="), this.connected, StringSubstitutor.DEFAULT_VAR_END);
    }
}
