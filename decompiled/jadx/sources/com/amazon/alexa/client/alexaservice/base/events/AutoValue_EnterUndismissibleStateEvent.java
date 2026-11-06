package com.amazon.alexa.client.alexaservice.base.events;

import android.app.Notification;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_EnterUndismissibleStateEvent extends EnterUndismissibleStateEvent {
    private final Notification foregroundNotification;
    private final int foregroundNotificationId;

    public AutoValue_EnterUndismissibleStateEvent(int i, Notification notification) {
        this.foregroundNotificationId = i;
        if (notification != null) {
            this.foregroundNotification = notification;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null foregroundNotification");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof EnterUndismissibleStateEvent) {
            EnterUndismissibleStateEvent enterUndismissibleStateEvent = (EnterUndismissibleStateEvent) obj;
            if (this.foregroundNotificationId == enterUndismissibleStateEvent.getForegroundNotificationId() && this.foregroundNotification.equals(enterUndismissibleStateEvent.getForegroundNotification())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.events.EnterUndismissibleStateEvent
    public Notification getForegroundNotification() {
        return this.foregroundNotification;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.events.EnterUndismissibleStateEvent
    public int getForegroundNotificationId() {
        return this.foregroundNotificationId;
    }

    public int hashCode() {
        return this.foregroundNotification.hashCode() ^ ((this.foregroundNotificationId ^ 1000003) * 1000003);
    }

    public String toString() {
        return "EnterUndismissibleStateEvent{foregroundNotificationId=" + this.foregroundNotificationId + ", foregroundNotification=" + this.foregroundNotification + StringSubstitutor.DEFAULT_VAR_END;
    }
}
