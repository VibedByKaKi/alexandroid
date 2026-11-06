package com.amazon.alexa.api;

import com.amazon.alexa.api.messages.AlexaMessageType;
import defpackage.a$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
enum ApiType_AutoCaptureSessionMessageType implements AlexaMessageType {
    UNKNOWN,
    ON_STARTED_COM_AMAZON_ALEXA_API_ALEXA_CAMERA_CAPTURE_INITIATOR,
    ON_STOPPED_COM_AMAZON_ALEXA_API_ALEXA_AUTO_CAPTURE_SESSION_STOP_REASON,
    ON_START_FAILED_COM_AMAZON_ALEXA_API_ALEXA_CAMERA_CAPTURE_ERROR_COM_AMAZON_ALEXA_API_ALEXA_CAMERA_CAPTURE_INITIATOR,
    ON_STOP_FAILED_COM_AMAZON_ALEXA_API_ALEXA_CAMERA_CAPTURE_ERROR;

    public static ApiType_AutoCaptureSessionMessageType fromOrdinal(int i) {
        if (i >= 0 && i < values().length) {
            return values()[i];
        }
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "ordinal ", " is out of bound"));
        return null;
    }
}
