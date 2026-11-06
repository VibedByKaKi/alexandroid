package com.amazon.whisperjoin.deviceprovisioningservice.di.modules;

import android.content.Context;
import com.amazon.whisperjoin.deviceprovisioningservice.identity.MapAuthenticationProvider;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class MapAuthModule_ProvidesMapProviderFactory implements Factory<MapAuthenticationProvider> {
    private final Provider<Context> contextProvider;
    private final MapAuthModule module;

    public MapAuthModule_ProvidesMapProviderFactory(MapAuthModule mapAuthModule, Provider<Context> provider) {
        this.module = mapAuthModule;
        this.contextProvider = provider;
    }

    public static MapAuthModule_ProvidesMapProviderFactory create(MapAuthModule mapAuthModule, Provider<Context> provider) {
        return new MapAuthModule_ProvidesMapProviderFactory(mapAuthModule, provider);
    }

    public static MapAuthenticationProvider providesMapProvider(MapAuthModule mapAuthModule, Context context) {
        return (MapAuthenticationProvider) Preconditions.checkNotNull(mapAuthModule.providesMapProvider(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public MapAuthenticationProvider get() {
        return providesMapProvider(this.module, this.contextProvider.get());
    }
}
