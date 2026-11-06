package org.openjdk.javax.lang.model.util;

import org.openjdk.javax.annotation.processing.SupportedSourceVersion;
import org.openjdk.javax.lang.model.SourceVersion;
import org.openjdk.javax.lang.model.element.VariableElement;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@SupportedSourceVersion(SourceVersion.RELEASE_7)
/* loaded from: classes11.dex */
public class ElementKindVisitor7<R, P> extends ElementKindVisitor6<R, P> {
    public ElementKindVisitor7() {
        super(null);
    }

    @Override // org.openjdk.javax.lang.model.util.ElementKindVisitor6
    public R visitVariableAsResourceVariable(VariableElement variableElement, P p) {
        return defaultAction(variableElement, p);
    }

    public ElementKindVisitor7(R r) {
        super(r);
    }
}
