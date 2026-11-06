package autovalue.shaded.com.squareup.javapoet;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import java.io.IOException;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.TypeParameterElement;
import javax.lang.model.type.ArrayType;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.ErrorType;
import javax.lang.model.type.NoType;
import javax.lang.model.type.PrimitiveType;
import javax.lang.model.type.TypeKind;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.util.SimpleTypeVisitor8;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class TypeName {
    public final List<AnnotationSpec> annotations;
    private String cachedString;
    private final String keyword;
    public static final TypeName VOID = new TypeName("void");
    public static final TypeName BOOLEAN = new TypeName(TypedValues.Custom.S_BOOLEAN);
    public static final TypeName BYTE = new TypeName("byte");
    public static final TypeName SHORT = new TypeName("short");
    public static final TypeName INT = new TypeName("int");
    public static final TypeName LONG = new TypeName("long");
    public static final TypeName CHAR = new TypeName("char");
    public static final TypeName FLOAT = new TypeName(TypedValues.Custom.S_FLOAT);
    public static final TypeName DOUBLE = new TypeName("double");
    public static final ClassName OBJECT = ClassName.get("java.lang", "Object", new String[0]);
    private static final ClassName BOXED_VOID = ClassName.get("java.lang", "Void", new String[0]);
    private static final ClassName BOXED_BOOLEAN = ClassName.get("java.lang", "Boolean", new String[0]);
    private static final ClassName BOXED_BYTE = ClassName.get("java.lang", "Byte", new String[0]);
    private static final ClassName BOXED_SHORT = ClassName.get("java.lang", "Short", new String[0]);
    private static final ClassName BOXED_INT = ClassName.get("java.lang", "Integer", new String[0]);
    private static final ClassName BOXED_LONG = ClassName.get("java.lang", "Long", new String[0]);
    private static final ClassName BOXED_CHAR = ClassName.get("java.lang", "Character", new String[0]);
    private static final ClassName BOXED_FLOAT = ClassName.get("java.lang", "Float", new String[0]);
    private static final ClassName BOXED_DOUBLE = ClassName.get("java.lang", "Double", new String[0]);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: autovalue.shaded.com.squareup.javapoet.TypeName$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
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
                $SwitchMap$javax$lang$model$type$TypeKind[TypeKind.SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$javax$lang$model$type$TypeKind[TypeKind.INT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$javax$lang$model$type$TypeKind[TypeKind.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$javax$lang$model$type$TypeKind[TypeKind.CHAR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$javax$lang$model$type$TypeKind[TypeKind.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$javax$lang$model$type$TypeKind[TypeKind.DOUBLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private TypeName(String str, List<AnnotationSpec> list) {
        this.keyword = str;
        this.annotations = Util.immutableList(list);
    }

    public static TypeName arrayComponent(TypeName typeName) {
        if (typeName instanceof ArrayTypeName) {
            return ((ArrayTypeName) typeName).componentType;
        }
        return null;
    }

    public static ArrayTypeName asArray(TypeName typeName) {
        if (typeName instanceof ArrayTypeName) {
            return (ArrayTypeName) typeName;
        }
        return null;
    }

    public static TypeName get(Type type, Map<Type, TypeVariableName> map) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return type == Void.TYPE ? VOID : type == Boolean.TYPE ? BOOLEAN : type == Byte.TYPE ? BYTE : type == Short.TYPE ? SHORT : type == Integer.TYPE ? INT : type == Long.TYPE ? LONG : type == Character.TYPE ? CHAR : type == Float.TYPE ? FLOAT : type == Double.TYPE ? DOUBLE : cls.isArray() ? ArrayTypeName.of(get(cls.getComponentType(), map)) : ClassName.get((Class<?>) cls);
        }
        if (type instanceof ParameterizedType) {
            return ParameterizedTypeName.get((ParameterizedType) type, map);
        }
        if (type instanceof WildcardType) {
            return WildcardTypeName.get((WildcardType) type, map);
        }
        if (type instanceof TypeVariable) {
            return TypeVariableName.get((TypeVariable<?>) type, map);
        }
        if (type instanceof GenericArrayType) {
            return ArrayTypeName.get((GenericArrayType) type, map);
        }
        Single$$ExternalSyntheticBUOutline0.m$3(ParcelCompat$$ExternalSyntheticOutline0.m("unexpected type: ", type));
        return null;
    }

    public static List<TypeName> list(Type[] typeArr, Map<Type, TypeVariableName> map) {
        ArrayList arrayList = new ArrayList(typeArr.length);
        for (Type type : typeArr) {
            arrayList.add(get(type, map));
        }
        return arrayList;
    }

    public TypeName annotated(List<AnnotationSpec> list) {
        Util.checkNotNull(list, "annotations == null", new Object[0]);
        return new TypeName(this.keyword, concatAnnotations(list));
    }

    public TypeName box() {
        String str = this.keyword;
        if (str == null) {
            return this;
        }
        if (this == VOID) {
            return BOXED_VOID;
        }
        if (this == BOOLEAN) {
            return BOXED_BOOLEAN;
        }
        if (this == BYTE) {
            return BOXED_BYTE;
        }
        if (this == SHORT) {
            return BOXED_SHORT;
        }
        if (this == INT) {
            return BOXED_INT;
        }
        if (this == LONG) {
            return BOXED_LONG;
        }
        if (this == CHAR) {
            return BOXED_CHAR;
        }
        if (this == FLOAT) {
            return BOXED_FLOAT;
        }
        if (this == DOUBLE) {
            return BOXED_DOUBLE;
        }
        Buffer$$ExternalSyntheticBUOutline0.m((Object) str);
        return null;
    }

    public final List<AnnotationSpec> concatAnnotations(List<AnnotationSpec> list) {
        ArrayList arrayList = new ArrayList(this.annotations);
        arrayList.addAll(list);
        return arrayList;
    }

    public CodeWriter emit(CodeWriter codeWriter) throws IOException {
        if (this.keyword == null) {
            Buffer$$ExternalSyntheticBUOutline0.m$2();
            return null;
        }
        if (isAnnotated()) {
            codeWriter.emit("");
            emitAnnotations(codeWriter);
        }
        return codeWriter.emitAndIndent(this.keyword);
    }

    public CodeWriter emitAnnotations(CodeWriter codeWriter) throws IOException {
        Iterator<AnnotationSpec> it2 = this.annotations.iterator();
        while (it2.hasNext()) {
            it2.next().emit(codeWriter, true);
            codeWriter.emit(" ");
        }
        return codeWriter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return toString().equals(obj.toString());
        }
        return false;
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public boolean isAnnotated() {
        return !this.annotations.isEmpty();
    }

    public boolean isBoxedPrimitive() {
        return equals(BOXED_BOOLEAN) || equals(BOXED_BYTE) || equals(BOXED_SHORT) || equals(BOXED_INT) || equals(BOXED_LONG) || equals(BOXED_CHAR) || equals(BOXED_FLOAT) || equals(BOXED_DOUBLE);
    }

    public boolean isPrimitive() {
        return (this.keyword == null || this == VOID) ? false : true;
    }

    public final String toString() {
        String str = this.cachedString;
        if (str != null) {
            return str;
        }
        try {
            StringBuilder sb = new StringBuilder();
            emit(new CodeWriter(sb));
            String sb2 = sb.toString();
            this.cachedString = sb2;
            return sb2;
        } catch (IOException unused) {
            Buffer$$ExternalSyntheticBUOutline0.m$2();
            return null;
        }
    }

    public TypeName unbox() {
        if (this.keyword != null) {
            return this;
        }
        if (equals(BOXED_VOID)) {
            return VOID;
        }
        if (equals(BOXED_BOOLEAN)) {
            return BOOLEAN;
        }
        if (equals(BOXED_BYTE)) {
            return BYTE;
        }
        if (equals(BOXED_SHORT)) {
            return SHORT;
        }
        if (equals(BOXED_INT)) {
            return INT;
        }
        if (equals(BOXED_LONG)) {
            return LONG;
        }
        if (equals(BOXED_CHAR)) {
            return CHAR;
        }
        if (equals(BOXED_FLOAT)) {
            return FLOAT;
        }
        if (equals(BOXED_DOUBLE)) {
            return DOUBLE;
        }
        PathKt$$ExternalSyntheticBUOutline0.m(this, "cannot unbox ");
        return null;
    }

    public TypeName withoutAnnotations() {
        return new TypeName(this.keyword);
    }

    private TypeName(String str) {
        this(str, new ArrayList());
    }

    public TypeName(List<AnnotationSpec> list) {
        this(null, list);
    }

    public final TypeName annotated(AnnotationSpec... annotationSpecArr) {
        return annotated(Arrays.asList(annotationSpecArr));
    }

    public static List<TypeName> list(Type[] typeArr) {
        return list(typeArr, new LinkedHashMap());
    }

    public static TypeName get(TypeMirror typeMirror, final Map<TypeParameterElement, TypeVariableName> map) {
        return (TypeName) typeMirror.accept(new SimpleTypeVisitor8<TypeName, Void>() { // from class: autovalue.shaded.com.squareup.javapoet.TypeName.1
            public TypeName defaultAction(TypeMirror typeMirror2, Void r3) {
                throw new IllegalArgumentException("Unexpected type mirror: " + typeMirror2);
            }

            public TypeName visitDeclared(DeclaredType declaredType, Void r7) {
                ClassName className = ClassName.get(declaredType.asElement());
                TypeMirror enclosingType = declaredType.getEnclosingType();
                TypeName typeName = (enclosingType.getKind() == TypeKind.NONE || declaredType.asElement().getModifiers().contains(Modifier.STATIC)) ? null : (TypeName) enclosingType.accept(this, (Object) null);
                if (declaredType.getTypeArguments().isEmpty() && !(typeName instanceof ParameterizedTypeName)) {
                    return className;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it2 = declaredType.getTypeArguments().iterator();
                while (it2.hasNext()) {
                    arrayList.add(TypeName.get((TypeMirror) it2.next(), (Map<TypeParameterElement, TypeVariableName>) map));
                }
                return typeName instanceof ParameterizedTypeName ? ((ParameterizedTypeName) typeName).nestedClass(className.simpleName(), arrayList) : new ParameterizedTypeName(null, className, arrayList);
            }

            public TypeName visitNoType(NoType noType, Void r4) {
                return noType.getKind() == TypeKind.VOID ? TypeName.VOID : (TypeName) super.visitUnknown(noType, r4);
            }

            public TypeName visitPrimitive(PrimitiveType primitiveType, Void r2) {
                switch (AnonymousClass2.$SwitchMap$javax$lang$model$type$TypeKind[primitiveType.getKind().ordinal()]) {
                    case 1:
                        return TypeName.BOOLEAN;
                    case 2:
                        return TypeName.BYTE;
                    case 3:
                        return TypeName.SHORT;
                    case 4:
                        return TypeName.INT;
                    case 5:
                        return TypeName.LONG;
                    case 6:
                        return TypeName.CHAR;
                    case 7:
                        return TypeName.FLOAT;
                    case 8:
                        return TypeName.DOUBLE;
                    default:
                        Buffer$$ExternalSyntheticBUOutline0.m$2();
                        return null;
                }
            }

            public ArrayTypeName visitArray(ArrayType arrayType, Void r2) {
                return ArrayTypeName.get(arrayType, (Map<TypeParameterElement, TypeVariableName>) map);
            }

            public TypeName visitError(ErrorType errorType, Void r2) {
                return visitDeclared((DeclaredType) errorType, r2);
            }

            public TypeName visitTypeVariable(javax.lang.model.type.TypeVariable typeVariable, Void r2) {
                return TypeVariableName.get(typeVariable, (Map<TypeParameterElement, TypeVariableName>) map);
            }

            public TypeName visitWildcard(javax.lang.model.type.WildcardType wildcardType, Void r2) {
                return WildcardTypeName.get(wildcardType, (Map<TypeParameterElement, TypeVariableName>) map);
            }
        }, (Object) null);
    }

    public static TypeName get(Type type) {
        return get(type, new LinkedHashMap());
    }

    public static TypeName get(TypeMirror typeMirror) {
        return get(typeMirror, new LinkedHashMap());
    }
}
