package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.EnumNamingStrategy;
import com.fasterxml.jackson.databind.util.ClassUtil;
import defpackage.a$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public class EnumNamingStrategyFactory {
    private EnumNamingStrategyFactory() {
    }

    public static EnumNamingStrategy createEnumNamingStrategyInstance(Object obj, boolean z, EnumNamingStrategy enumNamingStrategy) {
        if (obj == null) {
            return enumNamingStrategy;
        }
        if (obj instanceof EnumNamingStrategy) {
            return (EnumNamingStrategy) obj;
        }
        if (!(obj instanceof Class)) {
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("AnnotationIntrospector returned EnumNamingStrategy definition of type ", ClassUtil.classNameOf(obj), "; expected type `Class<EnumNamingStrategy>` instead"));
            return null;
        }
        Class cls = (Class) obj;
        if (cls == EnumNamingStrategy.class) {
            return null;
        }
        if (EnumNamingStrategy.class.isAssignableFrom(cls)) {
            return (EnumNamingStrategy) ClassUtil.createInstance(cls, z);
        }
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("Problem with AnnotationIntrospector returned Class ", ClassUtil.classNameOf(cls), "; expected `Class<EnumNamingStrategy>`"));
        return null;
    }

    @Deprecated
    public static EnumNamingStrategy createEnumNamingStrategyInstance(Object obj, boolean z) {
        return createEnumNamingStrategyInstance(obj, z, null);
    }
}
