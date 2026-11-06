package org.apache.commons.lang.builder;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import org.apache.commons.lang.ArrayUtils;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class ReflectionToStringBuilder extends ToStringBuilder {
    private boolean appendStatics;
    private boolean appendTransients;
    private String[] excludeFieldNames;
    private Class upToClass;

    public ReflectionToStringBuilder(Object obj, ToStringStyle toStringStyle, StringBuffer stringBuffer, Class cls, boolean z, boolean z2) {
        super(obj, toStringStyle, stringBuffer);
        this.appendStatics = false;
        this.appendTransients = false;
        this.upToClass = null;
        setUpToClass(cls);
        setAppendTransients(z);
        setAppendStatics(z2);
    }

    public static String[] toNoNullStringArray(Object[] objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj.toString());
            }
        }
        return (String[]) arrayList.toArray(ArrayUtils.EMPTY_STRING_ARRAY);
    }

    public static String toStringExclude(Object obj, String[] strArr) {
        return new ReflectionToStringBuilder(obj).setExcludeFieldNames(strArr).toString();
    }

    public boolean accept(Field field) {
        if (field.getName().indexOf(36) != -1) {
            return false;
        }
        if (Modifier.isTransient(field.getModifiers()) && !isAppendTransients()) {
            return false;
        }
        if (!Modifier.isStatic(field.getModifiers()) || isAppendStatics()) {
            return getExcludeFieldNames() == null || Arrays.binarySearch(getExcludeFieldNames(), field.getName()) < 0;
        }
        return false;
    }

    public void appendFieldsIn(Class cls) {
        if (cls.isArray()) {
            reflectionAppendArray(getObject());
            return;
        }
        Field[] declaredFields = cls.getDeclaredFields();
        AccessibleObject.setAccessible(declaredFields, true);
        for (Field field : declaredFields) {
            String name = field.getName();
            if (accept(field)) {
                try {
                    append(name, getValue(field));
                } catch (IllegalAccessException e) {
                    StringBuffer stringBuffer = new StringBuffer("Unexpected IllegalAccessException: ");
                    stringBuffer.append(e.getMessage());
                    throw new InternalError(stringBuffer.toString());
                }
            }
        }
    }

    public String[] getExcludeFieldNames() {
        return this.excludeFieldNames;
    }

    public Class getUpToClass() {
        return this.upToClass;
    }

    public Object getValue(Field field) throws IllegalArgumentException, IllegalAccessException {
        return field.get(getObject());
    }

    public boolean isAppendStatics() {
        return this.appendStatics;
    }

    public boolean isAppendTransients() {
        return this.appendTransients;
    }

    public ToStringBuilder reflectionAppendArray(Object obj) {
        getStyle().reflectionAppendArrayDetail(getStringBuffer(), null, obj);
        return this;
    }

    public void setAppendStatics(boolean z) {
        this.appendStatics = z;
    }

    public void setAppendTransients(boolean z) {
        this.appendTransients = z;
    }

    public ReflectionToStringBuilder setExcludeFieldNames(String[] strArr) {
        if (strArr == null) {
            this.excludeFieldNames = null;
            return this;
        }
        String[] noNullStringArray = toNoNullStringArray(strArr);
        this.excludeFieldNames = noNullStringArray;
        Arrays.sort(noNullStringArray);
        return this;
    }

    public void setUpToClass(Class cls) {
        Object object;
        if (cls == null || (object = getObject()) == null || cls.isInstance(object)) {
            this.upToClass = cls;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("Specified class is not a superclass of the object");
        }
    }

    @Override // org.apache.commons.lang.builder.ToStringBuilder
    public String toString() {
        if (getObject() == null) {
            return getStyle().getNullText();
        }
        Class<?> cls = getObject().getClass();
        appendFieldsIn(cls);
        while (cls.getSuperclass() != null && cls != getUpToClass()) {
            cls = cls.getSuperclass();
            appendFieldsIn(cls);
        }
        return super.toString();
    }

    public static String toStringExclude(Object obj, Collection collection) {
        return toStringExclude(obj, toNoNullStringArray(collection));
    }

    public static String toStringExclude(Object obj, String str) {
        return toStringExclude(obj, new String[]{str});
    }

    public ReflectionToStringBuilder(Object obj, ToStringStyle toStringStyle) {
        super(obj, toStringStyle);
        this.appendStatics = false;
        this.appendTransients = false;
        this.upToClass = null;
    }

    public ReflectionToStringBuilder(Object obj, ToStringStyle toStringStyle, StringBuffer stringBuffer) {
        super(obj, toStringStyle, stringBuffer);
        this.appendStatics = false;
        this.appendTransients = false;
        this.upToClass = null;
    }

    public ReflectionToStringBuilder(Object obj, ToStringStyle toStringStyle, StringBuffer stringBuffer, Class cls, boolean z) {
        super(obj, toStringStyle, stringBuffer);
        this.appendStatics = false;
        this.appendTransients = false;
        this.upToClass = null;
        setUpToClass(cls);
        setAppendTransients(z);
    }

    public static String[] toNoNullStringArray(Collection collection) {
        if (collection == null) {
            return ArrayUtils.EMPTY_STRING_ARRAY;
        }
        return toNoNullStringArray(collection.toArray());
    }

    public ReflectionToStringBuilder(Object obj) {
        super(obj);
        this.appendStatics = false;
        this.appendTransients = false;
        this.upToClass = null;
    }

    public static String toString(Object obj, ToStringStyle toStringStyle) {
        return toString(obj, toStringStyle, false, false, null);
    }

    public static String toString(Object obj, ToStringStyle toStringStyle, boolean z) {
        return toString(obj, toStringStyle, z, false, null);
    }

    public static String toString(Object obj, ToStringStyle toStringStyle, boolean z, boolean z2) {
        return toString(obj, toStringStyle, z, z2, null);
    }

    public static String toString(Object obj, ToStringStyle toStringStyle, boolean z, boolean z2, Class cls) {
        return new ReflectionToStringBuilder(obj, toStringStyle, null, cls, z, z2).toString();
    }

    public static String toString(Object obj, ToStringStyle toStringStyle, boolean z, Class cls) {
        return new ReflectionToStringBuilder(obj, toStringStyle, null, cls, z).toString();
    }

    public static String toString(Object obj) {
        return toString(obj, null, false, false, null);
    }
}
