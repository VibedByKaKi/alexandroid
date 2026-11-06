package com.amazon.alexa.handsfree.notification.views;

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
public final class NotificationStateProvider_Factory implements Factory<NotificationStateProvider> {
    private final Provider<ConfigurationProvider> configurationProvider;

    public NotificationStateProvider_Factory(Provider<ConfigurationProvider> provider) {
        this.configurationProvider = provider;
    }

    public static NotificationStateProvider_Factory create(Provider<ConfigurationProvider> provider) {
        return new NotificationStateProvider_Factory(provider);
    }

    public static NotificationStateProvider newInstance(ConfigurationProvider configurationProvider) {
        return new NotificationStateProvider(configurationProvider);
    }

    @Override // javax.inject.Provider
    public NotificationStateProvider get() {
        return newInstance(this.configurationProvider.get());
    }
}
