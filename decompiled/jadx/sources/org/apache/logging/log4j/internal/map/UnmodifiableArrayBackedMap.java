package org.apache.logging.log4j.internal.map;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.BiConsumer;
import org.apache.logging.log4j.util.ReadOnlyStringMap;
import org.apache.logging.log4j.util.TriConsumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class UnmodifiableArrayBackedMap extends AbstractMap<String, String> implements ReadOnlyStringMap {
    public static final UnmodifiableArrayBackedMap EMPTY_MAP = new UnmodifiableArrayBackedMap(0);
    private static final int NUM_FIXED_ARRAY_ENTRIES = 1;
    private static final long serialVersionUID = 6849423432534211514L;
    private Object[] backingArray;
    private int numEntries;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class UnmodifiableEntry implements Map.Entry<String, String> {
        private int index;

        public UnmodifiableEntry(int i) {
            this.index = i;
        }

        @Override // java.util.Map.Entry
        public String getKey() {
            return (String) UnmodifiableArrayBackedMap.this.backingArray[UnmodifiableArrayBackedMap.getArrayIndexForKey(this.index)];
        }

        @Override // java.util.Map.Entry
        public String getValue() {
            return (String) UnmodifiableArrayBackedMap.this.backingArray[UnmodifiableArrayBackedMap.getArrayIndexForValue(this.index)];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            String str = (String) UnmodifiableArrayBackedMap.this.backingArray[UnmodifiableArrayBackedMap.getArrayIndexForKey(this.index)];
            String str2 = (String) UnmodifiableArrayBackedMap.this.backingArray[UnmodifiableArrayBackedMap.getArrayIndexForValue(this.index)];
            return Objects.hashCode(str2) ^ Objects.hashCode(str);
        }

        @Override // java.util.Map.Entry
        public String setValue(String str) {
            throw new UnsupportedOperationException("Cannot update Entry instances in UnmodifiableArrayBackedMap");
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class UnmodifiableEntryIterator implements Iterator<Map.Entry<String, String>> {
        private int index;

        private UnmodifiableEntryIterator() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < UnmodifiableArrayBackedMap.this.numEntries;
        }

        @Override // java.util.Iterator
        public Map.Entry<String, String> next() {
            UnmodifiableArrayBackedMap unmodifiableArrayBackedMap = UnmodifiableArrayBackedMap.this;
            int i = this.index;
            this.index = i + 1;
            return unmodifiableArrayBackedMap.new UnmodifiableEntry(i);
        }
    }

    private UnmodifiableArrayBackedMap(Object[] objArr) {
        this.numEntries = objArr != null ? ((Integer) objArr[0]).intValue() : 0;
        this.backingArray = objArr;
    }

    private void add(String str, String str2) {
        this.backingArray[getArrayIndexForKey(this.numEntries)] = str;
        this.backingArray[getArrayIndexForValue(this.numEntries)] = str2;
        this.numEntries++;
    }

    private void addOrOverwriteKey(String str, String str2) {
        int hashCode = str.hashCode();
        for (int i = 0; i < this.numEntries; i++) {
            if (this.backingArray[getArrayIndexForKey(i)].hashCode() == hashCode && this.backingArray[getArrayIndexForKey(i)].equals(str)) {
                this.backingArray[getArrayIndexForValue(i)] = str2;
                return;
            }
        }
        add(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getArrayIndexForKey(int i) {
        return (i * 2) + 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getArrayIndexForValue(int i) {
        return (i * 2) + 2;
    }

    public static UnmodifiableArrayBackedMap getMap(Object[] objArr) {
        return (objArr == null || objArr.length == 1) ? EMPTY_MAP : new UnmodifiableArrayBackedMap(objArr);
    }

    private void updateNumEntriesInArray() {
        this.backingArray[0] = Integer.valueOf(this.numEntries);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Instance cannot be cleared, reuse EMPTY_MAP instead.");
    }

    @Override // org.apache.logging.log4j.util.ReadOnlyStringMap
    public boolean containsKey(String str) {
        int hashCode = str.hashCode();
        for (int i = 0; i < this.numEntries; i++) {
            if (this.backingArray[getArrayIndexForKey(i)].hashCode() == hashCode && this.backingArray[getArrayIndexForKey(i)].equals(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        for (int i = 0; i < this.numEntries; i++) {
            Object obj2 = this.backingArray[getArrayIndexForValue(i)];
            if (obj == null) {
                if (obj2 == null) {
                    return true;
                }
            } else if (obj.equals(obj2)) {
                return true;
            }
        }
        return false;
    }

    public UnmodifiableArrayBackedMap copyAndPut(String str, String str2) {
        UnmodifiableArrayBackedMap unmodifiableArrayBackedMap = new UnmodifiableArrayBackedMap(this.numEntries + 1);
        int i = this.numEntries;
        if (i > 0) {
            System.arraycopy(this.backingArray, 1, unmodifiableArrayBackedMap.backingArray, 1, i * 2);
            unmodifiableArrayBackedMap.numEntries = this.numEntries;
        }
        unmodifiableArrayBackedMap.addOrOverwriteKey(str, str2);
        unmodifiableArrayBackedMap.updateNumEntriesInArray();
        return unmodifiableArrayBackedMap;
    }

    public UnmodifiableArrayBackedMap copyAndPutAll(Map<String, String> map) {
        UnmodifiableArrayBackedMap unmodifiableArrayBackedMap = new UnmodifiableArrayBackedMap(map.size() + this.numEntries);
        int i = this.numEntries;
        if (i > 0) {
            System.arraycopy(this.backingArray, 0, unmodifiableArrayBackedMap.backingArray, 0, (i * 2) + 1);
            unmodifiableArrayBackedMap.numEntries = this.numEntries;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (isEmpty()) {
                unmodifiableArrayBackedMap.add(key, value);
            } else {
                unmodifiableArrayBackedMap.addOrOverwriteKey(key, value);
            }
        }
        unmodifiableArrayBackedMap.updateNumEntriesInArray();
        return unmodifiableArrayBackedMap;
    }

    public UnmodifiableArrayBackedMap copyAndRemove(String str) {
        int i = this.numEntries - 1;
        while (true) {
            if (i < 0) {
                i = -1;
                break;
            }
            if (this.backingArray[getArrayIndexForKey(i)].hashCode() == str.hashCode() && this.backingArray[getArrayIndexForKey(i)].equals(str)) {
                break;
            }
            i--;
        }
        if (i == -1) {
            return this;
        }
        int i2 = this.numEntries;
        if (i2 == 1) {
            return EMPTY_MAP;
        }
        UnmodifiableArrayBackedMap unmodifiableArrayBackedMap = new UnmodifiableArrayBackedMap(i2);
        if (i > 0) {
            System.arraycopy(this.backingArray, 1, unmodifiableArrayBackedMap.backingArray, 1, i * 2);
        }
        int i3 = i + 1;
        int i4 = this.numEntries;
        if (i3 < i4) {
            System.arraycopy(this.backingArray, getArrayIndexForKey(i3), unmodifiableArrayBackedMap.backingArray, getArrayIndexForKey(i), (i4 - i3) * 2);
        }
        unmodifiableArrayBackedMap.numEntries = this.numEntries - 1;
        unmodifiableArrayBackedMap.updateNumEntriesInArray();
        return unmodifiableArrayBackedMap;
    }

    public UnmodifiableArrayBackedMap copyAndRemoveAll(Iterable<String> iterable) {
        Set set;
        if (isEmpty()) {
            return EMPTY_MAP;
        }
        if (iterable instanceof Set) {
            set = (Set) iterable;
        } else {
            HashSet hashSet = new HashSet();
            Iterator<String> it2 = iterable.iterator();
            while (it2.hasNext()) {
                hashSet.add(it2.next());
            }
            set = hashSet;
        }
        int i = this.numEntries;
        UnmodifiableArrayBackedMap unmodifiableArrayBackedMap = new UnmodifiableArrayBackedMap(i);
        if (set.isEmpty()) {
            System.arraycopy(this.backingArray, 0, unmodifiableArrayBackedMap.backingArray, 0, i * 2);
            unmodifiableArrayBackedMap.numEntries = i;
            return this;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = this.backingArray[getArrayIndexForKey(i3)];
            if (!set.contains(obj)) {
                Object obj2 = this.backingArray[getArrayIndexForValue(i3)];
                int arrayIndexForKey = getArrayIndexForKey(i2);
                int arrayIndexForValue = getArrayIndexForValue(i2);
                Object[] objArr = unmodifiableArrayBackedMap.backingArray;
                objArr[arrayIndexForKey] = obj;
                objArr[arrayIndexForValue] = obj2;
                i2++;
            }
        }
        unmodifiableArrayBackedMap.numEntries = i2;
        unmodifiableArrayBackedMap.updateNumEntriesInArray();
        return unmodifiableArrayBackedMap;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<String, String>> entrySet() {
        return new UnmodifiableEntrySet();
    }

    @Override // java.util.Map
    public void forEach(BiConsumer<? super String, ? super String> biConsumer) {
        for (int i = 0; i < this.numEntries; i++) {
            biConsumer.accept((String) this.backingArray[getArrayIndexForKey(i)], (String) this.backingArray[getArrayIndexForValue(i)]);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public String get(Object obj) {
        return (String) getValue((String) obj);
    }

    public Object[] getBackingArray() {
        return this.backingArray;
    }

    @Override // org.apache.logging.log4j.util.ReadOnlyStringMap
    public <V> V getValue(String str) {
        if (this.numEntries == 0) {
            return null;
        }
        int hashCode = str.hashCode();
        for (int i = 0; i < this.numEntries; i++) {
            if (this.backingArray[getArrayIndexForKey(i)].hashCode() == hashCode && this.backingArray[getArrayIndexForKey(i)].equals(str)) {
                return (V) this.backingArray[getArrayIndexForValue(i)];
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends String, ? extends String> map) {
        throw new UnsupportedOperationException("putAll() is not supported, use copyAndPutAll instead");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public String remove(Object obj) {
        throw new UnsupportedOperationException("remove() is not supported, use copyAndRemove instead");
    }

    @Override // java.util.AbstractMap, java.util.Map, org.apache.logging.log4j.util.ReadOnlyStringMap
    public int size() {
        return this.numEntries;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class UnmodifiableEntrySet extends AbstractSet<Map.Entry<String, String>> {
        private UnmodifiableEntrySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean addAll(Collection<? extends Map.Entry<String, String>> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<String, String>> iterator() {
            return new UnmodifiableEntryIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return UnmodifiableArrayBackedMap.this.numEntries;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(Map.Entry<String, String> entry) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public String put(String str, String str2) {
        throw new UnsupportedOperationException("put() is not supported, use copyAndPut instead");
    }

    @Override // org.apache.logging.log4j.util.ReadOnlyStringMap
    public Map<String, String> toMap() {
        return this;
    }

    private UnmodifiableArrayBackedMap(int i) {
        Object[] objArr = new Object[(i * 2) + 1];
        this.backingArray = objArr;
        objArr[0] = 0;
    }

    public UnmodifiableArrayBackedMap(UnmodifiableArrayBackedMap unmodifiableArrayBackedMap) {
        this.backingArray = unmodifiableArrayBackedMap.backingArray;
        this.numEntries = unmodifiableArrayBackedMap.numEntries;
    }

    @Override // org.apache.logging.log4j.util.ReadOnlyStringMap
    public <V> void forEach(org.apache.logging.log4j.util.BiConsumer<String, ? super V> biConsumer) {
        for (int i = 0; i < this.numEntries; i++) {
            biConsumer.accept((String) this.backingArray[getArrayIndexForKey(i)], this.backingArray[getArrayIndexForValue(i)]);
        }
    }

    @Override // org.apache.logging.log4j.util.ReadOnlyStringMap
    public <V, S> void forEach(TriConsumer<String, ? super V, S> triConsumer, S s) {
        for (int i = 0; i < this.numEntries; i++) {
            triConsumer.accept((String) this.backingArray[getArrayIndexForKey(i)], this.backingArray[getArrayIndexForValue(i)], s);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return containsKey((String) obj);
    }
}
