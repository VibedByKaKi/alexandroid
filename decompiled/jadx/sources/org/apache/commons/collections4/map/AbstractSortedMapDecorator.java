package org.apache.commons.collections4.map;

import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import org.apache.commons.collections4.IterableSortedMap;
import org.apache.commons.collections4.OrderedMapIterator;
import org.apache.commons.collections4.iterators.ListIteratorWrapper;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public abstract class AbstractSortedMapDecorator<K, V> extends AbstractMapDecorator<K, V> implements IterableSortedMap<K, V> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class SortedMapIterator<K, V> extends EntrySetToMapIteratorAdapter<K, V> implements OrderedMapIterator<K, V> {
        public SortedMapIterator(Set<Map.Entry<K, V>> set) {
            super(set);
        }

        @Override // org.apache.commons.collections4.OrderedMapIterator, org.apache.commons.collections4.OrderedIterator
        public boolean hasPrevious() {
            return ((ListIterator) this.iterator).hasPrevious();
        }

        @Override // org.apache.commons.collections4.OrderedMapIterator, org.apache.commons.collections4.OrderedIterator
        public K previous() {
            this.entry = (Map.Entry) ((ListIterator) this.iterator).previous();
            return getKey();
        }

        @Override // org.apache.commons.collections4.map.EntrySetToMapIteratorAdapter, org.apache.commons.collections4.ResettableIterator
        public synchronized void reset() {
            super.reset();
            this.iterator = new ListIteratorWrapper(this.iterator);
        }
    }

    public AbstractSortedMapDecorator() {
    }

    @Override // java.util.SortedMap
    public Comparator<? super K> comparator() {
        return decorated().comparator();
    }

    @Override // org.apache.commons.collections4.map.AbstractMapDecorator
    public SortedMap<K, V> decorated() {
        return (SortedMap) super.decorated();
    }

    @Override // java.util.SortedMap, org.apache.commons.collections4.OrderedMap
    public K firstKey() {
        return decorated().firstKey();
    }

    public SortedMap<K, V> headMap(K k) {
        return decorated().headMap(k);
    }

    @Override // java.util.SortedMap, org.apache.commons.collections4.OrderedMap
    public K lastKey() {
        return decorated().lastKey();
    }

    @Override // org.apache.commons.collections4.map.AbstractIterableMap, org.apache.commons.collections4.IterableGet
    public OrderedMapIterator<K, V> mapIterator() {
        return new SortedMapIterator(entrySet());
    }

    public K nextKey(K k) {
        Iterator<K> it2 = tailMap(k).keySet().iterator();
        it2.next();
        if (it2.hasNext()) {
            return it2.next();
        }
        return null;
    }

    public K previousKey(K k) {
        SortedMap<K, V> headMap = headMap(k);
        if (headMap.isEmpty()) {
            return null;
        }
        return headMap.lastKey();
    }

    public SortedMap<K, V> subMap(K k, K k2) {
        return decorated().subMap(k, k2);
    }

    public SortedMap<K, V> tailMap(K k) {
        return decorated().tailMap(k);
    }

    public AbstractSortedMapDecorator(SortedMap<K, V> sortedMap) {
        super(sortedMap);
    }
}
