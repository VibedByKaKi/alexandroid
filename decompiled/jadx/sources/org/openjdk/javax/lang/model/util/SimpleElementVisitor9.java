package org.openjdk.javax.lang.model.util;

import org.openjdk.javax.annotation.processing.SupportedSourceVersion;
import org.openjdk.javax.lang.model.SourceVersion;
import org.openjdk.javax.lang.model.element.ModuleElement;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@SupportedSourceVersion(SourceVersion.RELEASE_9)
/* loaded from: classes11.dex */
public class SimpleElementVisitor9<R, P> extends SimpleElementVisitor8<R, P> {
    public SimpleElementVisitor9() {
        super(null);
    }

    @Override // org.openjdk.javax.lang.model.util.AbstractElementVisitor6, org.openjdk.javax.lang.model.element.ElementVisitor
    public R visitModule(ModuleElement moduleElement, P p) {
        return defaultAction(moduleElement, p);
    }

    public SimpleElementVisitor9(R r) {
        super(r);
    }
}
