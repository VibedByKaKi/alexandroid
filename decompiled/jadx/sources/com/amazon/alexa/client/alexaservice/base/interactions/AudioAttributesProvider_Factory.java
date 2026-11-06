package com.amazon.alexa.client.alexaservice.base.interactions;

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
public final class AudioAttributesProvider_Factory implements Factory<AudioAttributesProvider> {
    private final Provider<SpecialCaseOverrideAuthority> specialCaseOverrideAuthorityProvider;

    public AudioAttributesProvider_Factory(Provider<SpecialCaseOverrideAuthority> provider) {
        this.specialCaseOverrideAuthorityProvider = provider;
    }

    public static AudioAttributesProvider_Factory create(Provider<SpecialCaseOverrideAuthority> provider) {
        return new AudioAttributesProvider_Factory(provider);
    }

    public static AudioAttributesProvider newInstance(SpecialCaseOverrideAuthority specialCaseOverrideAuthority) {
        return new AudioAttributesProvider(specialCaseOverrideAuthority);
    }

    @Override // javax.inject.Provider
    public AudioAttributesProvider get() {
        return newInstance(this.specialCaseOverrideAuthorityProvider.get());
    }
}
