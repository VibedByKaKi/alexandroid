package com.amazon.alexa.client.core.messages;

import androidx.annotation.NonNull;
import com.amazon.alexa.client.core.networking.adapters.StronglyTypedString;
import com.google.auto.value.AutoValue;
import com.google.gson.TypeAdapter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class Name implements StronglyTypedString {
    public static Name create(String str) {
        return new AutoValue_Name(str);
    }

    public static TypeAdapter<Name> getTypeAdapter() {
        return new StronglyTypedString.StronglyTypedStringAdapter<Name>() { // from class: com.amazon.alexa.client.core.messages.Name.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.amazon.alexa.client.core.networking.adapters.StronglyTypedString.StronglyTypedStringAdapter
            public Name instantiate(@NonNull String str) {
                return Name.create(str);
            }
        };
    }
}
