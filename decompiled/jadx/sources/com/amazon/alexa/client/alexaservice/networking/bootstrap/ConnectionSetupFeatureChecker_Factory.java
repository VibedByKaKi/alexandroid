package com.amazon.alexa.client.alexaservice.networking.bootstrap;

import com.amazon.alexa.client.alexaservice.base.capabilities.discovery.DiscoveryFeatureChecker;
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
public final class ConnectionSetupFeatureChecker_Factory implements Factory<ConnectionSetupFeatureChecker> {
    private final Provider<DiscoveryFeatureChecker> discoveryFeatureCheckerProvider;
    private final Provider<FeatureFlagConfigurationAuthority> featureFlagConfigurationAuthorityProvider;

    public ConnectionSetupFeatureChecker_Factory(Provider<FeatureFlagConfigurationAuthority> provider, Provider<DiscoveryFeatureChecker> provider2) {
        this.featureFlagConfigurationAuthorityProvider = provider;
        this.discoveryFeatureCheckerProvider = provider2;
    }

    public static ConnectionSetupFeatureChecker_Factory create(Provider<FeatureFlagConfigurationAuthority> provider, Provider<DiscoveryFeatureChecker> provider2) {
        return new ConnectionSetupFeatureChecker_Factory(provider, provider2);
    }

    public static ConnectionSetupFeatureChecker newInstance(FeatureFlagConfigurationAuthority featureFlagConfigurationAuthority, DiscoveryFeatureChecker discoveryFeatureChecker) {
        return new ConnectionSetupFeatureChecker(featureFlagConfigurationAuthority, discoveryFeatureChecker);
    }

    @Override // javax.inject.Provider
    public ConnectionSetupFeatureChecker get() {
        return newInstance(this.featureFlagConfigurationAuthorityProvider.get(), this.discoveryFeatureCheckerProvider.get());
    }
}
