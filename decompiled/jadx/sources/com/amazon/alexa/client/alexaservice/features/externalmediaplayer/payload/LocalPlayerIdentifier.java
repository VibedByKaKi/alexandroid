package com.amazon.alexa.client.alexaservice.features.externalmediaplayer.payload;

import androidx.annotation.NonNull;
import com.amazon.alexa.client.alexaservice.base.device.data.CachingPersister;
import com.amazon.alexa.client.core.networking.adapters.StronglyTypedString;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class LocalPlayerIdentifier implements StronglyTypedString, CachingPersister.PersisterKey {
    public static final LocalPlayerIdentifier UNKNOWN = create("UNKNOWN");

    public static LocalPlayerIdentifier create(String str) {
        return new AutoValue_LocalPlayerIdentifier(str);
    }

    public static StronglyTypedString.StronglyTypedStringAdapter<LocalPlayerIdentifier> getTypeAdapter() {
        return new StronglyTypedString.StronglyTypedStringAdapter<LocalPlayerIdentifier>() { // from class: com.amazon.alexa.client.alexaservice.features.externalmediaplayer.payload.LocalPlayerIdentifier.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.amazon.alexa.client.core.networking.adapters.StronglyTypedString.StronglyTypedStringAdapter
            public LocalPlayerIdentifier instantiate(@NonNull String str) {
                return LocalPlayerIdentifier.create(str);
            }
        };
    }

    @Override // com.amazon.alexa.client.alexaservice.base.device.data.CachingPersister.PersisterKey
    public String name() {
        return getValue();
    }
}
