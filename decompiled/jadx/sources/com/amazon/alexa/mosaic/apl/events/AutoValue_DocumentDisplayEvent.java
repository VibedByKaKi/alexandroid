package com.amazon.alexa.mosaic.apl.events;

import com.amazon.alexa.mosaic.apl.events.DocumentDisplayEvent;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
final class AutoValue_DocumentDisplayEvent extends DocumentDisplayEvent {
    private final long displayDuration;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends DocumentDisplayEvent.Builder {
        private long displayDuration;
        private byte set$0;

        @Override // com.amazon.alexa.mosaic.apl.events.DocumentDisplayEvent.Builder
        public DocumentDisplayEvent build() {
            if (this.set$0 == 1) {
                return new AutoValue_DocumentDisplayEvent(this.displayDuration, 0);
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Missing required properties: displayDuration");
            return null;
        }

        @Override // com.amazon.alexa.mosaic.apl.events.DocumentDisplayEvent.Builder
        public DocumentDisplayEvent.Builder displayDuration(long j) {
            this.displayDuration = j;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }
    }

    private AutoValue_DocumentDisplayEvent(long j) {
        this.displayDuration = j;
    }

    @Override // com.amazon.alexa.mosaic.apl.events.DocumentDisplayEvent
    public long displayDuration() {
        return this.displayDuration;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof DocumentDisplayEvent) && this.displayDuration == ((DocumentDisplayEvent) obj).displayDuration();
    }

    public int hashCode() {
        long j = this.displayDuration;
        return ((int) (j ^ (j >>> 32))) ^ 1000003;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(this.displayDuration, StringSubstitutor.DEFAULT_VAR_END, new StringBuilder("DocumentDisplayEvent{displayDuration="));
    }

    public /* synthetic */ AutoValue_DocumentDisplayEvent(long j, int i) {
        this(j);
    }
}
