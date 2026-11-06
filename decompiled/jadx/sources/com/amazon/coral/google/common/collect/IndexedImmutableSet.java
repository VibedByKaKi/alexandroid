package com.amazon.coral.google.common.collect;

import com.amazon.coral.google.common.annotations.GwtCompatible;
import com.amazon.coral.google.common.annotations.GwtIncompatible;
import com.amazon.coral.google.common.base.Preconditions;
import com.amazon.coral.google.common.collect.ImmutableSet;
import java.util.Spliterator;
import java.util.function.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes19.dex */
abstract class IndexedImmutableSet<E> extends ImmutableSet.CachingAsList<E> {
    @Override // com.amazon.coral.google.common.collect.ImmutableCollection
    @GwtIncompatible
    public int copyIntoArray(Object[] objArr, int i) {
        return asList().copyIntoArray(objArr, i);
    }

    @Override // com.amazon.coral.google.common.collect.ImmutableSet.CachingAsList
    public ImmutableList<E> createAsList() {
        return new ImmutableAsList<E>() { // from class: com.amazon.coral.google.common.collect.IndexedImmutableSet.1
            @Override // com.amazon.coral.google.common.collect.ImmutableAsList
            public ImmutableCollection<E> delegateCollection() {
                return IndexedImmutableSet.this;
            }

            @Override // java.util.List
            public E get(int i) {
                return (E) IndexedImmutableSet.this.get(i);
            }

            @Override // com.amazon.coral.google.common.collect.ImmutableAsList, com.amazon.coral.google.common.collect.ImmutableCollection
            public boolean isPartialView() {
                return IndexedImmutableSet.this.isPartialView();
            }

            @Override // com.amazon.coral.google.common.collect.ImmutableAsList, java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return IndexedImmutableSet.this.size();
            }
        };
    }

    @Override // java.lang.Iterable
    public void forEach(Consumer<? super E> consumer) {
        Preconditions.checkNotNull(consumer);
        int size = size();
        for (int i = 0; i < size; i++) {
            consumer.accept(get(i));
        }
    }

    public abstract E get(int i);

    @Override // com.amazon.coral.google.common.collect.ImmutableSet.CachingAsList, com.amazon.coral.google.common.collect.ImmutableSet, com.amazon.coral.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.amazon.coral.google.common.collect.SortedIterable
    public UnmodifiableIterator<E> iterator() {
        return asList().iterator();
    }

    @Override // com.amazon.coral.google.common.collect.ImmutableCollection, java.util.Collection, java.lang.Iterable
    public Spliterator<E> spliterator() {
        return CollectSpliterators.indexed(size(), 1297, new ImmutableList$$ExternalSyntheticLambda0(this, 5));
    }
}
