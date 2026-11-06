package org.openjdk.javax.lang.model.element;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public enum ElementKind {
    PACKAGE,
    ENUM,
    CLASS,
    ANNOTATION_TYPE,
    INTERFACE,
    ENUM_CONSTANT,
    FIELD,
    PARAMETER,
    LOCAL_VARIABLE,
    EXCEPTION_PARAMETER,
    METHOD,
    CONSTRUCTOR,
    STATIC_INIT,
    INSTANCE_INIT,
    TYPE_PARAMETER,
    OTHER,
    RESOURCE_VARIABLE,
    MODULE;

    public boolean isClass() {
        return this == CLASS || this == ENUM;
    }

    public boolean isField() {
        return this == FIELD || this == ENUM_CONSTANT;
    }

    public boolean isInterface() {
        return this == INTERFACE || this == ANNOTATION_TYPE;
    }
}
