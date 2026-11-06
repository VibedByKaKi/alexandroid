package org.greenrobot.eventbus;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
final class Subscription {
    volatile boolean active = true;
    final Object subscriber;
    final SubscriberMethod subscriberMethod;

    public Subscription(Object obj, SubscriberMethod subscriberMethod) {
        this.subscriber = obj;
        this.subscriberMethod = subscriberMethod;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Subscription) {
            Subscription subscription = (Subscription) obj;
            if (this.subscriber == subscription.subscriber && this.subscriberMethod.equals(subscription.subscriberMethod)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.subscriberMethod.methodString.hashCode() + this.subscriber.hashCode();
    }
}
