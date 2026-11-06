package autovalue.shaded.com.google.common.collect;

import autovalue.shaded.com.google.common.annotations.GwtCompatible;
import autovalue.shaded.com.google.common.annotations.GwtIncompatible;
import autovalue.shaded.com.google.common.annotations.J2ktIncompatible;
import autovalue.shaded.com.google.common.annotations.VisibleForTesting;
import autovalue.shaded.com.google.common.base.Preconditions;
import autovalue.shaded.com.google.common.collect.ImmutableCollection;
import autovalue.shaded.com.google.common.math.IntMath;
import autovalue.shaded.com.google.errorprone.annotations.CanIgnoreReturnValue;
import autovalue.shaded.com.google.errorprone.annotations.concurrent.LazyInit;
import autovalue.shaded.com.google.j2objc.annotations.RetainedWith;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.stream.Collector;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true, serializable = true)
/* loaded from: classes15.dex */
public abstract class ImmutableSet<E> extends ImmutableCollection<E> implements Set<E> {
    private static final int CUTOFF = 751619276;
    private static final double DESIRED_LOAD_FACTOR = 0.7d;
    static final int MAX_TABLE_SIZE = 1073741824;
    static final int SPLITERATOR_CHARACTERISTICS = 1297;
    private static final long serialVersionUID = -889275714;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @GwtCompatible
    public static abstract class CachingAsList<E> extends ImmutableSet<E> {

        @LazyInit
        @CheckForNull
        @RetainedWith
        private transient ImmutableList<E> asList;

        @Override // autovalue.shaded.com.google.common.collect.ImmutableCollection
        public ImmutableList<E> asList() {
            ImmutableList<E> immutableList = this.asList;
            if (immutableList != null) {
                return immutableList;
            }
            ImmutableList<E> createAsList = createAsList();
            this.asList = createAsList;
            return createAsList;
        }

        public ImmutableList<E> createAsList() {
            return new RegularImmutableAsList(this, toArray());
        }

        @Override // autovalue.shaded.com.google.common.collect.ImmutableSet, autovalue.shaded.com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, autovalue.shaded.com.google.common.collect.SortedIterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // autovalue.shaded.com.google.common.collect.ImmutableSet, autovalue.shaded.com.google.common.collect.ImmutableCollection
        @GwtIncompatible
        @J2ktIncompatible
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class Indexed<E> extends CachingAsList<E> {
        @Override // autovalue.shaded.com.google.common.collect.ImmutableCollection
        public int copyIntoArray(Object[] objArr, int i) {
            return asList().copyIntoArray(objArr, i);
        }

        @Override // autovalue.shaded.com.google.common.collect.ImmutableSet.CachingAsList
        public ImmutableList<E> createAsList() {
            return new ImmutableAsList<E>() { // from class: autovalue.shaded.com.google.common.collect.ImmutableSet.Indexed.1
                @Override // java.util.List
                public E get(int i) {
                    return (E) Indexed.this.get(i);
                }

                @Override // autovalue.shaded.com.google.common.collect.ImmutableAsList, autovalue.shaded.com.google.common.collect.ImmutableList, autovalue.shaded.com.google.common.collect.ImmutableCollection
                @GwtIncompatible
                @J2ktIncompatible
                public Object writeReplace() {
                    return super.writeReplace();
                }

                @Override // autovalue.shaded.com.google.common.collect.ImmutableAsList
                public Indexed<E> delegateCollection() {
                    return Indexed.this;
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
            return CollectSpliterators.indexed(size(), ImmutableSet.SPLITERATOR_CHARACTERISTICS, new ImmutableList$$ExternalSyntheticLambda0(this, 1));
        }

        @Override // autovalue.shaded.com.google.common.collect.ImmutableSet.CachingAsList, autovalue.shaded.com.google.common.collect.ImmutableSet, autovalue.shaded.com.google.common.collect.ImmutableCollection
        @GwtIncompatible
        @J2ktIncompatible
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class JdkBackedSetBuilderImpl<E> extends SetBuilderImpl<E> {
        private final Set<Object> delegate;

        public JdkBackedSetBuilderImpl(SetBuilderImpl<E> setBuilderImpl) {
            super(setBuilderImpl);
            this.delegate = Sets.newHashSetWithExpectedSize(this.distinct);
            for (int i = 0; i < this.distinct; i++) {
                Set<Object> set = this.delegate;
                E e = this.dedupedElements[i];
                Objects.requireNonNull(e);
                set.add(e);
            }
        }

        @Override // autovalue.shaded.com.google.common.collect.ImmutableSet.SetBuilderImpl
        public SetBuilderImpl<E> add(E e) {
            Preconditions.checkNotNull(e);
            if (this.delegate.add(e)) {
                addDedupedElement(e);
            }
            return this;
        }

        @Override // autovalue.shaded.com.google.common.collect.ImmutableSet.SetBuilderImpl
        public ImmutableSet<E> build() {
            int i = this.distinct;
            if (i == 0) {
                return ImmutableSet.of();
            }
            if (i != 1) {
                return new JdkBackedImmutableSet(this.delegate, ImmutableList.asImmutableList(this.dedupedElements, this.distinct));
            }
            E e = this.dedupedElements[0];
            Objects.requireNonNull(e);
            return ImmutableSet.of((Object) e);
        }

        @Override // autovalue.shaded.com.google.common.collect.ImmutableSet.SetBuilderImpl
        public SetBuilderImpl<E> copy() {
            return new JdkBackedSetBuilderImpl(this);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @J2ktIncompatible
    public static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        final Object[] elements;

        public SerializedForm(Object[] objArr) {
            this.elements = objArr;
        }

        public Object readResolve() {
            return ImmutableSet.copyOf(this.elements);
        }
    }

    public static <E> Builder<E> builder() {
        return new Builder<>();
    }

    public static <E> Builder<E> builderWithExpectedSize(int i) {
        CollectPreconditions.checkNonnegative(i, "expectedSize");
        return new Builder<>(i);
    }

    public static int chooseTableSize(int i) {
        int max = Math.max(i, 2);
        if (max >= CUTOFF) {
            Preconditions.checkArgument(max < 1073741824, "collection too large");
            return 1073741824;
        }
        int highestOneBit = Integer.highestOneBit(max - 1) << 1;
        while (highestOneBit * DESIRED_LOAD_FACTOR < max) {
            highestOneBit <<= 1;
        }
        return highestOneBit;
    }

    public static <E> ImmutableSet<E> copyOf(Collection<? extends E> collection) {
        if ((collection instanceof ImmutableSet) && !(collection instanceof SortedSet)) {
            ImmutableSet<E> immutableSet = (ImmutableSet) collection;
            if (!immutableSet.isPartialView()) {
                return immutableSet;
            }
        } else if (collection instanceof EnumSet) {
            return copyOfEnumSet((EnumSet) collection);
        }
        if (collection.isEmpty()) {
            return of();
        }
        Object[] array = collection.toArray();
        return fromArrayWithExpectedSize(array, collection instanceof Set ? array.length : estimatedSizeForUnknownDuplication(array.length));
    }

    private static ImmutableSet copyOfEnumSet(EnumSet<?> enumSet) {
        return ImmutableEnumSet.asImmutable(EnumSet.copyOf((EnumSet) enumSet));
    }

    private static int estimatedSizeForUnknownDuplication(int i) {
        return i < 4 ? i : Math.max(4, IntMath.sqrt(i, RoundingMode.CEILING));
    }

    private static <E> ImmutableSet<E> fromArrayWithExpectedSize(E[] eArr, int i) {
        int length = eArr.length;
        if (length == 0) {
            return of();
        }
        if (length == 1) {
            return of((Object) eArr[0]);
        }
        SetBuilderImpl regularSetBuilderImpl = new RegularSetBuilderImpl(i);
        for (E e : eArr) {
            regularSetBuilderImpl = regularSetBuilderImpl.add(e);
        }
        return regularSetBuilderImpl.review().build();
    }

    @SafeVarargs
    public static <E> ImmutableSet<E> of(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        Preconditions.checkArgument(eArr.length <= 2147483641, "the total number of elements must fit in an int");
        SetBuilderImpl<E> add = new RegularSetBuilderImpl(eArr.length + 6).add(e).add(e2).add(e3).add(e4).add(e5).add(e6);
        for (E e7 : eArr) {
            add = add.add(e7);
        }
        return add.review().build();
    }

    @J2ktIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <E> Collector<E, ?, ImmutableSet<E>> toImmutableSet() {
        return CollectCollectors.toImmutableSet();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof ImmutableSet) && isHashCodeFast() && ((ImmutableSet) obj).isHashCodeFast() && hashCode() != obj.hashCode()) {
            return false;
        }
        return Sets.equalsImpl(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return Sets.hashCodeImpl(this);
    }

    public boolean isHashCodeFast() {
        return false;
    }

    @Override // autovalue.shaded.com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public abstract UnmodifiableIterator<E> iterator();

    @Override // autovalue.shaded.com.google.common.collect.ImmutableCollection
    @J2ktIncompatible
    public Object writeReplace() {
        return new SerializedForm(toArray());
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder<E> extends ImmutableCollection.Builder<E> {
        boolean forceCopy;

        @CheckForNull
        private SetBuilderImpl<E> impl;

        public Builder(int i) {
            if (i > 0) {
                this.impl = new RegularSetBuilderImpl(i);
            } else {
                this.impl = EmptySetBuilderImpl.instance();
            }
        }

        @Override // autovalue.shaded.com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> add(E e) {
            Objects.requireNonNull(this.impl);
            Preconditions.checkNotNull(e);
            copyIfNecessary();
            this.impl = this.impl.add(e);
            return this;
        }

        @Override // autovalue.shaded.com.google.common.collect.ImmutableCollection.Builder
        public ImmutableSet<E> build() {
            Objects.requireNonNull(this.impl);
            this.forceCopy = true;
            SetBuilderImpl<E> review = this.impl.review();
            this.impl = review;
            return review.build();
        }

        @CanIgnoreReturnValue
        public Builder<E> combine(Builder<E> builder) {
            Objects.requireNonNull(this.impl);
            Objects.requireNonNull(builder.impl);
            copyIfNecessary();
            this.impl = this.impl.combine(builder.impl);
            return this;
        }

        public void copy() {
            Objects.requireNonNull(this.impl);
            this.impl = this.impl.copy();
        }

        public final void copyIfNecessary() {
            if (this.forceCopy) {
                copy();
                this.forceCopy = false;
            }
        }

        @VisibleForTesting
        public void forceJdk() {
            Objects.requireNonNull(this.impl);
            this.impl = new JdkBackedSetBuilderImpl(this.impl);
        }

        @Override // autovalue.shaded.com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> addAll(Iterable<? extends E> iterable) {
            super.addAll((Iterable) iterable);
            return this;
        }

        @Override // autovalue.shaded.com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> addAll(Iterator<? extends E> it2) {
            super.addAll((Iterator) it2);
            return this;
        }

        public Builder() {
            this(0);
        }

        public Builder(boolean z) {
            this.impl = null;
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
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class EmptySetBuilderImpl<E> extends SetBuilderImpl<E> {
        private static final EmptySetBuilderImpl<Object> INSTANCE = new EmptySetBuilderImpl<>();

        private EmptySetBuilderImpl() {
            super(0);
        }

        public static <E> SetBuilderImpl<E> instance() {
            return INSTANCE;
        }

        @Override // autovalue.shaded.com.google.common.collect.ImmutableSet.SetBuilderImpl
        public SetBuilderImpl<E> add(E e) {
            return new RegularSetBuilderImpl(4).add(e);
        }

        @Override // autovalue.shaded.com.google.common.collect.ImmutableSet.SetBuilderImpl
        public ImmutableSet<E> build() {
            return ImmutableSet.of();
        }

        @Override // autovalue.shaded.com.google.common.collect.ImmutableSet.SetBuilderImpl
        public SetBuilderImpl<E> copy() {
            return this;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class SetBuilderImpl<E> {
        E[] dedupedElements;
        int distinct;

        public SetBuilderImpl(SetBuilderImpl<E> setBuilderImpl) {
            E[] eArr = setBuilderImpl.dedupedElements;
            this.dedupedElements = (E[]) Arrays.copyOf(eArr, eArr.length);
            this.distinct = setBuilderImpl.distinct;
        }

        private void ensureCapacity(int i) {
            E[] eArr = this.dedupedElements;
            if (i > eArr.length) {
                this.dedupedElements = (E[]) Arrays.copyOf(this.dedupedElements, ImmutableCollection.Builder.expandedCapacity(eArr.length, i));
            }
        }

        public abstract SetBuilderImpl<E> add(E e);

        public final void addDedupedElement(E e) {
            ensureCapacity(this.distinct + 1);
            E[] eArr = this.dedupedElements;
            int i = this.distinct;
            this.distinct = i + 1;
            eArr[i] = e;
        }

        public abstract ImmutableSet<E> build();

        public final SetBuilderImpl<E> combine(SetBuilderImpl<E> setBuilderImpl) {
            for (int i = 0; i < setBuilderImpl.distinct; i++) {
                E e = setBuilderImpl.dedupedElements[i];
                Objects.requireNonNull(e);
                this = this.add(e);
            }
            return this;
        }

        public abstract SetBuilderImpl<E> copy();

        public SetBuilderImpl<E> review() {
            return this;
        }

        public SetBuilderImpl(int i) {
            this.dedupedElements = (E[]) new Object[i];
            this.distinct = 0;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class RegularSetBuilderImpl<E> extends SetBuilderImpl<E> {
        static final int MAX_RUN_MULTIPLIER = 13;
        private int expandTableThreshold;
        private int hashCode;

        @CheckForNull
        private Object[] hashTable;
        private int maxRunBeforeFallback;

        public RegularSetBuilderImpl(RegularSetBuilderImpl<E> regularSetBuilderImpl) {
            super(regularSetBuilderImpl);
            Object[] objArr = regularSetBuilderImpl.hashTable;
            this.hashTable = objArr == null ? null : (Object[]) objArr.clone();
            this.maxRunBeforeFallback = regularSetBuilderImpl.maxRunBeforeFallback;
            this.expandTableThreshold = regularSetBuilderImpl.expandTableThreshold;
            this.hashCode = regularSetBuilderImpl.hashCode;
        }

        public static boolean hashFloodingDetected(Object[] objArr) {
            int maxRunBeforeFallback = maxRunBeforeFallback(objArr.length);
            int length = objArr.length - 1;
            int i = 0;
            int i2 = 0;
            while (i < objArr.length) {
                if (i != i2 || objArr[i] != null) {
                    int i3 = i + maxRunBeforeFallback;
                    for (int i4 = i3 - 1; i4 >= i2; i4--) {
                        if (objArr[i4 & length] == null) {
                            i2 = i3;
                            i = i4 + 1;
                        }
                    }
                    return true;
                }
                i2 = i + maxRunBeforeFallback;
                if (objArr[(i2 - 1) & length] != null) {
                    i2 = i + 1;
                }
                i = i2;
            }
            return false;
        }

        private SetBuilderImpl<E> insertInHashTable(E e) {
            Objects.requireNonNull(this.hashTable);
            int hashCode = e.hashCode();
            int smear = Hashing.smear(hashCode);
            int length = this.hashTable.length - 1;
            for (int i = smear; i - smear < this.maxRunBeforeFallback; i++) {
                int i2 = i & length;
                Object obj = this.hashTable[i2];
                if (obj == null) {
                    addDedupedElement(e);
                    this.hashTable[i2] = e;
                    this.hashCode += hashCode;
                    ensureTableCapacity(this.distinct);
                    return this;
                }
                if (obj.equals(e)) {
                    return this;
                }
            }
            return new JdkBackedSetBuilderImpl(this).add(e);
        }

        public static int maxRunBeforeFallback(int i) {
            return IntMath.log2(i, RoundingMode.UNNECESSARY) * 13;
        }

        public static Object[] rebuildHashTable(int i, Object[] objArr, int i2) {
            int i3;
            Object[] objArr2 = new Object[i];
            int i4 = i - 1;
            for (int i5 = 0; i5 < i2; i5++) {
                Object obj = objArr[i5];
                Objects.requireNonNull(obj);
                int smear = Hashing.smear(obj.hashCode());
                while (true) {
                    i3 = smear & i4;
                    if (objArr2[i3] == null) {
                        break;
                    }
                    smear++;
                }
                objArr2[i3] = obj;
            }
            return objArr2;
        }

        @Override // autovalue.shaded.com.google.common.collect.ImmutableSet.SetBuilderImpl
        public SetBuilderImpl<E> add(E e) {
            Preconditions.checkNotNull(e);
            if (this.hashTable != null) {
                return insertInHashTable(e);
            }
            if (this.distinct == 0) {
                addDedupedElement(e);
                return this;
            }
            ensureTableCapacity(this.dedupedElements.length);
            this.distinct--;
            return insertInHashTable(this.dedupedElements[0]).add(e);
        }

        @Override // autovalue.shaded.com.google.common.collect.ImmutableSet.SetBuilderImpl
        public ImmutableSet<E> build() {
            int i = this.distinct;
            if (i == 0) {
                return ImmutableSet.of();
            }
            Object[] objArr = this.dedupedElements;
            if (i == 1) {
                Object obj = objArr[0];
                Objects.requireNonNull(obj);
                return ImmutableSet.of(obj);
            }
            if (i != objArr.length) {
                objArr = Arrays.copyOf(objArr, i);
            }
            int i2 = this.hashCode;
            Object[] objArr2 = this.hashTable;
            Objects.requireNonNull(objArr2);
            return new RegularImmutableSet(objArr, i2, objArr2, this.hashTable.length - 1);
        }

        @Override // autovalue.shaded.com.google.common.collect.ImmutableSet.SetBuilderImpl
        public SetBuilderImpl<E> copy() {
            return new RegularSetBuilderImpl(this);
        }

        public void ensureTableCapacity(int i) {
            int length;
            Object[] objArr = this.hashTable;
            if (objArr == null) {
                length = ImmutableSet.chooseTableSize(i);
                this.hashTable = new Object[length];
            } else {
                if (i <= this.expandTableThreshold || objArr.length >= 1073741824) {
                    return;
                }
                length = objArr.length * 2;
                this.hashTable = rebuildHashTable(length, this.dedupedElements, this.distinct);
            }
            this.maxRunBeforeFallback = maxRunBeforeFallback(length);
            this.expandTableThreshold = (int) (length * ImmutableSet.DESIRED_LOAD_FACTOR);
        }

        @Override // autovalue.shaded.com.google.common.collect.ImmutableSet.SetBuilderImpl
        public SetBuilderImpl<E> review() {
            if (this.hashTable != null) {
                int chooseTableSize = ImmutableSet.chooseTableSize(this.distinct);
                if (chooseTableSize * 2 < this.hashTable.length) {
                    this.hashTable = rebuildHashTable(chooseTableSize, this.dedupedElements, this.distinct);
                    this.maxRunBeforeFallback = maxRunBeforeFallback(chooseTableSize);
                    this.expandTableThreshold = (int) (chooseTableSize * ImmutableSet.DESIRED_LOAD_FACTOR);
                }
                if (hashFloodingDetected(this.hashTable)) {
                    return new JdkBackedSetBuilderImpl(this);
                }
            }
            return this;
        }

        public RegularSetBuilderImpl(int i) {
            super(i);
            this.hashTable = null;
            this.maxRunBeforeFallback = 0;
            this.expandTableThreshold = 0;
        }
    }

    public static <E> ImmutableSet<E> copyOf(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return copyOf((Collection) iterable);
        }
        return copyOf(iterable.iterator());
    }

    public static <E> ImmutableSet<E> copyOf(Iterator<? extends E> it2) {
        if (!it2.hasNext()) {
            return of();
        }
        E next = it2.next();
        if (!it2.hasNext()) {
            return of((Object) next);
        }
        return new Builder().add((Builder) next).addAll((Iterator) it2).build();
    }

    public static <E> ImmutableSet<E> copyOf(E[] eArr) {
        return fromArrayWithExpectedSize(eArr, estimatedSizeForUnknownDuplication(eArr.length));
    }

    public static <E> ImmutableSet<E> of(E e) {
        return new SingletonImmutableSet(e);
    }

    public static <E> ImmutableSet<E> of(E e, E e2) {
        return new RegularSetBuilderImpl(2).add(e).add(e2).review().build();
    }

    public static <E> ImmutableSet<E> of(E e, E e2, E e3) {
        return new RegularSetBuilderImpl(3).add(e).add(e2).add(e3).review().build();
    }

    public static <E> ImmutableSet<E> of(E e, E e2, E e3, E e4) {
        return new RegularSetBuilderImpl(4).add(e).add(e2).add(e3).add(e4).review().build();
    }

    public static <E> ImmutableSet<E> of(E e, E e2, E e3, E e4, E e5) {
        return new RegularSetBuilderImpl(5).add(e).add(e2).add(e3).add(e4).add(e5).review().build();
    }

    public static <E> ImmutableSet<E> of() {
        return RegularImmutableSet.EMPTY;
    }
}
