package autovalue.shaded.com.google.common.collect;

import autovalue.shaded.com.google.common.annotations.GwtCompatible;
import autovalue.shaded.com.google.common.base.Preconditions;
import autovalue.shaded.com.google.common.collect.Multimaps;
import autovalue.shaded.com.google.errorprone.annotations.CanIgnoreReturnValue;
import autovalue.shaded.com.google.errorprone.annotations.concurrent.LazyInit;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Spliterator;
import java.util.Spliterators;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes15.dex */
abstract class AbstractMultimap<K, V> implements Multimap<K, V> {

    @LazyInit
    @CheckForNull
    private transient Map<K, Collection<V>> asMap;

    @LazyInit
    @CheckForNull
    private transient Collection<Map.Entry<K, V>> entries;

    @LazyInit
    @CheckForNull
    private transient Set<K> keySet;

    @LazyInit
    @CheckForNull
    private transient Multiset<K> keys;

    @LazyInit
    @CheckForNull
    private transient Collection<V> values;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class Entries extends Multimaps.Entries<K, V> {
        public Entries() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return AbstractMultimap.this.entryIterator();
        }

        @Override // autovalue.shaded.com.google.common.collect.Multimaps.Entries
        public Multimap<K, V> multimap() {
            return AbstractMultimap.this;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Spliterator<Map.Entry<K, V>> spliterator() {
            return AbstractMultimap.this.entrySpliterator();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class EntrySet extends AbstractMultimap<K, V>.Entries implements Set<Map.Entry<K, V>> {
        public EntrySet(AbstractMultimap abstractMultimap) {
            super();
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(@CheckForNull Object obj) {
            return Sets.equalsImpl(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return Sets.hashCodeImpl(this);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class Values extends AbstractCollection<V> {
        public Values() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            AbstractMultimap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@CheckForNull Object obj) {
            return AbstractMultimap.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return AbstractMultimap.this.valueIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return AbstractMultimap.this.size();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Spliterator<V> spliterator() {
            return AbstractMultimap.this.valueSpliterator();
        }
    }

    @Override // autovalue.shaded.com.google.common.collect.Multimap, autovalue.shaded.com.google.common.collect.ListMultimap
    public Map<K, Collection<V>> asMap() {
        Map<K, Collection<V>> map = this.asMap;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> createAsMap = createAsMap();
        this.asMap = createAsMap;
        return createAsMap;
    }

    @Override // autovalue.shaded.com.google.common.collect.Multimap
    public boolean containsEntry(@CheckForNull Object obj, @CheckForNull Object obj2) {
        Collection<V> collection = asMap().get(obj);
        return collection != null && collection.contains(obj2);
    }

    @Override // autovalue.shaded.com.google.common.collect.Multimap
    public boolean containsValue(@CheckForNull Object obj) {
        Iterator<Collection<V>> it2 = asMap().values().iterator();
        while (it2.hasNext()) {
            if (it2.next().contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public abstract Map<K, Collection<V>> createAsMap();

    public abstract Collection<Map.Entry<K, V>> createEntries();

    public abstract Set<K> createKeySet();

    public abstract Multiset<K> createKeys();

    public abstract Collection<V> createValues();

    @Override // autovalue.shaded.com.google.common.collect.Multimap
    public Collection<Map.Entry<K, V>> entries() {
        Collection<Map.Entry<K, V>> collection = this.entries;
        if (collection != null) {
            return collection;
        }
        Collection<Map.Entry<K, V>> createEntries = createEntries();
        this.entries = createEntries;
        return createEntries;
    }

    public abstract Iterator<Map.Entry<K, V>> entryIterator();

    public Spliterator<Map.Entry<K, V>> entrySpliterator() {
        return Spliterators.spliterator(entryIterator(), size(), this instanceof SetMultimap ? 1 : 0);
    }

    @Override // autovalue.shaded.com.google.common.collect.Multimap, autovalue.shaded.com.google.common.collect.ListMultimap
    public boolean equals(@CheckForNull Object obj) {
        return Multimaps.equalsImpl(this, obj);
    }

    @Override // autovalue.shaded.com.google.common.collect.Multimap
    public int hashCode() {
        return asMap().hashCode();
    }

    @Override // autovalue.shaded.com.google.common.collect.Multimap
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // autovalue.shaded.com.google.common.collect.Multimap
    public Set<K> keySet() {
        Set<K> set = this.keySet;
        if (set != null) {
            return set;
        }
        Set<K> createKeySet = createKeySet();
        this.keySet = createKeySet;
        return createKeySet;
    }

    @Override // autovalue.shaded.com.google.common.collect.Multimap
    public Multiset<K> keys() {
        Multiset<K> multiset = this.keys;
        if (multiset != null) {
            return multiset;
        }
        Multiset<K> createKeys = createKeys();
        this.keys = createKeys;
        return createKeys;
    }

    @Override // autovalue.shaded.com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public boolean put(@ParametricNullness K k, @ParametricNullness V v) {
        return get(k).add(v);
    }

    @Override // autovalue.shaded.com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public boolean putAll(@ParametricNullness K k, Iterable<? extends V> iterable) {
        Preconditions.checkNotNull(iterable);
        if (iterable instanceof Collection) {
            Collection<? extends V> collection = (Collection) iterable;
            return !collection.isEmpty() && get(k).addAll(collection);
        }
        Iterator<? extends V> it2 = iterable.iterator();
        return it2.hasNext() && Iterators.addAll(get(k), it2);
    }

    @Override // autovalue.shaded.com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public boolean remove(@CheckForNull Object obj, @CheckForNull Object obj2) {
        Collection<V> collection = asMap().get(obj);
        return collection != null && collection.remove(obj2);
    }

    @Override // autovalue.shaded.com.google.common.collect.Multimap, autovalue.shaded.com.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    public Collection<V> replaceValues(@ParametricNullness K k, Iterable<? extends V> iterable) {
        Preconditions.checkNotNull(iterable);
        Collection<V> removeAll = removeAll(k);
        putAll(k, iterable);
        return removeAll;
    }

    public String toString() {
        return asMap().toString();
    }

    public Iterator<V> valueIterator() {
        return Maps.valueIterator(entries().iterator());
    }

    public Spliterator<V> valueSpliterator() {
        return Spliterators.spliterator(valueIterator(), size(), 0);
    }

    @Override // autovalue.shaded.com.google.common.collect.Multimap
    public Collection<V> values() {
        Collection<V> collection = this.values;
        if (collection != null) {
            return collection;
        }
        Collection<V> createValues = createValues();
        this.values = createValues;
        return createValues;
    }

    @Override // autovalue.shaded.com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public boolean putAll(Multimap<? extends K, ? extends V> multimap) {
        boolean z = false;
        for (Map.Entry<? extends K, ? extends V> entry : multimap.entries()) {
            z |= put(entry.getKey(), entry.getValue());
        }
        return z;
    }
}
