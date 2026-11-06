package rx.subscriptions;

import java.util.concurrent.atomic.AtomicReference;
import rx.Single$$ExternalSyntheticBUOutline0;
import rx.Subscription;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public final class SerialSubscription implements Subscription {
    final AtomicReference<State> state = new AtomicReference<>(new State(false, Subscriptions.empty()));

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class State {
        final boolean isUnsubscribed;
        final Subscription subscription;

        public State(boolean z, Subscription subscription) {
            this.isUnsubscribed = z;
            this.subscription = subscription;
        }

        public State set(Subscription subscription) {
            return new State(this.isUnsubscribed, subscription);
        }

        public State unsubscribe() {
            return new State(true, this.subscription);
        }
    }

    public Subscription get() {
        return this.state.get().subscription;
    }

    @Override // rx.Subscription
    public boolean isUnsubscribed() {
        return this.state.get().isUnsubscribed;
    }

    public void set(Subscription subscription) {
        if (subscription == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("Subscription can not be null");
            return;
        }
        AtomicReference<State> atomicReference = this.state;
        while (true) {
            State state = atomicReference.get();
            if (state.isUnsubscribed) {
                subscription.unsubscribe();
                return;
            }
            State state2 = state.set(subscription);
            while (!atomicReference.compareAndSet(state, state2)) {
                if (atomicReference.get() != state) {
                    break;
                }
            }
            state.subscription.unsubscribe();
            return;
        }
    }

    @Override // rx.Subscription
    public void unsubscribe() {
        AtomicReference<State> atomicReference = this.state;
        while (true) {
            State state = atomicReference.get();
            if (state.isUnsubscribed) {
                return;
            }
            State unsubscribe = state.unsubscribe();
            while (!atomicReference.compareAndSet(state, unsubscribe)) {
                if (atomicReference.get() != state) {
                    break;
                }
            }
            state.subscription.unsubscribe();
            return;
        }
    }
}
