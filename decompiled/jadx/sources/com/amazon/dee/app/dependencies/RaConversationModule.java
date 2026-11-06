package com.amazon.dee.app.dependencies;

import com.amazon.alexa.ra.plugin.DefaultRaConversationLifecycleNotifier;
import com.amazon.alexa.ra.plugin.DefaultRaConversationPlugin;
import com.amazon.alexa.ra.unified.UnifiedIngressBarController;
import com.amazon.alexa.voice.ui.ra.RaConversationLifecycleNotifier;
import com.amazon.alexa.voice.ui.ra.RaConversationPlugin;
import dagger.Module;
import dagger.Provides;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes3.dex */
public final class RaConversationModule {
    @Provides
    @ApplicationScope
    public RaConversationLifecycleNotifier provideRaConversationLifecycleNotifier() {
        return new DefaultRaConversationLifecycleNotifier();
    }

    @Provides
    @ApplicationScope
    public RaConversationPlugin provideRaConversationPlugin(RaConversationLifecycleNotifier raConversationLifecycleNotifier) {
        return new DefaultRaConversationPlugin(raConversationLifecycleNotifier);
    }

    @Provides
    @ApplicationScope
    public UnifiedIngressBarController provideUnifiedIngressBarController(RaConversationLifecycleNotifier raConversationLifecycleNotifier) {
        return new UnifiedIngressBarController(raConversationLifecycleNotifier);
    }
}
