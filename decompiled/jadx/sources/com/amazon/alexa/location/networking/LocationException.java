package com.amazon.alexa.location.networking;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class LocationException extends Exception {
    private LocationErrorCode errorCode;

    public LocationException(LocationErrorCode locationErrorCode, String str, Throwable th) {
        super(str, th);
        this.errorCode = locationErrorCode;
    }

    public LocationErrorCode getErrorCode() {
        return this.errorCode;
    }

    public String getErrorCodeAsString() {
        return String.valueOf(this.errorCode.getValue());
    }

    public LocationException(LocationErrorCode locationErrorCode, String str) {
        this(locationErrorCode, str, null);
    }
}
