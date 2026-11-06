package org.openjdk.javax.lang.model.util;

import java.util.Iterator;
import java.util.List;
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
public class ElementScanner6<R, P> extends AbstractElementVisitor6<R, P> {
    protected final R DEFAULT_VALUE;

    @Deprecated
    public ElementScanner6() {
        this.DEFAULT_VALUE = null;
    }

    public final R scan(Iterable<? extends Element> iterable, P p) {
        R r = this.DEFAULT_VALUE;
        Iterator<? extends Element> it2 = iterable.iterator();
        while (it2.hasNext()) {
            r = scan(it2.next(), (Element) p);
        }
        return r;
    }

    @Override // org.openjdk.javax.lang.model.element.ElementVisitor
    public R visitExecutable(ExecutableElement executableElement, P p) {
        return scan(executableElement.getParameters(), (List<? extends VariableElement>) p);
    }

    @Override // org.openjdk.javax.lang.model.element.ElementVisitor
    public R visitPackage(PackageElement packageElement, P p) {
        return scan(packageElement.getEnclosedElements(), (List<? extends Element>) p);
    }

    @Override // org.openjdk.javax.lang.model.element.ElementVisitor
    public R visitType(TypeElement typeElement, P p) {
        return scan(typeElement.getEnclosedElements(), (List<? extends Element>) p);
    }

    @Override // org.openjdk.javax.lang.model.element.ElementVisitor
    public R visitTypeParameter(TypeParameterElement typeParameterElement, P p) {
        return scan(typeParameterElement.getEnclosedElements(), (List<? extends Element>) p);
    }

    @Override // org.openjdk.javax.lang.model.element.ElementVisitor
    public R visitVariable(VariableElement variableElement, P p) {
        return variableElement.getKind() != ElementKind.RESOURCE_VARIABLE ? scan(variableElement.getEnclosedElements(), (List<? extends Element>) p) : visitUnknown(variableElement, p);
    }

    @Deprecated
    public ElementScanner6(R r) {
        this.DEFAULT_VALUE = r;
    }

    public R scan(Element element, P p) {
        return (R) element.accept(this, p);
    }

    public final R scan(Element element) {
        return scan(element, (Element) null);
    }
}
