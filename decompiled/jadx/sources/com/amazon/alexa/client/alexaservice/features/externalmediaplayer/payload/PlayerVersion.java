package com.amazon.alexa.client.alexaservice.features.externalmediaplayer.payload;

import androidx.annotation.NonNull;
import com.amazon.alexa.client.core.networking.adapters.StronglyTypedString;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class PlayerVersion implements StronglyTypedString {
    public static final PlayerVersion UNKNOWN = create("UNKNOWN");

    public static PlayerVersion create(String str) {
        return new AutoValue_PlayerVersion(str);
    }

    public static StronglyTypedString.StronglyTypedStringAdapter<PlayerVersion> getTypeAdapter() {
        return new StronglyTypedString.StronglyTypedStringAdapter<PlayerVersion>() { // from class: com.amazon.alexa.client.alexaservice.features.externalmediaplayer.payload.PlayerVersion.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.amazon.alexa.client.core.networking.adapters.StronglyTypedString.StronglyTypedStringAdapter
            public PlayerVersion instantiate(@NonNull String str) {
                return PlayerVersion.create(str);
            }
        };
    }
}
