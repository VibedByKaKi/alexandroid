package com.fasterxml.jackson.databind.util;

import com.amazon.alexa.ra.core.data.fragments.SmartFragmentContent;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public class NativeImageUtil {
    private static final boolean RUNNING_IN_SVM;

    static {
        RUNNING_IN_SVM = System.getProperty("org.graalvm.nativeimage.imagecode") != null;
    }

    private NativeImageUtil() {
    }

    public static boolean isInNativeImage() {
        return RUNNING_IN_SVM;
    }

    public static boolean isInNativeImageAndIsAtRuntime() {
        return RUNNING_IN_SVM && SmartFragmentContent.RUNTIME.equals(System.getProperty("org.graalvm.nativeimage.imagecode"));
    }

    public static boolean isUnsupportedFeatureError(Throwable th) {
        if (!isInNativeImageAndIsAtRuntime()) {
            return false;
        }
        if (th instanceof InvocationTargetException) {
            th = th.getCause();
        }
        return th.getClass().getName().equals("com.oracle.svm.core.jdk.UnsupportedFeatureError");
    }

    public static boolean needsReflectionConfiguration(Class<?> cls) {
        if (isInNativeImageAndIsAtRuntime()) {
            return (cls.getDeclaredFields().length == 0 || ClassUtil.isRecordType(cls)) && cls.getDeclaredMethods().length == 0 && cls.getDeclaredConstructors().length == 0;
        }
        return false;
    }
}
