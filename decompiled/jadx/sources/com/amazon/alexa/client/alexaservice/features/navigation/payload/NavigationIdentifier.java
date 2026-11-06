package com.amazon.alexa.client.alexaservice.features.navigation.payload;

import androidx.annotation.NonNull;
import com.amazon.alexa.client.core.networking.adapters.StronglyTypedString;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class NavigationIdentifier implements StronglyTypedString {
    public static NavigationIdentifier create(String str) {
        return new AutoValue_NavigationIdentifier(str);
    }

    public static StronglyTypedString.StronglyTypedStringAdapter<NavigationIdentifier> getTypeAdapter() {
        return new StronglyTypedString.StronglyTypedStringAdapter<NavigationIdentifier>() { // from class: com.amazon.alexa.client.alexaservice.features.navigation.payload.NavigationIdentifier.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.amazon.alexa.client.core.networking.adapters.StronglyTypedString.StronglyTypedStringAdapter
            public NavigationIdentifier instantiate(@NonNull String str) {
                return NavigationIdentifier.create(str);
            }
        };
    }
}
