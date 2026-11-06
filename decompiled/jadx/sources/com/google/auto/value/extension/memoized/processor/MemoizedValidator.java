package com.google.auto.value.extension.memoized.processor;

import autovalue.shaded.com.google.auto.common.MoreTypes;
import autovalue.shaded.com.google.auto.service.AutoService;
import autovalue.shaded.net.ltgt.gradle.incap.IncrementalAnnotationProcessor;
import autovalue.shaded.net.ltgt.gradle.incap.IncrementalAnnotationProcessorType;
import java.util.Optional;
import java.util.Set;
import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Messager;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.Element;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.util.ElementFilter;
import javax.tools.Diagnostic;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoService({Processor.class})
@IncrementalAnnotationProcessor(IncrementalAnnotationProcessorType.ISOLATING)
@SupportedAnnotationTypes({"com.google.auto.value.extension.memoized.Memoized"})
/* loaded from: classes8.dex */
public final class MemoizedValidator extends AbstractProcessor {
    public static Optional<AnnotationMirror> getAnnotationMirror(Element element, String str) {
        for (AnnotationMirror annotationMirror : element.getAnnotationMirrors()) {
            if (MoreTypes.asTypeElement(annotationMirror.getAnnotationType()).getQualifiedName().contentEquals(str)) {
                return Optional.of(annotationMirror);
            }
        }
        return Optional.empty();
    }

    private static boolean isAutoValue(Element element) {
        return element.getAnnotationMirrors().stream().map(new MemoizedValidator$$ExternalSyntheticLambda0()).anyMatch(new MemoizedValidator$$ExternalSyntheticLambda1());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ TypeElement lambda$isAutoValue$0(AnnotationMirror annotationMirror) {
        return MoreTypes.asTypeElement(annotationMirror.getAnnotationType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$isAutoValue$1(TypeElement typeElement) {
        return typeElement.getQualifiedName().contentEquals("com.google.auto.value.AutoValue");
    }

    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latestSupported();
    }

    public final boolean process(Set<? extends TypeElement> set, RoundEnvironment roundEnvironment) {
        Messager messager = this.processingEnv.getMessager();
        for (ExecutableElement executableElement : ElementFilter.methodsIn(roundEnvironment.getElementsAnnotatedWith(this.processingEnv.getElementUtils().getTypeElement("com.google.auto.value.extension.memoized.Memoized")))) {
            if (!isAutoValue(executableElement.getEnclosingElement())) {
                messager.printMessage(Diagnostic.Kind.ERROR, "@Memoized methods must be declared only in @AutoValue classes", executableElement, getAnnotationMirror(executableElement, "com.google.auto.value.extension.memoized.Memoized").get());
            }
        }
        return false;
    }
}
