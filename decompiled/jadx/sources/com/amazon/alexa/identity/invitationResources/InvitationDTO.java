package com.amazon.alexa.identity.invitationResources;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public class InvitationDTO {
    String id;
    String inviteePersonId;
    String inviterPersonId;
    InvitationStatus status;

    public InvitationDTO(String str, String str2, String str3, InvitationStatus invitationStatus) {
        this.id = str;
        this.inviteePersonId = str2;
        this.inviterPersonId = str3;
        this.status = invitationStatus;
    }

    public String getInviteePersonId() {
        return this.inviteePersonId;
    }

    public InvitationStatus getStatus() {
        return this.status;
    }
}
