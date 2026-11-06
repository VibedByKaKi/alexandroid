package com.amazon.coral.model.basic;

import com.amazon.coral.model.EnumJavaTraits;
import com.amazon.coral.model.HttpErrorTraits;
import com.amazon.coral.model.Traits;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class TraitsHelper {
    private TraitsHelper() {
        throw new UnsupportedOperationException();
    }

    public static boolean compareTraits(Map<Class<? extends Traits>, Traits> map, Map<Class<? extends Traits>, Traits> map2) {
        return doCompare(map, map2) && doCompare(map2, map);
    }

    private static boolean doCompare(Map<Class<? extends Traits>, Traits> map, Map<Class<? extends Traits>, Traits> map2) {
        try {
            for (Map.Entry<Class<? extends Traits>, Traits> entry : map.entrySet()) {
                Class<? extends Traits> key = entry.getKey();
                if (!isExcluded(key)) {
                    Traits value = entry.getValue();
                    if (value == null) {
                        if (map2.get(key) != null || !map2.containsKey(key)) {
                            return false;
                        }
                    } else if (!value.equals(map2.get(key))) {
                        return false;
                    }
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static boolean isExcluded(Class<?> cls) {
        return HttpErrorTraits.class.equals(cls) || EnumJavaTraits.class.equals(cls);
    }
}
