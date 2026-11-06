package com.amazon.alexa.client.alexaservice.base.application.configuration;

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
public final class DefaultConfigurationLoader_Factory implements Factory<DefaultConfigurationLoader> {
    private final Provider<ApplicationMetadata> applicationMetadataProvider;

    public DefaultConfigurationLoader_Factory(Provider<ApplicationMetadata> provider) {
        this.applicationMetadataProvider = provider;
    }

    public static DefaultConfigurationLoader_Factory create(Provider<ApplicationMetadata> provider) {
        return new DefaultConfigurationLoader_Factory(provider);
    }

    public static DefaultConfigurationLoader newInstance(ApplicationMetadata applicationMetadata) {
        return new DefaultConfigurationLoader(applicationMetadata);
    }

    @Override // javax.inject.Provider
    public DefaultConfigurationLoader get() {
        return newInstance(this.applicationMetadataProvider.get());
    }
}
