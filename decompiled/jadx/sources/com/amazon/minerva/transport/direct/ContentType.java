package com.amazon.minerva.transport.direct;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public enum ContentType {
    ION_TEXT("text/x-amzn-ion"),
    ION_BINARY("application/x-amzn-ion");

    private final String value;

    ContentType(String str) {
        this.value = str;
    }

    public String headerValue() {
        return this.value;
    }
}
