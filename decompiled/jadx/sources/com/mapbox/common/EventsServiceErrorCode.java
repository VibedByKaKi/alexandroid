package com.mapbox.common;

import androidx.annotation.RestrictTo;
import com.amazon.appmanager.lib.Constants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes8.dex */
public enum EventsServiceErrorCode {
    NO_TOKEN("NoToken"),
    NO_USER_AGENT("NoUserAgent"),
    NOT_FOUND(Constants.NOT_FOUND),
    UNAUTHORIZED("Unauthorized"),
    INVALID_PAYLOAD("InvalidPayload"),
    LARGE_PAYLOAD("LargePayload"),
    MULTI_STATUS("MultiStatus"),
    BAD_REQUEST("BadRequest"),
    TIMEOUT("Timeout"),
    INVALID_ENDPOINT("InvalidEndpoint"),
    MALFORMED_EVENT("MalformedEvent"),
    HTTP_ERROR("HttpError"),
    EVENTS_DISABLED("EventsDisabled"),
    IOERROR("IOError");

    private String str;

    EventsServiceErrorCode(String str) {
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
