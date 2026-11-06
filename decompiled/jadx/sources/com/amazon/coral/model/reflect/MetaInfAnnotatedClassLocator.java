package com.amazon.coral.model.reflect;

import java.lang.annotation.Annotation;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes19.dex */
public final class MetaInfAnnotatedClassLocator {
    private MetaInfAnnotatedClassLocator() {
    }

    public static <T> Iterable<Class<? extends T>> get(Class<T> cls, Class<? extends Annotation> cls2) {
        return com.amazon.coral.util.reflection.MetaInfAnnotatedClassLocator.get(cls, cls2);
    }

    public static <T> Iterable<Class<? extends T>> get(Class<T> cls, Class<? extends Annotation> cls2, ClassLoader classLoader) {
        return com.amazon.coral.util.reflection.MetaInfAnnotatedClassLocator.get(cls, cls2, classLoader);
    }
}
