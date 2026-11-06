package com.amazon.alexa.client.alexaservice.features.iocomponent;

import com.amazon.alexa.client.alexaservice.features.iocomponent.stateproviders.TrustedStatesProvider;
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
public final class TrustedStatesComponentStateProvider_Factory implements Factory<TrustedStatesComponentStateProvider> {
    private final Provider<TrustedStatesProvider> trustedStatesProvider;

    public TrustedStatesComponentStateProvider_Factory(Provider<TrustedStatesProvider> provider) {
        this.trustedStatesProvider = provider;
    }

    public static TrustedStatesComponentStateProvider_Factory create(Provider<TrustedStatesProvider> provider) {
        return new TrustedStatesComponentStateProvider_Factory(provider);
    }

    public static TrustedStatesComponentStateProvider newInstance(TrustedStatesProvider trustedStatesProvider) {
        return new TrustedStatesComponentStateProvider(trustedStatesProvider);
    }

    @Override // javax.inject.Provider
    public TrustedStatesComponentStateProvider get() {
        return newInstance(this.trustedStatesProvider.get());
    }
}
