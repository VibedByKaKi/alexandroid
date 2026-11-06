package com.google.auto.value.processor;

import autovalue.shaded.com.google.auto.common.MoreElements;
import autovalue.shaded.com.google.common.collect.ImmutableBiMap;
import autovalue.shaded.com.google.common.collect.ImmutableMap;
import autovalue.shaded.com.google.common.collect.ImmutableSet;
import autovalue.shaded.com.google.common.collect.Maps;
import autovalue.shaded.com.google.common.collect.Sets;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.processing.ProcessingEnvironment;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.type.TypeMirror;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
class BuilderMethodClassifierForAutoValue extends BuilderMethodClassifier<ExecutableElement> {
    private final TypeMirror builtType;
    private final ErrorReporter errorReporter;
    private final ImmutableMap<String, ExecutableElement> getterNameToGetter;
    private final ImmutableBiMap<ExecutableElement, String> getterToPropertyName;

    private BuilderMethodClassifierForAutoValue(ErrorReporter errorReporter, ProcessingEnvironment processingEnvironment, TypeMirror typeMirror, TypeElement typeElement, ImmutableBiMap<ExecutableElement, String> immutableBiMap, ImmutableMap<String, AnnotatedTypeMirror> immutableMap, Nullables nullables) {
        super(errorReporter, processingEnvironment, typeMirror, typeElement, immutableMap, ImmutableSet.of(), nullables);
        this.errorReporter = errorReporter;
        this.getterToPropertyName = immutableBiMap;
        this.getterNameToGetter = Maps.uniqueIndex(immutableBiMap.keySet(), new BuilderMethodClassifierForAutoValue$$ExternalSyntheticLambda1());
        this.builtType = typeMirror;
    }

    public static Optional<BuilderMethodClassifier<ExecutableElement>> classify(Iterable<ExecutableElement> iterable, ErrorReporter errorReporter, ProcessingEnvironment processingEnvironment, TypeElement typeElement, TypeElement typeElement2, ImmutableBiMap<ExecutableElement, String> immutableBiMap, ImmutableMap<String, AnnotatedTypeMirror> immutableMap, Nullables nullables, boolean z) {
        BuilderMethodClassifierForAutoValue builderMethodClassifierForAutoValue = new BuilderMethodClassifierForAutoValue(errorReporter, processingEnvironment, typeElement.asType(), typeElement2, immutableBiMap, immutableMap, nullables);
        return builderMethodClassifierForAutoValue.classifyMethods(iterable, z) ? Optional.of(builderMethodClassifierForAutoValue) : Optional.empty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$new$0(ExecutableElement executableElement) {
        return executableElement.getSimpleName().toString();
    }

    @Override // com.google.auto.value.processor.BuilderMethodClassifier
    public String autoWhat() {
        return "AutoValue";
    }

    @Override // com.google.auto.value.processor.BuilderMethodClassifier
    public void checkForFailedJavaBean(ExecutableElement executableElement) {
        ImmutableSet<ExecutableElement> keySet = this.getterToPropertyName.keySet();
        ImmutableSet<ExecutableElement> prefixedGettersIn = AutoValueishProcessor.prefixedGettersIn(keySet);
        if (prefixedGettersIn.size() >= keySet.size() || prefixedGettersIn.size() < keySet.size() / 2) {
            return;
        }
        this.errorReporter.reportNote(executableElement, "This might be because you are using the getFoo() convention for some but not all methods. These methods don't follow the convention: %s", Sets.difference(keySet, prefixedGettersIn));
    }

    @Override // com.google.auto.value.processor.BuilderMethodClassifier
    public String fooBuilderMustMatch() {
        return "foo() or getFoo()";
    }

    @Override // com.google.auto.value.processor.BuilderMethodClassifier
    public String getterMustMatch() {
        return "a property method of " + this.builtType;
    }

    @Override // com.google.auto.value.processor.BuilderMethodClassifier
    public ImmutableBiMap<String, ExecutableElement> propertyElements() {
        return this.getterToPropertyName.inverse();
    }

    @Override // com.google.auto.value.processor.BuilderMethodClassifier
    public Optional<String> propertyForBuilderGetter(ExecutableElement executableElement) {
        Optional ofNullable = Optional.ofNullable(this.getterNameToGetter.get(executableElement.getSimpleName().toString()));
        final ImmutableBiMap<ExecutableElement, String> immutableBiMap = this.getterToPropertyName;
        Objects.requireNonNull(immutableBiMap);
        return ofNullable.map(new Function() { // from class: com.google.auto.value.processor.BuilderMethodClassifierForAutoValue$$ExternalSyntheticLambda0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (String) ImmutableBiMap.this.get((ExecutableElement) obj);
            }
        });
    }

    @Override // com.google.auto.value.processor.BuilderMethodClassifier
    public String propertyString(ExecutableElement executableElement) {
        return "property method " + MoreElements.asType(executableElement.getEnclosingElement()).getQualifiedName() + "." + executableElement.getSimpleName() + "()";
    }

    @Override // com.google.auto.value.processor.BuilderMethodClassifier
    public TypeMirror originalPropertyType(ExecutableElement executableElement) {
        return executableElement.getReturnType();
    }
}
