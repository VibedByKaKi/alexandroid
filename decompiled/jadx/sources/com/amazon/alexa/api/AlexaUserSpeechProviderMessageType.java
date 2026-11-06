package com.amazon.alexa.api;

import com.amazon.alexa.api.messages.AlexaMessageType;
import defpackage.a$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public enum AlexaUserSpeechProviderMessageType implements AlexaMessageType {
    UNKNOWN,
    SET_WAKE_WORD_DETECTION_ENABLED,
    ON_DIALOG_REQUESTED,
    ON_DIALOG_REQUEST_DENIED,
    ON_DIALOG_STARTED,
    ON_DIALOG_TURN_REQUESTED,
    ON_DIALOG_TURN_STARTED,
    ON_DIALOG_TURN_FINISHED,
    ON_DIALOG_FINISHED,
    PAUSE_WAKEWORD_DETECTION,
    RESUME_WAKEWORD_DETECTION,
    ON_DIALOG_TURN_RESPONSE_PENDING,
    ON_DIALOG_TURN_RESERVE_RESPONSE;

    public static AlexaUserSpeechProviderMessageType fromOrdinal(int i) {
        if (i >= 0 && i < values().length) {
            return values()[i];
        }
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "index ", " is out of bound"));
        return null;
    }
}
