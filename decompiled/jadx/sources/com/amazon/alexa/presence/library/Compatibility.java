package com.amazon.alexa.presence.library;

import android.annotation.TargetApi;
import java.util.concurrent.Callable;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final class Compatibility {
    private Compatibility() {
    }

    private static <T> T call(Callable<T> callable) {
        try {
            return callable.call();
        } catch (Exception e) {
            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        }
    }

    public static <T> T ifAndroidMOrLater(Callable<T> callable) {
        if (isAndroidMOrLater()) {
            return (T) whenIsAndroidMOrLater(callable);
        }
        return null;
    }

    public static <T> T ifAndroidNOrLater(Callable<T> callable) {
        if (isAndroidNOrLater()) {
            return (T) whenIsAndroidNOrLater(callable);
        }
        return null;
    }

    public static <T> T ifAndroidOOrLater(Callable<T> callable, Callable<T> callable2) {
        return isAndroidOOrLater() ? (T) whenIsAndroidOOrLater(callable) : (T) call(callable2);
    }

    public static boolean isAndroidMOrLater() {
        return true;
    }

    public static boolean isAndroidNOrLater() {
        return true;
    }

    public static boolean isAndroidOOrLater() {
        return true;
    }

    @TargetApi(23)
    private static <T> T whenIsAndroidMOrLater(Callable<T> callable) {
        try {
            return callable.call();
        } catch (Exception e) {
            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        }
    }

    @TargetApi(24)
    private static <T> T whenIsAndroidNOrLater(Callable<T> callable) {
        try {
            return callable.call();
        } catch (Exception e) {
            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        }
    }

    @TargetApi(26)
    private static <T> T whenIsAndroidOOrLater(Callable<T> callable) {
        try {
            return callable.call();
        } catch (Exception e) {
            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        }
    }

    public static <T> T ifAndroidOOrLater(Callable<T> callable) {
        if (isAndroidOOrLater()) {
            return (T) whenIsAndroidOOrLater(callable);
        }
        return null;
    }
}
