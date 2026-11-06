package com.amazon.alexa.client.alexaservice.features.externalmediaplayer.payload;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.client.alexaservice.base.device.data.CachingPersister;
import com.amazon.alexa.client.core.networking.adapters.StronglyTypedString;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class ExternalPlayerIdentifier implements StronglyTypedString, CachingPersister.PersisterKey {
    public static final ExternalPlayerIdentifier UNKNOWN = create("");

    @VisibleForTesting
    static final String UNKNOWN_VALUE = "";

    public static ExternalPlayerIdentifier create(@Nullable String str) {
        return str == null ? new AutoValue_ExternalPlayerIdentifier("") : new AutoValue_ExternalPlayerIdentifier(str);
    }

    public static TypeAdapter<ExternalPlayerIdentifier> typeAdapter(Gson gson) {
        return new StronglyTypedString.StronglyTypedStringAdapter<ExternalPlayerIdentifier>() { // from class: com.amazon.alexa.client.alexaservice.features.externalmediaplayer.payload.ExternalPlayerIdentifier.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.amazon.alexa.client.core.networking.adapters.StronglyTypedString.StronglyTypedStringAdapter
            public ExternalPlayerIdentifier instantiate(@NonNull String str) {
                return ExternalPlayerIdentifier.create(str);
            }
        };
    }

    @Override // com.amazon.alexa.client.alexaservice.base.device.data.CachingPersister.PersisterKey
    public String name() {
        return getValue();
    }
}
