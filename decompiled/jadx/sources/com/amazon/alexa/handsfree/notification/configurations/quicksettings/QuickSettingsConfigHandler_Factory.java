package com.amazon.alexa.handsfree.notification.configurations.quicksettings;

import android.content.Context;
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
public final class QuickSettingsConfigHandler_Factory implements Factory<QuickSettingsConfigHandler> {
    private final Provider<ConfigurationProvider> configurationProvider;
    private final Provider<Context> contextProvider;

    public QuickSettingsConfigHandler_Factory(Provider<Context> provider, Provider<ConfigurationProvider> provider2) {
        this.contextProvider = provider;
        this.configurationProvider = provider2;
    }

    public static QuickSettingsConfigHandler_Factory create(Provider<Context> provider, Provider<ConfigurationProvider> provider2) {
        return new QuickSettingsConfigHandler_Factory(provider, provider2);
    }

    public static QuickSettingsConfigHandler newInstance(Context context, ConfigurationProvider configurationProvider) {
        return new QuickSettingsConfigHandler(context, configurationProvider);
    }

    @Override // javax.inject.Provider
    public QuickSettingsConfigHandler get() {
        return newInstance(this.contextProvider.get(), this.configurationProvider.get());
    }
}
