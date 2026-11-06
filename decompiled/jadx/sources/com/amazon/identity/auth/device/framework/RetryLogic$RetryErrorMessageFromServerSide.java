package com.amazon.identity.auth.device.framework;

import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public enum RetryLogic$RetryErrorMessageFromServerSide {
    InvalidJSON("Backend service returns invalid JSON"),
    ServerInternalError("Backend service returns error code 500 to 599"),
    BackoffError("Request is within backoff interval");

    private String mReason;

    static {
        Locale locale = Locale.ENGLISH;
    }

    RetryLogic$RetryErrorMessageFromServerSide(String str) {
        this.mReason = str;
    }

    public String getReason() {
        return this.mReason;
    }
}
