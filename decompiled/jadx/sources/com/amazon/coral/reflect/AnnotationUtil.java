package com.amazon.coral.reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class AnnotationUtil {
    private static final ClassValue<Map<MethodKey, Method>> DECLARED_METHODS = new ClassValue<Map<MethodKey, Method>>() { // from class: com.amazon.coral.reflect.AnnotationUtil.1
        @Override // java.lang.ClassValue
        /* renamed from: computeValue, reason: avoid collision after fix types in other method */
        public Map<MethodKey, Method> computeValue2(Class<?> cls) {
            Method[] declaredMethods = cls.getDeclaredMethods();
            HashMap hashMap = new HashMap(declaredMethods.length);
            for (Method method : declaredMethods) {
                if (!method.isBridge()) {
                    hashMap.put(new MethodKey(method.getName(), method.getParameterTypes()), method);
                }
            }
            return hashMap;
        }

        @Override // java.lang.ClassValue
        public /* bridge */ /* synthetic */ Map<MethodKey, Method> computeValue(Class cls) {
            return computeValue2((Class<?>) cls);
        }
    };

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class MethodKey {
        private final String name;
        private final Class<?>[] parameterTypes;

        public MethodKey(String str, Class<?>[] clsArr) {
            this.name = str;
            this.parameterTypes = clsArr;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MethodKey)) {
                return false;
            }
            MethodKey methodKey = (MethodKey) obj;
            return this.name.equals(methodKey.name) && Arrays.equals(this.parameterTypes, methodKey.parameterTypes);
        }

        public int hashCode() {
            return Arrays.hashCode(this.parameterTypes) ^ this.name.hashCode();
        }
    }

    public static <T> T getAnnotation(Class<T> cls, Method method) throws Throwable {
        MethodKey methodKey = new MethodKey(method.getName(), method.getParameterTypes());
        T t = null;
        for (Class<?> declaringClass = method.getDeclaringClass(); t == null && declaringClass != Object.class && declaringClass != null; declaringClass = declaringClass.getSuperclass()) {
            Method method2 = DECLARED_METHODS.get(declaringClass).get(methodKey);
            if (method2 != null && (t = (T) method2.getAnnotation(cls)) == null) {
                for (Class<?> cls2 : declaringClass.getInterfaces()) {
                    Method method3 = DECLARED_METHODS.get(cls2).get(methodKey);
                    if (method3 != null) {
                        t = (T) getAnnotation(cls, method3);
                    }
                }
            }
        }
        return t;
    }

    public static <T> T getAnnotation(Class<T> cls, Class<?> cls2) throws Throwable {
        Annotation annotation = (T) null;
        while (annotation == null && cls2 != Object.class && cls2 != null) {
            annotation = cls2.getAnnotation(cls);
            if (annotation == null) {
                for (Class<?> cls3 : cls2.getInterfaces()) {
                    annotation = (T) getAnnotation(cls, cls3);
                    if (annotation != null) {
                        break;
                    }
                }
            }
            cls2 = cls2.getSuperclass();
        }
        return (T) annotation;
    }
}
