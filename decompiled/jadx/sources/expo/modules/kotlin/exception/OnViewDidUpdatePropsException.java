package expo.modules.kotlin.exception;

import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lexpo/modules/kotlin/exception/OnViewDidUpdatePropsException;", "Lexpo/modules/kotlin/exception/DecoratedException;", "viewType", "Lkotlin/reflect/KClass;", "cause", "Lexpo/modules/kotlin/exception/CodedException;", "<init>", "(Lkotlin/reflect/KClass;Lexpo/modules/kotlin/exception/CodedException;)V", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class OnViewDidUpdatePropsException extends DecoratedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnViewDidUpdatePropsException(@NotNull KClass<?> kClass, @NotNull CodedException codedException) {
        super(a$$ExternalSyntheticOutline0.m("Error occurred when invoking 'onViewDidUpdateProps' on '", kClass.getSimpleName(), "'"), codedException);
        kClass.getClass();
        codedException.getClass();
    }
}
