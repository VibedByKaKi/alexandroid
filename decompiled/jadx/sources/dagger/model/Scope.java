package dagger.model;

import com.google.auto.value.AutoValue;
import com.google.common.base.Equivalence;
import com.google.common.base.Preconditions;
import com.squareup.javapoet.ClassName;
import dagger.spi.shaded.auto.common.AnnotationMirrors;
import dagger.spi.shaded.auto.common.MoreElements;
import dagger.spi.shaded.auto.common.MoreTypes;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes9.dex */
public abstract class Scope {
    private static final ClassName PRODUCTION_SCOPE = ClassName.get("dagger.producers", "ProductionScope", new String[0]);
    private static final ClassName SINGLETON = ClassName.get("jakarta.inject", "Singleton", new String[0]);
    private static final ClassName SINGLETON_JAVAX = ClassName.get("javax.inject", "Singleton", new String[0]);
    private static final ClassName REUSABLE = ClassName.get("dagger", "Reusable", new String[0]);
    private static final ClassName SCOPE = ClassName.get("jakarta.inject", "Scope", new String[0]);
    private static final ClassName SCOPE_JAVAX = ClassName.get("javax.inject", "Scope", new String[0]);

    public static boolean isScope(TypeElement typeElement) {
        return MoreElements.isAnnotationPresent((Element) typeElement, SCOPE.canonicalName()) || MoreElements.isAnnotationPresent((Element) typeElement, SCOPE_JAVAX.canonicalName());
    }

    public static Scope scope(AnnotationMirror annotationMirror) {
        Preconditions.checkArgument(isScope(annotationMirror));
        return new AutoValue_Scope(AnnotationMirrors.equivalence().wrap(annotationMirror));
    }

    public final boolean isProductionScope() {
        return isScope(PRODUCTION_SCOPE);
    }

    public final boolean isReusable() {
        return isScope(REUSABLE);
    }

    public final boolean isSingleton() {
        return isScope(SINGLETON) || isScope(SINGLETON_JAVAX);
    }

    public final AnnotationMirror scopeAnnotation() {
        return wrappedScopeAnnotation().get();
    }

    public final TypeElement scopeAnnotationElement() {
        return MoreTypes.asTypeElement(scopeAnnotation().getAnnotationType());
    }

    public final String toString() {
        return scopeAnnotation().toString();
    }

    public abstract Equivalence.Wrapper<AnnotationMirror> wrappedScopeAnnotation();

    public static boolean isScope(AnnotationMirror annotationMirror) {
        return isScope(MoreElements.asType(annotationMirror.getAnnotationType().asElement()));
    }

    private boolean isScope(ClassName className) {
        return scopeAnnotationElement().getQualifiedName().contentEquals(className.canonicalName());
    }
}
