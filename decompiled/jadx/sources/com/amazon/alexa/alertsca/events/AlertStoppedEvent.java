package com.amazon.alexa.alertsca.events;

import com.amazon.alexa.alertsca.AlertRecord;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes16.dex */
public abstract class AlertStoppedEvent extends AlertEvent {
    public static AlertStoppedEvent create(AlertRecord alertRecord) {
        return new AutoValue_AlertStoppedEvent(alertRecord, false);
    }

    public abstract boolean isDismissedByUser();

    public static AlertStoppedEvent create(AlertRecord alertRecord, boolean z) {
        return new AutoValue_AlertStoppedEvent(alertRecord, z);
    }
}
