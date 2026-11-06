package com.amazon.alexa.location.models;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public enum Code {
    A101("APP_ERROR"),
    A102("INVALID_PERMISSIONS"),
    A103("OS_GEOFENCE_LIMIT_REACHED"),
    A200("SUCCESS"),
    S201("CONNECTION_ERROR"),
    S202("TIMEOUT");

    String errorCode;

    Code(String str) {
        this.errorCode = str;
    }

    public String getValue() {
        return this.errorCode;
    }
}
