package org.openjdk.javax.lang.model.element;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface ElementVisitor<R, P> {
    default R visit(Element element) {
        return visit(element, null);
    }

    R visit(Element element, P p);

    R visitExecutable(ExecutableElement executableElement, P p);

    default R visitModule(ModuleElement moduleElement, P p) {
        return visitUnknown(moduleElement, p);
    }

    R visitPackage(PackageElement packageElement, P p);

    R visitType(TypeElement typeElement, P p);

    R visitTypeParameter(TypeParameterElement typeParameterElement, P p);

    R visitUnknown(Element element, P p);

    R visitVariable(VariableElement variableElement, P p);
}
