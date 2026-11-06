package org.hamcrest.internal;

import java.util.Iterator;
import org.hamcrest.SelfDescribing;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class SelfDescribingValueIterator<T> implements Iterator<SelfDescribing> {
    private Iterator<T> values;

    public SelfDescribingValueIterator(Iterator<T> it2) {
        this.values = it2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.values.hasNext();
    }

    @Override // java.util.Iterator
    public SelfDescribing next() {
        return new SelfDescribingValue(this.values.next());
    }

    @Override // java.util.Iterator
    public void remove() {
        this.values.remove();
    }
}
