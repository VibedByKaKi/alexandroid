package org.apache.commons.collections4.map;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import org.apache.commons.collections4.MapIterator;
import org.apache.commons.collections4.keyvalue.MultiKey;
import org.apache.commons.collections4.map.AbstractHashedMap;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class MultiKeyMap<K, V> extends AbstractMapDecorator<MultiKey<? extends K>, V> implements Serializable, Cloneable {
    private static final long serialVersionUID = -1788199231038721040L;

    public MultiKeyMap() {
        this(new HashedMap());
    }

    public static <K, V> MultiKeyMap<K, V> multiKeyMap(AbstractHashedMap<MultiKey<? extends K>, V> abstractHashedMap) {
        if (abstractHashedMap == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Map must not be null");
            return null;
        }
        if (abstractHashedMap.size() <= 0) {
            return new MultiKeyMap<>(abstractHashedMap);
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Map must be empty");
        return null;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.map = (Map) objectInputStream.readObject();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.map);
    }

    public void checkKey(MultiKey<?> multiKey) {
        if (multiKey != null) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$1("Key must not be null");
    }

    public MultiKeyMap<K, V> clone() {
        try {
            return (MultiKeyMap) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean containsKey(Object obj, Object obj2, Object obj3, Object obj4) {
        int hash = hash(obj, obj2, obj3, obj4);
        AbstractHashedMap.HashEntry hashEntry = decorated().data[decorated().hashIndex(hash, decorated().data.length)];
        while (hashEntry != null) {
            MultiKeyMap multiKeyMap = this;
            Object obj5 = obj;
            Object obj6 = obj2;
            Object obj7 = obj3;
            Object obj8 = obj4;
            if (hashEntry.hashCode == hash && multiKeyMap.isEqualKey(hashEntry, obj5, obj6, obj7, obj8)) {
                return true;
            }
            hashEntry = hashEntry.next;
            this = multiKeyMap;
            obj = obj5;
            obj2 = obj6;
            obj3 = obj7;
            obj4 = obj8;
        }
        return false;
    }

    @Override // org.apache.commons.collections4.map.AbstractMapDecorator
    public AbstractHashedMap<MultiKey<? extends K>, V> decorated() {
        return (AbstractHashedMap) super.decorated();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public V get(Object obj, Object obj2, Object obj3, Object obj4) {
        int hash = hash(obj, obj2, obj3, obj4);
        AbstractHashedMap.HashEntry hashEntry = decorated().data[decorated().hashIndex(hash, decorated().data.length)];
        while (hashEntry != null) {
            MultiKeyMap multiKeyMap = this;
            Object obj5 = obj;
            Object obj6 = obj2;
            Object obj7 = obj3;
            Object obj8 = obj4;
            if (hashEntry.hashCode == hash && multiKeyMap.isEqualKey(hashEntry, obj5, obj6, obj7, obj8)) {
                return (V) hashEntry.getValue();
            }
            hashEntry = hashEntry.next;
            this = multiKeyMap;
            obj = obj5;
            obj2 = obj6;
            obj3 = obj7;
            obj4 = obj8;
        }
        return null;
    }

    public int hash(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int hashCode = obj != null ? obj.hashCode() : 0;
        if (obj2 != null) {
            hashCode ^= obj2.hashCode();
        }
        if (obj3 != null) {
            hashCode ^= obj3.hashCode();
        }
        if (obj4 != null) {
            hashCode ^= obj4.hashCode();
        }
        if (obj5 != null) {
            hashCode ^= obj5.hashCode();
        }
        int i = hashCode + (~(hashCode << 9));
        int i2 = i ^ (i >>> 14);
        int i3 = i2 + (i2 << 4);
        return i3 ^ (i3 >>> 10);
    }

    public boolean isEqualKey(AbstractHashedMap.HashEntry<MultiKey<? extends K>, V> hashEntry, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        MultiKey<? extends K> key = hashEntry.getKey();
        return key.size() == 5 && (obj == key.getKey(0) || (obj != null && obj.equals(key.getKey(0)))) && ((obj2 == key.getKey(1) || (obj2 != null && obj2.equals(key.getKey(1)))) && ((obj3 == key.getKey(2) || (obj3 != null && obj3.equals(key.getKey(2)))) && ((obj4 == key.getKey(3) || (obj4 != null && obj4.equals(key.getKey(3)))) && (obj5 == key.getKey(4) || (obj5 != null && obj5.equals(key.getKey(4)))))));
    }

    @Override // org.apache.commons.collections4.map.AbstractIterableMap, org.apache.commons.collections4.IterableGet
    public MapIterator<MultiKey<? extends K>, V> mapIterator() {
        return decorated().mapIterator();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public V put(K k, K k2, K k3, K k4, V v) {
        int hash = hash(k, k2, k3, k4);
        int hashIndex = decorated().hashIndex(hash, decorated().data.length);
        AbstractHashedMap.HashEntry hashEntry = decorated().data[hashIndex];
        while (hashEntry != null) {
            MultiKeyMap multiKeyMap = this;
            K k5 = k;
            K k6 = k2;
            K k7 = k3;
            K k8 = k4;
            if (hashEntry.hashCode == hash && multiKeyMap.isEqualKey(hashEntry, k5, k6, k7, k8)) {
                V v2 = (V) hashEntry.getValue();
                multiKeyMap.decorated().updateEntry(hashEntry, v);
                return v2;
            }
            hashEntry = hashEntry.next;
            this = multiKeyMap;
            k = k5;
            k2 = k6;
            k3 = k7;
            k4 = k8;
        }
        this.decorated().addMapping(hashIndex, hash, new MultiKey<>(k, k2, k3, k4), v);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.apache.commons.collections4.map.AbstractMapDecorator, java.util.Map, org.apache.commons.collections4.Put
    public void putAll(Map<? extends MultiKey<? extends K>, ? extends V> map) {
        Iterator it2 = map.keySet().iterator();
        while (it2.hasNext()) {
            checkKey((MultiKey) it2.next());
        }
        super.putAll(map);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0043 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x002f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean removeAll(java.lang.Object r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9) {
        /*
            r5 = this;
            org.apache.commons.collections4.MapIterator r5 = r5.mapIterator()
            r0 = 0
            r1 = r0
        L6:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L6d
            java.lang.Object r2 = r5.next()
            org.apache.commons.collections4.keyvalue.MultiKey r2 = (org.apache.commons.collections4.keyvalue.MultiKey) r2
            int r3 = r2.size()
            r4 = 4
            if (r3 < r4) goto L6
            if (r6 != 0) goto L22
            java.lang.Object r3 = r2.getKey(r0)
            if (r3 != 0) goto L6
            goto L2c
        L22:
            java.lang.Object r3 = r2.getKey(r0)
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L6
        L2c:
            r3 = 1
            if (r7 != 0) goto L36
            java.lang.Object r4 = r2.getKey(r3)
            if (r4 != 0) goto L6
            goto L40
        L36:
            java.lang.Object r4 = r2.getKey(r3)
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L6
        L40:
            r4 = 2
            if (r8 != 0) goto L4a
            java.lang.Object r4 = r2.getKey(r4)
            if (r4 != 0) goto L6
            goto L54
        L4a:
            java.lang.Object r4 = r2.getKey(r4)
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L6
        L54:
            r4 = 3
            if (r9 != 0) goto L5e
            java.lang.Object r2 = r2.getKey(r4)
            if (r2 != 0) goto L6
            goto L68
        L5e:
            java.lang.Object r2 = r2.getKey(r4)
            boolean r2 = r9.equals(r2)
            if (r2 == 0) goto L6
        L68:
            r5.remove()
            r1 = r3
            goto L6
        L6d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.collections4.map.MultiKeyMap.removeAll(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):boolean");
    }

    public V removeMultiKey(Object obj, Object obj2, Object obj3, Object obj4) {
        MultiKeyMap<K, V> multiKeyMap;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        int hash = hash(obj, obj2, obj3, obj4);
        int hashIndex = decorated().hashIndex(hash, decorated().data.length);
        AbstractHashedMap.HashEntry<MultiKey<? extends K>, V> hashEntry = decorated().data[hashIndex];
        AbstractHashedMap.HashEntry<MultiKey<? extends K>, V> hashEntry2 = null;
        while (hashEntry != null) {
            if (hashEntry.hashCode == hash) {
                multiKeyMap = this;
                obj5 = obj;
                obj6 = obj2;
                obj7 = obj3;
                obj8 = obj4;
                if (multiKeyMap.isEqualKey(hashEntry, obj5, obj6, obj7, obj8)) {
                    V value = hashEntry.getValue();
                    multiKeyMap.decorated().removeMapping(hashEntry, hashIndex, hashEntry2);
                    return value;
                }
            } else {
                multiKeyMap = this;
                obj5 = obj;
                obj6 = obj2;
                obj7 = obj3;
                obj8 = obj4;
            }
            hashEntry2 = hashEntry;
            obj = obj5;
            obj2 = obj6;
            obj3 = obj7;
            obj4 = obj8;
            hashEntry = hashEntry.next;
            this = multiKeyMap;
        }
        return null;
    }

    public MultiKeyMap(AbstractHashedMap<MultiKey<? extends K>, V> abstractHashedMap) {
        super(abstractHashedMap);
        this.map = abstractHashedMap;
    }

    public int hash(Object obj, Object obj2, Object obj3) {
        int hashCode = obj != null ? obj.hashCode() : 0;
        if (obj2 != null) {
            hashCode ^= obj2.hashCode();
        }
        if (obj3 != null) {
            hashCode ^= obj3.hashCode();
        }
        int i = hashCode + (~(hashCode << 9));
        int i2 = i ^ (i >>> 14);
        int i3 = i2 + (i2 << 4);
        return i3 ^ (i3 >>> 10);
    }

    public int hash(Object obj, Object obj2, Object obj3, Object obj4) {
        int hashCode = obj != null ? obj.hashCode() : 0;
        if (obj2 != null) {
            hashCode ^= obj2.hashCode();
        }
        if (obj3 != null) {
            hashCode ^= obj3.hashCode();
        }
        if (obj4 != null) {
            hashCode ^= obj4.hashCode();
        }
        int i = hashCode + (~(hashCode << 9));
        int i2 = i ^ (i >>> 14);
        int i3 = i2 + (i2 << 4);
        return i3 ^ (i3 >>> 10);
    }

    public boolean containsKey(Object obj, Object obj2, Object obj3) {
        int hash = hash(obj, obj2, obj3);
        for (AbstractHashedMap.HashEntry<K, V> hashEntry = decorated().data[decorated().hashIndex(hash, decorated().data.length)]; hashEntry != null; hashEntry = hashEntry.next) {
            if (hashEntry.hashCode == hash && isEqualKey(hashEntry, obj, obj2, obj3)) {
                return true;
            }
        }
        return false;
    }

    public int hash(Object obj, Object obj2) {
        int hashCode = obj != null ? obj.hashCode() : 0;
        if (obj2 != null) {
            hashCode ^= obj2.hashCode();
        }
        int i = hashCode + (~(hashCode << 9));
        int i2 = i ^ (i >>> 14);
        int i3 = i2 + (i2 << 4);
        return i3 ^ (i3 >>> 10);
    }

    public V get(Object obj, Object obj2, Object obj3) {
        int hash = hash(obj, obj2, obj3);
        for (AbstractHashedMap.HashEntry<K, V> hashEntry = decorated().data[decorated().hashIndex(hash, decorated().data.length)]; hashEntry != null; hashEntry = hashEntry.next) {
            if (hashEntry.hashCode == hash && isEqualKey(hashEntry, obj, obj2, obj3)) {
                return hashEntry.getValue();
            }
        }
        return null;
    }

    public boolean containsKey(Object obj, Object obj2) {
        int hash = hash(obj, obj2);
        for (AbstractHashedMap.HashEntry<K, V> hashEntry = decorated().data[decorated().hashIndex(hash, decorated().data.length)]; hashEntry != null; hashEntry = hashEntry.next) {
            if (hashEntry.hashCode == hash && isEqualKey(hashEntry, obj, obj2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [org.apache.commons.collections4.map.MultiKeyMap] */
    public boolean containsKey(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ?? r0;
        int hash = hash(obj, obj2, obj3, obj4, obj5);
        AbstractHashedMap.HashEntry hashEntry = decorated().data[decorated().hashIndex(hash, decorated().data.length)];
        while (hashEntry != null) {
            if (hashEntry.hashCode == hash) {
                r0 = this;
                if (r0.isEqualKey(hashEntry, obj, obj2, obj3, obj4, obj5)) {
                    return true;
                }
            } else {
                r0 = this;
            }
            hashEntry = hashEntry.next;
            this = r0;
        }
        return false;
    }

    public V get(Object obj, Object obj2) {
        int hash = hash(obj, obj2);
        for (AbstractHashedMap.HashEntry<K, V> hashEntry = decorated().data[decorated().hashIndex(hash, decorated().data.length)]; hashEntry != null; hashEntry = hashEntry.next) {
            if (hashEntry.hashCode == hash && isEqualKey(hashEntry, obj, obj2)) {
                return hashEntry.getValue();
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [org.apache.commons.collections4.map.MultiKeyMap] */
    public V get(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ?? r0;
        int hash = hash(obj, obj2, obj3, obj4, obj5);
        AbstractHashedMap.HashEntry hashEntry = decorated().data[decorated().hashIndex(hash, decorated().data.length)];
        while (hashEntry != null) {
            if (hashEntry.hashCode == hash) {
                r0 = this;
                if (r0.isEqualKey(hashEntry, obj, obj2, obj3, obj4, obj5)) {
                    return (V) hashEntry.getValue();
                }
            } else {
                r0 = this;
            }
            hashEntry = hashEntry.next;
            this = r0;
        }
        return null;
    }

    public V removeMultiKey(Object obj, Object obj2, Object obj3) {
        int hash = hash(obj, obj2, obj3);
        int hashIndex = decorated().hashIndex(hash, decorated().data.length);
        AbstractHashedMap.HashEntry<MultiKey<? extends K>, V> hashEntry = null;
        for (AbstractHashedMap.HashEntry<MultiKey<? extends K>, V> hashEntry2 = decorated().data[hashIndex]; hashEntry2 != null; hashEntry2 = hashEntry2.next) {
            if (hashEntry2.hashCode == hash && isEqualKey(hashEntry2, obj, obj2, obj3)) {
                V value = hashEntry2.getValue();
                decorated().removeMapping(hashEntry2, hashIndex, hashEntry);
                return value;
            }
            hashEntry = hashEntry2;
        }
        return null;
    }

    public V removeMultiKey(Object obj, Object obj2) {
        int hash = hash(obj, obj2);
        int hashIndex = decorated().hashIndex(hash, decorated().data.length);
        AbstractHashedMap.HashEntry<MultiKey<? extends K>, V> hashEntry = null;
        for (AbstractHashedMap.HashEntry<MultiKey<? extends K>, V> hashEntry2 = decorated().data[hashIndex]; hashEntry2 != null; hashEntry2 = hashEntry2.next) {
            if (hashEntry2.hashCode == hash && isEqualKey(hashEntry2, obj, obj2)) {
                V value = hashEntry2.getValue();
                decorated().removeMapping(hashEntry2, hashIndex, hashEntry);
                return value;
            }
            hashEntry = hashEntry2;
        }
        return null;
    }

    public V put(K k, K k2, V v) {
        int hash = hash(k, k2);
        int hashIndex = decorated().hashIndex(hash, decorated().data.length);
        for (AbstractHashedMap.HashEntry<K, V> hashEntry = decorated().data[hashIndex]; hashEntry != null; hashEntry = hashEntry.next) {
            if (hashEntry.hashCode == hash && isEqualKey(hashEntry, k, k2)) {
                V value = hashEntry.getValue();
                decorated().updateEntry(hashEntry, v);
                return value;
            }
        }
        decorated().addMapping(hashIndex, hash, new MultiKey<>(k, k2), v);
        return null;
    }

    public V removeMultiKey(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int hash = hash(obj, obj2, obj3, obj4, obj5);
        int hashIndex = decorated().hashIndex(hash, decorated().data.length);
        AbstractHashedMap.HashEntry<MultiKey<? extends K>, V> hashEntry = decorated().data[hashIndex];
        AbstractHashedMap.HashEntry<MultiKey<? extends K>, V> hashEntry2 = null;
        while (hashEntry != null) {
            if (hashEntry.hashCode == hash && isEqualKey(hashEntry, obj, obj2, obj3, obj4, obj5)) {
                V value = hashEntry.getValue();
                decorated().removeMapping(hashEntry, hashIndex, hashEntry2);
                return value;
            }
            AbstractHashedMap.HashEntry<MultiKey<? extends K>, V> hashEntry3 = hashEntry;
            hashEntry = hashEntry.next;
            hashEntry2 = hashEntry3;
        }
        return null;
    }

    public V put(K k, K k2, K k3, V v) {
        int hash = hash(k, k2, k3);
        int hashIndex = decorated().hashIndex(hash, decorated().data.length);
        for (AbstractHashedMap.HashEntry<K, V> hashEntry = decorated().data[hashIndex]; hashEntry != null; hashEntry = hashEntry.next) {
            if (hashEntry.hashCode == hash && isEqualKey(hashEntry, k, k2, k3)) {
                V value = hashEntry.getValue();
                decorated().updateEntry(hashEntry, v);
                return value;
            }
        }
        decorated().addMapping(hashIndex, hash, new MultiKey<>(k, k2, k3), v);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.apache.commons.collections4.map.AbstractMapDecorator, java.util.Map, org.apache.commons.collections4.Put
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return put((MultiKey) obj, (MultiKey<? extends K>) obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [org.apache.commons.collections4.map.MultiKeyMap] */
    /* JADX WARN: Type inference failed for: r10v1, types: [org.apache.commons.collections4.map.AbstractHashedMap] */
    public V put(K k, K k2, K k3, K k4, K k5, V v) {
        ?? r0;
        int hash = hash(k, k2, k3, k4, k5);
        int hashIndex = decorated().hashIndex(hash, decorated().data.length);
        AbstractHashedMap.HashEntry hashEntry = decorated().data[hashIndex];
        while (hashEntry != null) {
            if (hashEntry.hashCode == hash) {
                r0 = this;
                if (r0.isEqualKey(hashEntry, k, k2, k3, k4, k5)) {
                    V v2 = (V) hashEntry.getValue();
                    r0.decorated().updateEntry(hashEntry, v);
                    return v2;
                }
            } else {
                r0 = this;
            }
            hashEntry = hashEntry.next;
            this = r0;
        }
        this.decorated().addMapping(hashIndex, hash, new MultiKey<>(k, k2, k3, k4, k5), v);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public V put(MultiKey<? extends K> multiKey, V v) {
        checkKey(multiKey);
        return (V) super.put((MultiKeyMap<K, V>) multiKey, (MultiKey<? extends K>) v);
    }

    public boolean isEqualKey(AbstractHashedMap.HashEntry<MultiKey<? extends K>, V> hashEntry, Object obj, Object obj2, Object obj3) {
        MultiKey<? extends K> key = hashEntry.getKey();
        return key.size() == 3 && (obj == key.getKey(0) || (obj != null && obj.equals(key.getKey(0)))) && ((obj2 == key.getKey(1) || (obj2 != null && obj2.equals(key.getKey(1)))) && (obj3 == key.getKey(2) || (obj3 != null && obj3.equals(key.getKey(2)))));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean removeAll(java.lang.Object r6, java.lang.Object r7) {
        /*
            r5 = this;
            org.apache.commons.collections4.MapIterator r5 = r5.mapIterator()
            r0 = 0
            r1 = r0
        L6:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L45
            java.lang.Object r2 = r5.next()
            org.apache.commons.collections4.keyvalue.MultiKey r2 = (org.apache.commons.collections4.keyvalue.MultiKey) r2
            int r3 = r2.size()
            r4 = 2
            if (r3 < r4) goto L6
            if (r6 != 0) goto L22
            java.lang.Object r3 = r2.getKey(r0)
            if (r3 != 0) goto L6
            goto L2c
        L22:
            java.lang.Object r3 = r2.getKey(r0)
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L6
        L2c:
            r3 = 1
            if (r7 != 0) goto L36
            java.lang.Object r2 = r2.getKey(r3)
            if (r2 != 0) goto L6
            goto L40
        L36:
            java.lang.Object r2 = r2.getKey(r3)
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L6
        L40:
            r5.remove()
            r1 = r3
            goto L6
        L45:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.collections4.map.MultiKeyMap.removeAll(java.lang.Object, java.lang.Object):boolean");
    }

    public boolean isEqualKey(AbstractHashedMap.HashEntry<MultiKey<? extends K>, V> hashEntry, Object obj, Object obj2, Object obj3, Object obj4) {
        MultiKey<? extends K> key = hashEntry.getKey();
        return key.size() == 4 && (obj == key.getKey(0) || (obj != null && obj.equals(key.getKey(0)))) && ((obj2 == key.getKey(1) || (obj2 != null && obj2.equals(key.getKey(1)))) && ((obj3 == key.getKey(2) || (obj3 != null && obj3.equals(key.getKey(2)))) && (obj4 == key.getKey(3) || (obj4 != null && obj4.equals(key.getKey(3))))));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0043 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x002f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean removeAll(java.lang.Object r6, java.lang.Object r7, java.lang.Object r8) {
        /*
            r5 = this;
            org.apache.commons.collections4.MapIterator r5 = r5.mapIterator()
            r0 = 0
            r1 = r0
        L6:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L59
            java.lang.Object r2 = r5.next()
            org.apache.commons.collections4.keyvalue.MultiKey r2 = (org.apache.commons.collections4.keyvalue.MultiKey) r2
            int r3 = r2.size()
            r4 = 3
            if (r3 < r4) goto L6
            if (r6 != 0) goto L22
            java.lang.Object r3 = r2.getKey(r0)
            if (r3 != 0) goto L6
            goto L2c
        L22:
            java.lang.Object r3 = r2.getKey(r0)
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L6
        L2c:
            r3 = 1
            if (r7 != 0) goto L36
            java.lang.Object r4 = r2.getKey(r3)
            if (r4 != 0) goto L6
            goto L40
        L36:
            java.lang.Object r4 = r2.getKey(r3)
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L6
        L40:
            r4 = 2
            if (r8 != 0) goto L4a
            java.lang.Object r2 = r2.getKey(r4)
            if (r2 != 0) goto L6
            goto L54
        L4a:
            java.lang.Object r2 = r2.getKey(r4)
            boolean r2 = r8.equals(r2)
            if (r2 == 0) goto L6
        L54:
            r5.remove()
            r1 = r3
            goto L6
        L59:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.collections4.map.MultiKeyMap.removeAll(java.lang.Object, java.lang.Object, java.lang.Object):boolean");
    }

    public boolean isEqualKey(AbstractHashedMap.HashEntry<MultiKey<? extends K>, V> hashEntry, Object obj, Object obj2) {
        MultiKey<? extends K> key = hashEntry.getKey();
        return key.size() == 2 && (obj == key.getKey(0) || (obj != null && obj.equals(key.getKey(0)))) && (obj2 == key.getKey(1) || (obj2 != null && obj2.equals(key.getKey(1))));
    }

    public boolean removeAll(Object obj) {
        MapIterator<MultiKey<? extends K>, V> mapIterator = mapIterator();
        boolean z = false;
        while (mapIterator.hasNext()) {
            MultiKey<? extends K> next = mapIterator.next();
            if (next.size() >= 1) {
                if (obj == null) {
                    if (next.getKey(0) == null) {
                        mapIterator.remove();
                        z = true;
                    }
                } else if (obj.equals(next.getKey(0))) {
                    mapIterator.remove();
                    z = true;
                }
            }
        }
        return z;
    }
}
