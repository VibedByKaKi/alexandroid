package com.fasterxml.jackson.databind.util;

import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import com.fasterxml.jackson.databind.JavaType;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public class TypeKey {
    protected Class<?> _class;
    protected int _hashCode;
    protected boolean _isTyped;
    protected JavaType _type;

    public TypeKey(Class<?> cls, boolean z) {
        this._class = cls;
        this._type = null;
        this._isTyped = z;
        this._hashCode = z ? typedHash(cls) : untypedHash(cls);
    }

    public static final int typedHash(Class<?> cls) {
        return cls.getName().hashCode() + 1;
    }

    public static final int untypedHash(Class<?> cls) {
        return cls.getName().hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        TypeKey typeKey = (TypeKey) obj;
        if (typeKey._isTyped != this._isTyped) {
            return false;
        }
        Class<?> cls = this._class;
        return cls != null ? typeKey._class == cls : this._type.equals(typeKey._type);
    }

    public Class<?> getRawType() {
        return this._class;
    }

    public JavaType getType() {
        return this._type;
    }

    public final int hashCode() {
        return this._hashCode;
    }

    public boolean isTyped() {
        return this._isTyped;
    }

    public final void resetTyped(Class<?> cls) {
        this._type = null;
        this._class = cls;
        this._isTyped = true;
        this._hashCode = typedHash(cls);
    }

    public final void resetUntyped(Class<?> cls) {
        this._type = null;
        this._class = cls;
        this._isTyped = false;
        this._hashCode = untypedHash(cls);
    }

    public final String toString() {
        if (this._class != null) {
            StringBuilder sb = new StringBuilder("{class: ");
            ParcelCompat$$ExternalSyntheticOutline0.m7655m((Class) this._class, sb, ", typed? ");
            return a$$ExternalSyntheticOutline0.m(sb, this._isTyped, StringSubstitutor.DEFAULT_VAR_END);
        }
        StringBuilder sb2 = new StringBuilder("{type: ");
        sb2.append(this._type);
        sb2.append(", typed? ");
        return a$$ExternalSyntheticOutline0.m(sb2, this._isTyped, StringSubstitutor.DEFAULT_VAR_END);
    }

    public static final int untypedHash(JavaType javaType) {
        return javaType.hashCode() - 1;
    }

    public static final int typedHash(JavaType javaType) {
        return javaType.hashCode() - 2;
    }

    public final void resetTyped(JavaType javaType) {
        this._type = javaType;
        this._class = null;
        this._isTyped = true;
        this._hashCode = typedHash(javaType);
    }

    public final void resetUntyped(JavaType javaType) {
        this._type = javaType;
        this._class = null;
        this._isTyped = false;
        this._hashCode = untypedHash(javaType);
    }

    public TypeKey(TypeKey typeKey) {
        this._hashCode = typeKey._hashCode;
        this._class = typeKey._class;
        this._type = typeKey._type;
        this._isTyped = typeKey._isTyped;
    }

    public TypeKey() {
    }

    public TypeKey(JavaType javaType, boolean z) {
        this._type = javaType;
        this._class = null;
        this._isTyped = z;
        this._hashCode = z ? typedHash(javaType) : untypedHash(javaType);
    }
}
