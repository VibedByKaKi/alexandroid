package com.amazon.alexa.mosaic.apl.events;

import com.amazon.alexa.mosaic.apl.events.DataSourceErrorEvent;
import org.apache.commons.text.StringSubstitutor;
import org.json.JSONArray;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
final class AutoValue_DataSourceErrorEvent extends DataSourceErrorEvent {
    private final JSONArray errors;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends DataSourceErrorEvent.Builder {
        private JSONArray errors;

        @Override // com.amazon.alexa.mosaic.apl.events.DataSourceErrorEvent.Builder
        public DataSourceErrorEvent build() {
            JSONArray jSONArray = this.errors;
            if (jSONArray != null) {
                return new AutoValue_DataSourceErrorEvent(jSONArray, 0);
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Missing required properties: errors");
            return null;
        }

        @Override // com.amazon.alexa.mosaic.apl.events.DataSourceErrorEvent.Builder
        public DataSourceErrorEvent.Builder errors(JSONArray jSONArray) {
            if (jSONArray != null) {
                this.errors = jSONArray;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null errors");
            return null;
        }
    }

    private AutoValue_DataSourceErrorEvent(JSONArray jSONArray) {
        this.errors = jSONArray;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DataSourceErrorEvent) {
            return this.errors.equals(((DataSourceErrorEvent) obj).errors());
        }
        return false;
    }

    @Override // com.amazon.alexa.mosaic.apl.events.DataSourceErrorEvent
    public JSONArray errors() {
        return this.errors;
    }

    public int hashCode() {
        return this.errors.hashCode() ^ 1000003;
    }

    public String toString() {
        return "DataSourceErrorEvent{errors=" + this.errors + StringSubstitutor.DEFAULT_VAR_END;
    }

    public /* synthetic */ AutoValue_DataSourceErrorEvent(JSONArray jSONArray, int i) {
        this(jSONArray);
    }
}
