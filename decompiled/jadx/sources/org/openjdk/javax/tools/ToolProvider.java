package org.openjdk.javax.tools;

import java.lang.reflect.InvocationTargetException;
import java.security.AccessController;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class ToolProvider {
    private static final String systemDocumentationToolModule = "jdk.javadoc";
    private static final String systemDocumentationToolName = "jdk.javadoc.internal.api.JavadocTool";
    private static final String systemJavaCompilerModule = "jdk.compiler";
    private static final String systemJavaCompilerName = "org.openjdk.tools.javac.api.JavacTool";
    private static final boolean useLegacy;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("java.lang.reflect.Module");
        } catch (Throwable unused) {
            cls = null;
        }
        useLegacy = cls == null;
    }

    public static DocumentationTool getSystemDocumentationTool() {
        return (DocumentationTool) getSystemTool(DocumentationTool.class, systemDocumentationToolModule, systemDocumentationToolName);
    }

    public static JavaCompiler getSystemJavaCompiler() {
        return (JavaCompiler) getSystemTool(JavaCompiler.class, systemJavaCompilerModule, systemJavaCompilerName);
    }

    private static <T> T getSystemTool(Class<T> cls, String str, String str2) {
        if (useLegacy) {
            try {
                return (T) Class.forName(str2, true, ClassLoader.getSystemClassLoader()).asSubclass(cls).getConstructor(null).newInstance(null);
            } catch (ReflectiveOperationException e) {
                throw new Error(e);
            }
        }
        try {
            Iterator it2 = ServiceLoader.load(cls, ClassLoader.getSystemClassLoader()).iterator();
            while (it2.hasNext()) {
                T t = (T) it2.next();
                if (matches(t, str)) {
                    return t;
                }
            }
            return null;
        } catch (ServiceConfigurationError e2) {
            throw new Error(e2);
        }
    }

    @Deprecated
    public static ClassLoader getSystemToolClassLoader() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$matches$0(Object obj, String str) {
        try {
            Object invoke = Class.class.getDeclaredMethod("getModule", null).invoke(obj.getClass(), null);
            return Boolean.valueOf(str.equals((String) invoke.getClass().getDeclaredMethod("getName", null).invoke(invoke, null)));
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return Boolean.FALSE;
        }
    }

    private static <T> boolean matches(T t, String str) {
        return ((Boolean) AccessController.doPrivileged(new ToolProvider$$ExternalSyntheticLambda0(t, str, 0))).booleanValue();
    }
}
