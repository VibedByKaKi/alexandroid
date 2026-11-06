package com.amazon.alexa.handsfree.protocols.uservoicerecognition.locale;

import dagger.internal.Factory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class UVRLocaleProvider_Factory implements Factory<UVRLocaleProvider> {
    private static final UVRLocaleProvider_Factory INSTANCE = new UVRLocaleProvider_Factory();

    public static UVRLocaleProvider_Factory create() {
        return INSTANCE;
    }

    public static UVRLocaleProvider newUVRLocaleProvider() {
        return new UVRLocaleProvider();
    }

    public static UVRLocaleProvider provideInstance() {
        return new UVRLocaleProvider();
    }

    @Override // javax.inject.Provider
    public UVRLocaleProvider get() {
        return provideInstance();
    }
}
