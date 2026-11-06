package org.openjdk.javax.lang.model.util;

import org.openjdk.javax.annotation.processing.SupportedSourceVersion;
import org.openjdk.javax.lang.model.SourceVersion;
import org.openjdk.javax.lang.model.type.IntersectionType;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@SupportedSourceVersion(SourceVersion.RELEASE_8)
/* loaded from: classes11.dex */
public class SimpleTypeVisitor8<R, P> extends SimpleTypeVisitor7<R, P> {
    public SimpleTypeVisitor8() {
        super(null);
    }

    @Override // org.openjdk.javax.lang.model.util.AbstractTypeVisitor6, org.openjdk.javax.lang.model.type.TypeVisitor
    public R visitIntersection(IntersectionType intersectionType, P p) {
        return defaultAction(intersectionType, p);
    }

    public SimpleTypeVisitor8(R r) {
        super(r);
    }
}
