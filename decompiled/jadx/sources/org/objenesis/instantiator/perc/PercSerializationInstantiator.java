package org.objenesis.instantiator.perc;

import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.json.XML$$ExternalSyntheticBUOutline0;
import org.objenesis.instantiator.ObjectInstantiator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class PercSerializationInstantiator<T> implements ObjectInstantiator<T> {
    private final Method newInstanceMethod;
    private Object[] typeArgs;

    public PercSerializationInstantiator(Class<T> cls) {
        Class<T> cls2 = cls;
        while (Serializable.class.isAssignableFrom(cls2)) {
            cls2 = cls2.getSuperclass();
        }
        try {
            Method declaredMethod = ObjectInputStream.class.getDeclaredMethod("noArgConstruct", Class.class, Object.class, Class.forName("COM.newmonics.PercClassLoader.Method"));
            this.newInstanceMethod = declaredMethod;
            declaredMethod.setAccessible(true);
            Object invoke = Class.forName("COM.newmonics.PercClassLoader.PercClass").getDeclaredMethod("getPercClass", Class.class).invoke(null, cls2);
            this.typeArgs = new Object[]{cls2, cls, invoke.getClass().getDeclaredMethod("findMethod", String.class).invoke(invoke, "<init>()V")};
        } catch (ClassNotFoundException e) {
            XML$$ExternalSyntheticBUOutline0.m((Throwable) e);
            throw null;
        } catch (IllegalAccessException e2) {
            XML$$ExternalSyntheticBUOutline0.m((Throwable) e2);
            throw null;
        } catch (NoSuchMethodException e3) {
            XML$$ExternalSyntheticBUOutline0.m((Throwable) e3);
            throw null;
        } catch (InvocationTargetException e4) {
            XML$$ExternalSyntheticBUOutline0.m((Throwable) e4);
            throw null;
        }
    }

    @Override // org.objenesis.instantiator.ObjectInstantiator
    public T newInstance() {
        try {
            return (T) this.newInstanceMethod.invoke(null, this.typeArgs);
        } catch (IllegalAccessException e) {
            XML$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        } catch (InvocationTargetException e2) {
            XML$$ExternalSyntheticBUOutline0.m((Throwable) e2);
            return null;
        }
    }
}
