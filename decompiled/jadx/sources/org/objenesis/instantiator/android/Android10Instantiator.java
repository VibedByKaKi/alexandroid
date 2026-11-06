package org.objenesis.instantiator.android;

import com.amazon.alexa.ra.ui.fragments.smartfragment.SmartFragmentEventProcessor;
import java.io.ObjectInputStream;
import java.lang.reflect.Method;
import org.json.XML$$ExternalSyntheticBUOutline0;
import org.objenesis.instantiator.ObjectInstantiator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class Android10Instantiator<T> implements ObjectInstantiator<T> {
    private final Method newStaticMethod = getNewStaticMethod();
    private final Class<T> type;

    public Android10Instantiator(Class<T> cls) {
        this.type = cls;
    }

    private static Method getNewStaticMethod() {
        try {
            Method declaredMethod = ObjectInputStream.class.getDeclaredMethod(SmartFragmentEventProcessor.NEW_INSTANCE, Class.class, Class.class);
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
            return cls.cast(this.newStaticMethod.invoke(null, cls, Object.class));
        } catch (Exception e) {
            XML$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        }
    }
}
