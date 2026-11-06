package com.amazon.alexa.client.alexaservice.eventing.events;

import defpackage.a$$ExternalSyntheticOutline0;
import javax.annotation.Nullable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_DownchannelConnectivityChangedEvent extends DownchannelConnectivityChangedEvent {
    private final boolean connected;
    private final String downchannelId;

    public AutoValue_DownchannelConnectivityChangedEvent(boolean z, @Nullable String str) {
        this.connected = z;
        this.downchannelId = str;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof DownchannelConnectivityChangedEvent) {
            DownchannelConnectivityChangedEvent downchannelConnectivityChangedEvent = (DownchannelConnectivityChangedEvent) obj;
            if (this.connected == downchannelConnectivityChangedEvent.isConnected() && ((str = this.downchannelId) != null ? str.equals(downchannelConnectivityChangedEvent.getDownchannelId()) : downchannelConnectivityChangedEvent.getDownchannelId() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.DownchannelConnectivityChangedEvent
    @Nullable
    public String getDownchannelId() {
        return this.downchannelId;
    }

    public int hashCode() {
        int i = ((this.connected ? 1231 : 1237) ^ 1000003) * 1000003;
        String str = this.downchannelId;
        return (str == null ? 0 : str.hashCode()) ^ i;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.DownchannelConnectivityChangedEvent
    public boolean isConnected() {
        return this.connected;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DownchannelConnectivityChangedEvent{connected=");
        sb.append(this.connected);
        sb.append(", downchannelId=");
        return a$$ExternalSyntheticOutline0.m(sb, this.downchannelId, StringSubstitutor.DEFAULT_VAR_END);
    }
}
