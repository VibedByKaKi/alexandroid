package com.amazon.alexa.client.alexaservice.base.metrics;

import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public enum InvocationTypeClass {
    AlexaApp,
    Accessories,
    Unknown;

    private static final String ACCESSORIES_INVOCATION_TYPE_PREFIX = "Accessories";
    private static final String UNKNOWN_INVOCATION_TYPE_PREFIX = "Unknown";

    public static InvocationTypeClass fromInvocationType(@Nullable String str) {
        return (str == null || str.startsWith("Unknown")) ? Unknown : str.startsWith(ACCESSORIES_INVOCATION_TYPE_PREFIX) ? Accessories : AlexaApp;
    }
}
