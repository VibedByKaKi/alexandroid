package com.google.auto.value.processor;

import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import autovalue.shaded.com.google.auto.common.GeneratedAnnotations;
import autovalue.shaded.com.google.auto.common.MoreElements;
import autovalue.shaded.com.google.auto.common.MoreTypes;
import autovalue.shaded.com.google.auto.common.SuperficialValidation;
import autovalue.shaded.com.google.auto.service.AutoService;
import autovalue.shaded.com.google.common.base.Preconditions;
import autovalue.shaded.com.google.common.base.Throwables;
import autovalue.shaded.com.google.common.collect.ImmutableList;
import autovalue.shaded.com.google.common.collect.ImmutableMap;
import autovalue.shaded.com.google.common.collect.ImmutableSet;
import autovalue.shaded.com.google.common.collect.Maps;
import autovalue.shaded.com.google.common.collect.UnmodifiableIterator;
import autovalue.shaded.com.google.common.hash.Hashing;
import autovalue.shaded.com.google.common.primitives.Primitives;
import autovalue.shaded.com.google.errorprone.annotations.FormatMethod;
import autovalue.shaded.net.ltgt.gradle.incap.IncrementalAnnotationProcessor;
import autovalue.shaded.net.ltgt.gradle.incap.IncrementalAnnotationProcessorType;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.AnnotationValue;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.PrimitiveType;
import javax.lang.model.type.TypeKind;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.type.WildcardType;
import javax.lang.model.util.ElementFilter;
import javax.lang.model.util.Elements;
import javax.lang.model.util.Types;
import javax.tools.Diagnostic;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoService({Processor.class})
@IncrementalAnnotationProcessor(IncrementalAnnotationProcessorType.ISOLATING)
@SupportedAnnotationTypes({"com.google.auto.value.AutoAnnotation"})
/* loaded from: classes8.dex */
public class AutoAnnotationProcessor extends AbstractProcessor {
    private Elements elementUtils;
    private TypeMirror javaLangObject;
    private Types typeUtils;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Member {
        private final Element context;
        private final ExecutableElement method;
        private final ProcessingEnvironment processingEnv;

        public Member(ProcessingEnvironment processingEnvironment, Element element, ExecutableElement executableElement) {
            this.processingEnv = processingEnvironment;
            this.context = element;
            this.method = executableElement;
        }

        public String getComponentType() {
            Preconditions.checkState(getTypeMirror().getKind() == TypeKind.ARRAY);
            return TypeEncoder.encode(MoreTypes.asArray(getTypeMirror()).getComponentType());
        }

        public String getDefaultValue() {
            AnnotationValue defaultValue = this.method.getDefaultValue();
            if (defaultValue == null) {
                return null;
            }
            return AnnotationOutput.sourceFormForInitializer(defaultValue, this.processingEnv, this.method.getSimpleName().toString(), this.context);
        }

        public TypeKind getKind() {
            return getTypeMirror().getKind();
        }

        public int getNameHash() {
            return toString().hashCode() * 127;
        }

        public String getType() {
            return TypeEncoder.encode(getTypeMirror());
        }

        public TypeMirror getTypeMirror() {
            return this.method.getReturnType();
        }

        public boolean isArrayOfClassWithBounds() {
            if (getTypeMirror().getKind() != TypeKind.ARRAY) {
                return false;
            }
            TypeMirror componentType = MoreTypes.asArray(getTypeMirror()).getComponentType();
            if (componentType.getKind() != TypeKind.DECLARED) {
                return false;
            }
            DeclaredType asDeclared = MoreTypes.asDeclared(componentType);
            if (!MoreElements.asType(this.processingEnv.getTypeUtils().asElement(componentType)).getQualifiedName().contentEquals("java.lang.Class") || asDeclared.getTypeArguments().size() != 1) {
                return false;
            }
            TypeMirror typeMirror = (TypeMirror) asDeclared.getTypeArguments().get(0);
            if (typeMirror.getKind() != TypeKind.WILDCARD) {
                return true;
            }
            WildcardType asWildcard = MoreTypes.asWildcard(typeMirror);
            return (asWildcard.getSuperBound() == null && asWildcard.getExtendsBound() == null) ? false : true;
        }

        public String toString() {
            return this.method.getSimpleName().toString();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Parameter {
        private final TypeKind kind;
        private final String typeName;

        public Parameter(TypeMirror typeMirror) {
            this.typeName = TypeEncoder.encode(typeMirror);
            this.kind = typeMirror.getKind();
        }

        public TypeKind getKind() {
            return this.kind;
        }

        public String getType() {
            return this.typeName;
        }
    }

    @FormatMethod
    private AbortProcessingException abortWithError(Element element, String str, Object... objArr) {
        reportError(element, str, objArr);
        return new AbortProcessingException();
    }

    private boolean compatibleTypes(TypeMirror typeMirror, TypeMirror typeMirror2) {
        if (this.typeUtils.isAssignable(typeMirror, typeMirror2)) {
            return true;
        }
        if (typeMirror2.getKind() != TypeKind.ARRAY) {
            return false;
        }
        TypeMirror componentType = MoreTypes.asArray(typeMirror2).getComponentType();
        if (componentType.getKind().isPrimitive()) {
            componentType = this.typeUtils.boxedClass((PrimitiveType) componentType).asType();
        }
        return this.typeUtils.isAssignable(typeMirror, this.typeUtils.getDeclaredType(this.elementUtils.getTypeElement(Collection.class.getCanonicalName()), new TypeMirror[]{componentType}));
    }

    private static long computeSerialVersionUid(ImmutableMap<String, Member> immutableMap, ImmutableMap<String, Parameter> immutableMap2) {
        return Hashing.murmur3_128().hashUnencodedChars((String) immutableMap.entrySet().stream().filter(new BuilderSpec$Builder$$ExternalSyntheticLambda9(immutableMap2, 4)).map(new KotlinMetadata$$ExternalSyntheticLambda3(11)).sorted(Comparator.comparing(new KotlinMetadata$$ExternalSyntheticLambda3(12))).map(new KotlinMetadata$$ExternalSyntheticLambda3(13)).collect(Collectors.joining(";"))).asLong();
    }

    private String equalsParameterType() {
        return TypeEncoder.encodeWithAnnotations(this.javaLangObject, Nullables.fromMethods(this.processingEnv, ImmutableList.of()).nullableTypeAnnotations());
    }

    private static String fullyQualifiedName(String str, String str2) {
        return str.isEmpty() ? str2 : a$$ExternalSyntheticOutline0.m$1(str, ".", str2);
    }

    private String generatedClassName(ExecutableElement executableElement) {
        TypeElement asType = MoreElements.asType(executableElement.getEnclosingElement());
        String obj = asType.getSimpleName().toString();
        while (MoreElements.isType(asType.getEnclosingElement())) {
            asType = MoreElements.asType(asType.getEnclosingElement());
            obj = asType.getSimpleName() + "_" + obj;
        }
        StringBuilder m2m = a$$ExternalSyntheticOutline0.m2m("AutoAnnotation_", obj, "_");
        m2m.append(executableElement.getSimpleName());
        return m2m.toString();
    }

    private TypeElement getAnnotationReturnType(ExecutableElement executableElement) {
        TypeMirror returnType = executableElement.getReturnType();
        if (returnType.getKind() == TypeKind.DECLARED) {
            Element asElement = this.typeUtils.asElement(executableElement.getReturnType());
            if (asElement.getKind() == ElementKind.ANNOTATION_TYPE) {
                return MoreElements.asType(asElement);
            }
        }
        throw abortWithError(executableElement, "Return type of @AutoAnnotation method must be an annotation type, not %s", returnType);
    }

    private ImmutableMap<String, AnnotationValue> getDefaultValues(TypeElement typeElement) {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        for (ExecutableElement executableElement : ElementFilter.methodsIn(typeElement.getEnclosedElements())) {
            String obj = executableElement.getSimpleName().toString();
            AnnotationValue defaultValue = executableElement.getDefaultValue();
            if (defaultValue != null) {
                builder.put(obj, defaultValue);
            }
        }
        return builder.build();
    }

    private String getGeneratedTypeName() {
        return (String) GeneratedAnnotations.generatedAnnotation(this.elementUtils, this.processingEnv.getSourceVersion()).map(new AutoAnnotationProcessor$$ExternalSyntheticLambda2()).orElse("");
    }

    private ImmutableMap<String, ExecutableElement> getMemberMethods(TypeElement typeElement) {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        for (ExecutableElement executableElement : ElementFilter.methodsIn(typeElement.getEnclosedElements())) {
            builder.put(executableElement.getSimpleName().toString(), executableElement);
        }
        return builder.build();
    }

    private ImmutableMap<String, Member> getMembers(Element element, ImmutableMap<String, ExecutableElement> immutableMap) {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        UnmodifiableIterator<Map.Entry<String, ExecutableElement>> it2 = immutableMap.entrySet().iterator();
        while (it2.hasNext()) {
            ExecutableElement value = it2.next().getValue();
            builder.put(value.getSimpleName().toString(), new Member(this.processingEnv, element, value));
        }
        return builder.build();
    }

    private ImmutableMap<String, Parameter> getParameters(TypeElement typeElement, ExecutableElement executableElement, Map<String, Member> map) {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        boolean z = false;
        for (VariableElement variableElement : executableElement.getParameters()) {
            String obj = variableElement.getSimpleName().toString();
            Member member = map.get(obj);
            if (member == null) {
                reportError(variableElement, "@AutoAnnotation method parameter '%s' must have the same name as a member of %s", obj, typeElement);
            } else {
                TypeMirror asType = variableElement.asType();
                TypeMirror typeMirror = member.getTypeMirror();
                if (compatibleTypes(asType, typeMirror)) {
                    builder.put(obj, new Parameter(asType));
                } else {
                    reportError(variableElement, "@AutoAnnotation method parameter '%s' has type %s but %s.%s has type %s", obj, asType, typeElement, obj, typeMirror);
                }
            }
            z = true;
        }
        if (z) {
            throw new AbortProcessingException();
        }
        return builder.build();
    }

    private TypeMirror getTypeMirror(Class<?> cls) {
        return this.elementUtils.getTypeElement(cls.getName()).asType();
    }

    private static Optional<Integer> invariableHash(List<? extends AnnotationValue> list) {
        Iterator<? extends AnnotationValue> it2 = list.iterator();
        int i = 1;
        while (it2.hasNext()) {
            Optional<Integer> invariableHash = invariableHash(it2.next());
            if (!invariableHash.isPresent()) {
                return Optional.empty();
            }
            i = (i * 31) + invariableHash.get().intValue();
        }
        return Optional.of(Integer.valueOf(i));
    }

    private static ImmutableMap<String, Integer> invariableHashes(ImmutableMap<String, Member> immutableMap, ImmutableSet<String> immutableSet) {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        UnmodifiableIterator<String> it2 = immutableMap.keySet().iterator();
        while (it2.hasNext()) {
            String next = it2.next();
            if (!immutableSet.contains(next)) {
                Optional<Integer> invariableHash = invariableHash(immutableMap.get(next).method.getDefaultValue());
                if (invariableHash.isPresent()) {
                    builder.put(next, Integer.valueOf(invariableHash.get().intValue() ^ (next.hashCode() * 127)));
                }
            }
        }
        return builder.build();
    }

    private static boolean isGwtCompatible(TypeElement typeElement) {
        return typeElement.getAnnotationMirrors().stream().map(new AutoAnnotationProcessor$$ExternalSyntheticLambda0()).anyMatch(new AutoAnnotationProcessor$$ExternalSyntheticLambda1());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$computeSerialVersionUid$3(ImmutableMap immutableMap, Map.Entry entry) {
        return immutableMap.containsKey(entry.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map.Entry lambda$computeSerialVersionUid$4(Map.Entry entry) {
        return Maps.immutableEntry((String) entry.getKey(), ((Member) entry.getValue()).getType().replace("`", ""));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$computeSerialVersionUid$5(Map.Entry entry) {
        return ((String) entry.getKey()) + ":" + ((String) entry.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getGeneratedTypeName$0(TypeElement typeElement) {
        return TypeEncoder.encode(typeElement.asType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Element lambda$isGwtCompatible$1(AnnotationMirror annotationMirror) {
        return annotationMirror.getAnnotationType().asElement();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$isGwtCompatible$2(Element element) {
        return element.getSimpleName().contentEquals("GwtCompatible");
    }

    private boolean methodsAreOverloaded(List<ExecutableElement> list) {
        HashSet hashSet = new HashSet();
        boolean z = false;
        for (ExecutableElement executableElement : list) {
            if (!hashSet.add(fullyQualifiedName(MoreElements.getPackage(executableElement).getQualifiedName().toString(), generatedClassName(executableElement)))) {
                reportError(executableElement, "@AutoAnnotation methods cannot be overloaded", new Object[0]);
                z = true;
            }
        }
        return z;
    }

    private void process(RoundEnvironment roundEnvironment) {
        List<ExecutableElement> methodsIn = ElementFilter.methodsIn(roundEnvironment.getElementsAnnotatedWith(this.elementUtils.getTypeElement("com.google.auto.value.AutoAnnotation")));
        if (!SuperficialValidation.validateElements(methodsIn) || methodsAreOverloaded(methodsIn)) {
            return;
        }
        for (ExecutableElement executableElement : methodsIn) {
            try {
                processMethod(executableElement);
            } catch (AbortProcessingException unused) {
            } catch (RuntimeException e) {
                reportError(executableElement, "@AutoAnnotation processor threw an exception: %s", Throwables.getStackTraceAsString(e));
                throw e;
            }
        }
    }

    private void processMethod(ExecutableElement executableElement) {
        TypeElement annotationReturnType = getAnnotationReturnType(executableElement);
        ImmutableSet<Class<?>> wrapperTypesUsedInCollections = wrapperTypesUsedInCollections(executableElement);
        ImmutableMap<String, ExecutableElement> memberMethods = getMemberMethods(annotationReturnType);
        TypeElement asType = MoreElements.asType(executableElement.getEnclosingElement());
        String packageNameOf = TypeSimplifier.packageNameOf(asType);
        ImmutableMap<String, AnnotationValue> defaultValues = getDefaultValues(annotationReturnType);
        ImmutableMap<String, Member> members = getMembers(executableElement, memberMethods);
        ImmutableMap<String, Parameter> parameters = getParameters(annotationReturnType, executableElement, members);
        validateParameters(annotationReturnType, executableElement, members, parameters, defaultValues);
        String generatedClassName = generatedClassName(executableElement);
        AutoAnnotationTemplateVars autoAnnotationTemplateVars = new AutoAnnotationTemplateVars();
        autoAnnotationTemplateVars.annotationFullName = annotationReturnType.toString();
        autoAnnotationTemplateVars.annotationName = TypeEncoder.encode(annotationReturnType.asType());
        autoAnnotationTemplateVars.className = generatedClassName;
        autoAnnotationTemplateVars.generated = getGeneratedTypeName();
        autoAnnotationTemplateVars.members = members;
        autoAnnotationTemplateVars.params = parameters;
        autoAnnotationTemplateVars.equalsParameterType = equalsParameterType();
        autoAnnotationTemplateVars.pkg = packageNameOf;
        autoAnnotationTemplateVars.wrapperTypesUsedInCollections = wrapperTypesUsedInCollections;
        autoAnnotationTemplateVars.gwtCompatible = Boolean.valueOf(isGwtCompatible(annotationReturnType));
        autoAnnotationTemplateVars.serialVersionUID = Long.valueOf(computeSerialVersionUid(members, parameters));
        ImmutableMap<String, Integer> invariableHashes = invariableHashes(members, parameters.keySet());
        autoAnnotationTemplateVars.invariableHashSum = 0;
        UnmodifiableIterator<Integer> it2 = invariableHashes.values().iterator();
        while (it2.hasNext()) {
            autoAnnotationTemplateVars.invariableHashSum = TableInfo$$ExternalSyntheticOutline0.m(it2.next().intValue(), autoAnnotationTemplateVars.invariableHashSum);
        }
        autoAnnotationTemplateVars.invariableHashes = invariableHashes.keySet();
        writeSourceFile(fullyQualifiedName(packageNameOf, generatedClassName), Reformatter.fixup(TypeEncoder.decode(autoAnnotationTemplateVars.toText(), this.processingEnv, packageNameOf, annotationReturnType.asType())), asType);
    }

    @FormatMethod
    private void reportError(Element element, String str, Object... objArr) {
        this.processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR, String.format(str, objArr), element);
    }

    private void validateParameters(TypeElement typeElement, ExecutableElement executableElement, ImmutableMap<String, Member> immutableMap, ImmutableMap<String, Parameter> immutableMap2, ImmutableMap<String, AnnotationValue> immutableMap3) {
        UnmodifiableIterator<String> it2 = immutableMap.keySet().iterator();
        boolean z = false;
        while (it2.hasNext()) {
            String next = it2.next();
            if (!immutableMap2.containsKey(next) && !immutableMap3.containsKey(next)) {
                reportError(executableElement, "@AutoAnnotation method needs a parameter with name '%s' and type %s corresponding to %s.%s, which has no default value", next, immutableMap.get(next).getType(), typeElement, next);
                z = true;
            }
        }
        if (z) {
            throw new AbortProcessingException();
        }
    }

    private ImmutableSet<Class<?>> wrapperTypesUsedInCollections(ExecutableElement executableElement) {
        TypeElement typeElement = this.elementUtils.getTypeElement(Collection.class.getName());
        ImmutableSet.Builder builder = ImmutableSet.builder();
        for (Class<?> cls : Primitives.allWrapperTypes()) {
            DeclaredType declaredType = this.typeUtils.getDeclaredType(typeElement, new TypeMirror[]{getTypeMirror(cls)});
            Iterator it2 = executableElement.getParameters().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (this.typeUtils.isAssignable(((VariableElement) it2.next()).asType(), declaredType)) {
                    builder.add((ImmutableSet.Builder) cls);
                    break;
                }
            }
        }
        return builder.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void writeSourceFile(String str, String str2, TypeElement typeElement) {
        try {
            Writer openWriter = this.processingEnv.getFiler().createSourceFile(str, new Element[]{typeElement}).openWriter();
            try {
                openWriter.write(str2);
                openWriter.close();
            } finally {
            }
        } catch (IOException e) {
            this.processingEnv.getMessager().printMessage(Diagnostic.Kind.WARNING, "Could not write generated class " + str + ": " + e);
        }
    }

    /* renamed from: getSupportedOptions, reason: merged with bridge method [inline-methods] */
    public ImmutableSet<String> m24520getSupportedOptions() {
        return ImmutableSet.of("com.google.auto.value.NullableTypeAnnotation");
    }

    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latestSupported();
    }

    public synchronized void init(ProcessingEnvironment processingEnvironment) {
        super.init(processingEnvironment);
        this.elementUtils = processingEnvironment.getElementUtils();
        this.typeUtils = processingEnvironment.getTypeUtils();
        this.javaLangObject = this.elementUtils.getTypeElement("java.lang.Object").asType();
    }

    private static Optional<Integer> invariableHash(AnnotationValue annotationValue) {
        Object value = annotationValue.getValue();
        if (!(value instanceof String) && !Primitives.isWrapperType(value.getClass())) {
            if (value instanceof List) {
                return invariableHash((List<? extends AnnotationValue>) value);
            }
            return Optional.empty();
        }
        return Optional.of(Integer.valueOf(value.hashCode()));
    }

    public boolean process(Set<? extends TypeElement> set, RoundEnvironment roundEnvironment) {
        process(roundEnvironment);
        return false;
    }
}
