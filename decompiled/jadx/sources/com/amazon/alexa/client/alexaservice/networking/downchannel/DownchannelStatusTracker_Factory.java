package com.amazon.alexa.client.alexaservice.networking.downchannel;

import com.amazon.alexa.client.alexaservice.base.capabilities.discovery.DiscoveryFeatureChecker;
import com.amazon.alexa.client.alexaservice.base.feature.FeatureFlagConfigurationAuthority;
import com.amazon.alexa.client.alexaservice.networking.bootstrap.ConnectionSetupFeatureChecker;
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
public final class DownchannelStatusTracker_Factory implements Factory<DownchannelStatusTracker> {
    private final Provider<ConnectionSetupFeatureChecker> connectionSetupFeatureCheckerProvider;
    private final Provider<DiscoveryFeatureChecker> discoveryFeatureCheckerProvider;
    private final Provider<FeatureFlagConfigurationAuthority> featureFlagConfigurationAuthorityProvider;

    public DownchannelStatusTracker_Factory(Provider<FeatureFlagConfigurationAuthority> provider, Provider<DiscoveryFeatureChecker> provider2, Provider<ConnectionSetupFeatureChecker> provider3) {
        this.featureFlagConfigurationAuthorityProvider = provider;
        this.discoveryFeatureCheckerProvider = provider2;
        this.connectionSetupFeatureCheckerProvider = provider3;
    }

    public static DownchannelStatusTracker_Factory create(Provider<FeatureFlagConfigurationAuthority> provider, Provider<DiscoveryFeatureChecker> provider2, Provider<ConnectionSetupFeatureChecker> provider3) {
        return new DownchannelStatusTracker_Factory(provider, provider2, provider3);
    }

    public static DownchannelStatusTracker newInstance(FeatureFlagConfigurationAuthority featureFlagConfigurationAuthority, DiscoveryFeatureChecker discoveryFeatureChecker, ConnectionSetupFeatureChecker connectionSetupFeatureChecker) {
        return new DownchannelStatusTracker(featureFlagConfigurationAuthority, discoveryFeatureChecker, connectionSetupFeatureChecker);
    }

    @Override // javax.inject.Provider
    public DownchannelStatusTracker get() {
        return newInstance(this.featureFlagConfigurationAuthorityProvider.get(), this.discoveryFeatureCheckerProvider.get(), this.connectionSetupFeatureCheckerProvider.get());
    }
}
