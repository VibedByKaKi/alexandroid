package dagger.spi.model;

import com.google.auto.value.AutoValue;
import com.google.common.base.Equivalence;
import com.google.common.base.Preconditions;
import com.squareup.javapoet.ClassName;
import dagger.internal.codegen.xprocessing.XAnnotations;
import dagger.spi.shaded.androidx.room.compiler.processing.XAnnotation;
import dagger.spi.shaded.androidx.room.compiler.processing.compat.XConverters;
import javax.lang.model.element.AnnotationMirror;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes9.dex */
public abstract class DaggerAnnotation {
    public static DaggerAnnotation from(XAnnotation xAnnotation) {
        Preconditions.checkNotNull(xAnnotation);
        return new AutoValue_DaggerAnnotation(XAnnotations.equivalence().wrap(xAnnotation));
    }

    public DaggerTypeElement annotationTypeElement() {
        return DaggerTypeElement.from(xprocessing().getType().getTypeElement());
    }

    public ClassName className() {
        return annotationTypeElement().className();
    }

    public abstract Equivalence.Wrapper<XAnnotation> equivalenceWrapper();

    public AnnotationMirror java() {
        return XConverters.toJavac(xprocessing());
    }

    public final String toString() {
        return XAnnotations.toString(xprocessing());
    }

    public XAnnotation xprocessing() {
        return equivalenceWrapper().get();
    }
}
