package expo.modules.kotlin.exception;

import com.amazon.alexa.handsfree.metrics.caching.JsonFields;
import com.facebook.react.bridge.ReadableType;
import kotlin.Metadata;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B)\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nB)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u000b\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\fB-\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\r\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\u000e¨\u0006\u000f"}, d2 = {"Lexpo/modules/kotlin/exception/CollectionElementCastException;", "Lexpo/modules/kotlin/exception/DecoratedException;", "collectionType", "Lkotlin/reflect/KType;", JsonFields.ELEMENT_TYPE, "providedType", "", "cause", "Lexpo/modules/kotlin/exception/CodedException;", "<init>", "(Lkotlin/reflect/KType;Lkotlin/reflect/KType;Ljava/lang/String;Lexpo/modules/kotlin/exception/CodedException;)V", "Lcom/facebook/react/bridge/ReadableType;", "(Lkotlin/reflect/KType;Lkotlin/reflect/KType;Lcom/facebook/react/bridge/ReadableType;Lexpo/modules/kotlin/exception/CodedException;)V", "Lkotlin/reflect/KClass;", "(Lkotlin/reflect/KType;Lkotlin/reflect/KType;Lkotlin/reflect/KClass;Lexpo/modules/kotlin/exception/CodedException;)V", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CollectionElementCastException extends DecoratedException {
    private CollectionElementCastException(KType kType, KType kType2, String str, CodedException codedException) {
        super("Cannot cast '" + str + "' to '" + kType2 + "' required by the collection of type: '" + kType + "'.", codedException);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CollectionElementCastException(@NotNull KType kType, @NotNull KType kType2, @NotNull ReadableType readableType, @NotNull CodedException codedException) {
        this(kType, kType2, readableType.name(), codedException);
        kType.getClass();
        kType2.getClass();
        readableType.getClass();
        codedException.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CollectionElementCastException(@NotNull KType kType, @NotNull KType kType2, @NotNull KClass<?> kClass, @NotNull CodedException codedException) {
        this(kType, kType2, kClass.toString(), codedException);
        kType.getClass();
        kType2.getClass();
        kClass.getClass();
        codedException.getClass();
    }
}
