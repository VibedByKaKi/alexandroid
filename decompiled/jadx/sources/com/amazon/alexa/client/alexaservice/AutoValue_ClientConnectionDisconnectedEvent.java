package com.amazon.alexa.client.alexaservice;

import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_ClientConnectionDisconnectedEvent extends ClientConnectionDisconnectedEvent {
    private final int sizeOfConnectedClients;

    public AutoValue_ClientConnectionDisconnectedEvent(int i) {
        this.sizeOfConnectedClients = i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ClientConnectionDisconnectedEvent) && this.sizeOfConnectedClients == ((ClientConnectionDisconnectedEvent) obj).sizeOfConnectedClients();
    }

    public int hashCode() {
        return this.sizeOfConnectedClients ^ 1000003;
    }

    @Override // com.amazon.alexa.client.alexaservice.ClientConnectionDisconnectedEvent
    public int sizeOfConnectedClients() {
        return this.sizeOfConnectedClients;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder("ClientConnectionDisconnectedEvent{sizeOfConnectedClients="), this.sizeOfConnectedClients, StringSubstitutor.DEFAULT_VAR_END);
    }
}
