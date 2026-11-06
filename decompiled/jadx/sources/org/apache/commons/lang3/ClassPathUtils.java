package org.apache.commons.lang3;

import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class ClassPathUtils {
    @Deprecated
    public ClassPathUtils() {
    }

    public static String packageToPath(String str) {
        Objects.requireNonNull(str, "path");
        return str.replace('.', '/');
    }

    public static String pathToPackage(String str) {
        Objects.requireNonNull(str, "path");
        return str.replace('/', '.');
    }

    public static String toFullyQualifiedName(Package r1, String str) {
        Objects.requireNonNull(r1, "context");
        Objects.requireNonNull(str, "resourceName");
        return r1.getName() + "." + str;
    }

    public static String toFullyQualifiedPath(Package r1, String str) {
        Objects.requireNonNull(r1, "context");
        Objects.requireNonNull(str, "resourceName");
        return packageToPath(r1.getName()) + "/" + str;
    }

    public static String toFullyQualifiedName(Class<?> cls, String str) {
        Objects.requireNonNull(cls, "context");
        Objects.requireNonNull(str, "resourceName");
        return toFullyQualifiedName(cls.getPackage(), str);
    }

    public static String toFullyQualifiedPath(Class<?> cls, String str) {
        Objects.requireNonNull(cls, "context");
        Objects.requireNonNull(str, "resourceName");
        return toFullyQualifiedPath(cls.getPackage(), str);
    }
}
