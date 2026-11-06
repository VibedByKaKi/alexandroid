package com.amazon.alexa.mobilytics.configuration;

import com.amazon.alexa.mobilytics.MobilyticsConfiguration;
import dagger.internal.Factory;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final class DefaultApplicationConfiguration_Factory implements Factory<DefaultApplicationConfiguration> {
    private final Provider<MobilyticsConfiguration> configProvider;

    public DefaultApplicationConfiguration_Factory(Provider<MobilyticsConfiguration> provider) {
        this.configProvider = provider;
    }

    public static DefaultApplicationConfiguration_Factory create(Provider<MobilyticsConfiguration> provider) {
        return new DefaultApplicationConfiguration_Factory(provider);
    }

    public static DefaultApplicationConfiguration newInstance(MobilyticsConfiguration mobilyticsConfiguration) {
        return new DefaultApplicationConfiguration(mobilyticsConfiguration);
    }

    @Override // javax.inject.Provider
    public DefaultApplicationConfiguration get() {
        return newInstance(this.configProvider.get());
    }
}
