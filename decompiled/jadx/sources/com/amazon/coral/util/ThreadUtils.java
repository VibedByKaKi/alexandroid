package com.amazon.coral.util;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class ThreadUtils {
    private static final MethodHandle IS_VIRTUAL_METHOD;

    static {
        MethodHandle methodHandle;
        try {
            methodHandle = MethodHandles.publicLookup().findVirtual(Thread.class, "isVirtual", MethodType.methodType(Boolean.TYPE));
        } catch (IllegalAccessException | NoSuchMethodException unused) {
            methodHandle = null;
        }
        IS_VIRTUAL_METHOD = methodHandle;
    }

    private ThreadUtils() {
    }

    public static boolean isCurrentThreadVirtual() {
        return isVirtual(Thread.currentThread());
    }

    public static boolean isVirtual(Thread thread) {
        MethodHandle methodHandle = IS_VIRTUAL_METHOD;
        if (methodHandle != null && thread != null) {
            try {
                return (boolean) methodHandle.invoke(thread);
            } catch (Throwable unused) {
            }
        }
        return false;
    }
}
