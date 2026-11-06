package com.fasterxml.jackson.databind.introspect;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class MemberKey {
    static final Class<?>[] NO_CLASSES = new Class[0];
    final Class<?>[] _argTypes;
    final String _name;

    public MemberKey(Method method) {
        this(method.getName(), method.getParameterCount() > 0 ? method.getParameterTypes() : NO_CLASSES);
    }

    public int argCount() {
        return this._argTypes.length;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != MemberKey.class) {
            return false;
        }
        MemberKey memberKey = (MemberKey) obj;
        if (!this._name.equals(memberKey._name)) {
            return false;
        }
        Class<?>[] clsArr = memberKey._argTypes;
        int length = this._argTypes.length;
        if (clsArr.length != length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (clsArr[i] != this._argTypes[i]) {
                return false;
            }
        }
        return true;
    }

    public String getName() {
        return this._name;
    }

    public int hashCode() {
        return this._name.hashCode() + this._argTypes.length;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this._name);
        sb.append(MarkdownConstants.LEFT_PARENTHESIS);
        return a$$ExternalSyntheticOutline0.m(sb, this._argTypes.length, "-args)");
    }

    public MemberKey(Constructor<?> constructor) {
        this("", constructor.getParameterCount() > 0 ? constructor.getParameterTypes() : NO_CLASSES);
    }

    public MemberKey(String str, Class<?>[] clsArr) {
        this._name = str;
        this._argTypes = clsArr == null ? NO_CLASSES : clsArr;
    }
}
