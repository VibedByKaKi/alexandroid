package com.amazon.alexa.client.core.capabilities;

import androidx.annotation.NonNull;
import com.amazon.alexa.client.core.networking.adapters.StronglyTypedString;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class CapabilityInterface implements StronglyTypedString {
    public static CapabilityInterface create(String str) {
        return new AutoValue_CapabilityInterface(str);
    }

    public static StronglyTypedString.StronglyTypedStringAdapter<CapabilityInterface> getTypeAdapter() {
        return new StronglyTypedString.StronglyTypedStringAdapter<CapabilityInterface>() { // from class: com.amazon.alexa.client.core.capabilities.CapabilityInterface.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.amazon.alexa.client.core.networking.adapters.StronglyTypedString.StronglyTypedStringAdapter
            public CapabilityInterface instantiate(@NonNull String str) {
                return CapabilityInterface.create(str);
            }
        };
    }
}
