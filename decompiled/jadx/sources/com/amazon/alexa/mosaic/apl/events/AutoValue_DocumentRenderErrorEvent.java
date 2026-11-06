package com.amazon.alexa.mosaic.apl.events;

import com.amazon.alexa.mosaic.apl.events.DocumentRenderErrorEvent;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
final class AutoValue_DocumentRenderErrorEvent extends DocumentRenderErrorEvent {
    private final String message;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends DocumentRenderErrorEvent.Builder {
        private String message;

        @Override // com.amazon.alexa.mosaic.apl.events.DocumentRenderErrorEvent.Builder
        public DocumentRenderErrorEvent build() {
            String str = this.message;
            if (str != null) {
                return new AutoValue_DocumentRenderErrorEvent(str, 0);
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Missing required properties: message");
            return null;
        }

        @Override // com.amazon.alexa.mosaic.apl.events.DocumentRenderErrorEvent.Builder
        public DocumentRenderErrorEvent.Builder message(String str) {
            if (str != null) {
                this.message = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null message");
            return null;
        }
    }

    private AutoValue_DocumentRenderErrorEvent(String str) {
        this.message = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DocumentRenderErrorEvent) {
            return this.message.equals(((DocumentRenderErrorEvent) obj).message());
        }
        return false;
    }

    public int hashCode() {
        return this.message.hashCode() ^ 1000003;
    }

    @Override // com.amazon.alexa.mosaic.apl.events.DocumentRenderErrorEvent
    public String message() {
        return this.message;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder("DocumentRenderErrorEvent{message="), this.message, StringSubstitutor.DEFAULT_VAR_END);
    }

    public /* synthetic */ AutoValue_DocumentRenderErrorEvent(String str, int i) {
        this(str);
    }
}
