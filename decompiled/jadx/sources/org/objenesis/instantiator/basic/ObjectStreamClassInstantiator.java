package org.objenesis.instantiator.basic;

import com.amazon.alexa.ra.ui.fragments.smartfragment.SmartFragmentEventProcessor;
import java.io.ObjectStreamClass;
import java.lang.reflect.Method;
import org.json.XML$$ExternalSyntheticBUOutline0;
import org.objenesis.instantiator.ObjectInstantiator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class ObjectStreamClassInstantiator<T> implements ObjectInstantiator<T> {
    private static Method newInstanceMethod;
    private final ObjectStreamClass objStreamClass;

    public ObjectStreamClassInstantiator(Class<T> cls) {
        initialize();
        this.objStreamClass = ObjectStreamClass.lookup(cls);
    }

    private static void initialize() {
        if (newInstanceMethod == null) {
            try {
                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod(SmartFragmentEventProcessor.NEW_INSTANCE, null);
                newInstanceMethod = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                XML$$ExternalSyntheticBUOutline0.m((Throwable) e);
            } catch (RuntimeException e2) {
                XML$$ExternalSyntheticBUOutline0.m((Throwable) e2);
            }
        }
    }

    @Override // org.objenesis.instantiator.ObjectInstantiator
    public T newInstance() {
        try {
            return (T) newInstanceMethod.invoke(this.objStreamClass, null);
        } catch (Exception e) {
            XML$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        }
    }
}
