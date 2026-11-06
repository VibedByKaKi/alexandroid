package org.openjdk.javax.lang.model.util;

import org.openjdk.javax.annotation.processing.SupportedSourceVersion;
import org.openjdk.javax.lang.model.SourceVersion;
import org.openjdk.javax.lang.model.element.VariableElement;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@SupportedSourceVersion(SourceVersion.RELEASE_7)
/* loaded from: classes11.dex */
public class SimpleElementVisitor7<R, P> extends SimpleElementVisitor6<R, P> {
    public SimpleElementVisitor7() {
        super(null);
    }

    @Override // org.openjdk.javax.lang.model.util.SimpleElementVisitor6, org.openjdk.javax.lang.model.element.ElementVisitor
    public R visitVariable(VariableElement variableElement, P p) {
        return defaultAction(variableElement, p);
    }

    public SimpleElementVisitor7(R r) {
        super(r);
    }
}
