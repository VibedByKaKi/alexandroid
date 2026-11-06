package com.amazon.alexa.client.core.messages;

import androidx.annotation.NonNull;
import com.amazon.alexa.client.core.networking.adapters.StronglyTypedString;
import com.google.auto.value.AutoValue;
import com.google.gson.TypeAdapter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class CorrelationToken implements StronglyTypedString {
    public static CorrelationToken create(String str) {
        return new AutoValue_CorrelationToken(str);
    }

    public static TypeAdapter<CorrelationToken> getTypeAdapter() {
        return new StronglyTypedString.StronglyTypedStringAdapter<CorrelationToken>() { // from class: com.amazon.alexa.client.core.messages.CorrelationToken.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.amazon.alexa.client.core.networking.adapters.StronglyTypedString.StronglyTypedStringAdapter
            public CorrelationToken instantiate(@NonNull String str) {
                return CorrelationToken.create(str);
            }
        };
    }
}
