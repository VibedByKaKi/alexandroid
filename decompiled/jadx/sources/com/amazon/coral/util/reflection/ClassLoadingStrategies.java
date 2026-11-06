package com.amazon.coral.util.reflection;

import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public enum ClassLoadingStrategies implements ClassLoadingStrategy {
    THREAD,
    SYSTEM,
    CURRENT;

    @Override // com.amazon.coral.util.reflection.ClassLoadingStrategy
    public Class<?> loadClassFor(String str) throws ClassNotFoundException {
        ClassLoader contextClassLoader;
        int ordinal = ordinal();
        if (ordinal == 0) {
            contextClassLoader = Thread.currentThread().getContextClassLoader();
        } else if (ordinal == 1) {
            contextClassLoader = ClassLoader.getSystemClassLoader();
        } else {
            if (ordinal != 2) {
                Single$$ExternalSyntheticBUOutline0.m$2("Unknown ClassLoadingStrategy");
                return null;
            }
            contextClassLoader = ClassLoadingStrategies.class.getClassLoader();
        }
        return contextClassLoader.loadClass(str);
    }
}
