package org.apache.commons.lang3.reflect;

import org.apache.commons.lang3.BooleanUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class InheritanceUtils {
    @Deprecated
    public InheritanceUtils() {
    }

    public static int distance(Class<?> cls, Class<?> cls2) {
        if (cls != null && cls2 != null) {
            if (cls.equals(cls2)) {
                return 0;
            }
            Class<? super Object> superclass = cls.getSuperclass();
            int integer = BooleanUtils.toInteger(cls2.equals(superclass));
            if (integer == 1) {
                return integer;
            }
            int distance = distance(superclass, cls2) + integer;
            if (distance > 0) {
                return distance + 1;
            }
        }
        return -1;
    }
}
