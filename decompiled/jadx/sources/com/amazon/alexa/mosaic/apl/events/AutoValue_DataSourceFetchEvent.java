package com.amazon.alexa.mosaic.apl.events;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.mosaic.apl.events.DataSourceFetchEvent;
import java.util.Map;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
final class AutoValue_DataSourceFetchEvent extends DataSourceFetchEvent {
    private final Map<String, Object> params;
    private final String type;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends DataSourceFetchEvent.Builder {
        private Map<String, Object> params;
        private String type;

        @Override // com.amazon.alexa.mosaic.apl.events.DataSourceFetchEvent.Builder
        public DataSourceFetchEvent build() {
            Map<String, Object> map;
            String str = this.type;
            if (str != null && (map = this.params) != null) {
                return new AutoValue_DataSourceFetchEvent(str, map, 0);
            }
            StringBuilder sb = new StringBuilder();
            if (this.type == null) {
                sb.append(" type");
            }
            if (this.params == null) {
                sb.append(" params");
            }
            Single$$ExternalSyntheticBUOutline0.m$2(Automotive$$ExternalSyntheticOutline0.m("Missing required properties:", sb));
            return null;
        }

        @Override // com.amazon.alexa.mosaic.apl.events.DataSourceFetchEvent.Builder
        public DataSourceFetchEvent.Builder params(Map<String, Object> map) {
            if (map != null) {
                this.params = map;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null params");
            return null;
        }

        @Override // com.amazon.alexa.mosaic.apl.events.DataSourceFetchEvent.Builder
        public DataSourceFetchEvent.Builder type(String str) {
            if (str != null) {
                this.type = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null type");
            return null;
        }
    }

    private AutoValue_DataSourceFetchEvent(String str, Map<String, Object> map) {
        this.type = str;
        this.params = map;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DataSourceFetchEvent) {
            DataSourceFetchEvent dataSourceFetchEvent = (DataSourceFetchEvent) obj;
            if (this.type.equals(dataSourceFetchEvent.type()) && this.params.equals(dataSourceFetchEvent.params())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.params.hashCode() ^ ((this.type.hashCode() ^ 1000003) * 1000003);
    }

    @Override // com.amazon.alexa.mosaic.apl.events.DataSourceFetchEvent
    public Map<String, Object> params() {
        return this.params;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DataSourceFetchEvent{type=");
        sb.append(this.type);
        sb.append(", params=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, this.params, StringSubstitutor.DEFAULT_VAR_END);
    }

    @Override // com.amazon.alexa.mosaic.apl.events.DataSourceFetchEvent
    public String type() {
        return this.type;
    }

    public /* synthetic */ AutoValue_DataSourceFetchEvent(String str, Map map, int i) {
        this(str, map);
    }
}
