package com.amazon.alexa.accessory.notificationpublisher.artifactdownloader.models;

import com.amazon.alexa.accessory.notificationpublisher.artifactdownloader.networking.adapters.StronglyTypedString;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes15.dex */
public abstract class ArtifactLocation implements StronglyTypedString {
    public static ArtifactLocation create(String str) {
        return new AutoValue_ArtifactLocation(str);
    }

    public static StronglyTypedString.StronglyTypedStringAdapter<ArtifactLocation> getTypeAdapter() {
        return new StronglyTypedString.StronglyTypedStringAdapter<ArtifactLocation>() { // from class: com.amazon.alexa.accessory.notificationpublisher.artifactdownloader.models.ArtifactLocation.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.amazon.alexa.accessory.notificationpublisher.artifactdownloader.networking.adapters.StronglyTypedString.StronglyTypedStringAdapter
            public ArtifactLocation instantiate(String str) {
                return ArtifactLocation.create(str);
            }
        };
    }
}
