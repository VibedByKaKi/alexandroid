package com.amazon.coral.util.reflection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class ManifestReader {
    private static final Logger LOG = LogManager.getLogger((Class<?>) ManifestReader.class);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @FunctionalInterface
    public interface TypeMismatchHandler {
        void apply(String str, String str2, String str3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> void loadClass(ClassLoader classLoader, String str, Class<T> cls, TypeMismatchHandler typeMismatchHandler, String str2, Set<Class<? extends T>> set) {
        try {
            Class<?> loadClass = classLoader.loadClass(str);
            if (cls.isAssignableFrom(loadClass)) {
                set.add(loadClass);
            } else {
                typeMismatchHandler.apply(str, cls.getName(), str2);
            }
        } catch (ReflectiveOperationException e) {
            LOG.warn("Class not found ", str, e);
        }
    }

    private static Iterable<String> parse(URL url) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream(), StandardCharsets.UTF_8));
            try {
                ArrayList arrayList = new ArrayList();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        bufferedReader.close();
                        return arrayList;
                    }
                    if (!readLine.isEmpty()) {
                        arrayList.add(readLine);
                    }
                }
            } finally {
            }
        } catch (IOException e) {
            throw new RuntimeException("Unable to read manifest file at " + url.toString(), e);
        }
    }

    public static <T> Iterable<Class<? extends T>> readClassesFromResource(String str, Class<T> cls, ClassLoader classLoader, TypeMismatchHandler typeMismatchHandler) {
        try {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Enumeration<URL> resources = classLoader.getResources(str);
            while (resources.hasMoreElements()) {
                Iterator<String> it2 = parse(resources.nextElement()).iterator();
                while (it2.hasNext()) {
                    String str2 = str;
                    Class<T> cls2 = cls;
                    ClassLoader classLoader2 = classLoader;
                    TypeMismatchHandler typeMismatchHandler2 = typeMismatchHandler;
                    loadClass(classLoader2, it2.next(), cls2, typeMismatchHandler2, str2, linkedHashSet);
                    classLoader = classLoader2;
                    cls = cls2;
                    typeMismatchHandler = typeMismatchHandler2;
                    str = str2;
                }
            }
            return linkedHashSet;
        } catch (IOException e) {
            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        }
    }
}
