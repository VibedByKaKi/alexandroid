package org.openjdk.javax.lang.model.util;

import org.openjdk.javax.annotation.processing.SupportedSourceVersion;
import org.openjdk.javax.lang.model.SourceVersion;
import org.openjdk.javax.lang.model.element.Element;
import org.openjdk.javax.lang.model.element.ElementVisitor;
import org.openjdk.javax.lang.model.element.ModuleElement;
import org.openjdk.javax.lang.model.element.UnknownElementException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@SupportedSourceVersion(SourceVersion.RELEASE_6)
/* loaded from: classes11.dex */
public abstract class AbstractElementVisitor6<R, P> implements ElementVisitor<R, P> {
    @Deprecated
    public AbstractElementVisitor6() {
    }

    @Override // org.openjdk.javax.lang.model.element.ElementVisitor
    public final R visit(Element element) {
        return (R) element.accept(this, null);
    }

    @Override // org.openjdk.javax.lang.model.element.ElementVisitor
    public R visitModule(ModuleElement moduleElement, P p) {
        return (R) super.visitModule(moduleElement, p);
    }

    @Override // org.openjdk.javax.lang.model.element.ElementVisitor
    public R visitUnknown(Element element, P p) {
        throw new UnknownElementException(element, p);
    }

    @Override // org.openjdk.javax.lang.model.element.ElementVisitor
    public final R visit(Element element, P p) {
        return (R) element.accept(this, p);
    }
}
