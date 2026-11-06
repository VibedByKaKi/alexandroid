package com.amazon.alexa.mosaic.apl.events;

import com.amazon.alexa.mosaic.apl.events.VisualContextEvent;
import org.apache.commons.text.StringSubstitutor;
import org.json.JSONObject;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
final class AutoValue_VisualContextEvent extends VisualContextEvent {
    private final JSONObject payload;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends VisualContextEvent.Builder {
        private JSONObject payload;

        @Override // com.amazon.alexa.mosaic.apl.events.VisualContextEvent.Builder
        public VisualContextEvent build() {
            JSONObject jSONObject = this.payload;
            if (jSONObject != null) {
                return new AutoValue_VisualContextEvent(jSONObject, 0);
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Missing required properties: payload");
            return null;
        }

        @Override // com.amazon.alexa.mosaic.apl.events.VisualContextEvent.Builder
        public VisualContextEvent.Builder payload(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.payload = jSONObject;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null payload");
            return null;
        }
    }

    private AutoValue_VisualContextEvent(JSONObject jSONObject) {
        this.payload = jSONObject;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof VisualContextEvent) {
            return this.payload.equals(((VisualContextEvent) obj).payload());
        }
        return false;
    }

    public int hashCode() {
        return this.payload.hashCode() ^ 1000003;
    }

    @Override // com.amazon.alexa.mosaic.apl.events.VisualContextEvent
    public JSONObject payload() {
        return this.payload;
    }

    public String toString() {
        return "VisualContextEvent{payload=" + this.payload + StringSubstitutor.DEFAULT_VAR_END;
    }

    public /* synthetic */ AutoValue_VisualContextEvent(JSONObject jSONObject, int i) {
        this(jSONObject);
    }
}
