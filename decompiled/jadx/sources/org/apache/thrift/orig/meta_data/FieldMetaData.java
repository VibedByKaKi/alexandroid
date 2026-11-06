package org.apache.thrift.orig.meta_data;

import java.io.Serializable;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.apache.thrift.orig.TBase;
import org.apache.thrift.orig.TFieldIdEnum;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class FieldMetaData implements Serializable {
    private static final ConcurrentMap<Class<? extends TBase>, Map<? extends TFieldIdEnum, FieldMetaData>> structMap = new ConcurrentHashMap();
    private final Map<String, String> fieldAnnotations;
    public final String fieldName;
    public final byte requirementType;
    public final FieldValueMetaData valueMetaData;

    public FieldMetaData(String str, byte b, FieldValueMetaData fieldValueMetaData, Map<String, String> map) {
        this.fieldName = str;
        this.requirementType = b;
        this.valueMetaData = fieldValueMetaData;
        this.fieldAnnotations = map;
    }

    public static <T extends TBase<T, F>, F extends TFieldIdEnum> void addStructMetaDataMap(Class<T> cls, Map<F, FieldMetaData> map) {
        structMap.put(cls, map);
    }

    public static <T extends TBase<T, F>, F extends TFieldIdEnum> Map<F, FieldMetaData> getStructMetaDataMap(Class<T> cls) {
        ConcurrentMap<Class<? extends TBase>, Map<? extends TFieldIdEnum, FieldMetaData>> concurrentMap = structMap;
        if (!concurrentMap.containsKey(cls)) {
            try {
                cls.getDeclaredConstructor(null).newInstance(null);
            } catch (ReflectiveOperationException e) {
                throw new RuntimeException(e.getClass().getSimpleName() + " for TBase class: " + cls.getName(), e);
            }
        }
        return (Map) concurrentMap.get(cls);
    }

    public Map<String, String> getFieldAnnotations() {
        return Collections.unmodifiableMap(this.fieldAnnotations);
    }

    public FieldMetaData(String str, byte b, FieldValueMetaData fieldValueMetaData) {
        this(str, b, fieldValueMetaData, Collections.EMPTY_MAP);
    }
}
