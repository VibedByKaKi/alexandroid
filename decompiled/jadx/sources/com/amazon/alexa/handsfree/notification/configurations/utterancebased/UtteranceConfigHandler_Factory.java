package com.amazon.alexa.handsfree.notification.configurations.utterancebased;

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
public final class UtteranceConfigHandler_Factory implements Factory<UtteranceConfigHandler> {
    private final Provider<ConfigurationProvider> configurationProvider;
    private final Provider<Context> contextProvider;

    public UtteranceConfigHandler_Factory(Provider<Context> provider, Provider<ConfigurationProvider> provider2) {
        this.contextProvider = provider;
        this.configurationProvider = provider2;
    }

    public static UtteranceConfigHandler_Factory create(Provider<Context> provider, Provider<ConfigurationProvider> provider2) {
        return new UtteranceConfigHandler_Factory(provider, provider2);
    }

    public static UtteranceConfigHandler newInstance(Context context, ConfigurationProvider configurationProvider) {
        return new UtteranceConfigHandler(context, configurationProvider);
    }

    @Override // javax.inject.Provider
    public UtteranceConfigHandler get() {
        return newInstance(this.contextProvider.get(), this.configurationProvider.get());
    }
}
