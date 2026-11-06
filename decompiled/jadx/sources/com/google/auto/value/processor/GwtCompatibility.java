package com.google.auto.value.processor;

import java.util.Optional;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.TypeElement;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
class GwtCompatibility {
    private final Optional<AnnotationMirror> gwtCompatibleAnnotation;

    public GwtCompatibility(TypeElement typeElement) {
        Optional<AnnotationMirror> empty = Optional.empty();
        for (AnnotationMirror annotationMirror : typeElement.getAnnotationMirrors()) {
            if (annotationMirror.getAnnotationType().asElement().getSimpleName().contentEquals("GwtCompatible")) {
                empty = Optional.of(annotationMirror);
            }
        }
        this.gwtCompatibleAnnotation = empty;
    }

    public Optional<AnnotationMirror> gwtCompatibleAnnotation() {
        return this.gwtCompatibleAnnotation;
    }

    public String gwtCompatibleAnnotationString() {
        return (String) this.gwtCompatibleAnnotation.map(new AutoValueishProcessor$$ExternalSyntheticLambda23()).orElse("");
    }
}
