package com.amazon.alexa.location.models;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class StatusCode {
    private Code code;
    private String message;

    public StatusCode(String str, Code code) {
        this.message = str;
        this.code = code;
    }

    public boolean equals(Object obj) {
        Code code;
        Code code2;
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof GeoFenceStatus)) {
            return false;
        }
        StatusCode statusCode = (StatusCode) obj;
        String str = this.message;
        String str2 = statusCode.message;
        return (str == str2 || str.equals(str2)) && ((code = this.code) == (code2 = statusCode.code) || code.equals(code2));
    }

    public Code getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public int hashCode() {
        String str = this.message;
        int hashCode = ((str != null ? str.hashCode() : 0) + 31) * 31;
        Code code = this.code;
        return hashCode + (code != null ? code.hashCode() : 0);
    }
}
