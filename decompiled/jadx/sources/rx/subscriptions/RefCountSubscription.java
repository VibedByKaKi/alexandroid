package rx.subscriptions;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import rx.Single$$ExternalSyntheticBUOutline0;
import rx.Subscription;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public final class RefCountSubscription implements Subscription {
    static final State EMPTY_STATE = new State(false, 0);
    private final Subscription actual;
    final AtomicReference<State> state = new AtomicReference<>(EMPTY_STATE);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InnerSubscription extends AtomicInteger implements Subscription {
        private static final long serialVersionUID = 7005765588239987643L;
        final RefCountSubscription parent;

        public InnerSubscription(RefCountSubscription refCountSubscription) {
            this.parent = refCountSubscription;
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return get() != 0;
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            if (compareAndSet(0, 1)) {
                this.parent.unsubscribeAChild();
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class State {
        final int children;
        final boolean isUnsubscribed;

        public State(boolean z, int i) {
            this.isUnsubscribed = z;
            this.children = i;
        }

        public State addChild() {
            return new State(this.isUnsubscribed, this.children + 1);
        }

        public State removeChild() {
            return new State(this.isUnsubscribed, this.children - 1);
        }

        public State unsubscribe() {
            return new State(true, this.children);
        }
    }

    public RefCountSubscription(Subscription subscription) {
        if (subscription != null) {
            this.actual = subscription;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3(CmcdData.Factory.STREAMING_FORMAT_SS);
            throw null;
        }
    }

    private void unsubscribeActualIfApplicable(State state) {
        if (state.isUnsubscribed && state.children == 0) {
            this.actual.unsubscribe();
        }
    }

    public Subscription get() {
        AtomicReference<State> atomicReference = this.state;
        while (true) {
            State state = atomicReference.get();
            if (state.isUnsubscribed) {
                return Subscriptions.unsubscribed();
            }
            State addChild = state.addChild();
            while (!atomicReference.compareAndSet(state, addChild)) {
                if (atomicReference.get() != state) {
                    break;
                }
            }
            return new InnerSubscription(this);
        }
    }

    @Override // rx.Subscription
    public boolean isUnsubscribed() {
        return this.state.get().isUnsubscribed;
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
            unsubscribeActualIfApplicable(unsubscribe);
            return;
        }
    }

    public void unsubscribeAChild() {
        AtomicReference<State> atomicReference = this.state;
        while (true) {
            State state = atomicReference.get();
            State removeChild = state.removeChild();
            while (!atomicReference.compareAndSet(state, removeChild)) {
                if (atomicReference.get() != state) {
                    break;
                }
            }
            unsubscribeActualIfApplicable(removeChild);
            return;
        }
    }
}
