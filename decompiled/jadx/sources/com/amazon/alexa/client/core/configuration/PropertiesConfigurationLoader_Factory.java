package com.amazon.alexa.client.core.configuration;

import dagger.Lazy;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.Properties;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class PropertiesConfigurationLoader_Factory implements Factory<PropertiesConfigurationLoader> {
    private final Provider<Properties> propertiesProvider;

    public PropertiesConfigurationLoader_Factory(Provider<Properties> provider) {
        this.propertiesProvider = provider;
    }

    public static PropertiesConfigurationLoader_Factory create(Provider<Properties> provider) {
        return new PropertiesConfigurationLoader_Factory(provider);
    }

    public static PropertiesConfigurationLoader newInstance(Lazy<Properties> lazy) {
        return new PropertiesConfigurationLoader(lazy);
    }

    @Override // javax.inject.Provider
    public PropertiesConfigurationLoader get() {
        return newInstance(DoubleCheck.lazy(this.propertiesProvider));
    }
}
