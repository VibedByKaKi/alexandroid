package org.apache.commons.collections4;

import org.apache.commons.collections4.functors.ConstantFactory;
import org.apache.commons.collections4.functors.ExceptionFactory;
import org.apache.commons.collections4.functors.InstantiateFactory;
import org.apache.commons.collections4.functors.PrototypeFactory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class FactoryUtils {
    private FactoryUtils() {
    }

    public static <T> Factory<T> constantFactory(T t) {
        return ConstantFactory.constantFactory(t);
    }

    public static <T> Factory<T> exceptionFactory() {
        return ExceptionFactory.exceptionFactory();
    }

    public static <T> Factory<T> instantiateFactory(Class<T> cls) {
        return InstantiateFactory.instantiateFactory(cls, null, null);
    }

    public static <T> Factory<T> nullFactory() {
        return ConstantFactory.constantFactory(null);
    }

    public static <T> Factory<T> prototypeFactory(T t) {
        return PrototypeFactory.prototypeFactory(t);
    }

    public static <T> Factory<T> instantiateFactory(Class<T> cls, Class<?>[] clsArr, Object[] objArr) {
        return InstantiateFactory.instantiateFactory(cls, clsArr, objArr);
    }
}
