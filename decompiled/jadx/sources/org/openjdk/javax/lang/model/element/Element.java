package org.openjdk.javax.lang.model.element;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Set;
import org.openjdk.javax.lang.model.AnnotatedConstruct;
import org.openjdk.javax.lang.model.type.TypeMirror;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface Element extends AnnotatedConstruct {
    <R, P> R accept(ElementVisitor<R, P> elementVisitor, P p);

    TypeMirror asType();

    boolean equals(Object obj);

    @Override // org.openjdk.javax.lang.model.AnnotatedConstruct
    <A extends Annotation> A getAnnotation(Class<A> cls);

    @Override // org.openjdk.javax.lang.model.AnnotatedConstruct
    List<? extends AnnotationMirror> getAnnotationMirrors();

    List<? extends Element> getEnclosedElements();

    Element getEnclosingElement();

    ElementKind getKind();

    Set<Modifier> getModifiers();

    Name getSimpleName();

    int hashCode();
}
