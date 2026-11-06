package org.apache.commons.collections4.iterators;

import com.google.common.base.Verify$$ExternalSyntheticBUOutline0;
import defpackage.a$$ExternalSyntheticOutline0;
import java.lang.reflect.Array;
import org.apache.commons.collections4.ResettableIterator;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class ArrayIterator<E> implements ResettableIterator<E> {
    final Object array;
    final int endIndex;
    int index;
    final int startIndex;

    public ArrayIterator(Object obj, int i, int i2) {
        this.array = obj;
        this.startIndex = i;
        this.endIndex = i2;
        this.index = i;
        int length = Array.getLength(obj);
        checkBound(i, length, "start");
        checkBound(i2, length, "end");
        if (i2 >= i) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("End index must not be less than start index.");
        throw null;
    }

    public void checkBound(int i, int i2, String str) {
        if (i > i2) {
            Verify$$ExternalSyntheticBUOutline0.m(a$$ExternalSyntheticOutline0.m("Attempt to make an ArrayIterator that ", str, "s beyond the end of the array. "));
        } else {
            if (i >= 0) {
                return;
            }
            Verify$$ExternalSyntheticBUOutline0.m(a$$ExternalSyntheticOutline0.m("Attempt to make an ArrayIterator that ", str, "s before the start of the array. "));
        }
    }

    public Object getArray() {
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
        Object obj = this.array;
        int i = this.index;
        this.index = i + 1;
        return (E) Array.get(obj, i);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("remove() method is not supported");
    }

    @Override // org.apache.commons.collections4.ResettableIterator
    public void reset() {
        this.index = this.startIndex;
    }

    public ArrayIterator(Object obj, int i) {
        this(obj, i, Array.getLength(obj));
    }

    public ArrayIterator(Object obj) {
        this(obj, 0);
    }
}
