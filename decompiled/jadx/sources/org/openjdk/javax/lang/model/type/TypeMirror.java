package org.openjdk.javax.lang.model.type;

import org.openjdk.javax.lang.model.AnnotatedConstruct;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface TypeMirror extends AnnotatedConstruct {
    <R, P> R accept(TypeVisitor<R, P> typeVisitor, P p);

    boolean equals(Object obj);

    TypeKind getKind();

    int hashCode();

    String toString();
}
