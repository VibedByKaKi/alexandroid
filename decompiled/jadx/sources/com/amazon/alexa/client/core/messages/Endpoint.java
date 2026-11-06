package com.amazon.alexa.client.core.messages;

import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class Endpoint {
    public static Endpoint create(String str) {
        return new AutoValue_Endpoint(str);
    }

    public abstract String getEndpointId();
}
