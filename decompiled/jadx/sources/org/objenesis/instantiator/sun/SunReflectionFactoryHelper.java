package org.objenesis.instantiator.sun;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.json.XML$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
class SunReflectionFactoryHelper {
    private static Object createReflectionFactory(Class<?> cls) {
        try {
            return cls.getDeclaredMethod("getReflectionFactory", null).invoke(null, null);
        } catch (IllegalAccessException e) {
            XML$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        } catch (IllegalArgumentException e2) {
            XML$$ExternalSyntheticBUOutline0.m((Throwable) e2);
            return null;
        } catch (NoSuchMethodException e3) {
            XML$$ExternalSyntheticBUOutline0.m((Throwable) e3);
            return null;
        } catch (InvocationTargetException e4) {
            XML$$ExternalSyntheticBUOutline0.m((Throwable) e4);
            return null;
        }
    }

    private static Method getNewConstructorForSerializationMethod(Class<?> cls) {
        try {
            return cls.getDeclaredMethod("newConstructorForSerialization", Class.class, Constructor.class);
        } catch (NoSuchMethodException e) {
            XML$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        }
    }

    private static Class<?> getReflectionFactoryClass() {
        try {
            return Class.forName("sun.reflect.ReflectionFactory");
        } catch (ClassNotFoundException e) {
            XML$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        }
    }

    public static <T> Constructor<T> newConstructorForSerialization(Class<T> cls, Constructor<?> constructor) {
        Class<?> reflectionFactoryClass = getReflectionFactoryClass();
        try {
            return (Constructor) getNewConstructorForSerializationMethod(reflectionFactoryClass).invoke(createReflectionFactory(reflectionFactoryClass), cls, constructor);
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
