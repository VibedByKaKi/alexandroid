package org.objenesis.strategy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import org.json.XML$$ExternalSyntheticBUOutline0;
import org.objenesis.instantiator.ObjectInstantiator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class SingleInstantiatorStrategy implements InstantiatorStrategy {
    private Constructor<?> constructor;

    public <T extends ObjectInstantiator<?>> SingleInstantiatorStrategy(Class<T> cls) {
        try {
            this.constructor = cls.getConstructor(Class.class);
        } catch (NoSuchMethodException e) {
            XML$$ExternalSyntheticBUOutline0.m((Throwable) e);
            throw null;
        }
    }

    @Override // org.objenesis.strategy.InstantiatorStrategy
    public <T> ObjectInstantiator<T> newInstantiatorOf(Class<T> cls) {
        try {
            return (ObjectInstantiator) this.constructor.newInstance(cls);
        } catch (IllegalAccessException e) {
            XML$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        } catch (InstantiationException e2) {
            XML$$ExternalSyntheticBUOutline0.m((Throwable) e2);
            return null;
        } catch (InvocationTargetException e3) {
            XML$$ExternalSyntheticBUOutline0.m((Throwable) e3);
            return null;
        }
    }
}
