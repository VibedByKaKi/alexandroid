package com.google.auto.value.extension.serializable.serializer.impl;

import autovalue.shaded.com.squareup.javapoet.CodeBlock;
import com.google.auto.value.extension.serializable.serializer.interfaces.Serializer;
import javax.lang.model.type.TypeMirror;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class IdentitySerializerFactory {
    private IdentitySerializerFactory() {
    }

    public static Serializer getSerializer(TypeMirror typeMirror) {
        return new IdentitySerializer(typeMirror);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class IdentitySerializer implements Serializer {
        private final TypeMirror typeMirror;

        public IdentitySerializer(TypeMirror typeMirror) {
            this.typeMirror = typeMirror;
        }

        @Override // com.google.auto.value.extension.serializable.serializer.interfaces.Serializer
        public boolean isIdentity() {
            return true;
        }

        @Override // com.google.auto.value.extension.serializable.serializer.interfaces.Serializer
        public TypeMirror proxyFieldType() {
            return this.typeMirror;
        }

        @Override // com.google.auto.value.extension.serializable.serializer.interfaces.Serializer
        public CodeBlock fromProxy(CodeBlock codeBlock) {
            return codeBlock;
        }

        @Override // com.google.auto.value.extension.serializable.serializer.interfaces.Serializer
        public CodeBlock toProxy(CodeBlock codeBlock) {
            return codeBlock;
        }
    }
}
