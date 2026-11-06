package com.amazon.alexa.alertsca.events;

import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes16.dex */
public abstract class AlertCleanUpEvent extends Event {
    public static AlertCleanUpEvent create(int i) {
        return new AutoValue_AlertCleanUpEvent(i);
    }

    public abstract int getAlertRecordId();
}
