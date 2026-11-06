package rx.subscriptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import rx.Subscription;
import rx.exceptions.Exceptions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public final class CompositeSubscription implements Subscription {
    private Set<Subscription> subscriptions;
    private volatile boolean unsubscribed;

    public CompositeSubscription(Subscription... subscriptionArr) {
        this.subscriptions = new HashSet(Arrays.asList(subscriptionArr));
    }

    private static void unsubscribeFromAll(Collection<Subscription> collection) {
        if (collection == null) {
            return;
        }
        Iterator<Subscription> it2 = collection.iterator();
        ArrayList arrayList = null;
        while (it2.hasNext()) {
            try {
                it2.next().unsubscribe();
            } catch (Throwable th) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(th);
            }
        }
        Exceptions.throwIfAny(arrayList);
    }

    public void add(Subscription subscription) {
        if (subscription.isUnsubscribed()) {
            return;
        }
        if (!this.unsubscribed) {
            synchronized (this) {
                try {
                    if (!this.unsubscribed) {
                        if (this.subscriptions == null) {
                            this.subscriptions = new HashSet(4);
                        }
                        this.subscriptions.add(subscription);
                        return;
                    }
                } finally {
                }
            }
        }
        subscription.unsubscribe();
    }

    public void addAll(Subscription... subscriptionArr) {
        int i = 0;
        if (!this.unsubscribed) {
            synchronized (this) {
                try {
                    if (!this.unsubscribed) {
                        if (this.subscriptions == null) {
                            this.subscriptions = new HashSet(subscriptionArr.length);
                        }
                        int length = subscriptionArr.length;
                        while (i < length) {
                            Subscription subscription = subscriptionArr[i];
                            if (!subscription.isUnsubscribed()) {
                                this.subscriptions.add(subscription);
                            }
                            i++;
                        }
                        return;
                    }
                } finally {
                }
            }
        }
        int length2 = subscriptionArr.length;
        while (i < length2) {
            subscriptionArr[i].unsubscribe();
            i++;
        }
    }

    public void clear() {
        Set<Subscription> set;
        if (this.unsubscribed) {
            return;
        }
        synchronized (this) {
            if (!this.unsubscribed && (set = this.subscriptions) != null) {
                this.subscriptions = null;
                unsubscribeFromAll(set);
            }
        }
    }

    public boolean hasSubscriptions() {
        Set<Subscription> set;
        boolean z = false;
        if (this.unsubscribed) {
            return false;
        }
        synchronized (this) {
            try {
                if (!this.unsubscribed && (set = this.subscriptions) != null && !set.isEmpty()) {
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    @Override // rx.Subscription
    public boolean isUnsubscribed() {
        return this.unsubscribed;
    }

    public void remove(Subscription subscription) {
        Set<Subscription> set;
        if (this.unsubscribed) {
            return;
        }
        synchronized (this) {
            if (!this.unsubscribed && (set = this.subscriptions) != null) {
                boolean remove = set.remove(subscription);
                if (remove) {
                    subscription.unsubscribe();
                }
            }
        }
    }

    @Override // rx.Subscription
    public void unsubscribe() {
        if (this.unsubscribed) {
            return;
        }
        synchronized (this) {
            try {
                if (this.unsubscribed) {
                    return;
                }
                this.unsubscribed = true;
                Set<Subscription> set = this.subscriptions;
                this.subscriptions = null;
                unsubscribeFromAll(set);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public CompositeSubscription() {
    }
}
