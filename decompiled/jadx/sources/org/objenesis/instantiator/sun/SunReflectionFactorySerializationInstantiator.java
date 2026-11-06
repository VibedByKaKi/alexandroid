package org.objenesis.instantiator.sun;

import java.io.NotSerializableException;
import java.lang.reflect.Constructor;
import org.json.XML$$ExternalSyntheticBUOutline0;
import org.objenesis.instantiator.ObjectInstantiator;
import org.objenesis.instantiator.SerializationInstantiatorHelper;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class SunReflectionFactorySerializationInstantiator<T> implements ObjectInstantiator<T> {
    private final Constructor<T> mungedConstructor;

    public SunReflectionFactorySerializationInstantiator(Class<T> cls) {
        try {
            Constructor<T> newConstructorForSerialization = SunReflectionFactoryHelper.newConstructorForSerialization(cls, SerializationInstantiatorHelper.getNonSerializableSuperClass(cls).getConstructor(null));
            this.mungedConstructor = newConstructorForSerialization;
            newConstructorForSerialization.setAccessible(true);
        } catch (NoSuchMethodException unused) {
            XML$$ExternalSyntheticBUOutline0.m((Throwable) new NotSerializableException(cls + " has no suitable superclass constructor"));
            throw null;
        }
    }

    @Override // org.objenesis.instantiator.ObjectInstantiator
    public T newInstance() {
        try {
            return this.mungedConstructor.newInstance(null);
        } catch (Exception e) {
            XML$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        }
    }
}
