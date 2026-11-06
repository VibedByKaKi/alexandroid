package com.amazon.alexa.client.alexaservice.networking.downchannel;

import com.amazon.alexa.client.core.networking.adapters.StronglyTypedString;
import com.google.auto.value.AutoValue;
import java.util.UUID;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class DownchannelIdentifier implements StronglyTypedString {
    public static DownchannelIdentifier create(String str) {
        return new AutoValue_DownchannelIdentifier(str);
    }

    public static DownchannelIdentifier createRandom() {
        return create(UUID.randomUUID().toString());
    }

    public String toString() {
        return getValue();
    }
}
