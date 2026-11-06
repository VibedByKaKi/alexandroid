package com.amazon.coral.google.common.collect;

import autovalue.shaded.com.google.common.collect.Iterables$1$$ExternalSyntheticLambda1;
import com.amazon.coral.google.common.annotations.Beta;
import com.amazon.coral.google.common.annotations.GwtCompatible;
import com.amazon.coral.google.common.annotations.VisibleForTesting;
import com.amazon.coral.google.common.base.Preconditions;
import com.amazon.coral.google.common.collect.ImmutableCollection;
import com.amazon.coral.google.errorprone.annotations.CanIgnoreReturnValue;
import com.amazon.coral.google.errorprone.annotations.DoNotCall;
import com.amazon.coral.google.errorprone.annotations.DoNotMock;
import com.amazon.coral.google.errorprone.annotations.concurrent.LazyInit;
import com.amazon.coral.google.j2objc.annotations.RetainedWith;
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DoNotMock("Use ImmutableMap.of or another implementation")
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true, serializable = true)
/* loaded from: classes19.dex */
public abstract class ImmutableMap<K, V> implements Map<K, V>, Serializable {
    static final Map.Entry<?, ?>[] EMPTY_ENTRY_ARRAY = new Map.Entry[0];

    @LazyInit
    @RetainedWith
    @CheckForNull
    private transient ImmutableSet<Map.Entry<K, V>> entrySet;

    @LazyInit
    @RetainedWith
    @CheckForNull
    private transient ImmutableSet<K> keySet;

    @LazyInit
    @CheckForNull
    private transient ImmutableSetMultimap<K, V> multimapView;

    @LazyInit
    @RetainedWith
    @CheckForNull
    private transient ImmutableCollection<V> values;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class IteratorBasedImmutableMap<K, V> extends ImmutableMap<K, V> {
        @Override // com.amazon.coral.google.common.collect.ImmutableMap
        public ImmutableSet<Map.Entry<K, V>> createEntrySet() {
            return new ImmutableMapEntrySet<K, V>() { // from class: com.amazon.coral.google.common.collect.ImmutableMap.IteratorBasedImmutableMap.1EntrySetImpl
                @Override // com.amazon.coral.google.common.collect.ImmutableSet.CachingAsList, com.amazon.coral.google.common.collect.ImmutableSet, com.amazon.coral.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.amazon.coral.google.common.collect.SortedIterable
                public UnmodifiableIterator<Map.Entry<K, V>> iterator() {
                    return IteratorBasedImmutableMap.this.entryIterator();
                }

                @Override // com.amazon.coral.google.common.collect.ImmutableMapEntrySet
                public ImmutableMap<K, V> map() {
                    return IteratorBasedImmutableMap.this;
                }
            };
        }

        @Override // com.amazon.coral.google.common.collect.ImmutableMap
        public ImmutableSet<K> createKeySet() {
            return new ImmutableMapKeySet(this);
        }

        @Override // com.amazon.coral.google.common.collect.ImmutableMap
        public ImmutableCollection<V> createValues() {
            return new ImmutableMapValues(this);
        }

        public abstract UnmodifiableIterator<Map.Entry<K, V>> entryIterator();

        @Override // com.amazon.coral.google.common.collect.ImmutableMap, java.util.Map
        public /* bridge */ /* synthetic */ Set entrySet() {
            return super.entrySet();
        }

        public Spliterator<Map.Entry<K, V>> entrySpliterator() {
            return Spliterators.spliterator(entryIterator(), size(), 1297);
        }

        @Override // com.amazon.coral.google.common.collect.ImmutableMap, java.util.Map
        public /* bridge */ /* synthetic */ Set keySet() {
            return super.keySet();
        }

        @Override // com.amazon.coral.google.common.collect.ImmutableMap, java.util.Map, com.amazon.coral.google.common.collect.BiMap
        public /* bridge */ /* synthetic */ Collection values() {
            return super.values();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public final class MapViewOfValuesAsSingletonSets extends IteratorBasedImmutableMap<K, ImmutableSet<V>> {
        private MapViewOfValuesAsSingletonSets() {
        }

        @Override // com.amazon.coral.google.common.collect.ImmutableMap, java.util.Map
        public boolean containsKey(@CheckForNull Object obj) {
            return ImmutableMap.this.containsKey(obj);
        }

        @Override // com.amazon.coral.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.amazon.coral.google.common.collect.ImmutableMap
        public ImmutableSet<K> createKeySet() {
            return ImmutableMap.this.keySet();
        }

        @Override // com.amazon.coral.google.common.collect.ImmutableMap.IteratorBasedImmutableMap
        public UnmodifiableIterator<Map.Entry<K, ImmutableSet<V>>> entryIterator() {
            final UnmodifiableIterator<Map.Entry<K, V>> it2 = ImmutableMap.this.entrySet().iterator();
            return new UnmodifiableIterator<Map.Entry<K, ImmutableSet<V>>>(this) { // from class: com.amazon.coral.google.common.collect.ImmutableMap.MapViewOfValuesAsSingletonSets.1
                @Override // java.util.Iterator
                public boolean hasNext() {
                    return it2.hasNext();
                }

                @Override // java.util.Iterator
                public Map.Entry<K, ImmutableSet<V>> next() {
                    final Map.Entry entry = (Map.Entry) it2.next();
                    return new AbstractMapEntry<K, ImmutableSet<V>>(this) { // from class: com.amazon.coral.google.common.collect.ImmutableMap.MapViewOfValuesAsSingletonSets.1.1
                        @Override // com.amazon.coral.google.common.collect.AbstractMapEntry, java.util.Map.Entry
                        public K getKey() {
                            return (K) entry.getKey();
                        }

                        @Override // com.amazon.coral.google.common.collect.AbstractMapEntry, java.util.Map.Entry
                        public ImmutableSet<V> getValue() {
                            return ImmutableSet.of(entry.getValue());
                        }
                    };
                }
            };
        }

        @Override // com.amazon.coral.google.common.collect.ImmutableMap, java.util.Map
        @CheckForNull
        public ImmutableSet<V> get(@CheckForNull Object obj) {
            Object obj2 = ImmutableMap.this.get(obj);
            if (obj2 == null) {
                return null;
            }
            return ImmutableSet.of(obj2);
        }

        @Override // com.amazon.coral.google.common.collect.ImmutableMap, java.util.Map
        public int hashCode() {
            return ImmutableMap.this.hashCode();
        }

        @Override // com.amazon.coral.google.common.collect.ImmutableMap
        public boolean isHashCodeFast() {
            return ImmutableMap.this.isHashCodeFast();
        }

        @Override // com.amazon.coral.google.common.collect.ImmutableMap
        public boolean isPartialView() {
            return ImmutableMap.this.isPartialView();
        }

        @Override // java.util.Map
        public int size() {
            return ImmutableMap.this.size();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class SerializedForm<K, V> implements Serializable {
        private static final boolean USE_LEGACY_SERIALIZATION = true;
        private static final long serialVersionUID = 0;
        private final Object keys;
        private final Object values;

        public SerializedForm(ImmutableMap<K, V> immutableMap) {
            Object[] objArr = new Object[immutableMap.size()];
            Object[] objArr2 = new Object[immutableMap.size()];
            UnmodifiableIterator<Map.Entry<K, V>> it2 = immutableMap.entrySet().iterator();
            int i = 0;
            while (it2.hasNext()) {
                Map.Entry<K, V> next = it2.next();
                objArr[i] = next.getKey();
                objArr2[i] = next.getValue();
                i++;
            }
            this.keys = objArr;
            this.values = objArr2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Object legacyReadResolve() {
            Object[] objArr = (Object[]) this.keys;
            Object[] objArr2 = (Object[]) this.values;
            Builder<K, V> makeBuilder = makeBuilder(objArr.length);
            for (int i = 0; i < objArr.length; i++) {
                makeBuilder.put(objArr[i], objArr2[i]);
            }
            return makeBuilder.buildOrThrow();
        }

        public Builder<K, V> makeBuilder(int i) {
            return new Builder<>(i);
        }

        public final Object readResolve() {
            Object obj = this.keys;
            if (!(obj instanceof ImmutableSet)) {
                return legacyReadResolve();
            }
            ImmutableSet immutableSet = (ImmutableSet) obj;
            ImmutableCollection immutableCollection = (ImmutableCollection) this.values;
            Builder<K, V> makeBuilder = makeBuilder(immutableSet.size());
            UnmodifiableIterator it2 = immutableSet.iterator();
            UnmodifiableIterator it3 = immutableCollection.iterator();
            while (it2.hasNext()) {
                makeBuilder.put(it2.next(), it3.next());
            }
            return makeBuilder.buildOrThrow();
        }
    }

    public static <K, V> Builder<K, V> builder() {
        return new Builder<>();
    }

    @Beta
    public static <K, V> Builder<K, V> builderWithExpectedSize(int i) {
        CollectPreconditions.checkNonnegative(i, "expectedSize");
        return new Builder<>(i);
    }

    public static void checkNoConflict(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw conflictException(str, obj, obj2);
        }
    }

    public static IllegalArgumentException conflictException(String str, Object obj, Object obj2) {
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(obj2);
        return new IllegalArgumentException(a$$ExternalSyntheticOutline0.m(CredentialConfig$$ExternalSyntheticOutline0.m21223m(valueOf2.length() + valueOf.length() + CredentialConfig$$ExternalSyntheticOutline0.m(34, str), "Multiple entries with same ", str, ": ", valueOf), " and ", valueOf2));
    }

    @Beta
    public static <K, V> ImmutableMap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        Map.Entry[] entryArr = (Map.Entry[]) Iterables.toArray(iterable, EMPTY_ENTRY_ARRAY);
        int length = entryArr.length;
        if (length == 0) {
            return of();
        }
        if (length != 1) {
            return RegularImmutableMap.fromEntries(entryArr);
        }
        Map.Entry entry = entryArr[0];
        Objects.requireNonNull(entry);
        Map.Entry entry2 = entry;
        return of(entry2.getKey(), entry2.getValue());
    }

    private static <K extends Enum<K>, V> ImmutableMap<K, V> copyOfEnumMap(EnumMap<K, ? extends V> enumMap) {
        EnumMap enumMap2 = new EnumMap((EnumMap) enumMap);
        for (Map.Entry<K, V> entry : enumMap2.entrySet()) {
            CollectPreconditions.checkEntryNotNull(entry.getKey(), entry.getValue());
        }
        return ImmutableEnumMap.asImmutable(enumMap2);
    }

    public static <K, V> Map.Entry<K, V> entryOf(K k, V v) {
        return new ImmutableMapEntry(k, v);
    }

    public static <K, V> ImmutableMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9, K k10, V v10) {
        return RegularImmutableMap.fromEntries(entryOf(k, v), entryOf(k2, v2), entryOf(k3, v3), entryOf(k4, v4), entryOf(k5, v5), entryOf(k6, v6), entryOf(k7, v7), entryOf(k8, v8), entryOf(k9, v9), entryOf(k10, v10));
    }

    @SafeVarargs
    public static <K, V> ImmutableMap<K, V> ofEntries(Map.Entry<? extends K, ? extends V>... entryArr) {
        return RegularImmutableMap.fromEntries(entryArr);
    }

    public static <T, K, V> Collector<T, ?, ImmutableMap<K, V>> toImmutableMap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        return CollectCollectors.toImmutableMap(function, function2);
    }

    public ImmutableSetMultimap<K, V> asMultimap() {
        if (isEmpty()) {
            return ImmutableSetMultimap.of();
        }
        ImmutableSetMultimap<K, V> immutableSetMultimap = this.multimapView;
        if (immutableSetMultimap != null) {
            return immutableSetMultimap;
        }
        ImmutableSetMultimap<K, V> immutableSetMultimap2 = new ImmutableSetMultimap<>(new MapViewOfValuesAsSingletonSets(), size(), null);
        this.multimapView = immutableSetMultimap2;
        return immutableSetMultimap2;
    }

    @Override // java.util.Map
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final V compute(K k, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final V computeIfAbsent(K k, Function<? super K, ? extends V> function) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final V computeIfPresent(K k, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(@CheckForNull Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(@CheckForNull Object obj) {
        return values().contains(obj);
    }

    public abstract ImmutableSet<Map.Entry<K, V>> createEntrySet();

    public abstract ImmutableSet<K> createKeySet();

    public abstract ImmutableCollection<V> createValues();

    @Override // java.util.Map
    public ImmutableSet<Map.Entry<K, V>> entrySet() {
        ImmutableSet<Map.Entry<K, V>> immutableSet = this.entrySet;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<Map.Entry<K, V>> createEntrySet = createEntrySet();
        this.entrySet = createEntrySet;
        return createEntrySet;
    }

    @Override // java.util.Map
    public boolean equals(@CheckForNull Object obj) {
        return Maps.equalsImpl(this, obj);
    }

    @Override // java.util.Map
    @CheckForNull
    public abstract V get(@CheckForNull Object obj);

    @Override // java.util.Map
    @CheckForNull
    public final V getOrDefault(@CheckForNull Object obj, @CheckForNull V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    @Override // java.util.Map
    public int hashCode() {
        return Sets.hashCodeImpl(entrySet());
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean isHashCodeFast() {
        return false;
    }

    public abstract boolean isPartialView();

    public UnmodifiableIterator<K> keyIterator() {
        final UnmodifiableIterator<Map.Entry<K, V>> it2 = entrySet().iterator();
        return new UnmodifiableIterator<K>(this) { // from class: com.amazon.coral.google.common.collect.ImmutableMap.1
            @Override // java.util.Iterator
            public boolean hasNext() {
                return it2.hasNext();
            }

            @Override // java.util.Iterator
            public K next() {
                return (K) ((Map.Entry) it2.next()).getKey();
            }
        };
    }

    @Override // java.util.Map
    public ImmutableSet<K> keySet() {
        ImmutableSet<K> immutableSet = this.keySet;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<K> createKeySet = createKeySet();
        this.keySet = createKeySet;
        return createKeySet;
    }

    public Spliterator<K> keySpliterator() {
        return CollectSpliterators.map(entrySet().spliterator(), new Iterables$1$$ExternalSyntheticLambda1(27));
    }

    @Override // java.util.Map
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final V merge(K k, V v, BiFunction<? super V, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @CheckForNull
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @CheckForNull
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final V putIfAbsent(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @CheckForNull
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final V remove(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean replace(K k, V v, V v2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void replaceAll(BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return Maps.toStringImpl(this);
    }

    @Override // java.util.Map, com.amazon.coral.google.common.collect.BiMap
    public ImmutableCollection<V> values() {
        ImmutableCollection<V> immutableCollection = this.values;
        if (immutableCollection != null) {
            return immutableCollection;
        }
        ImmutableCollection<V> createValues = createValues();
        this.values = createValues;
        return createValues;
    }

    public Object writeReplace() {
        return new SerializedForm(this);
    }

    public static <T, K, V> Collector<T, ?, ImmutableMap<K, V>> toImmutableMap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, BinaryOperator<V> binaryOperator) {
        return CollectCollectors.toImmutableMap(function, function2, binaryOperator);
    }

    @Override // java.util.Map
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean remove(@CheckForNull Object obj, @CheckForNull Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @CheckForNull
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final V replace(K k, V v) {
        throw new UnsupportedOperationException();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @DoNotMock
    public static class Builder<K, V> {
        Map.Entry<K, V>[] entries;
        boolean entriesUsed;
        int size;

        @CheckForNull
        Comparator<? super V> valueComparator;

        public Builder(int i) {
            this.entries = new Map.Entry[i];
            this.size = 0;
            this.entriesUsed = false;
        }

        private ImmutableMap<K, V> build(boolean z) {
            Map.Entry<K, V>[] entryArr;
            int i = this.size;
            if (i == 0) {
                return ImmutableMap.of();
            }
            if (i == 1) {
                Map.Entry<K, V> entry = this.entries[0];
                Objects.requireNonNull(entry);
                Map.Entry<K, V> entry2 = entry;
                return ImmutableMap.of((Object) entry2.getKey(), (Object) entry2.getValue());
            }
            if (this.valueComparator == null) {
                entryArr = this.entries;
            } else {
                if (this.entriesUsed) {
                    this.entries = (Map.Entry[]) Arrays.copyOf(this.entries, i);
                }
                Map.Entry<K, V>[] entryArr2 = this.entries;
                if (!z) {
                    Map.Entry<K, V>[] lastEntryForEachKey = lastEntryForEachKey(entryArr2, this.size);
                    entryArr2 = lastEntryForEachKey;
                    i = lastEntryForEachKey.length;
                }
                Arrays.sort(entryArr2, 0, i, Ordering.from(this.valueComparator).onResultOf(Maps.valueFunction()));
                entryArr = entryArr2;
            }
            this.entriesUsed = true;
            return RegularImmutableMap.fromEntryArray(i, entryArr, z);
        }

        private void ensureCapacity(int i) {
            Map.Entry<K, V>[] entryArr = this.entries;
            if (i > entryArr.length) {
                this.entries = (Map.Entry[]) Arrays.copyOf(entryArr, ImmutableCollection.Builder.expandedCapacity(entryArr.length, i));
                this.entriesUsed = false;
            }
        }

        private static <K, V> Map.Entry<K, V>[] lastEntryForEachKey(Map.Entry<K, V>[] entryArr, int i) {
            HashSet hashSet = new HashSet();
            BitSet bitSet = new BitSet();
            for (int i2 = i - 1; i2 >= 0; i2--) {
                if (!hashSet.add(entryArr[i2].getKey())) {
                    bitSet.set(i2);
                }
            }
            if (bitSet.isEmpty()) {
                return entryArr;
            }
            Map.Entry<K, V>[] entryArr2 = new Map.Entry[i - bitSet.cardinality()];
            int i3 = 0;
            for (int i4 = 0; i4 < i; i4++) {
                if (!bitSet.get(i4)) {
                    entryArr2[i3] = entryArr[i4];
                    i3++;
                }
            }
            return entryArr2;
        }

        @VisibleForTesting
        public ImmutableMap<K, V> buildJdkBacked() {
            Preconditions.checkState(this.valueComparator == null, "buildJdkBacked is only for testing; can't use valueComparator");
            int i = this.size;
            if (i == 0) {
                return ImmutableMap.of();
            }
            if (i != 1) {
                this.entriesUsed = true;
                return JdkBackedImmutableMap.create(i, this.entries, true);
            }
            Map.Entry<K, V> entry = this.entries[0];
            Objects.requireNonNull(entry);
            Map.Entry<K, V> entry2 = entry;
            return ImmutableMap.of((Object) entry2.getKey(), (Object) entry2.getValue());
        }

        public ImmutableMap<K, V> buildKeepingLast() {
            return build(false);
        }

        public ImmutableMap<K, V> buildOrThrow() {
            return build(true);
        }

        @CanIgnoreReturnValue
        public Builder<K, V> combine(Builder<K, V> builder) {
            Preconditions.checkNotNull(builder);
            ensureCapacity(this.size + builder.size);
            System.arraycopy(builder.entries, 0, this.entries, this.size, builder.size);
            this.size += builder.size;
            return this;
        }

        @Beta
        @CanIgnoreReturnValue
        public Builder<K, V> orderEntriesByValue(Comparator<? super V> comparator) {
            Preconditions.checkState(this.valueComparator == null, "valueComparator was already set");
            this.valueComparator = (Comparator) Preconditions.checkNotNull(comparator, "valueComparator");
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<K, V> put(K k, V v) {
            ensureCapacity(this.size + 1);
            Map.Entry<K, V> entryOf = ImmutableMap.entryOf(k, v);
            Map.Entry<K, V>[] entryArr = this.entries;
            int i = this.size;
            this.size = i + 1;
            entryArr[i] = entryOf;
            return this;
        }

        @Beta
        @CanIgnoreReturnValue
        public Builder<K, V> putAll(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                ensureCapacity(((Collection) iterable).size() + this.size);
            }
            Iterator<? extends Map.Entry<? extends K, ? extends V>> it2 = iterable.iterator();
            while (it2.hasNext()) {
                put(it2.next());
            }
            return this;
        }

        public Builder() {
            this(4);
        }

        @CanIgnoreReturnValue
        public Builder<K, V> put(Map.Entry<? extends K, ? extends V> entry) {
            return put(entry.getKey(), entry.getValue());
        }

        @CanIgnoreReturnValue
        public Builder<K, V> putAll(Map<? extends K, ? extends V> map) {
            return putAll(map.entrySet());
        }

        public ImmutableMap<K, V> build() {
            return buildOrThrow();
        }
    }

    public static <K, V> ImmutableMap<K, V> copyOf(Map<? extends K, ? extends V> map) {
        if ((map instanceof ImmutableMap) && !(map instanceof SortedMap)) {
            ImmutableMap<K, V> immutableMap = (ImmutableMap) map;
            if (!immutableMap.isPartialView()) {
                return immutableMap;
            }
        } else if (map instanceof EnumMap) {
            return copyOfEnumMap((EnumMap) map);
        }
        return copyOf(map.entrySet());
    }

    public static <K, V> ImmutableMap<K, V> of(K k, V v) {
        return ImmutableBiMap.of((Object) k, (Object) v);
    }

    public static <K, V> ImmutableMap<K, V> of(K k, V v, K k2, V v2) {
        return RegularImmutableMap.fromEntries(entryOf(k, v), entryOf(k2, v2));
    }

    public static <K, V> ImmutableMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3) {
        return RegularImmutableMap.fromEntries(entryOf(k, v), entryOf(k2, v2), entryOf(k3, v3));
    }

    public static <K, V> ImmutableMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        return RegularImmutableMap.fromEntries(entryOf(k, v), entryOf(k2, v2), entryOf(k3, v3), entryOf(k4, v4));
    }

    public static <K, V> ImmutableMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        return RegularImmutableMap.fromEntries(entryOf(k, v), entryOf(k2, v2), entryOf(k3, v3), entryOf(k4, v4), entryOf(k5, v5));
    }

    public static <K, V> ImmutableMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
        return RegularImmutableMap.fromEntries(entryOf(k, v), entryOf(k2, v2), entryOf(k3, v3), entryOf(k4, v4), entryOf(k5, v5), entryOf(k6, v6));
    }

    public static <K, V> ImmutableMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7) {
        return RegularImmutableMap.fromEntries(entryOf(k, v), entryOf(k2, v2), entryOf(k3, v3), entryOf(k4, v4), entryOf(k5, v5), entryOf(k6, v6), entryOf(k7, v7));
    }

    public static <K, V> ImmutableMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8) {
        return RegularImmutableMap.fromEntries(entryOf(k, v), entryOf(k2, v2), entryOf(k3, v3), entryOf(k4, v4), entryOf(k5, v5), entryOf(k6, v6), entryOf(k7, v7), entryOf(k8, v8));
    }

    public static <K, V> ImmutableMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9) {
        return RegularImmutableMap.fromEntries(entryOf(k, v), entryOf(k2, v2), entryOf(k3, v3), entryOf(k4, v4), entryOf(k5, v5), entryOf(k6, v6), entryOf(k7, v7), entryOf(k8, v8), entryOf(k9, v9));
    }

    public static <K, V> ImmutableMap<K, V> of() {
        return (ImmutableMap<K, V>) RegularImmutableMap.EMPTY;
    }
}
