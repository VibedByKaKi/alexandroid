package org.apache.commons.lang.p002enum;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class EnumUtils {
    public static ValuedEnum getEnum(Class cls, int i) {
        return (ValuedEnum) ValuedEnum.getEnum(cls, i);
    }

    public static List getEnumList(Class cls) {
        return Enum.getEnumList(cls);
    }

    public static Map getEnumMap(Class cls) {
        return Enum.getEnumMap(cls);
    }

    public static Iterator iterator(Class cls) {
        return Enum.getEnumList(cls).iterator();
    }

    public static Enum getEnum(Class cls, String str) {
        return Enum.getEnum(cls, str);
    }
}
