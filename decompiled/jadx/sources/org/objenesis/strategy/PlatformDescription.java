package org.objenesis.strategy;

import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.apache.commons.lang3.SystemProperties;
import org.json.XML$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final class PlatformDescription {
    public static final String DALVIK = "Dalvik";
    public static final String GNU = "GNU libgcj";
    public static final String JROCKIT = "BEA";
    public static final String OPENJDK = "OpenJDK";
    public static final String PERC = "PERC";
    public static final String SUN = "Java HotSpot";
    public static final String SPECIFICATION_VERSION = System.getProperty(SystemProperties.JAVA_SPECIFICATION_VERSION);
    public static final String VM_VERSION = System.getProperty(SystemProperties.JAVA_RUNTIME_VERSION);
    public static final String VM_INFO = System.getProperty(SystemProperties.JAVA_VM_INFO);
    public static final String VENDOR_VERSION = System.getProperty(SystemProperties.JAVA_VM_VERSION);
    public static final String VENDOR = System.getProperty(SystemProperties.JAVA_VM_VENDOR);
    public static final String JVM_NAME = System.getProperty(SystemProperties.JAVA_VM_NAME);
    public static final int ANDROID_VERSION = getAndroidVersion();

    private PlatformDescription() {
    }

    private static int getAndroidVersion() {
        if (isThisJVM(DALVIK)) {
            return getAndroidVersion0();
        }
        return 0;
    }

    private static int getAndroidVersion0() {
        try {
            Class<?> cls = Class.forName("android.os.Build$VERSION");
            try {
                try {
                    return ((Integer) cls.getField("SDK_INT").get(null)).intValue();
                } catch (IllegalAccessException e) {
                    Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e);
                    return 0;
                }
            } catch (NoSuchFieldException unused) {
                return getOldAndroidVersion(cls);
            }
        } catch (ClassNotFoundException e2) {
            XML$$ExternalSyntheticBUOutline0.m((Throwable) e2);
            return 0;
        }
    }

    private static int getOldAndroidVersion(Class<?> cls) {
        try {
            try {
                return Integer.parseInt((String) cls.getField("SDK").get(null));
            } catch (IllegalAccessException e) {
                Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e);
                return 0;
            }
        } catch (NoSuchFieldException e2) {
            XML$$ExternalSyntheticBUOutline0.m((Throwable) e2);
            return 0;
        }
    }

    public static boolean isThisJVM(String str) {
        return JVM_NAME.startsWith(str);
    }
}
