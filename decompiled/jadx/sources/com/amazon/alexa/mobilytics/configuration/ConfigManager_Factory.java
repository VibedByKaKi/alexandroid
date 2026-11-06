package com.amazon.alexa.mobilytics.configuration;

import com.amazon.alexa.mobilytics.internal.JsonConverter;
import dagger.internal.Factory;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final class ConfigManager_Factory implements Factory<ConfigManager> {
    private final Provider<Config> configProvider;
    private final Provider<JsonConverter> converterProvider;

    public ConfigManager_Factory(Provider<JsonConverter> provider, Provider<Config> provider2) {
        this.converterProvider = provider;
        this.configProvider = provider2;
    }

    public static ConfigManager_Factory create(Provider<JsonConverter> provider, Provider<Config> provider2) {
        return new ConfigManager_Factory(provider, provider2);
    }

    public static ConfigManager newInstance(JsonConverter jsonConverter, Config config) {
        return new ConfigManager(jsonConverter, config);
    }

    @Override // javax.inject.Provider
    public ConfigManager get() {
        return newInstance(this.converterProvider.get(), this.configProvider.get());
    }
}
