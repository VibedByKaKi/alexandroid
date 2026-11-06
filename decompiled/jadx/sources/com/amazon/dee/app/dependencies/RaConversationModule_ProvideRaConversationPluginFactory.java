package com.amazon.dee.app.dependencies;

import com.amazon.alexa.voice.ui.ra.RaConversationLifecycleNotifier;
import com.amazon.alexa.voice.ui.ra.RaConversationPlugin;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("com.amazon.dee.app.dependencies.ApplicationScope")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class RaConversationModule_ProvideRaConversationPluginFactory implements Factory<RaConversationPlugin> {
    private final Provider<RaConversationLifecycleNotifier> lifecycleNotifierProvider;
    private final RaConversationModule module;

    public RaConversationModule_ProvideRaConversationPluginFactory(RaConversationModule raConversationModule, Provider<RaConversationLifecycleNotifier> provider) {
        this.module = raConversationModule;
        this.lifecycleNotifierProvider = provider;
    }

    public static RaConversationModule_ProvideRaConversationPluginFactory create(RaConversationModule raConversationModule, Provider<RaConversationLifecycleNotifier> provider) {
        return new RaConversationModule_ProvideRaConversationPluginFactory(raConversationModule, provider);
    }

    public static RaConversationPlugin provideRaConversationPlugin(RaConversationModule raConversationModule, RaConversationLifecycleNotifier raConversationLifecycleNotifier) {
        return (RaConversationPlugin) Preconditions.checkNotNullFromProvides(raConversationModule.provideRaConversationPlugin(raConversationLifecycleNotifier));
    }

    @Override // javax.inject.Provider
    public RaConversationPlugin get() {
        return provideRaConversationPlugin(this.module, this.lifecycleNotifierProvider.get());
    }
}
