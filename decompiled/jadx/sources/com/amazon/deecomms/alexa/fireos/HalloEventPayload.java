package com.amazon.deecomms.alexa.fireos;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.annotation.JsonProperty;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
class HalloEventPayload {

    @JsonProperty
    private String clientIdentifier;

    @JsonProperty
    private String state;

    public HalloEventPayload(@NonNull String str, @NonNull String str2) {
        this.clientIdentifier = str;
        this.state = str2;
    }

    public String getClientIdentifier() {
        return this.clientIdentifier;
    }

    public String getState() {
        return this.state;
    }

    public void setClientIdentifier(@NonNull String str) {
        this.clientIdentifier = str;
    }

    public void setState(@NonNull String str) {
        this.state = str;
    }
}
