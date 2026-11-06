package org.apache.commons.collections4.map;

import org.apache.commons.collections4.IterableMap;
import org.apache.commons.collections4.MapIterator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public abstract class AbstractIterableMap<K, V> implements IterableMap<K, V> {
    public MapIterator<K, V> mapIterator() {
        return new EntrySetToMapIteratorAdapter(entrySet());
    }
}
