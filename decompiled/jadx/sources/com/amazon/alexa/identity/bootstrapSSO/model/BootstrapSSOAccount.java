package com.amazon.alexa.identity.bootstrapSSO.model;

import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final class BootstrapSSOAccount {
    private final String accountDirectedId;
    private final String accountLogin;
    private final String accountName;
    private final String deviceSerialNumber;
    private final String deviceType;
    private final long expiry;
    private final String ssoCode;

    public BootstrapSSOAccount(String str, long j, String str2, String str3, String str4, String str5, String str6) {
        this.ssoCode = str;
        this.expiry = j;
        this.accountName = str2;
        this.accountLogin = str3;
        this.accountDirectedId = str4;
        this.deviceSerialNumber = str5;
        this.deviceType = str6;
    }

    public String getAccountDirectedId() {
        return this.accountDirectedId;
    }

    public String getAccountLogin() {
        return this.accountLogin;
    }

    public String getAccountName() {
        return this.accountName;
    }

    public String getDeviceSerialNumber() {
        return this.deviceSerialNumber;
    }

    public String getDeviceType() {
        return this.deviceType;
    }

    public long getExpiry() {
        return this.expiry;
    }

    public String getSsoCode() {
        return this.ssoCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BootstrapSSOAccount{ssoCode='");
        sb.append(this.ssoCode);
        sb.append("', expiry=");
        sb.append(this.expiry);
        sb.append(", accountName='");
        sb.append(this.accountName);
        sb.append("', accountLogin='");
        sb.append(this.accountLogin);
        sb.append("', accountDirectedId='");
        sb.append(this.accountDirectedId);
        sb.append("', deviceSerialNumber='");
        sb.append(this.deviceSerialNumber);
        sb.append("', deviceType='");
        return a$$ExternalSyntheticOutline0.m(sb, this.deviceType, "'}");
    }
}
