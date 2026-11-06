package com.amazon.alexa.sharing.sharingsdk.payload.response;

import com.amazon.alexa.sharing.repo.models.acms.payload.sharing.GenericSharingMessageEventPayload;
import java.util.HashMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class PreviewSendShareResponse implements SharingSDKResponsePayload {
    private GenericSharingMessageEventPayload payload;
    private String name = null;
    private HashMap<String, Object> content = new HashMap<>();
    private HashMap<String, String> metadata = new HashMap<>();

    public PreviewSendShareResponse(GenericSharingMessageEventPayload genericSharingMessageEventPayload) {
        this.payload = genericSharingMessageEventPayload;
    }

    public HashMap<String, Object> getContent() {
        return this.content;
    }

    public HashMap<String, String> getMetadata() {
        return this.metadata;
    }

    public String getName() {
        return this.name;
    }

    public void setContent(HashMap<String, Object> hashMap) {
        this.content = hashMap;
    }

    public void setMetadata(HashMap<String, String> hashMap) {
        this.metadata = hashMap;
    }

    public void setName(String str) {
        this.name = str;
    }
}
