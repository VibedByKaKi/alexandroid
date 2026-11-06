package org.apache.commons.collections4.multimap;

import com.here.time.Duration$$ExternalSyntheticBUOutline0;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.IteratorUtils;
import org.apache.commons.collections4.MapIterator;
import org.apache.commons.collections4.MultiSet;
import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.iterators.AbstractIteratorDecorator;
import org.apache.commons.collections4.iterators.EmptyMapIterator;
import org.apache.commons.collections4.iterators.IteratorChain;
import org.apache.commons.collections4.iterators.LazyIteratorChain;
import org.apache.commons.collections4.iterators.TransformIterator;
import org.apache.commons.collections4.keyvalue.AbstractMapEntry;
import org.apache.commons.collections4.keyvalue.UnmodifiableMapEntry;
import org.apache.commons.collections4.multiset.AbstractMultiSet;
import org.apache.commons.collections4.multiset.UnmodifiableMultiSet;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public abstract class AbstractMultiValuedMap<K, V> implements MultiValuedMap<K, V> {
    private transient AbstractMultiValuedMap<K, V>.AsMap asMapView;
    private transient AbstractMultiValuedMap<K, V>.EntryValues entryValuesView;
    private transient MultiSet<K> keysMultiSetView;
    private transient Map<K, Collection<V>> map;
    private transient Collection<V> valuesView;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class AsMap extends AbstractMap<K, Collection<V>> {
        final transient Map<K, Collection<V>> decoratedMap;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public class AsMapEntrySet extends AbstractSet<Map.Entry<K, Collection<V>>> {
            public AsMapEntrySet() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public void clear() {
                AsMap.this.clear();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return AsMap.this.decoratedMap.entrySet().contains(obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                AsMap asMap = AsMap.this;
                return asMap.new AsMapEntrySetIterator(asMap.decoratedMap.entrySet().iterator());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                AbstractMultiValuedMap.this.remove(((Map.Entry) obj).getKey());
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return AsMap.this.size();
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public class AsMapEntrySetIterator extends AbstractIteratorDecorator<Map.Entry<K, Collection<V>>> {
            public AsMapEntrySetIterator(Iterator<Map.Entry<K, Collection<V>>> it2) {
                super(it2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // org.apache.commons.collections4.iterators.AbstractIteratorDecorator, java.util.Iterator
            public Map.Entry<K, Collection<V>> next() {
                Object key = ((Map.Entry) super.next()).getKey();
                return new UnmodifiableMapEntry(key, AbstractMultiValuedMap.this.wrappedCollection(key));
            }
        }

        public AsMap(Map<K, Collection<V>> map) {
            this.decoratedMap = map;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            AbstractMultiValuedMap.this.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.decoratedMap.containsKey(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, Collection<V>>> entrySet() {
            return new AsMapEntrySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(Object obj) {
            return this == obj || this.decoratedMap.equals(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> get(Object obj) {
            if (this.decoratedMap.get(obj) == null) {
                return null;
            }
            return AbstractMultiValuedMap.this.wrappedCollection(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.decoratedMap.hashCode();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return AbstractMultiValuedMap.this.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> remove(Object obj) {
            Collection<V> remove = this.decoratedMap.remove(obj);
            if (remove == null) {
                return null;
            }
            Collection<V> createCollection = AbstractMultiValuedMap.this.createCollection();
            createCollection.addAll(remove);
            remove.clear();
            return createCollection;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.decoratedMap.size();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.decoratedMap.toString();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class EntryValues extends AbstractCollection<Map.Entry<K, V>> {
        private EntryValues() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new LazyIteratorChain<Map.Entry<K, V>>() { // from class: org.apache.commons.collections4.multimap.AbstractMultiValuedMap.EntryValues.1
                final Iterator<K> keyIterator;
                final Collection<K> keysCol;

                {
                    ArrayList arrayList = new ArrayList(AbstractMultiValuedMap.this.getMap().keySet());
                    this.keysCol = arrayList;
                    this.keyIterator = arrayList.iterator();
                }

                @Override // org.apache.commons.collections4.iterators.LazyIteratorChain
                public Iterator<? extends Map.Entry<K, V>> nextIterator(int i) {
                    if (!this.keyIterator.hasNext()) {
                        return null;
                    }
                    final K next = this.keyIterator.next();
                    return new TransformIterator(new ValuesIterator(next), new Transformer<V, Map.Entry<K, V>>() { // from class: org.apache.commons.collections4.multimap.AbstractMultiValuedMap.EntryValues.1.1
                        @Override // org.apache.commons.collections4.Transformer
                        public Map.Entry<K, V> transform(V v) {
                            return new MultiValuedMapEntry(next, v);
                        }

                        @Override // org.apache.commons.collections4.Transformer
                        public /* bridge */ /* synthetic */ Object transform(Object obj) {
                            return transform((C02691) obj);
                        }
                    });
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return AbstractMultiValuedMap.this.size();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class MultiValuedMapEntry extends AbstractMapEntry<K, V> {
        public MultiValuedMapEntry(K k, V v) {
            super(k, v);
        }

        @Override // org.apache.commons.collections4.keyvalue.AbstractMapEntry, org.apache.commons.collections4.keyvalue.AbstractKeyValue, java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class MultiValuedMapIterator implements MapIterator<K, V> {
        private Map.Entry<K, V> current = null;

        /* renamed from: it, reason: collision with root package name */
        private final Iterator<Map.Entry<K, V>> f1157it;

        public MultiValuedMapIterator() {
            this.f1157it = AbstractMultiValuedMap.this.entries().iterator();
        }

        @Override // org.apache.commons.collections4.MapIterator
        public K getKey() {
            Map.Entry<K, V> entry = this.current;
            if (entry != null) {
                return entry.getKey();
            }
            Duration$$ExternalSyntheticBUOutline0.m$1();
            return null;
        }

        @Override // org.apache.commons.collections4.MapIterator
        public V getValue() {
            Map.Entry<K, V> entry = this.current;
            if (entry != null) {
                return entry.getValue();
            }
            Duration$$ExternalSyntheticBUOutline0.m$1();
            return null;
        }

        @Override // org.apache.commons.collections4.MapIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f1157it.hasNext();
        }

        @Override // org.apache.commons.collections4.MapIterator, java.util.Iterator
        public K next() {
            Map.Entry<K, V> next = this.f1157it.next();
            this.current = next;
            return next.getKey();
        }

        @Override // org.apache.commons.collections4.MapIterator, java.util.Iterator
        public void remove() {
            this.f1157it.remove();
        }

        @Override // org.apache.commons.collections4.MapIterator
        public V setValue(V v) {
            Map.Entry<K, V> entry = this.current;
            if (entry != null) {
                return entry.setValue(v);
            }
            Duration$$ExternalSyntheticBUOutline0.m$1();
            return null;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class Values extends AbstractCollection<V> {
        private Values() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            AbstractMultiValuedMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            IteratorChain iteratorChain = new IteratorChain();
            Iterator<K> it2 = AbstractMultiValuedMap.this.keySet().iterator();
            while (it2.hasNext()) {
                iteratorChain.addIterator(new ValuesIterator(it2.next()));
            }
            return iteratorChain;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return AbstractMultiValuedMap.this.size();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class ValuesIterator implements Iterator<V> {
        private final Iterator<V> iterator;
        private final Object key;
        private final Collection<V> values;

        public ValuesIterator(Object obj) {
            this.key = obj;
            Collection<V> collection = AbstractMultiValuedMap.this.getMap().get(obj);
            this.values = collection;
            this.iterator = collection.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.iterator.hasNext();
        }

        @Override // java.util.Iterator
        public V next() {
            return this.iterator.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.iterator.remove();
            if (this.values.isEmpty()) {
                AbstractMultiValuedMap.this.remove(this.key);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractMultiValuedMap(Map<K, ? extends Collection<V>> map) {
        if (map != 0) {
            this.map = map;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Map must not be null.");
            throw null;
        }
    }

    @Override // org.apache.commons.collections4.MultiValuedMap
    public Map<K, Collection<V>> asMap() {
        AbstractMultiValuedMap<K, V>.AsMap asMap = this.asMapView;
        if (asMap != null) {
            return asMap;
        }
        AbstractMultiValuedMap<K, V>.AsMap asMap2 = new AsMap(this.map);
        this.asMapView = asMap2;
        return asMap2;
    }

    @Override // org.apache.commons.collections4.MultiValuedMap
    public void clear() {
        getMap().clear();
    }

    @Override // org.apache.commons.collections4.MultiValuedMap
    public boolean containsKey(Object obj) {
        return getMap().containsKey(obj);
    }

    @Override // org.apache.commons.collections4.MultiValuedMap
    public boolean containsMapping(Object obj, Object obj2) {
        Collection<V> collection = getMap().get(obj);
        return collection != null && collection.contains(obj2);
    }

    @Override // org.apache.commons.collections4.MultiValuedMap
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public abstract Collection<V> createCollection();

    /* JADX WARN: Multi-variable type inference failed */
    public void doReadObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        int readInt = objectInputStream.readInt();
        for (int i = 0; i < readInt; i++) {
            Collection collection = get(objectInputStream.readObject());
            int readInt2 = objectInputStream.readInt();
            for (int i2 = 0; i2 < readInt2; i2++) {
                collection.add(objectInputStream.readObject());
            }
        }
    }

    public void doWriteObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.map.size());
        for (Map.Entry<K, Collection<V>> entry : this.map.entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(entry.getValue().size());
            Iterator<V> it2 = entry.getValue().iterator();
            while (it2.hasNext()) {
                objectOutputStream.writeObject(it2.next());
            }
        }
    }

    @Override // org.apache.commons.collections4.MultiValuedMap
    public Collection<Map.Entry<K, V>> entries() {
        AbstractMultiValuedMap<K, V>.EntryValues entryValues = this.entryValuesView;
        if (entryValues != null) {
            return entryValues;
        }
        AbstractMultiValuedMap<K, V>.EntryValues entryValues2 = new EntryValues();
        this.entryValuesView = entryValues2;
        return entryValues2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MultiValuedMap) {
            return asMap().equals(((MultiValuedMap) obj).asMap());
        }
        return false;
    }

    @Override // org.apache.commons.collections4.MultiValuedMap
    public Collection<V> get(K k) {
        return wrappedCollection(k);
    }

    public Map<K, ? extends Collection<V>> getMap() {
        return this.map;
    }

    public int hashCode() {
        return getMap().hashCode();
    }

    @Override // org.apache.commons.collections4.MultiValuedMap
    public boolean isEmpty() {
        return getMap().isEmpty();
    }

    @Override // org.apache.commons.collections4.MultiValuedMap
    public Set<K> keySet() {
        return getMap().keySet();
    }

    @Override // org.apache.commons.collections4.MultiValuedMap
    public MultiSet<K> keys() {
        if (this.keysMultiSetView == null) {
            this.keysMultiSetView = UnmodifiableMultiSet.unmodifiableMultiSet(new KeysMultiSet());
        }
        return this.keysMultiSetView;
    }

    @Override // org.apache.commons.collections4.MultiValuedMap
    public MapIterator<K, V> mapIterator() {
        return size() == 0 ? EmptyMapIterator.emptyMapIterator() : new MultiValuedMapIterator();
    }

    @Override // org.apache.commons.collections4.MultiValuedMap
    public boolean put(K k, V v) {
        Collection<V> collection = getMap().get(k);
        if (collection != null) {
            return collection.add(v);
        }
        Collection<V> createCollection = createCollection();
        if (!createCollection.add(v)) {
            return false;
        }
        this.map.put(k, createCollection);
        return true;
    }

    @Override // org.apache.commons.collections4.MultiValuedMap
    public boolean putAll(K k, Iterable<? extends V> iterable) {
        if (iterable == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Values must not be null.");
            return false;
        }
        if (iterable instanceof Collection) {
            Collection<? extends V> collection = (Collection) iterable;
            return !collection.isEmpty() && get(k).addAll(collection);
        }
        Iterator<? extends V> it2 = iterable.iterator();
        return it2.hasNext() && CollectionUtils.addAll(get(k), it2);
    }

    @Override // org.apache.commons.collections4.MultiValuedMap
    public Collection<V> remove(Object obj) {
        return CollectionUtils.emptyIfNull(getMap().remove(obj));
    }

    @Override // org.apache.commons.collections4.MultiValuedMap
    public boolean removeMapping(Object obj, Object obj2) {
        Collection<V> collection = getMap().get(obj);
        if (collection == null) {
            return false;
        }
        boolean remove = collection.remove(obj2);
        if (collection.isEmpty()) {
            getMap().remove(obj);
        }
        return remove;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setMap(Map<K, ? extends Collection<V>> map) {
        this.map = map;
    }

    @Override // org.apache.commons.collections4.MultiValuedMap
    public int size() {
        Iterator<? extends Collection<V>> it2 = getMap().values().iterator();
        int i = 0;
        while (it2.hasNext()) {
            i += it2.next().size();
        }
        return i;
    }

    public String toString() {
        return getMap().toString();
    }

    @Override // org.apache.commons.collections4.MultiValuedMap
    public Collection<V> values() {
        Collection<V> collection = this.valuesView;
        if (collection != null) {
            return collection;
        }
        Values values = new Values();
        this.valuesView = values;
        return values;
    }

    public Collection<V> wrappedCollection(K k) {
        return new WrappedCollection(k);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class KeysMultiSet extends AbstractMultiSet<K> {
        private KeysMultiSet() {
        }

        @Override // org.apache.commons.collections4.multiset.AbstractMultiSet, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return AbstractMultiValuedMap.this.getMap().containsKey(obj);
        }

        @Override // org.apache.commons.collections4.multiset.AbstractMultiSet
        public Iterator<MultiSet.Entry<K>> createEntrySetIterator() {
            return IteratorUtils.transformedIterator(AbstractMultiValuedMap.this.map.entrySet().iterator(), new MapEntryTransformer());
        }

        @Override // org.apache.commons.collections4.multiset.AbstractMultiSet, org.apache.commons.collections4.MultiSet
        public int getCount(Object obj) {
            Collection<V> collection = AbstractMultiValuedMap.this.getMap().get(obj);
            if (collection != null) {
                return collection.size();
            }
            return 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return AbstractMultiValuedMap.this.getMap().isEmpty();
        }

        @Override // org.apache.commons.collections4.multiset.AbstractMultiSet, java.util.AbstractCollection, java.util.Collection, org.apache.commons.collections4.MultiSet
        public int size() {
            return AbstractMultiValuedMap.this.size();
        }

        @Override // org.apache.commons.collections4.multiset.AbstractMultiSet
        public int uniqueElements() {
            return AbstractMultiValuedMap.this.getMap().size();
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public final class MapEntryTransformer implements Transformer<Map.Entry<K, Collection<V>>, MultiSet.Entry<K>> {
            private MapEntryTransformer() {
            }

            @Override // org.apache.commons.collections4.Transformer
            public MultiSet.Entry<K> transform(final Map.Entry<K, Collection<V>> entry) {
                return new AbstractMultiSet.AbstractEntry<K>() { // from class: org.apache.commons.collections4.multimap.AbstractMultiValuedMap.KeysMultiSet.MapEntryTransformer.1
                    @Override // org.apache.commons.collections4.MultiSet.Entry
                    public int getCount() {
                        return ((Collection) entry.getValue()).size();
                    }

                    @Override // org.apache.commons.collections4.MultiSet.Entry
                    public K getElement() {
                        return (K) entry.getKey();
                    }
                };
            }
        }
    }

    public AbstractMultiValuedMap() {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class WrappedCollection implements Collection<V> {
        protected final K key;

        public WrappedCollection(K k) {
            this.key = k;
        }

        @Override // java.util.Collection
        public boolean add(V v) {
            Collection<V> mapping = getMapping();
            if (mapping == null) {
                mapping = AbstractMultiValuedMap.this.createCollection();
                AbstractMultiValuedMap.this.map.put(this.key, mapping);
            }
            return mapping.add(v);
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            Collection<V> mapping = getMapping();
            if (mapping == null) {
                mapping = AbstractMultiValuedMap.this.createCollection();
                AbstractMultiValuedMap.this.map.put(this.key, mapping);
            }
            return mapping.addAll(collection);
        }

        @Override // java.util.Collection
        public void clear() {
            Collection<V> mapping = getMapping();
            if (mapping != null) {
                mapping.clear();
                AbstractMultiValuedMap.this.remove(this.key);
            }
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            Collection<V> mapping = getMapping();
            return mapping != null && mapping.contains(obj);
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Collection<V> mapping = getMapping();
            return mapping != null && mapping.containsAll(collection);
        }

        public Collection<V> getMapping() {
            return AbstractMultiValuedMap.this.getMap().get(this.key);
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            Collection<V> mapping = getMapping();
            return mapping == null || mapping.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return getMapping() == null ? IteratorUtils.EMPTY_ITERATOR : new ValuesIterator(this.key);
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            Collection<V> mapping = getMapping();
            if (mapping == null) {
                return false;
            }
            boolean remove = mapping.remove(obj);
            if (mapping.isEmpty()) {
                AbstractMultiValuedMap.this.remove(this.key);
            }
            return remove;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            Collection<V> mapping = getMapping();
            if (mapping == null) {
                return false;
            }
            boolean removeAll = mapping.removeAll(collection);
            if (mapping.isEmpty()) {
                AbstractMultiValuedMap.this.remove(this.key);
            }
            return removeAll;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            Collection<V> mapping = getMapping();
            if (mapping == null) {
                return false;
            }
            boolean retainAll = mapping.retainAll(collection);
            if (mapping.isEmpty()) {
                AbstractMultiValuedMap.this.remove(this.key);
            }
            return retainAll;
        }

        @Override // java.util.Collection
        public int size() {
            Collection<V> mapping = getMapping();
            if (mapping == null) {
                return 0;
            }
            return mapping.size();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            Collection<V> mapping = getMapping();
            return mapping == null ? CollectionUtils.EMPTY_COLLECTION.toArray() : mapping.toArray();
        }

        public String toString() {
            Collection<V> mapping = getMapping();
            return mapping == null ? CollectionUtils.EMPTY_COLLECTION.toString() : mapping.toString();
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            Collection<V> mapping = getMapping();
            if (mapping == null) {
                return (T[]) CollectionUtils.EMPTY_COLLECTION.toArray(tArr);
            }
            return (T[]) mapping.toArray(tArr);
        }
    }

    @Override // org.apache.commons.collections4.MultiValuedMap
    public boolean putAll(MultiValuedMap<? extends K, ? extends V> multiValuedMap) {
        if (multiValuedMap != null) {
            boolean z = false;
            for (Map.Entry<? extends K, ? extends V> entry : multiValuedMap.entries()) {
                z |= put(entry.getKey(), entry.getValue());
            }
            return z;
        }
        Single$$ExternalSyntheticBUOutline0.m$1("Map must not be null.");
        return false;
    }

    @Override // org.apache.commons.collections4.MultiValuedMap
    public boolean putAll(Map<? extends K, ? extends V> map) {
        if (map != null) {
            boolean z = false;
            for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
                z |= put(entry.getKey(), entry.getValue());
            }
            return z;
        }
        Single$$ExternalSyntheticBUOutline0.m$1("Map must not be null.");
        return false;
    }
}
