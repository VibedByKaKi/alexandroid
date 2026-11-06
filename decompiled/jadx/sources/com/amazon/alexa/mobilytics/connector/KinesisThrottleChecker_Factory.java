package com.amazon.alexa.mobilytics.connector;

import com.amazon.alexa.mobilytics.configuration.ConfigManager;
import dagger.internal.Factory;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final class KinesisThrottleChecker_Factory implements Factory<KinesisThrottleChecker> {
    private final Provider<ConfigManager> configManagerProvider;

    public KinesisThrottleChecker_Factory(Provider<ConfigManager> provider) {
        this.configManagerProvider = provider;
    }

    public static KinesisThrottleChecker_Factory create(Provider<ConfigManager> provider) {
        return new KinesisThrottleChecker_Factory(provider);
    }

    public static KinesisThrottleChecker newInstance(ConfigManager configManager) {
        return new KinesisThrottleChecker(configManager);
    }

    @Override // javax.inject.Provider
    public KinesisThrottleChecker get() {
        return newInstance(this.configManagerProvider.get());
    }
}
