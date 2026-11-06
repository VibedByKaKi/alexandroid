package com.amazon.alexa.accessory.capabilities.crypto.state;

import com.amazon.alexa.accessory.internal.util.Preconditions;
import com.amazon.alexa.accessory.protocol.Accessories;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class TransitionResponse {
    private final KeyExchangeState newState;
    private final Accessories.Response response;

    public TransitionResponse(KeyExchangeState keyExchangeState, Accessories.Response response) {
        Preconditions.notNull(keyExchangeState, "newState");
        Preconditions.notNull(response, "response");
        this.newState = keyExchangeState;
        this.response = response;
    }

    public KeyExchangeState getNewState() {
        return this.newState;
    }

    public Accessories.Response getResponse() {
        return this.response;
    }
}
