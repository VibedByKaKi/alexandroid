package com.amazon.alexa.hho.navigation.dependency;

import com.amazon.alexa.hho.navigation.transit.location.LocationFilterProtocol;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("com.amazon.alexa.hho.navigation.dependency.TransitScope")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes13.dex */
public final class TransitNavigationModule_ProvideLocationFilterFactory implements Factory<LocationFilterProtocol> {
    private final TransitNavigationModule module;

    public TransitNavigationModule_ProvideLocationFilterFactory(TransitNavigationModule transitNavigationModule) {
        this.module = transitNavigationModule;
    }

    public static TransitNavigationModule_ProvideLocationFilterFactory create(TransitNavigationModule transitNavigationModule) {
        return new TransitNavigationModule_ProvideLocationFilterFactory(transitNavigationModule);
    }

    public static LocationFilterProtocol provideLocationFilter(TransitNavigationModule transitNavigationModule) {
        return (LocationFilterProtocol) Preconditions.checkNotNullFromProvides(transitNavigationModule.provideLocationFilter());
    }

    @Override // javax.inject.Provider
    public LocationFilterProtocol get() {
        return provideLocationFilter(this.module);
    }
}
