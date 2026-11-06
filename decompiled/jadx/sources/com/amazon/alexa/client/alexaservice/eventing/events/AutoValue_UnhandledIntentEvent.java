package com.amazon.alexa.client.alexaservice.eventing.events;

import android.content.Intent;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_UnhandledIntentEvent extends UnhandledIntentEvent {
    private final Intent intent;

    public AutoValue_UnhandledIntentEvent(Intent intent) {
        if (intent != null) {
            this.intent = intent;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null intent");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UnhandledIntentEvent) {
            return this.intent.equals(((UnhandledIntentEvent) obj).getIntent());
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.UnhandledIntentEvent
    public Intent getIntent() {
        return this.intent;
    }

    public int hashCode() {
        return this.intent.hashCode() ^ 1000003;
    }

    public String toString() {
        return "UnhandledIntentEvent{intent=" + this.intent + StringSubstitutor.DEFAULT_VAR_END;
    }
}
