package autovalue.shaded.com.google.auto.common;

import autovalue.shaded.com.squareup.javapoet.AnnotationSpec;
import autovalue.shaded.com.squareup.javapoet.ClassName;
import java.util.Optional;
import java.util.function.Function;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.TypeElement;
import javax.lang.model.util.Elements;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class GeneratedAnnotationSpecs {
    private GeneratedAnnotationSpecs() {
    }

    @Deprecated
    public static Optional<AnnotationSpec> generatedAnnotationSpec(Elements elements, Class<?> cls) {
        return generatedAnnotationSpecBuilder(elements, cls).map(new MoreStreams$$ExternalSyntheticLambda4(1));
    }

    private static Optional<AnnotationSpec.Builder> generatedAnnotationSpecBuilder(Elements elements, final Class<?> cls) {
        return GeneratedAnnotations.generatedAnnotation(elements).map(new Function() { // from class: autovalue.shaded.com.google.auto.common.GeneratedAnnotationSpecs$$ExternalSyntheticLambda4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                AnnotationSpec.Builder lambda$generatedAnnotationSpecBuilder$2;
                lambda$generatedAnnotationSpecBuilder$2 = GeneratedAnnotationSpecs.lambda$generatedAnnotationSpecBuilder$2(cls, (TypeElement) obj);
                return lambda$generatedAnnotationSpecBuilder$2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ AnnotationSpec lambda$generatedAnnotationSpec$0(String str, AnnotationSpec.Builder builder) {
        return builder.addMember("comments", "$S", str).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ AnnotationSpec lambda$generatedAnnotationSpec$1(String str, AnnotationSpec.Builder builder) {
        return builder.addMember("comments", "$S", str).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ AnnotationSpec.Builder lambda$generatedAnnotationSpecBuilder$2(Class cls, TypeElement typeElement) {
        return AnnotationSpec.builder(ClassName.get(typeElement)).addMember("value", "$S", cls.getCanonicalName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ AnnotationSpec.Builder lambda$generatedAnnotationSpecBuilder$3(Class cls, TypeElement typeElement) {
        return AnnotationSpec.builder(ClassName.get(typeElement)).addMember("value", "$S", cls.getCanonicalName());
    }

    private static Optional<AnnotationSpec.Builder> generatedAnnotationSpecBuilder(Elements elements, SourceVersion sourceVersion, final Class<?> cls) {
        return GeneratedAnnotations.generatedAnnotation(elements, sourceVersion).map(new Function() { // from class: autovalue.shaded.com.google.auto.common.GeneratedAnnotationSpecs$$ExternalSyntheticLambda2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                AnnotationSpec.Builder lambda$generatedAnnotationSpecBuilder$3;
                lambda$generatedAnnotationSpecBuilder$3 = GeneratedAnnotationSpecs.lambda$generatedAnnotationSpecBuilder$3(cls, (TypeElement) obj);
                return lambda$generatedAnnotationSpecBuilder$3;
            }
        });
    }

    @Deprecated
    public static Optional<AnnotationSpec> generatedAnnotationSpec(Elements elements, Class<?> cls, String str) {
        return generatedAnnotationSpecBuilder(elements, cls).map(new GeneratedAnnotationSpecs$$ExternalSyntheticLambda1(str, 1));
    }

    public static Optional<AnnotationSpec> generatedAnnotationSpec(Elements elements, SourceVersion sourceVersion, Class<?> cls) {
        return generatedAnnotationSpecBuilder(elements, sourceVersion, cls).map(new MoreStreams$$ExternalSyntheticLambda4(1));
    }

    public static Optional<AnnotationSpec> generatedAnnotationSpec(Elements elements, SourceVersion sourceVersion, Class<?> cls, String str) {
        return generatedAnnotationSpecBuilder(elements, sourceVersion, cls).map(new GeneratedAnnotationSpecs$$ExternalSyntheticLambda1(str, 0));
    }
}
