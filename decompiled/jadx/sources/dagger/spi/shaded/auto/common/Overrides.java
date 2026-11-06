package dagger.spi.shaded.auto.common;

import com.google.common.base.Preconditions;
import com.google.common.base.Verify;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
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
import javax.lang.model.util.ElementFilter;
import javax.lang.model.util.Elements;
import javax.lang.model.util.SimpleTypeVisitor8;
import javax.lang.model.util.Types;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
abstract class Overrides {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class NativeOverrides extends Overrides {
        private final Elements elementUtils;

        public NativeOverrides(Elements elements) {
            this.elementUtils = elements;
        }

        @Override // dagger.spi.shaded.auto.common.Overrides
        public boolean overrides(ExecutableElement executableElement, ExecutableElement executableElement2, TypeElement typeElement) {
            return this.elementUtils.overrides(executableElement, executableElement2, typeElement);
        }
    }

    public abstract boolean overrides(ExecutableElement executableElement, ExecutableElement executableElement2, TypeElement typeElement);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ExplicitOverrides extends Overrides {
        private final Types typeUtils;

        public ExplicitOverrides(Types types) {
            this.typeUtils = types;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public TypeElement asTypeElement(TypeMirror typeMirror) {
            return MoreElements.asType(MoreTypes.asDeclared(typeMirror).asElement());
        }

        private boolean isSubsignature(ExecutableElement executableElement, ExecutableElement executableElement2, TypeElement typeElement) {
            DeclaredType asDeclared = MoreTypes.asDeclared(typeElement.asType());
            try {
                return this.typeUtils.isSubsignature(MoreTypes.asExecutable(this.typeUtils.asMemberOf(asDeclared, executableElement)), MoreTypes.asExecutable(this.typeUtils.asMemberOf(asDeclared, executableElement2)));
            } catch (IllegalArgumentException unused) {
                int size = executableElement.getParameters().size();
                if (executableElement2.getParameters().size() != size) {
                    return false;
                }
                ImmutableList<TypeMirror> erasedParameterTypes = this.erasedParameterTypes(executableElement, typeElement);
                ImmutableList<TypeMirror> erasedParameterTypes2 = this.erasedParameterTypes(executableElement2, typeElement);
                if (erasedParameterTypes == null || erasedParameterTypes2 == null) {
                    return false;
                }
                for (int i = 0; i < size; i++) {
                    if (!this.typeUtils.isSameType(erasedParameterTypes.get(i), erasedParameterTypes2.get(i))) {
                        return false;
                    }
                }
                return true;
            }
        }

        private ExecutableElement methodInType(TypeElement typeElement, ExecutableElement executableElement) {
            int size = executableElement.getParameters().size();
            ImmutableList<TypeMirror> erasedParameterTypes = erasedParameterTypes(executableElement, typeElement);
            if (erasedParameterTypes == null) {
                return null;
            }
            for (ExecutableElement executableElement2 : ElementFilter.methodsIn(typeElement.getEnclosedElements())) {
                if (executableElement2.getSimpleName().equals(executableElement.getSimpleName()) && executableElement2.getParameters().size() == size) {
                    for (int i = 0; i < size; i++) {
                        if (!this.typeUtils.isSameType(erasedParameterTypes.get(i), this.typeUtils.erasure(((VariableElement) executableElement2.getParameters().get(i)).asType()))) {
                            break;
                        }
                    }
                    return executableElement2;
                }
            }
            return null;
        }

        private TypeElement superclass(TypeElement typeElement) {
            TypeMirror superclass = typeElement.getSuperclass();
            if (superclass.getKind() == TypeKind.DECLARED) {
                return MoreElements.asType(this.typeUtils.asElement(superclass));
            }
            return null;
        }

        private ImmutableList<TypeElement> superinterfaces(TypeElement typeElement) {
            ImmutableList.Builder builder = ImmutableList.builder();
            Iterator it2 = typeElement.getInterfaces().iterator();
            while (it2.hasNext()) {
                builder.add((ImmutableList.Builder) MoreElements.asType(this.typeUtils.asElement((TypeMirror) it2.next())));
            }
            return builder.build();
        }

        public ImmutableList<TypeMirror> erasedParameterTypes(ExecutableElement executableElement, TypeElement typeElement) {
            return executableElement.getParameters().isEmpty() ? ImmutableList.of() : new TypeSubstVisitor().erasedParameterTypes(executableElement, typeElement);
        }

        public ExecutableElement methodFromSuperclasses(TypeElement typeElement, ExecutableElement executableElement) {
            while (typeElement != null) {
                ExecutableElement methodInType = methodInType(typeElement, executableElement);
                if (methodInType != null) {
                    return methodInType;
                }
                typeElement = superclass(typeElement);
            }
            return null;
        }

        public ExecutableElement methodFromSuperinterfaces(TypeElement typeElement, ExecutableElement executableElement) {
            TypeElement superclass;
            TypeElement asType = MoreElements.asType(executableElement.getEnclosingElement());
            Preconditions.checkArgument(asType.getKind().isInterface());
            TypeMirror erasure = this.typeUtils.erasure(asType.asType());
            ImmutableList of = ImmutableList.of(typeElement);
            while (!of.isEmpty()) {
                ImmutableList.Builder builder = ImmutableList.builder();
                UnmodifiableIterator it2 = of.iterator();
                while (it2.hasNext()) {
                    TypeElement typeElement2 = (TypeElement) it2.next();
                    if (this.typeUtils.isAssignable(this.typeUtils.erasure(typeElement2.asType()), erasure)) {
                        ExecutableElement methodInType = methodInType(typeElement2, executableElement);
                        if (methodInType != null) {
                            return methodInType;
                        }
                        builder.addAll((Iterable) superinterfaces(typeElement2));
                    }
                    if (typeElement2.getKind().isClass() && (superclass = superclass(typeElement2)) != null) {
                        builder.add((ImmutableList.Builder) superclass);
                    }
                }
                of = builder.build();
            }
            return null;
        }

        @Override // dagger.spi.shaded.auto.common.Overrides
        public boolean overrides(ExecutableElement executableElement, ExecutableElement executableElement2, TypeElement typeElement) {
            if (!executableElement.getSimpleName().equals(executableElement2.getSimpleName()) || executableElement.getEnclosingElement().equals(executableElement2.getEnclosingElement()) || executableElement2.getModifiers().contains(Modifier.STATIC)) {
                return false;
            }
            Visibility ofElement = Visibility.ofElement(executableElement2);
            Visibility ofElement2 = Visibility.ofElement(executableElement);
            if (ofElement.equals(Visibility.PRIVATE) || ofElement2.compareTo(ofElement) < 0 || !isSubsignature(executableElement, executableElement2, typeElement) || !MoreElements.methodVisibleFromPackage(executableElement2, MoreElements.getPackage(executableElement)) || !MoreElements.isType(executableElement2.getEnclosingElement())) {
                return false;
            }
            TypeElement asType = MoreElements.asType(executableElement2.getEnclosingElement());
            Types types = this.typeUtils;
            if (!types.isSubtype(types.erasure(typeElement.asType()), this.typeUtils.erasure(asType.asType()))) {
                return false;
            }
            if (!typeElement.getKind().isClass()) {
                TypeElement asType2 = MoreElements.asType(executableElement.getEnclosingElement());
                if (typeElement.getKind().isInterface()) {
                    Types types2 = this.typeUtils;
                    if (types2.isSubtype(types2.erasure(asType2.asType()), this.typeUtils.erasure(asType.asType()))) {
                        return true;
                    }
                }
                return false;
            }
            if (asType.getKind().isClass()) {
                ExecutableElement methodFromSuperclasses = methodFromSuperclasses(typeElement, executableElement2);
                return (methodFromSuperclasses == null || executableElement2.getEnclosingElement().equals(methodFromSuperclasses.getEnclosingElement())) ? false : true;
            }
            if (!asType.getKind().isInterface()) {
                return false;
            }
            if (!executableElement.getModifiers().contains(Modifier.ABSTRACT)) {
                return true;
            }
            ExecutableElement methodFromSuperinterfaces = methodFromSuperinterfaces(typeElement, executableElement2);
            return (methodFromSuperinterfaces == null || executableElement2.getEnclosingElement().equals(methodFromSuperinterfaces.getEnclosingElement())) ? false : true;
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public class TypeSubstVisitor extends SimpleTypeVisitor8<TypeMirror, Void> {
            private final Map<TypeParameterElement, TypeMirror> typeBindings;

            private TypeSubstVisitor() {
                this.typeBindings = Maps.newLinkedHashMap();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ TypeMirror lambda$erasedParameterTypes$0(TypeParameterElement typeParameterElement) {
                return (TypeMirror) typeParameterElement.getBounds().get(0);
            }

            public ImmutableList<TypeMirror> erasedParameterTypes(ExecutableElement executableElement, TypeElement typeElement) {
                if (executableElement.getEnclosingElement().equals(typeElement)) {
                    ImmutableList.Builder builder = ImmutableList.builder();
                    Iterator it2 = executableElement.getParameters().iterator();
                    while (it2.hasNext()) {
                        builder.add((ImmutableList.Builder) ExplicitOverrides.this.typeUtils.erasure((TypeMirror) visit(((VariableElement) it2.next()).asType())));
                    }
                    return builder.build();
                }
                ArrayList newArrayList = Lists.newArrayList();
                if (typeElement.getSuperclass().getKind() == TypeKind.DECLARED) {
                    newArrayList.add(typeElement.getSuperclass());
                }
                newArrayList.addAll(typeElement.getInterfaces());
                Iterator it3 = newArrayList.iterator();
                while (it3.hasNext()) {
                    DeclaredType asDeclared = MoreTypes.asDeclared((TypeMirror) it3.next());
                    TypeElement asType = MoreElements.asType(asDeclared.asElement());
                    List typeArguments = asDeclared.getTypeArguments();
                    List typeParameters = asType.getTypeParameters();
                    if (typeArguments.isEmpty()) {
                        typeArguments = (List) typeParameters.stream().map(new Overrides$ExplicitOverrides$TypeSubstVisitor$$ExternalSyntheticLambda0()).collect(Collectors.toList());
                    }
                    Verify.verify(typeArguments.size() == typeParameters.size());
                    for (int i = 0; i < typeArguments.size(); i++) {
                        this.typeBindings.put((TypeParameterElement) typeParameters.get(i), (TypeMirror) typeArguments.get(i));
                    }
                    ImmutableList<TypeMirror> erasedParameterTypes = erasedParameterTypes(executableElement, asType);
                    if (erasedParameterTypes != null) {
                        return erasedParameterTypes;
                    }
                }
                return null;
            }

            public TypeMirror visitArray(ArrayType arrayType, Void r2) {
                return ExplicitOverrides.this.typeUtils.getArrayType((TypeMirror) visit(arrayType.getComponentType()));
            }

            public TypeMirror visitDeclared(DeclaredType declaredType, Void r4) {
                if (declaredType.getTypeArguments().isEmpty()) {
                    return declaredType;
                }
                ArrayList newArrayList = Lists.newArrayList();
                Iterator it2 = declaredType.getTypeArguments().iterator();
                while (it2.hasNext()) {
                    newArrayList.add((TypeMirror) visit((TypeMirror) it2.next()));
                }
                return ExplicitOverrides.this.typeUtils.getDeclaredType(ExplicitOverrides.this.asTypeElement(declaredType), (TypeMirror[]) newArrayList.toArray(new TypeMirror[0]));
            }

            public TypeMirror visitTypeVariable(TypeVariable typeVariable, Void r3) {
                TypeParameterElement asElement = ExplicitOverrides.this.typeUtils.asElement(typeVariable);
                if (asElement instanceof TypeParameterElement) {
                    TypeParameterElement typeParameterElement = asElement;
                    if (this.typeBindings.containsKey(typeParameterElement)) {
                        return (TypeMirror) visit(this.typeBindings.get(typeParameterElement));
                    }
                }
                return (TypeMirror) visit(ExplicitOverrides.this.typeUtils.erasure(typeVariable.getUpperBound()));
            }

            public TypeMirror defaultAction(TypeMirror typeMirror, Void r2) {
                return typeMirror;
            }
        }
    }
}
