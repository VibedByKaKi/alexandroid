package org.apache.logging.log4j.util;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@InternalApi
/* loaded from: classes11.dex */
public final class EnglishEnums {
    private EnglishEnums() {
    }

    public static <T extends Enum<T>> T valueOf(Class<T> cls, String str, T t) {
        return str == null ? t : (T) Enum.valueOf(cls, Strings.toRootUpperCase(str));
    }

    public static <T extends Enum<T>> T valueOf(Class<T> cls, String str) {
        return (T) valueOf(cls, str, null);
    }
}
