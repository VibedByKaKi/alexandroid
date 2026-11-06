package com.fasterxml.jackson.annotation;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public enum PropertyAccessor {
    GETTER,
    SETTER,
    FIELD,
    IS_GETTER,
    CREATOR,
    SCALAR_CONSTRUCTOR,
    NONE,
    ALL;

    public boolean creatorEnabled() {
        return this == CREATOR || this == ALL;
    }

    public boolean fieldEnabled() {
        return this == FIELD || this == ALL;
    }

    public boolean getterEnabled() {
        return this == GETTER || this == ALL;
    }

    public boolean isGetterEnabled() {
        return this == IS_GETTER || this == ALL;
    }

    public boolean scalarConstructorEnabled() {
        return this == SCALAR_CONSTRUCTOR || this == ALL;
    }

    public boolean setterEnabled() {
        return this == SETTER || this == ALL;
    }
}
