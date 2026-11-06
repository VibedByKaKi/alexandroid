package org.openjdk.javax.lang.model.util;

import java.util.List;
import org.openjdk.javax.annotation.processing.SupportedSourceVersion;
import org.openjdk.javax.lang.model.SourceVersion;
import org.openjdk.javax.lang.model.element.AnnotationMirror;
import org.openjdk.javax.lang.model.element.AnnotationValue;
import org.openjdk.javax.lang.model.element.VariableElement;
import org.openjdk.javax.lang.model.type.TypeMirror;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@SupportedSourceVersion(SourceVersion.RELEASE_6)
/* loaded from: classes11.dex */
public class SimpleAnnotationValueVisitor6<R, P> extends AbstractAnnotationValueVisitor6<R, P> {
    protected final R DEFAULT_VALUE;

    @Deprecated
    public SimpleAnnotationValueVisitor6() {
        this.DEFAULT_VALUE = null;
    }

    public R defaultAction(Object obj, P p) {
        return this.DEFAULT_VALUE;
    }

    @Override // org.openjdk.javax.lang.model.element.AnnotationValueVisitor
    public R visitAnnotation(AnnotationMirror annotationMirror, P p) {
        return defaultAction(annotationMirror, p);
    }

    @Override // org.openjdk.javax.lang.model.element.AnnotationValueVisitor
    public R visitArray(List<? extends AnnotationValue> list, P p) {
        return defaultAction(list, p);
    }

    @Override // org.openjdk.javax.lang.model.element.AnnotationValueVisitor
    public R visitBoolean(boolean z, P p) {
        return defaultAction(Boolean.valueOf(z), p);
    }

    @Override // org.openjdk.javax.lang.model.element.AnnotationValueVisitor
    public R visitByte(byte b, P p) {
        return defaultAction(Byte.valueOf(b), p);
    }

    @Override // org.openjdk.javax.lang.model.element.AnnotationValueVisitor
    public R visitChar(char c, P p) {
        return defaultAction(Character.valueOf(c), p);
    }

    @Override // org.openjdk.javax.lang.model.element.AnnotationValueVisitor
    public R visitDouble(double d, P p) {
        return defaultAction(Double.valueOf(d), p);
    }

    @Override // org.openjdk.javax.lang.model.element.AnnotationValueVisitor
    public R visitEnumConstant(VariableElement variableElement, P p) {
        return defaultAction(variableElement, p);
    }

    @Override // org.openjdk.javax.lang.model.element.AnnotationValueVisitor
    public R visitFloat(float f, P p) {
        return defaultAction(Float.valueOf(f), p);
    }

    @Override // org.openjdk.javax.lang.model.element.AnnotationValueVisitor
    public R visitInt(int i, P p) {
        return defaultAction(Integer.valueOf(i), p);
    }

    @Override // org.openjdk.javax.lang.model.element.AnnotationValueVisitor
    public R visitLong(long j, P p) {
        return defaultAction(Long.valueOf(j), p);
    }

    @Override // org.openjdk.javax.lang.model.element.AnnotationValueVisitor
    public R visitShort(short s, P p) {
        return defaultAction(Short.valueOf(s), p);
    }

    @Override // org.openjdk.javax.lang.model.element.AnnotationValueVisitor
    public R visitString(String str, P p) {
        return defaultAction(str, p);
    }

    @Override // org.openjdk.javax.lang.model.element.AnnotationValueVisitor
    public R visitType(TypeMirror typeMirror, P p) {
        return defaultAction(typeMirror, p);
    }

    @Deprecated
    public SimpleAnnotationValueVisitor6(R r) {
        this.DEFAULT_VALUE = r;
    }
}
