package com.amazon.alexa.client.alexaservice.base.userspeechprovider;

import com.amazon.alexa.client.alexaservice.base.feature.FeatureFlagConfigurationAuthority;
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
public final class UserSpeechProviderArbitrator_Factory implements Factory<UserSpeechProviderArbitrator> {
    private final Provider<FeatureFlagConfigurationAuthority> featureFlagConfigurationAuthorityProvider;

    public UserSpeechProviderArbitrator_Factory(Provider<FeatureFlagConfigurationAuthority> provider) {
        this.featureFlagConfigurationAuthorityProvider = provider;
    }

    public static UserSpeechProviderArbitrator_Factory create(Provider<FeatureFlagConfigurationAuthority> provider) {
        return new UserSpeechProviderArbitrator_Factory(provider);
    }

    public static UserSpeechProviderArbitrator newInstance(FeatureFlagConfigurationAuthority featureFlagConfigurationAuthority) {
        return new UserSpeechProviderArbitrator(featureFlagConfigurationAuthority);
    }

    @Override // javax.inject.Provider
    public UserSpeechProviderArbitrator get() {
        return newInstance(this.featureFlagConfigurationAuthorityProvider.get());
    }
}
