package autovalue.shaded.com.google.auto.common;

import java.util.Optional;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.TypeElement;
import javax.lang.model.util.Elements;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class GeneratedAnnotations {
    private GeneratedAnnotations() {
    }

    @Deprecated
    public static Optional<TypeElement> generatedAnnotation(Elements elements) {
        TypeElement typeElement = elements.getTypeElement("javax.annotation.processing.Generated");
        return typeElement != null ? Optional.of(typeElement) : Optional.ofNullable(elements.getTypeElement("javax.annotation.Generated"));
    }

    public static Optional<TypeElement> generatedAnnotation(Elements elements, SourceVersion sourceVersion) {
        String str;
        if (sourceVersion.compareTo(SourceVersion.RELEASE_8) > 0) {
            str = "javax.annotation.processing.Generated";
        } else {
            str = "javax.annotation.Generated";
        }
        return Optional.ofNullable(elements.getTypeElement(str));
    }
}
