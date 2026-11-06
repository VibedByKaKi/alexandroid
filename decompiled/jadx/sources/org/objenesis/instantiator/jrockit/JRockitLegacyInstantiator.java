package org.objenesis.instantiator.jrockit;

import java.lang.reflect.Method;
import org.json.XML$$ExternalSyntheticBUOutline0;
import org.objenesis.instantiator.ObjectInstantiator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class JRockitLegacyInstantiator<T> implements ObjectInstantiator<T> {
    private static Method safeAllocObjectMethod;
    private final Class<T> type;

    public JRockitLegacyInstantiator(Class<T> cls) {
        initialize();
        this.type = cls;
    }

    private static void initialize() {
        if (safeAllocObjectMethod == null) {
            try {
                Method declaredMethod = Class.forName("jrockit.vm.MemSystem").getDeclaredMethod("safeAllocObject", Class.class);
                safeAllocObjectMethod = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (ClassNotFoundException e) {
                XML$$ExternalSyntheticBUOutline0.m((Throwable) e);
            } catch (NoSuchMethodException e2) {
                XML$$ExternalSyntheticBUOutline0.m((Throwable) e2);
            } catch (RuntimeException e3) {
                XML$$ExternalSyntheticBUOutline0.m((Throwable) e3);
            }
        }
    }

    @Override // org.objenesis.instantiator.ObjectInstantiator
    public T newInstance() {
        try {
            Class<T> cls = this.type;
            return cls.cast(safeAllocObjectMethod.invoke(null, cls));
        } catch (Exception e) {
            XML$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        }
    }
}
