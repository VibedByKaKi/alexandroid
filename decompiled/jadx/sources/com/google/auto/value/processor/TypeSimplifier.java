package com.google.auto.value.processor;

import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import autovalue.shaded.com.google.auto.common.MoreElements;
import autovalue.shaded.com.google.auto.common.MoreTypes;
import autovalue.shaded.com.google.common.collect.ImmutableSortedSet;
import com.google.auto.value.processor.MissingTypes;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.Name;
import javax.lang.model.element.NestingKind;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.TypeParameterElement;
import javax.lang.model.type.ArrayType;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.TypeKind;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.type.TypeVariable;
import javax.lang.model.type.TypeVisitor;
import javax.lang.model.type.WildcardType;
import javax.lang.model.util.ElementFilter;
import javax.lang.model.util.Elements;
import javax.lang.model.util.SimpleTypeVisitor8;
import javax.lang.model.util.Types;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
final class TypeSimplifier {
    private static final TypeVisitor<Boolean, Void> CASTING_UNCHECKED_VISITOR = new AnonymousClass1(Boolean.FALSE);
    private final Map<String, Spelling> imports;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Spelling {
        final boolean importIt;
        final String spelling;

        public Spelling(String str, boolean z) {
            this.spelling = str;
            this.importIt = z;
        }
    }

    public TypeSimplifier(Elements elements, Types types, String str, Set<TypeMirror> set, TypeMirror typeMirror) {
        TypeMirrorSet typeMirrorSet = new TypeMirrorSet(set);
        if (typeMirror != null) {
            typeMirrorSet.add((TypeMirrorSet) typeMirror);
        }
        this.imports = findImports(elements, types, str, topLevelTypes(types, typeMirrorSet), nonPrivateDeclaredTypes(types, typeMirror));
    }

    public static /* synthetic */ boolean access$000(TypeMirror typeMirror) {
        return uncheckedTypeArgument(typeMirror);
    }

    public static String actualTypeParametersString(TypeElement typeElement) {
        List typeParameters = typeElement.getTypeParameters();
        return typeParameters.isEmpty() ? "" : (String) typeParameters.stream().map(new TypeSimplifier$$ExternalSyntheticLambda0()).collect(Collectors.joining(", ", "<", ">"));
    }

    private static Set<String> ambiguousNames(Types types, Set<TypeMirror> set) {
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        for (TypeMirror typeMirror : set) {
            if (typeMirror.getKind() == TypeKind.ERROR) {
                throw new MissingTypes.MissingTypeException(MoreTypes.asError(typeMirror));
            }
            String obj = types.asElement(typeMirror).getSimpleName().toString();
            Name qualifiedName = types.asElement(typeMirror).getQualifiedName();
            Name name = (Name) hashMap.put(obj, qualifiedName);
            if (name != null && !name.equals(qualifiedName)) {
                hashSet.add(obj);
            }
        }
        return hashSet;
    }

    public static String classNameOf(TypeElement typeElement) {
        String obj = typeElement.getQualifiedName().toString();
        String packageNameOf = packageNameOf(typeElement);
        return packageNameOf.isEmpty() ? obj : ParcelCompat$$ExternalSyntheticOutline0.m(1, packageNameOf, obj);
    }

    private static Map<String, Spelling> findImports(Elements elements, Types types, String str, Set<TypeMirror> set, Set<TypeMirror> set2) {
        HashMap hashMap = new HashMap();
        TypeMirrorSet typeMirrorSet = new TypeMirrorSet();
        typeMirrorSet.addAll(set);
        typeMirrorSet.addAll(set2);
        Set<String> ambiguousNames = ambiguousNames(types, typeMirrorSet);
        Iterator<TypeMirror> it2 = set.iterator();
        while (it2.hasNext()) {
            TypeElement asElement = types.asElement(it2.next());
            String obj = asElement.getQualifiedName().toString();
            String obj2 = asElement.getSimpleName().toString();
            String packageNameOf = packageNameOf(asElement);
            boolean z = false;
            if (ambiguousNames.contains(obj2)) {
                obj2 = obj;
            } else if (packageNameOf.equals("java.lang")) {
                obj2 = javaLangSpelling(elements, str, asElement);
            } else if (packageNameOf.equals(str)) {
                obj2 = obj.substring(packageNameOf.isEmpty() ? 0 : packageNameOf.length() + 1);
            } else {
                z = true;
            }
            hashMap.put(obj, new Spelling(obj2, z));
        }
        return hashMap;
    }

    public static boolean isCastingUnchecked(TypeMirror typeMirror) {
        return ((Boolean) CASTING_UNCHECKED_VISITOR.visit(typeMirror, (Object) null)).booleanValue();
    }

    private static boolean isJavaLangObject(TypeMirror typeMirror) {
        if (typeMirror.getKind() != TypeKind.DECLARED) {
            return false;
        }
        return ((DeclaredType) typeMirror).asElement().getQualifiedName().contentEquals("java.lang.Object");
    }

    private static String javaLangSpelling(Elements elements, String str, TypeElement typeElement) {
        TypeElement typeElement2 = topLevelType(typeElement);
        StringBuilder m1m = a$$ExternalSyntheticOutline0.m1m(str, ".");
        m1m.append(typeElement2.getSimpleName());
        TypeElement typeElement3 = elements.getTypeElement(m1m.toString());
        String obj = typeElement.getQualifiedName().toString();
        return typeElement3 == null ? obj.substring(10) : obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$actualTypeParametersString$0(TypeParameterElement typeParameterElement) {
        return typeParameterElement.getSimpleName().toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ TypeElement lambda$topLevelTypes$1(Types types, TypeMirror typeMirror) {
        return MoreElements.asType(types.asElement(typeMirror));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ TypeMirror lambda$topLevelTypes$2(TypeElement typeElement) {
        return topLevelType(typeElement).asType();
    }

    private static Set<TypeMirror> nonPrivateDeclaredTypes(Types types, TypeMirror typeMirror) {
        if (typeMirror == null) {
            return new TypeMirrorSet();
        }
        TypeMirrorSet typeMirrorSet = new TypeMirrorSet();
        typeMirrorSet.add((TypeMirrorSet) typeMirror);
        for (TypeElement typeElement : ElementFilter.typesIn(types.asElement(typeMirror).getEnclosedElements())) {
            if (!typeElement.getModifiers().contains(Modifier.PRIVATE)) {
                typeMirrorSet.add((TypeMirrorSet) typeElement.asType());
            }
        }
        Iterator it2 = types.directSupertypes(typeMirror).iterator();
        while (it2.hasNext()) {
            typeMirrorSet.addAll(nonPrivateDeclaredTypes(types, (TypeMirror) it2.next()));
        }
        return typeMirrorSet;
    }

    public static String packageNameOf(TypeElement typeElement) {
        return MoreElements.getPackage(typeElement).getQualifiedName().toString();
    }

    public static String simpleNameOf(String str) {
        return str.contains(".") ? str.substring(str.lastIndexOf(46) + 1) : str;
    }

    private static TypeElement topLevelType(TypeElement typeElement) {
        while (typeElement.getNestingKind() != NestingKind.TOP_LEVEL) {
            typeElement = MoreElements.asType(typeElement.getEnclosingElement());
        }
        return typeElement;
    }

    private static Set<TypeMirror> topLevelTypes(final Types types, Set<TypeMirror> set) {
        return (Set) set.stream().map(new Function() { // from class: com.google.auto.value.processor.TypeSimplifier$$ExternalSyntheticLambda1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TypeElement lambda$topLevelTypes$1;
                lambda$topLevelTypes$1 = TypeSimplifier.lambda$topLevelTypes$1(types, (TypeMirror) obj);
                return lambda$topLevelTypes$1;
            }
        }).map(new TypeSimplifier$$ExternalSyntheticLambda2()).collect(Collectors.toCollection(new AutoBuilderProcessor$$ExternalSyntheticLambda7(1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean uncheckedTypeArgument(TypeMirror typeMirror) {
        if (typeMirror.getKind() == TypeKind.WILDCARD) {
            WildcardType wildcardType = (WildcardType) typeMirror;
            return ((wildcardType.getExtendsBound() == null || isJavaLangObject(wildcardType.getExtendsBound())) && wildcardType.getSuperBound() == null) ? false : true;
        }
        return true;
    }

    public String simplifiedClassName(DeclaredType declaredType) {
        TypeElement asType = MoreElements.asType(declaredType.asElement());
        String obj = topLevelType(asType).getQualifiedName().toString();
        if (!this.imports.containsKey(obj)) {
            return asType.getQualifiedName().toString();
        }
        return a$$ExternalSyntheticOutline0.m(new StringBuilder(), this.imports.get(obj).spelling, asType.getQualifiedName().toString().substring(obj.length()));
    }

    public ImmutableSortedSet<String> typesToImport() {
        ImmutableSortedSet.Builder naturalOrder = ImmutableSortedSet.naturalOrder();
        for (Map.Entry<String, Spelling> entry : this.imports.entrySet()) {
            if (entry.getValue().importIt) {
                naturalOrder.add((ImmutableSortedSet.Builder) entry.getKey());
            }
        }
        return naturalOrder.build();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.google.auto.value.processor.TypeSimplifier$1, reason: invalid class name */
    public class AnonymousClass1 extends SimpleTypeVisitor8<Boolean, Void> {
        public AnonymousClass1(Boolean bool) {
            super(bool);
        }

        public Boolean visitArray(ArrayType arrayType, Void r2) {
            return (Boolean) visit(arrayType.getComponentType(), r2);
        }

        public Boolean visitDeclared(DeclaredType declaredType, Void r2) {
            return Boolean.valueOf(declaredType.getTypeArguments().stream().anyMatch(new TypeSimplifier$1$$ExternalSyntheticLambda0()));
        }

        public Boolean visitTypeVariable(TypeVariable typeVariable, Void r2) {
            return Boolean.TRUE;
        }

        public Boolean visitUnknown(TypeMirror typeMirror, Void r2) {
            return Boolean.TRUE;
        }
    }
}
