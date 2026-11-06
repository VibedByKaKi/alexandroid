package dagger.spi.shaded.androidx.room.compiler.processing;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u0082\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0000\u001a\u0004\u0010\u0000(\u0000ò\u0001\u0004\n\u00020\u0003¨\u0006\u0004"}, d2 = {"isSuspendFunction", "", "Ldagger/spi/shaded/androidx/room/compiler/processing/XMethodType;", "Ldagger/spi/shaded/androidx/room/compiler/processing/XSuspendMethodType;", "room-compiler-processing"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class XMethodTypeKt {
    public static final boolean isSuspendFunction(@NotNull XMethodType xMethodType) {
        xMethodType.getClass();
        return xMethodType instanceof XSuspendMethodType;
    }
}
