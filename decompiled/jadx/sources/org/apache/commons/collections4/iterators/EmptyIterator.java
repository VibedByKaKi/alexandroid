package org.apache.commons.collections4.iterators;

import java.util.Iterator;
import org.apache.commons.collections4.ResettableIterator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class EmptyIterator<E> extends AbstractEmptyIterator<E> implements ResettableIterator<E> {
    public static final Iterator INSTANCE;
    public static final ResettableIterator RESETTABLE_INSTANCE;

    static {
        EmptyIterator emptyIterator = new EmptyIterator();
        RESETTABLE_INSTANCE = emptyIterator;
        INSTANCE = emptyIterator;
    }

    public static <E> Iterator<E> emptyIterator() {
        return INSTANCE;
    }

    public static <E> ResettableIterator<E> resettableEmptyIterator() {
        return RESETTABLE_INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.apache.commons.collections4.iterators.AbstractEmptyIterator
    public /* bridge */ /* synthetic */ void add(Object obj) {
        super.add(obj);
    }

    @Override // org.apache.commons.collections4.iterators.AbstractEmptyIterator
    public /* bridge */ /* synthetic */ boolean hasNext() {
        return super.hasNext();
    }

    @Override // org.apache.commons.collections4.iterators.AbstractEmptyIterator
    public /* bridge */ /* synthetic */ boolean hasPrevious() {
        return super.hasPrevious();
    }

    @Override // org.apache.commons.collections4.iterators.AbstractEmptyIterator
    public /* bridge */ /* synthetic */ Object next() {
        return super.next();
    }

    @Override // org.apache.commons.collections4.iterators.AbstractEmptyIterator
    public /* bridge */ /* synthetic */ int nextIndex() {
        return super.nextIndex();
    }

    @Override // org.apache.commons.collections4.iterators.AbstractEmptyIterator
    public /* bridge */ /* synthetic */ Object previous() {
        return super.previous();
    }

    @Override // org.apache.commons.collections4.iterators.AbstractEmptyIterator
    public /* bridge */ /* synthetic */ int previousIndex() {
        return super.previousIndex();
    }

    @Override // org.apache.commons.collections4.iterators.AbstractEmptyIterator
    public /* bridge */ /* synthetic */ void remove() {
        super.remove();
    }

    @Override // org.apache.commons.collections4.iterators.AbstractEmptyIterator
    public /* bridge */ /* synthetic */ void reset() {
        super.reset();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.apache.commons.collections4.iterators.AbstractEmptyIterator
    public /* bridge */ /* synthetic */ void set(Object obj) {
        super.set(obj);
    }
}
