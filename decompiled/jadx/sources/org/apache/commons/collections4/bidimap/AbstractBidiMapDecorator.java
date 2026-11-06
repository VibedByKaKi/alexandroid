package org.apache.commons.collections4.bidimap;

import java.util.Set;
import org.apache.commons.collections4.BidiMap;
import org.apache.commons.collections4.MapIterator;
import org.apache.commons.collections4.map.AbstractMapDecorator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public abstract class AbstractBidiMapDecorator<K, V> extends AbstractMapDecorator<K, V> implements BidiMap<K, V> {
    public AbstractBidiMapDecorator(BidiMap<K, V> bidiMap) {
        super(bidiMap);
    }

    @Override // org.apache.commons.collections4.map.AbstractMapDecorator
    public BidiMap<K, V> decorated() {
        return (BidiMap) super.decorated();
    }

    @Override // org.apache.commons.collections4.BidiMap
    public K getKey(Object obj) {
        return decorated().getKey(obj);
    }

    @Override // org.apache.commons.collections4.BidiMap
    public BidiMap<V, K> inverseBidiMap() {
        return decorated().inverseBidiMap();
    }

    @Override // org.apache.commons.collections4.map.AbstractIterableMap, org.apache.commons.collections4.IterableGet
    public MapIterator<K, V> mapIterator() {
        return decorated().mapIterator();
    }

    @Override // org.apache.commons.collections4.BidiMap
    public K removeValue(Object obj) {
        return decorated().removeValue(obj);
    }

    @Override // org.apache.commons.collections4.map.AbstractMapDecorator, java.util.Map, org.apache.commons.collections4.Get
    public Set<V> values() {
        return decorated().values();
    }
}
