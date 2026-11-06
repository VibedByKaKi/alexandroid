package com.amazon.dee.app.dependencies;

import com.amazon.alexa.voice.ui.ra.RaConversationLifecycleNotifier;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("com.amazon.dee.app.dependencies.ApplicationScope")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class RaConversationModule_ProvideRaConversationLifecycleNotifierFactory implements Factory<RaConversationLifecycleNotifier> {
    private final RaConversationModule module;

    public RaConversationModule_ProvideRaConversationLifecycleNotifierFactory(RaConversationModule raConversationModule) {
        this.module = raConversationModule;
    }

    public static RaConversationModule_ProvideRaConversationLifecycleNotifierFactory create(RaConversationModule raConversationModule) {
        return new RaConversationModule_ProvideRaConversationLifecycleNotifierFactory(raConversationModule);
    }

    public static RaConversationLifecycleNotifier provideRaConversationLifecycleNotifier(RaConversationModule raConversationModule) {
        return (RaConversationLifecycleNotifier) Preconditions.checkNotNullFromProvides(raConversationModule.provideRaConversationLifecycleNotifier());
    }

    @Override // javax.inject.Provider
    public RaConversationLifecycleNotifier get() {
        return provideRaConversationLifecycleNotifier(this.module);
    }
}
