package org.objenesis.instantiator.perc;

import com.amazon.alexa.ra.ui.fragments.smartfragment.SmartFragmentEventProcessor;
import java.io.ObjectInputStream;
import java.lang.reflect.Method;
import org.json.XML$$ExternalSyntheticBUOutline0;
import org.objenesis.instantiator.ObjectInstantiator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class PercInstantiator<T> implements ObjectInstantiator<T> {
    private final Method newInstanceMethod;
    private final Object[] typeArgs;

    public PercInstantiator(Class<T> cls) {
        Object[] objArr = {null, Boolean.FALSE};
        this.typeArgs = objArr;
        objArr[0] = cls;
        try {
            Method declaredMethod = ObjectInputStream.class.getDeclaredMethod(SmartFragmentEventProcessor.NEW_INSTANCE, Class.class, Boolean.TYPE);
            this.newInstanceMethod = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException e) {
            XML$$ExternalSyntheticBUOutline0.m((Throwable) e);
            throw null;
        } catch (RuntimeException e2) {
            XML$$ExternalSyntheticBUOutline0.m((Throwable) e2);
            throw null;
        }
    }

    @Override // org.objenesis.instantiator.ObjectInstantiator
    public T newInstance() {
        try {
            return (T) this.newInstanceMethod.invoke(null, this.typeArgs);
        } catch (Exception e) {
            XML$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        }
    }
}
