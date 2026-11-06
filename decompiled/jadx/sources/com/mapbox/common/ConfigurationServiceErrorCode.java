package com.mapbox.common;

import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes8.dex */
public enum ConfigurationServiceErrorCode {
    NO_TOKEN("NoToken"),
    NO_CONFIGURATION("NoConfiguration"),
    HTTP_ERROR("HttpError"),
    MALFORMED_CONFIGURATION("MalformedConfiguration"),
    IOERROR("IOError"),
    UPDATE_IN_PROGRESS("UpdateInProgress"),
    UNEXPECTED_HTTPRESPONSE_CODE("UnexpectedHTTPResponseCode"),
    EXPIRED_CONFIGURATION("ExpiredConfiguration"),
    TOKEN_CHANGED("TokenChanged");

    private String str;

    ConfigurationServiceErrorCode(String str) {
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
