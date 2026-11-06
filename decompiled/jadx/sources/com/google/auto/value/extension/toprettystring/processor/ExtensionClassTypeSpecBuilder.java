package com.google.auto.value.extension.toprettystring.processor;

import autovalue.shaded.com.google.auto.common.GeneratedAnnotationSpecs;
import autovalue.shaded.com.google.auto.common.MoreStreams;
import autovalue.shaded.com.google.common.collect.ImmutableList;
import autovalue.shaded.com.google.common.collect.ImmutableMap;
import autovalue.shaded.com.squareup.javapoet.AnnotationSpec;
import autovalue.shaded.com.squareup.javapoet.ClassName;
import autovalue.shaded.com.squareup.javapoet.MethodSpec;
import autovalue.shaded.com.squareup.javapoet.ParameterizedTypeName;
import autovalue.shaded.com.squareup.javapoet.TypeName;
import autovalue.shaded.com.squareup.javapoet.TypeSpec;
import autovalue.shaded.com.squareup.javapoet.TypeVariableName;
import com.google.auto.value.extension.AutoValueExtension;
import com.google.auto.value.extension.memoized.processor.MemoizeExtension$$ExternalSyntheticLambda1;
import com.google.auto.value.extension.memoized.processor.MemoizeExtension$Generator$$ExternalSyntheticLambda4;
import com.google.auto.value.extension.memoized.processor.MemoizeExtension$Generator$$ExternalSyntheticLambda6;
import com.google.auto.value.extension.memoized.processor.MemoizeExtension$Generator$$ExternalSyntheticLambda9;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.TypeParameterElement;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.util.Elements;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
final class ExtensionClassTypeSpecBuilder {
    private final String className;
    private final String classToExtend;
    private final AutoValueExtension.Context context;
    private final Elements elements;
    private final boolean isFinal;
    private final SourceVersion sourceVersion;

    private ExtensionClassTypeSpecBuilder(AutoValueExtension.Context context, String str, String str2, boolean z) {
        this.context = context;
        this.className = str;
        this.classToExtend = str2;
        this.isFinal = z;
        this.elements = context.processingEnvironment().getElementUtils();
        this.sourceVersion = context.processingEnvironment().getSourceVersion();
    }

    private static TypeName annotatedType(TypeMirror typeMirror) {
        return TypeName.get(typeMirror).annotated((List<AnnotationSpec>) typeMirror.getAnnotationMirrors().stream().map(new MemoizeExtension$$ExternalSyntheticLambda1()).collect(Collectors.toList()));
    }

    private ImmutableList<TypeVariableName> annotatedTypeVariableNames() {
        return (ImmutableList) this.context.autoValueClass().getTypeParameters().stream().map(new ExtensionClassTypeSpecBuilder$$ExternalSyntheticLambda0()).collect(MoreStreams.toImmutableList());
    }

    private MethodSpec constructor() {
        final MethodSpec.Builder constructorBuilder = MethodSpec.constructorBuilder();
        final Set<String> keySet = this.context.properties().keySet();
        final ImmutableMap immutableMap = (ImmutableMap) keySet.stream().collect(MoreStreams.toImmutableMap(new ExtensionClassTypeSpecBuilder$$ExternalSyntheticLambda1(0), new Function() { // from class: com.google.auto.value.extension.toprettystring.processor.ExtensionClassTypeSpecBuilder$$ExternalSyntheticLambda2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String lambda$constructor$2;
                lambda$constructor$2 = ExtensionClassTypeSpecBuilder.lambda$constructor$2(keySet, (String) obj);
                return lambda$constructor$2;
            }
        }));
        this.context.propertyTypes().forEach(new BiConsumer() { // from class: com.google.auto.value.extension.toprettystring.processor.ExtensionClassTypeSpecBuilder$$ExternalSyntheticLambda3
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ExtensionClassTypeSpecBuilder.lambda$constructor$3(MethodSpec.Builder.this, immutableMap, (String) obj, (TypeMirror) obj2);
            }
        });
        Stream<String> stream = this.context.properties().keySet().stream();
        Objects.requireNonNull(immutableMap);
        constructorBuilder.addStatement("super($L)", (String) stream.map(new MemoizeExtension$Generator$$ExternalSyntheticLambda6(immutableMap, 1)).collect(Collectors.joining(", ")));
        return constructorBuilder.build();
    }

    public static TypeSpec.Builder extensionClassTypeSpecBuilder(AutoValueExtension.Context context, String str, String str2, boolean z) {
        return new ExtensionClassTypeSpecBuilder(context, str, str2, z).extensionClassBuilder();
    }

    private static String generateIdentifier(String str, Set<String> set) {
        if (!SourceVersion.isKeyword(str)) {
            return str;
        }
        int i = 0;
        while (true) {
            String str2 = str + i;
            if (!set.contains(str2)) {
                return str2;
            }
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ TypeVariableName lambda$annotatedTypeVariableNames$0(TypeParameterElement typeParameterElement) {
        return TypeVariableName.get(typeParameterElement).annotated((List<AnnotationSpec>) typeParameterElement.getAnnotationMirrors().stream().map(new MemoizeExtension$$ExternalSyntheticLambda1()).collect(MoreStreams.toImmutableList()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$constructor$2(Set set, String str) {
        return generateIdentifier(str, set);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$constructor$3(MethodSpec.Builder builder, ImmutableMap immutableMap, String str, TypeMirror typeMirror) {
        builder.addParameter(annotatedType(typeMirror), (String) immutableMap.get(str), new Modifier[0]);
    }

    private TypeName superType() {
        ClassName className = ClassName.get(this.context.packageName(), this.classToExtend, new String[0]);
        ImmutableList<TypeVariableName> typeVariableNames = typeVariableNames();
        return typeVariableNames.isEmpty() ? className : ParameterizedTypeName.get(className, (TypeName[]) typeVariableNames.toArray(new TypeName[0]));
    }

    private ImmutableList<TypeVariableName> typeVariableNames() {
        return (ImmutableList) this.context.autoValueClass().getTypeParameters().stream().map(new MemoizeExtension$Generator$$ExternalSyntheticLambda4()).collect(MoreStreams.toImmutableList());
    }

    public TypeSpec.Builder extensionClassBuilder() {
        TypeSpec.Builder superclass = TypeSpec.classBuilder(this.className).superclass(superType());
        AutoValueExtension.Context context = this.context;
        TypeSpec.Builder addTypeVariables = superclass.addAnnotations((Iterable) context.classAnnotationsToCopy(context.autoValueClass()).stream().map(new MemoizeExtension$$ExternalSyntheticLambda1()).collect(MoreStreams.toImmutableList())).addTypeVariables(annotatedTypeVariableNames());
        Modifier[] modifierArr = new Modifier[1];
        modifierArr[0] = this.isFinal ? Modifier.FINAL : Modifier.ABSTRACT;
        TypeSpec.Builder addMethod = addTypeVariables.addModifiers(modifierArr).addMethod(constructor());
        Optional<AnnotationSpec> generatedAnnotationSpec = GeneratedAnnotationSpecs.generatedAnnotationSpec(this.elements, this.sourceVersion, (Class<?>) ToPrettyStringExtension.class);
        Objects.requireNonNull(addMethod);
        generatedAnnotationSpec.ifPresent(new MemoizeExtension$Generator$$ExternalSyntheticLambda9(addMethod));
        return addMethod;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$constructor$1(String str) {
        return str;
    }
}
