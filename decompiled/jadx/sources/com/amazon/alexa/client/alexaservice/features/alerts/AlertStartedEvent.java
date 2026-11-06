package com.amazon.alexa.client.alexaservice.features.alerts;

import com.amazon.alexa.api.AlertType;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class AlertStartedEvent extends AlertEvent {
    public static AlertStartedEvent create(String str, AlertType alertType) {
        return new AutoValue_AlertStartedEvent(str, alertType);
    }
}
