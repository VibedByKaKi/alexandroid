package com.amazon.alexa.client.alexaservice.audio.core;

import androidx.annotation.NonNull;
import com.amazon.alexa.client.core.networking.adapters.StronglyTypedString;
import com.google.gson.TypeAdapter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class SpeechToken extends PlayToken implements StronglyTypedString {
    public SpeechToken(String str) {
        super(str);
    }

    public static SpeechToken create(String str) {
        return new SpeechToken(str);
    }

    public static TypeAdapter<SpeechToken> getTypeAdapter() {
        return new StronglyTypedString.StronglyTypedStringAdapter<SpeechToken>() { // from class: com.amazon.alexa.client.alexaservice.audio.core.SpeechToken.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.amazon.alexa.client.core.networking.adapters.StronglyTypedString.StronglyTypedStringAdapter
            public SpeechToken instantiate(@NonNull String str) {
                return SpeechToken.create(str);
            }
        };
    }
}
