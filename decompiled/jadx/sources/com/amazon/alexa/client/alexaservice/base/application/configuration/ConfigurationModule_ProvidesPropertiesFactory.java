package com.amazon.alexa.client.alexaservice.base.application.configuration;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.Properties;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class ConfigurationModule_ProvidesPropertiesFactory implements Factory<Properties> {
    private final Provider<Context> contextProvider;
    private final ConfigurationModule module;

    public ConfigurationModule_ProvidesPropertiesFactory(ConfigurationModule configurationModule, Provider<Context> provider) {
        this.module = configurationModule;
        this.contextProvider = provider;
    }

    public static ConfigurationModule_ProvidesPropertiesFactory create(ConfigurationModule configurationModule, Provider<Context> provider) {
        return new ConfigurationModule_ProvidesPropertiesFactory(configurationModule, provider);
    }

    public static Properties providesProperties(ConfigurationModule configurationModule, Context context) {
        return (Properties) Preconditions.checkNotNullFromProvides(configurationModule.providesProperties(context));
    }

    @Override // javax.inject.Provider
    public Properties get() {
        return providesProperties(this.module, this.contextProvider.get());
    }
}
