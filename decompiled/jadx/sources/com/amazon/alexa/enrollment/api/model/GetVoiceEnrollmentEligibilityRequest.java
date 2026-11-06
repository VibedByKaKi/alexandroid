package com.amazon.alexa.enrollment.api.model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class GetVoiceEnrollmentEligibilityRequest {
    private final String deviceType;
    private final String enrollmentContext;
    private final String locale;
    private final String personECID;
    private final String personId;

    public GetVoiceEnrollmentEligibilityRequest(String str, String str2, String str3, String str4, String str5) {
        this.personId = str;
        this.personECID = str2;
        this.deviceType = str3;
        this.locale = str4;
        this.enrollmentContext = str5;
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

    public String getPersonECID() {
        return this.personECID;
    }

    public String getPersonId() {
        return this.personId;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("PersonId: ");
        stringBuffer.append(this.personId);
        stringBuffer.append(" PersonECID: ");
        stringBuffer.append(this.personECID);
        stringBuffer.append(" DeviceType: ");
        stringBuffer.append(this.deviceType);
        stringBuffer.append(" Locale: ");
        stringBuffer.append(this.locale);
        stringBuffer.append(" EnrollmentContext: ");
        stringBuffer.append(this.enrollmentContext);
        return stringBuffer.toString();
    }
}
