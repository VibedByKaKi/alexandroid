package com.fasterxml.jackson.module.kotlin;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.JsonMappingException;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.util.BitSet;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty1;
import kotlin.reflect.KType;
import kotlin.reflect.full.KClasses;
import kotlin.reflect.jvm.KTypesJvm;
import kotlin.reflect.jvm.ReflectJvmMapping;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0001*\u00020\bH\u0000\u001a\f\u0010\t\u001a\u00020\n*\u00020\u000bH\u0000\u001a\u0010\u0010\f\u001a\u00020\n*\u0006\u0012\u0002\b\u00030\u0001H\u0000\u001a\f\u0010\r\u001a\u00020\u000e*\u00020\u000fH\u0000\u001a&\u0010\u0010\u001a\n \u0012*\u0004\u0018\u00010\u00110\u0011*\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0014\u001a\u00020\u000fH\u0000\u001a&\u0010\u0010\u001a\n \u0012*\u0004\u0018\u00010\u00110\u0011*\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0015\u001a\u00020\u0016H\u0000\u001a\u0010\u0010\u0017\u001a\u00020\n*\u0006\u0012\u0002\b\u00030\u0018H\u0000\"\u001f\u0010\u0000\u001a\u0006\u0012\u0002\b\u00030\u00018@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0019"}, d2 = {"defaultConstructorMarker", "Ljava/lang/Class;", "getDefaultConstructorMarker", "()Ljava/lang/Class;", "defaultConstructorMarker$delegate", "Lkotlin/Lazy;", "erasedType", "", "Lkotlin/reflect/KType;", "hasCreatorAnnotation", "", "Ljava/lang/reflect/AnnotatedElement;", "isUnboxableValueClass", "toBitSet", "Ljava/util/BitSet;", "", "wrapWithPath", "Lcom/fasterxml/jackson/databind/JsonMappingException;", "kotlin.jvm.PlatformType", "refFrom", "index", "refFieldName", "", "wrapsNullable", "Lkotlin/reflect/KClass;", "jackson-module-kotlin"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nInternalCommons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InternalCommons.kt\ncom/fasterxml/jackson/module/kotlin/InternalCommonsKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,49:1\n12474#2,2:50\n1#3:52\n223#4,2:53\n*S KotlinDebug\n*F\n+ 1 InternalCommons.kt\ncom/fasterxml/jackson/module/kotlin/InternalCommonsKt\n*L\n38#1:50,2\n48#1:53,2\n*E\n"})
/* loaded from: classes7.dex */
public final class InternalCommonsKt {

    @NotNull
    private static final Lazy defaultConstructorMarker$delegate = LazyKt.lazy(new Function0<Class<?>>() { // from class: com.fasterxml.jackson.module.kotlin.InternalCommonsKt$defaultConstructorMarker$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Class<?> invoke() {
            return DefaultConstructorMarker.class;
        }
    });

    @NotNull
    public static final Class<? extends Object> erasedType(@NotNull KType kType) {
        kType.getClass();
        return JvmClassMappingKt.getJavaClass((KClass) KTypesJvm.getJvmErasure(kType));
    }

    @NotNull
    public static final Class<?> getDefaultConstructorMarker() {
        Object value = defaultConstructorMarker$delegate.getValue();
        value.getClass();
        return (Class) value;
    }

    public static final boolean hasCreatorAnnotation(@NotNull AnnotatedElement annotatedElement) {
        annotatedElement.getClass();
        JsonCreator jsonCreator = (JsonCreator) annotatedElement.getAnnotation(JsonCreator.class);
        return (jsonCreator == null || jsonCreator.mode() == JsonCreator.Mode.DISABLED) ? false : true;
    }

    public static final boolean isUnboxableValueClass(@NotNull Class<?> cls) {
        cls.getClass();
        Annotation[] annotations = cls.getAnnotations();
        annotations.getClass();
        int length = annotations.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (!(annotations[i] instanceof JvmInline)) {
                i++;
            } else if (KotlinModuleKt.isKotlinClass(cls)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static final BitSet toBitSet(int i) {
        BitSet bitSet = new BitSet(32);
        int i2 = 0;
        while (i != 0) {
            if (i % 2 != 0) {
                bitSet.set(i2);
            }
            i2++;
            i >>= 1;
        }
        return bitSet;
    }

    public static final JsonMappingException wrapWithPath(@NotNull JsonMappingException jsonMappingException, @Nullable Object obj, @NotNull String str) {
        jsonMappingException.getClass();
        str.getClass();
        return JsonMappingException.wrapWithPath(jsonMappingException, obj, str);
    }

    public static final boolean wrapsNullable(@NotNull KClass<?> kClass) {
        kClass.getClass();
        for (KProperty1 kProperty1 : KClasses.getMemberProperties(kClass)) {
            if (ReflectJvmMapping.getJavaField(kProperty1) != null) {
                return kProperty1.getReturnType().isMarkedNullable();
            }
        }
        PathKt$$ExternalSyntheticBUOutline0.m("Collection contains no element matching the predicate.");
        return false;
    }

    public static final JsonMappingException wrapWithPath(@NotNull JsonMappingException jsonMappingException, @Nullable Object obj, int i) {
        jsonMappingException.getClass();
        return JsonMappingException.wrapWithPath(jsonMappingException, obj, i);
    }
}
