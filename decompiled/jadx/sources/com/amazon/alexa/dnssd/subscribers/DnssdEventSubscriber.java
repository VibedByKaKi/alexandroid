package com.amazon.alexa.dnssd.subscribers;

import androidx.annotation.NonNull;
import com.amazon.alexa.eventbus.api.Message;
import com.amazon.alexa.eventbus.api.Subscriber;
import java.util.UUID;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface DnssdEventSubscriber extends Subscriber {
    String getEventType();

    @Override // com.amazon.alexa.eventbus.api.Subscriber
    default UUID getUUID() {
        return UUID.randomUUID();
    }

    @Override // com.amazon.alexa.eventbus.api.Subscriber
    default boolean supportsMessage(@NonNull Message message) {
        return getEventType().equals(message.getEventType());
    }
}
