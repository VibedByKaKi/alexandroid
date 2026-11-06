package com.amazon.alexa.client.alexaservice.features.externalmediaplayer.payload;

import androidx.annotation.NonNull;
import com.amazon.alexa.client.core.networking.adapters.StronglyTypedString;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class PlayerCookie implements StronglyTypedString {
    public static final PlayerCookie UNKNOWN = create("");

    public static PlayerCookie create(String str) {
        return new AutoValue_PlayerCookie(str);
    }

    public static StronglyTypedString.StronglyTypedStringAdapter<PlayerCookie> getTypeAdapter() {
        return new StronglyTypedString.StronglyTypedStringAdapter<PlayerCookie>() { // from class: com.amazon.alexa.client.alexaservice.features.externalmediaplayer.payload.PlayerCookie.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.amazon.alexa.client.core.networking.adapters.StronglyTypedString.StronglyTypedStringAdapter
            public PlayerCookie instantiate(@NonNull String str) {
                return PlayerCookie.create(str);
            }
        };
    }
}
