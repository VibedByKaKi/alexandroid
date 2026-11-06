package org.openjdk.javax.annotation.processing;

import java.util.Set;
import org.openjdk.javax.lang.model.SourceVersion;
import org.openjdk.javax.lang.model.element.AnnotationMirror;
import org.openjdk.javax.lang.model.element.Element;
import org.openjdk.javax.lang.model.element.ExecutableElement;
import org.openjdk.javax.lang.model.element.TypeElement;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface Processor {
    Iterable<? extends Completion> getCompletions(Element element, AnnotationMirror annotationMirror, ExecutableElement executableElement, String str);

    Set<String> getSupportedAnnotationTypes();

    Set<String> getSupportedOptions();

    SourceVersion getSupportedSourceVersion();

    void init(ProcessingEnvironment processingEnvironment);

    boolean process(Set<? extends TypeElement> set, RoundEnvironment roundEnvironment);
}
