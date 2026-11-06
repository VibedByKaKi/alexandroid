package org.openjdk.javax.lang.model.element;

import java.util.List;
import org.openjdk.javax.lang.model.type.TypeMirror;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface ExecutableElement extends Element, Parameterizable {
    AnnotationValue getDefaultValue();

    List<? extends VariableElement> getParameters();

    TypeMirror getReceiverType();

    TypeMirror getReturnType();

    @Override // org.openjdk.javax.lang.model.element.Element
    Name getSimpleName();

    List<? extends TypeMirror> getThrownTypes();

    @Override // org.openjdk.javax.lang.model.element.Parameterizable
    List<? extends TypeParameterElement> getTypeParameters();

    boolean isDefault();

    boolean isVarArgs();
}
