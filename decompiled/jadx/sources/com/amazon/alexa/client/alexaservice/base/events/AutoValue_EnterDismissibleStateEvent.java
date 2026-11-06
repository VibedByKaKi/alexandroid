package com.amazon.alexa.client.alexaservice.base.events;

import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_EnterDismissibleStateEvent extends EnterDismissibleStateEvent {
    private final boolean shouldForegroundNotificationBeRemoved;

    public AutoValue_EnterDismissibleStateEvent(boolean z) {
        this.shouldForegroundNotificationBeRemoved = z;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof EnterDismissibleStateEvent) && this.shouldForegroundNotificationBeRemoved == ((EnterDismissibleStateEvent) obj).shouldForegroundNotificationBeRemoved();
    }

    public int hashCode() {
        return (this.shouldForegroundNotificationBeRemoved ? 1231 : 1237) ^ 1000003;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.events.EnterDismissibleStateEvent
    public boolean shouldForegroundNotificationBeRemoved() {
        return this.shouldForegroundNotificationBeRemoved;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder("EnterDismissibleStateEvent{shouldForegroundNotificationBeRemoved="), this.shouldForegroundNotificationBeRemoved, StringSubstitutor.DEFAULT_VAR_END);
    }
}
