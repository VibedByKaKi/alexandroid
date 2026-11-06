package dagger.spi.shaded.androidx.room.compiler.processing.javac;

import dagger.spi.shaded.androidx.room.compiler.processing.XNullability;
import dagger.spi.shaded.androidx.room.compiler.processing.javac.kotlin.KmType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"nullability", "Ldagger/spi/shaded/androidx/room/compiler/processing/XNullability;", "Ldagger/spi/shaded/androidx/room/compiler/processing/javac/kotlin/KmType;", "getNullability", "(Landroidx/room/compiler/processing/javac/kotlin/KmType;)Landroidx/room/compiler/processing/XNullability;", "room-compiler-processing"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class KmTypeExtKt {
    @NotNull
    public static final XNullability getNullability(@NotNull KmType kmType) {
        XNullability nullability;
        kmType.getClass();
        if (kmType.isNullable()) {
            return XNullability.NULLABLE;
        }
        KmType extendsBound = kmType.getExtendsBound();
        return (extendsBound == null || (nullability = getNullability(extendsBound)) == null) ? XNullability.NONNULL : nullability;
    }
}
