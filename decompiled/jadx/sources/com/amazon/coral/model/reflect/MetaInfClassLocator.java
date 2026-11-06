package com.amazon.coral.model.reflect;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes19.dex */
public enum MetaInfClassLocator {
    SERVICES(com.amazon.coral.util.reflection.MetaInfClassLocator.SERVICES),
    CLASSES(com.amazon.coral.util.reflection.MetaInfClassLocator.CLASSES);

    private com.amazon.coral.util.reflection.MetaInfClassLocator delegate;

    MetaInfClassLocator(com.amazon.coral.util.reflection.MetaInfClassLocator metaInfClassLocator) {
        this.delegate = metaInfClassLocator;
    }

    @Deprecated
    public <T> Iterable<Class<? extends T>> get(Class<T> cls) {
        return this.delegate.get(cls);
    }

    @Deprecated
    public <T> Iterable<Class<? extends T>> get(Class<T> cls, ClassLoader classLoader) {
        return this.delegate.get(cls, classLoader);
    }
}
