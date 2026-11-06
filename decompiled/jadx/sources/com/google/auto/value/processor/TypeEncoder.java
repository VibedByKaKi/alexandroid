package com.google.auto.value.processor;

import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import autovalue.shaded.com.google.auto.common.MoreElements;
import autovalue.shaded.com.google.auto.common.MoreTypes;
import autovalue.shaded.com.google.common.base.Preconditions;
import autovalue.shaded.com.google.common.collect.ImmutableList;
import autovalue.shaded.com.google.common.collect.ImmutableSet;
import autovalue.shaded.com.google.common.collect.UnmodifiableIterator;
import com.google.auto.value.processor.MissingTypes;
import com.google.auto.value.processor.TypeEncoder;
import java.util.Iterator;
import java.util.List;
import java.util.OptionalInt;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.annotation.processing.ProcessingEnvironment;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.TypeParameterElement;
import javax.lang.model.type.ArrayType;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.ErrorType;
import javax.lang.model.type.PrimitiveType;
import javax.lang.model.type.TypeKind;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.type.TypeVariable;
import javax.lang.model.type.WildcardType;
import javax.lang.model.util.Elements;
import javax.lang.model.util.SimpleTypeVisitor8;
import javax.lang.model.util.Types;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
final class TypeEncoder {
    private static final EncodingTypeVisitor ENCODING_TYPE_VISITOR;
    private static final RawEncodingTypeVisitor RAW_ENCODING_TYPE_VISITOR;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class AnnotatedEncodingTypeVisitor extends EncodingTypeVisitor {
        private final Set<TypeMirror> excludedAnnotationTypes;
        private final Function<TypeMirror, List<? extends AnnotationMirror>> getTypeAnnotations;

        public AnnotatedEncodingTypeVisitor(Set<TypeMirror> set, Function<TypeMirror, List<? extends AnnotationMirror>> function) {
            super();
            this.excludedAnnotationTypes = set;
            this.getTypeAnnotations = function;
        }

        private void appendAnnotationsWithExclusions(List<? extends AnnotationMirror> list, StringBuilder sb) {
            if (list.isEmpty() || this.excludedAnnotationTypes.isEmpty()) {
                TypeEncoder.appendAnnotations(list, sb);
            } else {
                TypeEncoder.appendAnnotations((List) list.stream().filter(new Predicate() { // from class: com.google.auto.value.processor.TypeEncoder$AnnotatedEncodingTypeVisitor$$ExternalSyntheticLambda0
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        boolean lambda$appendAnnotationsWithExclusions$0;
                        lambda$appendAnnotationsWithExclusions$0 = TypeEncoder.AnnotatedEncodingTypeVisitor.this.lambda$appendAnnotationsWithExclusions$0((AnnotationMirror) obj);
                        return lambda$appendAnnotationsWithExclusions$0;
                    }
                }).collect(Collectors.toList()), sb);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ boolean lambda$appendAnnotationsWithExclusions$0(AnnotationMirror annotationMirror) {
            return !this.excludedAnnotationTypes.contains(annotationMirror.getAnnotationType());
        }

        @Override // com.google.auto.value.processor.TypeEncoder.EncodingTypeVisitor
        public StringBuilder visitArray(ArrayType arrayType, StringBuilder sb) {
            visit2(arrayType.getComponentType(), sb);
            List<? extends AnnotationMirror> apply = this.getTypeAnnotations.apply(arrayType);
            if (!apply.isEmpty()) {
                sb.append(" ");
                appendAnnotationsWithExclusions(apply, sb);
            }
            sb.append(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
            return sb;
        }

        @Override // com.google.auto.value.processor.TypeEncoder.EncodingTypeVisitor
        public StringBuilder visitDeclared(DeclaredType declaredType, StringBuilder sb) {
            List<? extends AnnotationMirror> apply = this.getTypeAnnotations.apply(declaredType);
            if (apply.isEmpty()) {
                super.visitDeclared(declaredType, sb);
                return sb;
            }
            TypeMirror enclosingType = EclipseHack.getEnclosingType(declaredType);
            if (enclosingType.getKind().equals(TypeKind.DECLARED)) {
                visit2(enclosingType, sb);
                sb.append(".");
                appendAnnotationsWithExclusions(apply, sb);
                sb.append((CharSequence) declaredType.asElement().getSimpleName());
            } else {
                String className = TypeEncoder.className(declaredType);
                AppLaunchChecker$$ExternalSyntheticOutline0.m(sb, "`«", className, "`");
                appendAnnotationsWithExclusions(apply, sb);
                AppLaunchChecker$$ExternalSyntheticOutline0.m(sb, "`»", className, "`");
            }
            appendTypeArguments(declaredType, sb);
            return sb;
        }

        public StringBuilder visitPrimitive(PrimitiveType primitiveType, StringBuilder sb) {
            appendAnnotationsWithExclusions(this.getTypeAnnotations.apply(primitiveType), sb);
            sb.append(primitiveType.getKind().toString().toLowerCase());
            return sb;
        }

        public StringBuilder visitTypeVariable(TypeVariable typeVariable, StringBuilder sb) {
            appendAnnotationsWithExclusions(this.getTypeAnnotations.apply(typeVariable), sb);
            sb.append((CharSequence) typeVariable.asElement().getSimpleName());
            return sb;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class TypeRewriter {
        private final TypeMirror baseType;
        private final Elements elementUtils;
        private final String packageName;
        private final JavaScanner scanner;
        private final String text;
        private final int textLength;
        private final Types typeUtils;

        public TypeRewriter(String str, Elements elements, Types types, String str2, TypeMirror typeMirror) {
            this.text = str;
            this.textLength = str.length();
            this.scanner = new JavaScanner(str);
            this.elementUtils = elements;
            this.typeUtils = types;
            this.packageName = str2;
            this.baseType = typeMirror;
        }

        private DeclaredType classForName(String str) {
            TypeElement typeElement = this.elementUtils.getTypeElement(str);
            Preconditions.checkState(typeElement != null, "Could not find referenced class %s", str);
            return MoreTypes.asDeclared(typeElement.asType());
        }

        private String classNameAt(int i) {
            Preconditions.checkArgument(this.text.charAt(i) == '`');
            int i2 = this.scanner.tokenEnd(i) - 1;
            int i3 = i + 1;
            char charAt = this.text.charAt(i3);
            if (charAt == 171 || charAt == 187) {
                i3 = i + 2;
            }
            return this.text.substring(i3, i2);
        }

        private void decode(StringBuilder sb, TypeSimplifier typeSimplifier, int i) {
            String simplifiedClassName = typeSimplifier.simplifiedClassName(classForName(classNameAt(i)));
            char charAt = this.text.charAt(i + 1);
            if (charAt == 171) {
                sb.append(simplifiedClassName.substring(0, simplifiedClassName.lastIndexOf(46) + 1));
            } else if (charAt != 187) {
                sb.append(simplifiedClassName);
            } else {
                sb.append(simplifiedClassName.substring(simplifiedClassName.lastIndexOf(46) + 1));
            }
        }

        private OptionalInt findImportMarker() {
            int i = 0;
            while (i < this.textLength) {
                if (this.text.startsWith("`import`", i)) {
                    return OptionalInt.of(i);
                }
                i = this.scanner.tokenEnd(i);
            }
            return OptionalInt.empty();
        }

        private Set<TypeMirror> findReferencedClasses() {
            TypeMirrorSet typeMirrorSet = new TypeMirrorSet();
            int i = 0;
            while (i < this.textLength) {
                if (this.text.charAt(i) == '`' && !this.text.startsWith("`import`", i)) {
                    typeMirrorSet.add((TypeMirrorSet) classForName(classNameAt(i)));
                }
                i = this.scanner.tokenEnd(i);
            }
            return typeMirrorSet;
        }

        public String rewrite() {
            TypeSimplifier typeSimplifier = new TypeSimplifier(this.elementUtils, this.typeUtils, this.packageName, findReferencedClasses(), this.baseType);
            StringBuilder sb = new StringBuilder();
            OptionalInt findImportMarker = findImportMarker();
            int i = 0;
            if (findImportMarker.isPresent()) {
                sb.append(this.text, 0, findImportMarker.getAsInt());
                UnmodifiableIterator<String> it2 = typeSimplifier.typesToImport().iterator();
                while (it2.hasNext()) {
                    AppLaunchChecker$$ExternalSyntheticOutline0.m(sb, "import ", it2.next(), ";\n");
                }
                i = this.scanner.tokenEnd(findImportMarker.getAsInt());
            }
            int i2 = i;
            while (true) {
                int i3 = this.textLength;
                String str = this.text;
                if (i >= i3) {
                    sb.append((CharSequence) str, i2, i3);
                    return sb.toString();
                }
                if (str.charAt(i) == '`') {
                    sb.append(this.text, i2, i);
                    decode(sb, typeSimplifier, i);
                    i2 = this.scanner.tokenEnd(i);
                }
                i = this.scanner.tokenEnd(i);
            }
        }
    }

    static {
        ENCODING_TYPE_VISITOR = new EncodingTypeVisitor();
        RAW_ENCODING_TYPE_VISITOR = new RawEncodingTypeVisitor();
    }

    private TypeEncoder() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void appendAnnotations(List<? extends AnnotationMirror> list, StringBuilder sb) {
        Iterator<? extends AnnotationMirror> it2 = list.iterator();
        while (it2.hasNext()) {
            sb.append(AnnotationOutput.sourceFormForAnnotation(it2.next()));
            sb.append(" ");
        }
    }

    private static void appendTypeParameterWithBounds(TypeParameterElement typeParameterElement, StringBuilder sb) {
        appendAnnotations(typeParameterElement.getAnnotationMirrors(), sb);
        sb.append((CharSequence) typeParameterElement.getSimpleName());
        String str = " extends ";
        for (TypeMirror typeMirror : typeParameterElement.getBounds()) {
            if (!isUnannotatedJavaLangObject(typeMirror)) {
                sb.append(str);
                sb.append(encodeWithAnnotations(typeMirror));
                str = " & ";
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String className(DeclaredType declaredType) {
        return MoreElements.asType(declaredType.asElement()).getQualifiedName().toString();
    }

    public static String decode(String str, Elements elements, Types types, String str2, TypeMirror typeMirror) {
        return new TypeRewriter(str, elements, types, str2, typeMirror).rewrite();
    }

    public static String encode(TypeMirror typeMirror) {
        return ((StringBuilder) typeMirror.accept(ENCODING_TYPE_VISITOR, new StringBuilder())).toString();
    }

    public static String encodeRaw(TypeMirror typeMirror) {
        return ((StringBuilder) typeMirror.accept(RAW_ENCODING_TYPE_VISITOR, new StringBuilder())).toString();
    }

    public static String encodeWithAnnotations(final AnnotatedTypeMirror annotatedTypeMirror, final ImmutableList<AnnotationMirror> immutableList, Set<TypeMirror> set) {
        return new AnnotatedEncodingTypeVisitor(set, new Function() { // from class: com.google.auto.value.processor.TypeEncoder$$ExternalSyntheticLambda0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                List lambda$encodeWithAnnotations$1;
                lambda$encodeWithAnnotations$1 = TypeEncoder.lambda$encodeWithAnnotations$1(AnnotatedTypeMirror.this, immutableList, (TypeMirror) obj);
                return lambda$encodeWithAnnotations$1;
            }
        }).visit2(annotatedTypeMirror.getType(), new StringBuilder()).toString();
    }

    private static boolean isUnannotatedJavaLangObject(TypeMirror typeMirror) {
        return typeMirror.getKind().equals(TypeKind.DECLARED) && typeMirror.getAnnotationMirrors().isEmpty() && MoreTypes.asTypeElement(typeMirror).getQualifiedName().contentEquals("java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$encodeWithAnnotations$0(TypeMirror typeMirror, ImmutableList immutableList, TypeMirror typeMirror2) {
        return typeMirror2 == typeMirror ? ImmutableList.builder().addAll((Iterable) typeMirror2.getAnnotationMirrors()).addAll((Iterable) immutableList).build() : typeMirror2.getAnnotationMirrors();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$encodeWithAnnotations$1(AnnotatedTypeMirror annotatedTypeMirror, ImmutableList immutableList, TypeMirror typeMirror) {
        return typeMirror == annotatedTypeMirror.getType() ? ImmutableList.builder().addAll((Iterable) annotatedTypeMirror.annotations()).addAll((Iterable) immutableList).build() : typeMirror.getAnnotationMirrors();
    }

    public static String typeParametersString(List<? extends TypeParameterElement> list) {
        String str = "";
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder("<");
        for (TypeParameterElement typeParameterElement : list) {
            sb.append(str);
            appendTypeParameterWithBounds(typeParameterElement, sb);
            str = ", ";
        }
        sb.append(">");
        return sb.toString();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class EncodingTypeVisitor extends SimpleTypeVisitor8<StringBuilder, StringBuilder> {
        private EncodingTypeVisitor() {
        }

        public void appendTypeArguments(DeclaredType declaredType, StringBuilder sb) {
            List<TypeMirror> typeArguments = declaredType.getTypeArguments();
            if (typeArguments.isEmpty()) {
                return;
            }
            sb.append("<");
            String str = "";
            for (TypeMirror typeMirror : typeArguments) {
                sb.append(str);
                visit2(typeMirror, sb);
                str = ", ";
            }
            sb.append(">");
        }

        public void appendTypeName(DeclaredType declaredType, StringBuilder sb) {
            TypeMirror enclosingType = EclipseHack.getEnclosingType(declaredType);
            if (enclosingType.getKind().equals(TypeKind.DECLARED)) {
                visit2(enclosingType, sb);
                sb.append(".");
                sb.append((CharSequence) declaredType.asElement().getSimpleName());
            } else {
                sb.append('`');
                sb.append(TypeEncoder.className(declaredType));
                sb.append('`');
            }
        }

        public StringBuilder visit2(TypeMirror typeMirror, StringBuilder sb) {
            return typeMirror.getKind().equals(TypeKind.DECLARED) ? visitDeclared((DeclaredType) typeMirror, sb) : (StringBuilder) visit(typeMirror, sb);
        }

        @Override // 
        public StringBuilder visitArray(ArrayType arrayType, StringBuilder sb) {
            StringBuilder visit2 = visit2(arrayType.getComponentType(), sb);
            visit2.append(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
            return visit2;
        }

        public StringBuilder visitWildcard(WildcardType wildcardType, StringBuilder sb) {
            sb.append("?");
            TypeMirror extendsBound = wildcardType.getExtendsBound();
            TypeMirror superBound = wildcardType.getSuperBound();
            if (superBound != null) {
                sb.append(" super ");
                visit2(superBound, sb);
                return sb;
            }
            if (extendsBound != null) {
                sb.append(" extends ");
                visit2(extendsBound, sb);
            }
            return sb;
        }

        public StringBuilder defaultAction(TypeMirror typeMirror, StringBuilder sb) {
            sb.append(typeMirror);
            return sb;
        }

        @Override // 
        public StringBuilder visitDeclared(DeclaredType declaredType, StringBuilder sb) {
            appendTypeName(declaredType, sb);
            appendTypeArguments(declaredType, sb);
            return sb;
        }

        public StringBuilder visitError(ErrorType errorType, StringBuilder sb) {
            throw new MissingTypes.MissingTypeException(errorType);
        }
    }

    public static String decode(String str, ProcessingEnvironment processingEnvironment, String str2, TypeMirror typeMirror) {
        return decode(str, processingEnvironment.getElementUtils(), processingEnvironment.getTypeUtils(), str2, typeMirror);
    }

    public static String encodeWithAnnotations(AnnotatedTypeMirror annotatedTypeMirror) {
        return encodeWithAnnotations(annotatedTypeMirror, (ImmutableList<AnnotationMirror>) ImmutableList.of(), ImmutableSet.of());
    }

    public static String encodeWithAnnotations(TypeMirror typeMirror, ImmutableList<AnnotationMirror> immutableList) {
        return encodeWithAnnotations(typeMirror, immutableList, ImmutableSet.of());
    }

    public static String encodeWithAnnotations(AnnotatedTypeMirror annotatedTypeMirror, ImmutableList<AnnotationMirror> immutableList) {
        return encodeWithAnnotations(annotatedTypeMirror, immutableList, ImmutableSet.of());
    }

    private static String encodeWithAnnotations(final TypeMirror typeMirror, final ImmutableList<AnnotationMirror> immutableList, Set<TypeMirror> set) {
        return new AnnotatedEncodingTypeVisitor(set, new Function() { // from class: com.google.auto.value.processor.TypeEncoder$$ExternalSyntheticLambda1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                List lambda$encodeWithAnnotations$0;
                lambda$encodeWithAnnotations$0 = TypeEncoder.lambda$encodeWithAnnotations$0(typeMirror, immutableList, (TypeMirror) obj);
                return lambda$encodeWithAnnotations$0;
            }
        }).visit2(typeMirror, new StringBuilder()).toString();
    }

    public static String encodeWithAnnotations(TypeMirror typeMirror) {
        return encodeWithAnnotations(typeMirror, (ImmutableList<AnnotationMirror>) ImmutableList.of(), ImmutableSet.of());
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class RawEncodingTypeVisitor extends EncodingTypeVisitor {
        private RawEncodingTypeVisitor() {
            super();
        }

        @Override // com.google.auto.value.processor.TypeEncoder.EncodingTypeVisitor
        public void appendTypeArguments(DeclaredType declaredType, StringBuilder sb) {
        }
    }
}
