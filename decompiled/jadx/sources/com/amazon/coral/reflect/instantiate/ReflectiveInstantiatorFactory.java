package com.amazon.coral.reflect.instantiate;

import com.amazon.coral.reflect.InstantiationException;
import com.amazon.coral.reflect.Instantiator;
import com.amazon.coral.reflect.InstantiatorFactory;
import com.amazon.coral.reflect.Signature;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class ReflectiveInstantiatorFactory implements InstantiatorFactory {
    private static final Logger log = LogManager.getLogger((Class<?>) ReflectiveInstantiatorFactory.class);

    private static <T> Instantiator<T> newReflectiveInstantiator(Signature<T> signature) throws Throwable {
        final Constructor<T> declaredConstructor = signature.getType().getDeclaredConstructor(signature.getParameters());
        declaredConstructor.setAccessible(true);
        return new AbstractInstantiator<T>(signature) { // from class: com.amazon.coral.reflect.instantiate.ReflectiveInstantiatorFactory.1
            @Override // com.amazon.coral.reflect.Instantiator
            public T newInstance(Object... objArr) throws InstantiationException {
                if (!getSignature().areParameters(objArr)) {
                    throw new InstantiationException("Invalid parameters");
                }
                try {
                    return (T) declaredConstructor.newInstance(objArr);
                } catch (InvocationTargetException e) {
                    throw new InstantiationException(e.getTargetException());
                } catch (Throwable th) {
                    throw new InstantiationException(th);
                }
            }
        };
    }

    @Override // com.amazon.coral.reflect.InstantiatorFactory
    public <T> Instantiator<T> newInstantiator(Class<T> cls, Class<?>... clsArr) {
        try {
            return newReflectiveInstantiator(new Signature(cls, clsArr));
        } catch (Throwable th) {
            Buffer$$ExternalSyntheticBUOutline0.m$1(th);
            return null;
        }
    }
}
