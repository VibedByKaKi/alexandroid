package com.amazon.alexa.client.alexaservice.base.componentstate;

import com.amazon.alexa.client.core.networking.adapters.StronglyTypedString;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class ComponentStateProviderIdentifier implements StronglyTypedString {
    public static ComponentStateProviderIdentifier create(String str) {
        return new AutoValue_ComponentStateProviderIdentifier(str);
    }
}
