package com.amazon.alexa.voice.ui.ra;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class RaConversationHostViewProviderRegistry {
    private static final AtomicReference<RaConversationHostViewProvider> provider = new AtomicReference<>();

    private RaConversationHostViewProviderRegistry() {
    }

    @Nullable
    public static RaConversationHostViewProvider get() {
        return provider.get();
    }

    public static void register(@Nullable RaConversationHostViewProvider raConversationHostViewProvider) {
        provider.set(raConversationHostViewProvider);
    }

    public static void unregister(@NonNull RaConversationHostViewProvider raConversationHostViewProvider) {
        AtomicReference<RaConversationHostViewProvider> atomicReference = provider;
        while (!atomicReference.compareAndSet(raConversationHostViewProvider, null) && atomicReference.get() == raConversationHostViewProvider) {
        }
    }
}
