package com.amazon.alexa.api;

import com.amazon.alexa.api.messages.AlexaMessageType;
import defpackage.a$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
enum AlexaAudioProviderServiceMessageType implements AlexaMessageType {
    UNKNOWN,
    SET_WAKE_WORD_RECOGNITION_ENABLED,
    IS_WAKE_WORD_RECOGNITION_ENABLED,
    SET_LOCALE,
    GET_LOCALE,
    GET_SUPPORTED_LOCALES,
    CONNECT_FOR_ATTENTION_SYSTEM_UPDATES,
    START_DIALOG,
    GET_CUSTOM_SETTINGS_TITLE,
    GET_CUSTOM_SETTINGS_INTENT,
    GET_WAKE_WORD_CONFIDENCE_THRESHOLD,
    SET_WAKE_WORD_CONFIDENCE_THRESHOLD;

    public static AlexaAudioProviderServiceMessageType fromOrdinal(int i) {
        if (i >= 0 && i < values().length) {
            return values()[i];
        }
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "index ", " is out of bound"));
        return null;
    }
}
