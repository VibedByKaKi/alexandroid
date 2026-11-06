package org.openjdk.javax.lang.model.element;

import java.util.List;
import org.openjdk.javax.lang.model.type.TypeMirror;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface TypeElement extends Element, Parameterizable, QualifiedNameable {
    @Override // org.openjdk.javax.lang.model.element.Element
    List<? extends Element> getEnclosedElements();

    @Override // org.openjdk.javax.lang.model.element.Element
    Element getEnclosingElement();

    List<? extends TypeMirror> getInterfaces();

    NestingKind getNestingKind();

    @Override // org.openjdk.javax.lang.model.element.QualifiedNameable
    Name getQualifiedName();

    @Override // org.openjdk.javax.lang.model.element.Element
    Name getSimpleName();

    TypeMirror getSuperclass();

    @Override // org.openjdk.javax.lang.model.element.Parameterizable
    List<? extends TypeParameterElement> getTypeParameters();
}
