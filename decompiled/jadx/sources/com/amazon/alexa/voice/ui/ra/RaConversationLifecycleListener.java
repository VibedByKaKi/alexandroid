package com.amazon.alexa.voice.ui.ra;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface RaConversationLifecycleListener {
    default void onRaConversationActive(@NonNull RaConversationHost raConversationHost) {
    }

    default void onRaConversationClosed(@NonNull RaConversationHost raConversationHost) {
    }

    default void onRaConversationInactive(@NonNull RaConversationHost raConversationHost) {
    }

    default void onRaConversationOpened(@NonNull RaConversationHost raConversationHost) {
    }

    default void onRaConversationModalityChanged(@NonNull RaConversationHost raConversationHost, boolean z) {
    }
}
