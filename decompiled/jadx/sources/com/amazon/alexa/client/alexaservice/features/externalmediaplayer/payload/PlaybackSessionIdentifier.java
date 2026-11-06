package com.amazon.alexa.client.alexaservice.features.externalmediaplayer.payload;

import androidx.annotation.NonNull;
import com.amazon.alexa.client.core.networking.adapters.StronglyTypedString;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class PlaybackSessionIdentifier implements StronglyTypedString {
    public static final PlaybackSessionIdentifier NONE = create("NONE");

    public static PlaybackSessionIdentifier create(String str) {
        return new AutoValue_PlaybackSessionIdentifier(str);
    }

    public static StronglyTypedString.StronglyTypedStringAdapter<PlaybackSessionIdentifier> getTypeAdapter() {
        return new StronglyTypedString.StronglyTypedStringAdapter<PlaybackSessionIdentifier>() { // from class: com.amazon.alexa.client.alexaservice.features.externalmediaplayer.payload.PlaybackSessionIdentifier.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.amazon.alexa.client.core.networking.adapters.StronglyTypedString.StronglyTypedStringAdapter
            public PlaybackSessionIdentifier instantiate(@NonNull String str) {
                return PlaybackSessionIdentifier.create(str);
            }
        };
    }
}
