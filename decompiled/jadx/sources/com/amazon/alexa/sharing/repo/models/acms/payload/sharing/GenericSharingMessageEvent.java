package com.amazon.alexa.sharing.repo.models.acms.payload.sharing;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class GenericSharingMessageEvent {
    private String globalMessageId;
    private String name;
    private GenericSharingMessageEventPayload payload;
    private String templateKey;

    public GenericSharingMessageEvent(GenericSharingMessageEventPayload genericSharingMessageEventPayload, String str, String str2, String str3) {
        this.payload = genericSharingMessageEventPayload;
        this.name = str;
        this.globalMessageId = str2;
        this.templateKey = str3;
    }

    public String getGlobalMessageId() {
        return this.globalMessageId;
    }

    public String getName() {
        return this.name;
    }

    public GenericSharingMessageEventPayload getPayload() {
        return this.payload;
    }

    public String getTemplateKey() {
        return this.templateKey;
    }

    public void setGlobalMessageId(String str) {
        this.globalMessageId = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPayload(GenericSharingMessageEventPayload genericSharingMessageEventPayload) {
        this.payload = genericSharingMessageEventPayload;
    }

    public void setTemplateKey(String str) {
        this.templateKey = str;
    }

    public GenericSharingMessageEvent() {
        this(null, null, null, "TemplateKeyNotFound");
    }
}
