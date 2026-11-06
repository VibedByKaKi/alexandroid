package org.objenesis.instantiator;

import java.io.Serializable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class SerializationInstantiatorHelper {
    public static <T> Class<? super T> getNonSerializableSuperClass(Class<T> cls) {
        while (Serializable.class.isAssignableFrom(cls)) {
            cls = (Class<? super T>) cls.getSuperclass();
            if (cls == null) {
                throw new Error("Bad class hierarchy: No non-serializable parents");
            }
        }
        return (Class<? super T>) cls;
    }
}
