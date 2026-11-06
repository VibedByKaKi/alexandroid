package expo.modules.kotlin.types;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KType;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0000¨\u0006\u0006"}, d2 = {"isPrimitiveArray", "", "type", "Lkotlin/reflect/KType;", "clazz", "Ljava/lang/Class;", "expo-modules-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ArrayTypeConverterKt {
    public static final boolean isPrimitiveArray(@NotNull KType kType, @NotNull Class<?> cls) {
        kType.getClass();
        cls.getClass();
        if (Intrinsics.areEqual(cls, boolean[].class) || Intrinsics.areEqual(cls, byte[].class) || Intrinsics.areEqual(cls, char[].class) || Intrinsics.areEqual(cls, short[].class) || Intrinsics.areEqual(cls, int[].class) || Intrinsics.areEqual(cls, long[].class) || Intrinsics.areEqual(cls, float[].class) || Intrinsics.areEqual(cls, double[].class)) {
            return kType.getArguments().isEmpty();
        }
        return false;
    }
}
