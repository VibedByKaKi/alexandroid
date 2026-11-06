package com.amazon.alexa.accessory.notificationpublisher.artifactdownloader.models;

import com.amazon.alexa.accessory.notificationpublisher.artifactdownloader.networking.adapters.StronglyTypedString;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes15.dex */
public abstract class ArtifactIdentifier implements StronglyTypedString {
    public static ArtifactIdentifier create(String str) {
        return new AutoValue_ArtifactIdentifier(str);
    }

    public static StronglyTypedString.StronglyTypedStringAdapter<ArtifactIdentifier> getTypeAdapter() {
        return new StronglyTypedString.StronglyTypedStringAdapter<ArtifactIdentifier>() { // from class: com.amazon.alexa.accessory.notificationpublisher.artifactdownloader.models.ArtifactIdentifier.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.amazon.alexa.accessory.notificationpublisher.artifactdownloader.networking.adapters.StronglyTypedString.StronglyTypedStringAdapter
            public ArtifactIdentifier instantiate(String str) {
                return ArtifactIdentifier.create(str);
            }
        };
    }
}
