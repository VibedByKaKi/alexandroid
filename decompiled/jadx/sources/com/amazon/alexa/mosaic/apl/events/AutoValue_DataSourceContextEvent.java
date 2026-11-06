package com.amazon.alexa.mosaic.apl.events;

import com.amazon.alexa.mosaic.apl.events.DataSourceContextEvent;
import org.apache.commons.text.StringSubstitutor;
import org.json.JSONArray;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
final class AutoValue_DataSourceContextEvent extends DataSourceContextEvent {
    private final JSONArray payload;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends DataSourceContextEvent.Builder {
        private JSONArray payload;

        @Override // com.amazon.alexa.mosaic.apl.events.DataSourceContextEvent.Builder
        public DataSourceContextEvent build() {
            JSONArray jSONArray = this.payload;
            if (jSONArray != null) {
                return new AutoValue_DataSourceContextEvent(jSONArray, 0);
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Missing required properties: payload");
            return null;
        }

        @Override // com.amazon.alexa.mosaic.apl.events.DataSourceContextEvent.Builder
        public DataSourceContextEvent.Builder payload(JSONArray jSONArray) {
            if (jSONArray != null) {
                this.payload = jSONArray;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null payload");
            return null;
        }
    }

    private AutoValue_DataSourceContextEvent(JSONArray jSONArray) {
        this.payload = jSONArray;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DataSourceContextEvent) {
            return this.payload.equals(((DataSourceContextEvent) obj).payload());
        }
        return false;
    }

    public int hashCode() {
        return this.payload.hashCode() ^ 1000003;
    }

    @Override // com.amazon.alexa.mosaic.apl.events.DataSourceContextEvent
    public JSONArray payload() {
        return this.payload;
    }

    public String toString() {
        return "DataSourceContextEvent{payload=" + this.payload + StringSubstitutor.DEFAULT_VAR_END;
    }

    public /* synthetic */ AutoValue_DataSourceContextEvent(JSONArray jSONArray, int i) {
        this(jSONArray);
    }
}
