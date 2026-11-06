package com.google.auto.value.processor;

import autovalue.shaded.com.google.auto.common.AnnotationMirrors;
import autovalue.shaded.com.google.auto.common.MoreElements;
import autovalue.shaded.com.google.auto.common.MoreTypes;
import autovalue.shaded.com.google.auto.service.AutoService;
import autovalue.shaded.com.google.common.collect.ImmutableBiMap;
import autovalue.shaded.com.google.common.collect.ImmutableListMultimap;
import autovalue.shaded.com.google.common.collect.ImmutableMap;
import autovalue.shaded.com.google.common.collect.ImmutableSet;
import autovalue.shaded.com.google.common.collect.Iterables;
import autovalue.shaded.com.google.common.collect.UnmodifiableIterator;
import autovalue.shaded.net.ltgt.gradle.incap.IncrementalAnnotationProcessor;
import autovalue.shaded.net.ltgt.gradle.incap.IncrementalAnnotationProcessorType;
import com.google.auto.value.processor.AutoValueishProcessor;
import com.google.auto.value.processor.MissingTypes;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.Processor;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.TypeKind;
import javax.lang.model.type.TypeMirror;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoService({Processor.class})
@IncrementalAnnotationProcessor(IncrementalAnnotationProcessorType.ISOLATING)
@SupportedAnnotationTypes({"com.google.auto.value.AutoOneOf"})
/* loaded from: classes8.dex */
public class AutoOneOfProcessor extends AutoValueishProcessor {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.google.auto.value.processor.AutoOneOfProcessor$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$javax$lang$model$type$TypeKind;

        static {
            int[] iArr = new int[TypeKind.values().length];
            $SwitchMap$javax$lang$model$type$TypeKind = iArr;
            try {
                iArr[TypeKind.DECLARED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$javax$lang$model$type$TypeKind[TypeKind.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public AutoOneOfProcessor() {
        super("com.google.auto.value.AutoOneOf", false);
    }

    private void defineVarsForType(TypeElement typeElement, AutoOneOfTemplateVars autoOneOfTemplateVars, ImmutableMap<ExecutableElement, AnnotatedTypeMirror> immutableMap, ExecutableElement executableElement, Nullables nullables) {
        autoOneOfTemplateVars.props = propertySet(immutableMap, ImmutableListMultimap.of(), ImmutableListMultimap.of(), nullables);
        autoOneOfTemplateVars.kindGetter = executableElement.getSimpleName().toString();
        autoOneOfTemplateVars.kindType = TypeEncoder.encode(executableElement.getReturnType());
        TypeElement typeElement2 = elementUtils().getTypeElement("java.io.Serializable");
        autoOneOfTemplateVars.serializable = Boolean.valueOf(typeElement2 != null && typeUtils().isAssignable(typeElement.asType(), typeElement2.asType()));
    }

    private ExecutableElement findKindGetterOrAbort(TypeElement typeElement, final TypeMirror typeMirror, ImmutableSet<ExecutableElement> immutableSet) {
        Set set = (Set) immutableSet.stream().filter(new Predicate() { // from class: com.google.auto.value.processor.AutoOneOfProcessor$$ExternalSyntheticLambda0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean lambda$findKindGetterOrAbort$6;
                lambda$findKindGetterOrAbort$6 = AutoOneOfProcessor.lambda$findKindGetterOrAbort$6(typeMirror, (ExecutableElement) obj);
                return lambda$findKindGetterOrAbort$6;
            }
        }).filter(new AutoOneOfProcessor$$ExternalSyntheticLambda1()).collect(Collectors.toSet());
        int size = set.size();
        if (size == 0) {
            errorReporter().reportError(typeElement, "[AutoOneOfNoKindGetter] %s must have a no-arg abstract method returning %s", typeElement, typeMirror);
        } else {
            if (size == 1) {
                return (ExecutableElement) Iterables.getOnlyElement(set);
            }
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                errorReporter().reportError((ExecutableElement) it2.next(), "[AutoOneOfTwoKindGetters] More than one abstract method returns %s", typeMirror);
            }
        }
        throw new AbortProcessingException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$findKindGetterOrAbort$6(TypeMirror typeMirror, ExecutableElement executableElement) {
        return sameType(typeMirror, executableElement.getReturnType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$findKindGetterOrAbort$7(ExecutableElement executableElement) {
        return executableElement.getParameters().isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$propertyToKindMap$1(Element element) {
        return element.getKind().equals(ElementKind.ENUM_CONSTANT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$propertyToKindMap$2(Element element) {
        return transformName(element.getSimpleName().toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$propertyToKindMap$4(Map map, TypeElement typeElement, String str, String str2) {
        if (map.containsKey(str)) {
            return;
        }
        errorReporter().reportError(typeElement, "[AutoOneOfNoEnumConstant] Enum has no constant with name corresponding to property '%s'", str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$propertyToKindMap$5(Map map, String str, Element element) {
        if (map.containsKey(str)) {
            return;
        }
        errorReporter().reportError(element, "[AutoOneOfBadEnumConstant] Name of enum constant '%s' does not correspond to any property name", element.getSimpleName());
    }

    private DeclaredType mirrorForKindType(TypeElement typeElement) {
        Object value = AnnotationMirrors.getAnnotationValue(AutoValueishProcessor.getAnnotationMirror(typeElement, "com.google.auto.value.AutoOneOf").get(), "value").getValue();
        if (value instanceof TypeMirror) {
            TypeMirror typeMirror = (TypeMirror) value;
            int i = AnonymousClass1.$SwitchMap$javax$lang$model$type$TypeKind[typeMirror.getKind().ordinal()];
            if (i == 1) {
                return MoreTypes.asDeclared(typeMirror);
            }
            if (i == 2) {
                throw new MissingTypes.MissingTypeException(MoreTypes.asError(typeMirror));
            }
        }
        throw new MissingTypes.MissingTypeException(null);
    }

    private ImmutableMap<String, String> propertyToKindMap(DeclaredType declaredType, ImmutableSet<String> immutableSet) {
        final TypeElement asType = MoreElements.asType(declaredType.asElement());
        final Map map = (Map) immutableSet.stream().collect(Collectors.toMap(new AutoOneOfProcessor$$ExternalSyntheticLambda2(this, 0), new KotlinMetadata$$ExternalSyntheticLambda3(17)));
        final Map map2 = (Map) asType.getEnclosedElements().stream().filter(new AutoOneOfProcessor$$ExternalSyntheticLambda4()).collect(Collectors.toMap(new Function() { // from class: com.google.auto.value.processor.AutoOneOfProcessor$$ExternalSyntheticLambda5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String lambda$propertyToKindMap$2;
                lambda$propertyToKindMap$2 = AutoOneOfProcessor.this.lambda$propertyToKindMap$2((Element) obj);
                return lambda$propertyToKindMap$2;
            }
        }, new AutoOneOfProcessor$$ExternalSyntheticLambda6()));
        if (!map.keySet().equals(map2.keySet())) {
            map.forEach(new BiConsumer() { // from class: com.google.auto.value.processor.AutoOneOfProcessor$$ExternalSyntheticLambda7
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    AutoOneOfProcessor.this.lambda$propertyToKindMap$4(map2, asType, (String) obj, (String) obj2);
                }
            });
            map2.forEach(new BiConsumer() { // from class: com.google.auto.value.processor.AutoOneOfProcessor$$ExternalSyntheticLambda8
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    AutoOneOfProcessor.this.lambda$propertyToKindMap$5(map, (String) obj, (Element) obj2);
                }
            });
            throw new AbortProcessingException();
        }
        ImmutableMap.Builder builder = ImmutableMap.builder();
        for (String str : map.keySet()) {
            builder.put((String) map.get(str), ((Element) map2.get(str)).getSimpleName().toString());
        }
        return builder.build();
    }

    private static boolean sameType(TypeMirror typeMirror, TypeMirror typeMirror2) {
        return MoreTypes.equivalence().equivalent(typeMirror, typeMirror2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String transformName(String str) {
        return str.toLowerCase(Locale.ROOT).replace("_", "");
    }

    private void validateMethods(TypeElement typeElement, ImmutableSet<ExecutableElement> immutableSet, ImmutableSet<ExecutableElement> immutableSet2, ExecutableElement executableElement) {
        UnmodifiableIterator<ExecutableElement> it2 = immutableSet.iterator();
        while (it2.hasNext()) {
            ExecutableElement next = it2.next();
            if (immutableSet2.contains(next)) {
                checkReturnType(typeElement, next);
            } else if (!next.equals(executableElement) && AutoValueishProcessor.objectMethodToOverride(next) == AutoValueishProcessor.ObjectMethod.NONE) {
                errorReporter().reportWarning(next, "[AutoOneOfParams] Abstract methods in @AutoOneOf classes must have no parameters", new Object[0]);
            }
        }
        errorReporter().abortIfAnyError();
    }

    /* renamed from: getSupportedOptions, reason: merged with bridge method [inline-methods] */
    public ImmutableSet<String> m24530getSupportedOptions() {
        return ImmutableSet.of("com.google.auto.value.NullableTypeAnnotation");
    }

    @Override // com.google.auto.value.processor.AutoValueishProcessor
    public /* bridge */ /* synthetic */ void init(ProcessingEnvironment processingEnvironment) {
        super.init(processingEnvironment);
    }

    @Override // com.google.auto.value.processor.AutoValueishProcessor
    public Optional<String> nullableAnnotationForMethod(ExecutableElement executableElement) {
        if (AutoValueishProcessor.nullableAnnotationFor(executableElement, executableElement.getReturnType()).isPresent()) {
            errorReporter().reportError(executableElement, "[AutoOneOfNullable] @AutoOneOf properties cannot be @Nullable", new Object[0]);
        }
        return Optional.empty();
    }

    @Override // com.google.auto.value.processor.AutoValueishProcessor
    public void processType(TypeElement typeElement) {
        DeclaredType mirrorForKindType = mirrorForKindType(typeElement);
        ImmutableSet<ExecutableElement> localAndInheritedMethods = MoreElements.getLocalAndInheritedMethods(typeElement, this.processingEnv.getTypeUtils(), this.processingEnv.getElementUtils());
        ImmutableSet<ExecutableElement> abstractMethodsIn = AutoValueishProcessor.abstractMethodsIn(localAndInheritedMethods);
        ExecutableElement findKindGetterOrAbort = findKindGetterOrAbort(typeElement, mirrorForKindType, abstractMethodsIn);
        Set<ExecutableElement> linkedHashSet = new LinkedHashSet<>(abstractMethodsIn);
        linkedHashSet.remove(findKindGetterOrAbort);
        ImmutableMap<ExecutableElement, AnnotatedTypeMirror> propertyMethodsIn = propertyMethodsIn(linkedHashSet, typeElement);
        ImmutableBiMap<String, ExecutableElement> propertyNameToMethodMap = propertyNameToMethodMap(propertyMethodsIn.keySet());
        validateMethods(typeElement, abstractMethodsIn, propertyMethodsIn.keySet(), findKindGetterOrAbort);
        ImmutableMap<String, String> propertyToKindMap = propertyToKindMap(mirrorForKindType, propertyNameToMethodMap.keySet());
        String generatedClassName = AutoValueishProcessor.generatedClassName(typeElement, "AutoOneOf_");
        AutoOneOfTemplateVars autoOneOfTemplateVars = new AutoOneOfTemplateVars();
        autoOneOfTemplateVars.generatedClass = TypeSimplifier.simpleNameOf(generatedClassName);
        autoOneOfTemplateVars.propertyToKind = propertyToKindMap;
        Nullables fromMethods = Nullables.fromMethods(this.processingEnv, localAndInheritedMethods);
        defineSharedVarsForType(typeElement, localAndInheritedMethods, fromMethods, autoOneOfTemplateVars);
        defineVarsForType(typeElement, autoOneOfTemplateVars, propertyMethodsIn, findKindGetterOrAbort, fromMethods);
        writeSourceFile(generatedClassName, Reformatter.fixup(TypeEncoder.decode(autoOneOfTemplateVars.toText(), this.processingEnv, autoOneOfTemplateVars.pkg, typeElement.asType())), typeElement);
    }

    @Override // com.google.auto.value.processor.AutoValueishProcessor
    public boolean propertiesCanBeVoid() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$propertyToKindMap$0(String str) {
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Element lambda$propertyToKindMap$3(Element element) {
        return element;
    }
}
