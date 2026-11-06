package com.dee.app.contacts.interfaces.models.data.server;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ServerPhoneNumberMetadata {
    private String countryCode;
    private String phoneNumber;

    public ServerPhoneNumberMetadata(String str, String str2) {
        this.countryCode = str;
        this.phoneNumber = str2;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setCountryCode(String str) {
        this.countryCode = str;
    }

    public void setPhoneNumber(String str) {
        this.phoneNumber = str;
    }

    public ServerPhoneNumberMetadata() {
    }
}
