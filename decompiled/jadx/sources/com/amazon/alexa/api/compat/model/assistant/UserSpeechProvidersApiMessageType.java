package com.amazon.alexa.api.compat.model.assistant;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public enum UserSpeechProvidersApiMessageType {
    REGISTER,
    DEREGISTER,
    REQUEST_DIALOG,
    TURN_STARTED,
    TURN_ABANDONED,
    RESERVE_RESPONSE,
    RESERVED_RESPONSE_STARTED,
    RESERVATION_AGREED,
    RESERVATION_DISPUTED;

    public static UserSpeechProvidersApiMessageType fromOrdinal(int i) {
        UserSpeechProvidersApiMessageType[] values = values();
        if (i < 0 || i >= values.length) {
            return null;
        }
        return values[i];
    }
}
