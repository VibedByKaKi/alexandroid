package org.apache.thrift.orig.partial;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import org.apache.thrift.orig.TEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class EnumCache {
    private static final Logger LOG = LoggerFactory.getLogger((Class<?>) EnumCache.class);
    private Map<Class<? extends TEnum>, Map<Integer, TEnum>> classMap = new HashMap();

    private Map<Integer, TEnum> addClass(Class<? extends TEnum> cls) {
        try {
            TEnum[] tEnumArr = (TEnum[]) cls.getMethod("values", null).invoke(null, null);
            HashMap hashMap = new HashMap();
            for (TEnum tEnum : tEnumArr) {
                hashMap.put(Integer.valueOf(tEnum.getValue()), tEnum);
            }
            this.classMap.put(cls, hashMap);
            return hashMap;
        } catch (IllegalAccessException e) {
            LOG.error("Enum.values() method should be public!", (Throwable) e);
            return null;
        } catch (NoSuchMethodException e2) {
            LOG.error("enum class does not have values() method", (Throwable) e2);
            return null;
        } catch (InvocationTargetException e3) {
            LOG.error("Enum.values() threw exception", (Throwable) e3);
            return null;
        }
    }

    public TEnum get(Class<? extends TEnum> cls, int i) {
        Validate.checkNotNull(cls, "enumClass");
        Map<Integer, TEnum> map = this.classMap.get(cls);
        if (map == null && (map = addClass(cls)) == null) {
            return null;
        }
        return map.get(Integer.valueOf(i));
    }
}
