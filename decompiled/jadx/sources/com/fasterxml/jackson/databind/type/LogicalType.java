package com.fasterxml.jackson.databind.type;

import java.util.Collection;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public enum LogicalType {
    Array,
    Collection,
    Map,
    POJO,
    Untyped,
    Integer,
    Float,
    Boolean,
    Enum,
    Textual,
    Binary,
    DateTime,
    OtherScalar;

    public static LogicalType fromClass(Class<?> cls, LogicalType logicalType) {
        return cls.isEnum() ? Enum : cls.isArray() ? cls == byte[].class ? Binary : Array : Collection.class.isAssignableFrom(cls) ? Collection : Map.class.isAssignableFrom(cls) ? Map : cls == String.class ? Textual : logicalType;
    }
}
