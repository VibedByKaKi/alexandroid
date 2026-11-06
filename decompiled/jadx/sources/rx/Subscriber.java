package rx;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import rx.internal.util.SubscriptionList;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public abstract class Subscriber<T> implements Observer<T>, Subscription {
    private static final long NOT_SET = Long.MIN_VALUE;
    private Producer producer;
    private long requested;
    private final Subscriber<?> subscriber;
    private final SubscriptionList subscriptions;

    public Subscriber(Subscriber<?> subscriber, boolean z) {
        this.requested = Long.MIN_VALUE;
        this.subscriber = subscriber;
        this.subscriptions = (!z || subscriber == null) ? new SubscriptionList() : subscriber.subscriptions;
    }

    private void addToRequested(long j) {
        long j2 = this.requested;
        if (j2 == Long.MIN_VALUE) {
            this.requested = j;
            return;
        }
        long j3 = j2 + j;
        if (j3 < 0) {
            this.requested = Long.MAX_VALUE;
        } else {
            this.requested = j3;
        }
    }

    public final void add(Subscription subscription) {
        this.subscriptions.add(subscription);
    }

    @Override // rx.Subscription
    public final boolean isUnsubscribed() {
        return this.subscriptions.isUnsubscribed();
    }

    public final void request(long j) {
        if (j < 0) {
            Single$$ExternalSyntheticBUOutline0.m$3(ArcMode$$ExternalSyntheticOutline0.m(j, "number requested cannot be negative: "));
            return;
        }
        synchronized (this) {
            Producer producer = this.producer;
            if (producer != null) {
                producer.request(j);
            } else {
                addToRequested(j);
            }
        }
    }

    public void setProducer(Producer producer) {
        long j;
        Subscriber<?> subscriber;
        boolean z;
        synchronized (this) {
            j = this.requested;
            this.producer = producer;
            subscriber = this.subscriber;
            z = subscriber != null && j == Long.MIN_VALUE;
        }
        if (z) {
            subscriber.setProducer(producer);
        } else if (j == Long.MIN_VALUE) {
            producer.request(Long.MAX_VALUE);
        } else {
            producer.request(j);
        }
    }

    @Override // rx.Subscription
    public final void unsubscribe() {
        this.subscriptions.unsubscribe();
    }

    public Subscriber(Subscriber<?> subscriber) {
        this(subscriber, true);
    }

    public Subscriber() {
        this(null, false);
    }

    public void onStart() {
    }
}
