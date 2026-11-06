package com.amazon.alexa.client.alexaservice.eventing.events;

import androidx.annotation.Nullable;
import com.amazon.alexa.api.ExtendedClient;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_ClientDisconnectedEvent extends ClientDisconnectedEvent {
    private final ExtendedClient getClient;
    private final boolean wasExpectedDisconnection;

    public AutoValue_ClientDisconnectedEvent(@Nullable ExtendedClient extendedClient, boolean z) {
        this.getClient = extendedClient;
        this.wasExpectedDisconnection = z;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ClientDisconnectedEvent) {
            ClientDisconnectedEvent clientDisconnectedEvent = (ClientDisconnectedEvent) obj;
            ExtendedClient extendedClient = this.getClient;
            if (extendedClient != null ? extendedClient.equals(clientDisconnectedEvent.getClient()) : clientDisconnectedEvent.getClient() == null) {
                if (this.wasExpectedDisconnection == clientDisconnectedEvent.wasExpectedDisconnection()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.ClientDisconnectedEvent
    @Nullable
    public ExtendedClient getClient() {
        return this.getClient;
    }

    public int hashCode() {
        ExtendedClient extendedClient = this.getClient;
        return (this.wasExpectedDisconnection ? 1231 : 1237) ^ (((extendedClient == null ? 0 : extendedClient.hashCode()) ^ 1000003) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ClientDisconnectedEvent{getClient=");
        sb.append(this.getClient);
        sb.append(", wasExpectedDisconnection=");
        return a$$ExternalSyntheticOutline0.m(sb, this.wasExpectedDisconnection, StringSubstitutor.DEFAULT_VAR_END);
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.ClientDisconnectedEvent
    public boolean wasExpectedDisconnection() {
        return this.wasExpectedDisconnection;
    }
}
