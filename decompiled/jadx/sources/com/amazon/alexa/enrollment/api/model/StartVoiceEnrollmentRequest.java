package com.amazon.alexa.enrollment.api.model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class StartVoiceEnrollmentRequest {
    private final String adultCommsPersonId;
    private final String childCustomerId;
    private final String deviceSerialNumber;
    private final String deviceType;
    private final String enrollmentContext;
    private final String locale;
    private final String marketplaceId;
    private final String personECID;
    private final String personId;
    private final Boolean withConsent;

    public StartVoiceEnrollmentRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, String str8, String str9) {
        this.personId = str;
        this.personECID = str2;
        this.deviceType = str3;
        this.deviceSerialNumber = str4;
        this.locale = str5;
        this.marketplaceId = str6;
        this.enrollmentContext = str7;
        this.withConsent = bool;
        this.childCustomerId = str8;
        this.adultCommsPersonId = str9;
    }

    public String getAdultCommsPersonId() {
        return this.adultCommsPersonId;
    }

    public String getChildCustomerId() {
        return this.childCustomerId;
    }

    public String getDeviceSerialNumber() {
        return this.deviceSerialNumber;
    }

    public String getDeviceType() {
        return this.deviceType;
    }

    public String getEnrollmentContext() {
        return this.enrollmentContext;
    }

    public String getLocale() {
        return this.locale;
    }

    public String getMarketplaceId() {
        return this.marketplaceId;
    }

    public String getPersonECID() {
        return this.personECID;
    }

    public String getPersonId() {
        return this.personId;
    }

    public boolean isWithConsent() {
        return this.withConsent.booleanValue();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("PersonId: ");
        stringBuffer.append(this.personId);
        stringBuffer.append(" PersonECID: ");
        stringBuffer.append(this.personECID);
        stringBuffer.append(" DeviceType: ");
        stringBuffer.append(this.deviceType);
        stringBuffer.append(" DeviceSerialNumber: ");
        stringBuffer.append(this.deviceSerialNumber);
        stringBuffer.append(" Locale: ");
        stringBuffer.append(this.locale);
        stringBuffer.append(" MarketplaceId: ");
        stringBuffer.append(this.marketplaceId);
        stringBuffer.append(" EnrollmentContext: ");
        stringBuffer.append(this.enrollmentContext);
        stringBuffer.append(" adultCommsPersonId: ");
        stringBuffer.append(this.adultCommsPersonId);
        stringBuffer.append(" childCustomerId: ");
        stringBuffer.append(this.childCustomerId);
        stringBuffer.append(" withConsent: ");
        stringBuffer.append(this.withConsent);
        return stringBuffer.toString();
    }
}
