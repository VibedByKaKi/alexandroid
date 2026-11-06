package com.google.auto.value.extension;

import autovalue.shaded.com.google.common.collect.ImmutableList;
import autovalue.shaded.com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.SupportedOptions;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.type.TypeMirror;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public abstract class AutoValueExtension {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface BuilderContext {
        ExecutableElement autoBuildMethod();

        Optional<ExecutableElement> buildMethod();

        Set<ExecutableElement> builderMethods();

        TypeElement builderType();

        Map<String, ExecutableElement> propertyBuilders();

        Map<String, Set<ExecutableElement>> setters();

        Set<ExecutableElement> toBuilderMethods();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Context {
        Set<ExecutableElement> abstractMethods();

        TypeElement autoValueClass();

        default Optional<BuilderContext> builder() {
            return Optional.empty();
        }

        Set<ExecutableElement> builderAbstractMethods();

        default List<AnnotationMirror> classAnnotationsToCopy(TypeElement typeElement) {
            return ImmutableList.of();
        }

        default String finalAutoValueClassName() {
            throw new UnsupportedOperationException();
        }

        default List<AnnotationMirror> methodAnnotationsToCopy(ExecutableElement executableElement) {
            return ImmutableList.of();
        }

        String packageName();

        ProcessingEnvironment processingEnvironment();

        Map<String, ExecutableElement> properties();

        default Map<String, TypeMirror> propertyTypes() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum IncrementalExtensionType {
        UNKNOWN,
        AGGREGATING,
        ISOLATING
    }

    public boolean applicable(Context context) {
        return false;
    }

    public Set<ExecutableElement> consumeBuilderMethods(Context context) {
        return ImmutableSet.of();
    }

    public Set<ExecutableElement> consumeMethods(Context context) {
        return ImmutableSet.of();
    }

    public Set<String> consumeProperties(Context context) {
        return ImmutableSet.of();
    }

    public abstract String generateClass(Context context, String str, String str2, boolean z);

    public Set<String> getSupportedOptions() {
        SupportedOptions annotation = getClass().getAnnotation(SupportedOptions.class);
        return annotation == null ? ImmutableSet.of() : ImmutableSet.copyOf(annotation.value());
    }

    public IncrementalExtensionType incrementalType(ProcessingEnvironment processingEnvironment) {
        return IncrementalExtensionType.UNKNOWN;
    }

    public boolean mustBeFinal(Context context) {
        return false;
    }
}
