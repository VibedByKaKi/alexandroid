package org.apache.logging.log4j.util;

import java.util.Deque;
import java.util.NoSuchElementException;
import java.util.function.Predicate;
import org.apache.logging.log4j.status.StatusLogger;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@InternalApi
/* loaded from: classes11.dex */
public final class StackLocatorUtil {
    private static volatile boolean errorLogged;
    private static StackLocator stackLocator = StackLocator.getInstance();

    private StackLocatorUtil() {
    }

    public static StackTraceElement calcLocation(String str) {
        try {
            return stackLocator.calcLocation(str);
        } catch (NoSuchElementException e) {
            if (errorLogged) {
                return null;
            }
            errorLogged = true;
            StatusLogger.getLogger().warn("Unable to locate stack trace element for {}", str, e);
            return null;
        }
    }

    @PerformanceSensitive
    public static Class<?> getCallerClass(int i) {
        return stackLocator.getCallerClass(i + 1);
    }

    @PerformanceSensitive
    public static ClassLoader getCallerClassLoader(int i) {
        Class<?> callerClass = stackLocator.getCallerClass(i + 1);
        if (callerClass != null) {
            return callerClass.getClassLoader();
        }
        return null;
    }

    @PerformanceSensitive
    public static Deque<Class<?>> getCurrentStackTrace() {
        return stackLocator.getCurrentStackTrace();
    }

    public static StackTraceElement getStackTraceElement(int i) {
        return stackLocator.getStackTraceElement(i + 1);
    }

    @PerformanceSensitive
    public static Class<?> getCallerClass(String str) {
        return getCallerClass(str, "");
    }

    @PerformanceSensitive
    public static Class<?> getCallerClass(String str, String str2) {
        return stackLocator.getCallerClass(str, str2);
    }

    @PerformanceSensitive
    public static Class<?> getCallerClass(Class<?> cls, Predicate<Class<?>> predicate) {
        return stackLocator.getCallerClass(cls, predicate);
    }

    @PerformanceSensitive
    public static Class<?> getCallerClass(Class<?> cls) {
        return stackLocator.getCallerClass(cls);
    }
}
