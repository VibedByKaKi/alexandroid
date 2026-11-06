package org.apache.logging.log4j.util;

import ai.onnxruntime.OnnxMap$$ExternalSyntheticBUOutline0;
import com.google.common.collect.CompactHashMap$$ExternalSyntheticBUOutline0;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.apache.logging.log4j.util.internal.SerializationUtil;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@InternalApi
/* loaded from: classes11.dex */
public class SortedArrayStringMap implements IndexedStringMap {
    private static final int DEFAULT_INITIAL_CAPACITY = 4;
    private static final String FROZEN = "Frozen collection cannot be modified";
    private static final int HASHVAL = 31;
    private static final long serialVersionUID = -5748905872274478116L;
    private boolean immutable;
    private transient boolean iterating;
    private transient String[] keys;
    private transient int size;
    private int threshold;
    private transient Object[] values;
    private static final TriConsumer<String, Object, StringMap> PUT_ALL = new SortedArrayStringMap$$ExternalSyntheticLambda0();
    private static final String[] EMPTY = Strings.EMPTY_ARRAY;

    public SortedArrayStringMap(Map<String, ?> map) {
        String[] strArr = EMPTY;
        this.keys = strArr;
        this.values = strArr;
        resize(ceilingNextPowerOfTwo(map.size()));
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            putValue(Objects.toString(entry.getKey(), null), entry.getValue());
        }
    }

    private void assertNoConcurrentModification() {
        if (this.iterating) {
            OnnxMap$$ExternalSyntheticBUOutline0.m9m();
        }
    }

    private void assertNotFrozen() {
        if (this.immutable) {
            Buffer$$ExternalSyntheticBUOutline0.m$1(FROZEN);
        }
    }

    private static int ceilingNextPowerOfTwo(int i) {
        return 1 << (32 - Integer.numberOfLeadingZeros(i - 1));
    }

    private void ensureCapacity() {
        int i = this.size;
        int i2 = this.threshold;
        if (i >= i2) {
            resize(i2 * 2);
        }
    }

    private void inflateTable(int i) {
        this.threshold = i;
        this.keys = new String[i];
        this.values = new Object[i];
    }

    private void initFrom0(SortedArrayStringMap sortedArrayStringMap) {
        int length = this.keys.length;
        int i = sortedArrayStringMap.size;
        if (length < i) {
            int i2 = sortedArrayStringMap.threshold;
            this.keys = new String[i2];
            this.values = new Object[i2];
        }
        System.arraycopy(sortedArrayStringMap.keys, 0, this.keys, 0, i);
        System.arraycopy(sortedArrayStringMap.values, 0, this.values, 0, sortedArrayStringMap.size);
        this.size = sortedArrayStringMap.size;
        this.threshold = sortedArrayStringMap.threshold;
    }

    private void insertAt(int i, String str, Object obj) {
        ensureCapacity();
        String[] strArr = this.keys;
        int i2 = i + 1;
        System.arraycopy(strArr, i, strArr, i2, this.size - i);
        Object[] objArr = this.values;
        System.arraycopy(objArr, i, objArr, i2, this.size - i);
        this.keys[i] = str;
        this.values[i] = obj;
        this.size++;
    }

    private void merge(SortedArrayStringMap sortedArrayStringMap) {
        String[] strArr = this.keys;
        Object[] objArr = this.values;
        int i = sortedArrayStringMap.size + this.size;
        int ceilingNextPowerOfTwo = ceilingNextPowerOfTwo(i);
        this.threshold = ceilingNextPowerOfTwo;
        if (this.keys.length < ceilingNextPowerOfTwo) {
            this.keys = new String[ceilingNextPowerOfTwo];
            this.values = new Object[ceilingNextPowerOfTwo];
        }
        int size = sortedArrayStringMap.size();
        int size2 = size();
        String[] strArr2 = this.keys;
        boolean z = false;
        if (size > size2) {
            System.arraycopy(strArr, 0, strArr2, sortedArrayStringMap.size, this.size);
            System.arraycopy(objArr, 0, this.values, sortedArrayStringMap.size, this.size);
            System.arraycopy(sortedArrayStringMap.keys, 0, this.keys, 0, sortedArrayStringMap.size);
            System.arraycopy(sortedArrayStringMap.values, 0, this.values, 0, sortedArrayStringMap.size);
            this.size = sortedArrayStringMap.size;
        } else {
            System.arraycopy(strArr, 0, strArr2, 0, this.size);
            System.arraycopy(objArr, 0, this.values, 0, this.size);
            System.arraycopy(sortedArrayStringMap.keys, 0, this.keys, this.size, sortedArrayStringMap.size);
            System.arraycopy(sortedArrayStringMap.values, 0, this.values, this.size, sortedArrayStringMap.size);
            z = true;
        }
        int i2 = this.size;
        while (true) {
            String[] strArr3 = this.keys;
            if (i2 >= i) {
                Arrays.fill(strArr3, this.size, i, (Object) null);
                Arrays.fill(this.values, this.size, i, (Object) null);
                return;
            }
            int indexOfKey = indexOfKey(strArr3[i2]);
            if (indexOfKey < 0) {
                insertAt(~indexOfKey, this.keys[i2], this.values[i2]);
            } else if (z) {
                String[] strArr4 = this.keys;
                strArr4[indexOfKey] = strArr4[i2];
                Object[] objArr2 = this.values;
                objArr2[indexOfKey] = objArr2[i2];
            }
            i2++;
        }
    }

    private int nullKeyIndex() {
        return (this.size <= 0 || this.keys[0] != null) ? -1 : 0;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        SerializationUtil.assertFiltered(objectInputStream);
        objectInputStream.defaultReadObject();
        String[] strArr = EMPTY;
        this.keys = strArr;
        this.values = strArr;
        int readInt = objectInputStream.readInt();
        if (readInt < 0) {
            CompactHashMap$$ExternalSyntheticBUOutline0.m(a$$ExternalSyntheticOutline0.m(readInt, "Illegal capacity: "));
            return;
        }
        int readInt2 = objectInputStream.readInt();
        if (readInt2 < 0) {
            CompactHashMap$$ExternalSyntheticBUOutline0.m(a$$ExternalSyntheticOutline0.m(readInt2, "Illegal mappings count: "));
            return;
        }
        if (readInt2 > 0) {
            inflateTable(readInt);
        } else {
            this.threshold = readInt;
        }
        for (int i = 0; i < readInt2; i++) {
            this.keys[i] = (String) objectInputStream.readObject();
            this.values[i] = SerializationUtil.readWrappedObject(objectInputStream);
        }
        this.size = readInt2;
    }

    private void resize(int i) {
        String[] strArr = this.keys;
        Object[] objArr = this.values;
        String[] strArr2 = new String[i];
        this.keys = strArr2;
        this.values = new Object[i];
        System.arraycopy(strArr, 0, strArr2, 0, this.size);
        System.arraycopy(objArr, 0, this.values, 0, this.size);
        this.threshold = i;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        String[] strArr = this.keys;
        if (strArr == EMPTY) {
            objectOutputStream.writeInt(ceilingNextPowerOfTwo(this.threshold));
        } else {
            objectOutputStream.writeInt(strArr.length);
        }
        objectOutputStream.writeInt(this.size);
        if (this.size > 0) {
            for (int i = 0; i < this.size; i++) {
                objectOutputStream.writeObject(this.keys[i]);
                Object obj = this.values[i];
                SerializationUtil.writeWrappedObject(obj instanceof Serializable ? (Serializable) obj : null, objectOutputStream);
            }
        }
    }

    @Override // org.apache.logging.log4j.util.StringMap
    public void clear() {
        if (this.keys == EMPTY) {
            return;
        }
        assertNotFrozen();
        assertNoConcurrentModification();
        Arrays.fill(this.keys, 0, this.size, (Object) null);
        Arrays.fill(this.values, 0, this.size, (Object) null);
        this.size = 0;
    }

    @Override // org.apache.logging.log4j.util.ReadOnlyStringMap
    public boolean containsKey(String str) {
        return indexOfKey(str) >= 0;
    }

    @Override // org.apache.logging.log4j.util.StringMap
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ReadOnlyStringMap)) {
            return false;
        }
        ReadOnlyStringMap readOnlyStringMap = (ReadOnlyStringMap) obj;
        if (size() != readOnlyStringMap.size()) {
            return false;
        }
        return toMap().equals(readOnlyStringMap.toMap());
    }

    @Override // org.apache.logging.log4j.util.ReadOnlyStringMap
    public <V> void forEach(BiConsumer<String, ? super V> biConsumer) {
        this.iterating = true;
        for (int i = 0; i < this.size; i++) {
            try {
                biConsumer.accept(this.keys[i], this.values[i]);
            } finally {
                this.iterating = false;
            }
        }
    }

    @Override // org.apache.logging.log4j.util.StringMap
    public void freeze() {
        this.immutable = true;
    }

    @Override // org.apache.logging.log4j.util.IndexedReadOnlyStringMap
    public String getKeyAt(int i) {
        if (i < 0 || i >= this.size) {
            return null;
        }
        return this.keys[i];
    }

    @Override // org.apache.logging.log4j.util.ReadOnlyStringMap
    public <V> V getValue(String str) {
        int indexOfKey = indexOfKey(str);
        if (indexOfKey < 0) {
            return null;
        }
        return (V) this.values[indexOfKey];
    }

    @Override // org.apache.logging.log4j.util.IndexedReadOnlyStringMap
    public <V> V getValueAt(int i) {
        if (i < 0 || i >= this.size) {
            return null;
        }
        return (V) this.values[i];
    }

    @Override // org.apache.logging.log4j.util.StringMap
    public int hashCode() {
        return toMap().hashCode();
    }

    @Override // org.apache.logging.log4j.util.IndexedReadOnlyStringMap
    public int indexOfKey(String str) {
        String[] strArr = this.keys;
        if (strArr == EMPTY) {
            return -1;
        }
        if (str == null) {
            return nullKeyIndex();
        }
        int i = this.size;
        int i2 = 0;
        if (i > 0 && strArr[0] == null) {
            i2 = 1;
        }
        return Arrays.binarySearch(strArr, i2, i, str);
    }

    @Override // org.apache.logging.log4j.util.ReadOnlyStringMap
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override // org.apache.logging.log4j.util.StringMap
    public boolean isFrozen() {
        return this.immutable;
    }

    @Override // org.apache.logging.log4j.util.StringMap
    public void putAll(ReadOnlyStringMap readOnlyStringMap) {
        if (readOnlyStringMap == this || readOnlyStringMap == null || readOnlyStringMap.isEmpty()) {
            return;
        }
        assertNotFrozen();
        assertNoConcurrentModification();
        if (!(readOnlyStringMap instanceof SortedArrayStringMap)) {
            readOnlyStringMap.forEach(PUT_ALL, this);
        } else if (this.size == 0) {
            initFrom0((SortedArrayStringMap) readOnlyStringMap);
        } else {
            merge((SortedArrayStringMap) readOnlyStringMap);
        }
    }

    @Override // org.apache.logging.log4j.util.StringMap
    public void putValue(String str, Object obj) {
        assertNotFrozen();
        assertNoConcurrentModification();
        if (this.keys == EMPTY) {
            inflateTable(this.threshold);
        }
        int indexOfKey = indexOfKey(str);
        if (indexOfKey < 0) {
            insertAt(~indexOfKey, str, obj);
        } else {
            this.keys[indexOfKey] = str;
            this.values[indexOfKey] = obj;
        }
    }

    @Override // org.apache.logging.log4j.util.StringMap
    public void remove(String str) {
        int indexOfKey;
        if (this.keys != EMPTY && (indexOfKey = indexOfKey(str)) >= 0) {
            assertNotFrozen();
            assertNoConcurrentModification();
            String[] strArr = this.keys;
            int i = indexOfKey + 1;
            System.arraycopy(strArr, i, strArr, indexOfKey, (this.size - 1) - indexOfKey);
            Object[] objArr = this.values;
            System.arraycopy(objArr, i, objArr, indexOfKey, (this.size - 1) - indexOfKey);
            String[] strArr2 = this.keys;
            int i2 = this.size;
            strArr2[i2 - 1] = null;
            this.values[i2 - 1] = null;
            this.size = i2 - 1;
        }
    }

    @Override // org.apache.logging.log4j.util.ReadOnlyStringMap, java.util.Map
    public int size() {
        return this.size;
    }

    @Override // org.apache.logging.log4j.util.ReadOnlyStringMap
    public Map<String, String> toMap() {
        HashMap hashMap = new HashMap(size());
        for (int i = 0; i < size(); i++) {
            Object valueAt = getValueAt(i);
            hashMap.put(getKeyAt(i), valueAt == null ? null : String.valueOf(valueAt));
        }
        return hashMap;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(256);
        sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
        for (int i = 0; i < this.size; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(this.keys[i]);
            sb.append('=');
            Object obj = this.values[i];
            if (obj == this) {
                obj = "(this map)";
            }
            sb.append(obj);
        }
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    @Override // org.apache.logging.log4j.util.ReadOnlyStringMap
    public <V, T> void forEach(TriConsumer<String, ? super V, T> triConsumer, T t) {
        this.iterating = true;
        for (int i = 0; i < this.size; i++) {
            try {
                triConsumer.accept(this.keys[i], this.values[i], t);
            } finally {
                this.iterating = false;
            }
        }
    }

    public SortedArrayStringMap(int i) {
        String[] strArr = EMPTY;
        this.keys = strArr;
        this.values = strArr;
        if (i >= 0) {
            this.threshold = ceilingNextPowerOfTwo(i == 0 ? 1 : i);
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "Initial capacity must be at least zero but was "));
            throw null;
        }
    }

    public SortedArrayStringMap(ReadOnlyStringMap readOnlyStringMap) {
        String[] strArr = EMPTY;
        this.keys = strArr;
        this.values = strArr;
        if (readOnlyStringMap instanceof SortedArrayStringMap) {
            initFrom0((SortedArrayStringMap) readOnlyStringMap);
        } else if (readOnlyStringMap != null) {
            resize(ceilingNextPowerOfTwo(readOnlyStringMap.size()));
            readOnlyStringMap.forEach(PUT_ALL, this);
        }
    }

    public SortedArrayStringMap() {
        this(4);
    }
}
