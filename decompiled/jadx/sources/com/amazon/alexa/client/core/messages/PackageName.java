package com.amazon.alexa.client.core.messages;

import androidx.annotation.NonNull;
import com.amazon.alexa.client.core.networking.adapters.StronglyTypedString;
import com.google.auto.value.AutoValue;
import com.google.gson.TypeAdapter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class PackageName implements StronglyTypedString {
    public static PackageName create(String str) {
        return new AutoValue_PackageName(str);
    }

    public static TypeAdapter<PackageName> getTypeAdapter() {
        return new StronglyTypedString.StronglyTypedStringAdapter<PackageName>() { // from class: com.amazon.alexa.client.core.messages.PackageName.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.amazon.alexa.client.core.networking.adapters.StronglyTypedString.StronglyTypedStringAdapter
            public PackageName instantiate(@NonNull String str) {
                return PackageName.create(str);
            }
        };
    }
}
