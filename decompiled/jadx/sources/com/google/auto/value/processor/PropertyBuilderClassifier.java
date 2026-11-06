package com.google.auto.value.processor;

import autovalue.shaded.com.google.auto.common.MoreElements;
import autovalue.shaded.com.google.common.collect.ImmutableMap;
import autovalue.shaded.com.google.common.collect.ImmutableSet;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.util.ElementFilter;
import javax.lang.model.util.Elements;
import javax.lang.model.util.Types;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
class PropertyBuilderClassifier {
    private final BuilderMethodClassifier<?> builderMethodClassifier;
    private final Elements elementUtils;
    private final ErrorReporter errorReporter;
    private final Nullables nullables;
    private final Predicate<String> propertyIsNullable;
    private final ImmutableMap<String, AnnotatedTypeMirror> propertyTypes;
    private final Types typeUtils;
    private static final ImmutableSet<String> BUILDER_METHOD_NAMES = ImmutableSet.of("naturalOrder", "builder", "newBuilder");
    private static final ImmutableSet<String> ONE_ARGUMENT_BUILDER_METHOD_NAMES = ImmutableSet.of("builder");
    private static final ImmutableSet<String> ADD_ALL_PUT_ALL = ImmutableSet.of("addAll", "putAll");

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class PropertyBuilder {
        private final String beforeInitDefault;
        private final String build;
        private final AnnotatedTypeMirror builderAnnotatedType;
        private final String builderType;
        private final String builtToBuilder;
        private final String copyAll;
        private final String initDefault;
        private final String initializer;
        private final String name;
        private final String nullableBuilderType;
        private final ExecutableElement propertyBuilderMethod;

        public PropertyBuilder(ExecutableElement executableElement, String str, String str2, AnnotatedTypeMirror annotatedTypeMirror, String str3, String str4, String str5, String str6, String str7, String str8) {
            this.propertyBuilderMethod = executableElement;
            this.name = executableElement.getSimpleName() + "$";
            this.builderType = str;
            this.nullableBuilderType = str2;
            this.builderAnnotatedType = annotatedTypeMirror;
            this.build = str3;
            this.initializer = str4;
            this.beforeInitDefault = str5;
            this.initDefault = str6;
            this.builtToBuilder = str7;
            this.copyAll = str8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$getPropertyBuilderMethodParameters$0(VariableElement variableElement) {
            return TypeEncoder.encode(variableElement.asType()) + " " + variableElement.getSimpleName();
        }

        public String getAccess() {
            return SimpleMethod.access(this.propertyBuilderMethod);
        }

        public String getBeforeInitDefault() {
            return this.beforeInitDefault;
        }

        public String getBuild() {
            return this.build;
        }

        public String getBuilderType() {
            return this.builderType;
        }

        public TypeMirror getBuilderTypeMirror() {
            return this.builderAnnotatedType.getType();
        }

        public String getBuiltToBuilder() {
            return this.builtToBuilder;
        }

        public String getCopyAll() {
            return this.copyAll;
        }

        public String getInitDefault() {
            return this.initDefault;
        }

        public String getInitializer() {
            return this.initializer;
        }

        public String getMethodName() {
            return this.propertyBuilderMethod.getSimpleName().toString();
        }

        public String getName() {
            return this.name;
        }

        public String getNullableBuilderType() {
            return this.nullableBuilderType;
        }

        public ExecutableElement getPropertyBuilderMethod() {
            return this.propertyBuilderMethod;
        }

        public String getPropertyBuilderMethodParameters() {
            return (String) this.propertyBuilderMethod.getParameters().stream().map(new PropertyBuilderClassifier$PropertyBuilder$$ExternalSyntheticLambda0()).collect(Collectors.joining(", "));
        }
    }

    public PropertyBuilderClassifier(ErrorReporter errorReporter, Types types, Elements elements, BuilderMethodClassifier<?> builderMethodClassifier, Predicate<String> predicate, ImmutableMap<String, AnnotatedTypeMirror> immutableMap, Nullables nullables) {
        this.errorReporter = errorReporter;
        this.typeUtils = types;
        this.elementUtils = elements;
        this.builderMethodClassifier = builderMethodClassifier;
        this.propertyIsNullable = predicate;
        this.propertyTypes = immutableMap;
        this.nullables = nullables;
    }

    private Optional<ExecutableElement> addAllPutAll(TypeElement typeElement, final DeclaredType declaredType, final TypeMirror typeMirror) {
        return MoreElements.getLocalAndInheritedMethods(typeElement, this.typeUtils, this.elementUtils).stream().filter(new PropertyBuilderClassifier$$ExternalSyntheticLambda11()).filter(new Predicate() { // from class: com.google.auto.value.processor.PropertyBuilderClassifier$$ExternalSyntheticLambda12
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean lambda$addAllPutAll$9;
                lambda$addAllPutAll$9 = PropertyBuilderClassifier.this.lambda$addAllPutAll$9(declaredType, typeMirror, (ExecutableElement) obj);
                return lambda$addAllPutAll$9;
            }
        }).findFirst();
    }

    private Optional<ExecutableElement> builderMaker(ImmutableSet<String> immutableSet, final Map<String, ExecutableElement> map, final TypeElement typeElement, final int i) {
        Stream<String> stream = immutableSet.stream();
        Objects.requireNonNull(map);
        Optional<ExecutableElement> findFirst = stream.map(new Function() { // from class: com.google.auto.value.processor.PropertyBuilderClassifier$$ExternalSyntheticLambda0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (ExecutableElement) map.get((String) obj);
            }
        }).filter(new PropertyBuilderClassifier$$ExternalSyntheticLambda1()).filter(new PropertyBuilderClassifier$$ExternalSyntheticLambda2()).filter(new Predicate() { // from class: com.google.auto.value.processor.PropertyBuilderClassifier$$ExternalSyntheticLambda3
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean lambda$builderMaker$1;
                lambda$builderMaker$1 = PropertyBuilderClassifier.this.lambda$builderMaker$1(typeElement, (ExecutableElement) obj);
                return lambda$builderMaker$1;
            }
        }).findFirst();
        return findFirst.isPresent() ? findFirst : ElementFilter.constructorsIn(typeElement.getEnclosedElements()).stream().filter(new Predicate() { // from class: com.google.auto.value.processor.PropertyBuilderClassifier$$ExternalSyntheticLambda4
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean lambda$builderMaker$2;
                lambda$builderMaker$2 = PropertyBuilderClassifier.lambda$builderMaker$2(i, (ExecutableElement) obj);
                return lambda$builderMaker$2;
            }
        }).filter(new PropertyBuilderClassifier$$ExternalSyntheticLambda5()).findFirst();
    }

    private static boolean isStaticInterfaceMethodNotIn(ExecutableElement executableElement, TypeElement typeElement) {
        return executableElement.getModifiers().contains(Modifier.STATIC) && !executableElement.getEnclosingElement().equals(typeElement) && executableElement.getEnclosingElement().getKind().equals(ElementKind.INTERFACE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$addAllPutAll$8(ExecutableElement executableElement) {
        return ADD_ALL_PUT_ALL.contains(executableElement.getSimpleName().toString()) && executableElement.getParameters().size() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$addAllPutAll$9(DeclaredType declaredType, TypeMirror typeMirror, ExecutableElement executableElement) {
        return this.typeUtils.isAssignable(typeMirror, MethodSignature.asMemberOf(this.typeUtils, declaredType, executableElement).parameterTypes().get(0).getType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$builderMaker$0(ExecutableElement executableElement) {
        return executableElement.getModifiers().contains(Modifier.STATIC);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$builderMaker$1(TypeElement typeElement, ExecutableElement executableElement) {
        Types types = this.typeUtils;
        return types.isSameType(types.erasure(executableElement.getReturnType()), this.typeUtils.erasure(typeElement.asType()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$builderMaker$2(int i, ExecutableElement executableElement) {
        return executableElement.getParameters().size() == i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$builderMaker$3(ExecutableElement executableElement) {
        return executableElement.getModifiers().contains(Modifier.PUBLIC);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$methodsOf$4(int i, ExecutableElement executableElement) {
        return executableElement.getParameters().size() == i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$methodsOf$5(TypeElement typeElement, ExecutableElement executableElement) {
        return !isStaticInterfaceMethodNotIn(executableElement, typeElement);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$methodsOf$6(ExecutableElement executableElement) {
        return executableElement.getSimpleName().toString();
    }

    private ImmutableMap<String, ExecutableElement> methodsOf(final TypeElement typeElement, final int i) {
        return (ImmutableMap) ElementFilter.methodsIn(this.elementUtils.getAllMembers(typeElement)).stream().filter(new Predicate() { // from class: com.google.auto.value.processor.PropertyBuilderClassifier$$ExternalSyntheticLambda6
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean lambda$methodsOf$4;
                lambda$methodsOf$4 = PropertyBuilderClassifier.lambda$methodsOf$4(i, (ExecutableElement) obj);
                return lambda$methodsOf$4;
            }
        }).filter(new Predicate() { // from class: com.google.auto.value.processor.PropertyBuilderClassifier$$ExternalSyntheticLambda7
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean lambda$methodsOf$5;
                lambda$methodsOf$5 = PropertyBuilderClassifier.lambda$methodsOf$5(typeElement, (ExecutableElement) obj);
                return lambda$methodsOf$5;
            }
        }).collect(Collectors.collectingAndThen(Collectors.toMap(new PropertyBuilderClassifier$$ExternalSyntheticLambda8(), Function.identity(), new PropertyBuilderClassifier$$ExternalSyntheticLambda9()), new KotlinMetadata$$ExternalSyntheticLambda3(21)));
    }

    private Optional<ExecutableElement> noArgBuilderMaker(Map<String, ExecutableElement> map, TypeElement typeElement) {
        return builderMaker(BUILDER_METHOD_NAMES, map, typeElement, 0);
    }

    private Map<String, ExecutableElement> noArgMethodsOf(TypeElement typeElement) {
        return methodsOf(typeElement, 0);
    }

    private Optional<ExecutableElement> oneArgBuilderMaker(Map<String, ExecutableElement> map, TypeElement typeElement) {
        return builderMaker(ONE_ARGUMENT_BUILDER_METHOD_NAMES, map, typeElement, 1);
    }

    private ImmutableMap<String, ExecutableElement> oneArgumentMethodsOf(TypeElement typeElement) {
        return methodsOf(typeElement, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x01bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Optional<com.google.auto.value.processor.PropertyBuilderClassifier.PropertyBuilder> makePropertyBuilder(javax.lang.model.element.ExecutableElement r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 553
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.auto.value.processor.PropertyBuilderClassifier.makePropertyBuilder(javax.lang.model.element.ExecutableElement, java.lang.String):java.util.Optional");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ExecutableElement lambda$methodsOf$7(ExecutableElement executableElement, ExecutableElement executableElement2) {
        return executableElement;
    }
}
