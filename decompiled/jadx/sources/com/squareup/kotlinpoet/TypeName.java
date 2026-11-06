package com.squareup.kotlinpoet;

import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.auth.BuildConfig;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.dee.app.metrics.MetricsConstants;
import com.squareup.kotlinpoet.ParameterizedTypeName;
import com.squareup.kotlinpoet.TypeName;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.TypeParameterElement;
import javax.lang.model.type.ArrayType;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.ErrorType;
import javax.lang.model.type.NoType;
import javax.lang.model.type.PrimitiveType;
import javax.lang.model.type.TypeKind;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.type.TypeVisitor;
import javax.lang.model.util.SimpleTypeVisitor7;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 22\u00020\u0001:\u00012B%\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ \u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J<\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0018\b\u0002\u0010\u0016\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0018\u0012\u0004\u0012\u00020\u00190\u0017H&J\u0015\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fH ¢\u0006\u0002\b!J\u0015\u0010\"\u001a\u00020#2\u0006\u0010 \u001a\u00020\u001fH\u0000¢\u0006\u0002\b$J\u0015\u0010%\u001a\u00020#2\u0006\u0010 \u001a\u00020\u001fH\u0000¢\u0006\u0002\b&J\u0013\u0010'\u001a\u00020\u00032\b\u0010(\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010)\u001a\u00020*H\u0016J(\u0010+\u001a\u0004\u0018\u0001H,\"\b\b\u0000\u0010,*\u00020\u00192\f\u0010-\u001a\b\u0012\u0004\u0012\u0002H,0.H\u0096\u0001¢\u0006\u0002\u0010/J(\u0010+\u001a\u0004\u0018\u0001H,\"\b\b\u0000\u0010,*\u00020\u00192\f\u0010-\u001a\b\u0012\u0004\u0012\u0002H,0\u0018H\u0096\u0001¢\u0006\u0002\u00100J\b\u00101\u001a\u00020\rH\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u0016\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0018\u0012\u0004\u0012\u00020\u00190\u00178VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u0082\u0001\u0006345678¨\u00069"}, d2 = {"Lcom/squareup/kotlinpoet/TypeName;", "Lcom/squareup/kotlinpoet/Taggable;", "isNullable", "", "annotations", "", "Lcom/squareup/kotlinpoet/AnnotationSpec;", "tagMap", "Lcom/squareup/kotlinpoet/TagMap;", "(ZLjava/util/List;Lcom/squareup/kotlinpoet/TagMap;)V", "getAnnotations", "()Ljava/util/List;", "cachedString", "", "getCachedString", "()Ljava/lang/String;", "cachedString$delegate", "Lkotlin/Lazy;", "isAnnotated", "()Z", "getTagMap$kotlinpoet", "()Lcom/squareup/kotlinpoet/TagMap;", "tags", "", "Lkotlin/reflect/KClass;", "", "getTags", "()Ljava/util/Map;", "copy", "nullable", "emit", "Lcom/squareup/kotlinpoet/CodeWriter;", "out", "emit$kotlinpoet", "emitAnnotations", "", "emitAnnotations$kotlinpoet", "emitNullable", "emitNullable$kotlinpoet", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "tag", ExifInterface.GPS_DIRECTION_TRUE, "type", "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/Object;", "(Lkotlin/reflect/KClass;)Ljava/lang/Object;", "toString", "Companion", "Lcom/squareup/kotlinpoet/ClassName;", "Lcom/squareup/kotlinpoet/Dynamic;", "Lcom/squareup/kotlinpoet/LambdaTypeName;", "Lcom/squareup/kotlinpoet/ParameterizedTypeName;", "Lcom/squareup/kotlinpoet/TypeVariableName;", "Lcom/squareup/kotlinpoet/WildcardTypeName;", "kotlinpoet"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class TypeName implements Taggable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final List<AnnotationSpec> annotations;

    /* renamed from: cachedString$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy cachedString;
    private final boolean isNullable;

    @NotNull
    private final TagMap tagMap;

    private TypeName(boolean z, List<AnnotationSpec> list, TagMap tagMap) {
        this.isNullable = z;
        this.tagMap = tagMap;
        this.annotations = UtilKt.toImmutableList(list);
        this.cachedString = LazyKt.lazy(new Function0<String>() { // from class: com.squareup.kotlinpoet.TypeName$cachedString$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                TypeName typeName = TypeName.this;
                StringBuilder sb = new StringBuilder();
                CodeWriter codeWriter = new CodeWriter(sb, null, null, null, null, Integer.MAX_VALUE, 30, null);
                try {
                    typeName.emitAnnotations$kotlinpoet(codeWriter);
                    typeName.emit$kotlinpoet(codeWriter);
                    if (typeName.getIsNullable()) {
                        CodeWriter.emit$default(codeWriter, "?", false, 2, null);
                    }
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(codeWriter, null);
                    return sb.toString();
                } finally {
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TypeName copy$default(TypeName typeName, boolean z, List list, Map map, int i, Object obj) {
        if (obj != null) {
            Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: copy");
            return null;
        }
        if ((i & 1) != 0) {
            z = typeName.isNullable;
        }
        if ((i & 2) != 0) {
            list = CollectionsKt.toList(typeName.annotations);
        }
        if ((i & 4) != 0) {
            map = typeName.getTags();
        }
        return typeName.copy(z, list, map);
    }

    private final String getCachedString() {
        return (String) this.cachedString.getValue();
    }

    @NotNull
    public final TypeName copy(boolean nullable, @NotNull List<AnnotationSpec> annotations) {
        annotations.getClass();
        return copy(nullable, annotations, getTags());
    }

    @NotNull
    public abstract TypeName copy(boolean nullable, @NotNull List<AnnotationSpec> annotations, @NotNull Map<KClass<?>, ? extends Object> tags);

    @NotNull
    public abstract CodeWriter emit$kotlinpoet(@NotNull CodeWriter out);

    public final void emitAnnotations$kotlinpoet(@NotNull CodeWriter out) {
        out.getClass();
        Iterator<AnnotationSpec> it2 = this.annotations.iterator();
        while (it2.hasNext()) {
            CodeWriter codeWriter = out;
            AnnotationSpec.emit$kotlinpoet$default(it2.next(), codeWriter, true, false, 4, null);
            CodeWriter.emit$default(codeWriter, " ", false, 2, null);
            out = codeWriter;
        }
    }

    public final void emitNullable$kotlinpoet(@NotNull CodeWriter out) {
        out.getClass();
        if (this.isNullable) {
            CodeWriter.emit$default(out, "?", false, 2, null);
        }
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && Intrinsics.areEqual(getClass(), other.getClass())) {
            return Intrinsics.areEqual(toString(), other.toString());
        }
        return false;
    }

    @NotNull
    public final List<AnnotationSpec> getAnnotations() {
        return this.annotations;
    }

    @NotNull
    /* renamed from: getTagMap$kotlinpoet, reason: from getter */
    public final TagMap getTagMap() {
        return this.tagMap;
    }

    @Override // com.squareup.kotlinpoet.Taggable
    @NotNull
    public Map<KClass<?>, Object> getTags() {
        return this.tagMap.getTags();
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public final boolean isAnnotated() {
        return !this.annotations.isEmpty();
    }

    /* renamed from: isNullable, reason: from getter */
    public final boolean getIsNullable() {
        return this.isNullable;
    }

    @Override // com.squareup.kotlinpoet.Taggable
    @Nullable
    public <T> T tag(@NotNull Class<T> type) {
        type.getClass();
        return (T) this.tagMap.tag(type);
    }

    @NotNull
    public String toString() {
        return getCachedString();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J)\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\bH\u0000¢\u0006\u0002\b\nJ)\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u000eH\u0000¢\u0006\u0002\b\n¨\u0006\u0010"}, d2 = {"Lcom/squareup/kotlinpoet/TypeName$Companion;", "", "()V", MetricsConstants.Method.CACHE_GET, "Lcom/squareup/kotlinpoet/TypeName;", "type", "Ljava/lang/reflect/Type;", BuildConfig.FLAVOR_authType, "", "Lcom/squareup/kotlinpoet/TypeVariableName;", "get$kotlinpoet", "mirror", "Ljavax/lang/model/type/TypeMirror;", "typeVariables", "", "Ljavax/lang/model/element/TypeParameterElement;", "kotlinpoet"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TypeName get$kotlinpoet(@NotNull Type type, @NotNull Map<Type, TypeVariableName> map) {
            type.getClass();
            map.getClass();
            if (!(type instanceof Class)) {
                if (type instanceof ParameterizedType) {
                    return ParameterizedTypeName.Companion.get$kotlinpoet((ParameterizedType) type, map);
                }
                if (type instanceof WildcardType) {
                    return WildcardTypeName.Companion.get$kotlinpoet((WildcardType) type, map);
                }
                if (type instanceof TypeVariable) {
                    return TypeVariableName.Companion.get$kotlinpoet((TypeVariable<?>) type, map);
                }
                if (!(type instanceof GenericArrayType)) {
                    Single$$ExternalSyntheticBUOutline0.m$3(Intrinsics.stringPlus("unexpected type: ", type));
                    return null;
                }
                ParameterizedTypeName.Companion companion = ParameterizedTypeName.Companion;
                ClassName className = TypeNames.ARRAY;
                Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
                genericComponentType.getClass();
                return companion.get(className, get$kotlinpoet(genericComponentType, map));
            }
            if (type == Void.TYPE) {
                return TypeNames.UNIT;
            }
            if (type == Boolean.TYPE) {
                return TypeNames.BOOLEAN;
            }
            if (type == Byte.TYPE) {
                return TypeNames.BYTE;
            }
            if (type == Short.TYPE) {
                return TypeNames.SHORT;
            }
            if (type == Integer.TYPE) {
                return TypeNames.INT;
            }
            if (type == Long.TYPE) {
                return TypeNames.LONG;
            }
            if (type == Character.TYPE) {
                return TypeNames.CHAR;
            }
            if (type == Float.TYPE) {
                return TypeNames.FLOAT;
            }
            if (type == Double.TYPE) {
                return TypeNames.DOUBLE;
            }
            Class cls = (Class) type;
            if (!cls.isArray()) {
                return ClassNames.get((Class<?>) cls);
            }
            ParameterizedTypeName.Companion companion2 = ParameterizedTypeName.Companion;
            ClassName className2 = TypeNames.ARRAY;
            Class<?> componentType = cls.getComponentType();
            componentType.getClass();
            return companion2.get(className2, get$kotlinpoet(componentType, map));
        }

        private Companion() {
        }

        @NotNull
        public final TypeName get$kotlinpoet(@NotNull TypeMirror mirror, @NotNull final Map<TypeParameterElement, TypeVariableName> typeVariables) {
            mirror.getClass();
            typeVariables.getClass();
            Object accept = mirror.accept(new SimpleTypeVisitor7<TypeName, Void>() { // from class: com.squareup.kotlinpoet.TypeName$Companion$get$1

                /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[TypeKind.values().length];
                        iArr[TypeKind.BOOLEAN.ordinal()] = 1;
                        iArr[TypeKind.BYTE.ordinal()] = 2;
                        iArr[TypeKind.SHORT.ordinal()] = 3;
                        iArr[TypeKind.INT.ordinal()] = 4;
                        iArr[TypeKind.LONG.ordinal()] = 5;
                        iArr[TypeKind.CHAR.ordinal()] = 6;
                        iArr[TypeKind.FLOAT.ordinal()] = 7;
                        iArr[TypeKind.DOUBLE.ordinal()] = 8;
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                @NotNull
                public TypeName defaultAction(@Nullable TypeMirror e, @Nullable Void p) {
                    e.getClass();
                    throw new IllegalArgumentException(Intrinsics.stringPlus("Unexpected type mirror: ", e));
                }

                @NotNull
                public ParameterizedTypeName visitArray(@NotNull ArrayType t, @Nullable Void p) {
                    t.getClass();
                    ParameterizedTypeName.Companion companion = ParameterizedTypeName.Companion;
                    ClassName className = TypeNames.ARRAY;
                    TypeName.Companion companion2 = TypeName.INSTANCE;
                    TypeMirror componentType = t.getComponentType();
                    componentType.getClass();
                    return companion.get(className, companion2.get$kotlinpoet(componentType, typeVariables));
                }

                @NotNull
                public TypeName visitDeclared(@NotNull DeclaredType t, @Nullable Void p) {
                    t.getClass();
                    TypeElement asElement = t.asElement();
                    if (asElement == null) {
                        Single$$ExternalSyntheticBUOutline0.m$1("null cannot be cast to non-null type javax.lang.model.element.TypeElement");
                        return null;
                    }
                    ClassName className = ClassNames.get(asElement);
                    TypeMirror enclosingType = t.getEnclosingType();
                    TypeName typeName = null;
                    if (enclosingType.getKind() != TypeKind.NONE && !t.asElement().getModifiers().contains(Modifier.STATIC)) {
                        typeName = (TypeName) enclosingType.accept((TypeVisitor) this, (Object) null);
                    }
                    if (t.getTypeArguments().isEmpty() && !(typeName instanceof ParameterizedTypeName)) {
                        return className;
                    }
                    TypeName typeName2 = typeName;
                    ArrayList arrayList = new ArrayList();
                    for (TypeMirror typeMirror : t.getTypeArguments()) {
                        TypeName.Companion companion = TypeName.INSTANCE;
                        typeMirror.getClass();
                        arrayList.add(companion.get$kotlinpoet(typeMirror, typeVariables));
                    }
                    if (typeName2 instanceof ParameterizedTypeName) {
                        return ((ParameterizedTypeName) typeName2).nestedClass(className.getSimpleName(), arrayList);
                    }
                    return new ParameterizedTypeName(null, className, arrayList, false, null, null, 56, null);
                }

                @NotNull
                public TypeName visitError(@NotNull ErrorType t, @Nullable Void p) {
                    t.getClass();
                    return visitDeclared((DeclaredType) t, p);
                }

                @NotNull
                public TypeName visitNoType(@NotNull NoType t, @Nullable Void p) {
                    t.getClass();
                    if (t.getKind() == TypeKind.VOID) {
                        return TypeNames.UNIT;
                    }
                    Object visitUnknown = super.visitUnknown((TypeMirror) t, p);
                    visitUnknown.getClass();
                    return (TypeName) visitUnknown;
                }

                @NotNull
                public TypeName visitPrimitive(@NotNull PrimitiveType t, @Nullable Void p) {
                    t.getClass();
                    TypeKind kind = t.getKind();
                    switch (kind == null ? -1 : WhenMappings.$EnumSwitchMapping$0[kind.ordinal()]) {
                        case 1:
                            return TypeNames.BOOLEAN;
                        case 2:
                            return TypeNames.BYTE;
                        case 3:
                            return TypeNames.SHORT;
                        case 4:
                            return TypeNames.INT;
                        case 5:
                            return TypeNames.LONG;
                        case 6:
                            return TypeNames.CHAR;
                        case 7:
                            return TypeNames.FLOAT;
                        case 8:
                            return TypeNames.DOUBLE;
                        default:
                            Buffer$$ExternalSyntheticBUOutline0.m$2();
                            return null;
                    }
                }

                @NotNull
                public TypeName visitTypeVariable(@NotNull javax.lang.model.type.TypeVariable t, @Nullable Void p) {
                    t.getClass();
                    return TypeVariableName.Companion.get$kotlinpoet(t, MapsKt.toMutableMap(typeVariables));
                }

                @NotNull
                public TypeName visitWildcard(@NotNull javax.lang.model.type.WildcardType t, @Nullable Void p) {
                    t.getClass();
                    return WildcardTypeName.Companion.get$kotlinpoet(t, typeVariables);
                }
            }, (Object) null);
            accept.getClass();
            return (TypeName) accept;
        }
    }

    @Override // com.squareup.kotlinpoet.Taggable
    @Nullable
    public <T> T tag(@NotNull KClass<T> type) {
        type.getClass();
        return (T) this.tagMap.tag(type);
    }

    public /* synthetic */ TypeName(boolean z, List list, TagMap tagMap, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, list, tagMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TypeName copy$default(TypeName typeName, boolean z, List list, int i, Object obj) {
        if (obj != null) {
            Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: copy");
            return null;
        }
        if ((i & 1) != 0) {
            z = typeName.isNullable;
        }
        if ((i & 2) != 0) {
            list = CollectionsKt.toList(typeName.annotations);
        }
        return typeName.copy(z, list);
    }
}
