package com.google.auto.value.extension.toprettystring.processor;

import autovalue.shaded.com.google.auto.common.MoreTypes;
import java.util.Optional;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.Element;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
final class Annotations {
    private Annotations() {
    }

    public static Optional<AnnotationMirror> getAnnotationMirror(Element element, String str) {
        for (AnnotationMirror annotationMirror : element.getAnnotationMirrors()) {
            if (MoreTypes.asTypeElement(annotationMirror.getAnnotationType()).getQualifiedName().contentEquals(str)) {
                return Optional.of(annotationMirror);
            }
        }
        return Optional.empty();
    }

    public static Optional<AnnotationMirror> toPrettyStringAnnotation(Element element) {
        return getAnnotationMirror(element, "com.google.auto.value.extension.toprettystring.ToPrettyString");
    }
}
