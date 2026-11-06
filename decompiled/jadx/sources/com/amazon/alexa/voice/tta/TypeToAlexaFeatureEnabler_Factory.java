package com.amazon.alexa.voice.tta;

import com.amazon.alexa.voice.locale.LocaleInteractor;
import com.amazon.alexa.voice.ra.RaFeatureEnabler;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes19.dex */
public final class TypeToAlexaFeatureEnabler_Factory implements Factory<TypeToAlexaFeatureEnabler> {
    private final Provider<LocaleInteractor> localeInteractorProvider;
    private final Provider<RaFeatureEnabler> raFeatureEnablerProvider;

    public TypeToAlexaFeatureEnabler_Factory(Provider<LocaleInteractor> provider, Provider<RaFeatureEnabler> provider2) {
        this.localeInteractorProvider = provider;
        this.raFeatureEnablerProvider = provider2;
    }

    public static TypeToAlexaFeatureEnabler_Factory create(Provider<LocaleInteractor> provider, Provider<RaFeatureEnabler> provider2) {
        return new TypeToAlexaFeatureEnabler_Factory(provider, provider2);
    }

    public static TypeToAlexaFeatureEnabler newInstance(LocaleInteractor localeInteractor, RaFeatureEnabler raFeatureEnabler) {
        return new TypeToAlexaFeatureEnabler(localeInteractor, raFeatureEnabler);
    }

    @Override // javax.inject.Provider
    public TypeToAlexaFeatureEnabler get() {
        return newInstance(this.localeInteractorProvider.get(), this.raFeatureEnablerProvider.get());
    }
}
