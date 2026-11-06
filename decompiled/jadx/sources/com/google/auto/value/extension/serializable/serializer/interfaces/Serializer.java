package com.google.auto.value.extension.serializable.serializer.interfaces;

import autovalue.shaded.com.squareup.javapoet.CodeBlock;
import javax.lang.model.type.TypeMirror;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public interface Serializer {
    CodeBlock fromProxy(CodeBlock codeBlock);

    default boolean isIdentity() {
        return false;
    }

    TypeMirror proxyFieldType();

    CodeBlock toProxy(CodeBlock codeBlock);
}
