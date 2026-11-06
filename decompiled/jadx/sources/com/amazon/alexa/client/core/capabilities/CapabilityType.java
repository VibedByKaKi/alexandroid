package com.amazon.alexa.client.core.capabilities;

import androidx.annotation.NonNull;
import com.amazon.alexa.client.core.networking.adapters.StronglyTypedString;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class CapabilityType implements StronglyTypedString {
    public static CapabilityType create(String str) {
        return new AutoValue_CapabilityType(str);
    }

    public static CapabilityType createAlexaInterface() {
        return create("AlexaInterface");
    }

    public static StronglyTypedString.StronglyTypedStringAdapter<CapabilityType> getTypeAdapter() {
        return new StronglyTypedString.StronglyTypedStringAdapter<CapabilityType>() { // from class: com.amazon.alexa.client.core.capabilities.CapabilityType.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.amazon.alexa.client.core.networking.adapters.StronglyTypedString.StronglyTypedStringAdapter
            public CapabilityType instantiate(@NonNull String str) {
                return CapabilityType.create(str);
            }
        };
    }
}
