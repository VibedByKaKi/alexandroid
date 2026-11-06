package org.apache.commons.collections4.iterators;

import com.here.time.Duration$$ExternalSyntheticBUOutline0;
import org.apache.commons.collections4.ResettableIterator;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class SingletonIterator<E> implements ResettableIterator<E> {
    private boolean beforeFirst;
    private E object;
    private final boolean removeAllowed;
    private boolean removed;

    public SingletonIterator(E e, boolean z) {
        this.beforeFirst = true;
        this.removed = false;
        this.object = e;
        this.removeAllowed = z;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.beforeFirst && !this.removed;
    }

    @Override // java.util.Iterator
    public E next() {
        if (!this.beforeFirst || this.removed) {
            Single$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        this.beforeFirst = false;
        return this.object;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.removeAllowed) {
            Duration$$ExternalSyntheticBUOutline0.m();
        } else if (this.removed || this.beforeFirst) {
            Duration$$ExternalSyntheticBUOutline0.m$1();
        } else {
            this.object = null;
            this.removed = true;
        }
    }

    @Override // org.apache.commons.collections4.ResettableIterator
    public void reset() {
        this.beforeFirst = true;
    }

    public SingletonIterator(E e) {
        this(e, true);
    }
}
