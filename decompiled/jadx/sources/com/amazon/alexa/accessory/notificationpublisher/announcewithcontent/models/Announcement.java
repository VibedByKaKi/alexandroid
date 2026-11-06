package com.amazon.alexa.accessory.notificationpublisher.announcewithcontent.models;

import com.amazon.alexa.externalnotifications.capability.models.StronglyTypedString;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes15.dex */
public abstract class Announcement implements StronglyTypedString {
    public static Announcement create(String str) {
        return new AutoValue_Announcement(str);
    }

    public static StronglyTypedString.StronglyTypedStringAdapter<Announcement> getTypeAdapter() {
        return new StronglyTypedString.StronglyTypedStringAdapter<Announcement>() { // from class: com.amazon.alexa.accessory.notificationpublisher.announcewithcontent.models.Announcement.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.amazon.alexa.externalnotifications.capability.models.StronglyTypedString.StronglyTypedStringAdapter
            public Announcement instantiate(String str) {
                return Announcement.create(str);
            }
        };
    }
}
