package androidx.media3.common.util;

import androidx.annotation.GuardedBy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.aspectj.lang.JoinPoint;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@UnstableApi
/* loaded from: classes14.dex */
public final class CopyOnWriteMultiset<E> implements Iterable<E> {
    private final Object lock = new Object();

    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    private final Map<E, Integer> elementCounts = new HashMap();

    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    private Set<E> elementSet = Collections.EMPTY_SET;

    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    private List<E> elements = Collections.EMPTY_LIST;

    public void add(E e) {
        synchronized (this.lock) {
            try {
                ArrayList arrayList = new ArrayList(this.elements);
                arrayList.add(e);
                this.elements = Collections.unmodifiableList(arrayList);
                Integer num = this.elementCounts.get(e);
                if (num == null) {
                    HashSet hashSet = new HashSet(this.elementSet);
                    hashSet.add(e);
                    this.elementSet = Collections.unmodifiableSet(hashSet);
                }
                this.elementCounts.put(e, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int count(E e) {
        int intValue;
        synchronized (this.lock) {
            try {
                intValue = this.elementCounts.containsKey(e) ? this.elementCounts.get(e).intValue() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return intValue;
    }

    public Set<E> elementSet() {
        Set<E> set;
        synchronized (this.lock) {
            set = this.elementSet;
        }
        return set;
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        Iterator<E> it2;
        synchronized (this.lock) {
            it2 = this.elements.iterator();
        }
        return it2;
    }

    public void remove(E e) {
        synchronized (this.lock) {
            try {
                Integer num = this.elementCounts.get(e);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.elements);
                arrayList.remove(e);
                this.elements = Collections.unmodifiableList(arrayList);
                int intValue = num.intValue();
                Map<E, Integer> map = this.elementCounts;
                if (intValue == 1) {
                    map.remove(e);
                    HashSet hashSet = new HashSet(this.elementSet);
                    hashSet.remove(e);
                    this.elementSet = Collections.unmodifiableSet(hashSet);
                } else {
                    map.put(e, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
