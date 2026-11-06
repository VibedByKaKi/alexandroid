package com.google.auto.value.processor;

import autovalue.shaded.com.google.auto.common.MoreElements;
import autovalue.shaded.com.google.auto.common.MoreStreams;
import autovalue.shaded.com.google.auto.common.MoreTypes;
import autovalue.shaded.com.google.common.base.Preconditions;
import autovalue.shaded.com.google.common.collect.ImmutableMap;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.TypeParameterElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.type.ArrayType;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.TypeKind;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.type.TypeVariable;
import javax.lang.model.type.WildcardType;
import javax.lang.model.util.SimpleTypeVisitor8;
import javax.lang.model.util.Types;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
final class TypeVariables {
    private TypeVariables() {
    }

    public static boolean canAssignStaticMethodResult(ExecutableElement executableElement, TypeMirror typeMirror, TypeMirror typeMirror2, Types types) {
        if (typeMirror2.getKind().equals(TypeKind.DECLARED) && executableElement.getModifiers().contains(Modifier.STATIC) && executableElement.getParameters().size() == 1) {
            List typeParameters = executableElement.getTypeParameters();
            List typeArguments = MoreTypes.asDeclared(typeMirror2).getTypeArguments();
            if (typeParameters.size() == typeArguments.size()) {
                final LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (int i = 0; i < typeParameters.size(); i++) {
                    linkedHashMap.put(MoreTypes.equivalence().wrap(MoreTypes.asTypeVariable(((TypeParameterElement) typeParameters.get(i)).asType())), (TypeMirror) typeArguments.get(i));
                }
                TypeMirror typeMirror3 = (TypeMirror) new SubstitutionVisitor(new Function() { // from class: com.google.auto.value.processor.TypeVariables$$ExternalSyntheticLambda0
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        TypeMirror lambda$canAssignStaticMethodResult$2;
                        lambda$canAssignStaticMethodResult$2 = TypeVariables.lambda$canAssignStaticMethodResult$2(linkedHashMap, (TypeVariable) obj);
                        return lambda$canAssignStaticMethodResult$2;
                    }
                }, types).visit(((VariableElement) executableElement.getParameters().get(0)).asType(), null);
                if (typeMirror3.getKind().equals(TypeKind.WILDCARD)) {
                    WildcardType asWildcard = MoreTypes.asWildcard(typeMirror3);
                    if (asWildcard.getExtendsBound() != null) {
                        typeMirror3 = asWildcard.getExtendsBound();
                    }
                }
                return types.isAssignable(typeMirror, typeMirror3);
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ TypeMirror lambda$canAssignStaticMethodResult$2(Map map, TypeVariable typeVariable) {
        return (TypeMirror) map.get(MoreTypes.equivalence().wrap(typeVariable));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ AnnotatedTypeMirror lambda$rewriteReturnTypes$1(Types types, DeclaredType declaredType, ExecutableElement executableElement) {
        return MethodSignature.asMemberOf(types, declaredType, executableElement).returnType();
    }

    public static ImmutableMap<ExecutableElement, AnnotatedTypeMirror> rewriteReturnTypes(final Types types, Collection<ExecutableElement> collection, TypeElement typeElement, TypeElement typeElement2) {
        List typeParameters = typeElement.getTypeParameters();
        List typeParameters2 = typeElement2.getTypeParameters();
        Preconditions.checkArgument(typeParameters.toString().equals(typeParameters2.toString()), "%s != %s", typeParameters, typeParameters2);
        TypeMirror[] typeMirrorArr = new TypeMirror[typeParameters2.size()];
        for (int i = 0; i < typeParameters2.size(); i++) {
            typeMirrorArr[i] = ((TypeParameterElement) typeParameters2.get(i)).asType();
        }
        final DeclaredType declaredType = types.getDeclaredType(typeElement, typeMirrorArr);
        return (ImmutableMap) collection.stream().collect(MoreStreams.toImmutableMap(new TypeVariables$$ExternalSyntheticLambda1(), new Function() { // from class: com.google.auto.value.processor.TypeVariables$$ExternalSyntheticLambda2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                AnnotatedTypeMirror lambda$rewriteReturnTypes$1;
                lambda$rewriteReturnTypes$1 = TypeVariables.lambda$rewriteReturnTypes$1(types, declaredType, (ExecutableElement) obj);
                return lambda$rewriteReturnTypes$1;
            }
        }));
    }

    public static TypeMirror substituteTypeVariables(TypeMirror typeMirror, Function<TypeVariable, TypeMirror> function, Types types) {
        return (TypeMirror) new SubstitutionVisitor(function, types).visit(typeMirror, null);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class SubstitutionVisitor extends SimpleTypeVisitor8<TypeMirror, Void> {
        private final Function<TypeVariable, TypeMirror> substitute;
        private final Types typeUtils;

        public SubstitutionVisitor(Function<TypeVariable, TypeMirror> function, Types types) {
            this.substitute = function;
            this.typeUtils = types;
        }

        private TypeMirror visitOrNull(TypeMirror typeMirror) {
            if (typeMirror == null) {
                return null;
            }
            return (TypeMirror) visit(typeMirror);
        }

        public TypeMirror visitArray(ArrayType arrayType, Void r3) {
            TypeMirror typeMirror = (TypeMirror) visit(arrayType.getComponentType());
            if (typeMirror.getKind().equals(TypeKind.WILDCARD)) {
                typeMirror = MoreTypes.asWildcard(typeMirror).getExtendsBound();
            }
            return this.typeUtils.getArrayType(typeMirror);
        }

        public TypeMirror visitDeclared(DeclaredType declaredType, Void r5) {
            List typeArguments = declaredType.getTypeArguments();
            TypeMirror[] typeMirrorArr = new TypeMirror[typeArguments.size()];
            for (int i = 0; i < typeArguments.size(); i++) {
                typeMirrorArr[i] = (TypeMirror) visit((TypeMirror) typeArguments.get(i));
            }
            return this.typeUtils.getDeclaredType(MoreElements.asType(declaredType.asElement()), typeMirrorArr);
        }

        public TypeMirror visitTypeVariable(TypeVariable typeVariable, Void r2) {
            throw null;
        }

        public TypeMirror visitWildcard(WildcardType wildcardType, Void r4) {
            TypeMirror visitOrNull = visitOrNull(wildcardType.getExtendsBound());
            return (visitOrNull == null || !visitOrNull.getKind().equals(TypeKind.WILDCARD)) ? this.typeUtils.getWildcardType(visitOrNull, visitOrNull(wildcardType.getSuperBound())) : visitOrNull;
        }

        public TypeMirror defaultAction(TypeMirror typeMirror, Void r2) {
            return typeMirror;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ExecutableElement lambda$rewriteReturnTypes$0(ExecutableElement executableElement) {
        return executableElement;
    }
}
