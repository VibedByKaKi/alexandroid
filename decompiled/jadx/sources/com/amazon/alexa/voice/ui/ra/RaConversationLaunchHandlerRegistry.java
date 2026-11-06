package com.amazon.alexa.voice.ui.ra;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class RaConversationLaunchHandlerRegistry {
    private static final AtomicReference<RaConversationLaunchHandler> handler = new AtomicReference<>();

    private RaConversationLaunchHandlerRegistry() {
    }

    @Nullable
    public static RaConversationLaunchHandler get() {
        return handler.get();
    }

    public static void register(@Nullable RaConversationLaunchHandler raConversationLaunchHandler) {
        handler.set(raConversationLaunchHandler);
    }

    public static void unregister(@NonNull RaConversationLaunchHandler raConversationLaunchHandler) {
        AtomicReference<RaConversationLaunchHandler> atomicReference = handler;
        while (!atomicReference.compareAndSet(raConversationLaunchHandler, null) && atomicReference.get() == raConversationLaunchHandler) {
        }
    }
}
