package com.amazon.alexa.client.alexaservice.base.interactions;

import androidx.annotation.NonNull;
import com.amazon.alexa.client.core.networking.adapters.StronglyTypedString;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class InteractionInterfaceName implements StronglyTypedString {
    public static final InteractionInterfaceName UNKNOWN = create("");

    public static InteractionInterfaceName create(String str) {
        return new AutoValue_InteractionInterfaceName(str);
    }

    public static StronglyTypedString.StronglyTypedStringAdapter<InteractionInterfaceName> getTypeAdapter() {
        return new StronglyTypedString.StronglyTypedStringAdapter<InteractionInterfaceName>() { // from class: com.amazon.alexa.client.alexaservice.base.interactions.InteractionInterfaceName.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.amazon.alexa.client.core.networking.adapters.StronglyTypedString.StronglyTypedStringAdapter
            public InteractionInterfaceName instantiate(@NonNull String str) {
                return InteractionInterfaceName.create(str);
            }
        };
    }
}
