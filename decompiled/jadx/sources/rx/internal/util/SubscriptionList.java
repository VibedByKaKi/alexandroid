package rx.internal.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import rx.Subscription;
import rx.exceptions.Exceptions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public final class SubscriptionList implements Subscription {
    private List<Subscription> subscriptions;
    private volatile boolean unsubscribed;

    public SubscriptionList(Subscription... subscriptionArr) {
        this.subscriptions = new LinkedList(Arrays.asList(subscriptionArr));
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
                        List list = this.subscriptions;
                        if (list == null) {
                            list = new LinkedList();
                            this.subscriptions = list;
                        }
                        list.add(subscription);
                        return;
                    }
                } finally {
                }
            }
        }
        subscription.unsubscribe();
    }

    public void clear() {
        List<Subscription> list;
        if (this.unsubscribed) {
            return;
        }
        synchronized (this) {
            list = this.subscriptions;
            this.subscriptions = null;
        }
        unsubscribeFromAll(list);
    }

    public boolean hasSubscriptions() {
        List<Subscription> list;
        boolean z = false;
        if (this.unsubscribed) {
            return false;
        }
        synchronized (this) {
            try {
                if (!this.unsubscribed && (list = this.subscriptions) != null && !list.isEmpty()) {
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
        if (this.unsubscribed) {
            return;
        }
        synchronized (this) {
            List<Subscription> list = this.subscriptions;
            if (!this.unsubscribed && list != null) {
                boolean remove = list.remove(subscription);
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
                List<Subscription> list = this.subscriptions;
                this.subscriptions = null;
                unsubscribeFromAll(list);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public SubscriptionList() {
    }

    public SubscriptionList(Subscription subscription) {
        LinkedList linkedList = new LinkedList();
        this.subscriptions = linkedList;
        linkedList.add(subscription);
    }
}
