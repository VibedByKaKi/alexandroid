package org.openjdk.javax.lang.model.util;

import org.openjdk.javax.annotation.processing.SupportedSourceVersion;
import org.openjdk.javax.lang.model.SourceVersion;
import org.openjdk.javax.lang.model.type.ArrayType;
import org.openjdk.javax.lang.model.type.DeclaredType;
import org.openjdk.javax.lang.model.type.ErrorType;
import org.openjdk.javax.lang.model.type.ExecutableType;
import org.openjdk.javax.lang.model.type.NoType;
import org.openjdk.javax.lang.model.type.NullType;
import org.openjdk.javax.lang.model.type.PrimitiveType;
import org.openjdk.javax.lang.model.type.TypeMirror;
import org.openjdk.javax.lang.model.type.TypeVariable;
import org.openjdk.javax.lang.model.type.WildcardType;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@SupportedSourceVersion(SourceVersion.RELEASE_6)
/* loaded from: classes11.dex */
public class SimpleTypeVisitor6<R, P> extends AbstractTypeVisitor6<R, P> {
    protected final R DEFAULT_VALUE;

    @Deprecated
    public SimpleTypeVisitor6() {
        this.DEFAULT_VALUE = null;
    }

    public R defaultAction(TypeMirror typeMirror, P p) {
        return this.DEFAULT_VALUE;
    }

    @Override // org.openjdk.javax.lang.model.type.TypeVisitor
    public R visitArray(ArrayType arrayType, P p) {
        return defaultAction(arrayType, p);
    }

    @Override // org.openjdk.javax.lang.model.type.TypeVisitor
    public R visitDeclared(DeclaredType declaredType, P p) {
        return defaultAction(declaredType, p);
    }

    @Override // org.openjdk.javax.lang.model.type.TypeVisitor
    public R visitError(ErrorType errorType, P p) {
        return defaultAction(errorType, p);
    }

    @Override // org.openjdk.javax.lang.model.type.TypeVisitor
    public R visitExecutable(ExecutableType executableType, P p) {
        return defaultAction(executableType, p);
    }

    @Override // org.openjdk.javax.lang.model.type.TypeVisitor
    public R visitNoType(NoType noType, P p) {
        return defaultAction(noType, p);
    }

    @Override // org.openjdk.javax.lang.model.type.TypeVisitor
    public R visitNull(NullType nullType, P p) {
        return defaultAction(nullType, p);
    }

    @Override // org.openjdk.javax.lang.model.type.TypeVisitor
    public R visitPrimitive(PrimitiveType primitiveType, P p) {
        return defaultAction(primitiveType, p);
    }

    @Override // org.openjdk.javax.lang.model.type.TypeVisitor
    public R visitTypeVariable(TypeVariable typeVariable, P p) {
        return defaultAction(typeVariable, p);
    }

    @Override // org.openjdk.javax.lang.model.type.TypeVisitor
    public R visitWildcard(WildcardType wildcardType, P p) {
        return defaultAction(wildcardType, p);
    }

    @Deprecated
    public SimpleTypeVisitor6(R r) {
        this.DEFAULT_VALUE = r;
    }
}
