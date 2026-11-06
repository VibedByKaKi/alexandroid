package com.amazon.alexa.client.alexaservice.audio.audioplayer.payload;

import androidx.annotation.NonNull;
import com.amazon.alexa.client.core.networking.adapters.StronglyTypedString;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class AudioItemIdentifier implements StronglyTypedString {
    public static final AudioItemIdentifier NONE = create("NONE");
    public static final AudioItemIdentifier EMPTY = create("");

    public static AudioItemIdentifier create(String str) {
        return new AutoValue_AudioItemIdentifier(str);
    }

    public static StronglyTypedString.StronglyTypedStringAdapter<AudioItemIdentifier> getTypeAdapter() {
        return new StronglyTypedString.StronglyTypedStringAdapter<AudioItemIdentifier>() { // from class: com.amazon.alexa.client.alexaservice.audio.audioplayer.payload.AudioItemIdentifier.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.amazon.alexa.client.core.networking.adapters.StronglyTypedString.StronglyTypedStringAdapter
            public AudioItemIdentifier instantiate(@NonNull String str) {
                return AudioItemIdentifier.create(str);
            }
        };
    }
}
