package com.amazon.alexa.api;

import com.amazon.alexa.api.messages.AlexaMessageType;
import defpackage.a$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
enum AlexaAudioProviderManagerMessageType implements AlexaMessageType {
    UNKNOWN,
    PREPARE,
    START_DIALOG,
    CONTINUE_DIALOG,
    STOP_DIALOG_TURN,
    REGISTER_ALEXA_STATE_LISTENER,
    DEREGISTER_ALEXA_STATE_LISTENER,
    ON_CLIENT_DISCONNECT,
    REGISTER_FORCE_DISCONNECT_LISTENER,
    DEREGISTER_FORCE_DISCONNECT_LISTENER,
    IS_USER_LOGGED_IN,
    START_DIALOG_WITH_METADATA,
    UPDATE_PREFERENCES,
    GET_PREFERENCES,
    GET_LOCALE,
    REGISTER_SETTINGS_LISTENER,
    DEREGISTER_SETTINGS_LISTENER,
    GET_LOCALES;

    public static AlexaAudioProviderManagerMessageType fromOrdinal(int i) {
        if (i >= 0 && i < values().length) {
            return values()[i];
        }
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "index ", " is out of bound"));
        return null;
    }
}
