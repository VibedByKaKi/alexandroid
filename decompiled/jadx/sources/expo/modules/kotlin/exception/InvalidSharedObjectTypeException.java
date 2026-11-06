package expo.modules.kotlin.exception;

import kotlin.Metadata;
import kotlin.reflect.KType;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lexpo/modules/kotlin/exception/InvalidSharedObjectTypeException;", "Lexpo/modules/kotlin/exception/CodedException;", "sharedType", "Lkotlin/reflect/KType;", "<init>", "(Lkotlin/reflect/KType;)V", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class InvalidSharedObjectTypeException extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidSharedObjectTypeException(@NotNull KType kType) {
        super("Cannot convert provided JavaScriptObject to the '" + kType + "', because the native type doesn't match", null, 2, null);
        kType.getClass();
    }
}
