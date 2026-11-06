package com.amazon.deecomms.sharing.payload.eventBus;

import com.amazon.deecomms.sharing.payload.parse.GenericSharingMessageEventPayload;
import java.util.HashMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class PreviewSendShareResponse implements SharingEventBusPayload {
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
