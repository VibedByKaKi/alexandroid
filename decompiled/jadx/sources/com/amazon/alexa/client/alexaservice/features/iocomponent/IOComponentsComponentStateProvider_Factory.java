package com.amazon.alexa.client.alexaservice.features.iocomponent;

import com.amazon.alexa.client.alexaservice.features.iocomponent.stateproviders.IOComponentsStateProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class IOComponentsComponentStateProvider_Factory implements Factory<IOComponentsComponentStateProvider> {
    private final Provider<IOComponentsStateProvider> componentsStateProvider;

    public IOComponentsComponentStateProvider_Factory(Provider<IOComponentsStateProvider> provider) {
        this.componentsStateProvider = provider;
    }

    public static IOComponentsComponentStateProvider_Factory create(Provider<IOComponentsStateProvider> provider) {
        return new IOComponentsComponentStateProvider_Factory(provider);
    }

    public static IOComponentsComponentStateProvider newInstance(IOComponentsStateProvider iOComponentsStateProvider) {
        return new IOComponentsComponentStateProvider(iOComponentsStateProvider);
    }

    @Override // javax.inject.Provider
    public IOComponentsComponentStateProvider get() {
        return newInstance(this.componentsStateProvider.get());
    }
}
