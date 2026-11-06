package com.google.auto.value.processor;

import autovalue.shaded.com.google.auto.common.MoreTypes;
import autovalue.shaded.com.google.common.collect.ImmutableMap;
import autovalue.shaded.com.google.common.collect.Iterables;
import autovalue.shaded.com.google.common.collect.UnmodifiableIterator;
import com.google.auto.value.processor.MissingTypes;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.processing.ProcessingEnvironment;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.AnnotationValue;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.type.TypeKind;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.util.SimpleAnnotationValueVisitor8;
import javax.tools.Diagnostic;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
final class AnnotationOutput {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class InitializerSourceFormVisitor extends SourceFormVisitor {
        private final Element errorContext;
        private final String memberName;
        private final ProcessingEnvironment processingEnv;

        public InitializerSourceFormVisitor(ProcessingEnvironment processingEnvironment, String str, Element element) {
            super();
            this.processingEnv = processingEnvironment;
            this.memberName = str;
            this.errorContext = element;
        }

        public Void visitAnnotation(AnnotationMirror annotationMirror, StringBuilder sb) {
            this.processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR, a$$ExternalSyntheticOutline0.m(new StringBuilder("@AutoAnnotation cannot yet supply a default value for annotation-valued member '"), this.memberName, "'"), this.errorContext);
            sb.append("null");
            return null;
        }
    }

    private AnnotationOutput() {
    }

    private static void appendEscaped(StringBuilder sb, char c) {
        if (c == '\t') {
            sb.append("\\t");
            return;
        }
        if (c == '\n') {
            sb.append("\\n");
            return;
        }
        if (c == '\r') {
            sb.append("\\r");
            return;
        }
        if (c == '\"' || c == '\'' || c == '\\') {
            sb.append('\\');
            sb.append(c);
        } else if (c < ' ') {
            sb.append(String.format("\\%03o", Integer.valueOf(c)));
        } else if (c < 127 || Character.isLetter(c)) {
            sb.append(c);
        } else {
            sb.append(String.format("\\u%04x", Integer.valueOf(c)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static StringBuilder appendQuoted(StringBuilder sb, String str) {
        sb.append('\"');
        for (int i = 0; i < str.length(); i++) {
            appendEscaped(sb, str.charAt(i));
        }
        sb.append('\"');
        return sb;
    }

    private static boolean isJavaLangClass(TypeMirror typeMirror) {
        return typeMirror.getKind().equals(TypeKind.DECLARED) && MoreTypes.asTypeElement(typeMirror).getQualifiedName().contentEquals("java.lang.Class");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$validateClassValues$0(AnnotationValue annotationValue) {
        return !(annotationValue.getValue() instanceof TypeMirror);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$validateClassValues$1(ExecutableElement executableElement, AnnotationValue annotationValue) {
        TypeMirror returnType = executableElement.getReturnType();
        if (isJavaLangClass(returnType) && !(annotationValue.getValue() instanceof TypeMirror)) {
            throw new MissingTypes.MissingTypeException(null);
        }
        if (returnType.getKind().equals(TypeKind.ARRAY) && isJavaLangClass(MoreTypes.asArray(returnType).getComponentType()) && (annotationValue.getValue() instanceof List)) {
            if (((List) annotationValue.getValue()).stream().anyMatch(new AnnotationOutput$$ExternalSyntheticLambda0())) {
                throw new MissingTypes.MissingTypeException(null);
            }
        } else if (returnType.getKind().equals(TypeKind.DECLARED) && MoreTypes.asElement(returnType).getKind().equals(ElementKind.ANNOTATION_TYPE) && (annotationValue.getValue() instanceof AnnotationMirror)) {
            validateClassValues((AnnotationMirror) annotationValue.getValue());
        }
    }

    public static String sourceFormForAnnotation(AnnotationMirror annotationMirror) {
        validateClassValues(annotationMirror);
        StringBuilder sb = new StringBuilder();
        new AnnotationSourceFormVisitor().visitAnnotation(annotationMirror, sb);
        return sb.toString();
    }

    public static String sourceFormForInitializer(AnnotationValue annotationValue, ProcessingEnvironment processingEnvironment, String str, Element element) {
        InitializerSourceFormVisitor initializerSourceFormVisitor = new InitializerSourceFormVisitor(processingEnvironment, str, element);
        StringBuilder sb = new StringBuilder();
        initializerSourceFormVisitor.visit(annotationValue, sb);
        return sb.toString();
    }

    private static void validateClassValues(AnnotationMirror annotationMirror) {
        annotationMirror.getElementValues().forEach(new AnnotationOutput$$ExternalSyntheticLambda1());
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class SourceFormVisitor extends SimpleAnnotationValueVisitor8<Void, StringBuilder> {
        private SourceFormVisitor() {
        }

        public Void visitArray(List<? extends AnnotationValue> list, StringBuilder sb) {
            sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
            String str = "";
            for (AnnotationValue annotationValue : list) {
                sb.append(str);
                visit(annotationValue, sb);
                str = ", ";
            }
            sb.append(AbstractJsonLexerKt.END_OBJ);
            return null;
        }

        public Void visitDouble(double d, StringBuilder sb) {
            if (Double.isNaN(d)) {
                sb.append("Double.NaN");
                return null;
            }
            if (d == Double.POSITIVE_INFINITY) {
                sb.append("Double.POSITIVE_INFINITY");
                return null;
            }
            if (d == Double.NEGATIVE_INFINITY) {
                sb.append("Double.NEGATIVE_INFINITY");
                return null;
            }
            sb.append(d);
            return null;
        }

        public Void visitEnumConstant(VariableElement variableElement, StringBuilder sb) {
            sb.append(TypeEncoder.encode(variableElement.asType()));
            sb.append('.');
            sb.append((CharSequence) variableElement.getSimpleName());
            return null;
        }

        public Void visitFloat(float f, StringBuilder sb) {
            if (Float.isNaN(f)) {
                sb.append("Float.NaN");
                return null;
            }
            if (f == Float.POSITIVE_INFINITY) {
                sb.append("Float.POSITIVE_INFINITY");
                return null;
            }
            if (f == Float.NEGATIVE_INFINITY) {
                sb.append("Float.NEGATIVE_INFINITY");
                return null;
            }
            sb.append(f);
            sb.append('F');
            return null;
        }

        public Void visitLong(long j, StringBuilder sb) {
            sb.append(j);
            sb.append(Matrix.MATRIX_TYPE_RANDOM_LT);
            return null;
        }

        public Void visitType(TypeMirror typeMirror, StringBuilder sb) {
            sb.append(TypeEncoder.encode(typeMirror));
            sb.append(".class");
            return null;
        }

        public Void defaultAction(Object obj, StringBuilder sb) {
            sb.append(obj);
            return null;
        }

        public Void visitChar(char c, StringBuilder sb) {
            AnnotationOutput.appendQuoted(sb, c);
            return null;
        }

        public Void visitString(String str, StringBuilder sb) {
            AnnotationOutput.appendQuoted(sb, str);
            return null;
        }

        public /* bridge */ /* synthetic */ Object visitArray(List list, Object obj) {
            return visitArray((List<? extends AnnotationValue>) list, (StringBuilder) obj);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class AnnotationSourceFormVisitor extends SourceFormVisitor {
        private AnnotationSourceFormVisitor() {
            super();
        }

        private static Optional<AnnotationValue> shortForm(Map<ExecutableElement, AnnotationValue> map) {
            return (map.size() == 1 && ((ExecutableElement) Iterables.getOnlyElement(map.keySet())).getSimpleName().contentEquals("value")) ? Optional.of((AnnotationValue) Iterables.getOnlyElement(map.values())) : Optional.empty();
        }

        public Void visitAnnotation(AnnotationMirror annotationMirror, StringBuilder sb) {
            sb.append('@');
            sb.append(TypeEncoder.encode(annotationMirror.getAnnotationType()));
            ImmutableMap copyOf = ImmutableMap.copyOf(annotationMirror.getElementValues());
            if (copyOf.isEmpty()) {
                return null;
            }
            sb.append('(');
            Optional<AnnotationValue> shortForm = shortForm(copyOf);
            if (shortForm.isPresent()) {
                visit(shortForm.get(), sb);
            } else {
                UnmodifiableIterator it2 = copyOf.entrySet().iterator();
                String str = "";
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    sb.append(str);
                    sb.append((CharSequence) ((ExecutableElement) entry.getKey()).getSimpleName());
                    sb.append(" = ");
                    visit((AnnotationValue) entry.getValue(), sb);
                    str = ", ";
                }
            }
            sb.append(')');
            return null;
        }

        @Override // com.google.auto.value.processor.AnnotationOutput.SourceFormVisitor
        public Void visitArray(List<? extends AnnotationValue> list, StringBuilder sb) {
            if (list.size() != 1) {
                return super.visitArray(list, sb);
            }
            visit(list.get(0), sb);
            return null;
        }

        @Override // com.google.auto.value.processor.AnnotationOutput.SourceFormVisitor
        public /* bridge */ /* synthetic */ Object visitArray(List list, Object obj) {
            return visitArray((List<? extends AnnotationValue>) list, (StringBuilder) obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static StringBuilder appendQuoted(StringBuilder sb, char c) {
        sb.append('\'');
        appendEscaped(sb, c);
        sb.append('\'');
        return sb;
    }
}
