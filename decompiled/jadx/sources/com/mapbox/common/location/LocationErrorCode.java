package com.mapbox.common.location;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public enum LocationErrorCode {
    NONE("None"),
    NOT_READY("NotReady"),
    NOT_AVAILABLE("NotAvailable"),
    ACCESS_DENIED("AccessDenied"),
    INVALID_ARGUMENT("InvalidArgument"),
    FAILED_TO_DETECT_LOCATION("FailedToDetectLocation"),
    COMMUNICATION_FAILURE("CommunicationFailure"),
    CANCELLED("Cancelled"),
    NOT_SUPPORTED("NotSupported"),
    UNKNOWN("Unknown");

    private String str;

    LocationErrorCode(String str) {
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
