package com.amazon.dee.app.dependencies;

import android.content.Context;
import com.amazon.alexa.location.LocationProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("com.amazon.dee.app.dependencies.ApplicationScope")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class LocationModule_ProvideLocationProviderFactory implements Factory<LocationProvider> {
    private final Provider<Context> contextProvider;
    private final LocationModule module;

    public LocationModule_ProvideLocationProviderFactory(LocationModule locationModule, Provider<Context> provider) {
        this.module = locationModule;
        this.contextProvider = provider;
    }

    public static LocationModule_ProvideLocationProviderFactory create(LocationModule locationModule, Provider<Context> provider) {
        return new LocationModule_ProvideLocationProviderFactory(locationModule, provider);
    }

    public static LocationProvider provideLocationProvider(LocationModule locationModule, Context context) {
        return (LocationProvider) Preconditions.checkNotNullFromProvides(locationModule.provideLocationProvider(context));
    }

    @Override // javax.inject.Provider
    public LocationProvider get() {
        return provideLocationProvider(this.module, this.contextProvider.get());
    }
}
