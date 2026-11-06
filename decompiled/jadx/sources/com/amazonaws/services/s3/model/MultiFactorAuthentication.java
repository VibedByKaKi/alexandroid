package com.amazonaws.services.s3.model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class MultiFactorAuthentication {
    private String deviceSerialNumber;
    private String token;

    public MultiFactorAuthentication(String str, String str2) {
        this.deviceSerialNumber = str;
        this.token = str2;
    }

    public String getDeviceSerialNumber() {
        return this.deviceSerialNumber;
    }

    public String getToken() {
        return this.token;
    }

    public void setDeviceSerialNumber(String str) {
        this.deviceSerialNumber = str;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public MultiFactorAuthentication withDeviceSerialNumber(String str) {
        setDeviceSerialNumber(str);
        return this;
    }

    public MultiFactorAuthentication withToken(String str) {
        setToken(str);
        return this;
    }
}
