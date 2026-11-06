package com.amazon.alexa.api.compat.model.assistant;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public enum UserSpeechProviderListenerMessageType {
    ON_DIALOG_REQUESTED,
    ON_DIALOG_TURN_REQUESTED,
    ON_DIALOG_REQUEST_DENIED,
    SET_WAKE_WORD_DETECTION_ENABLED,
    PAUSE_WAKE_WORD_DETECTION,
    RESUME_WAKE_WORD_DETECTION,
    ON_DIALOG_STARTED,
    ON_DIALOG_FINISHED,
    ON_DIALOG_TURN_STARTED,
    ON_DIALOG_TURN_FINISHED,
    ON_PLAYBACK_STARTED,
    ON_PLAYBACK_STOPPED,
    ON_DIALOG_TURN_RESPONSE_PENDING,
    ON_DIALOG_TURN_RESERVE_RESPONSE,
    ON_RESERVATION_AGREED,
    ON_RESERVATION_DISPUTED,
    REGISTER_CALLBACK,
    DEREGISTER_CALLBACK;

    public static UserSpeechProviderListenerMessageType fromOrdinal(int i) {
        UserSpeechProviderListenerMessageType[] values = values();
        if (i < 0 || i >= values.length) {
            return null;
        }
        return values[i];
    }
}
