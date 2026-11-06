package com.amazon.alexa.mosaic.apl.events;

import com.amazon.alexa.mosaic.apl.events.FinishEvent;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
final class AutoValue_FinishEvent extends FinishEvent {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends FinishEvent.Builder {
        @Override // com.amazon.alexa.mosaic.apl.events.FinishEvent.Builder
        public FinishEvent build() {
            return new AutoValue_FinishEvent(0);
        }
    }

    public /* synthetic */ AutoValue_FinishEvent(int i) {
        this();
    }

    public boolean equals(Object obj) {
        return obj == this || (obj instanceof FinishEvent);
    }

    public int hashCode() {
        return 1;
    }

    public String toString() {
        return "FinishEvent{}";
    }

    private AutoValue_FinishEvent() {
    }
}
