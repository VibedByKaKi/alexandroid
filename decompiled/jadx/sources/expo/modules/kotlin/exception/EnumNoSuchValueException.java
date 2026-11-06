package expo.modules.kotlin.exception;

import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.reflect.KClass;
import kotlin.time.InstantKt$$ExternalSyntheticLambda1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0010\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lexpo/modules/kotlin/exception/EnumNoSuchValueException;", "Lexpo/modules/kotlin/exception/CodedException;", "enumType", "Lkotlin/reflect/KClass;", "", "enumConstants", "", "value", "", "<init>", "(Lkotlin/reflect/KClass;[Ljava/lang/Enum;Ljava/lang/Object;)V", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class EnumNoSuchValueException extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnumNoSuchValueException(@NotNull KClass<Enum<?>> kClass, @NotNull Enum<?>[] enumArr, @Nullable Object obj) {
        super("'" + obj + "' is not present in " + kClass.getSimpleName() + " enum, it must be one of: " + ArraysKt.joinToString$default(enumArr, ", ", null, null, new InstantKt$$ExternalSyntheticLambda1(12), 30), null, 2, null);
        kClass.getClass();
        enumArr.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence _init_$lambda$0(Enum r1) {
        r1.getClass();
        return a$$ExternalSyntheticOutline0.m("'", r1.name(), "'");
    }
}
