package org.apache.commons.collections4.iterators;

import com.google.common.base.Verify$$ExternalSyntheticBUOutline0;
import org.apache.commons.collections4.ResettableIterator;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class ObjectArrayIterator<E> implements ResettableIterator<E> {
    final E[] array;
    final int endIndex;
    int index;
    final int startIndex;

    public ObjectArrayIterator(E[] eArr, int i, int i2) {
        this.index = 0;
        if (i < 0) {
            Verify$$ExternalSyntheticBUOutline0.m("Start index must not be less than zero");
            throw null;
        }
        if (i2 > eArr.length) {
            Verify$$ExternalSyntheticBUOutline0.m("End index must not be greater than the array length");
            throw null;
        }
        if (i > eArr.length) {
            Verify$$ExternalSyntheticBUOutline0.m("Start index must not be greater than the array length");
            throw null;
        }
        if (i2 < i) {
            Single$$ExternalSyntheticBUOutline0.m$3("End index must not be less than start index");
            throw null;
        }
        this.array = eArr;
        this.startIndex = i;
        this.endIndex = i2;
        this.index = i;
    }

    public E[] getArray() {
        return this.array;
    }

    public int getEndIndex() {
        return this.endIndex;
    }

    public int getStartIndex() {
        return this.startIndex;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.endIndex;
    }

    @Override // java.util.Iterator
    public E next() {
        if (!hasNext()) {
            Single$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        E[] eArr = this.array;
        int i = this.index;
        this.index = i + 1;
        return eArr[i];
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("remove() method is not supported for an ObjectArrayIterator");
    }

    @Override // org.apache.commons.collections4.ResettableIterator
    public void reset() {
        this.index = this.startIndex;
    }

    public ObjectArrayIterator(E[] eArr, int i) {
        this(eArr, i, eArr.length);
    }

    public ObjectArrayIterator(E... eArr) {
        this(eArr, 0, eArr.length);
    }
}
