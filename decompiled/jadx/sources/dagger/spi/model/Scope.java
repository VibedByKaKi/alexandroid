package dagger.spi.model;

import com.google.auto.value.AutoValue;
import com.google.common.base.Preconditions;
import com.squareup.javapoet.ClassName;

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

    public static boolean isScope(DaggerTypeElement daggerTypeElement) {
        return daggerTypeElement.xprocessing().hasAnnotation(SCOPE) || daggerTypeElement.xprocessing().hasAnnotation(SCOPE_JAVAX);
    }

    public static Scope scope(DaggerAnnotation daggerAnnotation) {
        Preconditions.checkArgument(isScope(daggerAnnotation));
        return new AutoValue_Scope(daggerAnnotation);
    }

    public final ClassName className() {
        return scopeAnnotation().className();
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

    public abstract DaggerAnnotation scopeAnnotation();

    public final String toString() {
        return scopeAnnotation().toString();
    }

    public static boolean isScope(DaggerAnnotation daggerAnnotation) {
        return isScope(daggerAnnotation.annotationTypeElement());
    }

    private boolean isScope(ClassName className) {
        return scopeAnnotation().className().equals(className);
    }
}
