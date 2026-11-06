package com.google.auto.value.extension.serializable.processor;

import javax.lang.model.type.TypeMirror;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
final class PropertyMirror {
    private final String method;
    private final String name;
    private final TypeMirror type;

    public PropertyMirror(TypeMirror typeMirror, String str, String str2) {
        this.type = typeMirror;
        this.name = str;
        this.method = str2;
    }

    public String getMethod() {
        return this.method;
    }

    public String getName() {
        return this.name;
    }

    public TypeMirror getType() {
        return this.type;
    }
}
