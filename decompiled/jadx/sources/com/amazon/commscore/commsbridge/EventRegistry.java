package com.amazon.commscore.commsbridge;

import androidx.annotation.NonNull;
import com.amazon.commscore.api.commsbridge.EventListener;
import java.util.Set;
import java.util.UUID;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
interface EventRegistry {
    boolean addEventListener(@NonNull String str, @NonNull EventListener<String> eventListener, @NonNull UUID uuid);

    EventListener<String> getEventListener(@NonNull UUID uuid);

    Set<EventListener<String>> getEventListeners(@NonNull String str);

    EventListener<String> removeEventListener(@NonNull UUID uuid);
}
