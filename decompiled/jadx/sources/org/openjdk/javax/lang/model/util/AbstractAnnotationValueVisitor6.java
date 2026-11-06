package org.openjdk.javax.lang.model.util;

import org.openjdk.javax.annotation.processing.SupportedSourceVersion;
import org.openjdk.javax.lang.model.SourceVersion;
import org.openjdk.javax.lang.model.element.AnnotationValue;
import org.openjdk.javax.lang.model.element.AnnotationValueVisitor;
import org.openjdk.javax.lang.model.element.UnknownAnnotationValueException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@SupportedSourceVersion(SourceVersion.RELEASE_6)
/* loaded from: classes11.dex */
public abstract class AbstractAnnotationValueVisitor6<R, P> implements AnnotationValueVisitor<R, P> {
    @Deprecated
    public AbstractAnnotationValueVisitor6() {
    }

    @Override // org.openjdk.javax.lang.model.element.AnnotationValueVisitor
    public final R visit(AnnotationValue annotationValue) {
        return (R) annotationValue.accept(this, null);
    }

    @Override // org.openjdk.javax.lang.model.element.AnnotationValueVisitor
    public R visitUnknown(AnnotationValue annotationValue, P p) {
        throw new UnknownAnnotationValueException(annotationValue, p);
    }

    @Override // org.openjdk.javax.lang.model.element.AnnotationValueVisitor
    public final R visit(AnnotationValue annotationValue, P p) {
        return (R) annotationValue.accept(this, p);
    }
}
