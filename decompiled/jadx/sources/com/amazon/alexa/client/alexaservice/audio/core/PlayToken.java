package com.amazon.alexa.client.alexaservice.audio.core;

import androidx.annotation.NonNull;
import com.amazon.alexa.client.core.networking.adapters.StronglyTypedString;
import com.google.gson.TypeAdapter;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class PlayToken implements StronglyTypedString {
    private final String token;

    public PlayToken(String str) {
        this.token = str;
    }

    public static PlayToken create(String str) {
        return new PlayToken(str);
    }

    public static TypeAdapter<? extends PlayToken> getTypeAdapter() {
        return new StronglyTypedString.StronglyTypedStringAdapter<PlayToken>() { // from class: com.amazon.alexa.client.alexaservice.audio.core.PlayToken.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.amazon.alexa.client.core.networking.adapters.StronglyTypedString.StronglyTypedStringAdapter
            public PlayToken instantiate(@NonNull String str) {
                return PlayToken.create(str);
            }
        };
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.token, ((PlayToken) obj).token);
    }

    @Override // com.amazon.alexa.client.core.networking.adapters.StronglyTypedString
    public String getValue() {
        return this.token;
    }

    public int hashCode() {
        return Objects.hash(this.token);
    }

    public String toString() {
        return this.token;
    }
}
