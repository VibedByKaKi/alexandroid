package com.amazon.coral.util;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.Path$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class FastHashMap<K, V> extends AbstractMap<K, V> {
    private static final HashFunctor<Object> DEFAULT_HASH_FUNCTOR = new DefaultHashFunctor();
    protected static final int DEFAULT_INITIAL_CAPACITY = 32;
    protected static final float DEFAULT_LOAD_FACTOR = 1.25f;
    private static final int MAXIMUM_CAPACITY = 1073741824;
    private final Set<Map.Entry<K, V>> entryView;
    private final HashFunctor<K> functor;
    private float loadFactor;
    private int size;
    private Entry[] table;
    private int threshold;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Entry<K, V> implements Map.Entry<K, V> {
        int hash;
        final K key;
        Entry<K, V> next;
        V value;

        public Entry(K k, V v, int i, Entry<K, V> entry) {
            if (k == null) {
                Path$$ExternalSyntheticBUOutline0.m();
                throw null;
            }
            this.key = k;
            this.next = entry;
            this.hash = i;
            setValue(v);
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.key;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.value;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2 = this.value;
            this.value = v;
            return v2;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class EntryIterator implements Iterator<Map.Entry<K, V>> {
        private int index = 0;
        private Entry<K, V> next;

        public EntryIterator() {
            fetch();
        }

        private void fetch() {
            Entry<K, V> entry = this.next;
            while (this.index < FastHashMap.this.table.length) {
                entry = entry == null ? FastHashMap.this.table[this.index] : entry.next;
                if (entry != null) {
                    break;
                } else {
                    this.index++;
                }
            }
            this.next = entry;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.next != null;
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            Entry<K, V> entry = this.next;
            fetch();
            return entry;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class EntrySet extends AbstractSet<Map.Entry<K, V>> {
        private EntrySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Entry findEntry = FastHashMap.this.findEntry(entry.getKey());
            if (findEntry == null) {
                return false;
            }
            Object value = entry.getValue();
            Object value2 = findEntry.getValue();
            if (value != value2) {
                return (value == null || value2 == null || !value.equals(value2)) ? false : true;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new EntryIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return FastHashMap.this.size;
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
            Iterator<Map.Entry<K, V>> it2 = iterator();
            while (it2.hasNext()) {
                Map.Entry<K, V> next = it2.next();
                sb.append(next.getKey());
                sb.append('=');
                sb.append(next.getValue());
                sb.append(AbstractJsonLexerKt.COMMA);
            }
            if (size() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
            sb.append(AbstractJsonLexerKt.END_OBJ);
            return sb.toString();
        }
    }

    public FastHashMap(HashFunctor<K> hashFunctor, int i, float f, boolean z) {
        this.entryView = new EntrySet();
        if (hashFunctor == null) {
            Path$$ExternalSyntheticBUOutline0.m();
            throw null;
        }
        if (i < 0) {
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "Illegal initial capacity: "));
            throw null;
        }
        i = i > 1073741824 ? 1073741824 : i;
        if (f <= 0.0f || Float.isNaN(f)) {
            Single$$ExternalSyntheticBUOutline0.m$3(ArcMode$$ExternalSyntheticOutline0.m("Illegal load factor: ", f));
            throw null;
        }
        int i2 = 1;
        while (i2 < i) {
            i2 <<= 1;
        }
        this.loadFactor = f;
        this.threshold = !z ? (int) (i2 * f) : Integer.MAX_VALUE;
        this.table = new Entry[i2];
        this.functor = hashFunctor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Entry<K, V> findEntry(K k) {
        if (k == null) {
            Path$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        int hashOf = hashOf(k);
        for (Entry<K, V> entry = this.table[indexOf(k, hashOf)]; entry != null; entry = entry.next) {
            if (entry.hash == hashOf && this.functor.equals(k, entry.key)) {
                return entry;
            }
        }
        return null;
    }

    private int hashOf(K k) {
        return this.functor.hashCode(k);
    }

    private int indexOf(K k, int i) {
        return (this.table.length - 1) & i;
    }

    private void rebalance() {
        Entry<K, V>[] entryArr = this.table;
        if (entryArr.length == 1073741824) {
            return;
        }
        this.table = new Entry[entryArr.length * 4];
        for (Entry<K, V> entry : entryArr) {
            while (entry != null) {
                Entry<K, V> entry2 = entry.next;
                int indexOf = indexOf(entry.key, hashOf(entry.key));
                Entry<K, V>[] entryArr2 = this.table;
                entry.next = entryArr2[indexOf];
                entryArr2[indexOf] = entry;
                entry = entry2;
            }
        }
        this.threshold = (int) (this.table.length * this.loadFactor);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.table, (Object) null);
        this.size = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return findEntry(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return this.entryView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Entry<K, V> findEntry = findEntry(obj);
        if (findEntry != null) {
            return findEntry.getValue();
        }
        return null;
    }

    public List<Number> getCollisionStatistics() {
        ArrayList arrayList = new ArrayList(this.table.length);
        int i = 0;
        while (true) {
            Entry<K, V>[] entryArr = this.table;
            if (i >= entryArr.length) {
                return arrayList;
            }
            int i2 = 0;
            for (Entry<K, V> entry = entryArr[i]; entry != null; entry = entry.next) {
                i2++;
            }
            i = DoubleList$$ExternalSyntheticOutline0.m(i2, arrayList, i, 1);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        if (k == null) {
            Path$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        int hashOf = hashOf(k);
        int indexOf = indexOf(k, hashOf);
        for (Entry<K, V> entry = this.table[indexOf]; entry != null; entry = entry.next) {
            if (entry.hash == hashOf && this.functor.equals(k, entry.key)) {
                return entry.setValue(v);
            }
        }
        this.table[indexOf] = new Entry(k, v, hashOf, this.table[indexOf]);
        int i = this.size;
        this.size = i + 1;
        if (i < this.threshold) {
            return null;
        }
        rebalance();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        if (obj == 0) {
            Path$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        int hashOf = hashOf(obj);
        int indexOf = indexOf(obj, hashOf);
        Entry<K, V> entry = null;
        for (Entry<K, V> entry2 = this.table[indexOf]; entry2 != null; entry2 = entry2.next) {
            if (entry2.hash == hashOf && this.functor.equals(obj, entry2.key)) {
                if (entry == null) {
                    this.table[indexOf] = entry2.next;
                } else {
                    entry.next = entry2.next;
                }
                this.size--;
                return entry2.getValue();
            }
            entry = entry2;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.size;
    }

    @Override // java.util.AbstractMap
    public String toString() {
        return entrySet().toString();
    }

    public FastHashMap(boolean z) {
        this(DEFAULT_HASH_FUNCTOR, 32, DEFAULT_LOAD_FACTOR, z);
    }

    public FastHashMap(HashFunctor<K> hashFunctor) {
        this(hashFunctor, 32, DEFAULT_LOAD_FACTOR);
    }

    public FastHashMap(HashFunctor<K> hashFunctor, boolean z) {
        this(hashFunctor, 32, DEFAULT_LOAD_FACTOR, z);
    }

    public FastHashMap(int i) {
        this(i, DEFAULT_LOAD_FACTOR);
    }

    public FastHashMap(int i, float f) {
        this(DEFAULT_HASH_FUNCTOR, i, f);
    }

    public FastHashMap(HashFunctor<K> hashFunctor, int i, float f) {
        this(hashFunctor, i, f, true);
    }

    public FastHashMap() {
        this(DEFAULT_HASH_FUNCTOR, 32, DEFAULT_LOAD_FACTOR);
    }
}
