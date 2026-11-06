package lombok.launch;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
class Main {
    private static ShadowClassLoader classLoader;

    public static synchronized ClassLoader getShadowClassLoader() {
        ShadowClassLoader shadowClassLoader;
        synchronized (Main.class) {
            try {
                if (classLoader == null) {
                    classLoader = new ShadowClassLoader(Main.class.getClassLoader(), "lombok", null, Arrays.asList(new String[0]), Arrays.asList("lombok.patcher.Symbols"));
                }
                shadowClassLoader = classLoader;
            } catch (Throwable th) {
                throw th;
            }
        }
        return shadowClassLoader;
    }

    public static void main(String[] strArr) throws Throwable {
        try {
            getShadowClassLoader().loadClass("lombok.core.Main").getMethod("main", String[].class).invoke(null, strArr);
        } catch (InvocationTargetException e) {
            throw e.getCause();
        }
    }

    public static synchronized void prependClassLoader(ClassLoader classLoader2) {
        synchronized (Main.class) {
            getShadowClassLoader();
            classLoader.prependParent(classLoader2);
        }
    }
}
