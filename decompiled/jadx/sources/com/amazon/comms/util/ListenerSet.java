package com.amazon.comms.util;

import com.google.common.base.Preconditions;
import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.Set;
import javax.annotation.Nonnull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ListenerSet<T> {
    private final Set<T> listeners = Sets.newConcurrentHashSet();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Notifier<T> {
        void notify(T t);
    }

    public boolean add(@Nonnull T t) {
        Preconditions.checkArgument(t != null, "listener must be non-null");
        return this.listeners.add(t);
    }

    public void clear() {
        this.listeners.clear();
    }

    public void notify(@Nonnull Notifier notifier) {
        Preconditions.checkArgument(notifier != null, "notifier must be non-null");
        Iterator<T> it2 = this.listeners.iterator();
        while (it2.hasNext()) {
            notifier.notify(it2.next());
        }
    }

    public boolean remove(@Nonnull T t) {
        Preconditions.checkArgument(t != null, "listener must be non-null");
        return this.listeners.remove(t);
    }

    public int size() {
        return this.listeners.size();
    }
}
