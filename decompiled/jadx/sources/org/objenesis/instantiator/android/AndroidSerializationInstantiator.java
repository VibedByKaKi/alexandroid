package org.objenesis.instantiator.android;

import com.amazon.alexa.ra.ui.fragments.smartfragment.SmartFragmentEventProcessor;
import java.io.ObjectStreamClass;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.json.XML$$ExternalSyntheticBUOutline0;
import org.objenesis.instantiator.ObjectInstantiator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class AndroidSerializationInstantiator<T> implements ObjectInstantiator<T> {
    private final Method newInstanceMethod = getNewInstanceMethod();
    private final ObjectStreamClass objectStreamClass;
    private final Class<T> type;

    public AndroidSerializationInstantiator(Class<T> cls) {
        this.type = cls;
        try {
            try {
                this.objectStreamClass = (ObjectStreamClass) ObjectStreamClass.class.getMethod("lookupAny", Class.class).invoke(null, cls);
            } catch (IllegalAccessException e) {
                XML$$ExternalSyntheticBUOutline0.m((Throwable) e);
                throw null;
            } catch (InvocationTargetException e2) {
                XML$$ExternalSyntheticBUOutline0.m((Throwable) e2);
                throw null;
            }
        } catch (NoSuchMethodException e3) {
            XML$$ExternalSyntheticBUOutline0.m((Throwable) e3);
            throw null;
        }
    }

    private static Method getNewInstanceMethod() {
        try {
            Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod(SmartFragmentEventProcessor.NEW_INSTANCE, Class.class);
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
            return cls.cast(this.newInstanceMethod.invoke(this.objectStreamClass, cls));
        } catch (IllegalAccessException e) {
            XML$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        } catch (IllegalArgumentException e2) {
            XML$$ExternalSyntheticBUOutline0.m((Throwable) e2);
            return null;
        } catch (InvocationTargetException e3) {
            XML$$ExternalSyntheticBUOutline0.m((Throwable) e3);
            return null;
        }
    }
}
