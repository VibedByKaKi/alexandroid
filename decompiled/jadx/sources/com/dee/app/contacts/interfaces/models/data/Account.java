package com.dee.app.contacts.interfaces.models.data;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class Account {
    private String mapDirectedDefaultActorId;
    private String phoneCountryCode;
    private String phoneCountryCodeForTheActor;
    private String phoneNumber;
    private String phoneNumberForTheActor;
    private Boolean signedInUser;

    public Account(String str, String str2, Boolean bool, String str3, String str4, String str5) {
        this.phoneNumber = str;
        this.phoneCountryCode = str2;
        this.signedInUser = bool;
        this.mapDirectedDefaultActorId = str3;
        this.phoneNumberForTheActor = str4;
        this.phoneCountryCodeForTheActor = str5;
    }

    public String getMapDirectedDefaultActorId() {
        return this.mapDirectedDefaultActorId;
    }

    public String getPhoneCountryCode() {
        return this.phoneCountryCode;
    }

    public String getPhoneCountryCodeForTheActor() {
        return this.phoneCountryCodeForTheActor;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getPhoneNumberForTheActor() {
        return this.phoneNumberForTheActor;
    }

    public Boolean getSignedInUser() {
        return this.signedInUser;
    }

    public Account() {
    }
}
