package dagger.spi.shaded.auto.common;

import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import com.google.common.base.Equivalence;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.TypeParameterElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.type.ArrayType;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.ErrorType;
import javax.lang.model.type.ExecutableType;
import javax.lang.model.type.IntersectionType;
import javax.lang.model.type.NoType;
import javax.lang.model.type.NullType;
import javax.lang.model.type.PrimitiveType;
import javax.lang.model.type.TypeKind;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.type.TypeVariable;
import javax.lang.model.type.WildcardType;
import javax.lang.model.util.Elements;
import javax.lang.model.util.SimpleTypeVisitor8;
import javax.lang.model.util.Types;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final class MoreTypes {
    private static final int HASH_MULTIPLIER = 31;
    private static final int HASH_SEED = 17;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: dagger.spi.shaded.auto.common.MoreTypes$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$javax$lang$model$type$TypeKind;

        static {
            int[] iArr = new int[TypeKind.values().length];
            $SwitchMap$javax$lang$model$type$TypeKind = iArr;
            try {
                iArr[TypeKind.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$javax$lang$model$type$TypeKind[TypeKind.BYTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$javax$lang$model$type$TypeKind[TypeKind.CHAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$javax$lang$model$type$TypeKind[TypeKind.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$javax$lang$model$type$TypeKind[TypeKind.FLOAT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$javax$lang$model$type$TypeKind[TypeKind.INT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$javax$lang$model$type$TypeKind[TypeKind.LONG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$javax$lang$model$type$TypeKind[TypeKind.SHORT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class CastingTypeVisitor<T> extends SimpleTypeVisitor8<T, Void> {
        private final String label;

        public CastingTypeVisitor(String str) {
            this.label = str;
        }

        public T defaultAction(TypeMirror typeMirror, Void r4) {
            String valueOf = String.valueOf(typeMirror);
            String str = this.label;
            throw new IllegalArgumentException(CredentialConfig$$ExternalSyntheticOutline0.m(CredentialConfig$$ExternalSyntheticOutline0.m(valueOf.length() + 22, str), valueOf, " does not represent a ", str));
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ComparedElements {

        /* renamed from: a, reason: collision with root package name */
        final Element f1145a;
        final ImmutableList<TypeMirror> aArguments;
        final Element b;
        final ImmutableList<TypeMirror> bArguments;

        public ComparedElements(Element element, ImmutableList<TypeMirror> immutableList, Element element2, ImmutableList<TypeMirror> immutableList2) {
            this.f1145a = element;
            this.aArguments = immutableList;
            this.b = element2;
            this.bArguments = immutableList2;
        }

        public boolean equals(Object obj) {
            if (obj instanceof ComparedElements) {
                ComparedElements comparedElements = (ComparedElements) obj;
                int size = this.aArguments.size();
                if (this.f1145a.equals(comparedElements.f1145a) && this.b.equals(comparedElements.b) && size == this.bArguments.size()) {
                    for (int i = 0; i < size; i++) {
                        if (this.aArguments.get(i) != this.bArguments.get(i)) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f1145a.hashCode() * 31) + this.b.hashCode();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ReferencedTypes extends SimpleTypeVisitor8<Void, ImmutableSet.Builder<TypeElement>> {
        private static final ReferencedTypes INSTANCE = new ReferencedTypes();

        private ReferencedTypes() {
        }

        public Void visitArray(ArrayType arrayType, ImmutableSet.Builder<TypeElement> builder) {
            arrayType.getComponentType().accept(this, builder);
            return null;
        }

        public Void visitDeclared(DeclaredType declaredType, ImmutableSet.Builder<TypeElement> builder) {
            builder.add((ImmutableSet.Builder<TypeElement>) MoreElements.asType(declaredType.asElement()));
            Iterator it2 = declaredType.getTypeArguments().iterator();
            while (it2.hasNext()) {
                ((TypeMirror) it2.next()).accept(this, builder);
            }
            return null;
        }

        public Void visitTypeVariable(TypeVariable typeVariable, ImmutableSet.Builder<TypeElement> builder) {
            typeVariable.getLowerBound().accept(this, builder);
            typeVariable.getUpperBound().accept(this, builder);
            return null;
        }

        public Void visitWildcard(WildcardType wildcardType, ImmutableSet.Builder<TypeElement> builder) {
            TypeMirror extendsBound = wildcardType.getExtendsBound();
            if (extendsBound != null) {
                extendsBound.accept(this, builder);
            }
            TypeMirror superBound = wildcardType.getSuperBound();
            if (superBound == null) {
                return null;
            }
            superBound.accept(this, builder);
            return null;
        }
    }

    private MoreTypes() {
    }

    public static ArrayType asArray(TypeMirror typeMirror) {
        return (ArrayType) typeMirror.accept(ArrayTypeVisitor.INSTANCE, (Object) null);
    }

    public static DeclaredType asDeclared(TypeMirror typeMirror) {
        return (DeclaredType) typeMirror.accept(DeclaredTypeVisitor.INSTANCE, (Object) null);
    }

    public static Element asElement(TypeMirror typeMirror) {
        return (Element) typeMirror.accept(AsElementVisitor.INSTANCE, (Object) null);
    }

    public static ErrorType asError(TypeMirror typeMirror) {
        return (ErrorType) typeMirror.accept(ErrorTypeVisitor.INSTANCE, (Object) null);
    }

    public static ExecutableType asExecutable(TypeMirror typeMirror) {
        return (ExecutableType) typeMirror.accept(ExecutableTypeVisitor.INSTANCE, (Object) null);
    }

    public static IntersectionType asIntersection(TypeMirror typeMirror) {
        return (IntersectionType) typeMirror.accept(IntersectionTypeVisitor.INSTANCE, (Object) null);
    }

    public static TypeMirror asMemberOf(Types types, DeclaredType declaredType, VariableElement variableElement) {
        if (!variableElement.getKind().equals(ElementKind.PARAMETER)) {
            return types.asMemberOf(declaredType, variableElement);
        }
        ExecutableElement asExecutable = MoreElements.asExecutable(variableElement.getEnclosingElement());
        ExecutableType asExecutable2 = asExecutable(types.asMemberOf(declaredType, asExecutable));
        List parameters = asExecutable.getParameters();
        List parameterTypes = asExecutable2.getParameterTypes();
        Preconditions.checkState(parameters.size() == parameterTypes.size());
        for (int i = 0; i < parameters.size(); i++) {
            if (((VariableElement) parameters.get(i)).equals(variableElement)) {
                return (TypeMirror) parameterTypes.get(i);
            }
        }
        String valueOf = String.valueOf(variableElement);
        Single$$ExternalSyntheticBUOutline0.m$2(CredentialConfig$$ExternalSyntheticOutline0.m(valueOf.length() + 25, "Could not find variable: ", valueOf));
        return null;
    }

    public static NoType asNoType(TypeMirror typeMirror) {
        return (NoType) typeMirror.accept(NoTypeVisitor.INSTANCE, (Object) null);
    }

    public static NullType asNullType(TypeMirror typeMirror) {
        return (NullType) typeMirror.accept(NullTypeVisitor.INSTANCE, (Object) null);
    }

    public static PrimitiveType asPrimitiveType(TypeMirror typeMirror) {
        return (PrimitiveType) typeMirror.accept(PrimitiveTypeVisitor.INSTANCE, (Object) null);
    }

    public static TypeElement asTypeElement(TypeMirror typeMirror) {
        return MoreElements.asType(asElement(typeMirror));
    }

    public static ImmutableSet<TypeElement> asTypeElements(Iterable<? extends TypeMirror> iterable) {
        Preconditions.checkNotNull(iterable);
        ImmutableSet.Builder builder = ImmutableSet.builder();
        Iterator<? extends TypeMirror> it2 = iterable.iterator();
        while (it2.hasNext()) {
            builder.add((ImmutableSet.Builder) asTypeElement(it2.next()));
        }
        return builder.build();
    }

    public static TypeVariable asTypeVariable(TypeMirror typeMirror) {
        return (TypeVariable) typeMirror.accept(TypeVariableVisitor.INSTANCE, (Object) null);
    }

    public static WildcardType asWildcard(TypeMirror typeMirror) {
        return (WildcardType) typeMirror.accept(WildcardTypeVisitor.INSTANCE, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static TypeMirror enclosingType(DeclaredType declaredType) {
        TypeMirror enclosingType = declaredType.getEnclosingType();
        if (enclosingType.getKind().equals(TypeKind.NONE) || declaredType.asElement().getModifiers().contains(Modifier.STATIC)) {
            return null;
        }
        return enclosingType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean equal(TypeMirror typeMirror, TypeMirror typeMirror2, Set<ComparedElements> set) {
        if (typeMirror == typeMirror2) {
            return true;
        }
        if (typeMirror == null || typeMirror2 == null) {
            return false;
        }
        if (typeMirror.equals(typeMirror2) && !(typeMirror instanceof ExecutableType)) {
            return true;
        }
        EqualVisitorParam equalVisitorParam = new EqualVisitorParam(null);
        equalVisitorParam.type = typeMirror2;
        equalVisitorParam.visiting = set;
        return ((Boolean) typeMirror.accept(EqualVisitor.INSTANCE, equalVisitorParam)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean equalLists(List<? extends TypeMirror> list, List<? extends TypeMirror> list2, Set<ComparedElements> set) {
        if (list.size() != list2.size()) {
            return false;
        }
        Iterator<? extends TypeMirror> it2 = list.iterator();
        Iterator<? extends TypeMirror> it3 = list2.iterator();
        while (it2.hasNext()) {
            if (!equal(it2.next(), it3.next(), set)) {
                return false;
            }
        }
        return true;
    }

    public static Equivalence<TypeMirror> equivalence() {
        return TypeEquivalence.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int hash(TypeMirror typeMirror, Set<Element> set) {
        if (typeMirror == null) {
            return 0;
        }
        return ((Integer) typeMirror.accept(HashVisitor.INSTANCE, set)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int hashList(List<? extends TypeMirror> list, Set<Element> set) {
        Iterator<? extends TypeMirror> it2 = list.iterator();
        int i = 17;
        while (it2.hasNext()) {
            i = (i * 31) + hash(it2.next(), set);
        }
        return i;
    }

    public static boolean isConversionFromObjectUnchecked(TypeMirror typeMirror) {
        return ((Boolean) new CastingUncheckedVisitor().visit(typeMirror, null)).booleanValue();
    }

    private static boolean isObjectType(DeclaredType declaredType) {
        return asTypeElement(declaredType).getQualifiedName().contentEquals("java.lang.Object");
    }

    public static boolean isType(TypeMirror typeMirror) {
        return ((Boolean) typeMirror.accept(IsTypeVisitor.INSTANCE, (Object) null)).booleanValue();
    }

    public static boolean isTypeOf(Class<?> cls, TypeMirror typeMirror) {
        Preconditions.checkNotNull(cls);
        return ((Boolean) typeMirror.accept(new IsTypeOf(cls), (Object) null)).booleanValue();
    }

    public static Optional<DeclaredType> nonObjectSuperclass(Types types, Elements elements, DeclaredType declaredType) {
        Preconditions.checkNotNull(types);
        Preconditions.checkNotNull(elements);
        Preconditions.checkNotNull(declaredType);
        TypeMirror superclass = asTypeElement(declaredType).getSuperclass();
        if (!isType(superclass)) {
            return Optional.absent();
        }
        DeclaredType asDeclared = asDeclared(superclass);
        return isObjectType(asDeclared) ? Optional.absent() : asDeclared.getTypeArguments().isEmpty() ? Optional.of(asDeclared) : Optional.of(asDeclared((TypeMirror) types.directSupertypes(declaredType).get(0)));
    }

    public static ImmutableSet<TypeElement> referencedTypes(TypeMirror typeMirror) {
        Preconditions.checkNotNull(typeMirror);
        ImmutableSet.Builder builder = ImmutableSet.builder();
        typeMirror.accept(ReferencedTypes.INSTANCE, builder);
        return builder.build();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class EqualVisitorParam {
        TypeMirror type;
        Set<ComparedElements> visiting;

        private EqualVisitorParam() {
        }

        public /* synthetic */ EqualVisitorParam(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ArrayTypeVisitor extends CastingTypeVisitor<ArrayType> {
        private static final ArrayTypeVisitor INSTANCE = new ArrayTypeVisitor();

        public ArrayTypeVisitor() {
            super("array");
        }

        public ArrayType visitArray(ArrayType arrayType, Void r2) {
            return arrayType;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class AsElementVisitor extends SimpleTypeVisitor8<Element, Void> {
        private static final AsElementVisitor INSTANCE = new AsElementVisitor();

        private AsElementVisitor() {
        }

        public Element defaultAction(TypeMirror typeMirror, Void r3) {
            String valueOf = String.valueOf(typeMirror);
            throw new IllegalArgumentException(CredentialConfig$$ExternalSyntheticOutline0.m(valueOf.length() + 34, valueOf, " cannot be converted to an Element"));
        }

        public Element visitDeclared(DeclaredType declaredType, Void r2) {
            return declaredType.asElement();
        }

        public Element visitError(ErrorType errorType, Void r2) {
            return errorType.asElement();
        }

        public Element visitTypeVariable(TypeVariable typeVariable, Void r2) {
            return typeVariable.asElement();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class CastingUncheckedVisitor extends SimpleTypeVisitor8<Boolean, Void> {
        public CastingUncheckedVisitor() {
            super(Boolean.FALSE);
        }

        private static boolean isJavaLangObject(TypeMirror typeMirror) {
            if (typeMirror.getKind() != TypeKind.DECLARED) {
                return false;
            }
            return MoreTypes.asTypeElement(typeMirror).getQualifiedName().contentEquals("java.lang.Object");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean uncheckedTypeArgument(TypeMirror typeMirror) {
            if (typeMirror.getKind().equals(TypeKind.WILDCARD)) {
                WildcardType asWildcard = MoreTypes.asWildcard(typeMirror);
                return ((asWildcard.getExtendsBound() == null || isJavaLangObject(asWildcard.getExtendsBound())) && asWildcard.getSuperBound() == null) ? false : true;
            }
            return true;
        }

        public Boolean visitArray(ArrayType arrayType, Void r2) {
            return (Boolean) visit(arrayType.getComponentType(), r2);
        }

        public Boolean visitDeclared(DeclaredType declaredType, Void r2) {
            return Boolean.valueOf(declaredType.getTypeArguments().stream().anyMatch(new MoreTypes$CastingUncheckedVisitor$$ExternalSyntheticLambda0()));
        }

        public Boolean visitTypeVariable(TypeVariable typeVariable, Void r2) {
            return Boolean.TRUE;
        }

        public Boolean visitUnknown(TypeMirror typeMirror, Void r2) {
            return Boolean.TRUE;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class DeclaredTypeVisitor extends CastingTypeVisitor<DeclaredType> {
        private static final DeclaredTypeVisitor INSTANCE = new DeclaredTypeVisitor();

        public DeclaredTypeVisitor() {
            super("declared type");
        }

        public DeclaredType visitDeclared(DeclaredType declaredType, Void r2) {
            return declaredType;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class EqualVisitor extends SimpleTypeVisitor8<Boolean, EqualVisitorParam> {
        private static final EqualVisitor INSTANCE = new EqualVisitor();

        private EqualVisitor() {
        }

        private Set<ComparedElements> visitingSetPlus(Set<ComparedElements> set, Element element, List<? extends TypeMirror> list, Element element2, List<? extends TypeMirror> list2) {
            ComparedElements comparedElements = new ComparedElements(element, ImmutableList.copyOf((Collection) list), element2, ImmutableList.copyOf((Collection) list2));
            HashSet hashSet = new HashSet(set);
            hashSet.add(comparedElements);
            return hashSet;
        }

        public Boolean defaultAction(TypeMirror typeMirror, EqualVisitorParam equalVisitorParam) {
            return Boolean.valueOf(typeMirror.getKind().equals(equalVisitorParam.type.getKind()));
        }

        public Boolean visitArray(ArrayType arrayType, EqualVisitorParam equalVisitorParam) {
            if (!equalVisitorParam.type.getKind().equals(TypeKind.ARRAY)) {
                return Boolean.FALSE;
            }
            return Boolean.valueOf(MoreTypes.equal(arrayType.getComponentType(), equalVisitorParam.type.getComponentType(), equalVisitorParam.visiting));
        }

        public Boolean visitDeclared(DeclaredType declaredType, EqualVisitorParam equalVisitorParam) {
            if (!equalVisitorParam.type.getKind().equals(TypeKind.DECLARED)) {
                return Boolean.FALSE;
            }
            DeclaredType declaredType2 = equalVisitorParam.type;
            Element asElement = declaredType.asElement();
            Element asElement2 = declaredType2.asElement();
            Set<ComparedElements> visitingSetPlus = visitingSetPlus(equalVisitorParam.visiting, asElement, declaredType.getTypeArguments(), asElement2, declaredType2.getTypeArguments());
            if (visitingSetPlus.equals(equalVisitorParam.visiting)) {
                return Boolean.TRUE;
            }
            return Boolean.valueOf(asElement.equals(asElement2) && MoreTypes.equal(MoreTypes.enclosingType(declaredType), MoreTypes.enclosingType(declaredType2), visitingSetPlus) && MoreTypes.equalLists(declaredType.getTypeArguments(), declaredType2.getTypeArguments(), visitingSetPlus));
        }

        public Boolean visitError(ErrorType errorType, EqualVisitorParam equalVisitorParam) {
            return Boolean.valueOf(errorType.equals(equalVisitorParam.type));
        }

        public Boolean visitExecutable(ExecutableType executableType, EqualVisitorParam equalVisitorParam) {
            if (!equalVisitorParam.type.getKind().equals(TypeKind.EXECUTABLE)) {
                return Boolean.FALSE;
            }
            ExecutableType executableType2 = equalVisitorParam.type;
            return Boolean.valueOf(MoreTypes.equalLists(executableType.getParameterTypes(), executableType2.getParameterTypes(), equalVisitorParam.visiting) && MoreTypes.equal(executableType.getReturnType(), executableType2.getReturnType(), equalVisitorParam.visiting) && MoreTypes.equalLists(executableType.getThrownTypes(), executableType2.getThrownTypes(), equalVisitorParam.visiting) && MoreTypes.equalLists(executableType.getTypeVariables(), executableType2.getTypeVariables(), equalVisitorParam.visiting));
        }

        public Boolean visitIntersection(IntersectionType intersectionType, EqualVisitorParam equalVisitorParam) {
            if (!equalVisitorParam.type.getKind().equals(TypeKind.INTERSECTION)) {
                return Boolean.FALSE;
            }
            return Boolean.valueOf(MoreTypes.equalLists(intersectionType.getBounds(), equalVisitorParam.type.getBounds(), equalVisitorParam.visiting));
        }

        public Boolean visitTypeVariable(TypeVariable typeVariable, EqualVisitorParam equalVisitorParam) {
            if (!equalVisitorParam.type.getKind().equals(TypeKind.TYPEVAR)) {
                return Boolean.FALSE;
            }
            TypeVariable typeVariable2 = equalVisitorParam.type;
            TypeParameterElement asElement = typeVariable.asElement();
            TypeParameterElement asElement2 = typeVariable2.asElement();
            Set<ComparedElements> visitingSetPlus = visitingSetPlus(equalVisitorParam.visiting, asElement, asElement2);
            if (visitingSetPlus.equals(equalVisitorParam.visiting)) {
                return Boolean.TRUE;
            }
            return Boolean.valueOf(MoreTypes.equalLists(asElement.getBounds(), asElement2.getBounds(), visitingSetPlus) && MoreTypes.equal(typeVariable.getLowerBound(), typeVariable2.getLowerBound(), visitingSetPlus) && typeVariable.asElement().getSimpleName().equals(typeVariable2.asElement().getSimpleName()));
        }

        public Boolean visitWildcard(WildcardType wildcardType, EqualVisitorParam equalVisitorParam) {
            if (!equalVisitorParam.type.getKind().equals(TypeKind.WILDCARD)) {
                return Boolean.FALSE;
            }
            WildcardType wildcardType2 = equalVisitorParam.type;
            return Boolean.valueOf(MoreTypes.equal(wildcardType.getExtendsBound(), wildcardType2.getExtendsBound(), equalVisitorParam.visiting) && MoreTypes.equal(wildcardType.getSuperBound(), wildcardType2.getSuperBound(), equalVisitorParam.visiting));
        }

        public Boolean visitUnknown(TypeMirror typeMirror, EqualVisitorParam equalVisitorParam) {
            throw new UnsupportedOperationException();
        }

        private Set<ComparedElements> visitingSetPlus(Set<ComparedElements> set, Element element, Element element2) {
            ImmutableList of = ImmutableList.of();
            return visitingSetPlus(set, element, of, element2, of);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ErrorTypeVisitor extends CastingTypeVisitor<ErrorType> {
        private static final ErrorTypeVisitor INSTANCE = new ErrorTypeVisitor();

        public ErrorTypeVisitor() {
            super("error type");
        }

        public ErrorType visitError(ErrorType errorType, Void r2) {
            return errorType;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ExecutableTypeVisitor extends CastingTypeVisitor<ExecutableType> {
        private static final ExecutableTypeVisitor INSTANCE = new ExecutableTypeVisitor();

        public ExecutableTypeVisitor() {
            super("executable type");
        }

        public ExecutableType visitExecutable(ExecutableType executableType, Void r2) {
            return executableType;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class HashVisitor extends SimpleTypeVisitor8<Integer, Set<Element>> {
        private static final HashVisitor INSTANCE = new HashVisitor();

        private HashVisitor() {
        }

        public Integer defaultAction(TypeMirror typeMirror, Set<Element> set) {
            return Integer.valueOf(hashKind(17, typeMirror));
        }

        public int hashKind(int i, TypeMirror typeMirror) {
            return (i * 31) + typeMirror.getKind().hashCode();
        }

        public Integer visitArray(ArrayType arrayType, Set<Element> set) {
            return TableInfo$$ExternalSyntheticOutline0.m(hashKind(17, arrayType) * 31, (Integer) arrayType.getComponentType().accept(this, set));
        }

        public Integer visitDeclared(DeclaredType declaredType, Set<Element> set) {
            Element asElement = declaredType.asElement();
            if (set.contains(asElement)) {
                return 0;
            }
            HashSet hashSet = new HashSet(set);
            hashSet.add(asElement);
            return Integer.valueOf(MoreTypes.hashList(declaredType.getTypeArguments(), hashSet) + ((((Integer) declaredType.getEnclosingType().accept(this, hashSet)).intValue() + (((hashKind(17, declaredType) * 31) + declaredType.asElement().hashCode()) * 31)) * 31));
        }

        public Integer visitExecutable(ExecutableType executableType, Set<Element> set) {
            return Integer.valueOf(MoreTypes.hashList(executableType.getTypeVariables(), set) + ((MoreTypes.hashList(executableType.getThrownTypes(), set) + ((((Integer) executableType.getReturnType().accept(this, set)).intValue() + ((MoreTypes.hashList(executableType.getParameterTypes(), set) + (hashKind(17, executableType) * 31)) * 31)) * 31)) * 31));
        }

        public Integer visitTypeVariable(TypeVariable typeVariable, Set<Element> set) {
            int intValue = ((Integer) typeVariable.getLowerBound().accept(this, set)).intValue() + (hashKind(17, typeVariable) * 31);
            Iterator it2 = typeVariable.asElement().getBounds().iterator();
            while (it2.hasNext()) {
                intValue = (intValue * 31) + ((Integer) ((TypeMirror) it2.next()).accept(this, set)).intValue();
            }
            return Integer.valueOf(intValue);
        }

        public Integer visitWildcard(WildcardType wildcardType, Set<Element> set) {
            return Integer.valueOf((((hashKind(17, wildcardType) * 31) + (wildcardType.getExtendsBound() == null ? 0 : ((Integer) wildcardType.getExtendsBound().accept(this, set)).intValue())) * 31) + (wildcardType.getSuperBound() != null ? ((Integer) wildcardType.getSuperBound().accept(this, set)).intValue() : 0));
        }

        public Integer visitUnknown(TypeMirror typeMirror, Set<Element> set) {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class IntersectionTypeVisitor extends CastingTypeVisitor<IntersectionType> {
        private static final IntersectionTypeVisitor INSTANCE = new IntersectionTypeVisitor();

        public IntersectionTypeVisitor() {
            super("intersection type");
        }

        public IntersectionType visitIntersection(IntersectionType intersectionType, Void r2) {
            return intersectionType;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class IsTypeOf extends SimpleTypeVisitor8<Boolean, Void> {
        private final Class<?> clazz;

        public IsTypeOf(Class<?> cls) {
            this.clazz = cls;
        }

        public Boolean defaultAction(TypeMirror typeMirror, Void r3) {
            String valueOf = String.valueOf(typeMirror);
            throw new IllegalArgumentException(CredentialConfig$$ExternalSyntheticOutline0.m(valueOf.length() + 37, valueOf, " cannot be represented as a Class<?>."));
        }

        public Boolean visitArray(ArrayType arrayType, Void r2) {
            return Boolean.valueOf(this.clazz.isArray() && MoreTypes.isTypeOf(this.clazz.getComponentType(), arrayType.getComponentType()));
        }

        public Boolean visitDeclared(DeclaredType declaredType, Void r2) {
            return Boolean.valueOf(MoreElements.asType(declaredType.asElement()).getQualifiedName().contentEquals(this.clazz.getCanonicalName()));
        }

        public Boolean visitNoType(NoType noType, Void r3) {
            if (noType.getKind().equals(TypeKind.VOID)) {
                return Boolean.valueOf(this.clazz.equals(Void.TYPE));
            }
            String valueOf = String.valueOf(noType);
            Single$$ExternalSyntheticBUOutline0.m$3(CredentialConfig$$ExternalSyntheticOutline0.m(valueOf.length() + 37, valueOf, " cannot be represented as a Class<?>."));
            return null;
        }

        public Boolean visitPrimitive(PrimitiveType primitiveType, Void r3) {
            switch (AnonymousClass1.$SwitchMap$javax$lang$model$type$TypeKind[primitiveType.getKind().ordinal()]) {
                case 1:
                    return Boolean.valueOf(this.clazz.equals(Boolean.TYPE));
                case 2:
                    return Boolean.valueOf(this.clazz.equals(Byte.TYPE));
                case 3:
                    return Boolean.valueOf(this.clazz.equals(Character.TYPE));
                case 4:
                    return Boolean.valueOf(this.clazz.equals(Double.TYPE));
                case 5:
                    return Boolean.valueOf(this.clazz.equals(Float.TYPE));
                case 6:
                    return Boolean.valueOf(this.clazz.equals(Integer.TYPE));
                case 7:
                    return Boolean.valueOf(this.clazz.equals(Long.TYPE));
                case 8:
                    return Boolean.valueOf(this.clazz.equals(Short.TYPE));
                default:
                    String valueOf = String.valueOf(primitiveType);
                    Single$$ExternalSyntheticBUOutline0.m$3(CredentialConfig$$ExternalSyntheticOutline0.m(valueOf.length() + 37, valueOf, " cannot be represented as a Class<?>."));
                    return null;
            }
        }

        public Boolean visitError(ErrorType errorType, Void r2) {
            return Boolean.FALSE;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class IsTypeVisitor extends SimpleTypeVisitor8<Boolean, Void> {
        private static final IsTypeVisitor INSTANCE = new IsTypeVisitor();

        private IsTypeVisitor() {
        }

        public Boolean visitDeclared(DeclaredType declaredType, Void r2) {
            return Boolean.valueOf(MoreElements.isType(declaredType.asElement()));
        }

        public Boolean visitNoType(NoType noType, Void r2) {
            return Boolean.valueOf(noType.getKind().equals(TypeKind.VOID));
        }

        public Boolean defaultAction(TypeMirror typeMirror, Void r2) {
            return Boolean.FALSE;
        }

        public Boolean visitArray(ArrayType arrayType, Void r2) {
            return Boolean.TRUE;
        }

        public Boolean visitPrimitive(PrimitiveType primitiveType, Void r2) {
            return Boolean.TRUE;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class NoTypeVisitor extends CastingTypeVisitor<NoType> {
        private static final NoTypeVisitor INSTANCE = new NoTypeVisitor();

        public NoTypeVisitor() {
            super("non-type");
        }

        public NoType visitNoType(NoType noType, Void r2) {
            return noType;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class NullTypeVisitor extends CastingTypeVisitor<NullType> {
        private static final NullTypeVisitor INSTANCE = new NullTypeVisitor();

        public NullTypeVisitor() {
            super("null");
        }

        public NullType visitNull(NullType nullType, Void r2) {
            return nullType;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class PrimitiveTypeVisitor extends CastingTypeVisitor<PrimitiveType> {
        private static final PrimitiveTypeVisitor INSTANCE = new PrimitiveTypeVisitor();

        public PrimitiveTypeVisitor() {
            super("primitive type");
        }

        public PrimitiveType visitPrimitive(PrimitiveType primitiveType, Void r2) {
            return primitiveType;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class TypeVariableVisitor extends CastingTypeVisitor<TypeVariable> {
        private static final TypeVariableVisitor INSTANCE = new TypeVariableVisitor();

        public TypeVariableVisitor() {
            super("type variable");
        }

        public TypeVariable visitTypeVariable(TypeVariable typeVariable, Void r2) {
            return typeVariable;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class WildcardTypeVisitor extends CastingTypeVisitor<WildcardType> {
        private static final WildcardTypeVisitor INSTANCE = new WildcardTypeVisitor();

        public WildcardTypeVisitor() {
            super("wildcard type");
        }

        public WildcardType visitWildcard(WildcardType wildcardType, Void r2) {
            return wildcardType;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class TypeEquivalence extends Equivalence<TypeMirror> {
        private static final TypeEquivalence INSTANCE = new TypeEquivalence();

        private TypeEquivalence() {
        }

        @Override // com.google.common.base.Equivalence
        public int doHash(TypeMirror typeMirror) {
            return MoreTypes.hash(typeMirror, ImmutableSet.of());
        }

        public String toString() {
            return "MoreTypes.equivalence()";
        }

        @Override // com.google.common.base.Equivalence
        public boolean doEquivalent(TypeMirror typeMirror, TypeMirror typeMirror2) {
            return MoreTypes.equal(typeMirror, typeMirror2, ImmutableSet.of());
        }
    }
}
