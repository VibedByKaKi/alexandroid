package org.openjdk.javax.lang.model.util;

import org.openjdk.javax.annotation.processing.SupportedSourceVersion;
import org.openjdk.javax.lang.model.SourceVersion;
import org.openjdk.javax.lang.model.element.Element;
import org.openjdk.javax.lang.model.element.ElementKind;
import org.openjdk.javax.lang.model.element.ExecutableElement;
import org.openjdk.javax.lang.model.element.PackageElement;
import org.openjdk.javax.lang.model.element.TypeElement;
import org.openjdk.javax.lang.model.element.TypeParameterElement;
import org.openjdk.javax.lang.model.element.VariableElement;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@SupportedSourceVersion(SourceVersion.RELEASE_6)
/* loaded from: classes11.dex */
public class SimpleElementVisitor6<R, P> extends AbstractElementVisitor6<R, P> {
    protected final R DEFAULT_VALUE;

    @Deprecated
    public SimpleElementVisitor6() {
        this.DEFAULT_VALUE = null;
    }

    public R defaultAction(Element element, P p) {
        return this.DEFAULT_VALUE;
    }

    @Override // org.openjdk.javax.lang.model.element.ElementVisitor
    public R visitExecutable(ExecutableElement executableElement, P p) {
        return defaultAction(executableElement, p);
    }

    @Override // org.openjdk.javax.lang.model.element.ElementVisitor
    public R visitPackage(PackageElement packageElement, P p) {
        return defaultAction(packageElement, p);
    }

    @Override // org.openjdk.javax.lang.model.element.ElementVisitor
    public R visitType(TypeElement typeElement, P p) {
        return defaultAction(typeElement, p);
    }

    @Override // org.openjdk.javax.lang.model.element.ElementVisitor
    public R visitTypeParameter(TypeParameterElement typeParameterElement, P p) {
        return defaultAction(typeParameterElement, p);
    }

    @Override // org.openjdk.javax.lang.model.element.ElementVisitor
    public R visitVariable(VariableElement variableElement, P p) {
        return variableElement.getKind() != ElementKind.RESOURCE_VARIABLE ? defaultAction(variableElement, p) : visitUnknown(variableElement, p);
    }

    @Deprecated
    public SimpleElementVisitor6(R r) {
        this.DEFAULT_VALUE = r;
    }
}
