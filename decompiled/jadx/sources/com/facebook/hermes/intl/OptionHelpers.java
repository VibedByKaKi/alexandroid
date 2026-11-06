package com.facebook.hermes.intl;

import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import java.util.Arrays;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class OptionHelpers {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum OptionType {
        BOOLEAN,
        STRING
    }

    public static Object DefaultNumberOption(String str, Object obj, Object obj2, Object obj3, Object obj4) throws JSRangeErrorException {
        if (JSObjects.isUndefined(obj)) {
            return obj4;
        }
        if (!JSObjects.isNumber(obj)) {
            throw new JSRangeErrorException(BitVector$$ExternalSyntheticOutline0.m(str, " value is invalid."));
        }
        double javaDouble = JSObjects.getJavaDouble(obj);
        if (Double.isNaN(javaDouble) || javaDouble > JSObjects.getJavaDouble(obj3) || javaDouble < JSObjects.getJavaDouble(obj2)) {
            throw new JSRangeErrorException(BitVector$$ExternalSyntheticOutline0.m(str, " value is invalid."));
        }
        return obj;
    }

    public static Object GetNumberOption(Object obj, String str, Object obj2, Object obj3, Object obj4) throws JSRangeErrorException {
        return DefaultNumberOption(str, JSObjects.Get(obj, str), obj2, obj3, obj4);
    }

    public static Object GetOption(Object obj, String str, OptionType optionType, Object obj2, Object obj3) throws JSRangeErrorException {
        Object Get = JSObjects.Get(obj, str);
        if (JSObjects.isUndefined(Get)) {
            return obj3;
        }
        if (JSObjects.isNull(Get)) {
            Get = "";
        }
        if (optionType == OptionType.BOOLEAN && !JSObjects.isBoolean(Get)) {
            Intl$$ExternalSyntheticBUOutline0.m("Boolean option expected but not found");
            return null;
        }
        if (optionType == OptionType.STRING && !JSObjects.isString(Get)) {
            Intl$$ExternalSyntheticBUOutline0.m("String option expected but not found");
            return null;
        }
        if (JSObjects.isUndefined(obj2) || Arrays.asList((Object[]) obj2).contains(Get)) {
            return Get;
        }
        Intl$$ExternalSyntheticBUOutline0.m("String option expected but not found");
        return null;
    }

    public static <T extends Enum<T>> T searchEnum(Class<T> cls, Object obj) {
        if (JSObjects.isUndefined(obj)) {
            return (T) Enum.valueOf(cls, "UNDEFINED");
        }
        if (JSObjects.isNull(obj)) {
            return null;
        }
        String javaString = JSObjects.getJavaString(obj);
        if (javaString.equals("2-digit")) {
            return (T) Enum.valueOf(cls, "DIGIT2");
        }
        for (T t : cls.getEnumConstants()) {
            if (t.name().compareToIgnoreCase(javaString) == 0) {
                return t;
            }
        }
        return null;
    }
}
