package com.amazon.alexa.client.alexaservice.features.externalmediaplayer.payload;

import androidx.annotation.NonNull;
import com.amazon.alexa.client.core.networking.adapters.StronglyTypedString;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class PlaybackToken implements StronglyTypedString {
    public static PlaybackToken create(String str) {
        return new AutoValue_PlaybackToken(str);
    }

    public static StronglyTypedString.StronglyTypedStringAdapter<PlaybackToken> getTypeAdapter() {
        return new StronglyTypedString.StronglyTypedStringAdapter<PlaybackToken>() { // from class: com.amazon.alexa.client.alexaservice.features.externalmediaplayer.payload.PlaybackToken.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.amazon.alexa.client.core.networking.adapters.StronglyTypedString.StronglyTypedStringAdapter
            public PlaybackToken instantiate(@NonNull String str) {
                return PlaybackToken.create(str);
            }
        };
    }
}
