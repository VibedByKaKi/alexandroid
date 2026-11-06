package com.dee.app.contacts.interfaces.models.data.server;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final class ServerAccount {
    private String commsId;
    private String commsProvisionStatus;
    private Boolean commsProvisioned;
    private String directedId;
    private Boolean enrolledInAlexa;
    private String firstName;
    private Boolean isChild;
    private String lastName;
    private String mapDirectedDefaultActorId;
    private String personIdV2;
    private String phoneCountryCode;
    private String phoneNumber;
    private ServerPhoneNumberMetadata phoneNumberMetadataForTheActor;
    private String phoneticFirstName;
    private String phoneticLastName;
    private Boolean signedInUser;
    private Boolean speakerProvisioned;

    public ServerAccount(String str, String str2, ServerPhoneNumberMetadata serverPhoneNumberMetadata) {
        this.commsId = str;
        this.mapDirectedDefaultActorId = str2;
        this.phoneNumberMetadataForTheActor = serverPhoneNumberMetadata;
    }

    public String getMapDirectedDefaultActorId() {
        return this.mapDirectedDefaultActorId;
    }

    public String getPhoneCountryCode() {
        return this.phoneCountryCode;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public ServerPhoneNumberMetadata getPhoneNumberMetadataForTheActor() {
        return this.phoneNumberMetadataForTheActor;
    }

    public Boolean getSignedInUser() {
        return this.signedInUser;
    }

    public ServerAccount() {
    }
}
