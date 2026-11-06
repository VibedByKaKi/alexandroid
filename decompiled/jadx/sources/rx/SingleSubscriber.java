package rx;

import rx.annotations.Beta;
import rx.internal.util.SubscriptionList;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Beta
/* loaded from: classes12.dex */
public abstract class SingleSubscriber<T> implements Subscription {
    private final SubscriptionList cs = new SubscriptionList();

    public final void add(Subscription subscription) {
        this.cs.add(subscription);
    }

    @Override // rx.Subscription
    public final boolean isUnsubscribed() {
        return this.cs.isUnsubscribed();
    }

    public abstract void onError(Throwable th);

    public abstract void onSuccess(T t);

    @Override // rx.Subscription
    public final void unsubscribe() {
        this.cs.unsubscribe();
    }
}
