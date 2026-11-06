package com.amazon.alexa.api.compat.model.assistant;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public enum DialogApiMessageType {
    START,
    START_WITH_EXTRAS,
    STOP,
    CANCEL;

    public static DialogApiMessageType fromOrdinal(int i) {
        DialogApiMessageType[] values = values();
        if (i < 0 || i >= values.length) {
            return null;
        }
        return values[i];
    }
}
