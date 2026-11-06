package com.amazon.alexa.externalnotifications.capability.models;

import com.amazon.alexa.externalnotifications.capability.models.StronglyTypedString;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class NotificationId implements StronglyTypedString {
    public static NotificationId create(String str) {
        return new AutoValue_NotificationId(str);
    }

    public static StronglyTypedString.StronglyTypedStringAdapter<NotificationId> getTypeAdapter() {
        return new StronglyTypedString.StronglyTypedStringAdapter<NotificationId>() { // from class: com.amazon.alexa.externalnotifications.capability.models.NotificationId.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.amazon.alexa.externalnotifications.capability.models.StronglyTypedString.StronglyTypedStringAdapter
            public NotificationId instantiate(String str) {
                return NotificationId.create(str);
            }
        };
    }
}
