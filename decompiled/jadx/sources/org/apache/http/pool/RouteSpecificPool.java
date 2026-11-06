package org.apache.http.pool;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.Future;
import org.apache.http.pool.PoolEntry;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
abstract class RouteSpecificPool<T, C, E extends PoolEntry<T, C>> {
    private final T route;
    private final Set<E> leased = new HashSet();
    private final LinkedList<E> available = new LinkedList<>();
    private final LinkedList<Future<E>> pending = new LinkedList<>();

    public RouteSpecificPool(T t) {
        this.route = t;
    }

    public E add(C c) {
        E createEntry = createEntry(c);
        this.leased.add(createEntry);
        return createEntry;
    }

    public abstract E createEntry(C c);

    public void free(E e, boolean z) {
        Args.notNull(e, "Pool entry");
        Asserts.check(this.leased.remove(e), "Entry %s has not been leased from this pool", e);
        if (z) {
            this.available.addFirst(e);
        }
    }

    public int getAllocatedCount() {
        return this.leased.size() + this.available.size();
    }

    public int getAvailableCount() {
        return this.available.size();
    }

    public E getFree(Object obj) {
        if (this.available.isEmpty()) {
            return null;
        }
        if (obj != null) {
            Iterator<E> it2 = this.available.iterator();
            while (it2.hasNext()) {
                E next = it2.next();
                if (obj.equals(next.getState())) {
                    it2.remove();
                    this.leased.add(next);
                    return next;
                }
            }
        }
        Iterator<E> it3 = this.available.iterator();
        while (it3.hasNext()) {
            E next2 = it3.next();
            if (next2.getState() == null) {
                it3.remove();
                this.leased.add(next2);
                return next2;
            }
        }
        return null;
    }

    public E getLastUsed() {
        if (this.available.isEmpty()) {
            return null;
        }
        return this.available.getLast();
    }

    public int getLeasedCount() {
        return this.leased.size();
    }

    public int getPendingCount() {
        return this.pending.size();
    }

    public final T getRoute() {
        return this.route;
    }

    public Future<E> nextPending() {
        return this.pending.poll();
    }

    public void queue(Future<E> future) {
        if (future == null) {
            return;
        }
        this.pending.add(future);
    }

    public boolean remove(E e) {
        Args.notNull(e, "Pool entry");
        return this.available.remove(e) || this.leased.remove(e);
    }

    public void shutdown() {
        Iterator<Future<E>> it2 = this.pending.iterator();
        while (it2.hasNext()) {
            it2.next().cancel(true);
        }
        this.pending.clear();
        Iterator<E> it3 = this.available.iterator();
        while (it3.hasNext()) {
            it3.next().close();
        }
        this.available.clear();
        Iterator<E> it4 = this.leased.iterator();
        while (it4.hasNext()) {
            it4.next().close();
        }
        this.leased.clear();
    }

    public String toString() {
        return "[route: " + this.route + "][leased: " + this.leased.size() + "][available: " + this.available.size() + "][pending: " + this.pending.size() + MarkdownConstants.RIGHT_BRACKET;
    }

    public void unqueue(Future<E> future) {
        if (future == null) {
            return;
        }
        this.pending.remove(future);
    }
}
