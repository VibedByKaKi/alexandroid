package com.google.auto.value.processor;

import autovalue.shaded.com.google.auto.common.MoreStreams;
import autovalue.shaded.com.google.auto.common.MoreTypes;
import autovalue.shaded.com.google.common.collect.ImmutableBiMap;
import autovalue.shaded.com.google.common.collect.ImmutableList;
import autovalue.shaded.com.google.common.collect.ImmutableMap;
import autovalue.shaded.com.google.common.collect.ImmutableSet;
import com.dee.app.metrics.MetricsConstants;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.processing.ProcessingEnvironment;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.TypeParameterElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.type.TypeVariable;
import javax.lang.model.util.Types;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
class BuilderMethodClassifierForAutoBuilder extends BuilderMethodClassifier<VariableElement> {
    private final Executable executable;
    private final ImmutableBiMap<VariableElement, String> paramToPropertyName;

    private BuilderMethodClassifierForAutoBuilder(ErrorReporter errorReporter, ProcessingEnvironment processingEnvironment, Executable executable, TypeMirror typeMirror, TypeElement typeElement, ImmutableBiMap<VariableElement, String> immutableBiMap, ImmutableMap<String, AnnotatedTypeMirror> immutableMap, ImmutableSet<String> immutableSet, Nullables nullables) {
        super(errorReporter, processingEnvironment, typeMirror, typeElement, immutableMap, immutableSet, nullables);
        this.executable = executable;
        this.paramToPropertyName = immutableBiMap;
    }

    public static Optional<BuilderMethodClassifier<VariableElement>> classify(Iterable<ExecutableElement> iterable, ErrorReporter errorReporter, ProcessingEnvironment processingEnvironment, Executable executable, TypeMirror typeMirror, TypeElement typeElement, ImmutableSet<String> immutableSet, Nullables nullables) {
        BuilderMethodClassifierForAutoBuilder builderMethodClassifierForAutoBuilder = new BuilderMethodClassifierForAutoBuilder(errorReporter, processingEnvironment, executable, typeMirror, typeElement, (ImmutableBiMap) executable.parameters().stream().collect(MoreStreams.toImmutableBiMap(new BuilderMethodClassifierForAutoBuilder$$ExternalSyntheticLambda0(), new BuilderMethodClassifierForAutoBuilder$$ExternalSyntheticLambda1())), rewriteParameterTypes(executable, typeElement, errorReporter, processingEnvironment.getTypeUtils()), immutableSet, nullables);
        return builderMethodClassifierForAutoBuilder.classifyMethods(iterable, false) ? Optional.of(builderMethodClassifierForAutoBuilder) : Optional.empty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$classify$1(VariableElement variableElement) {
        return variableElement.getSimpleName().toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$rewriteParameterTypes$2(VariableElement variableElement) {
        return variableElement.getSimpleName().toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ AnnotatedTypeMirror lambda$rewriteParameterTypes$3(VariableElement variableElement) {
        return new AnnotatedTypeMirror(variableElement.asType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ TypeMirror lambda$rewriteParameterTypes$4(Map map, TypeVariable typeVariable) {
        return (TypeMirror) map.get(MoreTypes.equivalence().wrap(typeVariable));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$rewriteParameterTypes$5(VariableElement variableElement) {
        return variableElement.getSimpleName().toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ AnnotatedTypeMirror lambda$rewriteParameterTypes$6(Function function, Types types, VariableElement variableElement) {
        return new AnnotatedTypeMirror(variableElement.asType(), TypeVariables.substituteTypeVariables(variableElement.asType(), function, types));
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [com.google.auto.value.processor.BuilderMethodClassifierForAutoBuilder$$ExternalSyntheticLambda4] */
    private static ImmutableMap<String, AnnotatedTypeMirror> rewriteParameterTypes(Executable executable, TypeElement typeElement, ErrorReporter errorReporter, final Types types) {
        ImmutableList<TypeParameterElement> typeParameters = executable.typeParameters();
        List typeParameters2 = typeElement.getTypeParameters();
        if (!BuilderSpec.sameTypeParameters(typeParameters, (List<? extends TypeParameterElement>) typeParameters2)) {
            errorReporter.abortWithError(typeElement, "[AutoBuilderTypeParams] Builder type parameters %s must match type parameters %s of %s", TypeEncoder.typeParametersString(typeParameters2), TypeEncoder.typeParametersString(typeParameters), executable);
        }
        if (typeParameters.isEmpty()) {
            return (ImmutableMap) executable.parameters().stream().collect(MoreStreams.toImmutableMap(new BuilderMethodClassifierForAutoBuilder$$ExternalSyntheticLambda2(), new BuilderMethodClassifierForAutoBuilder$$ExternalSyntheticLambda3()));
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i = 0; i < typeParameters.size(); i++) {
            TypeVariable asTypeVariable = MoreTypes.asTypeVariable(typeParameters.get(i).asType());
            linkedHashMap.put(MoreTypes.equivalence().wrap(asTypeVariable), MoreTypes.asTypeVariable(((TypeParameterElement) typeParameters2.get(i)).asType()));
        }
        final ?? r7 = new Function() { // from class: com.google.auto.value.processor.BuilderMethodClassifierForAutoBuilder$$ExternalSyntheticLambda4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TypeMirror lambda$rewriteParameterTypes$4;
                lambda$rewriteParameterTypes$4 = BuilderMethodClassifierForAutoBuilder.lambda$rewriteParameterTypes$4(linkedHashMap, (TypeVariable) obj);
                return lambda$rewriteParameterTypes$4;
            }
        };
        return (ImmutableMap) executable.parameters().stream().collect(MoreStreams.toImmutableMap(new BuilderMethodClassifierForAutoBuilder$$ExternalSyntheticLambda5(), new Function() { // from class: com.google.auto.value.processor.BuilderMethodClassifierForAutoBuilder$$ExternalSyntheticLambda6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                AnnotatedTypeMirror lambda$rewriteParameterTypes$6;
                lambda$rewriteParameterTypes$6 = BuilderMethodClassifierForAutoBuilder.lambda$rewriteParameterTypes$6(BuilderMethodClassifierForAutoBuilder$$ExternalSyntheticLambda4.this, types, (VariableElement) obj);
                return lambda$rewriteParameterTypes$6;
            }
        }));
    }

    @Override // com.google.auto.value.processor.BuilderMethodClassifier
    public String autoWhat() {
        return "AutoBuilder";
    }

    @Override // com.google.auto.value.processor.BuilderMethodClassifier
    public String fooBuilderMustMatch() {
        return "foo";
    }

    @Override // com.google.auto.value.processor.BuilderMethodClassifier
    public String getterMustMatch() {
        return "a parameter of " + this.executable;
    }

    @Override // com.google.auto.value.processor.BuilderMethodClassifier
    public ImmutableBiMap<String, VariableElement> propertyElements() {
        return this.paramToPropertyName.inverse();
    }

    @Override // com.google.auto.value.processor.BuilderMethodClassifier
    public Optional<String> propertyForBuilderGetter(ExecutableElement executableElement) {
        String obj = executableElement.getSimpleName().toString();
        if (this.paramToPropertyName.containsValue(obj)) {
            return Optional.of(obj);
        }
        if (AutoValueishProcessor.isPrefixedGetter(executableElement)) {
            String substring = obj.substring(obj.startsWith(MetricsConstants.Method.CACHE_GET) ? 3 : 2);
            String decapitalizeLikeJavaBeans = PropertyNames.decapitalizeLikeJavaBeans(substring);
            if (this.paramToPropertyName.containsValue(decapitalizeLikeJavaBeans)) {
                return Optional.of(decapitalizeLikeJavaBeans);
            }
            String decapitalizeNormally = PropertyNames.decapitalizeNormally(substring);
            if (this.paramToPropertyName.containsValue(decapitalizeNormally)) {
                return Optional.of(decapitalizeNormally);
            }
        }
        return Optional.empty();
    }

    @Override // com.google.auto.value.processor.BuilderMethodClassifier
    public String propertyString(VariableElement variableElement) {
        return "parameter \"" + variableElement.getSimpleName() + "\" of " + this.executable;
    }

    @Override // com.google.auto.value.processor.BuilderMethodClassifier
    public TypeMirror originalPropertyType(VariableElement variableElement) {
        return variableElement.asType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ VariableElement lambda$classify$0(VariableElement variableElement) {
        return variableElement;
    }

    @Override // com.google.auto.value.processor.BuilderMethodClassifier
    public void checkForFailedJavaBean(ExecutableElement executableElement) {
    }
}
