package org.apache.commons.lang3;

import java.net.URL;
import java.net.URLClassLoader;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class ClassLoaderUtils {
    private static final URL[] EMPTY_URL_ARRAY = new URL[0];

    @Deprecated
    public ClassLoaderUtils() {
    }

    public static URL[] getSystemURLs() {
        return getURLs(ClassLoader.getSystemClassLoader());
    }

    public static URL[] getThreadURLs() {
        return getURLs(Thread.currentThread().getContextClassLoader());
    }

    private static URL[] getURLs(ClassLoader classLoader) {
        return classLoader instanceof URLClassLoader ? ((URLClassLoader) classLoader).getURLs() : EMPTY_URL_ARRAY;
    }

    public static String toString(URLClassLoader uRLClassLoader) {
        if (uRLClassLoader == null) {
            return "null";
        }
        return uRLClassLoader + Arrays.toString(uRLClassLoader.getURLs());
    }

    public static String toString(ClassLoader classLoader) {
        if (classLoader instanceof URLClassLoader) {
            return toString((URLClassLoader) classLoader);
        }
        return Objects.toString(classLoader);
    }
}
