package org.apache.commons.lang.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import org.apache.commons.lang.ClassUtils;
import org.json.XML$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class FieldUtils {
    public static Field getDeclaredField(Class cls, String str, boolean z) {
        if (cls == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("The class must not be null");
            return null;
        }
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("The field name must not be null");
            return null;
        }
        try {
            Field declaredField = cls.getDeclaredField(str);
            if (MemberUtils.isAccessible(declaredField)) {
                return declaredField;
            }
            if (!z) {
                return null;
            }
            declaredField.setAccessible(true);
            return declaredField;
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    public static Field getField(Class cls, String str, boolean z) {
        Field field;
        Field declaredField;
        if (cls == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("The class must not be null");
            return null;
        }
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("The field name must not be null");
            return null;
        }
        for (Class cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
            try {
                declaredField = cls2.getDeclaredField(str);
            } catch (NoSuchFieldException unused) {
            }
            if (!Modifier.isPublic(declaredField.getModifiers())) {
                if (z) {
                    declaredField.setAccessible(true);
                } else {
                    continue;
                }
            }
            return declaredField;
        }
        Iterator it2 = ClassUtils.getAllInterfaces(cls).iterator();
        Field field2 = null;
        while (it2.hasNext()) {
            try {
                field = ((Class) it2.next()).getField(str);
            } catch (NoSuchFieldException unused2) {
            }
            if (field2 != null) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Reference to field ");
                stringBuffer.append(str);
                stringBuffer.append(" is ambiguous relative to ");
                stringBuffer.append(cls);
                stringBuffer.append("; a matching field exists on two or more implemented interfaces.");
                throw new IllegalArgumentException(stringBuffer.toString());
            }
            field2 = field;
        }
        return field2;
    }

    public static Object readDeclaredField(Object obj, String str, boolean z) throws IllegalAccessException {
        if (obj == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("target object must not be null");
            return null;
        }
        Class<?> cls = obj.getClass();
        Field declaredField = getDeclaredField(cls, str, z);
        if (declaredField != null) {
            return readField(declaredField, obj);
        }
        StringBuffer stringBuffer = new StringBuffer("Cannot locate declared field ");
        stringBuffer.append(cls.getName());
        stringBuffer.append(".");
        stringBuffer.append(str);
        XML$$ExternalSyntheticBUOutline0.m(stringBuffer);
        return null;
    }

    public static Object readDeclaredStaticField(Class cls, String str, boolean z) throws IllegalAccessException {
        Field declaredField = getDeclaredField(cls, str, z);
        if (declaredField != null) {
            return readStaticField(declaredField, false);
        }
        StringBuffer stringBuffer = new StringBuffer("Cannot locate declared field ");
        stringBuffer.append(cls.getName());
        stringBuffer.append(".");
        stringBuffer.append(str);
        XML$$ExternalSyntheticBUOutline0.m(stringBuffer);
        return null;
    }

    public static Object readField(Object obj, String str, boolean z) throws IllegalAccessException {
        if (obj == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("target object must not be null");
            return null;
        }
        Class<?> cls = obj.getClass();
        Field field = getField(cls, str, z);
        if (field != null) {
            return readField(field, obj);
        }
        StringBuffer stringBuffer = new StringBuffer("Cannot locate field ");
        stringBuffer.append(str);
        stringBuffer.append(" on ");
        stringBuffer.append(cls);
        XML$$ExternalSyntheticBUOutline0.m(stringBuffer);
        return null;
    }

    public static Object readStaticField(Field field, boolean z) throws IllegalAccessException {
        if (field == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("The field must not be null");
            return null;
        }
        if (Modifier.isStatic(field.getModifiers())) {
            return readField(field, (Object) null, z);
        }
        StringBuffer stringBuffer = new StringBuffer("The field '");
        stringBuffer.append(field.getName());
        stringBuffer.append("' is not static");
        XML$$ExternalSyntheticBUOutline0.m(stringBuffer);
        return null;
    }

    public static void writeDeclaredField(Object obj, String str, Object obj2, boolean z) throws IllegalAccessException {
        if (obj == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("target object must not be null");
            return;
        }
        Class<?> cls = obj.getClass();
        Field declaredField = getDeclaredField(cls, str, z);
        if (declaredField != null) {
            writeField(declaredField, obj, obj2);
            return;
        }
        StringBuffer stringBuffer = new StringBuffer("Cannot locate declared field ");
        stringBuffer.append(cls.getName());
        stringBuffer.append(".");
        stringBuffer.append(str);
        XML$$ExternalSyntheticBUOutline0.m(stringBuffer);
    }

    public static void writeDeclaredStaticField(Class cls, String str, Object obj, boolean z) throws IllegalAccessException {
        Field declaredField = getDeclaredField(cls, str, z);
        if (declaredField != null) {
            writeField(declaredField, (Object) null, obj);
            return;
        }
        StringBuffer stringBuffer = new StringBuffer("Cannot locate declared field ");
        stringBuffer.append(cls.getName());
        stringBuffer.append(".");
        stringBuffer.append(str);
        XML$$ExternalSyntheticBUOutline0.m(stringBuffer);
    }

    public static void writeField(Object obj, String str, Object obj2, boolean z) throws IllegalAccessException {
        if (obj == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("target object must not be null");
            return;
        }
        Class<?> cls = obj.getClass();
        Field field = getField(cls, str, z);
        if (field != null) {
            writeField(field, obj, obj2);
            return;
        }
        StringBuffer stringBuffer = new StringBuffer("Cannot locate declared field ");
        stringBuffer.append(cls.getName());
        stringBuffer.append(".");
        stringBuffer.append(str);
        XML$$ExternalSyntheticBUOutline0.m(stringBuffer);
    }

    public static void writeStaticField(Field field, Object obj, boolean z) throws IllegalAccessException {
        if (field == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("The field must not be null");
            return;
        }
        if (Modifier.isStatic(field.getModifiers())) {
            writeField(field, (Object) null, obj, z);
            return;
        }
        StringBuffer stringBuffer = new StringBuffer("The field '");
        stringBuffer.append(field.getName());
        stringBuffer.append("' is not static");
        XML$$ExternalSyntheticBUOutline0.m(stringBuffer);
    }

    public static void writeDeclaredStaticField(Class cls, String str, Object obj) throws IllegalAccessException {
        writeDeclaredStaticField(cls, str, obj, false);
    }

    public static Field getDeclaredField(Class cls, String str) {
        return getDeclaredField(cls, str, false);
    }

    public static Object readDeclaredStaticField(Class cls, String str) throws IllegalAccessException {
        return readDeclaredStaticField(cls, str, false);
    }

    public static Object readField(Field field, Object obj, boolean z) throws IllegalAccessException {
        if (field != null) {
            if (z && !field.isAccessible()) {
                field.setAccessible(true);
            } else {
                MemberUtils.setAccessibleWorkaround(field);
            }
            return field.get(obj);
        }
        Single$$ExternalSyntheticBUOutline0.m$3("The field must not be null");
        return null;
    }

    public static void writeStaticField(Field field, Object obj) throws IllegalAccessException {
        writeStaticField(field, obj, false);
    }

    public static void writeStaticField(Class cls, String str, Object obj) throws IllegalAccessException {
        writeStaticField(cls, str, obj, false);
    }

    public static void writeDeclaredField(Object obj, String str, Object obj2) throws IllegalAccessException {
        writeDeclaredField(obj, str, obj2, false);
    }

    public static void writeField(Field field, Object obj, Object obj2, boolean z) throws IllegalAccessException {
        if (field != null) {
            if (z && !field.isAccessible()) {
                field.setAccessible(true);
            } else {
                MemberUtils.setAccessibleWorkaround(field);
            }
            field.set(obj, obj2);
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("The field must not be null");
    }

    public static void writeStaticField(Class cls, String str, Object obj, boolean z) throws IllegalAccessException {
        Field field = getField(cls, str, z);
        if (field != null) {
            writeStaticField(field, obj);
            return;
        }
        StringBuffer stringBuffer = new StringBuffer("Cannot locate field ");
        stringBuffer.append(str);
        stringBuffer.append(" on ");
        stringBuffer.append(cls);
        XML$$ExternalSyntheticBUOutline0.m(stringBuffer);
    }

    public static Object readStaticField(Field field) throws IllegalAccessException {
        return readStaticField(field, false);
    }

    public static Object readDeclaredField(Object obj, String str) throws IllegalAccessException {
        return readDeclaredField(obj, str, false);
    }

    public static Object readStaticField(Class cls, String str) throws IllegalAccessException {
        return readStaticField(cls, str, false);
    }

    public static Object readField(Object obj, String str) throws IllegalAccessException {
        return readField(obj, str, false);
    }

    public static Object readStaticField(Class cls, String str, boolean z) throws IllegalAccessException {
        Field field = getField(cls, str, z);
        if (field != null) {
            return readStaticField(field, false);
        }
        StringBuffer stringBuffer = new StringBuffer("Cannot locate field ");
        stringBuffer.append(str);
        stringBuffer.append(" on ");
        stringBuffer.append(cls);
        XML$$ExternalSyntheticBUOutline0.m(stringBuffer);
        return null;
    }

    public static Object readField(Field field, Object obj) throws IllegalAccessException {
        return readField(field, obj, false);
    }

    public static void writeField(Object obj, String str, Object obj2) throws IllegalAccessException {
        writeField(obj, str, obj2, false);
    }

    public static void writeField(Field field, Object obj, Object obj2) throws IllegalAccessException {
        writeField(field, obj, obj2, false);
    }

    public static Field getField(Class cls, String str) {
        Field field = getField(cls, str, false);
        MemberUtils.setAccessibleWorkaround(field);
        return field;
    }
}
