package com.amazon.alexa.configservice.storage;

import dagger.internal.Factory;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class ConfigRefreshStatusManager_Factory implements Factory<ConfigRefreshStatusManager> {
    private final Provider<SharedPreferencesManager> sharedPreferencesManagerProvider;

    public ConfigRefreshStatusManager_Factory(Provider<SharedPreferencesManager> provider) {
        this.sharedPreferencesManagerProvider = provider;
    }

    public static ConfigRefreshStatusManager_Factory create(Provider<SharedPreferencesManager> provider) {
        return new ConfigRefreshStatusManager_Factory(provider);
    }

    public static ConfigRefreshStatusManager newInstance(SharedPreferencesManager sharedPreferencesManager) {
        return new ConfigRefreshStatusManager(sharedPreferencesManager);
    }

    @Override // javax.inject.Provider
    public ConfigRefreshStatusManager get() {
        return newInstance(this.sharedPreferencesManagerProvider.get());
    }
}
