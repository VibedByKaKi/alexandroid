package com.mapbox.common;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public enum HttpRequestErrorType {
    CONNECTION_ERROR("ConnectionError"),
    SSLERROR("SSLError"),
    REQUEST_CANCELLED("RequestCancelled"),
    REQUEST_TIMED_OUT("RequestTimedOut"),
    RANGE_ERROR("RangeError"),
    OTHER_ERROR("OtherError");

    private String str;

    HttpRequestErrorType(String str) {
        this.str = str;
    }

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }
}
