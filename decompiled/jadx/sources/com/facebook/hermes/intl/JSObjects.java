package com.facebook.hermes.intl;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class JSObjects {
    private static Object s_null;
    private static Object s_undefined;

    static {
        int i = 0;
        s_undefined = new UndefinedObject(i);
        s_null = new NullObject(i);
    }

    public static Object Get(Object obj, String str) {
        HashMap hashMap = (HashMap) obj;
        if (!hashMap.containsKey(str)) {
            return Undefined();
        }
        Object obj2 = hashMap.get(str);
        return obj2 == null ? Null() : obj2;
    }

    public static Object Null() {
        return s_null;
    }

    public static void Put(Object obj, String str, Object obj2) {
        ((HashMap) obj).put(str, obj2);
    }

    public static Object Undefined() {
        return s_undefined;
    }

    public static boolean getJavaBoolean(Object obj) {
        return ((Boolean) obj).booleanValue();
    }

    public static double getJavaDouble(Object obj) {
        return ((Double) obj).doubleValue();
    }

    public static Map<String, Object> getJavaMap(Object obj) {
        return (HashMap) obj;
    }

    public static String getJavaString(Object obj) {
        return (String) obj;
    }

    public static boolean isArray(Object obj) {
        return obj instanceof Object[];
    }

    public static boolean isBoolean(Object obj) {
        return obj instanceof Boolean;
    }

    public static boolean isNull(Object obj) {
        return obj instanceof NullObject;
    }

    public static boolean isNumber(Object obj) {
        return obj instanceof Double;
    }

    public static boolean isObject(Object obj) {
        return obj instanceof HashMap;
    }

    public static boolean isString(Object obj) {
        return obj instanceof String;
    }

    public static boolean isUndefined(Object obj) {
        return obj instanceof UndefinedObject;
    }

    public static Object newBoolean(boolean z) {
        return Boolean.valueOf(z);
    }

    public static Object newNumber(double d) {
        return Double.valueOf(d);
    }

    public static Object newObject() {
        return new HashMap();
    }

    public static Object newString() {
        return new String();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class NullObject {
        public /* synthetic */ NullObject(int i) {
            this();
        }

        private NullObject() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class UndefinedObject {
        public /* synthetic */ UndefinedObject(int i) {
            this();
        }

        private UndefinedObject() {
        }
    }

    public static Object newBoolean() {
        return Boolean.FALSE;
    }

    public static Object newBoolean(String str) {
        return Boolean.valueOf(str);
    }

    public static Object newString(String str) {
        return str;
    }
}
