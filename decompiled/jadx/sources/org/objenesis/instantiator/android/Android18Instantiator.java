package org.objenesis.instantiator.android;

import com.amazon.alexa.ra.ui.fragments.smartfragment.SmartFragmentEventProcessor;
import java.io.ObjectStreamClass;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.json.XML$$ExternalSyntheticBUOutline0;
import org.objenesis.instantiator.ObjectInstantiator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class Android18Instantiator<T> implements ObjectInstantiator<T> {
    private final Method newInstanceMethod = getNewInstanceMethod();
    private final Long objectConstructorId = findConstructorIdForJavaLangObjectConstructor();
    private final Class<T> type;

    public Android18Instantiator(Class<T> cls) {
        this.type = cls;
    }

    private static Long findConstructorIdForJavaLangObjectConstructor() {
        try {
            Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
            declaredMethod.setAccessible(true);
            return (Long) declaredMethod.invoke(null, Object.class);
        } catch (IllegalAccessException e) {
            XML$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        } catch (NoSuchMethodException e2) {
            XML$$ExternalSyntheticBUOutline0.m((Throwable) e2);
            return null;
        } catch (RuntimeException e3) {
            XML$$ExternalSyntheticBUOutline0.m((Throwable) e3);
            return null;
        } catch (InvocationTargetException e4) {
            XML$$ExternalSyntheticBUOutline0.m((Throwable) e4);
            return null;
        }
    }

    private static Method getNewInstanceMethod() {
        try {
            Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod(SmartFragmentEventProcessor.NEW_INSTANCE, Class.class, Long.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (NoSuchMethodException e) {
            XML$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        } catch (RuntimeException e2) {
            XML$$ExternalSyntheticBUOutline0.m((Throwable) e2);
            return null;
        }
    }

    @Override // org.objenesis.instantiator.ObjectInstantiator
    public T newInstance() {
        try {
            Class<T> cls = this.type;
            return cls.cast(this.newInstanceMethod.invoke(null, cls, this.objectConstructorId));
        } catch (Exception e) {
            XML$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        }
    }
}
