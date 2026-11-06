package autovalue.shaded.com.google.auto.common;

import autovalue.shaded.com.google.auto.common.SuperficialValidation;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.StreamSupport;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.AnnotationValue;
import javax.lang.model.element.AnnotationValueVisitor;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementVisitor;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.PackageElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.TypeParameterElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.type.ArrayType;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.ErrorType;
import javax.lang.model.type.ExecutableType;
import javax.lang.model.type.TypeKind;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.type.TypeVisitor;
import javax.lang.model.type.WildcardType;
import javax.lang.model.util.AbstractElementVisitor8;
import javax.lang.model.util.SimpleAnnotationValueVisitor8;
import javax.lang.model.util.SimpleTypeVisitor8;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class SuperficialValidation {
    private static final ElementVisitor<Boolean, Void> ELEMENT_VALIDATING_VISITOR = new AbstractElementVisitor8<Boolean, Void>() { // from class: autovalue.shaded.com.google.auto.common.SuperficialValidation.1
        public Boolean visitExecutable(ExecutableElement executableElement, Void r2) {
            AnnotationValue defaultValue = executableElement.getDefaultValue();
            return Boolean.valueOf(SuperficialValidation.isValidBaseElement(executableElement) && (defaultValue == null || SuperficialValidation.validateAnnotationValue(defaultValue, executableElement.getReturnType())) && SuperficialValidation.validateType(executableElement.getReturnType()) && SuperficialValidation.validateTypes(executableElement.getThrownTypes()) && SuperficialValidation.validateElements(executableElement.getTypeParameters()) && SuperficialValidation.validateElements(executableElement.getParameters()));
        }

        public Boolean visitPackage(PackageElement packageElement, Void r2) {
            return Boolean.valueOf(SuperficialValidation.validateAnnotations(packageElement.getAnnotationMirrors()));
        }

        public Boolean visitType(TypeElement typeElement, Void r2) {
            return Boolean.valueOf(SuperficialValidation.isValidBaseElement(typeElement) && SuperficialValidation.validateElements(typeElement.getTypeParameters()) && SuperficialValidation.validateTypes(typeElement.getInterfaces()) && SuperficialValidation.validateType(typeElement.getSuperclass()));
        }

        public Boolean visitTypeParameter(TypeParameterElement typeParameterElement, Void r2) {
            return Boolean.valueOf(SuperficialValidation.isValidBaseElement(typeParameterElement) && SuperficialValidation.validateTypes(typeParameterElement.getBounds()));
        }

        public Boolean visitVariable(VariableElement variableElement, Void r2) {
            return Boolean.valueOf(SuperficialValidation.isValidBaseElement(variableElement));
        }

        public Boolean visitUnknown(Element element, Void r2) {
            return Boolean.TRUE;
        }
    };
    private static final TypeVisitor<Boolean, Void> TYPE_VALIDATING_VISITOR = new SimpleTypeVisitor8<Boolean, Void>() { // from class: autovalue.shaded.com.google.auto.common.SuperficialValidation.2
        public Boolean visitArray(ArrayType arrayType, Void r2) {
            return Boolean.valueOf(SuperficialValidation.validateType(arrayType.getComponentType()));
        }

        public Boolean visitDeclared(DeclaredType declaredType, Void r2) {
            return Boolean.valueOf(SuperficialValidation.validateTypes(declaredType.getTypeArguments()));
        }

        public Boolean visitExecutable(ExecutableType executableType, Void r2) {
            return Boolean.valueOf(SuperficialValidation.validateTypes(executableType.getParameterTypes()) && SuperficialValidation.validateType(executableType.getReturnType()) && SuperficialValidation.validateTypes(executableType.getThrownTypes()) && SuperficialValidation.validateTypes(executableType.getTypeVariables()));
        }

        public Boolean visitWildcard(WildcardType wildcardType, Void r2) {
            TypeMirror extendsBound = wildcardType.getExtendsBound();
            TypeMirror superBound = wildcardType.getSuperBound();
            return Boolean.valueOf((extendsBound == null || SuperficialValidation.validateType(extendsBound)) && (superBound == null || SuperficialValidation.validateType(superBound)));
        }

        public Boolean defaultAction(TypeMirror typeMirror, Void r2) {
            return Boolean.TRUE;
        }

        public Boolean visitError(ErrorType errorType, Void r2) {
            return Boolean.FALSE;
        }

        public Boolean visitUnknown(TypeMirror typeMirror, Void r2) {
            return defaultAction(typeMirror, r2);
        }
    };
    private static final AnnotationValueVisitor<Boolean, TypeMirror> VALUE_VALIDATING_VISITOR = new AnonymousClass3();

    private SuperficialValidation() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isValidBaseElement(Element element) {
        return validateType(element.asType()) && validateAnnotations(element.getAnnotationMirrors()) && validateElements(element.getEnclosedElements());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$validateAnnotationValues$0(Map.Entry entry) {
        return validateAnnotationValue((AnnotationValue) entry.getValue(), ((ExecutableElement) entry.getKey()).getReturnType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean validateAnnotation(AnnotationMirror annotationMirror) {
        return validateType(annotationMirror.getAnnotationType()) && validateAnnotationValues(annotationMirror.getElementValues());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean validateAnnotationValue(AnnotationValue annotationValue, TypeMirror typeMirror) {
        return ((Boolean) annotationValue.accept(VALUE_VALIDATING_VISITOR, typeMirror)).booleanValue();
    }

    private static boolean validateAnnotationValues(Map<? extends ExecutableElement, ? extends AnnotationValue> map) {
        return map.entrySet().stream().allMatch(new SuperficialValidation$$ExternalSyntheticLambda1());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean validateAnnotations(Iterable<? extends AnnotationMirror> iterable) {
        Iterator<? extends AnnotationMirror> it2 = iterable.iterator();
        while (it2.hasNext()) {
            if (!validateAnnotation(it2.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean validateElement(Element element) {
        return ((Boolean) element.accept(ELEMENT_VALIDATING_VISITOR, (Object) null)).booleanValue();
    }

    public static boolean validateElements(Iterable<? extends Element> iterable) {
        return StreamSupport.stream(iterable.spliterator(), false).allMatch(new SuperficialValidation$$ExternalSyntheticLambda0());
    }

    public static boolean validateType(TypeMirror typeMirror) {
        return ((Boolean) typeMirror.accept(TYPE_VALIDATING_VISITOR, (Object) null)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean validateTypes(Iterable<? extends TypeMirror> iterable) {
        Iterator<? extends TypeMirror> it2 = iterable.iterator();
        while (it2.hasNext()) {
            if (!validateType(it2.next())) {
                return false;
            }
        }
        return true;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: autovalue.shaded.com.google.auto.common.SuperficialValidation$3, reason: invalid class name */
    public class AnonymousClass3 extends SimpleAnnotationValueVisitor8<Boolean, TypeMirror> {
        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ boolean lambda$visitArray$0(TypeMirror typeMirror, AnnotationValue annotationValue) {
            return ((Boolean) annotationValue.accept(this, typeMirror)).booleanValue();
        }

        public Boolean defaultAction(Object obj, TypeMirror typeMirror) {
            return Boolean.valueOf(MoreTypes.isTypeOf(obj.getClass(), typeMirror));
        }

        public Boolean visitAnnotation(AnnotationMirror annotationMirror, TypeMirror typeMirror) {
            return Boolean.valueOf(MoreTypes.equivalence().equivalent(annotationMirror.getAnnotationType(), typeMirror) && SuperficialValidation.validateAnnotation(annotationMirror));
        }

        public Boolean visitArray(List<? extends AnnotationValue> list, TypeMirror typeMirror) {
            if (!typeMirror.getKind().equals(TypeKind.ARRAY)) {
                return Boolean.FALSE;
            }
            final TypeMirror componentType = MoreTypes.asArray(typeMirror).getComponentType();
            return Boolean.valueOf(list.stream().allMatch(new Predicate() { // from class: autovalue.shaded.com.google.auto.common.SuperficialValidation$3$$ExternalSyntheticLambda0
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    boolean lambda$visitArray$0;
                    lambda$visitArray$0 = SuperficialValidation.AnonymousClass3.this.lambda$visitArray$0(componentType, (AnnotationValue) obj);
                    return lambda$visitArray$0;
                }
            }));
        }

        public Boolean visitBoolean(boolean z, TypeMirror typeMirror) {
            return Boolean.valueOf(MoreTypes.isTypeOf(Boolean.TYPE, typeMirror));
        }

        public Boolean visitByte(byte b, TypeMirror typeMirror) {
            return Boolean.valueOf(MoreTypes.isTypeOf(Byte.TYPE, typeMirror));
        }

        public Boolean visitChar(char c, TypeMirror typeMirror) {
            return Boolean.valueOf(MoreTypes.isTypeOf(Character.TYPE, typeMirror));
        }

        public Boolean visitDouble(double d, TypeMirror typeMirror) {
            return Boolean.valueOf(MoreTypes.isTypeOf(Double.TYPE, typeMirror));
        }

        public Boolean visitEnumConstant(VariableElement variableElement, TypeMirror typeMirror) {
            return Boolean.valueOf(MoreTypes.equivalence().equivalent(variableElement.asType(), typeMirror) && SuperficialValidation.validateElement(variableElement));
        }

        public Boolean visitFloat(float f, TypeMirror typeMirror) {
            return Boolean.valueOf(MoreTypes.isTypeOf(Float.TYPE, typeMirror));
        }

        public Boolean visitInt(int i, TypeMirror typeMirror) {
            return Boolean.valueOf(MoreTypes.isTypeOf(Integer.TYPE, typeMirror));
        }

        public Boolean visitLong(long j, TypeMirror typeMirror) {
            return Boolean.valueOf(MoreTypes.isTypeOf(Long.TYPE, typeMirror));
        }

        public Boolean visitShort(short s, TypeMirror typeMirror) {
            return Boolean.valueOf(MoreTypes.isTypeOf(Short.TYPE, typeMirror));
        }

        public Boolean visitType(TypeMirror typeMirror, TypeMirror typeMirror2) {
            return Boolean.valueOf(SuperficialValidation.validateType(typeMirror));
        }

        public Boolean visitUnknown(AnnotationValue annotationValue, TypeMirror typeMirror) {
            return defaultAction((Object) annotationValue, typeMirror);
        }

        public /* bridge */ /* synthetic */ Object visitArray(List list, Object obj) {
            return visitArray((List<? extends AnnotationValue>) list, (TypeMirror) obj);
        }
    }
}
