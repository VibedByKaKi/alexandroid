package com.amazon.alexa.eventbus.api;

import androidx.annotation.NonNull;
import java.util.UUID;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface MultiFilterSubscriber extends Subscriber {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface FilterUuid {
        UUID getUuid();
    }

    @Deprecated
    UUID subscribe(@NonNull MessageFilter messageFilter, @NonNull MessageHandler messageHandler);

    default FilterUuid subscribeFilter(@NonNull MessageFilter messageFilter, @NonNull MessageHandler messageHandler) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    void unsubscribe(@NonNull UUID uuid);

    default boolean unsubscribeFilter(@NonNull FilterUuid filterUuid) {
        throw new UnsupportedOperationException();
    }
}
