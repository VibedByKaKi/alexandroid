package com.amazon.coral.reflect;

import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import okio.Path$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class Signature<T> implements Comparable<Signature<T>> {
    private static final HashMap<Class<?>, Class<?>> BOX = new HashMap<Class<?>, Class<?>>() { // from class: com.amazon.coral.reflect.Signature.1
        {
            put(Boolean.TYPE, Boolean.class);
            put(Byte.TYPE, Byte.class);
            put(Character.TYPE, Character.class);
            put(Double.TYPE, Double.class);
            put(Float.TYPE, Float.class);
            put(Integer.TYPE, Integer.class);
            put(Long.TYPE, Long.class);
            put(Short.TYPE, Short.class);
        }
    };
    private final int hash;
    private final String name;
    private final Class<?>[] parameter;
    private final Class<?> returnType;
    private final Class<T> type;

    public Signature(Class<T> cls, Class<?> cls2, String str, Class<?>... clsArr) {
        if (cls == null) {
            Path$$ExternalSyntheticBUOutline0.m();
            throw null;
        }
        if (str == null) {
            Path$$ExternalSyntheticBUOutline0.m();
            throw null;
        }
        if (clsArr == null) {
            Path$$ExternalSyntheticBUOutline0.m();
            throw null;
        }
        int hashCode = cls.getName().hashCode();
        for (Class<?> cls3 : clsArr) {
            if (cls3 == null) {
                Path$$ExternalSyntheticBUOutline0.m();
                throw null;
            }
            hashCode = (hashCode * 3) + cls3.getName().hashCode();
        }
        int hashCode2 = str.hashCode();
        this.type = cls;
        this.returnType = cls2;
        this.parameter = (Class[]) clsArr.clone();
        this.hash = hashCode2 + (hashCode * 3);
        this.name = str;
    }

    public boolean areParameters(Object... objArr) {
        if (objArr == null || this.parameter.length != objArr.length) {
            return false;
        }
        int i = 0;
        while (true) {
            Class<?>[] clsArr = this.parameter;
            if (i >= clsArr.length) {
                return true;
            }
            Object obj = objArr[i];
            Class<?> cls = clsArr[i];
            if (cls.isPrimitive()) {
                if (objArr[i] == null) {
                    return false;
                }
                cls = BOX.get(this.parameter[i]);
            }
            if (!cls.isInstance(objArr[i]) && objArr[i] != null) {
                return false;
            }
            i++;
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(Signature<T> signature) {
        if (signature == null) {
            return -1;
        }
        if (signature == this) {
            return 0;
        }
        int hashCode = signature.hashCode();
        int hashCode2 = hashCode();
        if (hashCode < hashCode2) {
            return -1;
        }
        if (hashCode > hashCode2) {
            return 1;
        }
        Class<?>[] clsArr = signature.parameter;
        int length = clsArr.length;
        Class<?>[] clsArr2 = this.parameter;
        if (length > clsArr2.length) {
            return clsArr.length;
        }
        if (clsArr2.length > clsArr.length) {
            return -clsArr2.length;
        }
        Class<T> cls = signature.type;
        if (cls != this.type) {
            return cls.getName().compareTo(this.type.getName());
        }
        String str = signature.name;
        String str2 = this.name;
        if (str != str2) {
            return str.compareTo(str2);
        }
        int i = 0;
        while (true) {
            Class<?>[] clsArr3 = this.parameter;
            if (i >= clsArr3.length) {
                return 0;
            }
            Class<?> cls2 = signature.parameter[i];
            if (cls2 != clsArr3[i]) {
                return cls2.getName().compareTo(this.parameter[i].getName());
            }
            i++;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof Signature) && compareTo((Signature) obj) == 0;
    }

    public String getName() {
        return this.name;
    }

    public Class<?>[] getParameters() {
        return (Class[]) this.parameter.clone();
    }

    public Class<?> getReturnType() {
        return this.returnType;
    }

    public Class<T> getType() {
        return this.type;
    }

    public int hashCode() {
        return this.hash;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getName());
        sb.append(" ");
        String m = a$$ExternalSyntheticOutline0.m(sb, AsmUtils.getInternalName(this.type), MarkdownConstants.LEFT_PARENTHESIS);
        for (int i = 0; i < this.parameter.length; i++) {
            StringBuilder m2 = BitVector$$ExternalSyntheticOutline0.m(m);
            m2.append(AsmUtils.getInternalName(this.parameter[i]));
            m = m2.toString();
            if (i < this.parameter.length - 1) {
                m = m.concat(",");
            }
        }
        return m.concat(MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public Signature(Class<T> cls, String str, Class<?>... clsArr) {
        this(cls, null, str, clsArr);
    }

    public Signature(Class<T> cls, Class<?>... clsArr) {
        this(cls, null, "<init>", clsArr);
    }
}
