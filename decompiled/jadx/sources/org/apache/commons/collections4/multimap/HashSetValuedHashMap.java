package org.apache.commons.collections4.multimap;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.apache.commons.collections4.MultiValuedMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class HashSetValuedHashMap<K, V> extends AbstractSetValuedMap<K, V> implements Serializable {
    private static final int DEFAULT_INITIAL_MAP_CAPACITY = 16;
    private static final int DEFAULT_INITIAL_SET_CAPACITY = 3;
    private static final long serialVersionUID = 20151118;
    private final int initialSetCapacity;

    public HashSetValuedHashMap(MultiValuedMap<? extends K, ? extends V> multiValuedMap) {
        this(multiValuedMap.size(), 3);
        super.putAll(multiValuedMap);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        setMap(new HashMap());
        doReadObject(objectInputStream);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        doWriteObject(objectOutputStream);
    }

    @Override // org.apache.commons.collections4.multimap.AbstractSetValuedMap, org.apache.commons.collections4.multimap.AbstractMultiValuedMap
    public HashSet<V> createCollection() {
        return new HashSet<>(this.initialSetCapacity);
    }

    public HashSetValuedHashMap(int i) {
        this(16, i);
    }

    public HashSetValuedHashMap(int i, int i2) {
        super(new HashMap(i));
        this.initialSetCapacity = i2;
    }

    public HashSetValuedHashMap() {
        this(16, 3);
    }

    public HashSetValuedHashMap(Map<? extends K, ? extends V> map) {
        this(map.size(), 3);
        super.putAll(map);
    }
}
