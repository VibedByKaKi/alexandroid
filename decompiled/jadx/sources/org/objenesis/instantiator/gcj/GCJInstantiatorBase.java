package org.objenesis.instantiator.gcj;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.Method;
import org.json.XML$$ExternalSyntheticBUOutline0;
import org.objenesis.instantiator.ObjectInstantiator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public abstract class GCJInstantiatorBase<T> implements ObjectInstantiator<T> {
    static ObjectInputStream dummyStream;
    static Method newObjectMethod;
    protected final Class<T> type;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class DummyStream extends ObjectInputStream {
    }

    public GCJInstantiatorBase(Class<T> cls) {
        this.type = cls;
        initialize();
    }

    private static void initialize() {
        if (newObjectMethod == null) {
            try {
                Method declaredMethod = ObjectInputStream.class.getDeclaredMethod("newObject", Class.class, Class.class);
                newObjectMethod = declaredMethod;
                declaredMethod.setAccessible(true);
                dummyStream = new DummyStream();
            } catch (IOException e) {
                XML$$ExternalSyntheticBUOutline0.m((Throwable) e);
            } catch (NoSuchMethodException e2) {
                XML$$ExternalSyntheticBUOutline0.m((Throwable) e2);
            } catch (RuntimeException e3) {
                XML$$ExternalSyntheticBUOutline0.m((Throwable) e3);
            }
        }
    }

    @Override // org.objenesis.instantiator.ObjectInstantiator
    public abstract T newInstance();
}
