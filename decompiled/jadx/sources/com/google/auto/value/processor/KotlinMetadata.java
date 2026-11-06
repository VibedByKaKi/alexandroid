package com.google.auto.value.processor;

import autovalue.shaded.com.google.auto.common.AnnotationMirrors;
import autovalue.shaded.com.google.auto.common.MoreStreams;
import autovalue.shaded.com.google.auto.common.MoreTypes;
import autovalue.shaded.com.google.common.base.Throwables;
import autovalue.shaded.com.google.common.collect.ImmutableList;
import autovalue.shaded.com.google.common.collect.ImmutableMap;
import autovalue.shaded.com.google.common.collect.ImmutableSet;
import autovalue.shaded.com.google.common.collect.MoreCollectors$$ExternalSyntheticLambda0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.AnnotationValue;
import javax.lang.model.element.Element;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.util.ElementFilter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
final class KotlinMetadata {
    private static final Method ATTRIBUTES_GET_DECLARES_DEFAULT_VALUE;
    private static final Method KM_CLASS_GET_CONSTRUCTORS;
    private static final Method KM_CONSTRUCTOR_GET_VALUE_PARAMETERS;
    private static final Method KM_VALUE_PARAMETER_GET_NAME;
    private static final Method KOTLIN_CLASS_METADATA_CLASS_GET_KM_CLASS;
    private static final Method KOTLIN_CLASS_METADATA_READ_LENIENT;
    private static final boolean KOTLIN_METADATA_AVAILABLE;
    private static final Constructor<?> NEW_KOTLIN_CLASS_HEADER;
    private final ErrorReporter errorReporter;
    private boolean warnedAboutMissingMetadataApi;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Attributes {
        private Attributes() {
        }

        public static boolean getDeclaresDefaultValue(KmValueParameter kmValueParameter) throws ReflectiveOperationException {
            return ((Boolean) KotlinMetadata.ATTRIBUTES_GET_DECLARES_DEFAULT_VALUE.invoke(null, kmValueParameter.wrapped)).booleanValue();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class KmClass {
        final Object wrapped;

        public KmClass(Object obj) {
            this.wrapped = obj;
        }

        public List<KmConstructor> getConstructors() throws ReflectiveOperationException {
            return (List) ((List) KotlinMetadata.KM_CLASS_GET_CONSTRUCTORS.invoke(this.wrapped, null)).stream().map(new KotlinMetadata$$ExternalSyntheticLambda3(9)).collect(MoreStreams.toImmutableList());
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class KmConstructor {
        final Object wrapped;

        public KmConstructor(Object obj) {
            this.wrapped = obj;
        }

        public List<KmValueParameter> getValueParameters() throws ReflectiveOperationException {
            return (List) ((List) KotlinMetadata.KM_CONSTRUCTOR_GET_VALUE_PARAMETERS.invoke(this.wrapped, null)).stream().map(new KotlinMetadata$$ExternalSyntheticLambda3(10)).collect(MoreStreams.toImmutableList());
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class KmValueParameter {
        final Object wrapped;

        public KmValueParameter(Object obj) {
            this.wrapped = obj;
        }

        public String getName() throws ReflectiveOperationException {
            return (String) KotlinMetadata.KM_VALUE_PARAMETER_GET_NAME.invoke(this.wrapped, null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class KotlinClassHeader {
        final Object wrapped;

        public KotlinClassHeader(Integer num, int[] iArr, String[] strArr, String[] strArr2, String str, String str2, Integer num2) throws ReflectiveOperationException {
            this.wrapped = KotlinMetadata.NEW_KOTLIN_CLASS_HEADER.newInstance(num, iArr, strArr, strArr2, str, str2, num2);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class KotlinClassMetadata {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class Class {
            final Object wrapped;

            public Class(Object obj) {
                this.wrapped = obj;
            }

            public KmClass getKmClass() throws ReflectiveOperationException {
                return new KmClass(KotlinMetadata.KOTLIN_CLASS_METADATA_CLASS_GET_KM_CLASS.invoke(this.wrapped, null));
            }
        }

        private KotlinClassMetadata() {
        }

        public static Class readLenient(KotlinClassHeader kotlinClassHeader) throws ReflectiveOperationException {
            return new Class(KotlinMetadata.KOTLIN_CLASS_METADATA_READ_LENIENT.invoke(null, kotlinClassHeader.wrapped));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r1v6 */
    static {
        String[] strArr = {"kotlin.metadata.", "kotlinx.metadata."};
        Method method = 0;
        boolean z = false;
        Constructor<?> constructor = null;
        Method method2 = null;
        Method method3 = null;
        Method method4 = null;
        Method method5 = null;
        Method method6 = null;
        int i = 0;
        while (true) {
            if (i >= 2) {
                break;
            }
            String str = strArr[i];
            try {
                Class<?> cls = Class.forName(str + "jvm.KotlinClassHeader");
                constructor = cls.getConstructor(Integer.class, int[].class, String[].class, String[].class, String.class, String.class, Integer.class);
                method2 = Class.forName(str + "jvm.KotlinClassMetadata").getMethod("readLenient", Class.forName("kotlin.Metadata", false, cls.getClassLoader()));
                Class<?> cls2 = Class.forName(str + "jvm.KotlinClassMetadata$Class");
                Class<?> cls3 = Class.forName(str + "KmClass");
                method3 = cls2.getMethod("getKmClass", method);
                method4 = cls3.getMethod("getConstructors", method);
                method5 = Class.forName(str + "KmConstructor").getMethod("getValueParameters", method);
                Class<?> cls4 = Class.forName(str + "KmValueParameter");
                method6 = cls4.getMethod("getName", method);
                method = Class.forName(str + "Attributes").getMethod("getDeclaresDefaultValue", cls4);
                z = true;
                break;
            } catch (ReflectiveOperationException unused) {
                i++;
                method = method;
            }
        }
        NEW_KOTLIN_CLASS_HEADER = constructor;
        KOTLIN_CLASS_METADATA_READ_LENIENT = method2;
        KOTLIN_CLASS_METADATA_CLASS_GET_KM_CLASS = method3;
        KM_CLASS_GET_CONSTRUCTORS = method4;
        KM_CONSTRUCTOR_GET_VALUE_PARAMETERS = method5;
        KM_VALUE_PARAMETER_GET_NAME = method6;
        ATTRIBUTES_GET_DECLARES_DEFAULT_VALUE = method;
        KOTLIN_METADATA_AVAILABLE = z;
    }

    public KotlinMetadata(ErrorReporter errorReporter) {
        this.errorReporter = errorReporter;
    }

    private static int[] intArrayValue(AnnotationValue annotationValue) {
        return ((List) annotationValue.getValue()).stream().mapToInt(new KotlinMetadata$$ExternalSyntheticLambda0()).toArray();
    }

    private static ImmutableList<Executable> kotlinConstructorsFromReflection(AnnotationMirror annotationMirror, TypeElement typeElement) throws ReflectiveOperationException {
        ImmutableMap immutableMap = (ImmutableMap) AnnotationMirrors.getAnnotationValuesWithDefaults(annotationMirror).entrySet().stream().collect(MoreStreams.toImmutableMap(new KotlinMetadata$$ExternalSyntheticLambda3(0), new KotlinMetadata$$ExternalSyntheticLambda3(8)));
        ImmutableMap copyOf = ImmutableMap.copyOf((Map) ElementFilter.constructorsIn(typeElement.getEnclosedElements()).stream().collect(Collectors.toMap(new KotlinMetadata$$ExternalSyntheticLambda5(), new KotlinMetadata$$ExternalSyntheticLambda6(), new KotlinMetadata$$ExternalSyntheticLambda7(), new MoreCollectors$$ExternalSyntheticLambda0(10))));
        KmClass kmClass = KotlinClassMetadata.readLenient(new KotlinClassHeader((Integer) ((AnnotationValue) immutableMap.get("k")).getValue(), intArrayValue((AnnotationValue) immutableMap.get("mv")), stringArrayValue((AnnotationValue) immutableMap.get("d1")), stringArrayValue((AnnotationValue) immutableMap.get("d2")), (String) ((AnnotationValue) immutableMap.get("xs")).getValue(), (String) ((AnnotationValue) immutableMap.get("pn")).getValue(), (Integer) ((AnnotationValue) immutableMap.get("xi")).getValue())).getKmClass();
        ImmutableList.Builder builder = ImmutableList.builder();
        for (KmConstructor kmConstructor : kmClass.getConstructors()) {
            ImmutableSet.Builder builder2 = ImmutableSet.builder();
            ImmutableSet.Builder builder3 = ImmutableSet.builder();
            for (KmValueParameter kmValueParameter : kmConstructor.getValueParameters()) {
                String name = kmValueParameter.getName();
                builder2.add((ImmutableSet.Builder) name);
                if (Attributes.getDeclaresDefaultValue(kmValueParameter)) {
                    builder3.add((ImmutableSet.Builder) name);
                }
            }
            ImmutableSet build = builder3.build();
            ExecutableElement executableElement = (ExecutableElement) copyOf.get(builder2.build());
            if (executableElement != null) {
                builder.add((ImmutableList.Builder) Executable.of(executableElement, build));
            }
        }
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$intArrayValue$8(AnnotationValue annotationValue) {
        return ((Integer) annotationValue.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$kotlinConstructorsFromReflection$0(Map.Entry entry) {
        return ((ExecutableElement) entry.getKey()).getSimpleName().toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ AnnotationValue lambda$kotlinConstructorsFromReflection$1(Map.Entry entry) {
        return (AnnotationValue) entry.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$kotlinMetadataAnnotation$6(AnnotationMirror annotationMirror) {
        return MoreTypes.asTypeElement(annotationMirror.getAnnotationType()).getQualifiedName().contentEquals(ClassNames.KOTLIN_METADATA_NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$parameterNames$5(VariableElement variableElement) {
        return variableElement.getSimpleName().toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String[] lambda$stringArrayValue$9(int i) {
        return new String[i];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ImmutableSet<String> parameterNames(ExecutableElement executableElement) {
        return (ImmutableSet) executableElement.getParameters().stream().map(new KotlinMetadata$$ExternalSyntheticLambda9()).collect(MoreStreams.toImmutableSet());
    }

    private static String[] stringArrayValue(AnnotationValue annotationValue) {
        return (String[]) ((List) annotationValue.getValue()).stream().map(new AutoValueishProcessor$ContainsMutableVisitor$$ExternalSyntheticLambda0()).toArray(new KotlinMetadata$$ExternalSyntheticLambda8());
    }

    public ImmutableList<Executable> kotlinConstructorsIn(AnnotationMirror annotationMirror, TypeElement typeElement) {
        if (!KOTLIN_METADATA_AVAILABLE) {
            if (!this.warnedAboutMissingMetadataApi) {
                this.warnedAboutMissingMetadataApi = true;
                this.errorReporter.reportWarning(typeElement, "[AutoBuilderNoMetadataApi] The Kotlin metadata API (kotlinx.metadata or kotlin.metadata) is not available. You may need to add a dependency on org.jetbrains.kotlin:kotlin-metadata-jvm.", new Object[0]);
            }
            return ImmutableList.of();
        }
        try {
            return kotlinConstructorsFromReflection(annotationMirror, typeElement);
        } catch (InvocationTargetException e) {
            Throwables.throwIfUnchecked(e.getCause());
            throw new LinkageError(e.getMessage(), e);
        } catch (ReflectiveOperationException e2) {
            throw new LinkageError(e2.getMessage(), e2);
        }
    }

    public Optional<AnnotationMirror> kotlinMetadataAnnotation(Element element) {
        return element.getAnnotationMirrors().stream().filter(new KotlinMetadata$$ExternalSyntheticLambda1()).map(new KotlinMetadata$$ExternalSyntheticLambda2()).findFirst();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ExecutableElement lambda$kotlinConstructorsFromReflection$3(ExecutableElement executableElement) {
        return executableElement;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ AnnotationMirror lambda$kotlinMetadataAnnotation$7(AnnotationMirror annotationMirror) {
        return annotationMirror;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ExecutableElement lambda$kotlinConstructorsFromReflection$4(ExecutableElement executableElement, ExecutableElement executableElement2) {
        return executableElement;
    }
}
