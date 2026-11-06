package com.amazon.comms.calling.service;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public enum ErrorCode {
    ClientFailed(400),
    ServerError(500),
    Unknown(900),
    RegistrarUnreachable(TypedValues.Custom.TYPE_FLOAT),
    LostConnection(TypedValues.Custom.TYPE_COLOR),
    ConfigurationChanged(TypedValues.Custom.TYPE_STRING),
    SIPInternalError(TypedValues.Custom.TYPE_BOOLEAN),
    RegistrationNotFound(TypedValues.Custom.TYPE_DIMENSION),
    RegistrationFailed(TypedValues.Custom.TYPE_REFERENCE),
    MediaConnectionFailed(908);

    private final int value;

    ErrorCode(int i) {
        this.value = i;
    }

    public static boolean isCallError(ErrorCode errorCode) {
        return errorCode == Unknown || errorCode == RegistrationNotFound || isMediaError(errorCode);
    }

    public static boolean isMediaError(ErrorCode errorCode) {
        return errorCode == LostConnection || errorCode == MediaConnectionFailed;
    }

    public static boolean isServerError(ErrorCode errorCode) {
        return errorCode == ServerError;
    }

    public int getValue() {
        return this.value;
    }
}
