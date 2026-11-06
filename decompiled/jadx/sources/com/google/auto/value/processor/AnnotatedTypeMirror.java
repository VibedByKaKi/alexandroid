package com.google.auto.value.processor;

import autovalue.shaded.com.google.common.base.Joiner;
import autovalue.shaded.com.google.common.collect.ImmutableList;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Collection;
import java.util.Objects;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.type.TypeKind;
import javax.lang.model.type.TypeMirror;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
final class AnnotatedTypeMirror {
    private final TypeMirror originalType;
    private final TypeMirror rewrittenType;

    public AnnotatedTypeMirror(TypeMirror typeMirror, TypeMirror typeMirror2) {
        this.originalType = typeMirror;
        this.rewrittenType = typeMirror2;
    }

    public ImmutableList<AnnotationMirror> annotations() {
        return ImmutableList.copyOf((Collection) this.originalType.getAnnotationMirrors());
    }

    public boolean equals(Object obj) {
        if (obj instanceof AnnotatedTypeMirror) {
            AnnotatedTypeMirror annotatedTypeMirror = (AnnotatedTypeMirror) obj;
            if (this.originalType == annotatedTypeMirror.originalType && this.rewrittenType == annotatedTypeMirror.rewrittenType) {
                return true;
            }
        }
        return false;
    }

    public TypeKind getKind() {
        return this.rewrittenType.getKind();
    }

    public TypeMirror getType() {
        return this.rewrittenType;
    }

    public int hashCode() {
        return Objects.hash(this.originalType, this.rewrittenType);
    }

    public String toString() {
        String join = Joiner.on(' ').join(this.originalType.getAnnotationMirrors());
        if (join.isEmpty()) {
            return this.rewrittenType.toString();
        }
        StringBuilder m1m = a$$ExternalSyntheticOutline0.m1m(join, " ");
        m1m.append(this.rewrittenType);
        return m1m.toString();
    }

    public AnnotatedTypeMirror(TypeMirror typeMirror) {
        this(typeMirror, typeMirror);
    }
}
