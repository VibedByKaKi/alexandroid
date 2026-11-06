package autovalue.shaded.com.google.common.collect;

import autovalue.shaded.com.google.common.annotations.GwtCompatible;
import autovalue.shaded.com.google.common.annotations.GwtIncompatible;
import autovalue.shaded.com.google.common.annotations.J2ktIncompatible;
import autovalue.shaded.com.google.common.base.Preconditions;
import autovalue.shaded.com.google.common.collect.ImmutableSet;
import java.util.Spliterator;
import java.util.function.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
/* loaded from: classes15.dex */
abstract class IndexedImmutableSet<E> extends ImmutableSet.CachingAsList<E> {
    @Override // autovalue.shaded.com.google.common.collect.ImmutableCollection
    @GwtIncompatible
    public int copyIntoArray(Object[] objArr, int i) {
        return asList().copyIntoArray(objArr, i);
    }

    @Override // autovalue.shaded.com.google.common.collect.ImmutableSet.CachingAsList
    public ImmutableList<E> createAsList() {
        return new ImmutableAsList<E>() { // from class: autovalue.shaded.com.google.common.collect.IndexedImmutableSet.1
            @Override // autovalue.shaded.com.google.common.collect.ImmutableAsList
            public ImmutableCollection<E> delegateCollection() {
                return IndexedImmutableSet.this;
            }

            @Override // java.util.List
            public E get(int i) {
                return (E) IndexedImmutableSet.this.get(i);
            }

            @Override // autovalue.shaded.com.google.common.collect.ImmutableAsList, autovalue.shaded.com.google.common.collect.ImmutableCollection
            public boolean isPartialView() {
                return IndexedImmutableSet.this.isPartialView();
            }

            @Override // autovalue.shaded.com.google.common.collect.ImmutableAsList, java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return IndexedImmutableSet.this.size();
            }

            @Override // autovalue.shaded.com.google.common.collect.ImmutableAsList, autovalue.shaded.com.google.common.collect.ImmutableList, autovalue.shaded.com.google.common.collect.ImmutableCollection
            @GwtIncompatible
            @J2ktIncompatible
            public Object writeReplace() {
                return super.writeReplace();
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

    @Override // autovalue.shaded.com.google.common.collect.ImmutableSet.CachingAsList, autovalue.shaded.com.google.common.collect.ImmutableSet, autovalue.shaded.com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, autovalue.shaded.com.google.common.collect.SortedIterable
    public UnmodifiableIterator<E> iterator() {
        return asList().iterator();
    }

    @Override // autovalue.shaded.com.google.common.collect.ImmutableCollection, java.util.Collection, java.lang.Iterable
    public Spliterator<E> spliterator() {
        return CollectSpliterators.indexed(size(), 1297, new ImmutableList$$ExternalSyntheticLambda0(this, 3));
    }

    @Override // autovalue.shaded.com.google.common.collect.ImmutableSet.CachingAsList, autovalue.shaded.com.google.common.collect.ImmutableSet, autovalue.shaded.com.google.common.collect.ImmutableCollection
    @GwtIncompatible
    @J2ktIncompatible
    public Object writeReplace() {
        return super.writeReplace();
    }
}
