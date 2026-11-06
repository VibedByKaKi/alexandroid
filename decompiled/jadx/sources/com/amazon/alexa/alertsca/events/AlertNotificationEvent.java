package com.amazon.alexa.alertsca.events;

import android.app.Notification;
import com.amazon.alexa.alertsca.AlertRecord;
import com.amazon.alexa.utils.validation.Preconditions;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes16.dex */
public abstract class AlertNotificationEvent extends Event {
    public static AlertNotificationEvent create(AlertRecord alertRecord, Notification notification) {
        Preconditions.notNull(alertRecord, "alertRecord is null");
        Preconditions.notNull(notification, "notification is null");
        return new AutoValue_AlertNotificationEvent(alertRecord, notification);
    }

    public abstract AlertRecord getAlertRecord();

    public abstract Notification getNotification();
}
