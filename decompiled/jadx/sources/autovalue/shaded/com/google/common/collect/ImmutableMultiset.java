package autovalue.shaded.com.google.common.collect;

import autovalue.shaded.com.google.common.annotations.GwtCompatible;
import autovalue.shaded.com.google.common.annotations.GwtIncompatible;
import autovalue.shaded.com.google.common.annotations.J2ktIncompatible;
import autovalue.shaded.com.google.common.annotations.VisibleForTesting;
import autovalue.shaded.com.google.common.base.Preconditions;
import autovalue.shaded.com.google.common.collect.ImmutableCollection;
import autovalue.shaded.com.google.common.collect.ImmutableSet;
import autovalue.shaded.com.google.common.collect.Multiset;
import autovalue.shaded.com.google.errorprone.annotations.CanIgnoreReturnValue;
import autovalue.shaded.com.google.errorprone.annotations.DoNotCall;
import autovalue.shaded.com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Collector;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true, serializable = true)
/* loaded from: classes15.dex */
public abstract class ImmutableMultiset<E> extends ImmutableMultisetGwtSerializationDependencies<E> implements Multiset<E> {
    private static final long serialVersionUID = -889275714;

    @LazyInit
    @CheckForNull
    private transient ImmutableList<E> asList;

    @LazyInit
    @CheckForNull
    private transient ImmutableSet<Multiset.Entry<E>> entrySet;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ElementSet<E> extends ImmutableSet.Indexed<E> {
        private final Multiset<E> delegate;
        private final List<Multiset.Entry<E>> entries;

        public ElementSet(List<Multiset.Entry<E>> list, Multiset<E> multiset) {
            this.entries = list;
            this.delegate = multiset;
        }

        @Override // autovalue.shaded.com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            return this.delegate.contains(obj);
        }

        @Override // autovalue.shaded.com.google.common.collect.ImmutableSet.Indexed
        public E get(int i) {
            return this.entries.get(i).getElement();
        }

        @Override // autovalue.shaded.com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.entries.size();
        }

        @Override // autovalue.shaded.com.google.common.collect.ImmutableSet.Indexed, autovalue.shaded.com.google.common.collect.ImmutableSet.CachingAsList, autovalue.shaded.com.google.common.collect.ImmutableSet, autovalue.shaded.com.google.common.collect.ImmutableCollection
        @GwtIncompatible
        @J2ktIncompatible
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public final class EntrySet extends IndexedImmutableSet<Multiset.Entry<E>> {

        @J2ktIncompatible
        private static final long serialVersionUID = 0;

        private EntrySet() {
        }

        @GwtIncompatible
        @J2ktIncompatible
        private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("Use EntrySetSerializedForm");
        }

        @Override // autovalue.shaded.com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            if (obj instanceof Multiset.Entry) {
                Multiset.Entry entry = (Multiset.Entry) obj;
                if (entry.getCount() > 0 && ImmutableMultiset.this.count(entry.getElement()) == entry.getCount()) {
                    return true;
                }
            }
            return false;
        }

        @Override // autovalue.shaded.com.google.common.collect.IndexedImmutableSet
        public Multiset.Entry<E> get(int i) {
            return ImmutableMultiset.this.getEntry(i);
        }

        @Override // autovalue.shaded.com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return ImmutableMultiset.this.hashCode();
        }

        @Override // autovalue.shaded.com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return ImmutableMultiset.this.isPartialView();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return ImmutableMultiset.this.elementSet().size();
        }

        @Override // autovalue.shaded.com.google.common.collect.IndexedImmutableSet, autovalue.shaded.com.google.common.collect.ImmutableSet.CachingAsList, autovalue.shaded.com.google.common.collect.ImmutableSet, autovalue.shaded.com.google.common.collect.ImmutableCollection
        @GwtIncompatible
        @J2ktIncompatible
        public Object writeReplace() {
            return new EntrySetSerializedForm(ImmutableMultiset.this);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @J2ktIncompatible
    @GwtIncompatible
    public static class EntrySetSerializedForm<E> implements Serializable {
        final ImmutableMultiset<E> multiset;

        public EntrySetSerializedForm(ImmutableMultiset<E> immutableMultiset) {
            this.multiset = immutableMultiset;
        }

        public Object readResolve() {
            return this.multiset.entrySet();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @J2ktIncompatible
    public static final class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        final int[] counts;
        final Object[] elements;

        public SerializedForm(Multiset<? extends Object> multiset) {
            int size = multiset.entrySet().size();
            this.elements = new Object[size];
            this.counts = new int[size];
            int i = 0;
            for (Multiset.Entry<? extends Object> entry : multiset.entrySet()) {
                this.elements[i] = entry.getElement();
                this.counts[i] = entry.getCount();
                i++;
            }
        }

        public Object readResolve() {
            LinkedHashMultiset create = LinkedHashMultiset.create(this.elements.length);
            int i = 0;
            while (true) {
                Object[] objArr = this.elements;
                if (i >= objArr.length) {
                    return ImmutableMultiset.copyOf(create);
                }
                create.add(objArr[i], this.counts[i]);
                i++;
            }
        }
    }

    public static <E> Builder<E> builder() {
        return new Builder<>();
    }

    private static <E> ImmutableMultiset<E> copyFromElements(E... eArr) {
        LinkedHashMultiset create = LinkedHashMultiset.create();
        Collections.addAll(create, eArr);
        return copyFromEntries(create.entrySet());
    }

    public static <E> ImmutableMultiset<E> copyFromEntries(Collection<? extends Multiset.Entry<? extends E>> collection) {
        return collection.isEmpty() ? of() : RegularImmutableMultiset.create(collection);
    }

    public static <E> ImmutableMultiset<E> copyOf(Iterable<? extends E> iterable) {
        if (iterable instanceof ImmutableMultiset) {
            ImmutableMultiset<E> immutableMultiset = (ImmutableMultiset) iterable;
            if (!immutableMultiset.isPartialView()) {
                return immutableMultiset;
            }
        }
        return copyFromEntries((iterable instanceof Multiset ? Multisets.cast(iterable) : LinkedHashMultiset.create(iterable)).entrySet());
    }

    private ImmutableSet<Multiset.Entry<E>> createEntrySet() {
        return isEmpty() ? ImmutableSet.of() : new EntrySet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$toImmutableMultiset$0(Object obj) {
        return 1;
    }

    public static <E> ImmutableMultiset<E> of(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        return new Builder().add((Builder) e).add((Builder<E>) e2).add((Builder<E>) e3).add((Builder<E>) e4).add((Builder<E>) e5).add((Builder<E>) e6).add((Object[]) eArr).build();
    }

    @GwtIncompatible
    @J2ktIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <E> Collector<E, ?, ImmutableMultiset<E>> toImmutableMultiset() {
        return CollectCollectors.toImmutableMultiset(Function.identity(), new ImmutableMultiset$$ExternalSyntheticLambda0());
    }

    @Override // autovalue.shaded.com.google.common.collect.Multiset
    @DoNotCall("Always throws UnsupportedOperationException")
    @CanIgnoreReturnValue
    @Deprecated
    public final int add(E e, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // autovalue.shaded.com.google.common.collect.ImmutableCollection
    public ImmutableList<E> asList() {
        ImmutableList<E> immutableList = this.asList;
        if (immutableList != null) {
            return immutableList;
        }
        ImmutableList<E> asList = super.asList();
        this.asList = asList;
        return asList;
    }

    @Override // autovalue.shaded.com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object obj) {
        return count(obj) > 0;
    }

    @Override // autovalue.shaded.com.google.common.collect.ImmutableCollection
    @GwtIncompatible
    public int copyIntoArray(Object[] objArr, int i) {
        UnmodifiableIterator<Multiset.Entry<E>> it2 = entrySet().iterator();
        while (it2.hasNext()) {
            Multiset.Entry<E> next = it2.next();
            Arrays.fill(objArr, i, next.getCount() + i, next.getElement());
            i += next.getCount();
        }
        return i;
    }

    @Override // autovalue.shaded.com.google.common.collect.Multiset
    public abstract ImmutableSet<E> elementSet();

    @Override // autovalue.shaded.com.google.common.collect.Multiset
    public ImmutableSet<Multiset.Entry<E>> entrySet() {
        ImmutableSet<Multiset.Entry<E>> immutableSet = this.entrySet;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<Multiset.Entry<E>> createEntrySet = createEntrySet();
        this.entrySet = createEntrySet;
        return createEntrySet;
    }

    @Override // java.util.Collection, autovalue.shaded.com.google.common.collect.Multiset
    public boolean equals(@CheckForNull Object obj) {
        return Multisets.equalsImpl(this, obj);
    }

    public abstract Multiset.Entry<E> getEntry(int i);

    @Override // java.util.Collection, autovalue.shaded.com.google.common.collect.Multiset
    public int hashCode() {
        return Sets.hashCodeImpl(entrySet());
    }

    @Override // autovalue.shaded.com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public UnmodifiableIterator<E> iterator() {
        final UnmodifiableIterator<Multiset.Entry<E>> it2 = entrySet().iterator();
        return new UnmodifiableIterator<E>(this) { // from class: autovalue.shaded.com.google.common.collect.ImmutableMultiset.1

            @CheckForNull
            E element;
            int remaining;

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.remaining > 0 || it2.hasNext();
            }

            @Override // java.util.Iterator
            public E next() {
                if (this.remaining <= 0) {
                    Multiset.Entry entry = (Multiset.Entry) it2.next();
                    this.element = (E) entry.getElement();
                    this.remaining = entry.getCount();
                }
                this.remaining--;
                E e = this.element;
                Objects.requireNonNull(e);
                return e;
            }
        };
    }

    @Override // autovalue.shaded.com.google.common.collect.Multiset
    @DoNotCall("Always throws UnsupportedOperationException")
    @CanIgnoreReturnValue
    @Deprecated
    public final int remove(@CheckForNull Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // autovalue.shaded.com.google.common.collect.Multiset
    @DoNotCall("Always throws UnsupportedOperationException")
    @CanIgnoreReturnValue
    @Deprecated
    public final int setCount(E e, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, autovalue.shaded.com.google.common.collect.Multiset
    public String toString() {
        return entrySet().toString();
    }

    @Override // autovalue.shaded.com.google.common.collect.ImmutableCollection
    @GwtIncompatible
    @J2ktIncompatible
    public Object writeReplace() {
        return new SerializedForm(this);
    }

    @Override // autovalue.shaded.com.google.common.collect.Multiset
    @DoNotCall("Always throws UnsupportedOperationException")
    @CanIgnoreReturnValue
    @Deprecated
    public final boolean setCount(E e, int i, int i2) {
        throw new UnsupportedOperationException();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder<E> extends ImmutableCollection.Builder<E> {
        final Multiset<E> contents;

        public Builder() {
            this(LinkedHashMultiset.create());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ void lambda$addAll$0(Object obj, int i) {
            this.contents.add(Preconditions.checkNotNull(obj), i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // autovalue.shaded.com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> add(E e) {
            this.contents.add(Preconditions.checkNotNull(e));
            return this;
        }

        @Override // autovalue.shaded.com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> addAll(Iterable<? extends E> iterable) {
            if (iterable instanceof Multiset) {
                Multisets.cast(iterable).forEachEntry(new Multisets$$ExternalSyntheticLambda1(this, 1));
                return this;
            }
            super.addAll((Iterable) iterable);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @CanIgnoreReturnValue
        public Builder<E> addCopies(E e, int i) {
            this.contents.add(Preconditions.checkNotNull(e), i);
            return this;
        }

        @Override // autovalue.shaded.com.google.common.collect.ImmutableCollection.Builder
        public ImmutableMultiset<E> build() {
            return ImmutableMultiset.copyOf(this.contents);
        }

        @VisibleForTesting
        public ImmutableMultiset<E> buildJdkBacked() {
            return this.contents.isEmpty() ? ImmutableMultiset.of() : JdkBackedImmutableMultiset.create(this.contents.entrySet());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @CanIgnoreReturnValue
        public Builder<E> setCount(E e, int i) {
            this.contents.setCount(Preconditions.checkNotNull(e), i);
            return this;
        }

        public Builder(Multiset<E> multiset) {
            this.contents = multiset;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // autovalue.shaded.com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ ImmutableCollection.Builder add(Object obj) {
            return add((Builder<E>) obj);
        }

        @Override // autovalue.shaded.com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> add(E... eArr) {
            super.add((Object[]) eArr);
            return this;
        }

        @Override // autovalue.shaded.com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> addAll(Iterator<? extends E> it2) {
            super.addAll((Iterator) it2);
            return this;
        }
    }

    public static <T, E> Collector<T, ?, ImmutableMultiset<E>> toImmutableMultiset(Function<? super T, ? extends E> function, ToIntFunction<? super T> toIntFunction) {
        return CollectCollectors.toImmutableMultiset(function, toIntFunction);
    }

    public static <E> ImmutableMultiset<E> copyOf(E[] eArr) {
        return copyFromElements(eArr);
    }

    public static <E> ImmutableMultiset<E> copyOf(Iterator<? extends E> it2) {
        LinkedHashMultiset create = LinkedHashMultiset.create();
        Iterators.addAll(create, it2);
        return copyFromEntries(create.entrySet());
    }

    public static <E> ImmutableMultiset<E> of(E e) {
        return copyFromElements(e);
    }

    public static <E> ImmutableMultiset<E> of(E e, E e2) {
        return copyFromElements(e, e2);
    }

    public static <E> ImmutableMultiset<E> of(E e, E e2, E e3) {
        return copyFromElements(e, e2, e3);
    }

    public static <E> ImmutableMultiset<E> of(E e, E e2, E e3, E e4) {
        return copyFromElements(e, e2, e3, e4);
    }

    public static <E> ImmutableMultiset<E> of(E e, E e2, E e3, E e4, E e5) {
        return copyFromElements(e, e2, e3, e4, e5);
    }

    public static <E> ImmutableMultiset<E> of() {
        return (ImmutableMultiset<E>) RegularImmutableMultiset.EMPTY;
    }
}
