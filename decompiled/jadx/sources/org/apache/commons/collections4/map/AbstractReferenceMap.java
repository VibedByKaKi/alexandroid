package org.apache.commons.collections4.map;

import ai.onnxruntime.OnnxMap$$ExternalSyntheticBUOutline0;
import com.here.time.Duration$$ExternalSyntheticBUOutline0;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.apache.commons.collections4.MapIterator;
import org.apache.commons.collections4.keyvalue.DefaultMapEntry;
import org.apache.commons.collections4.map.AbstractHashedMap;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public abstract class AbstractReferenceMap<K, V> extends AbstractHashedMap<K, V> {
    private ReferenceStrength keyType;
    private boolean purgeValues;
    private transient ReferenceQueue<Object> queue;
    private ReferenceStrength valueType;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ReferenceBaseIterator<K, V> {
        K currentKey;
        V currentValue;
        ReferenceEntry<K, V> entry;
        int expectedModCount;
        int index;
        K nextKey;
        V nextValue;
        final AbstractReferenceMap<K, V> parent;
        ReferenceEntry<K, V> previous;

        public ReferenceBaseIterator(AbstractReferenceMap<K, V> abstractReferenceMap) {
            this.parent = abstractReferenceMap;
            this.index = abstractReferenceMap.size() != 0 ? abstractReferenceMap.data.length : 0;
            this.expectedModCount = abstractReferenceMap.modCount;
        }

        private void checkMod() {
            if (this.parent.modCount == this.expectedModCount) {
                return;
            }
            OnnxMap$$ExternalSyntheticBUOutline0.m9m();
        }

        private boolean nextNull() {
            return this.nextKey == null || this.nextValue == null;
        }

        public ReferenceEntry<K, V> currentEntry() {
            checkMod();
            return this.previous;
        }

        public boolean hasNext() {
            checkMod();
            while (nextNull()) {
                ReferenceEntry<K, V> referenceEntry = this.entry;
                int i = this.index;
                while (referenceEntry == null && i > 0) {
                    i--;
                    referenceEntry = (ReferenceEntry) this.parent.data[i];
                }
                this.entry = referenceEntry;
                this.index = i;
                if (referenceEntry == null) {
                    this.currentKey = null;
                    this.currentValue = null;
                    return false;
                }
                this.nextKey = referenceEntry.getKey();
                this.nextValue = referenceEntry.getValue();
                if (nextNull()) {
                    this.entry = this.entry.next();
                }
            }
            return true;
        }

        public ReferenceEntry<K, V> nextEntry() {
            checkMod();
            if (nextNull() && !hasNext()) {
                Single$$ExternalSyntheticBUOutline0.m();
                return null;
            }
            ReferenceEntry<K, V> referenceEntry = this.entry;
            this.previous = referenceEntry;
            this.entry = referenceEntry.next();
            this.currentKey = this.nextKey;
            this.currentValue = this.nextValue;
            this.nextKey = null;
            this.nextValue = null;
            return this.previous;
        }

        public void remove() {
            checkMod();
            if (this.previous == null) {
                Duration$$ExternalSyntheticBUOutline0.m$1();
                return;
            }
            this.parent.remove(this.currentKey);
            this.previous = null;
            this.currentKey = null;
            this.currentValue = null;
            this.expectedModCount = this.parent.modCount;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ReferenceKeySetIterator<K> extends ReferenceBaseIterator<K, Object> implements Iterator<K> {
        public ReferenceKeySetIterator(AbstractReferenceMap<K, ?> abstractReferenceMap) {
            super(abstractReferenceMap);
        }

        @Override // java.util.Iterator
        public K next() {
            return nextEntry().getKey();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ReferenceMapIterator<K, V> extends ReferenceBaseIterator<K, V> implements MapIterator<K, V> {
        public ReferenceMapIterator(AbstractReferenceMap<K, V> abstractReferenceMap) {
            super(abstractReferenceMap);
        }

        @Override // org.apache.commons.collections4.MapIterator
        public K getKey() {
            ReferenceEntry<K, V> currentEntry = currentEntry();
            if (currentEntry != null) {
                return currentEntry.getKey();
            }
            Single$$ExternalSyntheticBUOutline0.m$2("getKey() can only be called after next() and before remove()");
            return null;
        }

        @Override // org.apache.commons.collections4.MapIterator
        public V getValue() {
            ReferenceEntry<K, V> currentEntry = currentEntry();
            if (currentEntry != null) {
                return currentEntry.getValue();
            }
            Single$$ExternalSyntheticBUOutline0.m$2("getValue() can only be called after next() and before remove()");
            return null;
        }

        @Override // org.apache.commons.collections4.MapIterator, java.util.Iterator
        public K next() {
            return nextEntry().getKey();
        }

        @Override // org.apache.commons.collections4.MapIterator
        public V setValue(V v) {
            ReferenceEntry<K, V> currentEntry = currentEntry();
            if (currentEntry != null) {
                return currentEntry.setValue(v);
            }
            Single$$ExternalSyntheticBUOutline0.m$2("setValue() can only be called after next() and before remove()");
            return null;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum ReferenceStrength {
        HARD(0),
        SOFT(1),
        WEAK(2);

        public final int value;

        ReferenceStrength(int i) {
            this.value = i;
        }

        public static ReferenceStrength resolve(int i) {
            if (i == 0) {
                return HARD;
            }
            if (i == 1) {
                return SOFT;
            }
            if (i == 2) {
                return WEAK;
            }
            Path$$ExternalSyntheticBUOutline0.m();
            return null;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ReferenceValuesIterator<V> extends ReferenceBaseIterator<Object, V> implements Iterator<V> {
        public ReferenceValuesIterator(AbstractReferenceMap<?, V> abstractReferenceMap) {
            super(abstractReferenceMap);
        }

        @Override // java.util.Iterator
        public V next() {
            return nextEntry().getValue();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class SoftRef<T> extends SoftReference<T> {
        private final int hash;

        public SoftRef(int i, T t, ReferenceQueue<? super T> referenceQueue) {
            super(t, referenceQueue);
            this.hash = i;
        }

        public int hashCode() {
            return this.hash;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class WeakRef<T> extends WeakReference<T> {
        private final int hash;

        public WeakRef(int i, T t, ReferenceQueue<? super T> referenceQueue) {
            super(t, referenceQueue);
            this.hash = i;
        }

        public int hashCode() {
            return this.hash;
        }
    }

    public AbstractReferenceMap(ReferenceStrength referenceStrength, ReferenceStrength referenceStrength2, int i, float f, boolean z) {
        super(i, f);
        this.keyType = referenceStrength;
        this.valueType = referenceStrength2;
        this.purgeValues = z;
    }

    @Override // org.apache.commons.collections4.map.AbstractHashedMap, java.util.AbstractMap, java.util.Map, org.apache.commons.collections4.Put
    public void clear() {
        super.clear();
        while (this.queue.poll() != null) {
        }
    }

    @Override // org.apache.commons.collections4.map.AbstractHashedMap, java.util.AbstractMap, java.util.Map, org.apache.commons.collections4.Get
    public boolean containsKey(Object obj) {
        purgeBeforeRead();
        AbstractHashedMap.HashEntry<K, V> entry = getEntry(obj);
        return (entry == null || entry.getValue() == null) ? false : true;
    }

    @Override // org.apache.commons.collections4.map.AbstractHashedMap, java.util.AbstractMap, java.util.Map, org.apache.commons.collections4.Get
    public boolean containsValue(Object obj) {
        purgeBeforeRead();
        if (obj == null) {
            return false;
        }
        return super.containsValue(obj);
    }

    @Override // org.apache.commons.collections4.map.AbstractHashedMap
    public ReferenceEntry<K, V> createEntry(AbstractHashedMap.HashEntry<K, V> hashEntry, int i, K k, V v) {
        return new ReferenceEntry<>(this, hashEntry, i, k, v);
    }

    @Override // org.apache.commons.collections4.map.AbstractHashedMap
    public Iterator<Map.Entry<K, V>> createEntrySetIterator() {
        return new ReferenceEntrySetIterator(this);
    }

    @Override // org.apache.commons.collections4.map.AbstractHashedMap
    public Iterator<K> createKeySetIterator() {
        return new ReferenceKeySetIterator(this);
    }

    @Override // org.apache.commons.collections4.map.AbstractHashedMap
    public Iterator<V> createValuesIterator() {
        return new ReferenceValuesIterator(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.apache.commons.collections4.map.AbstractHashedMap
    public void doReadObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        this.keyType = ReferenceStrength.resolve(objectInputStream.readInt());
        this.valueType = ReferenceStrength.resolve(objectInputStream.readInt());
        this.purgeValues = objectInputStream.readBoolean();
        this.loadFactor = objectInputStream.readFloat();
        int readInt = objectInputStream.readInt();
        init();
        AbstractHashedMap.HashEntry<K, V>[] hashEntryArr = new AbstractHashedMap.HashEntry[readInt];
        this.data = hashEntryArr;
        this.threshold = calculateThreshold(hashEntryArr.length, this.loadFactor);
        while (true) {
            Object readObject = objectInputStream.readObject();
            if (readObject == null) {
                return;
            } else {
                put(readObject, objectInputStream.readObject());
            }
        }
    }

    @Override // org.apache.commons.collections4.map.AbstractHashedMap
    public void doWriteObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.keyType.value);
        objectOutputStream.writeInt(this.valueType.value);
        objectOutputStream.writeBoolean(this.purgeValues);
        objectOutputStream.writeFloat(this.loadFactor);
        objectOutputStream.writeInt(this.data.length);
        MapIterator<K, V> mapIterator = mapIterator();
        while (mapIterator.hasNext()) {
            objectOutputStream.writeObject(mapIterator.next());
            objectOutputStream.writeObject(mapIterator.getValue());
        }
        objectOutputStream.writeObject(null);
    }

    @Override // org.apache.commons.collections4.map.AbstractHashedMap, java.util.AbstractMap, java.util.Map, org.apache.commons.collections4.Get
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.entrySet == null) {
            this.entrySet = new ReferenceEntrySet(this);
        }
        return this.entrySet;
    }

    @Override // org.apache.commons.collections4.map.AbstractHashedMap, java.util.AbstractMap, java.util.Map, org.apache.commons.collections4.Get
    public V get(Object obj) {
        purgeBeforeRead();
        AbstractHashedMap.HashEntry<K, V> entry = getEntry(obj);
        if (entry == null) {
            return null;
        }
        return entry.getValue();
    }

    @Override // org.apache.commons.collections4.map.AbstractHashedMap
    public AbstractHashedMap.HashEntry<K, V> getEntry(Object obj) {
        if (obj == null) {
            return null;
        }
        return super.getEntry(obj);
    }

    public int hashEntry(Object obj, Object obj2) {
        return (obj2 != null ? obj2.hashCode() : 0) ^ (obj == null ? 0 : obj.hashCode());
    }

    @Override // org.apache.commons.collections4.map.AbstractHashedMap
    public void init() {
        this.queue = new ReferenceQueue<>();
    }

    @Override // org.apache.commons.collections4.map.AbstractHashedMap, java.util.AbstractMap, java.util.Map, org.apache.commons.collections4.Get
    public boolean isEmpty() {
        purgeBeforeRead();
        return super.isEmpty();
    }

    @Override // org.apache.commons.collections4.map.AbstractHashedMap
    public boolean isEqualKey(Object obj, Object obj2) {
        if (this.keyType != ReferenceStrength.HARD) {
            obj2 = ((Reference) obj2).get();
        }
        return obj == obj2 || obj.equals(obj2);
    }

    public boolean isKeyType(ReferenceStrength referenceStrength) {
        return this.keyType == referenceStrength;
    }

    public boolean isValueType(ReferenceStrength referenceStrength) {
        return this.valueType == referenceStrength;
    }

    @Override // org.apache.commons.collections4.map.AbstractHashedMap, java.util.AbstractMap, java.util.Map, org.apache.commons.collections4.Get
    public Set<K> keySet() {
        if (this.keySet == null) {
            this.keySet = new ReferenceKeySet(this);
        }
        return this.keySet;
    }

    @Override // org.apache.commons.collections4.map.AbstractHashedMap, org.apache.commons.collections4.IterableGet
    public MapIterator<K, V> mapIterator() {
        return new ReferenceMapIterator(this);
    }

    public void purge(Reference<?> reference) {
        int hashIndex = hashIndex(reference.hashCode(), this.data.length);
        AbstractHashedMap.HashEntry<K, V> hashEntry = null;
        for (AbstractHashedMap.HashEntry<K, V> hashEntry2 = this.data[hashIndex]; hashEntry2 != null; hashEntry2 = hashEntry2.next) {
            ReferenceEntry referenceEntry = (ReferenceEntry) hashEntry2;
            if (referenceEntry.purge(reference)) {
                if (hashEntry == null) {
                    this.data[hashIndex] = hashEntry2.next;
                } else {
                    hashEntry.next = hashEntry2.next;
                }
                this.size--;
                referenceEntry.onPurge();
                return;
            }
            hashEntry = hashEntry2;
        }
    }

    public void purgeBeforeRead() {
        purge();
    }

    public void purgeBeforeWrite() {
        purge();
    }

    @Override // org.apache.commons.collections4.map.AbstractHashedMap, java.util.AbstractMap, java.util.Map, org.apache.commons.collections4.Put
    public V put(K k, V v) {
        if (k == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("null keys not allowed");
            return null;
        }
        if (v != null) {
            purgeBeforeWrite();
            return (V) super.put(k, v);
        }
        Single$$ExternalSyntheticBUOutline0.m$1("null values not allowed");
        return null;
    }

    @Override // org.apache.commons.collections4.map.AbstractHashedMap, java.util.AbstractMap, java.util.Map, org.apache.commons.collections4.Get
    public V remove(Object obj) {
        if (obj == null) {
            return null;
        }
        purgeBeforeWrite();
        return (V) super.remove(obj);
    }

    @Override // org.apache.commons.collections4.map.AbstractHashedMap, java.util.AbstractMap, java.util.Map, org.apache.commons.collections4.Get
    public int size() {
        purgeBeforeRead();
        return super.size();
    }

    @Override // org.apache.commons.collections4.map.AbstractHashedMap, java.util.AbstractMap, java.util.Map, org.apache.commons.collections4.Get
    public Collection<V> values() {
        if (this.values == null) {
            this.values = new ReferenceValues(this);
        }
        return this.values;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ReferenceEntrySetIterator<K, V> extends ReferenceBaseIterator<K, V> implements Iterator<Map.Entry<K, V>> {
        public ReferenceEntrySetIterator(AbstractReferenceMap<K, V> abstractReferenceMap) {
            super(abstractReferenceMap);
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            return nextEntry();
        }
    }

    public AbstractReferenceMap() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.apache.commons.collections4.map.AbstractHashedMap
    public /* bridge */ /* synthetic */ AbstractHashedMap.HashEntry createEntry(AbstractHashedMap.HashEntry hashEntry, int i, Object obj, Object obj2) {
        return createEntry((AbstractHashedMap.HashEntry<int, Object>) hashEntry, i, (int) obj, obj2);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ReferenceEntry<K, V> extends AbstractHashedMap.HashEntry<K, V> {
        private final AbstractReferenceMap<K, V> parent;

        public ReferenceEntry(AbstractReferenceMap<K, V> abstractReferenceMap, AbstractHashedMap.HashEntry<K, V> hashEntry, int i, K k, V v) {
            super(hashEntry, i, null, null);
            this.parent = abstractReferenceMap;
            this.key = toReference(((AbstractReferenceMap) abstractReferenceMap).keyType, k, i);
            this.value = toReference(((AbstractReferenceMap) abstractReferenceMap).valueType, v, i);
        }

        @Override // org.apache.commons.collections4.map.AbstractHashedMap.HashEntry, java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return key != null && value != null && this.parent.isEqualKey(key, this.key) && this.parent.isEqualValue(value, getValue());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.apache.commons.collections4.map.AbstractHashedMap.HashEntry, java.util.Map.Entry, org.apache.commons.collections4.KeyValue
        public K getKey() {
            ReferenceStrength referenceStrength = ((AbstractReferenceMap) this.parent).keyType;
            ReferenceStrength referenceStrength2 = ReferenceStrength.HARD;
            K k = (K) this.key;
            return referenceStrength == referenceStrength2 ? k : (K) ((Reference) k).get();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.apache.commons.collections4.map.AbstractHashedMap.HashEntry, java.util.Map.Entry, org.apache.commons.collections4.KeyValue
        public V getValue() {
            ReferenceStrength referenceStrength = ((AbstractReferenceMap) this.parent).valueType;
            ReferenceStrength referenceStrength2 = ReferenceStrength.HARD;
            V v = (V) this.value;
            return referenceStrength == referenceStrength2 ? v : (V) ((Reference) v).get();
        }

        @Override // org.apache.commons.collections4.map.AbstractHashedMap.HashEntry, java.util.Map.Entry
        public int hashCode() {
            return this.parent.hashEntry(getKey(), getValue());
        }

        public ReferenceEntry<K, V> next() {
            return (ReferenceEntry) this.next;
        }

        public void nullValue() {
            this.value = null;
        }

        public boolean purge(Reference<?> reference) {
            ReferenceStrength referenceStrength = ((AbstractReferenceMap) this.parent).keyType;
            ReferenceStrength referenceStrength2 = ReferenceStrength.HARD;
            boolean z = (referenceStrength != referenceStrength2 && this.key == reference) || (((AbstractReferenceMap) this.parent).valueType != referenceStrength2 && this.value == reference);
            if (z) {
                if (((AbstractReferenceMap) this.parent).keyType != referenceStrength2) {
                    ((Reference) this.key).clear();
                }
                if (((AbstractReferenceMap) this.parent).valueType != referenceStrength2) {
                    ((Reference) this.value).clear();
                    return z;
                }
                if (((AbstractReferenceMap) this.parent).purgeValues) {
                    nullValue();
                }
            }
            return z;
        }

        @Override // org.apache.commons.collections4.map.AbstractHashedMap.HashEntry, java.util.Map.Entry
        public V setValue(V v) {
            V value = getValue();
            if (((AbstractReferenceMap) this.parent).valueType != ReferenceStrength.HARD) {
                ((Reference) this.value).clear();
            }
            this.value = toReference(((AbstractReferenceMap) this.parent).valueType, v, this.hashCode);
            return value;
        }

        public <T> Object toReference(ReferenceStrength referenceStrength, T t, int i) {
            if (referenceStrength == ReferenceStrength.HARD) {
                return t;
            }
            if (referenceStrength == ReferenceStrength.SOFT) {
                return new SoftRef(i, t, ((AbstractReferenceMap) this.parent).queue);
            }
            if (referenceStrength == ReferenceStrength.WEAK) {
                return new WeakRef(i, t, ((AbstractReferenceMap) this.parent).queue);
            }
            throw new Error();
        }

        public void onPurge() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ReferenceKeySet<K> extends AbstractHashedMap.KeySet<K> {
        public ReferenceKeySet(AbstractHashedMap<K, ?> abstractHashedMap) {
            super(abstractHashedMap);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            ArrayList arrayList = new ArrayList(size());
            Iterator<K> it2 = iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
            return (T[]) arrayList.toArray(tArr);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return toArray(new Object[size()]);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ReferenceValues<V> extends AbstractHashedMap.Values<V> {
        public ReferenceValues(AbstractHashedMap<?, V> abstractHashedMap) {
            super(abstractHashedMap);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            ArrayList arrayList = new ArrayList(size());
            Iterator<V> it2 = iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
            return (T[]) arrayList.toArray(tArr);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return toArray(new Object[size()]);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ReferenceEntrySet<K, V> extends AbstractHashedMap.EntrySet<K, V> {
        public ReferenceEntrySet(AbstractHashedMap<K, V> abstractHashedMap) {
            super(abstractHashedMap);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            ArrayList arrayList = new ArrayList(size());
            Iterator<Map.Entry<K, V>> it2 = iterator();
            while (it2.hasNext()) {
                arrayList.add(new DefaultMapEntry(it2.next()));
            }
            return (T[]) arrayList.toArray(tArr);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return toArray(new Object[size()]);
        }
    }

    public void purge() {
        Reference<? extends Object> poll = this.queue.poll();
        while (poll != null) {
            purge(poll);
            poll = this.queue.poll();
        }
    }
}
