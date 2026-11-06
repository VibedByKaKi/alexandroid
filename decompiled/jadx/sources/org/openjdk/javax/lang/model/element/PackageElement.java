package org.openjdk.javax.lang.model.element;

import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface PackageElement extends Element, QualifiedNameable {
    @Override // org.openjdk.javax.lang.model.element.Element
    List<? extends Element> getEnclosedElements();

    @Override // org.openjdk.javax.lang.model.element.Element
    Element getEnclosingElement();

    @Override // org.openjdk.javax.lang.model.element.QualifiedNameable
    Name getQualifiedName();

    @Override // org.openjdk.javax.lang.model.element.Element
    Name getSimpleName();

    boolean isUnnamed();
}
