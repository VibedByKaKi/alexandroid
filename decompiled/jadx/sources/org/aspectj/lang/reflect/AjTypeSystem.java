package org.aspectj.lang.reflect;

import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import org.aspectj.internal.lang.reflect.AjTypeImpl;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class AjTypeSystem {
    private static Map<Class, WeakReference<AjType>> ajTypes = Collections.synchronizedMap(new WeakHashMap());

    public static <T> AjType<T> getAjType(Class<T> cls) {
        WeakReference<AjType> weakReference = ajTypes.get(cls);
        if (weakReference == null) {
            AjTypeImpl ajTypeImpl = new AjTypeImpl(cls);
            ajTypes.put(cls, new WeakReference<>(ajTypeImpl));
            return ajTypeImpl;
        }
        AjType<T> ajType = weakReference.get();
        if (ajType != null) {
            return ajType;
        }
        AjTypeImpl ajTypeImpl2 = new AjTypeImpl(cls);
        ajTypes.put(cls, new WeakReference<>(ajTypeImpl2));
        return ajTypeImpl2;
    }
}
