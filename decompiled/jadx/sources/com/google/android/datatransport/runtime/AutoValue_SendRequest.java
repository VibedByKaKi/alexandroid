package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.runtime.SendRequest;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class AutoValue_SendRequest extends SendRequest {
    private final Encoding encoding;
    private final Event<?> event;
    private final Transformer<?, byte[]> transformer;
    private final TransportContext transportContext;
    private final String transportName;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends SendRequest.Builder {
        private Encoding encoding;
        private Event<?> event;
        private Transformer<?, byte[]> transformer;
        private TransportContext transportContext;
        private String transportName;

        @Override // com.google.android.datatransport.runtime.SendRequest.Builder
        public SendRequest build() {
            String str = this.transportContext == null ? " transportContext" : "";
            if (this.transportName == null) {
                str = str.concat(" transportName");
            }
            if (this.event == null) {
                str = str.concat(" event");
            }
            if (this.transformer == null) {
                str = str.concat(" transformer");
            }
            if (this.encoding == null) {
                str = str.concat(" encoding");
            }
            if (str.isEmpty()) {
                return new AutoValue_SendRequest(this.transportContext, this.transportName, this.event, this.transformer, this.encoding);
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Missing required properties:".concat(str));
            return null;
        }

        @Override // com.google.android.datatransport.runtime.SendRequest.Builder
        public SendRequest.Builder setEncoding(Encoding encoding) {
            if (encoding != null) {
                this.encoding = encoding;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null encoding");
            return null;
        }

        @Override // com.google.android.datatransport.runtime.SendRequest.Builder
        public SendRequest.Builder setEvent(Event<?> event) {
            if (event != null) {
                this.event = event;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null event");
            return null;
        }

        @Override // com.google.android.datatransport.runtime.SendRequest.Builder
        public SendRequest.Builder setTransformer(Transformer<?, byte[]> transformer) {
            if (transformer != null) {
                this.transformer = transformer;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null transformer");
            return null;
        }

        @Override // com.google.android.datatransport.runtime.SendRequest.Builder
        public SendRequest.Builder setTransportContext(TransportContext transportContext) {
            if (transportContext != null) {
                this.transportContext = transportContext;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null transportContext");
            return null;
        }

        @Override // com.google.android.datatransport.runtime.SendRequest.Builder
        public SendRequest.Builder setTransportName(String str) {
            if (str != null) {
                this.transportName = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null transportName");
            return null;
        }
    }

    private AutoValue_SendRequest(TransportContext transportContext, String str, Event<?> event, Transformer<?, byte[]> transformer, Encoding encoding) {
        this.transportContext = transportContext;
        this.transportName = str;
        this.event = event;
        this.transformer = transformer;
        this.encoding = encoding;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SendRequest) {
            SendRequest sendRequest = (SendRequest) obj;
            if (this.transportContext.equals(sendRequest.getTransportContext()) && this.transportName.equals(sendRequest.getTransportName()) && this.event.equals(sendRequest.getEvent()) && this.transformer.equals(sendRequest.getTransformer()) && this.encoding.equals(sendRequest.getEncoding())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.SendRequest
    public Encoding getEncoding() {
        return this.encoding;
    }

    @Override // com.google.android.datatransport.runtime.SendRequest
    public Event<?> getEvent() {
        return this.event;
    }

    @Override // com.google.android.datatransport.runtime.SendRequest
    public Transformer<?, byte[]> getTransformer() {
        return this.transformer;
    }

    @Override // com.google.android.datatransport.runtime.SendRequest
    public TransportContext getTransportContext() {
        return this.transportContext;
    }

    @Override // com.google.android.datatransport.runtime.SendRequest
    public String getTransportName() {
        return this.transportName;
    }

    public int hashCode() {
        return this.encoding.hashCode() ^ ((((((((this.transportContext.hashCode() ^ 1000003) * 1000003) ^ this.transportName.hashCode()) * 1000003) ^ this.event.hashCode()) * 1000003) ^ this.transformer.hashCode()) * 1000003);
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.transportContext + ", transportName=" + this.transportName + ", event=" + this.event + ", transformer=" + this.transformer + ", encoding=" + this.encoding + StringSubstitutor.DEFAULT_VAR_END;
    }
}
