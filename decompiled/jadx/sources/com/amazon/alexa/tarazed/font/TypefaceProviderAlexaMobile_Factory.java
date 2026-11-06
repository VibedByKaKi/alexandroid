package com.amazon.alexa.tarazed.font;

import dagger.internal.Factory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class TypefaceProviderAlexaMobile_Factory implements Factory<TypefaceProviderAlexaMobile> {
    private static final TypefaceProviderAlexaMobile_Factory INSTANCE = new TypefaceProviderAlexaMobile_Factory();

    public static Factory<TypefaceProviderAlexaMobile> create() {
        return INSTANCE;
    }

    @Override // javax.inject.Provider
    public TypefaceProviderAlexaMobile get() {
        return new TypefaceProviderAlexaMobile();
    }
}
