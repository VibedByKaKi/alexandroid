package com.amazon.coral.model.reflect;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class ServiceLoaderClassLocatorProvider {
    private static final Logger LOG = LogManager.getLogger((Class<?>) ServiceLoaderClassLocatorProvider.class);
    private static final String SERVICE_PREFIX = "META-INF/services/";

    private ServiceLoaderClassLocatorProvider() {
    }

    public static <T> Iterable<Class<? extends T>> getServiceProviders(Class<T> cls) {
        return getServiceProviders(cls, ServiceLoaderClassLocatorProvider.class.getClassLoader());
    }

    public static String getServiceResourceName(Class<?> cls) {
        return SERVICE_PREFIX.concat(cls.getName());
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
            throw new RuntimeException("Unable to read services file at " + url.toString(), e);
        }
    }

    public static <T> Iterable<Class<? extends T>> readClassesFromMetaInfo(String str, Class<T> cls, ClassLoader classLoader) {
        try {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Enumeration<URL> resources = classLoader.getResources(str);
            while (resources.hasMoreElements()) {
                for (String str2 : parse(resources.nextElement())) {
                    Class<?> loadClass = classLoader.loadClass(str2);
                    if (cls.isAssignableFrom(loadClass)) {
                        linkedHashSet.add(loadClass);
                    } else {
                        LOG.debug("Class '" + str2 + "' found in '" + str + "' is not an instance of '" + cls + "'");
                    }
                }
            }
            return linkedHashSet;
        } catch (IOException | ReflectiveOperationException e) {
            Buffer$$ExternalSyntheticBUOutline0.m(e);
            return null;
        }
    }

    public static <T> Iterable<Class<? extends T>> getServiceProviders(Class<T> cls, ClassLoader classLoader) {
        return readClassesFromMetaInfo(getServiceResourceName(cls), cls, classLoader);
    }
}
