package com.amazon.alexa.featureservice.util;

import androidx.annotation.NonNull;
import com.amazon.alexa.eventbus.api.EventBus;
import com.amazon.alexa.eventbus.api.Message;
import com.amazon.alexa.eventbus.api.MessageFilter;
import com.amazon.alexa.eventbus.api.MessageHandler;
import com.amazon.alexa.eventbus.api.MultiFilterSubscriber;
import com.amazon.alexa.eventbus.api.Subscriber;
import dagger.Lazy;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class SafeEventBus {
    private Lazy<EventBus> eventBusLazy;

    @Inject
    public SafeEventBus(Lazy<EventBus> lazy) {
        this.eventBusLazy = lazy;
    }

    public void publish(@NonNull String str, @NonNull String str2) {
        Message build = new Message.Builder().setEventType(str).setPayload(str2).build();
        if (this.eventBusLazy.get() != null) {
            this.eventBusLazy.get().publish(build);
        }
    }

    public MultiFilterSubscriber subscribe(@NonNull MessageFilter messageFilter, @NonNull MessageHandler messageHandler) {
        if (this.eventBusLazy.get() == null) {
            return null;
        }
        MultiFilterSubscriber newSubscriber = this.eventBusLazy.get().getNewSubscriber();
        newSubscriber.subscribeFilter(messageFilter, messageHandler);
        return newSubscriber;
    }

    public void unsubscribe(@NonNull Subscriber subscriber) {
        if (this.eventBusLazy.get() == null || subscriber == null) {
            return;
        }
        this.eventBusLazy.get().unsubscribe(subscriber);
    }
}
