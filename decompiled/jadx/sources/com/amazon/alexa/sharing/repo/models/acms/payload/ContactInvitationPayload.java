package com.amazon.alexa.sharing.repo.models.acms.payload;

import com.google.gson.annotations.SerializedName;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class ContactInvitationPayload implements MessagePayload {
    public static final String TYPE = "message/contact-invitation";

    @SerializedName("invitationText")
    private String invitationText;

    @SerializedName("templateId")
    private String templateId;

    public String getTemplateId() {
        return this.templateId;
    }

    public String getText() {
        return this.invitationText;
    }

    @Override // com.amazon.alexa.sharing.repo.models.acms.payload.MessagePayload
    public String getType() {
        return "message/contact-invitation";
    }

    public void setTemplateId(String str) {
        this.templateId = str;
    }

    public void setText(String str) {
        this.invitationText = str;
    }
}
