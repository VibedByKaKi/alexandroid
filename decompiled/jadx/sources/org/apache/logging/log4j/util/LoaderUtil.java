package org.apache.logging.log4j.util;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.status.StatusLogger;
import org.openjdk.javax.tools.ToolProvider$$ExternalSyntheticLambda0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@InternalApi
/* loaded from: classes11.dex */
public final class LoaderUtil {
    public static final String IGNORE_TCCL_PROPERTY = "log4j.ignoreTCL";
    private static Boolean ignoreTCCL;
    private static final Logger LOGGER = StatusLogger.getLogger();
    static final RuntimePermission GET_CLASS_LOADER = new RuntimePermission("getClassLoader");
    static final LazyBoolean GET_CLASS_LOADER_DISABLED = new LazyBoolean(new LoaderUtil$$ExternalSyntheticLambda3());
    private static final PrivilegedAction<ClassLoader> TCCL_GETTER = new ThreadContextClassLoaderGetter();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ThreadContextClassLoaderGetter implements PrivilegedAction<ClassLoader> {
        private ThreadContextClassLoaderGetter() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.security.PrivilegedAction
        public ClassLoader run() {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            if (contextClassLoader != null) {
                return contextClassLoader;
            }
            ClassLoader thisClassLoader = LoaderUtil.getThisClassLoader();
            return (thisClassLoader != null || LoaderUtil.GET_CLASS_LOADER_DISABLED.getAsBoolean()) ? thisClassLoader : ClassLoader.getSystemClassLoader();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class UrlResource {
        private final ClassLoader classLoader;
        private final URL url;

        public UrlResource(ClassLoader classLoader, URL url) {
            this.classLoader = classLoader;
            this.url = url;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UrlResource)) {
                return false;
            }
            UrlResource urlResource = (UrlResource) obj;
            return Objects.equals(this.classLoader, urlResource.classLoader) && Objects.equals(this.url, urlResource.url);
        }

        public ClassLoader getClassLoader() {
            return this.classLoader;
        }

        public URL getUrl() {
            return this.url;
        }

        public int hashCode() {
            return Objects.hashCode(this.url) + Objects.hashCode(this.classLoader);
        }
    }

    private LoaderUtil() {
    }

    public static Collection<URL> findResources(String str, boolean z) {
        Collection<UrlResource> findUrlResources = findUrlResources(str, z);
        LinkedHashSet linkedHashSet = new LinkedHashSet(findUrlResources.size());
        Iterator<UrlResource> it2 = findUrlResources.iterator();
        while (it2.hasNext()) {
            linkedHashSet.add(it2.next().getUrl());
        }
        return linkedHashSet;
    }

    public static Collection<UrlResource> findUrlResources(String str, boolean z) {
        ClassLoader[] classLoaderArr = {z ? getThreadContextClassLoader() : null, LoaderUtil.class.getClassLoader(), GET_CLASS_LOADER_DISABLED.getAsBoolean() ? null : ClassLoader.getSystemClassLoader()};
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (int i = 0; i < 3; i++) {
            ClassLoader classLoader = classLoaderArr[i];
            if (classLoader != null) {
                try {
                    Enumeration<URL> resources = classLoader.getResources(str);
                    while (resources.hasMoreElements()) {
                        linkedHashSet.add(new UrlResource(classLoader, resources.nextElement()));
                    }
                } catch (IOException e) {
                    LOGGER.error("failed to collect resources of name `{}`", str, e);
                }
            }
        }
        return linkedHashSet;
    }

    public static ClassLoader getClassLoader(Class<?> cls, Class<?> cls2) {
        return (ClassLoader) runPrivileged(new ToolProvider$$ExternalSyntheticLambda0(cls, cls2, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ClassLoader getThisClassLoader() {
        return LoaderUtil.class.getClassLoader();
    }

    public static ClassLoader getThreadContextClassLoader() {
        try {
            return GET_CLASS_LOADER_DISABLED.getAsBoolean() ? getThisClassLoader() : (ClassLoader) runPrivileged(TCCL_GETTER);
        } catch (SecurityException unused) {
            return null;
        }
    }

    private static boolean isChild(ClassLoader classLoader, ClassLoader classLoader2) {
        if (classLoader == null || classLoader2 == null) {
            return classLoader != null;
        }
        ClassLoader parent = classLoader.getParent();
        while (parent != null && parent != classLoader2) {
            parent = parent.getParent();
        }
        return parent != null;
    }

    public static boolean isClassAvailable(String str) {
        try {
            loadClass(str);
            return true;
        } catch (ClassNotFoundException | LinkageError unused) {
            return false;
        } catch (Throwable th) {
            LOGGER.error("Unknown error while checking existence of class `{}`", str, th);
            return false;
        }
    }

    private static boolean isIgnoreTccl() {
        if (ignoreTCCL == null) {
            String stringProperty = PropertiesUtil.getProperties().getStringProperty(IGNORE_TCCL_PROPERTY, null);
            ignoreTCCL = Boolean.valueOf((stringProperty == null || "false".equalsIgnoreCase(stringProperty.trim())) ? false : true);
        }
        return ignoreTCCL.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ClassLoader lambda$getClassLoader$2(Class cls, Class cls2) {
        ClassLoader classLoader = cls == null ? null : cls.getClassLoader();
        ClassLoader classLoader2 = cls2 != null ? cls2.getClassLoader() : null;
        ClassLoader thisClassLoader = GET_CLASS_LOADER_DISABLED.getAsBoolean() ? getThisClassLoader() : Thread.currentThread().getContextClassLoader();
        if (isChild(thisClassLoader, classLoader)) {
            if (isChild(thisClassLoader, classLoader2)) {
                return thisClassLoader;
            }
        } else if (isChild(classLoader, classLoader2)) {
            return classLoader;
        }
        return classLoader2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$newCheckedInstanceOfProperty$3() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void lambda$static$0() {
        AccessController.checkPermission(GET_CLASS_LOADER);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$1() {
        if (System.getSecurityManager() == null) {
            return false;
        }
        try {
            try {
                AccessController.checkPermission(GET_CLASS_LOADER);
                return false;
            } catch (SecurityException unused) {
                return true;
            }
        } catch (SecurityException unused2) {
            AccessController.doPrivileged(new LoaderUtil$$ExternalSyntheticLambda2());
            return false;
        }
    }

    public static Class<?> loadClass(String str) throws ClassNotFoundException {
        ClassLoader thisClassLoader = isIgnoreTccl() ? getThisClassLoader() : getThreadContextClassLoader();
        if (thisClassLoader == null) {
            thisClassLoader = getThisClassLoader();
        }
        return Class.forName(str, true, thisClassLoader);
    }

    public static Class<?> loadClassUnchecked(String str) {
        try {
            return loadClass(str);
        } catch (ClassNotFoundException e) {
            NoClassDefFoundError noClassDefFoundError = new NoClassDefFoundError(e.getMessage());
            noClassDefFoundError.initCause(e);
            throw noClassDefFoundError;
        }
    }

    public static <T> T newCheckedInstanceOf(String str, Class<T> cls) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        return (T) newInstanceOf(loadClass(str).asSubclass(cls));
    }

    public static <T> T newCheckedInstanceOfProperty(String str, Class<T> cls, java.util.function.Supplier<T> supplier) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        String stringProperty = PropertiesUtil.getProperties().getStringProperty(str);
        return stringProperty == null ? supplier.get() : (T) newCheckedInstanceOf(stringProperty, cls);
    }

    public static <T> T newInstanceOf(String str) throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {
        return (T) newInstanceOf((Class) Cast.cast(loadClass(str)));
    }

    public static <T> T newInstanceOfUnchecked(Class<T> cls) {
        try {
            return (T) newInstanceOf(cls);
        } catch (IllegalAccessException e) {
            IllegalAccessError illegalAccessError = new IllegalAccessError(e.getMessage());
            illegalAccessError.initCause(e);
            throw illegalAccessError;
        } catch (InstantiationException e2) {
            InstantiationError instantiationError = new InstantiationError(e2.getMessage());
            instantiationError.initCause(e2);
            throw instantiationError;
        } catch (NoSuchMethodException e3) {
            NoSuchMethodError noSuchMethodError = new NoSuchMethodError(e3.getMessage());
            noSuchMethodError.initCause(e3);
            throw noSuchMethodError;
        } catch (InvocationTargetException e4) {
            throw new InternalException(e4.getCause());
        }
    }

    private static <T> T runPrivileged(PrivilegedAction<T> privilegedAction) {
        return System.getSecurityManager() != null ? (T) AccessController.doPrivileged(privilegedAction) : privilegedAction.run();
    }

    public static ClassLoader getClassLoader() {
        return getClassLoader(LoaderUtil.class, null);
    }

    public static <T> T newInstanceOf(Class<T> cls) throws InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        return cls.getDeclaredConstructor(null).newInstance(null);
    }

    public static <T> T newCheckedInstanceOfProperty(String str, Class<T> cls) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        return (T) newCheckedInstanceOfProperty(str, cls, new LoaderUtil$$ExternalSyntheticLambda1(0));
    }

    public static Collection<URL> findResources(String str) {
        return findResources(str, true);
    }

    public static <T> T newInstanceOfUnchecked(String str) {
        return (T) newInstanceOfUnchecked((Class) Cast.cast(loadClassUnchecked(str)));
    }

    public static <T> T newInstanceOfUnchecked(String str, Class<T> cls) {
        return (T) newInstanceOfUnchecked(loadClassUnchecked(str).asSubclass(cls));
    }
}
