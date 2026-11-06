package com.amazon.alexa.voice.ui.ra;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface RaConversationLifecycleNotifier {
    void addListener(@NonNull RaConversationLifecycleListener raConversationLifecycleListener);

    @NonNull
    RaConversationState getConversationState();

    @Nullable
    RaConversationHost getHost();

    boolean isVoiceOrLiveModalityActive();

    void notifyConversationActive(@NonNull RaConversationHost raConversationHost);

    void notifyConversationClosed(@NonNull RaConversationHost raConversationHost);

    void notifyConversationInactive(@NonNull RaConversationHost raConversationHost);

    void notifyConversationOpened(@NonNull RaConversationHost raConversationHost);

    void notifyModalityChanged(@NonNull RaConversationHost raConversationHost, boolean z);

    void removeListener(@NonNull RaConversationLifecycleListener raConversationLifecycleListener);
}
