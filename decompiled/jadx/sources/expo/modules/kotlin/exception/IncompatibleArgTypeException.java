package expo.modules.kotlin.exception;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B+\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lexpo/modules/kotlin/exception/IncompatibleArgTypeException;", "Lexpo/modules/kotlin/exception/CodedException;", "argumentType", "Lkotlin/reflect/KClass;", "desiredType", "cause", "", "<init>", "(Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;Ljava/lang/Throwable;)V", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class IncompatibleArgTypeException extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IncompatibleArgTypeException(@NotNull KClass<?> kClass, @NotNull KClass<?> kClass2, @Nullable Throwable th) {
        super("Argument type '" + kClass + "' is not compatible with expected type '" + kClass2 + "'.", th);
        kClass.getClass();
        kClass2.getClass();
    }

    public /* synthetic */ IncompatibleArgTypeException(KClass kClass, KClass kClass2, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(kClass, kClass2, (i & 4) != 0 ? null : th);
    }
}
