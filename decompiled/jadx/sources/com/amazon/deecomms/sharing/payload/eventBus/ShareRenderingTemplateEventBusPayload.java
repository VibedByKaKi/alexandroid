package com.amazon.deecomms.sharing.payload.eventBus;

import java.util.HashMap;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class ShareRenderingTemplateEventBusPayload implements SharingEventBusPayload {
    public HashMap<String, Object> content;
    public HashMap<String, String> metadata;
    public String name;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareRenderingTemplateEventBusPayload)) {
            return false;
        }
        ShareRenderingTemplateEventBusPayload shareRenderingTemplateEventBusPayload = (ShareRenderingTemplateEventBusPayload) obj;
        return Objects.equals(this.content, shareRenderingTemplateEventBusPayload.content) && Objects.equals(this.metadata, shareRenderingTemplateEventBusPayload.metadata);
    }

    public int hashCode() {
        return Objects.hash(this.content, this.metadata);
    }

    public String toString() {
        return "SharedMessageEventBusPayload{name=" + this.name + ", content=" + this.content + ", metadata=" + this.metadata + AbstractJsonLexerKt.END_OBJ;
    }
}
