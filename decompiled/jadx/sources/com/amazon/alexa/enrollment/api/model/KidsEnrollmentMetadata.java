package com.amazon.alexa.enrollment.api.model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class KidsEnrollmentMetadata {
    private final String backRoute;
    private final String childCustomerId;
    private final String childName;
    private final String failureRoute;
    private final String personECID;
    private final String personId;
    private final boolean showConsentCollectedToast;
    private final String successRoute;

    public KidsEnrollmentMetadata(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
        this.childCustomerId = str;
        this.personId = str2;
        this.personECID = str3;
        this.childName = str4;
        this.successRoute = str5;
        this.failureRoute = str6;
        this.backRoute = str7;
        this.showConsentCollectedToast = z;
    }

    public String getBackRoute() {
        return this.backRoute;
    }

    public String getChildCustomerId() {
        return this.childCustomerId;
    }

    public String getChildName() {
        return this.childName;
    }

    public String getFailureRoute() {
        return this.failureRoute;
    }

    public String getPersonECID() {
        return this.personECID;
    }

    public String getPersonId() {
        return this.personId;
    }

    public boolean getShowConsentCollectedToast() {
        return this.showConsentCollectedToast;
    }

    public String getSuccessRoute() {
        return this.successRoute;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("ChildCustomerID: ");
        stringBuffer.append(this.childCustomerId);
        stringBuffer.append(" PersonID: ");
        stringBuffer.append(this.personId);
        stringBuffer.append(" PersonECID: ");
        stringBuffer.append(this.personECID);
        stringBuffer.append(" SuccessRoute: ");
        stringBuffer.append(this.successRoute);
        stringBuffer.append(" FailureRoute: ");
        stringBuffer.append(this.failureRoute);
        stringBuffer.append(" BackRoute: ");
        stringBuffer.append(this.backRoute);
        stringBuffer.append(" ShowConsentCollectedToast: ");
        stringBuffer.append(this.showConsentCollectedToast);
        return stringBuffer.toString();
    }
}
