package org.openjdk.javax.lang.model.util;

import org.openjdk.javax.annotation.processing.SupportedSourceVersion;
import org.openjdk.javax.lang.model.SourceVersion;
import org.openjdk.javax.lang.model.type.IntersectionType;
import org.openjdk.javax.lang.model.type.TypeMirror;
import org.openjdk.javax.lang.model.type.TypeVisitor;
import org.openjdk.javax.lang.model.type.UnionType;
import org.openjdk.javax.lang.model.type.UnknownTypeException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@SupportedSourceVersion(SourceVersion.RELEASE_6)
/* loaded from: classes11.dex */
public abstract class AbstractTypeVisitor6<R, P> implements TypeVisitor<R, P> {
    @Deprecated
    public AbstractTypeVisitor6() {
    }

    @Override // org.openjdk.javax.lang.model.type.TypeVisitor
    public final R visit(TypeMirror typeMirror) {
        return (R) typeMirror.accept(this, null);
    }

    @Override // org.openjdk.javax.lang.model.type.TypeVisitor
    public R visitIntersection(IntersectionType intersectionType, P p) {
        return visitUnknown(intersectionType, p);
    }

    @Override // org.openjdk.javax.lang.model.type.TypeVisitor
    public R visitUnion(UnionType unionType, P p) {
        return visitUnknown(unionType, p);
    }

    @Override // org.openjdk.javax.lang.model.type.TypeVisitor
    public R visitUnknown(TypeMirror typeMirror, P p) {
        throw new UnknownTypeException(typeMirror, p);
    }

    @Override // org.openjdk.javax.lang.model.type.TypeVisitor
    public final R visit(TypeMirror typeMirror, P p) {
        return (R) typeMirror.accept(this, p);
    }
}
