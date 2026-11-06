package com.amazon.deecomms.calling.datachannel;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public enum Namespace {
    IN_CALL_CAPABILITY("com.amazon.alexa.comms.incall.capability"),
    IN_CALL_PIP("com.amazon.alexa.comms.incall.pip");

    private final String value;

    Namespace(String str) {
        this.value = str;
    }

    public String getValue() {
        return this.value;
    }
}
