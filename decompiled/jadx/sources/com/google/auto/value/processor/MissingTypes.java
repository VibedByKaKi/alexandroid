package com.google.auto.value.processor;

import java.util.Iterator;
import java.util.List;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.type.ArrayType;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.ErrorType;
import javax.lang.model.type.IntersectionType;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.type.TypeVariable;
import javax.lang.model.type.WildcardType;
import javax.lang.model.util.SimpleTypeVisitor8;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
final class MissingTypes {
    private static final MissingTypeVisitor MISSING_TYPE_VISITOR = new MissingTypeVisitor();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class MissingTypeException extends RuntimeException {
        public MissingTypeException(ErrorType errorType) {
            super(errorType == null ? "" : errorType.toString());
        }
    }

    private MissingTypes() {
    }

    public static void deferIfMissingTypesIn(ExecutableElement executableElement) {
        MISSING_TYPE_VISITOR.check(executableElement.getReturnType());
        Iterator it2 = executableElement.getParameters().iterator();
        while (it2.hasNext()) {
            MISSING_TYPE_VISITOR.check(((VariableElement) it2.next()).asType());
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class MissingTypeVisitor extends SimpleTypeVisitor8<Void, TypeMirrorSet> {
        private MissingTypeVisitor() {
        }

        private Void visitAll(List<? extends TypeMirror> list, TypeMirrorSet typeMirrorSet) {
            Iterator<? extends TypeMirror> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().accept(this, typeMirrorSet);
            }
            return null;
        }

        public void check(TypeMirror typeMirror) {
            typeMirror.accept(this, new TypeMirrorSet());
        }

        public Void visitArray(ArrayType arrayType, TypeMirrorSet typeMirrorSet) {
            return (Void) arrayType.getComponentType().accept(this, typeMirrorSet);
        }

        public Void visitDeclared(DeclaredType declaredType, TypeMirrorSet typeMirrorSet) {
            if (!typeMirrorSet.add((TypeMirror) declaredType)) {
                return null;
            }
            visitAll(declaredType.getTypeArguments(), typeMirrorSet);
            return null;
        }

        public Void visitIntersection(IntersectionType intersectionType, TypeMirrorSet typeMirrorSet) {
            return visitAll(intersectionType.getBounds(), typeMirrorSet);
        }

        public Void visitTypeVariable(TypeVariable typeVariable, TypeMirrorSet typeMirrorSet) {
            if (!typeMirrorSet.add((TypeMirror) typeVariable)) {
                return null;
            }
            typeVariable.getLowerBound().accept(this, typeMirrorSet);
            typeVariable.getUpperBound().accept(this, typeMirrorSet);
            return null;
        }

        public Void visitWildcard(WildcardType wildcardType, TypeMirrorSet typeMirrorSet) {
            if (wildcardType.getSuperBound() != null) {
                wildcardType.getSuperBound().accept(this, typeMirrorSet);
            }
            if (wildcardType.getExtendsBound() == null) {
                return null;
            }
            wildcardType.getExtendsBound().accept(this, typeMirrorSet);
            return null;
        }

        public Void visitError(ErrorType errorType, TypeMirrorSet typeMirrorSet) {
            throw new MissingTypeException(errorType);
        }
    }
}
