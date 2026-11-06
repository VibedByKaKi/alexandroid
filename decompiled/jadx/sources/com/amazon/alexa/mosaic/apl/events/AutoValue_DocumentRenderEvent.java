package com.amazon.alexa.mosaic.apl.events;

import com.amazon.alexa.mosaic.apl.events.DocumentRenderEvent;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
final class AutoValue_DocumentRenderEvent extends DocumentRenderEvent {
    private final long renderDuration;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends DocumentRenderEvent.Builder {
        private long renderDuration;
        private byte set$0;

        @Override // com.amazon.alexa.mosaic.apl.events.DocumentRenderEvent.Builder
        public DocumentRenderEvent build() {
            if (this.set$0 == 1) {
                return new AutoValue_DocumentRenderEvent(this.renderDuration, 0);
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Missing required properties: renderDuration");
            return null;
        }

        @Override // com.amazon.alexa.mosaic.apl.events.DocumentRenderEvent.Builder
        public DocumentRenderEvent.Builder renderDuration(long j) {
            this.renderDuration = j;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }
    }

    private AutoValue_DocumentRenderEvent(long j) {
        this.renderDuration = j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof DocumentRenderEvent) && this.renderDuration == ((DocumentRenderEvent) obj).renderDuration();
    }

    public int hashCode() {
        long j = this.renderDuration;
        return ((int) (j ^ (j >>> 32))) ^ 1000003;
    }

    @Override // com.amazon.alexa.mosaic.apl.events.DocumentRenderEvent
    public long renderDuration() {
        return this.renderDuration;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(this.renderDuration, StringSubstitutor.DEFAULT_VAR_END, new StringBuilder("DocumentRenderEvent{renderDuration="));
    }

    public /* synthetic */ AutoValue_DocumentRenderEvent(long j, int i) {
        this(j);
    }
}
