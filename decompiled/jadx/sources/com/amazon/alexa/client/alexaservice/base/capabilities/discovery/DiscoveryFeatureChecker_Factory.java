package com.amazon.alexa.client.alexaservice.base.capabilities.discovery;

import android.content.Context;
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
public final class DiscoveryFeatureChecker_Factory implements Factory<DiscoveryFeatureChecker> {
    private final Provider<Context> contextProvider;
    private final Provider<FeatureFlagConfigurationAuthority> featureFlagConfigurationAuthorityProvider;

    public DiscoveryFeatureChecker_Factory(Provider<Context> provider, Provider<FeatureFlagConfigurationAuthority> provider2) {
        this.contextProvider = provider;
        this.featureFlagConfigurationAuthorityProvider = provider2;
    }

    public static DiscoveryFeatureChecker_Factory create(Provider<Context> provider, Provider<FeatureFlagConfigurationAuthority> provider2) {
        return new DiscoveryFeatureChecker_Factory(provider, provider2);
    }

    public static DiscoveryFeatureChecker newInstance(Context context, FeatureFlagConfigurationAuthority featureFlagConfigurationAuthority) {
        return new DiscoveryFeatureChecker(context, featureFlagConfigurationAuthority);
    }

    @Override // javax.inject.Provider
    public DiscoveryFeatureChecker get() {
        return newInstance(this.contextProvider.get(), this.featureFlagConfigurationAuthorityProvider.get());
    }
}
