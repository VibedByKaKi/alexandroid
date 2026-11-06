package org.objenesis.instantiator.sun;

import java.lang.reflect.Field;
import org.json.XML$$ExternalSyntheticBUOutline0;
import org.objenesis.instantiator.ObjectInstantiator;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class UnsafeFactoryInstantiator<T> implements ObjectInstantiator<T> {
    private static Unsafe unsafe;
    private final Class<T> type;

    public UnsafeFactoryInstantiator(Class<T> cls) {
        if (unsafe == null) {
            try {
                Field declaredField = Unsafe.class.getDeclaredField("theUnsafe");
                declaredField.setAccessible(true);
                try {
                    unsafe = (Unsafe) declaredField.get(null);
                } catch (IllegalAccessException e) {
                    XML$$ExternalSyntheticBUOutline0.m((Throwable) e);
                    throw null;
                }
            } catch (NoSuchFieldException e2) {
                XML$$ExternalSyntheticBUOutline0.m((Throwable) e2);
                throw null;
            }
        }
        this.type = cls;
    }

    @Override // org.objenesis.instantiator.ObjectInstantiator
    public T newInstance() {
        try {
            Class<T> cls = this.type;
            return cls.cast(unsafe.allocateInstance(cls));
        } catch (InstantiationException e) {
            XML$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        }
    }
}
