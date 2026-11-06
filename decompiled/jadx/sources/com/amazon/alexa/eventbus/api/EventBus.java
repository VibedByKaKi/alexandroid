package com.amazon.alexa.eventbus.api;

import androidx.annotation.NonNull;
import com.amazon.alexa.eventbus.api.Subscriber;
import java.util.UUID;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface EventBus {
    default MultiFilterSubscriber getNewSubscriber() {
        return getSubscriber();
    }

    Publisher getPublisher(boolean z);

    @Deprecated
    MultiFilterSubscriber getSubscriber();

    @Deprecated
    UUID getUUID();

    void publish(@NonNull Message message);

    void subscribe(@NonNull Subscriber subscriber);

    default void unsubscribe(@NonNull Subscriber.SubscriberUuid subscriberUuid) {
        throw new UnsupportedOperationException();
    }

    void unsubscribe(@NonNull Subscriber subscriber);

    @Deprecated
    void unsubscribe(@NonNull UUID uuid);
}
