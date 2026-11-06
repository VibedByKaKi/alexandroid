package com.amazon.alexa.handsfree.notification.views.killswitch;

import com.amazon.alexa.handsfree.notification.api.ConfigurationProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class KillSwitchMetadataProvider_Factory implements Factory<KillSwitchMetadataProvider> {
    private final Provider<ConfigurationProvider> configurationProvider;

    public KillSwitchMetadataProvider_Factory(Provider<ConfigurationProvider> provider) {
        this.configurationProvider = provider;
    }

    public static KillSwitchMetadataProvider_Factory create(Provider<ConfigurationProvider> provider) {
        return new KillSwitchMetadataProvider_Factory(provider);
    }

    public static KillSwitchMetadataProvider newInstance(ConfigurationProvider configurationProvider) {
        return new KillSwitchMetadataProvider(configurationProvider);
    }

    @Override // javax.inject.Provider
    public KillSwitchMetadataProvider get() {
        return newInstance(this.configurationProvider.get());
    }
}
