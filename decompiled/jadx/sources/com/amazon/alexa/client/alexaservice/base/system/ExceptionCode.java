package com.amazon.alexa.client.alexaservice.base.system;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public enum ExceptionCode {
    UNDEFINED("UNDEFINED"),
    INVALID_REQUEST_EXCEPTION("INVALID_REQUEST_EXCEPTION"),
    UNAUTHORIZED_REQUEST_EXCEPTION("UNAUTHORIZED_REQUEST_EXCEPTION"),
    UNSUPPORTED_MEDIA_TYPE("UNSUPPORTED_MEDIA_TYPE"),
    THROTTLING_EXCEPTION("THROTTLING_EXCEPTION"),
    INTERNAL_SERVICE_EXCEPTION("INTERNAL_SERVICE_EXCEPTION"),
    NOT_AVAILABLE("N/A");

    private final String name;

    ExceptionCode(String str) {
        this.name = str;
    }

    public static ExceptionCode createFromCode(String str) {
        for (ExceptionCode exceptionCode : values()) {
            if (exceptionCode.toString().equalsIgnoreCase(str)) {
                return exceptionCode;
            }
        }
        return UNDEFINED;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.name;
    }
}
