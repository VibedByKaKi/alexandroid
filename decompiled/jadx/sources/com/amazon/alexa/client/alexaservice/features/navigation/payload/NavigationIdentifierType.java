package com.amazon.alexa.client.alexaservice.features.navigation.payload;

import androidx.annotation.NonNull;
import com.amazon.alexa.client.core.networking.adapters.StronglyTypedString;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class NavigationIdentifierType implements StronglyTypedString {
    public static NavigationIdentifierType create(String str) {
        return new AutoValue_NavigationIdentifierType(str);
    }

    public static StronglyTypedString.StronglyTypedStringAdapter<NavigationIdentifierType> getTypeAdapter() {
        return new StronglyTypedString.StronglyTypedStringAdapter<NavigationIdentifierType>() { // from class: com.amazon.alexa.client.alexaservice.features.navigation.payload.NavigationIdentifierType.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.amazon.alexa.client.core.networking.adapters.StronglyTypedString.StronglyTypedStringAdapter
            public NavigationIdentifierType instantiate(@NonNull String str) {
                return NavigationIdentifierType.create(str);
            }
        };
    }
}
