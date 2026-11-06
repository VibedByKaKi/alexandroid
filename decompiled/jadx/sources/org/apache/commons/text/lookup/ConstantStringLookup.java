package org.apache.commons.text.lookup;

import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.commons.lang3.ClassUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
class ConstantStringLookup extends AbstractStringLookup {
    private static final char FIELD_SEPARATOR = '.';
    private static final ConcurrentHashMap<String, String> CONSTANT_CACHE = new ConcurrentHashMap<>();
    static final ConstantStringLookup INSTANCE = new ConstantStringLookup();

    public static void clear() {
        CONSTANT_CACHE.clear();
    }

    public Class<?> fetchClass(String str) throws ClassNotFoundException {
        return ClassUtils.getClass(str);
    }

    @Override // org.apache.commons.text.lookup.StringLookup
    public synchronized String lookup(String str) {
        if (str == null) {
            return null;
        }
        ConcurrentHashMap<String, String> concurrentHashMap = CONSTANT_CACHE;
        String str2 = concurrentHashMap.get(str);
        if (str2 != null) {
            return str2;
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf < 0) {
            return null;
        }
        try {
            Object resolveField = resolveField(str.substring(0, lastIndexOf), str.substring(lastIndexOf + 1));
            if (resolveField != null) {
                str2 = Objects.toString(resolveField, null);
                concurrentHashMap.put(str, str2);
            }
            return str2;
        } catch (Exception unused) {
            return null;
        }
    }

    public Object resolveField(String str, String str2) throws ReflectiveOperationException {
        Class<?> fetchClass = fetchClass(str);
        if (fetchClass == null) {
            return null;
        }
        return fetchClass.getField(str2).get(null);
    }
}
