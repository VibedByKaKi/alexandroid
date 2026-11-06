package com.amazon.alexa.client.alexaservice.eventing.events;

import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_HttpExceptionOccurredEvent extends HttpExceptionOccurredEvent {
    private final boolean textDialog;

    public AutoValue_HttpExceptionOccurredEvent(boolean z) {
        this.textDialog = z;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof HttpExceptionOccurredEvent) && this.textDialog == ((HttpExceptionOccurredEvent) obj).isTextDialog();
    }

    public int hashCode() {
        return (this.textDialog ? 1231 : 1237) ^ 1000003;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.HttpExceptionOccurredEvent
    public boolean isTextDialog() {
        return this.textDialog;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder("HttpExceptionOccurredEvent{textDialog="), this.textDialog, StringSubstitutor.DEFAULT_VAR_END);
    }
}
