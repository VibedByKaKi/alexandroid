package com.amazon.alexa.client.alexaservice.base.application.notifications;

import android.app.Notification;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_AlexaNotification extends AlexaNotification {
    private final int id;
    private final boolean mediaNotification;
    private final Notification notification;

    public AutoValue_AlexaNotification(Notification notification, int i, boolean z) {
        if (notification == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null notification");
            throw null;
        }
        this.notification = notification;
        this.id = i;
        this.mediaNotification = z;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AlexaNotification) {
            AlexaNotification alexaNotification = (AlexaNotification) obj;
            if (this.notification.equals(alexaNotification.getNotification()) && this.id == alexaNotification.getId() && this.mediaNotification == alexaNotification.isMediaNotification()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.application.notifications.AlexaNotification
    public int getId() {
        return this.id;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.application.notifications.AlexaNotification
    public Notification getNotification() {
        return this.notification;
    }

    public int hashCode() {
        return (this.mediaNotification ? 1231 : 1237) ^ ((((this.notification.hashCode() ^ 1000003) * 1000003) ^ this.id) * 1000003);
    }

    @Override // com.amazon.alexa.client.alexaservice.base.application.notifications.AlexaNotification
    public boolean isMediaNotification() {
        return this.mediaNotification;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AlexaNotification{notification=");
        sb.append(this.notification);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", mediaNotification=");
        return a$$ExternalSyntheticOutline0.m(sb, this.mediaNotification, StringSubstitutor.DEFAULT_VAR_END);
    }
}
