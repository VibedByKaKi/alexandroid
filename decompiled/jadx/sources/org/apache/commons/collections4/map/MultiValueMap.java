package org.apache.commons.collections4.map;

import com.here.time.Duration$$ExternalSyntheticBUOutline0;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.Factory;
import org.apache.commons.collections4.FunctorException;
import org.apache.commons.collections4.MultiMap;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.iterators.EmptyIterator;
import org.apache.commons.collections4.iterators.IteratorChain;
import org.apache.commons.collections4.iterators.LazyIteratorChain;
import org.apache.commons.collections4.iterators.TransformIterator;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes9.dex */
public class MultiValueMap<K, V> extends AbstractMapDecorator<K, Object> implements MultiMap<K, V>, Serializable {
    private static final long serialVersionUID = -2214159910087182007L;
    private final Factory<? extends Collection<V>> collectionFactory;
    private transient Collection<V> valuesView;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ReflectionFactory<T extends Collection<?>> implements Factory<T>, Serializable {
        private static final long serialVersionUID = 2986114157496788874L;
        private final Class<T> clazz;

        public ReflectionFactory(Class<T> cls) {
            this.clazz = cls;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            Class<T> cls = this.clazz;
            if (cls == null || Collection.class.isAssignableFrom(cls)) {
                return;
            }
            Duration$$ExternalSyntheticBUOutline0.m();
        }

        @Override // org.apache.commons.collections4.Factory
        public T create() {
            try {
                return this.clazz.getDeclaredConstructor(null).newInstance(null);
            } catch (Exception e) {
                throw new FunctorException("Cannot instantiate class: " + this.clazz, e);
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class Values extends AbstractCollection<V> {
        private Values() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            MultiValueMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            IteratorChain iteratorChain = new IteratorChain();
            Iterator<K> it2 = MultiValueMap.this.keySet().iterator();
            while (it2.hasNext()) {
                iteratorChain.addIterator(new ValuesIterator(it2.next()));
            }
            return iteratorChain;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return MultiValueMap.this.totalSize();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class ValuesIterator implements Iterator<V> {
        private final Iterator<V> iterator;
        private final Object key;
        private final Collection<V> values;

        public ValuesIterator(Object obj) {
            this.key = obj;
            Collection<V> collection = MultiValueMap.this.getCollection(obj);
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
                MultiValueMap.this.remove(this.key);
            }
        }
    }

    public MultiValueMap() {
        this(new HashMap(), new ReflectionFactory(ArrayList.class));
    }

    public static <K, V, C extends Collection<V>> MultiValueMap<K, V> multiValueMap(Map<K, ? super C> map, Class<C> cls) {
        return new MultiValueMap<>(map, new ReflectionFactory(cls));
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.map = (Map) objectInputStream.readObject();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.map);
    }

    @Override // org.apache.commons.collections4.map.AbstractMapDecorator, java.util.Map, org.apache.commons.collections4.Put
    public void clear() {
        decorated().clear();
    }

    @Override // org.apache.commons.collections4.map.AbstractMapDecorator, java.util.Map, org.apache.commons.collections4.Get
    public boolean containsValue(Object obj) {
        Set<Map.Entry<K, V>> entrySet = decorated().entrySet();
        if (entrySet == null) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it2 = entrySet.iterator();
        while (it2.hasNext()) {
            if (((Collection) it2.next().getValue()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public Collection<V> createCollection(int i) {
        return this.collectionFactory.create();
    }

    @Override // org.apache.commons.collections4.map.AbstractMapDecorator, java.util.Map, org.apache.commons.collections4.Get
    public Set<Map.Entry<K, Object>> entrySet() {
        return super.entrySet();
    }

    public Collection<V> getCollection(Object obj) {
        return (Collection) decorated().get(obj);
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        final Iterator it2 = new ArrayList(keySet()).iterator();
        return new LazyIteratorChain<Map.Entry<K, V>>() { // from class: org.apache.commons.collections4.map.MultiValueMap.1
            @Override // org.apache.commons.collections4.iterators.LazyIteratorChain
            public Iterator<? extends Map.Entry<K, V>> nextIterator(int i) {
                if (!it2.hasNext()) {
                    return null;
                }
                final Object next = it2.next();
                return new TransformIterator(new ValuesIterator(next), new Transformer<V, Map.Entry<K, V>>() { // from class: org.apache.commons.collections4.map.MultiValueMap.1.1
                    @Override // org.apache.commons.collections4.Transformer
                    public Map.Entry<K, V> transform(final V v) {
                        return new Map.Entry<K, V>() { // from class: org.apache.commons.collections4.map.MultiValueMap.1.1.1
                            @Override // java.util.Map.Entry
                            public K getKey() {
                                return (K) next;
                            }

                            @Override // java.util.Map.Entry
                            public V getValue() {
                                return (V) v;
                            }

                            @Override // java.util.Map.Entry
                            public V setValue(V v2) {
                                throw new UnsupportedOperationException();
                            }
                        };
                    }

                    @Override // org.apache.commons.collections4.Transformer
                    public /* bridge */ /* synthetic */ Object transform(Object obj) {
                        return transform((C02671) obj);
                    }
                });
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.apache.commons.collections4.map.AbstractMapDecorator, java.util.Map, org.apache.commons.collections4.Put
    public Object put(K k, Object obj) {
        boolean add;
        Collection<V> collection = getCollection(k);
        if (collection == null) {
            add = true;
            Collection<V> createCollection = createCollection(1);
            createCollection.add(obj);
            if (createCollection.size() > 0) {
                decorated().put(k, createCollection);
            } else {
                add = false;
            }
        } else {
            add = collection.add(obj);
        }
        if (add) {
            return obj;
        }
        return null;
    }

    @Override // org.apache.commons.collections4.map.AbstractMapDecorator, java.util.Map, org.apache.commons.collections4.Put
    public void putAll(Map<? extends K, ?> map) {
        if (map instanceof MultiMap) {
            for (Map.Entry<K, Object> entry : ((MultiMap) map).entrySet()) {
                putAll(entry.getKey(), (Collection) entry.getValue());
            }
            return;
        }
        for (Map.Entry<? extends K, ?> entry2 : map.entrySet()) {
            put(entry2.getKey(), entry2.getValue());
        }
    }

    @Override // org.apache.commons.collections4.MultiMap
    public boolean removeMapping(Object obj, Object obj2) {
        Collection<V> collection = getCollection(obj);
        if (collection == null || !collection.remove(obj2)) {
            return false;
        }
        if (!collection.isEmpty()) {
            return true;
        }
        remove(obj);
        return true;
    }

    public int size(Object obj) {
        Collection<V> collection = getCollection(obj);
        if (collection == null) {
            return 0;
        }
        return collection.size();
    }

    public int totalSize() {
        Iterator<V> it2 = decorated().values().iterator();
        int i = 0;
        while (it2.hasNext()) {
            i += CollectionUtils.size(it2.next());
        }
        return i;
    }

    @Override // org.apache.commons.collections4.map.AbstractMapDecorator, java.util.Map, org.apache.commons.collections4.Get
    public Collection<Object> values() {
        Collection<V> collection = this.valuesView;
        if (collection != null) {
            return collection;
        }
        Values values = new Values();
        this.valuesView = values;
        return values;
    }

    public static <K, V> MultiValueMap<K, V> multiValueMap(Map<K, ? super Collection<V>> map) {
        return multiValueMap(map, ArrayList.class);
    }

    public static <K, V, C extends Collection<V>> MultiValueMap<K, V> multiValueMap(Map<K, ? super C> map, Factory<C> factory) {
        return new MultiValueMap<>(map, factory);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <C extends Collection<V>> MultiValueMap(Map<K, ? super C> map, Factory<C> factory) {
        super(map);
        if (factory != 0) {
            this.collectionFactory = factory;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("The factory must not be null");
            throw null;
        }
    }

    public Iterator<V> iterator(Object obj) {
        if (!containsKey(obj)) {
            return EmptyIterator.emptyIterator();
        }
        return new ValuesIterator(obj);
    }

    public boolean containsValue(Object obj, Object obj2) {
        Collection<V> collection = getCollection(obj);
        if (collection == null) {
            return false;
        }
        return collection.contains(obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean putAll(K k, Collection<V> collection) {
        if (collection == 0 || collection.size() == 0) {
            return false;
        }
        Collection<V> collection2 = getCollection(k);
        if (collection2 == null) {
            Collection<V> createCollection = createCollection(collection.size());
            createCollection.addAll(collection);
            if (createCollection.size() <= 0) {
                return false;
            }
            decorated().put(k, createCollection);
            return true;
        }
        return collection2.addAll(collection);
    }
}
