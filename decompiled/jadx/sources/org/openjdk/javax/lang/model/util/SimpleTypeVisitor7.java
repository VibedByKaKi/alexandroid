package org.openjdk.javax.lang.model.util;

import org.openjdk.javax.annotation.processing.SupportedSourceVersion;
import org.openjdk.javax.lang.model.SourceVersion;
import org.openjdk.javax.lang.model.type.UnionType;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@SupportedSourceVersion(SourceVersion.RELEASE_7)
/* loaded from: classes11.dex */
public class SimpleTypeVisitor7<R, P> extends SimpleTypeVisitor6<R, P> {
    public SimpleTypeVisitor7() {
        super(null);
    }

    @Override // org.openjdk.javax.lang.model.util.AbstractTypeVisitor6, org.openjdk.javax.lang.model.type.TypeVisitor
    public R visitUnion(UnionType unionType, P p) {
        return defaultAction(unionType, p);
    }

    public SimpleTypeVisitor7(R r) {
        super(r);
    }
}
