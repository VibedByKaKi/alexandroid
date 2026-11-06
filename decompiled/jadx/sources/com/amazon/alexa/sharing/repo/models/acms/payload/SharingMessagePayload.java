package com.amazon.alexa.sharing.repo.models.acms.payload;

import com.amazon.alexa.sharing.repo.models.acms.payload.sharing.GenericSharingMessageEventPayload;
import com.google.gson.annotations.SerializedName;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class SharingMessagePayload implements MessagePayload {
    public static final String TYPE = "message/shared-content";

    @SerializedName("sharingMessage")
    private GenericSharingMessageEventPayload sharingMessage;

    public SharingMessagePayload(GenericSharingMessageEventPayload genericSharingMessageEventPayload) {
        this.sharingMessage = genericSharingMessageEventPayload;
    }

    public GenericSharingMessageEventPayload getSharingMessage() {
        return this.sharingMessage;
    }

    @Override // com.amazon.alexa.sharing.repo.models.acms.payload.MessagePayload
    public String getType() {
        return "message/shared-content";
    }

    public void setSharingMessage(GenericSharingMessageEventPayload genericSharingMessageEventPayload) {
        this.sharingMessage = genericSharingMessageEventPayload;
    }

    public SharingMessagePayload() {
        this(null);
    }
}
