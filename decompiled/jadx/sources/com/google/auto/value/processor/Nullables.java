package com.google.auto.value.processor;

import autovalue.shaded.com.google.auto.common.MoreTypes;
import autovalue.shaded.com.google.common.base.Strings;
import autovalue.shaded.com.google.common.collect.ImmutableList;
import autovalue.shaded.com.google.common.collect.ImmutableMap;
import com.amazon.alexa.crashreporting.CustomGroupingHashProvider$$ExternalSyntheticLambda5;
import com.google.auto.value.processor.Nullables;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.processing.ProcessingEnvironment;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.AnnotationValue;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.type.ArrayType;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.IntersectionType;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.type.TypeVariable;
import javax.lang.model.type.WildcardType;
import javax.lang.model.util.SimpleTypeVisitor8;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
class Nullables {
    private static final String DEFAULT_NULLABLE = "org".concat(".jspecify.nullness.Nullable");
    static final String NULLABLE_OPTION = "com.google.auto.value.NullableTypeAnnotation";
    private final Optional<AnnotationMirror> nullableTypeAnnotation;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class NullableFinder extends SimpleTypeVisitor8<Optional<AnnotationMirror>, Void> {
        private final TypeMirrorSet visiting;

        public NullableFinder() {
            super(Optional.empty());
            this.visiting = new TypeMirrorSet();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Optional lambda$visitArray$2(ArrayType arrayType) {
            return (Optional) visit(arrayType.getComponentType());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Optional lambda$visitDeclared$0(DeclaredType declaredType) {
            return visitAll(declaredType.getTypeArguments());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Optional lambda$visitIntersection$4(IntersectionType intersectionType) {
            return visitAll(intersectionType.getBounds());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Optional lambda$visitTypeVariable$1(TypeVariable typeVariable) {
            return visitAll(ImmutableList.of(typeVariable.getUpperBound(), typeVariable.getLowerBound()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Optional lambda$visitWildcard$3(WildcardType wildcardType) {
            return visitAll((List) Stream.of((Object[]) new TypeMirror[]{wildcardType.getExtendsBound(), wildcardType.getSuperBound()}).filter(new Nullables$NullableFinder$$ExternalSyntheticLambda7()).collect(Collectors.toList()));
        }

        private Optional<AnnotationMirror> visitAll(List<? extends TypeMirror> list) {
            return (Optional) list.stream().map(new Function() { // from class: com.google.auto.value.processor.Nullables$NullableFinder$$ExternalSyntheticLambda0
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    Object visit;
                    visit = Nullables.NullableFinder.this.visit((TypeMirror) obj);
                    return (Optional) visit;
                }
            }).filter(new CustomGroupingHashProvider$$ExternalSyntheticLambda5(6)).findFirst().orElse(Optional.empty());
        }

        public Optional<AnnotationMirror> visitArray(ArrayType arrayType, Void r4) {
            return (Optional) Nullables.nullableIn((List<? extends AnnotationMirror>) arrayType.getAnnotationMirrors()).map(new Nullables$NullableFinder$$ExternalSyntheticLambda1()).orElseGet(new Nullables$NullableFinder$$ExternalSyntheticLambda2(this, arrayType, 3));
        }

        public Optional<AnnotationMirror> visitDeclared(DeclaredType declaredType, Void r4) {
            return !this.visiting.add((TypeMirror) declaredType) ? Optional.empty() : (Optional) Nullables.nullableIn((List<? extends AnnotationMirror>) declaredType.getAnnotationMirrors()).map(new Nullables$NullableFinder$$ExternalSyntheticLambda1()).orElseGet(new Nullables$NullableFinder$$ExternalSyntheticLambda2(this, declaredType, 4));
        }

        public Optional<AnnotationMirror> visitIntersection(IntersectionType intersectionType, Void r4) {
            return (Optional) Nullables.nullableIn((List<? extends AnnotationMirror>) intersectionType.getAnnotationMirrors()).map(new Nullables$NullableFinder$$ExternalSyntheticLambda1()).orElseGet(new Nullables$NullableFinder$$ExternalSyntheticLambda2(this, intersectionType, 1));
        }

        public Optional<AnnotationMirror> visitTypeVariable(TypeVariable typeVariable, Void r4) {
            return !this.visiting.add((TypeMirror) typeVariable) ? Optional.empty() : (Optional) Nullables.nullableIn((List<? extends AnnotationMirror>) typeVariable.getAnnotationMirrors()).map(new Nullables$NullableFinder$$ExternalSyntheticLambda1()).orElseGet(new Nullables$NullableFinder$$ExternalSyntheticLambda2(this, typeVariable, 0));
        }

        public Optional<AnnotationMirror> visitWildcard(WildcardType wildcardType, Void r4) {
            return (Optional) Nullables.nullableIn((List<? extends AnnotationMirror>) wildcardType.getAnnotationMirrors()).map(new Nullables$NullableFinder$$ExternalSyntheticLambda1()).orElseGet(new Nullables$NullableFinder$$ExternalSyntheticLambda2(this, wildcardType, 2));
        }
    }

    private Nullables(Optional<AnnotationMirror> optional) {
        this.nullableTypeAnnotation = optional;
    }

    private static AnnotationMirror annotationMirrorOf(final DeclaredType declaredType) {
        return new AnnotationMirror() { // from class: com.google.auto.value.processor.Nullables.1
            public DeclaredType getAnnotationType() {
                return declaredType;
            }

            /* renamed from: getElementValues, reason: merged with bridge method [inline-methods] */
            public ImmutableMap<? extends ExecutableElement, ? extends AnnotationValue> m24559getElementValues() {
                return ImmutableMap.of();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Optional<AnnotationMirror> defaultNullableTypeAnnotation(ProcessingEnvironment processingEnvironment) {
        if (processingEnvironment == null) {
            return Optional.empty();
        }
        String nullToEmpty = Strings.nullToEmpty((String) processingEnvironment.getOptions().getOrDefault(NULLABLE_OPTION, DEFAULT_NULLABLE));
        return (nullToEmpty.isEmpty() || processingEnvironment.getSourceVersion().ordinal() < SourceVersion.RELEASE_8.ordinal()) ? Optional.empty() : Optional.ofNullable(processingEnvironment.getElementUtils().getTypeElement(nullToEmpty)).map(new Nullables$$ExternalSyntheticLambda6());
    }

    public static Nullables fromMethods(ProcessingEnvironment processingEnvironment, Collection<ExecutableElement> collection) {
        return new Nullables((Optional) collection.stream().flatMap(new Nullables$$ExternalSyntheticLambda0()).map(new Nullables$$ExternalSyntheticLambda1()).filter(new CustomGroupingHashProvider$$ExternalSyntheticLambda5(6)).findFirst().orElseGet(new Nullables$$ExternalSyntheticLambda2(processingEnvironment, 0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ AnnotationMirror lambda$defaultNullableTypeAnnotation$2(TypeElement typeElement) {
        return annotationMirrorOf(MoreTypes.asDeclared(typeElement.asType()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Stream lambda$fromMethods$0(ExecutableElement executableElement) {
        return Stream.concat(Stream.of(executableElement.getReturnType()), executableElement.getParameters().stream().map(new AutoBuilderProcessor$$ExternalSyntheticLambda30()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$nullableIn$3(AnnotationMirror annotationMirror) {
        return annotationMirror.getAnnotationType().asElement().getSimpleName().contentEquals("Nullable");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Optional<AnnotationMirror> nullableIn(List<? extends AnnotationMirror> list) {
        return list.stream().filter(new Nullables$$ExternalSyntheticLambda4()).map(new Nullables$$ExternalSyntheticLambda5()).findFirst();
    }

    public ImmutableList<AnnotationMirror> nullableTypeAnnotations() {
        return (ImmutableList) this.nullableTypeAnnotation.map(new Nullables$$ExternalSyntheticLambda3()).orElse(ImmutableList.of());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ AnnotationMirror lambda$nullableIn$4(AnnotationMirror annotationMirror) {
        return annotationMirror;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Optional<AnnotationMirror> nullableIn(TypeMirror typeMirror) {
        return (Optional) new NullableFinder().visit(typeMirror);
    }
}
