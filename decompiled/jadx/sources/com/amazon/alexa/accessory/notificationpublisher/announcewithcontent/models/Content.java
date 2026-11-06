package com.amazon.alexa.accessory.notificationpublisher.announcewithcontent.models;

import com.amazon.alexa.externalnotifications.capability.models.StronglyTypedString;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes15.dex */
public abstract class Content implements StronglyTypedString {
    public static Content create(String str) {
        return new AutoValue_Content(str);
    }

    public static StronglyTypedString.StronglyTypedStringAdapter<Content> getTypeAdapter() {
        return new StronglyTypedString.StronglyTypedStringAdapter<Content>() { // from class: com.amazon.alexa.accessory.notificationpublisher.announcewithcontent.models.Content.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.amazon.alexa.externalnotifications.capability.models.StronglyTypedString.StronglyTypedStringAdapter
            public Content instantiate(String str) {
                return Content.create(str);
            }
        };
    }
}
