package com.amazon.alexa.eventbus.core;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.eventbus.api.Message;
import com.amazon.alexa.eventbus.api.Subscriber;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
class Registry {

    @VisibleForTesting
    final Set<Subscriber> subscribers = new CopyOnWriteArraySet();

    public void addSubscriber(@NonNull Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    public void clear() {
        this.subscribers.clear();
    }

    @NonNull
    public Set<Subscriber> getSubscribersForMessage(@NonNull Message message) {
        HashSet hashSet = new HashSet();
        for (Subscriber subscriber : this.subscribers) {
            if (subscriber.supportsMessage(message)) {
                hashSet.add(subscriber);
            }
        }
        return hashSet;
    }

    public void removeSubscriber(@NonNull UUID uuid) {
        for (Subscriber subscriber : this.subscribers) {
            if (subscriber.getUUID().equals(uuid)) {
                this.subscribers.remove(subscriber);
                return;
            }
        }
    }

    public void removeSubscriber(@NonNull Subscriber subscriber) {
        this.subscribers.remove(subscriber);
    }
}
