package com.amazon.alexa.seamlessswitching.capability.model;

import com.amazon.alexa.seamlessswitching.capability.model.StronglyTypedString;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes19.dex */
public abstract class FriendlyName implements StronglyTypedString {
    public static FriendlyName create(String str) {
        return new AutoValue_FriendlyName(str);
    }

    public static StronglyTypedString.StronglyTypedStringAdapter<FriendlyName> getTypeAdapter() {
        return new StronglyTypedString.StronglyTypedStringAdapter<FriendlyName>() { // from class: com.amazon.alexa.seamlessswitching.capability.model.FriendlyName.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.amazon.alexa.seamlessswitching.capability.model.StronglyTypedString.StronglyTypedStringAdapter
            public FriendlyName instantiate(String str) {
                return FriendlyName.create(str);
            }
        };
    }
}
